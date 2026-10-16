package defpackage;

/* loaded from: classes2.dex */
public final class sro {
    public volatile boolean a;

    public sro(boolean z) {
        this.a = z;
    }

    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
