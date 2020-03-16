package io.exercism;

import java.io.*;
//该程序可以去除沙拉查词导入Anki背词软件，文本中多余的符号,比如'[',':',']'，并且不去除文本中的空行
public class Anki
{
	public static void main(String[] args)
	{
		String line=null;
		File file=new File("D:/other/saladict-words-1583623360201.txt");//用命令行参数直接写入待处理文件
		File file1=new File("D:/other/output20.txt");
		//判断输入的是否是TXT文档，不是则提示退出
		if(file.getName().endsWith("txt") && file1.getName().endsWith("txt"))
		{
			//判断输入的文档是否存在，不存在则提示退出
				if(!file.exists())
				{
					System.out.println("文件不存在！");
					System.exit(0);
		
				}
			//输入的是TXT文档则继续往下执行		
		try
		{
			//读出文档数据流方式
			InputStreamReader Stream=new InputStreamReader(new FileInputStream(file),"UTF-8");//读入数据流方式设为‘UTF-8’，避免乱码
			//构造一个字符流的缓存器，存放在控制台输入的字节转换后成的字符
			BufferedReader reader=new BufferedReader(Stream);
			//写入数据流方式
			OutputStreamWriter outStream=new OutputStreamWriter(new FileOutputStream(file1),"UTF-8");
			BufferedWriter writer=new BufferedWriter(outStream);
			//以行读出文档内容至结束
			while((line=reader.readLine())!=null) {
				if(line.isEmpty()) {
					writer.write("\n\n\n");
				}else {
				String newLine="";
			for (int i = 0; i < line.length(); i++){
		        if (line.charAt(i) != ':'&&line.charAt(i) != '['&&line.charAt(i) != ']') {  // or anything other character you chose
		        	newLine += line.charAt(i);
		        }
		    }
		    // print to another file.
		    writer.write(newLine);
		    }  	
		    }
			//关闭数据流
			writer.close();
			reader.close();
			System.out.println("修改完成！");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		}
		else
		{ 
			System.out.println("输入错误！（非.txt）");
			System.exit(0);
		}	
	}	
}
