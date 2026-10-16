package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vkl {
    private android.view.Choreographer.FrameCallback a;

    public abstract void a(long j);

    final android.view.Choreographer.FrameCallback b() {
        if (this.a == null) {
            this.a = new defpackage.jgr(this, 2);
        }
        return this.a;
    }
}
