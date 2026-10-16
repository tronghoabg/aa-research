package defpackage;

/* loaded from: classes2.dex */
public final class gcp {
    public static final gcp a;
    public static final gcp b;
    public final boolean c;
    public final int d;
    public final ghv e;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ghv ghvVar = null;
        a = new gcp(false, 0 == true ? 1 : 0, ghvVar, 7);
        b = new gcp(true, 0 == true ? 1 : 0, ghvVar, 6);
    }

    public /* synthetic */ gcp(boolean z, int i, ghv ghvVar, int i2) {
        if ((i2 & 4) != 0) {
            ghvVar = ghv.c;
            ghvVar.getClass();
        }
        int i3 = i2 & 2;
        int i4 = i2 & 1;
        i = i3 != 0 ? 0 : i;
        boolean z2 = 1 == ((z ? 1 : 0) & (i4 ^ 1));
        ghvVar.getClass();
        this.c = z2;
        this.d = i;
        this.e = ghvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcp)) {
            return false;
        }
        gcp gcpVar = (gcp) obj;
        return this.c == gcpVar.c && this.d == gcpVar.d && affa.f(this.e, gcpVar.e);
    }

    public final int hashCode() {
        return (((a.f(this.c) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "CarTextOptions(allowClickableSpans=" + this.c + ", maxImages=" + this.d + ", colorSpanConstraints=" + this.e + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gcp() {
        this(false, 0 == true ? 1 : 0, null, 7);
    }
}
