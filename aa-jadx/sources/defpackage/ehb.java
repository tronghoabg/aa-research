package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ehb extends android.os.FileObserver {
    public static final java.lang.Object a = new java.lang.Object();
    public static final java.util.Map b = new java.util.LinkedHashMap();
    public final java.util.concurrent.CopyOnWriteArrayList c;

    public ehb(java.lang.String str) {
        super(str, 128);
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, java.lang.String str) {
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((defpackage.affc) it.next()).invoke(str);
        }
    }
}
