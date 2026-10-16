package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ajpt implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    public final String d = "HTTP";
    public final int e;
    public final int f;

    public ajpt(int i, int i2) {
        ahgm.d(i, "Protocol major version");
        this.e = i;
        ahgm.d(i2, "Protocol minor version");
        this.f = i2;
    }

    public final boolean a(ajpt ajptVar) {
        if (ajptVar != null) {
            String str = this.d;
            String str2 = ajptVar.d;
            if (str.equals(str2)) {
                boolean zEquals = str.equals(str2);
                Object[] objArr = {this, ajptVar};
                if (!zEquals) {
                    throw new IllegalArgumentException(String.format("Versions for different protocols cannot be compared: %s %s", objArr));
                }
                int i = this.e - ajptVar.e;
                if (i == 0) {
                    i = this.f - ajptVar.f;
                }
                if (i <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajpt)) {
            return false;
        }
        ajpt ajptVar = (ajpt) obj;
        return this.d.equals(ajptVar.d) && this.e == ajptVar.e && this.f == ajptVar.f;
    }

    public final int hashCode() {
        return this.f ^ ((this.e * 100000) ^ this.d.hashCode());
    }

    public final String toString() {
        return this.d + '/' + Integer.toString(this.e) + '.' + Integer.toString(this.f);
    }
}
