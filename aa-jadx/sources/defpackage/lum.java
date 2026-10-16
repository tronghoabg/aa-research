package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lum implements java.io.Serializable {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.dur c;
    public final defpackage.ygw d;
    public final android.graphics.Bitmap e;
    public final boolean f;
    public final boolean g;

    public lum(java.lang.String str, java.lang.String str2, defpackage.dur durVar, defpackage.ygw ygwVar, android.graphics.Bitmap bitmap, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = durVar;
        this.d = ygwVar;
        this.e = bitmap;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.dur durVar;
        android.graphics.Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lum) {
            defpackage.lum lumVar = (defpackage.lum) obj;
            if (this.a.equals(lumVar.a) && this.b.equals(lumVar.b) && ((durVar = this.c) != null ? durVar.equals(lumVar.c) : lumVar.c == null) && defpackage.ysr.W(this.d, lumVar.d) && ((bitmap = this.e) != null ? bitmap.equals(lumVar.e) : lumVar.e == null) && this.f == lumVar.f && this.g == lumVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        defpackage.dur durVar = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (durVar == null ? 0 : durVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        android.graphics.Bitmap bitmap = this.e;
        return ((((iHashCode2 ^ (bitmap != null ? bitmap.hashCode() : 0)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        android.graphics.Bitmap bitmap = this.e;
        defpackage.ygw ygwVar = this.d;
        return "ConversationModel{id=" + this.a + ", title=" + this.b + ", selfSender=" + java.lang.String.valueOf(this.c) + ", messages=" + java.lang.String.valueOf(ygwVar) + ", iconBitmap=" + java.lang.String.valueOf(bitmap) + ", isRead=" + this.f + ", isGroupConversation=" + this.g + "}";
    }

    public lum() {
        throw null;
    }
}
