package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wmh extends defpackage.wmm {
    @Override // defpackage.wmm
    public final int a(android.view.View view, android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // defpackage.wmm
    public final int b() {
        return 0;
    }

    @Override // defpackage.wmm
    public final android.view.ViewPropertyAnimator c(android.view.View view, int i) {
        return view.animate().translationX(i);
    }

    @Override // defpackage.wmm
    public final void d() {
    }
}
