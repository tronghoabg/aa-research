package defpackage;

/* loaded from: classes.dex */
public final class dzm extends dzl {
    private final Object a;

    public dzm(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.dzl, defpackage.dzk
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.dzl, defpackage.dzk
    public final boolean b(Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
