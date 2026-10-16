package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fs extends defpackage.ef implements defpackage.ih {
    private static final android.view.animation.Interpolator r = new android.view.animation.AccelerateInterpolator();
    private static final android.view.animation.Interpolator s = new android.view.animation.DecelerateInterpolator();
    android.content.Context a;
    android.support.v7.widget.ActionBarOverlayLayout b;
    public android.support.v7.widget.ActionBarContainer c;
    android.support.v7.widget.ActionBarContextView d;
    android.view.View e;
    fr f;
    gm g;
    gl h;
    public int i;
    public boolean j;
    public boolean k;
    public gu l;
    boolean m;
    final ecb n;
    final ecb o;
    defpackage.nm p;
    final ajnd q;
    private android.content.Context t;
    private boolean u;
    private boolean v;
    private final java.util.ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public fs(android.app.Activity activity, boolean z) {
        new java.util.ArrayList();
        this.w = new java.util.ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new fp(this);
        this.o = new fq(this);
        this.q = new ajnd(this, (byte[]) null);
        android.view.View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(android.R.id.content);
    }

    private final void A() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    static boolean y(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void z(android.view.View view) {
        android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayoutFindViewById = view.findViewById(2131427936);
        this.b = actionBarOverlayLayoutFindViewById;
        if (actionBarOverlayLayoutFindViewById != null) {
            actionBarOverlayLayoutFindViewById.h = this;
            if (actionBarOverlayLayoutFindViewById.getWindowToken() != null) {
                ((defpackage.fs) actionBarOverlayLayoutFindViewById.h).i = actionBarOverlayLayoutFindViewById.b;
                int i = actionBarOverlayLayoutFindViewById.g;
                if (i != 0) {
                    actionBarOverlayLayoutFindViewById.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = defpackage.ebt.a;
                    actionBarOverlayLayoutFindViewById.requestApplyInsets();
                }
            }
        }
        android.view.View viewFindViewById = view.findViewById(2131427392);
        if (!(viewFindViewById instanceof android.support.v7.widget.Toolbar)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't make a decor toolbar out of ");
            sb.append(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.p = ((android.support.v7.widget.Toolbar) viewFindViewById).A();
        this.d = view.findViewById(2131427410);
        android.support.v7.widget.ActionBarContainer actionBarContainerFindViewById = view.findViewById(2131427394);
        this.c = actionBarContainerFindViewById;
        defpackage.nm nmVar = this.p;
        if (nmVar == null || this.d == null || actionBarContainerFindViewById == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = nmVar.a();
        if ((this.p.b & 4) != 0) {
            this.u = true;
        }
        android.content.Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        defpackage.ca.z(context);
        A();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, defpackage.ft.a, 2130968585, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.b;
            if (!actionBarOverlayLayout.d) {
                throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            android.support.v7.widget.ActionBarContainer actionBarContainer = this.c;
            int[] iArr2 = defpackage.ebt.a;
            actionBarContainer.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.ef
    public final int a() {
        return this.p.b;
    }

    @Override // defpackage.ef
    public final android.content.Context b() {
        if (this.t == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.a.getTheme().resolveAttribute(2130968590, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new android.view.ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.ef
    public final gm c(gl glVar) {
        fr frVar = this.f;
        if (frVar != null) {
            frVar.f();
        }
        this.b.k(false);
        this.d.i();
        fr frVar2 = new fr(this, this.d.getContext(), glVar);
        defpackage.hh hhVar = frVar2.a;
        hhVar.s();
        try {
            boolean zC = frVar2.b.c(frVar2, hhVar);
            frVar2.a.r();
            if (!zC) {
                return null;
            }
            this.f = frVar2;
            frVar2.g();
            this.d.h(frVar2);
            v(true);
            return frVar2;
        } catch (java.lang.Throwable th) {
            frVar2.a.r();
            throw th;
        }
    }

    @Override // defpackage.ef
    public final void d(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        java.util.ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ee) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.ef
    public final void f(boolean z) {
        if (this.u) {
            return;
        }
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.ef
    public final void g(boolean z) {
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.ef
    public final void h(boolean z) {
        gu guVar;
        this.z = z;
        if (z || (guVar = this.l) == null) {
            return;
        }
        guVar.a();
    }

    @Override // defpackage.ef
    public final void i(int i) {
        j(this.a.getString(i));
    }

    @Override // defpackage.ef
    public final void j(java.lang.CharSequence charSequence) {
        this.p.g(charSequence);
    }

    @Override // defpackage.ef
    public final void k(java.lang.CharSequence charSequence) {
        this.p.i(charSequence);
    }

    @Override // defpackage.ef
    public final boolean m() {
        defpackage.nm nmVar = this.p;
        if (nmVar == null || !nmVar.j()) {
            return false;
        }
        nmVar.b();
        return true;
    }

    @Override // defpackage.ef
    public final boolean o(int i, android.view.KeyEvent keyEvent) {
        fr frVar = this.f;
        if (frVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        defpackage.hh hhVar = frVar.a;
        hhVar.setQwertyMode(android.view.KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return hhVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ef
    public final void r() {
        defpackage.ca.z(this.a);
        A();
    }

    @Override // defpackage.ef
    public final void s() {
        w(2, 2);
    }

    @Override // defpackage.ef
    public final void t() {
        w(0, 8);
    }

    @Override // defpackage.ef
    public final void u() {
        this.p.e(null);
    }

    public final void v(boolean z) {
        defpackage.erh erhVarG;
        defpackage.erh erhVarG2;
        boolean z2 = this.x;
        if (z) {
            if (!z2) {
                this.x = true;
                x(false);
            }
        } else if (z2) {
            this.x = false;
            x(false);
        }
        if (!this.c.isLaidOut()) {
            defpackage.nm nmVar = this.p;
            if (z) {
                nmVar.h(4);
                this.d.setVisibility(0);
                return;
            } else {
                nmVar.h(0);
                this.d.setVisibility(8);
                return;
            }
        }
        defpackage.nm nmVar2 = this.p;
        if (z) {
            erhVarG = nmVar2.n(4, 100L);
            erhVarG2 = this.d.g(0, 200L);
        } else {
            defpackage.erh erhVarN = nmVar2.n(0, 200L);
            erhVarG = this.d.g(8, 100L);
            erhVarG2 = erhVarN;
        }
        gu guVar = new gu();
        java.util.ArrayList arrayList = guVar.a;
        arrayList.add(erhVarG);
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) erhVarG.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) erhVarG2.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(erhVarG2);
        guVar.b();
    }

    public final void w(int i, int i2) {
        defpackage.nm nmVar = this.p;
        int i3 = nmVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        nmVar.d((i & i2) | ((~i2) & i3));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    public final void x(boolean z) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        boolean zY = y(this.k, this.x);
        boolean z2 = this.y;
        if (!zY) {
            if (z2) {
                this.y = false;
                gu guVar = this.l;
                if (guVar != null) {
                    guVar.a();
                }
                if (this.i == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    gu guVar2 = new gu();
                    float f = -this.c.getHeight();
                    if (z) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f -= iArr[1];
                    }
                    defpackage.erh erhVarU = defpackage.ebt.u(this.c);
                    erhVarU.H(f);
                    erhVarU.ai(this.q);
                    guVar2.f(erhVarU);
                    if (this.j && (view = this.e) != null) {
                        defpackage.erh erhVarU2 = defpackage.ebt.u(view);
                        erhVarU2.H(f);
                        guVar2.f(erhVarU2);
                    }
                    guVar2.d(r);
                    guVar2.c();
                    guVar2.e(this.n);
                    this.l = guVar2;
                    guVar2.b();
                    return;
                }
                this.n.a();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.y = true;
        gu guVar3 = this.l;
        if (guVar3 != null) {
            guVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j && (view2 = this.e) != null) {
                view2.setTranslationY(0.0f);
            }
            this.o.a();
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                } else {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.j) {
                        view2.setTranslationY(0.0f);
                    }
                    this.o.a();
                }
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.c.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.c.setTranslationY(f2);
            gu guVar4 = new gu();
            defpackage.erh erhVarU3 = defpackage.ebt.u(this.c);
            erhVarU3.H(0.0f);
            erhVarU3.ai(this.q);
            guVar4.f(erhVarU3);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                defpackage.erh erhVarU4 = defpackage.ebt.u(this.e);
                erhVarU4.H(0.0f);
                guVar4.f(erhVarU4);
            }
            guVar4.d(s);
            guVar4.c();
            guVar4.e(this.o);
            this.l = guVar4;
            guVar4.b();
        }
        android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr3 = defpackage.ebt.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public fs(android.app.Dialog dialog) {
        new java.util.ArrayList();
        this.w = new java.util.ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new fp(this);
        this.o = new fq(this);
        this.q = new ajnd(this, (byte[]) null);
        z(dialog.getWindow().getDecorView());
    }
}
