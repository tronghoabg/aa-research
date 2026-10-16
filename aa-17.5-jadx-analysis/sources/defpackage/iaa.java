package defpackage;

/* loaded from: classes2.dex */
public final class iaa implements hwx {
    protected final Object a;

    public iaa(Object obj) {
        a.al(obj, "Argument must not be null");
        this.a = obj;
    }

    @Override // defpackage.hwx
    public final int a() {
        return 1;
    }

    @Override // defpackage.hwx
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.hwx
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.hwx
    public final void e() {
    }
}
