package defpackage;

import j$.time.Instant;

/* loaded from: classes3.dex */
public final class uab implements qaw {
    private final erb a;

    public uab(erb erbVar) {
        this.a = erbVar;
    }

    @Override // defpackage.qaw
    public final void a() {
        int iA;
        zxh zxhVar = (zxh) this.a.a;
        tng tngVar = (tng) zxhVar.c.gu();
        if (tngVar == null) {
            return;
        }
        if (zkt.r() && (iA = (int) adeq.a.gu().a()) > 1) {
            int i = zxhVar.n + 1;
            zxhVar.n = i;
            if (i < iA) {
                return;
            } else {
                zxhVar.n = 0;
            }
        }
        long epochMilli = Instant.now().toEpochMilli();
        zxhVar.e.execute(new zxg(zxhVar, tngVar, epochMilli - zxhVar.h, epochMilli, 1));
    }

    @Override // defpackage.qaw
    public final void c() {
        zxh zxhVar = (zxh) this.a.a;
        if (zxhVar.c.gu() != null) {
            zxhVar.h = Instant.now().toEpochMilli();
        }
    }
}
