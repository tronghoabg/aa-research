package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ex extends defpackage.gv {
    public boolean a;
    public boolean b;
    final /* synthetic */ defpackage.ff c;
    public defpackage.izq d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(defpackage.ff ffVar, android.view.Window.Callback callback) {
        super(callback);
        this.c = ffVar;
    }

    public final void a(android.view.Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (this.a) {
            return this.e.dispatchKeyEvent(keyEvent);
        }
        return this.c.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            defpackage.ff ffVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            defpackage.ef efVarB = ffVar.b();
            if (efVarB == null || !efVarB.o(keyCode, keyEvent)) {
                defpackage.fd fdVar = ffVar.B;
                if (fdVar == null || !ffVar.R(fdVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (ffVar.B == null) {
                        defpackage.fd fdVarQ = ffVar.Q(0);
                        ffVar.N(fdVarQ, keyEvent);
                        boolean zR = ffVar.R(fdVarQ, keyEvent.getKeyCode(), keyEvent);
                        fdVarQ.k = false;
                        if (!zR) {
                        }
                    }
                    return false;
                }
                defpackage.fd fdVar2 = ffVar.B;
                if (fdVar2 != null) {
                    fdVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i == 0) {
            if (!(menu instanceof defpackage.hh)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final android.view.View onCreatePanelView(int i) {
        android.view.View view;
        defpackage.izq izqVar = this.d;
        if (izqVar != null) {
            if (i == 0) {
                view = new android.view.View(((defpackage.fm) izqVar.a).c.a());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final boolean onMenuOpened(int i, android.view.Menu menu) {
        defpackage.ef efVarB;
        super.onMenuOpened(i, menu);
        if (i == 108 && (efVarB = this.c.b()) != null) {
            efVarB.d(true);
        }
        return true;
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        defpackage.ff ffVar = this.c;
        if (i == 108) {
            defpackage.ef efVarB = ffVar.b();
            if (efVarB != null) {
                efVarB.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            defpackage.fd fdVarQ = ffVar.Q(0);
            if (fdVarQ.m) {
                ffVar.E(fdVarQ, false);
            }
        }
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        defpackage.hh hhVar = menu instanceof defpackage.hh ? (defpackage.hh) menu : null;
        if (i == 0) {
            if (hhVar == null) {
                return false;
            }
            i = 0;
        }
        if (hhVar != null) {
            hhVar.j = true;
        }
        defpackage.izq izqVar = this.d;
        if (izqVar != null && i == 0) {
            defpackage.fm fmVar = (defpackage.fm) izqVar.a;
            if (!fmVar.b) {
                fmVar.c.f();
                fmVar.b = true;
            }
            i = 0;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (hhVar != null) {
            hhVar.j = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i) {
        defpackage.hh hhVar = this.c.Q(0).h;
        if (hhVar != null) {
            super.onProvideKeyboardShortcuts(list, hhVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        defpackage.ff ffVar = this.c;
        if (!ffVar.u || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        android.content.Context context = ffVar.k;
        go goVar = new go(context, callback);
        gm gmVar = ffVar.q;
        if (gmVar != null) {
            gmVar.f();
        }
        ew ewVar = new ew(ffVar, goVar);
        defpackage.ef efVarB = ffVar.b();
        if (efVarB != null) {
            ffVar.q = efVarB.c(ewVar);
        }
        if (ffVar.q == null) {
            ffVar.G();
            gm gmVar2 = ffVar.q;
            if (gmVar2 != null) {
                gmVar2.f();
            }
            if (ffVar.r == null) {
                if (ffVar.z) {
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    android.content.res.Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(2130968589, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        android.content.res.Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        defpackage.pl plVar = new defpackage.pl(context, 0);
                        plVar.getTheme().setTo(themeNewTheme);
                        context = plVar;
                    }
                    ffVar.r = new android.support.v7.widget.ActionBarContextView(context);
                    ffVar.s = new android.widget.PopupWindow(context, (android.util.AttributeSet) null, 2130968604);
                    ffVar.s.setWindowLayoutType(2);
                    ffVar.s.setContentView(ffVar.r);
                    ffVar.s.setWidth(-1);
                    context.getTheme().resolveAttribute(2130968583, typedValue, true);
                    ffVar.r.e = android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    ffVar.s.setHeight(-2);
                    ffVar.t = new defpackage.ag(ffVar, 18, null);
                } else {
                    android.support.v7.widget.ViewStubCompat viewStubCompat = (android.support.v7.widget.ViewStubCompat) ffVar.v.findViewById(2131427428);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = android.view.LayoutInflater.from(ffVar.w());
                        ffVar.r = viewStubCompat.a();
                    }
                }
            }
            if (ffVar.r != null) {
                ffVar.G();
                ffVar.r.i();
                gn gnVar = new gn(ffVar.r.getContext(), ffVar.r, ewVar);
                if (ewVar.c(gnVar, gnVar.a)) {
                    gnVar.g();
                    ffVar.r.h(gnVar);
                    ffVar.q = gnVar;
                    if (ffVar.O()) {
                        ffVar.r.setAlpha(0.0f);
                        defpackage.erh erhVarU = defpackage.ebt.u(ffVar.r);
                        erhVarU.E(1.0f);
                        ffVar.J = erhVarU;
                        ffVar.J.G(new eu(ffVar));
                    } else {
                        ffVar.r.setAlpha(1.0f);
                        ffVar.r.setVisibility(0);
                        if (ffVar.r.getParent() instanceof android.view.View) {
                            android.view.View view = (android.view.View) ffVar.r.getParent();
                            int[] iArr = defpackage.ebt.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (ffVar.s != null) {
                        ffVar.l.getDecorView().post(ffVar.t);
                    }
                } else {
                    ffVar.q = null;
                }
            }
            ffVar.J();
        }
        ffVar.J();
        gm gmVar3 = ffVar.q;
        if (gmVar3 != null) {
            return goVar.e(gmVar3);
        }
        return null;
    }

    @Override // defpackage.gv, android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }
}
