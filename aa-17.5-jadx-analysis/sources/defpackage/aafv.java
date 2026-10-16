package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aafv {
    public static final String a = "aafv";
    public final int b;
    public final yfq c;
    public final int[] d;
    public Map e;
    public float[] f;
    public Map g;
    public float[] h;

    public aafv(int i, yfq yfqVar, aafr aafrVar) {
        aclh.o(i >= 0, "illegal zoomLevel: %s", new Object[]{Integer.valueOf(i)});
        this.b = i;
        zkt.n(yfqVar, "keys");
        this.c = yfqVar;
        zkt.e(!yfqVar.isEmpty(), "keys.isEmpty()");
        zkt.l(200.0f, "defaultRadiusM != NaN");
        this.d = new int[yfqVar.size()];
        zkt.n(aafrVar, "glTileFactory");
        synchronized (this) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
    }

    public final aafu a(aagk aagkVar) {
        if (b()) {
            return (aafu) this.e.get(aagkVar);
        }
        return null;
    }

    public final boolean b() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aafv) {
            return a.C(this.c, ((aafv) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.e("zoomLevel", this.b);
        zsaVarA.g("meshes", this.e != null);
        return zsaVarA.toString();
    }
}
