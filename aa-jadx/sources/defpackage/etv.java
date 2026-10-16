package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class etv {
    public final java.lang.Object e;
    public boolean f;
    public boolean g;
    public int h;

    public etv(java.lang.Object obj) {
        this.e = obj;
    }

    public final void b(java.lang.Object obj) {
        if (this.f || this.g) {
            java.lang.Object obj2 = this.e;
            java.util.Objects.toString(obj2);
            throw new java.lang.IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: ".concat(java.lang.String.valueOf(obj2)));
        }
        this.f = true;
        a(obj);
    }

    public final boolean c() {
        return this.f || this.g;
    }

    public void a(java.lang.Object obj) {
    }
}
