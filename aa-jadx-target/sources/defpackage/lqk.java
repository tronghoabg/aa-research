package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lqk {
    public final defpackage.lqj a;
    public final android.content.ComponentName b;

    public lqk(defpackage.lqj lqjVar, android.content.ComponentName componentName) {
        this.a = lqjVar;
        this.b = componentName;
    }

    public final boolean equals(java.lang.Object obj) {
        android.content.ComponentName componentName;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqk) {
            defpackage.lqk lqkVar = (defpackage.lqk) obj;
            if (this.a.equals(lqkVar.a) && ((componentName = this.b) != null ? componentName.equals(lqkVar.b) : lqkVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        android.content.ComponentName componentName = this.b;
        return (componentName == null ? 0 : componentName.hashCode()) ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        android.content.ComponentName componentName = this.b;
        return "AutoplayTriggerParameters{decision=" + this.a.toString() + ", target=" + java.lang.String.valueOf(componentName) + "}";
    }

    public lqk() {
        throw null;
    }
}
