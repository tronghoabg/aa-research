package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lzc {
    public final java.lang.CharSequence a;
    public final java.lang.CharSequence b;
    public final java.lang.CharSequence c;
    public final java.lang.CharSequence d;
    public final java.lang.CharSequence e;
    public final java.lang.CharSequence f;
    public final defpackage.ygw g;
    public final defpackage.ygw h;
    public final android.graphics.Bitmap i;
    public final android.net.Uri j;
    public final long k;
    public final java.lang.CharSequence l;

    public lzc(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5, java.lang.CharSequence charSequence6, defpackage.ygw ygwVar, defpackage.ygw ygwVar2, android.graphics.Bitmap bitmap, android.net.Uri uri, long j, java.lang.CharSequence charSequence7) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = charSequence5;
        this.f = charSequence6;
        this.g = ygwVar;
        this.h = ygwVar2;
        this.i = bitmap;
        this.j = uri;
        this.k = j;
        this.l = charSequence7;
    }

    public static defpackage.lzb a() {
        defpackage.lzb lzbVar = new defpackage.lzb();
        lzbVar.c(-1L);
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        lzbVar.b(ygwVar);
        lzbVar.d(ygwVar);
        return lzbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.net.Uri uri;
        java.lang.CharSequence charSequence;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lzc) {
            defpackage.lzc lzcVar = (defpackage.lzc) obj;
            java.lang.CharSequence charSequence2 = this.a;
            if (charSequence2 != null ? charSequence2.equals(lzcVar.a) : lzcVar.a == null) {
                java.lang.CharSequence charSequence3 = this.b;
                if (charSequence3 != null ? charSequence3.equals(lzcVar.b) : lzcVar.b == null) {
                    java.lang.CharSequence charSequence4 = this.c;
                    if (charSequence4 != null ? charSequence4.equals(lzcVar.c) : lzcVar.c == null) {
                        java.lang.CharSequence charSequence5 = this.d;
                        if (charSequence5 != null ? charSequence5.equals(lzcVar.d) : lzcVar.d == null) {
                            java.lang.CharSequence charSequence6 = this.e;
                            if (charSequence6 != null ? charSequence6.equals(lzcVar.e) : lzcVar.e == null) {
                                java.lang.CharSequence charSequence7 = this.f;
                                if (charSequence7 != null ? charSequence7.equals(lzcVar.f) : lzcVar.f == null) {
                                    if (defpackage.ysr.W(this.g, lzcVar.g) && defpackage.ysr.W(this.h, lzcVar.h) && ((bitmap = this.i) != null ? bitmap.equals(lzcVar.i) : lzcVar.i == null) && ((uri = this.j) != null ? uri.equals(lzcVar.j) : lzcVar.j == null) && this.k == lzcVar.k && ((charSequence = this.l) != null ? charSequence.equals(lzcVar.l) : lzcVar.l == null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.CharSequence charSequence = this.a;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        java.lang.CharSequence charSequence2 = this.b;
        int iHashCode2 = charSequence2 == null ? 0 : charSequence2.hashCode();
        int i = iHashCode ^ 1000003;
        java.lang.CharSequence charSequence3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003;
        java.lang.CharSequence charSequence4 = this.d;
        int iHashCode4 = (iHashCode3 ^ (charSequence4 == null ? 0 : charSequence4.hashCode())) * 1000003;
        java.lang.CharSequence charSequence5 = this.e;
        int iHashCode5 = (iHashCode4 ^ (charSequence5 == null ? 0 : charSequence5.hashCode())) * 1000003;
        java.lang.CharSequence charSequence6 = this.f;
        int iHashCode6 = (((((iHashCode5 ^ (charSequence6 == null ? 0 : charSequence6.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        android.graphics.Bitmap bitmap = this.i;
        int iHashCode7 = (iHashCode6 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        android.net.Uri uri = this.j;
        int iHashCode8 = uri == null ? 0 : uri.hashCode();
        long j = this.k;
        int i2 = (((iHashCode7 ^ iHashCode8) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        java.lang.CharSequence charSequence7 = this.l;
        return i2 ^ (charSequence7 != null ? charSequence7.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.l;
        android.net.Uri uri = this.j;
        android.graphics.Bitmap bitmap = this.i;
        defpackage.ygw ygwVar = this.h;
        defpackage.ygw ygwVar2 = this.g;
        java.lang.CharSequence charSequence2 = this.f;
        java.lang.CharSequence charSequence3 = this.e;
        java.lang.CharSequence charSequence4 = this.d;
        java.lang.CharSequence charSequence5 = this.c;
        java.lang.CharSequence charSequence6 = this.b;
        return "MetadataModel{title=" + java.lang.String.valueOf(this.a) + ", subtitle=" + java.lang.String.valueOf(charSequence6) + ", tertiaryText=" + java.lang.String.valueOf(charSequence5) + ", elapsedTime=" + java.lang.String.valueOf(charSequence4) + ", totalTime=" + java.lang.String.valueOf(charSequence3) + ", message=" + java.lang.String.valueOf(charSequence2) + ", icons=" + java.lang.String.valueOf(ygwVar2) + ", tertiaryIcons=" + java.lang.String.valueOf(ygwVar) + ", image=" + java.lang.String.valueOf(bitmap) + ", imageUri=" + java.lang.String.valueOf(uri) + ", imageLoadTimeoutMs=" + this.k + ", imageSignature=" + java.lang.String.valueOf(charSequence) + "}";
    }

    public lzc() {
        throw null;
    }
}
