package defpackage;

/* loaded from: classes2.dex */
public final class gcv extends fwi {
    public final fxl a;
    public final boolean b;

    public gcv(fxl fxlVar, boolean z) {
        this.a = fxlVar;
        this.b = z;
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return this.a.e;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.a.a;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return this.a.c;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcv)) {
            return false;
        }
        gcv gcvVar = (gcv) obj;
        return affa.f(this.a, gcvVar.a) && this.b == gcvVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "CallActionButtonUiModel(actionButtonUiModel=" + this.a + ", primary=" + this.b + ")";
    }
}
