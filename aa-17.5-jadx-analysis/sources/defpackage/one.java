package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class one {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;
    public final Bitmap i;
    public final Uri j;
    public final int k;
    public final String l;
    public final String m;
    public final boolean n;
    public final String o;
    public final Integer p;
    public final boolean q;

    public one(boolean z, int i, boolean z2, boolean z3, String str, String str2, long j, boolean z4, Bitmap bitmap, Uri uri, int i2, String str3, String str4, boolean z5, String str5, Integer num, boolean z6) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = z4;
        this.i = bitmap;
        this.j = uri;
        this.k = i2;
        this.l = str3;
        this.m = str4;
        this.n = z5;
        this.o = str5;
        this.p = num;
        this.q = z6;
    }

    public static ond a() {
        ond ondVar = new ond();
        ondVar.g(false);
        ondVar.b(0);
        ondVar.h(false);
        ondVar.a = "";
        ondVar.b = "";
        ondVar.c(0L);
        ondVar.f(false);
        ondVar.c = null;
        ondVar.d = null;
        ondVar.d(0);
        ondVar.e("");
        ondVar.k(true);
        ondVar.j(false);
        ondVar.f = null;
        ondVar.g = null;
        ondVar.i(true);
        return ondVar;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Uri uri;
        String str;
        String str2;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof one) {
            one oneVar = (one) obj;
            if (this.a == oneVar.a && this.b == oneVar.b && this.c == oneVar.c && this.d == oneVar.d && this.e.equals(oneVar.e) && this.f.equals(oneVar.f) && this.g == oneVar.g && this.h == oneVar.h && ((bitmap = this.i) != null ? bitmap.equals(oneVar.i) : oneVar.i == null) && ((uri = this.j) != null ? uri.equals(oneVar.j) : oneVar.j == null) && this.k == oneVar.k && this.l.equals(oneVar.l) && ((str = this.m) != null ? str.equals(oneVar.m) : oneVar.m == null) && this.n == oneVar.n && ((str2 = this.o) != null ? str2.equals(oneVar.o) : oneVar.o == null) && ((num = this.p) != null ? num.equals(oneVar.p) : oneVar.p == null) && this.q == oneVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int iHashCode = ((((((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        Bitmap bitmap = this.i;
        int iHashCode2 = bitmap == null ? 0 : bitmap.hashCode();
        long j = this.g;
        int i2 = ((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ iHashCode2) * 1000003;
        Uri uri = this.j;
        int iHashCode3 = (((((i2 ^ (uri == null ? 0 : uri.hashCode())) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003;
        String str = this.m;
        int iHashCode4 = (((iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003;
        String str2 = this.o;
        int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Integer num = this.p;
        return ((iHashCode5 ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ (true == this.q ? 1231 : 1237);
    }

    public final String toString() {
        Uri uri = this.j;
        return "Model{isMuted=" + this.a + ", audioRouteIconId=" + this.b + ", isOnHold=" + this.c + ", supportsOnHold=" + this.d + ", title=" + this.e + ", contactType=" + this.f + ", callStartTime=" + this.g + ", isCallTimerEnabled=" + this.h + ", contactBitmap=" + String.valueOf(this.i) + ", contactImageUri=" + String.valueOf(uri) + ", callType=" + this.k + ", extraCallMessage=" + this.l + ", simLabel=" + this.m + ", supportsMerge=" + this.n + ", currentSpeaker=" + this.o + ", participantCount=" + this.p + ", supportsDialpad=" + this.q + "}";
    }

    public one() {
        throw null;
    }
}
