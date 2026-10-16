package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbp {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public rbp(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = i2;
        this.g = z5;
        this.h = z6;
    }

    public static defpackage.rbo a() {
        defpackage.rbo rboVar = new defpackage.rbo();
        rboVar.h(false);
        rboVar.g(false);
        rboVar.i(false);
        rboVar.c(false);
        rboVar.f(10);
        rboVar.d(20);
        rboVar.b(false);
        rboVar.e(false);
        return rboVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rbp) {
            defpackage.rbp rbpVar = (defpackage.rbp) obj;
            if (this.a == rbpVar.a && this.b == rbpVar.b && this.c == rbpVar.c && this.d == rbpVar.d && this.e == rbpVar.e && this.f == rbpVar.f && this.g == rbpVar.g && this.h == rbpVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "Options{useConfigurationContext=" + this.a + ", persistProjectionConfigurationContext=" + this.b + ", useInternalContext=" + this.c + ", crashIfUnableToConfigure=" + this.d + ", delayBetweenConfigChecks=" + this.e + ", maxConfigChecks=" + this.f + ", coolwalkEnabled=" + this.g + ", localFocusModeEnabled=" + this.h + "}";
    }

    public rbp() {
        throw null;
    }
}
