package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lrg {
    public final android.content.ComponentName a;
    public final defpackage.lmk b;

    public lrg(android.content.ComponentName componentName, defpackage.lmk lmkVar) {
        this.a = componentName;
        this.b = lmkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lrg) {
            defpackage.lrg lrgVar = (defpackage.lrg) obj;
            android.content.ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lrgVar.a) : lrgVar.a == null) {
                defpackage.lmk lmkVar = this.b;
                if (lmkVar != null ? lmkVar.equals(lrgVar.b) : lrgVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        int iHashCode = componentName == null ? 0 : componentName.hashCode();
        defpackage.lmk lmkVar = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (lmkVar != null ? lmkVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.lmk lmkVar = this.b;
        return "AppAndMetadata{appName=" + java.lang.String.valueOf(this.a) + ", metadata=" + java.lang.String.valueOf(lmkVar) + "}";
    }

    public lrg() {
        throw null;
    }
}
