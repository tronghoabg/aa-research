package defpackage;

import android.os.PowerManager;
import androidx.car.app.model.Alert;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ f7(l7 l7Var, int i) {
        this.a = i;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        String str;
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                l7Var.getClass();
                try {
                    Thread.sleep(600L);
                } catch (Exception unused) {
                }
                l7Var.b();
                return;
            default:
                l7 l7Var2 = this.b;
                str = "SOCKET: vong accept da thoat (dong kenh binh thuong)";
                boolean z = false;
                try {
                    try {
                        ServerSocket serverSocket = new ServerSocket();
                        l7Var2.b = serverSocket;
                        serverSocket.setReuseAddress(true);
                    } catch (Exception e) {
                        if (l7Var2.e && !l7Var2.f) {
                            e0 e0Var = l7Var2.a;
                            String str2 = "[MIRROR] !! " + String.valueOf(e);
                            e0Var.getClass();
                            e0.d(str2);
                        }
                        if (l7Var2.e && !l7Var2.f) {
                            z = true;
                        }
                        l7Var2.f = true;
                        try {
                            ServerSocket serverSocket2 = l7Var2.b;
                            if (serverSocket2 != null) {
                                serverSocket2.close();
                            }
                        } catch (Exception unused2) {
                        }
                        if (z) {
                        }
                    }
                    try {
                        l7Var2.b.bind(new InetSocketAddress("127.0.0.1", 5299));
                        l7Var2.a.getClass();
                        e0.d("[MIRROR] app lang nghe cong 5299 — cho helper noi...");
                        while (l7Var2.e) {
                            Socket socketAccept = l7Var2.b.accept();
                            u5.d("SOCKET: bo chieu da noi vao 5299");
                            socketAccept.setTcpNoDelay(true);
                            l7Var2.c = socketAccept;
                            l7Var2.d = socketAccept.getOutputStream();
                            InputStream inputStream = socketAccept.getInputStream();
                            l7Var2.a.getClass();
                            e0.d("[MIRROR] ★ helper da noi — nhan video");
                            PowerManager.WakeLock wakeLock = sb.a;
                            b3.a();
                            l7Var2.i();
                            if (k1.c) {
                                l7Var2.a.getClass();
                                e0.d("[MIRROR] o Ung dung dang hien -> bao bo chieu thuc");
                                l7Var2.c('W');
                            } else {
                                l7Var2.a.getClass();
                                e0.d("[MIRROR] o Ung dung dang an -> bao bo chieu ngu");
                                l7Var2.c('X');
                            }
                            l7Var2.f();
                            try {
                                try {
                                    byte[] bArr = new byte[4];
                                    while (l7Var2.e) {
                                        int i = 0;
                                        while (i < 4) {
                                            int i2 = inputStream.read(bArr, i, 4 - i);
                                            if (i2 < 0) {
                                                throw new EOFException();
                                            }
                                            i += i2;
                                        }
                                        int i3 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                                        boolean z2 = (Integer.MIN_VALUE & i3) != 0;
                                        int i4 = i3 & Alert.DURATION_SHOW_INDEFINITELY;
                                        if (i4 <= 0 || i4 > 4000000) {
                                            throw new IOException("len la: " + i4);
                                        }
                                        byte[] bArr2 = new byte[i4];
                                        int i5 = 0;
                                        while (i5 < i4) {
                                            int i6 = inputStream.read(bArr2, i5, i4 - i5);
                                            if (i6 < 0) {
                                                throw new EOFException();
                                            }
                                            i5 += i6;
                                        }
                                        if (z2) {
                                            l7Var2.a.getClass();
                                        } else {
                                            e0 e0Var2 = l7Var2.a;
                                            boolean zG = l7.g(bArr2);
                                            e0Var2.getClass();
                                            e0.c(bArr2, zG);
                                        }
                                    }
                                } catch (Exception e2) {
                                    e0 e0Var3 = l7Var2.a;
                                    String str3 = "[MIRROR] helper dut (" + String.valueOf(e2) + ") — cho noi lai...";
                                    e0Var3.getClass();
                                    e0.d(str3);
                                }
                                l7Var2.d = null;
                                try {
                                    socketAccept.close();
                                } catch (Exception unused3) {
                                }
                            } catch (Throwable th) {
                                l7Var2.d = null;
                                try {
                                    socketAccept.close();
                                } catch (Exception unused4) {
                                }
                                throw th;
                            }
                        }
                        if (l7Var2.e && !l7Var2.f) {
                            z = true;
                        }
                        l7Var2.f = true;
                        try {
                            ServerSocket serverSocket3 = l7Var2.b;
                            if (serverSocket3 != null) {
                                serverSocket3.close();
                            }
                        } catch (Exception unused5) {
                        }
                        if (z) {
                            str = "SOCKET: !! vong accept CHET bat ngo — kenh 5299 phai dung lai cai moi";
                        }
                        u5.d(str);
                        return;
                    } catch (Exception e3) {
                        e0 e0Var4 = l7Var2.a;
                        String str4 = "[MIRROR] !! KHONG BIND DUOC cong 5299 (" + String.valueOf(e3) + ") - bo chieu se khong noi vao duoc";
                        e0Var4.getClass();
                        e0.d(str4);
                        u5.d("SOCKET: !! KHONG BIND DUOC cong 5299 — ".concat(e3.getClass().getSimpleName()));
                        throw e3;
                    }
                } finally {
                    if (l7Var2.e && !l7Var2.f) {
                        z = true;
                    }
                    l7Var2.f = true;
                    try {
                        ServerSocket serverSocket4 = l7Var2.b;
                        if (serverSocket4 != null) {
                            serverSocket4.close();
                        }
                    } catch (Exception unused6) {
                    }
                    u5.d(z ? "SOCKET: !! vong accept CHET bat ngo — kenh 5299 phai dung lai cai moi" : "SOCKET: vong accept da thoat (dong kenh binh thuong)");
                }
        }
    }
}
