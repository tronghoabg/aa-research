package defpackage;

/* loaded from: classes2.dex */
public final class ifr implements ifs {
    final /* synthetic */ ifs a;
    private volatile Object b;

    public ifr(ifs ifsVar) {
        this.a = ifsVar;
    }

    @Override // defpackage.ifs
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object objA = this.a.a();
                    a.al(objA, "Argument must not be null");
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
