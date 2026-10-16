package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: classes.dex */
final class vbc extends adjb {
    public final Object a = new Object();
    public final vvu b;
    public boolean c;
    public int d;
    public int e;

    public vbc(vvu vvuVar) {
        this.b = vvuVar;
    }

    @Override // defpackage.adjb
    public final void c() {
        synchronized (this.a) {
            if (!this.c) {
                vvu vvuVar = this.b;
                vvuVar.b = SystemClock.elapsedRealtime() - vvuVar.a;
            }
        }
    }

    @Override // defpackage.adqq
    public final void d(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.adqq
    public final void e(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.adjb
    public final void f(adis adisVar) {
        synchronized (this.a) {
            vvu vvuVar = this.b;
            SocketAddress socketAddress = (SocketAddress) adisVar.a(adkd.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof adrf) {
                    vvuVar.t = 2;
                } else if (socketAddress instanceof adod) {
                    vvuVar.t = 3;
                }
            }
        }
    }
}
