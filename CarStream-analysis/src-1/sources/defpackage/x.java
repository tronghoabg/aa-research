package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class x implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public x(w0 w0Var, int i, int i2) {
        this.d = w0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (int i = this.b; i < this.c; i++) {
                    Socket socket = new Socket();
                    try {
                        socket.connect(new InetSocketAddress("127.0.0.1", i), 150);
                        ((List) this.d).add(Integer.valueOf(i));
                    } catch (Throwable unused) {
                    }
                    try {
                        socket.close();
                    } catch (Throwable unused2) {
                    }
                }
                break;
            default:
                ((q4) ((w0) this.d).c).a(this.b, this.c);
                break;
        }
    }

    public x(int i, int i2, List list) {
        this.b = i;
        this.c = i2;
        this.d = list;
    }
}
