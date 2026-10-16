package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class onx {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final long g;
    public final boolean h;
    public final android.graphics.Bitmap i;
    public final android.net.Uri j;
    public final int k;
    public final java.lang.String l;
    public final java.lang.String m;
    public final boolean n;
    public final java.lang.String o;
    public final java.lang.Integer p;
    public final boolean q;

    public onx(boolean z, int i, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, long j, boolean z4, android.graphics.Bitmap bitmap, android.net.Uri uri, int i2, java.lang.String str3, java.lang.String str4, boolean z5, java.lang.String str5, java.lang.Integer num, boolean z6) {
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

    public static defpackage.onw a() {
        defpackage.onw onwVar = new defpackage.onw();
        onwVar.g(false);
        onwVar.b(0);
        onwVar.h(false);
        onwVar.a = "";
        onwVar.b = "";
        onwVar.c(0L);
        onwVar.f(false);
        onwVar.c = null;
        onwVar.d = null;
        onwVar.d(0);
        onwVar.e("");
        onwVar.k(true);
        onwVar.j(false);
        onwVar.f = null;
        onwVar.g = null;
        onwVar.i(true);
        return onwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.net.Uri uri;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.onx) {
            defpackage.onx onxVar = (defpackage.onx) obj;
            if (this.a == onxVar.a && this.b == onxVar.b && this.c == onxVar.c && this.d == onxVar.d && this.e.equals(onxVar.e) && this.f.equals(onxVar.f) && this.g == onxVar.g && this.h == onxVar.h && ((bitmap = this.i) != null ? bitmap.equals(onxVar.i) : onxVar.i == null) && ((uri = this.j) != null ? uri.equals(onxVar.j) : onxVar.j == null) && this.k == onxVar.k && this.l.equals(onxVar.l) && ((str = this.m) != null ? str.equals(onxVar.m) : onxVar.m == null) && this.n == onxVar.n && ((str2 = this.o) != null ? str2.equals(onxVar.o) : onxVar.o == null) && ((num = this.p) != null ? num.equals(onxVar.p) : onxVar.p == null) && this.q == onxVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int iHashCode = ((((((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        android.graphics.Bitmap bitmap = this.i;
        int iHashCode2 = bitmap == null ? 0 : bitmap.hashCode();
        long j = this.g;
        int i2 = ((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ iHashCode2) * 1000003;
        android.net.Uri uri = this.j;
        int iHashCode3 = (((((i2 ^ (uri == null ? 0 : uri.hashCode())) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003;
        java.lang.String str = this.m;
        int iHashCode4 = (((iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003;
        java.lang.String str2 = this.o;
        int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.Integer num = this.p;
        return ((iHashCode5 ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ (true == this.q ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.j;
        return "Model{isMuted=" + this.a + ", audioRouteIconId=" + this.b + ", isOnHold=" + this.c + ", supportsOnHold=" + this.d + ", title=" + this.e + ", contactType=" + this.f + ", callStartTime=" + this.g + ", isCallTimerEnabled=" + this.h + ", contactBitmap=" + java.lang.String.valueOf(this.i) + ", contactImageUri=" + java.lang.String.valueOf(uri) + ", callType=" + this.k + ", extraCallMessage=" + this.l + ", simLabel=" + this.m + ", supportsMerge=" + this.n + ", currentSpeaker=" + this.o + ", participantCount=" + this.p + ", supportsDialpad=" + this.q + "}";
    }

    public onx() {
        throw null;
    }
}
