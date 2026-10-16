package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cfj {
    public final int a;
    public final defpackage.vx c = null;
    public final java.lang.Integer b = null;

    public cfj(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cfj)) {
            return false;
        }
        defpackage.cfj cfjVar = (defpackage.cfj) obj;
        if (this.a != cfjVar.a) {
            return false;
        }
        defpackage.vx vxVar = cfjVar.c;
        java.lang.Integer num = cfjVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final java.lang.String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=null, groupOffset=null)";
    }
}
