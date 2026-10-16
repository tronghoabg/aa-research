package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ctx implements ctp {
    private final ctw a;

    public ctx(ctw ctwVar) {
        this.a = ctwVar;
    }

    @Override // defpackage.ctp
    public final int a(csq csqVar, List list, int i) {
        return this.a.a(csqVar, tv.a(csqVar), i);
    }

    @Override // defpackage.ctp
    public final int b(csq csqVar, List list, int i) {
        return this.a.b(csqVar, tv.a(csqVar), i);
    }

    @Override // defpackage.ctp
    public final int c(csq csqVar, List list, int i) {
        return this.a.c(csqVar, tv.a(csqVar), i);
    }

    @Override // defpackage.ctp
    public final int d(csq csqVar, List list, int i) {
        return this.a.d(csqVar, tv.a(csqVar), i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        return this.a.e(ctsVar, tv.a(ctsVar), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctx) && affa.f(this.a, ((ctx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
