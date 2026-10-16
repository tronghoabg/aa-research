package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afk implements defpackage.bys {
    public java.lang.Object a;
    public java.lang.Object b;
    public defpackage.aej c;
    public defpackage.agf d;
    public boolean e;
    public boolean f;
    public long g;
    public final /* synthetic */ defpackage.afo h;
    public final defpackage.bil i;
    private final defpackage.bwx j;

    public afk(defpackage.afo afoVar, java.lang.Object obj, java.lang.Object obj2, defpackage.bil bilVar, defpackage.aej aejVar) {
        this.h = afoVar;
        this.a = obj;
        this.b = obj2;
        this.i = bilVar;
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.bxv.c);
        this.c = aejVar;
        this.d = new defpackage.agf(this.c, bilVar, this.a, this.b, null);
    }

    @Override // defpackage.bys
    public final java.lang.Object a() {
        return this.j.a();
    }

    public final void b(java.lang.Object obj) {
        this.j.b(obj);
    }
}
