package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class vkh extends android.animation.AnimatorListenerAdapter {
    private final defpackage.aba a = new defpackage.aba(0);

    protected final boolean a(android.animation.Animator animator) {
        defpackage.aba abaVar = this.a;
        return abaVar.containsKey(animator) && ((java.lang.Boolean) abaVar.get(animator)).booleanValue();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.a.put(animator, java.lang.Boolean.TRUE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.put(animator, java.lang.Boolean.FALSE);
    }
}
