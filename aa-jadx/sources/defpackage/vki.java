package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vki extends defpackage.vkl {
    final /* synthetic */ defpackage.vkj a;

    public vki(defpackage.vkj vkjVar) {
        this.a = vkjVar;
    }

    @Override // defpackage.vkl
    public final void a(long j) {
        defpackage.vkj vkjVar = this.a;
        vkjVar.d++;
        android.animation.Animator animator = vkjVar.a;
        if (vkjVar.a(animator) || animator.isStarted()) {
            return;
        }
        if (vkjVar.c != -1 && vkjVar.d >= 0) {
            return;
        }
        java.lang.Runnable runnable = vkjVar.b;
        if (runnable != null) {
            runnable.run();
        }
        animator.start();
    }
}
