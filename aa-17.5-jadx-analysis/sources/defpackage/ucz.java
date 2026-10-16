package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ucz {
    public final abih a;
    public final byte[] b;
    public final String c;

    public ucz(abih abihVar, byte[] bArr, String str) {
        this.a = abihVar;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucz) {
            ucz uczVar = (ucz) obj;
            if (this.a.equals(uczVar.a)) {
                boolean z = uczVar instanceof ucz;
                if (Arrays.equals(this.b, uczVar.b) && ((str = this.c) != null ? str.equals(uczVar.c) : uczVar.c == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
        String str = this.c;
        return (str == null ? 0 : str.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        return "{" + String.valueOf(this.a) + ", " + Arrays.toString(bArr) + ", " + this.c + "}";
    }

    public ucz() {
        throw null;
    }
}
