package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kra {
    public final java.lang.String a;
    public final defpackage.ygw b;
    public final android.net.Uri c;
    public final defpackage.krg d;
    private final boolean e;
    private final java.lang.String f;
    private final defpackage.krg g;

    public kra(java.lang.String str, defpackage.ygw ygwVar, android.net.Uri uri, boolean z, java.lang.String str2, defpackage.krg krgVar, defpackage.krg krgVar2) {
        this.a = str;
        this.b = ygwVar;
        this.c = uri;
        this.e = z;
        this.f = str2;
        this.g = krgVar;
        this.d = krgVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.krg krgVar;
        defpackage.krg krgVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kra) {
            defpackage.kra kraVar = (defpackage.kra) obj;
            if (this.a.equals(kraVar.a) && defpackage.ysr.W(this.b, kraVar.b) && this.c.equals(kraVar.c) && this.e == kraVar.e && this.f.equals(kraVar.f) && ((krgVar = this.g) != null ? krgVar.equals(kraVar.g) : kraVar.g == null) && ((krgVar2 = this.d) != null ? krgVar2.equals(kraVar.d) : kraVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
        defpackage.krg krgVar = this.g;
        int iHashCode2 = ((iHashCode * 1000003) ^ (krgVar == null ? 0 : krgVar.hashCode())) * 1000003;
        defpackage.krg krgVar2 = this.d;
        return iHashCode2 ^ (krgVar2 != null ? krgVar2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.krg krgVar = this.d;
        defpackage.krg krgVar2 = this.g;
        android.net.Uri uri = this.c;
        return "Contact{displayName=" + this.a + ", phoneNumbers=" + java.lang.String.valueOf(this.b) + ", pictureUri=" + java.lang.String.valueOf(uri) + ", starred=" + this.e + ", lookupKey=" + this.f + ", oneTapPstnPhoneNumber=" + java.lang.String.valueOf(krgVar2) + ", oneTapVoipPhoneNumber=" + java.lang.String.valueOf(krgVar) + "}";
    }

    public kra() {
        throw null;
    }
}
