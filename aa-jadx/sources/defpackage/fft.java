package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fft extends defpackage.ffw {
    @Override // defpackage.ffv
    public final float a(android.view.ViewGroup viewGroup, android.view.View view) {
        return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
    }
}
