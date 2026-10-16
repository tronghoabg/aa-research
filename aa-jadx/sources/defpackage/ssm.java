package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ssm {
    public volatile boolean a;

    public ssm(boolean z) {
        this.a = z;
    }

    public final void a() {
        if (this.a) {
            throw new java.lang.IllegalStateException("Already released");
        }
    }
}
