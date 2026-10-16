package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aedm extends aeda {
    final adng a;
    volatile boolean b;
    private boolean c;
    private boolean d = false;
    private boolean e = false;

    public aedm(adng adngVar) {
        this.a = adngVar;
    }

    @Override // defpackage.aedp
    public final void a() {
        this.a.d(adnq.b, new admc());
        this.e = true;
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        admc admcVar;
        admc admcVar2 = new admc();
        List list = adnq.a;
        Throwable cause = th;
        while (true) {
            admcVar = null;
            if (cause == null) {
                break;
            }
            if (cause instanceof adnr) {
                break;
            } else {
                if (cause instanceof adnt) {
                    admcVar = ((adnt) cause).b;
                    break;
                }
                cause = cause.getCause();
            }
        }
        if (admcVar != null) {
            admcVar2.e(admcVar);
        }
        this.a.d(adnq.c(th), admcVar2);
        this.d = true;
    }

    @Override // defpackage.aedp
    public final void c(Object obj) {
        woy.aa(!this.d, "Stream was terminated by error, no further calls are allowed");
        woy.aa(!this.e, "Stream is already completed, no further calls are allowed");
        if (!this.c) {
            this.a.e(new admc());
            this.c = true;
        }
        this.a.b(obj);
    }
}
