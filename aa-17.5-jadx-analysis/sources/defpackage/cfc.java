package defpackage;

/* loaded from: classes.dex */
public final class cfc {
    public final int a;
    public final vq c = null;
    public final Integer b = null;

    public cfc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfc)) {
            return false;
        }
        cfc cfcVar = (cfc) obj;
        if (this.a != cfcVar.a) {
            return false;
        }
        vq vqVar = cfcVar.c;
        Integer num = cfcVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=null, groupOffset=null)";
    }
}
