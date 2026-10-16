package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iaj implements defpackage.hxg {
    protected final java.lang.Object a;

    public iaj(java.lang.Object obj) {
        defpackage.a.ak(obj, "Argument must not be null");
        this.a = obj;
    }

    @Override // defpackage.hxg
    public final int a() {
        return 1;
    }

    @Override // defpackage.hxg
    public final java.lang.Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.hxg
    public final java.lang.Object c() {
        return this.a;
    }

    @Override // defpackage.hxg
    public final void e() {
    }
}
