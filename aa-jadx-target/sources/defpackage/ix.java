package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ix {
    public ng a;
    private final android.view.View b;
    private ng e;
    private ng f;
    private int d = -1;
    private final defpackage.jd c = defpackage.jd.d();

    public ix(android.view.View view) {
        this.b = view;
    }

    public final void a() {
        android.view.View view = this.b;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                ng ngVar = this.f;
                if (ngVar == null) {
                    ngVar = new ng();
                    this.f = ngVar;
                }
                ngVar.a = null;
                ngVar.d = false;
                ngVar.b = null;
                ngVar.c = false;
                int[] iArr = defpackage.ebt.a;
                android.content.res.ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    ngVar.d = true;
                    ngVar.a = backgroundTintList;
                }
                android.graphics.PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    ngVar.c = true;
                    ngVar.b = backgroundTintMode;
                }
                if (ngVar.d || ngVar.c) {
                    defpackage.mu.g(background, ngVar, view.getDrawableState());
                    return;
                }
            }
            ng ngVar2 = this.a;
            if (ngVar2 != null) {
                defpackage.mu.g(background, ngVar2, view.getDrawableState());
                return;
            }
            ng ngVar3 = this.e;
            if (ngVar3 != null) {
                defpackage.mu.g(background, ngVar3, view.getDrawableState());
            }
        }
    }

    public final void b(android.util.AttributeSet attributeSet, int i) {
        android.view.View view = this.b;
        android.content.Context context = view.getContext();
        int[] iArr = defpackage.ft.A;
        defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        defpackage.ebt.m(view, view.getContext(), iArr, attributeSet, (android.content.res.TypedArray) lamVar.a, i, 0);
        try {
            if (lamVar.y(0)) {
                this.d = lamVar.q(0, -1);
                android.content.res.ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (lamVar.y(1)) {
                view.setBackgroundTintList(lamVar.r(1));
            }
            if (lamVar.y(2)) {
                int iN = lamVar.n(2, -1);
                android.graphics.Rect rect = defpackage.kp.a;
                view.setBackgroundTintMode(defpackage.a.Q(iN, null));
            }
        } finally {
            lamVar.w();
        }
    }

    public final void c(int i) {
        this.d = i;
        defpackage.jd jdVar = this.c;
        d(jdVar != null ? jdVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            ng ngVar = this.e;
            if (ngVar == null) {
                ngVar = new ng();
                this.e = ngVar;
            }
            ngVar.a = colorStateList;
            ngVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
