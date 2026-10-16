package defpackage;

import android.content.Context;
import android.location.LocationManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ v(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var;
        ab abVar;
        switch (this.a) {
            case 0:
                a0 a0Var2 = null;
                try {
                    try {
                        b0.k();
                        a0Var = new a0(b0.j(this.b));
                    } catch (Throwable unused) {
                    }
                    try {
                        if (b0.j <= 0 || b0.i == null) {
                            a0Var.autoConnect(this.b, 8000L);
                        } else {
                            a0Var.setHostAddress(b0.i);
                            try {
                                a0Var.connect(b0.i, b0.j);
                            } catch (Throwable th) {
                                if (!b0.a(th)) {
                                    b0.j = 0;
                                    b0.i = null;
                                    u5.d("KIEM GHEP: cong cu khong noi duoc (" + th.getClass().getSimpleName() + ") -> don cache, lan sau do lai bang mDNS");
                                }
                                throw th;
                            }
                        }
                        a0Var.close();
                    } catch (Throwable th2) {
                        th = th2;
                        a0Var2 = a0Var;
                        try {
                            if (b0.a(th)) {
                                u5.d("KIEM GHEP: MAT CAP GHEP (" + th.getClass().getSimpleName() + ") -> xoa co ghep noi");
                                b0.q(this.b);
                            }
                            if (a0Var2 != null) {
                                a0Var2.close();
                            }
                            b0.g = false;
                            return;
                        } catch (Throwable th3) {
                            if (a0Var2 != null) {
                                try {
                                    a0Var2.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            b0.g = false;
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                b0.g = false;
                return;
            case 1:
                try {
                    Thread.sleep(6000L);
                } catch (Throwable unused3) {
                }
                new Thread(new y(this.b.getApplicationContext(), "vao o (bo chieu co san)", "chieu_duoc"), "cs-nop-chieu").start();
                return;
            case 2:
                b0.b(this.b);
                return;
            default:
                if (cb.i == null) {
                    cb.c = null;
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - cb.b;
                if (cb.b > 0 && jCurrentTimeMillis > 20000) {
                    LocationManager locationManager = cb.h;
                    if (locationManager != null && (abVar = cb.i) != null) {
                        try {
                            locationManager.removeUpdates(abVar);
                        } catch (Throwable unused4) {
                        }
                    }
                    cb.i = null;
                    cb.c(this.b);
                }
                cb.c.postDelayed(this, 10000L);
                return;
        }
    }
}
