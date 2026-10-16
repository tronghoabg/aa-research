package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class llp {
    public static final defpackage.llo a = new defpackage.llo();
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 7);
    public final java.util.HashMap c = new java.util.HashMap();

    public final void a(android.content.ComponentName componentName) {
        defpackage.ojm.a();
        this.c.put(componentName, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
    }
}
