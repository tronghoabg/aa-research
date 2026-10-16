package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class akag implements Cloneable, Serializable, ajpp {
    private static final long serialVersionUID = -6437800749411518984L;
    public final String a;
    public final String b;

    public akag(String str, String str2) {
        ahgm.e(str, "Name");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ajpp
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ajpp
    public final String c() {
        return this.b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajpp) {
            akag akagVar = (akag) obj;
            if (this.a.equals(akagVar.a) && a.ao(this.b, akagVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ahku.c(ahku.c(17, this.a), this.b);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        if (str == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append("=");
        sb.append(str);
        return sb.toString();
    }
}
