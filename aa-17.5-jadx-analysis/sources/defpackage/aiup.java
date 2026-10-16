package defpackage;

/* loaded from: classes2.dex */
public final class aiup implements aite {
    private final /* synthetic */ int a;
    private final Object b;

    public aiup(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afec, aiuo, java.lang.Object] */
    @Override // defpackage.aite
    public final void a(Throwable th) {
        int i = this.a;
        ?? r1 = this.b;
        if (i != 0) {
            r1.invoke(th);
        } else {
            r1.hy();
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        if (i == 0) {
            return "DisposeOnCancel[" + obj + "]";
        }
        return "CancelHandler.UserSupplied[" + aiua.a(obj) + "@" + aiua.b(this) + "]";
    }
}
