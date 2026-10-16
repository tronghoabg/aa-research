package defpackage;

/* loaded from: classes.dex */
public final class rau {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public rau(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = i2;
        this.g = z5;
        this.h = z6;
    }

    public static rat a() {
        rat ratVar = new rat();
        ratVar.h(false);
        ratVar.g(false);
        ratVar.i(false);
        ratVar.c(false);
        ratVar.f(10);
        ratVar.d(20);
        ratVar.b(false);
        ratVar.e(false);
        return ratVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rau) {
            rau rauVar = (rau) obj;
            if (this.a == rauVar.a && this.b == rauVar.b && this.c == rauVar.c && this.d == rauVar.d && this.e == rauVar.e && this.f == rauVar.f && this.g == rauVar.g && this.h == rauVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        return "Options{useConfigurationContext=" + this.a + ", persistProjectionConfigurationContext=" + this.b + ", useInternalContext=" + this.c + ", crashIfUnableToConfigure=" + this.d + ", delayBetweenConfigChecks=" + this.e + ", maxConfigChecks=" + this.f + ", coolwalkEnabled=" + this.g + ", localFocusModeEnabled=" + this.h + "}";
    }

    public rau() {
        throw null;
    }
}
