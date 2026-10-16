package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dzt extends defpackage.dzs {
    private final java.lang.Object a;

    public dzt(int i) {
        super(i);
        this.a = new java.lang.Object();
    }

    @Override // defpackage.dzs, defpackage.dzr
    public final java.lang.Object a() {
        java.lang.Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.dzs, defpackage.dzr
    public final boolean b(java.lang.Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
