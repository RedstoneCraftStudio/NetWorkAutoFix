package cn.lingyuncraft;

import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        System.out.print("程序正在启动中......\n作者：shaokeyibb贺兰星辰\n");
        String host = "114.114.114.114";
        int timeOut = 3000;
        while (true) {
            boolean status = InetAddress.getByName(host).isReachable(timeOut);
            System.out.print("检测完成，获取到结果为：" + status +"\n");
            if (status) {
                System.out.print("网络正常\n");
                Thread.currentThread().sleep(5000);
            }else{
                System.out.print("网络异常，接下来运行难疑解答！\n");
                    Process p = java.lang.Runtime.getRuntime().exec("C:\\Windows\\System32\\msdt.exe -skip TRUE -path C:\\Windows\\diagnostics\\system\\networking -ep NetworkDiagnosticsPNI");
                    System.out.print("已开始自动修复，程序将会自动退出");
                    break;
            }
        }
    }
}