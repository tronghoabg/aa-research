package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rca implements android.view.Window.Callback {
    private final defpackage.rcb a;
    private final android.view.Window b;
    private android.window.OnBackInvokedDispatcher c;
    private android.window.OnBackInvokedCallback d;
    private final boolean e;

    public rca(defpackage.rcb rcbVar, boolean z) {
        this.a = rcbVar;
        android.view.Window window = rcbVar.c().getWindow();
        window.getClass();
        this.b = window;
        this.e = z;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.b.superDispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.graphics.Rect rect;
        android.view.Window window = this.b;
        boolean zSuperDispatchKeyEvent = window.superDispatchKeyEvent(keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (!zSuperDispatchKeyEvent) {
            zSuperDispatchKeyEvent = this.a.h(keyEvent);
        }
        defpackage.rcb rcbVar = this.a;
        android.view.View currentFocus = window.getCurrentFocus();
        if (currentFocus == null) {
            rect = null;
        } else {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            currentFocus.getFocusedRect(rect2);
            rect = new android.graphics.Rect();
            rect.left = iArr[0] + rect2.left;
            rect.right = iArr[0] + rect2.right;
            rect.top = iArr[1] + rect2.top;
            rect.bottom = iArr[1] + rect2.bottom;
        }
        rcbVar.d(zSuperDispatchKeyEvent, new defpackage.rph(-1, rect));
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return zSuperDispatchKeyEvent;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.b.superDispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.b.superDispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.b.superDispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        defpackage.rbr rbrVarC = this.a.c();
        if (rbrVarC != null) {
            rbrVarC.r(true);
        }
        if (!this.e || android.os.Build.VERSION.SDK_INT < 36) {
            return;
        }
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ag$.ExternalSyntheticApiModelOutline0.m(this.b);
        this.c = onBackInvokedDispatcherM;
        if (onBackInvokedDispatcherM != null) {
            nh nhVar = new nh(this, 4);
            this.d = nhVar;
            ag$.ExternalSyntheticApiModelOutline0.m(this.c, 1000000, nhVar);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int i) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        defpackage.rbr rbrVarC = this.a.c();
        if (rbrVarC != null) {
            rbrVarC.r(false);
        }
        if (android.os.Build.VERSION.SDK_INT < 36 || (onBackInvokedDispatcher = this.c) == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        ag$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, onBackInvokedCallback);
        this.c = null;
        this.d = null;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, android.view.Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.a.e(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        if (defpackage.rrx.e("GH.ProjectionWindowCB", 3)) {
            defpackage.rrx.d(3, "GH.ProjectionWindowCB", null, "onWindowFocusChanged(hasFocus:%b)", java.lang.Boolean.valueOf(z));
        }
        defpackage.rcb rcbVar = this.a;
        defpackage.rbr rbrVarC = rcbVar.c();
        if (rbrVarC == null) {
            defpackage.rrx.d(5, "GH.ProjectionWindowCB", null, "Host presentation was null during window focus change", new java.lang.Object[0]);
            return;
        }
        boolean z2 = rbrVarC.o;
        if (z2 != z) {
            defpackage.rrx.d(5, "GH.ProjectionWindowCB", null, "Host presentation did not match window focus changed callback. Presentation focus: %b, callback focus: %b", java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z));
            return;
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onWindowFocusChangeReached(hasWindowFocus:%b) [windowHasFocus:%b]", rbrVarC.m, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(rbrVarC.s));
        }
        rbrVarC.s = z;
        rbrVarC.m();
        if (rcbVar.g() != z) {
            rcbVar.f(z, rbrVarC.p);
        } else if (defpackage.rrx.e("GH.ProjectionWindowCB", 3)) {
            defpackage.rrx.d(3, "GH.ProjectionWindowCB", null, "onWindowFocusChanged() Host focus already matches window focus: %b", java.lang.Boolean.valueOf(z));
        }
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
    }
}
