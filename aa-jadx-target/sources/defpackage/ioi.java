package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ioi {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.CAM.TASK");
    private static int f;
    public final int b;
    public final defpackage.ioh c;
    public final android.content.ComponentName d;
    protected final java.util.List e = new java.util.ArrayList();

    public ioi(defpackage.ioh iohVar, android.content.ComponentName componentName) {
        int i = f;
        f = i + 1;
        this.b = i;
        this.c = iohVar;
        this.d = componentName;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    protected abstract defpackage.inn a(defpackage.iof iofVar, defpackage.ioh iohVar, int i, boolean z);

    public final defpackage.inn b() {
        java.util.List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        return (defpackage.inn) list.get(0);
    }

    public final defpackage.inn c() {
        java.util.List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        return (defpackage.inn) list.get(list.size() - 1);
    }

    public final void d() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.inn) arrayList.get(i)).l();
        }
    }

    public final java.lang.String toString() {
        java.util.List list = this.e;
        return "CarActivityTask{#" + this.b + ": mRoot=" + this.d.flattenToShortString() + ", activity count=" + list.size() + "}";
    }
}
