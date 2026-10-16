package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zrq implements zsb {
    public final int a;
    public final int b;

    public zrq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrq)) {
            return false;
        }
        zrq zrqVar = (zrq) obj;
        if (a.C(Integer.valueOf(this.a), Integer.valueOf(zrqVar.a))) {
            if (a.C(Integer.valueOf(this.b), Integer.valueOf(zrqVar.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zsb
    public final int getHeight() {
        throw null;
    }

    @Override // defpackage.zsb
    public final int getWidth() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.e("width", this.a);
        zsaVarA.e("height", this.b);
        return zsaVarA.toString();
    }
}
