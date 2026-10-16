package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jqb extends defpackage.jpy implements defpackage.qvl, defpackage.jnq, defpackage.jns {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarService");
    static final defpackage.yhx b = defpackage.yhx.r(3, 0, 1, 2);
    public defpackage.jpz e;
    public final android.os.Handler f;
    public final defpackage.rqt g;
    public final defpackage.jqa h;
    private final defpackage.jfe k;
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference();
    public final java.util.Set d = new java.util.LinkedHashSet();
    private final defpackage.xzi l = defpackage.ysr.aQ(new defpackage.ilu(this, 19));
    public final java.util.concurrent.atomic.AtomicMarkableReference i = new java.util.concurrent.atomic.AtomicMarkableReference(-1, false);
    public final java.util.Set j = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());

    public jqb(android.os.Handler handler, android.content.Context context, defpackage.jfe jfeVar) {
        this.f = handler;
        this.k = jfeVar;
        this.h = new defpackage.jqa(this, handler);
        this.g = defpackage.rqt.a(context);
    }

    @Override // defpackage.jpy, defpackage.qvk, defpackage.qvl
    public final qxh C() {
        this.k.al();
        return (qxh) this.l.fF();
    }

    @Override // defpackage.jpy
    public final defpackage.qvl a() {
        defpackage.qvl qvlVar = (defpackage.qvl) this.c.get();
        if (qvlVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2582)).u("Returning null delegate car service!");
        }
        return qvlVar;
    }

    @Override // defpackage.jpy, defpackage.qvl
    public final void aM(defpackage.qxc qxcVar) throws android.os.RemoteException {
        java.util.Set set = this.d;
        synchronized (set) {
            set.add(qxcVar);
            boolean[] zArr = new boolean[1];
            int iIntValue = ((java.lang.Integer) this.i.get(zArr)).intValue();
            if (zArr[0]) {
                qxcVar.b(iIntValue);
            }
        }
    }

    @Override // defpackage.jpy, defpackage.qvl
    public final void bg(defpackage.qxc qxcVar) {
        java.util.Set set = this.d;
        synchronized (set) {
            set.remove(qxcVar);
        }
    }

    @Override // defpackage.jpy, defpackage.qvl, defpackage.jfe
    public final boolean bs() {
        return this.i.isMarked();
    }

    @Override // defpackage.jpy
    public final void d() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2592)).u("tearDown()");
        super.d();
    }

    @Override // defpackage.jpy, defpackage.qvl, defpackage.jfe
    public final int h() {
        java.lang.Integer num = (java.lang.Integer) this.i.getReference();
        int iIntValue = num.intValue();
        defpackage.ysr.bk(b.contains(num), "OutOfCarLifecycle");
        return iIntValue;
    }

    @Override // defpackage.jpy
    protected final boolean i(int i) {
        return false;
    }
}
