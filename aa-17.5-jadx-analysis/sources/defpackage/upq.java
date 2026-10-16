package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/* loaded from: classes3.dex */
public final class upq {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/resource/api/RenderIconRequest");
    public static final xxx b = xxx.e(",");
    public static final xxx c = xxx.e("&");
    public static final int[] d = new int[0];
    public final yfq e;
    public final String f;
    public final float g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final int l;

    public upq(yfq yfqVar, String str, float f, int i, int i2, boolean z, int i3, int i4) {
        yfqVar.getClass();
        this.e = yfqVar;
        this.f = str;
        this.g = f;
        this.h = i;
        this.i = i2;
        this.j = z;
        this.k = i3;
        this.l = i4;
    }

    public static URL a(String str) {
        int iLastIndexOf;
        int iIndexOf = str.indexOf(61);
        try {
            if (str.contains("?") || iIndexOf == -1 || (iLastIndexOf = str.lastIndexOf(47, iIndexOf)) == -1) {
                return new URL(str);
            }
            return new URL(str.substring(0, iLastIndexOf) + "?" + str.substring(iLastIndexOf + 1));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public static int[] b(String str) throws NumberFormatException {
        List listI = b.i(str);
        int size = listI.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            try {
                long j = Long.parseLong((String) listI.get(i), 16);
                if (j > 2147483647L) {
                    j -= 4294967296L;
                }
                iArr[i] = (int) zeb.k(j, -2147483648L, 2147483647L);
            } catch (NumberFormatException unused) {
                iArr[i] = 0;
            }
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof upq) {
            upq upqVar = (upq) obj;
            if (yrm.W(this.e, upqVar.e) && this.f.equals(upqVar.f)) {
                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(upqVar.g) && this.h == upqVar.h && this.i == upqVar.i && this.j == upqVar.j && this.k == upqVar.k && this.l == upqVar.l) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ Float.floatToIntBits(this.g);
        return this.l ^ (((((((((iHashCode * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k) * 1000003);
    }

    public final String toString() {
        return "{" + this.e.toString() + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + ", " + this.k + ", " + this.l + "}";
    }

    public upq() {
        throw null;
    }
}
