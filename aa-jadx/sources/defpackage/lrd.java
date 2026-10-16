package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lrd {
    public final android.content.ComponentName a;
    public final android.content.ComponentName b;

    public lrd(android.content.ComponentName componentName, android.content.ComponentName componentName2) {
        this.a = componentName;
        this.b = componentName2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lrd) {
            defpackage.lrd lrdVar = (defpackage.lrd) obj;
            android.content.ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lrdVar.a) : lrdVar.a == null) {
                android.content.ComponentName componentName2 = this.b;
                if (componentName2 != null ? componentName2.equals(lrdVar.b) : lrdVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        int iHashCode = componentName == null ? 0 : componentName.hashCode();
        android.content.ComponentName componentName2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (componentName2 != null ? componentName2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        android.content.ComponentName componentName = this.b;
        return "PlayingAppAndDefaultAppPair{playingApp=" + java.lang.String.valueOf(this.a) + ", defaultApp=" + java.lang.String.valueOf(componentName) + "}";
    }

    public lrd() {
        throw null;
    }
}
