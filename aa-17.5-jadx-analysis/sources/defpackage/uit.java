package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class uit implements uko {
    private pka a;
    private toz b;
    private final abgl c;
    private final ukp d;

    public uit(pka pkaVar, abgl abglVar, ukp ukpVar, toz tozVar) {
        this.a = pkaVar;
        this.b = tozVar;
        this.c = abglVar;
        this.d = ukpVar;
    }

    @Override // defpackage.uko
    public final int a() {
        return 0;
    }

    @Override // defpackage.uko
    public final synchronized pka b() {
        return this.a;
    }

    @Override // defpackage.uko
    public final synchronized toz c() {
        return this.b;
    }

    @Override // defpackage.uko
    public final abgl d() {
        return this.c;
    }

    @Override // defpackage.uko
    public final synchronized void e(pka pkaVar) {
        this.a = pkaVar;
    }

    public final synchronized boolean equals(Object obj) {
        pka pkaVar;
        toz tozVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uit)) {
            return false;
        }
        uit uitVar = (uit) obj;
        synchronized (uitVar) {
            pkaVar = uitVar.a;
            tozVar = uitVar.b;
        }
        return Objects.equals(this.a, pkaVar) && Objects.equals(this.b, tozVar) && Objects.equals(this.c, uitVar.c) && Objects.equals(this.d, uitVar.d);
    }

    @Override // defpackage.uko
    public final synchronized void f(toz tozVar) {
        this.b = tozVar;
    }

    public final synchronized int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
