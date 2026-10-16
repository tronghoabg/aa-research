package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class upl implements pwq {
    final upy a;
    volatile achw b;
    final /* synthetic */ upm c;

    public upl(upm upmVar, upy upyVar) {
        this.c = upmVar;
        this.a = upyVar;
    }

    @Override // defpackage.pwq
    public final void a(rjg rjgVar, pwu pwuVar) {
        boolean zEquals = Objects.equals(pwuVar, pwu.b);
        upy upyVar = this.a;
        if (zEquals) {
            upyVar.k(2);
        } else {
            upyVar.k(1);
        }
        upy upyVar2 = this.a;
        upyVar2.g(false);
        upyVar2.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pwq
    public final /* bridge */ /* synthetic */ void b(rjg rjgVar, Object obj) {
        achx achxVar = (achx) obj;
        if (achxVar.b.size() == 0) {
            upy upyVar = this.a;
            upyVar.k(1);
            upyVar.g(false);
            upyVar.f();
            return;
        }
        this.b = (achw) achxVar.b.get(0);
        upy upyVar2 = this.a;
        synchronized (upyVar2) {
            if (this.b != null) {
                boolean zN = upyVar2.n(this.b);
                upm upmVar = this.c;
                if (upmVar.m != null && zN && upyVar2.b) {
                    upmVar.g.execute(new upk(this, 0));
                }
            }
            upyVar2.g(false);
            upyVar2.f();
        }
    }
}
