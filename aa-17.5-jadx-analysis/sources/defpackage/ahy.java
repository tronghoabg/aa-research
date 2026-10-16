package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ahy extends tv {
    private final String a;
    private final String b;
    private final List c;
    private final aes d;

    public ahy(String str, String str2, List list, aes aesVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = aesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahy)) {
            return false;
        }
        ahy ahyVar = (ahy) obj;
        return affa.f(this.a, ahyVar.a) && affa.f(this.b, ahyVar.b) && affa.f(this.c, ahyVar.c) && affa.f(this.d, ahyVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PropertyValuesHolder2D(xPropertyName=" + this.a + ", yPropertyName=" + this.b + ", pathData=" + this.c + ", interpolator=" + this.d + ")";
    }
}
