package defpackage;

import j$.time.Instant;

/* loaded from: classes.dex */
public final class khn extends eql {
    public khn(eqj eqjVar) {
        r(eqjVar, new hlg(this, 17));
    }

    public final void a() {
        oit.a();
        m(Long.valueOf(Instant.now().toEpochMilli()));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        a();
    }
}
