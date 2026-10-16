package defpackage;

import com.carstream.tech.launcher.CarBarArt;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l7 {
    public static volatile int n = 100;
    public volatile e0 a;
    public ServerSocket b;
    public volatile Socket c;
    public volatile OutputStream d;
    public volatile Thread h;
    public volatile boolean e = true;
    public volatile boolean f = false;
    public final LinkedBlockingQueue g = new LinkedBlockingQueue(512);
    public volatile boolean i = false;
    public volatile boolean j = false;
    public volatile boolean k = false;
    public final ArrayList l = new ArrayList();
    public final ExecutorService m = Executors.newSingleThreadExecutor(new j7());

    public l7(e0 e0Var) {
        this.a = e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(byte[] r7) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r1 + 4
            int r3 = r7.length
            if (r2 >= r3) goto L4f
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 >= r3) goto L4f
            r3 = r7[r1]
            r4 = 5
            r5 = 1
            if (r3 != 0) goto L29
            int r6 = r1 + 1
            r6 = r7[r6]
            if (r6 != 0) goto L29
            int r6 = r1 + 2
            r6 = r7[r6]
            if (r6 != r5) goto L29
            int r2 = r1 + 3
            r2 = r7[r2]
            r2 = r2 & 31
            if (r2 != r4) goto L26
            goto L48
        L26:
            if (r2 != r5) goto L4c
            goto L4f
        L29:
            if (r3 != 0) goto L4c
            int r3 = r1 + 1
            r3 = r7[r3]
            if (r3 != 0) goto L4c
            int r3 = r1 + 2
            r3 = r7[r3]
            if (r3 != 0) goto L4c
            int r3 = r1 + 3
            r3 = r7[r3]
            if (r3 != r5) goto L4c
            int r3 = r1 + 5
            int r6 = r7.length
            if (r3 >= r6) goto L4c
            r2 = r7[r2]
            r2 = r2 & 31
            if (r2 != r4) goto L49
        L48:
            return r5
        L49:
            if (r2 != r5) goto L4c
            goto L4f
        L4c:
            int r1 = r1 + 1
            goto L2
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7.g(byte[]):boolean");
    }

    public static void h(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void a(byte[] bArr) {
        OutputStream outputStream = this.d;
        if (outputStream == null || bArr == null || bArr.length == 0) {
            return;
        }
        try {
            byte[] bArr2 = new byte[13];
            bArr2[0] = 78;
            h(bArr2, 1, bArr.length);
            synchronized (this) {
                outputStream.write(bArr2);
                outputStream.write(bArr);
                outputStream.flush();
            }
        } catch (Exception e) {
            e0 e0Var = this.a;
            String strConcat = "[MIRROR] gui banner loi: ".concat(String.valueOf(e));
            e0Var.getClass();
            e0.d(strConcat);
        }
    }

    public final void b() throws IOException {
        this.e = false;
        this.f = true;
        this.m.shutdown();
        this.d = null;
        u5.d("SOCKET: DUT ket noi voi bo chieu");
        Thread thread = this.h;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
        try {
            if (this.c != null) {
                this.c.close();
            }
        } catch (Exception unused2) {
        }
        try {
            ServerSocket serverSocket = this.b;
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (Exception unused3) {
        }
    }

    public final void c(final char c) {
        final OutputStream outputStream = this.d;
        if (outputStream == null) {
            this.a.getClass();
            e0.d("[MIRROR] lenh " + c + ": chua co socket");
            return;
        }
        try {
            this.m.execute(new Runnable() { // from class: i7
                @Override // java.lang.Runnable
                public final void run() {
                    l7 l7Var = this.a;
                    char c2 = c;
                    OutputStream outputStream2 = outputStream;
                    try {
                        byte[] bArr = new byte[13];
                        bArr[0] = (byte) c2;
                        synchronized (l7Var) {
                            outputStream2.write(bArr);
                            outputStream2.flush();
                        }
                        l7Var.a.getClass();
                        e0.d("[MIRROR] da gui lenh '" + c2 + "'");
                    } catch (Exception e) {
                        e0 e0Var = l7Var.a;
                        String str = "[MIRROR] lenh " + c2 + " loi: " + String.valueOf(e);
                        e0Var.getClass();
                        e0.d(str);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            this.a.getClass();
            e0.d("[MIRROR] lenh " + c + " BI BO: kenh da dong");
            u5.d("SOCKET: lenh '" + c + "' BI BO — kenh da dong");
        }
    }

    public final boolean d() {
        return this.d != null;
    }

    public final void e(final int i, final int i2, final int i3) {
        final OutputStream outputStream = this.d;
        if (outputStream != null) {
            new Thread(new Runnable() { // from class: k7
                @Override // java.lang.Runnable
                public final void run() {
                    l7 l7Var = this.a;
                    int i4 = i;
                    int i5 = i2;
                    int i6 = i3;
                    OutputStream outputStream2 = outputStream;
                    try {
                        byte[] bArr = new byte[13];
                        bArr[0] = 122;
                        l7.h(bArr, 1, i4);
                        l7.h(bArr, 5, i5);
                        l7.h(bArr, 9, i6);
                        synchronized (l7Var) {
                            outputStream2.write(bArr);
                            outputStream2.flush();
                        }
                        l7Var.a.getClass();
                        e0.d("[MIRROR] da bao co man xe " + i4 + "x" + i5 + "@" + i6);
                    } catch (Exception e) {
                        e0 e0Var = l7Var.a;
                        String strConcat = "[MIRROR] bao co man xe loi: ".concat(String.valueOf(e));
                        e0Var.getClass();
                        e0.d(strConcat);
                    }
                }
            }, "mirror-co-man").start();
            return;
        }
        this.a.getClass();
        e0.d("[MIRROR] BO co man xe " + i + "x" + i2 + "@" + i3 + ": chua co socket");
    }

    public final void f() {
        synchronized (this.l) {
            try {
                if (this.l.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.l);
                this.l.clear();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    c(((Character) obj).charValue());
                }
                e0 e0Var = this.a;
                String str = "[MIRROR] da chay " + arrayList.size() + " lenh cho san";
                e0Var.getClass();
                e0.d(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        int i = 0;
        while (i <= 1) {
            try {
                byte[] bArrPng = CarBarArt.png(i == 1);
                byte[] bArr = new byte[13];
                bArr[0] = 66;
                h(bArr, 1, i);
                h(bArr, 5, bArrPng.length);
                OutputStream outputStream = this.d;
                if (outputStream == null) {
                    return;
                }
                synchronized (this) {
                    outputStream.write(bArr);
                    outputStream.write(bArrPng);
                    outputStream.flush();
                }
                i++;
            } catch (Throwable th) {
                e0 e0Var = this.a;
                String strConcat = "[MIRROR] gui hinh thanh loi: ".concat(String.valueOf(th));
                e0Var.getClass();
                e0.d(strConcat);
                return;
            }
        }
        this.a.getClass();
        e0.d("[MIRROR] da gui hinh thanh dieu huong cho helper");
    }

    public final boolean j(int i, int i2, int i3) {
        if (this.d != null) {
            byte[] bArr = new byte[13];
            bArr[0] = 116;
            h(bArr, 1, i);
            h(bArr, 5, i2);
            h(bArr, 9, i3);
            synchronized (this) {
                if (this.h == null) {
                    this.h = new Thread(new j1(this, 1), "mirror-touch");
                    this.h.setDaemon(true);
                    this.h.start();
                }
            }
            if (!this.g.offer(bArr)) {
                if ((i3 & 255) != 2) {
                    this.g.poll();
                    this.g.offer(bArr);
                } else if (!this.i) {
                    this.i = true;
                    this.a.getClass();
                    e0.d("[MIRROR] hang cham day - bo bot MOVE");
                }
            }
            return true;
        }
        if (!this.j) {
            this.j = true;
            this.a.getClass();
            e0.d("[MIRROR] CHAM BI BO: chua co socket (out=null)");
            return false;
        }
        return false;
    }
}
