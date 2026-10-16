package defpackage;

/* loaded from: classes2.dex */
public final class doj extends dos {
    public final Object a;
    public final dol b;
    public final dol c;
    public final dok d;
    public final dol e;
    public final dol f;
    public final dok g;

    public doj(Object obj) {
        super(obj);
        this.a = obj;
        this.b = new dol(obj, -2, this);
        this.c = new dol(obj, 0, this);
        this.d = new dok(obj, 0, this);
        this.e = new dol(obj, -1, this);
        this.f = new dol(obj, 1, this);
        this.g = new dok(obj, 1, this);
    }

    @Override // defpackage.dos
    public final Object a() {
        return this.a;
    }
}
