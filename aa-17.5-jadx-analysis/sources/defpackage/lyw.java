package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class lyw {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final yfq g;
    public final yfq h;
    public final Bitmap i;
    public final Uri j;
    public final long k;
    public final CharSequence l;

    public lyw(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, yfq yfqVar, yfq yfqVar2, Bitmap bitmap, Uri uri, long j, CharSequence charSequence7) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = charSequence5;
        this.f = charSequence6;
        this.g = yfqVar;
        this.h = yfqVar2;
        this.i = bitmap;
        this.j = uri;
        this.k = j;
        this.l = charSequence7;
    }

    public static lyv a() {
        lyv lyvVar = new lyv();
        lyvVar.c(-1L);
        int i = yfq.d;
        yfq yfqVar = yls.a;
        lyvVar.b(yfqVar);
        lyvVar.d(yfqVar);
        return lyvVar;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Uri uri;
        CharSequence charSequence;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyw) {
            lyw lywVar = (lyw) obj;
            CharSequence charSequence2 = this.a;
            if (charSequence2 != null ? charSequence2.equals(lywVar.a) : lywVar.a == null) {
                CharSequence charSequence3 = this.b;
                if (charSequence3 != null ? charSequence3.equals(lywVar.b) : lywVar.b == null) {
                    CharSequence charSequence4 = this.c;
                    if (charSequence4 != null ? charSequence4.equals(lywVar.c) : lywVar.c == null) {
                        CharSequence charSequence5 = this.d;
                        if (charSequence5 != null ? charSequence5.equals(lywVar.d) : lywVar.d == null) {
                            CharSequence charSequence6 = this.e;
                            if (charSequence6 != null ? charSequence6.equals(lywVar.e) : lywVar.e == null) {
                                CharSequence charSequence7 = this.f;
                                if (charSequence7 != null ? charSequence7.equals(lywVar.f) : lywVar.f == null) {
                                    if (yrm.W(this.g, lywVar.g) && yrm.W(this.h, lywVar.h) && ((bitmap = this.i) != null ? bitmap.equals(lywVar.i) : lywVar.i == null) && ((uri = this.j) != null ? uri.equals(lywVar.j) : lywVar.j == null) && this.k == lywVar.k && ((charSequence = this.l) != null ? charSequence.equals(lywVar.l) : lywVar.l == null)) {
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
        CharSequence charSequence = this.a;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        CharSequence charSequence2 = this.b;
        int iHashCode2 = charSequence2 == null ? 0 : charSequence2.hashCode();
        int i = iHashCode ^ 1000003;
        CharSequence charSequence3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003;
        CharSequence charSequence4 = this.d;
        int iHashCode4 = (iHashCode3 ^ (charSequence4 == null ? 0 : charSequence4.hashCode())) * 1000003;
        CharSequence charSequence5 = this.e;
        int iHashCode5 = (iHashCode4 ^ (charSequence5 == null ? 0 : charSequence5.hashCode())) * 1000003;
        CharSequence charSequence6 = this.f;
        int iHashCode6 = (((((iHashCode5 ^ (charSequence6 == null ? 0 : charSequence6.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        Bitmap bitmap = this.i;
        int iHashCode7 = (iHashCode6 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        Uri uri = this.j;
        int iHashCode8 = uri == null ? 0 : uri.hashCode();
        long j = this.k;
        int i2 = (((iHashCode7 ^ iHashCode8) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        CharSequence charSequence7 = this.l;
        return i2 ^ (charSequence7 != null ? charSequence7.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.l;
        Uri uri = this.j;
        Bitmap bitmap = this.i;
        yfq yfqVar = this.h;
        yfq yfqVar2 = this.g;
        CharSequence charSequence2 = this.f;
        CharSequence charSequence3 = this.e;
        CharSequence charSequence4 = this.d;
        CharSequence charSequence5 = this.c;
        CharSequence charSequence6 = this.b;
        return "MetadataModel{title=" + String.valueOf(this.a) + ", subtitle=" + String.valueOf(charSequence6) + ", tertiaryText=" + String.valueOf(charSequence5) + ", elapsedTime=" + String.valueOf(charSequence4) + ", totalTime=" + String.valueOf(charSequence3) + ", message=" + String.valueOf(charSequence2) + ", icons=" + String.valueOf(yfqVar2) + ", tertiaryIcons=" + String.valueOf(yfqVar) + ", image=" + String.valueOf(bitmap) + ", imageUri=" + String.valueOf(uri) + ", imageLoadTimeoutMs=" + this.k + ", imageSignature=" + String.valueOf(charSequence) + "}";
    }

    public lyw() {
        throw null;
    }
}
