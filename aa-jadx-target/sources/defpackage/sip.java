package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sip extends defpackage.sil {
    public static final java.util.List n = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List o;
    public final sin p;

    public sip(android.content.Context context, java.lang.String str, java.lang.String str2, defpackage.sjp sjpVar, int i, defpackage.siq siqVar, defpackage.sjl sjlVar, sin sinVar, zxw zxwVar) {
        super(context, str, str2, sjpVar, i, siqVar, sjlVar, zxwVar);
        this.o = new java.util.concurrent.CopyOnWriteArrayList();
        this.p = sinVar;
    }

    public final void e(sio sioVar) {
        this.o.add(0, sioVar);
    }

    public final defpackage.sim f(defpackage.abpy abpyVar) {
        if (abpyVar != null) {
            return new defpackage.sim(this, abpyVar);
        }
        throw new java.lang.NullPointerException("null reference");
    }
}
