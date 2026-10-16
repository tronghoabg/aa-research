package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vkm extends defpackage.vkn {
    private final android.view.Choreographer a = android.view.Choreographer.getInstance();

    @Override // defpackage.vkn
    public final void a(defpackage.vkl vklVar) {
        this.a.postFrameCallback(vklVar.b());
    }

    @Override // defpackage.vkn
    public final void b(defpackage.vkl vklVar) {
        this.a.removeFrameCallback(vklVar.b());
    }
}
