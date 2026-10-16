package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class kqt {
    public final String a;
    public final yfq b;
    public final Uri c;
    public final kqz d;
    private final boolean e;
    private final String f;
    private final kqz g;

    public kqt(String str, yfq yfqVar, Uri uri, boolean z, String str2, kqz kqzVar, kqz kqzVar2) {
        this.a = str;
        this.b = yfqVar;
        this.c = uri;
        this.e = z;
        this.f = str2;
        this.g = kqzVar;
        this.d = kqzVar2;
    }

    public final boolean equals(Object obj) {
        kqz kqzVar;
        kqz kqzVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqt) {
            kqt kqtVar = (kqt) obj;
            if (this.a.equals(kqtVar.a) && yrm.W(this.b, kqtVar.b) && this.c.equals(kqtVar.c) && this.e == kqtVar.e && this.f.equals(kqtVar.f) && ((kqzVar = this.g) != null ? kqzVar.equals(kqtVar.g) : kqtVar.g == null) && ((kqzVar2 = this.d) != null ? kqzVar2.equals(kqtVar.d) : kqtVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
        kqz kqzVar = this.g;
        int iHashCode2 = ((iHashCode * 1000003) ^ (kqzVar == null ? 0 : kqzVar.hashCode())) * 1000003;
        kqz kqzVar2 = this.d;
        return iHashCode2 ^ (kqzVar2 != null ? kqzVar2.hashCode() : 0);
    }

    public final String toString() {
        kqz kqzVar = this.d;
        kqz kqzVar2 = this.g;
        Uri uri = this.c;
        return "Contact{displayName=" + this.a + ", phoneNumbers=" + String.valueOf(this.b) + ", pictureUri=" + String.valueOf(uri) + ", starred=" + this.e + ", lookupKey=" + this.f + ", oneTapPstnPhoneNumber=" + String.valueOf(kqzVar2) + ", oneTapVoipPhoneNumber=" + String.valueOf(kqzVar) + "}";
    }

    public kqt() {
        throw null;
    }
}
