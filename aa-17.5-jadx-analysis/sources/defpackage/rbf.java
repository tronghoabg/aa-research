package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class rbf implements Window.Callback {
    private final rbg a;
    private final Window b;
    private OnBackInvokedDispatcher c;
    private OnBackInvokedCallback d;
    private final boolean e;

    public rbf(rbg rbgVar, boolean z) {
        this.a = rbgVar;
        Window window = rbgVar.c().getWindow();
        window.getClass();
        this.b = window;
        this.e = z;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.b.superDispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Rect rect;
        Window window = this.b;
        boolean zSuperDispatchKeyEvent = window.superDispatchKeyEvent(keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (!zSuperDispatchKeyEvent) {
            zSuperDispatchKeyEvent = this.a.h(keyEvent);
        }
        rbg rbgVar = this.a;
        View currentFocus = window.getCurrentFocus();
        if (currentFocus == null) {
            rect = null;
        } else {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            Rect rect2 = new Rect();
            currentFocus.getFocusedRect(rect2);
            rect = new Rect();
            rect.left = iArr[0] + rect2.left;
            rect.right = iArr[0] + rect2.right;
            rect.top = iArr[1] + rect2.top;
            rect.bottom = iArr[1] + rect2.bottom;
        }
        rbgVar.d(zSuperDispatchKeyEvent, new rom(-1, rect));
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
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.b.superDispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.b.superDispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.b.superDispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        raw rawVarC = this.a.c();
        if (rawVarC != null) {
            rawVarC.r(true);
        }
        if (!this.e || Build.VERSION.SDK_INT < 36) {
            return;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.b.getOnBackInvokedDispatcher();
        this.c = onBackInvokedDispatcher;
        if (onBackInvokedDispatcher != null) {
            nf nfVar = new nf(this, 4);
            this.d = nfVar;
            this.c.registerOnBackInvokedCallback(1000000, nfVar);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        raw rawVarC = this.a.c();
        if (rawVarC != null) {
            rawVarC.r(false);
        }
        if (Build.VERSION.SDK_INT < 36 || (onBackInvokedDispatcher = this.c) == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        this.c = null;
        this.d = null;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.e(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        if (rrd.e("GH.ProjectionWindowCB", 3)) {
            rrd.d(3, "GH.ProjectionWindowCB", null, "onWindowFocusChanged(hasFocus:%b)", Boolean.valueOf(z));
        }
        rbg rbgVar = this.a;
        raw rawVarC = rbgVar.c();
        if (rawVarC == null) {
            rrd.d(5, "GH.ProjectionWindowCB", null, "Host presentation was null during window focus change", new Object[0]);
            return;
        }
        boolean z2 = rawVarC.o;
        if (z2 != z) {
            rrd.d(5, "GH.ProjectionWindowCB", null, "Host presentation did not match window focus changed callback. Presentation focus: %b, callback focus: %b", Boolean.valueOf(z2), Boolean.valueOf(z));
            return;
        }
        if (rrd.e("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s onWindowFocusChangeReached(hasWindowFocus:%b) [windowHasFocus:%b]", rawVarC.m, Boolean.valueOf(z), Boolean.valueOf(rawVarC.s));
        }
        rawVarC.s = z;
        rawVarC.m();
        if (rbgVar.g() != z) {
            rbgVar.f(z, rawVarC.p);
        } else if (rrd.e("GH.ProjectionWindowCB", 3)) {
            rrd.d(3, "GH.ProjectionWindowCB", null, "onWindowFocusChanged() Host focus already matches window focus: %b", Boolean.valueOf(z));
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
    }
}
