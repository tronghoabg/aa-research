package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dns {
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final android.os.IBinder j;
    private final float k;
    private final defpackage.cld l;

    public dns(byte[] bArr) {
        this.e = true;
        this.f = true;
        this.d = 1;
        this.g = true;
        this.h = true;
        this.a = "";
        this.i = 2;
        this.j = null;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.k = Float.NaN;
        this.l = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dns)) {
            return false;
        }
        defpackage.dns dnsVar = (defpackage.dns) obj;
        boolean z = dnsVar.e;
        boolean z2 = dnsVar.f;
        int i = dnsVar.d;
        boolean z3 = dnsVar.g;
        boolean z4 = dnsVar.h;
        int i2 = dnsVar.i;
        android.os.IBinder iBinder = dnsVar.j;
        float f = dnsVar.b;
        float f2 = dnsVar.c;
        float f3 = dnsVar.k;
        defpackage.cld cldVar = dnsVar.l;
        return true;
    }

    public final int hashCode() {
        return -1884662721;
    }

    public dns() {
        this(null);
    }
}
