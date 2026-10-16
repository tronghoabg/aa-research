package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wmf extends defpackage.wmm {
    @Override // defpackage.wmm
    public final int a(android.view.View view, android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // defpackage.wmm
    public final int b() {
        return 1;
    }

    @Override // defpackage.wmm
    public final android.view.ViewPropertyAnimator c(android.view.View view, int i) {
        return view.animate().translationY(i);
    }

    @Override // defpackage.wmm
    public final void d() {
    }
}
