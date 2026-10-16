package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dor extends defpackage.dpa {
    public final java.lang.Object a;
    public final defpackage.dot b;
    public final defpackage.dot c;
    public final defpackage.dos d;
    public final defpackage.dot e;
    public final defpackage.dot f;
    public final defpackage.dos g;

    public dor(java.lang.Object obj) {
        super(obj);
        this.a = obj;
        this.b = new defpackage.dot(obj, -2, this);
        this.c = new defpackage.dot(obj, 0, this);
        this.d = new defpackage.dos(obj, 0, this);
        this.e = new defpackage.dot(obj, -1, this);
        this.f = new defpackage.dot(obj, 1, this);
        this.g = new defpackage.dos(obj, 1, this);
    }

    @Override // defpackage.dpa
    public final java.lang.Object a() {
        return this.a;
    }
}
