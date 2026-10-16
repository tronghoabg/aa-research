package j;

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
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC3630k;
import o.AbstractC3631l;
import o.AbstractC3632m;

/* loaded from: classes.dex */
public final class s implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f38477a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38478b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38479c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f38481e;

    public s(w wVar, Window.Callback callback) {
        this.f38481e = wVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f38477a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f38478b = true;
            callback.onContentChanged();
        } finally {
            this.f38478b = false;
        }
    }

    public final boolean b(int i5, Menu menu) {
        return this.f38477a.onMenuOpened(i5, menu);
    }

    public final void c(int i5, Menu menu) {
        this.f38477a.onPanelClosed(i5, menu);
    }

    public final void d(List list, Menu menu, int i5) {
        AbstractC3631l.a(this.f38477a, list, menu, i5);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f38477a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f38479c;
        Window.Callback callback = this.f38477a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f38481e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f38477a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            j.w r2 = r6.f38481e
            r2.B()
            j.H r3 = r2.f38541o
            r4 = 0
            if (r3 == 0) goto L3d
            j.G r3 = r3.f38397n
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            p.k r3 = r3.f38380d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            j.v r0 = r2.f38516M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.G(r0, r3, r7)
            if (r0 == 0) goto L52
            j.v r7 = r2.f38516M
            if (r7 == 0) goto L3b
            r7.f38496l = r1
            goto L3b
        L52:
            j.v r0 = r2.f38516M
            if (r0 != 0) goto L6a
            j.v r0 = r2.A(r4)
            r2.H(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.G(r0, r3, r7)
            r0.k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j.s.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f38477a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f38477a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f38477a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f38477a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f38477a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f38477a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f38478b) {
            this.f38477a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i5, Menu menu) {
        if (i5 != 0 || (menu instanceof p.k)) {
            return this.f38477a.onCreatePanelMenu(i5, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i5) {
        return this.f38477a.onCreatePanelView(i5);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f38477a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        return this.f38477a.onMenuItemSelected(i5, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i5, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i5, menu);
        w wVar = this.f38481e;
        if (i5 != 108) {
            wVar.getClass();
            return true;
        }
        wVar.B();
        H h10 = wVar.f38541o;
        if (h10 != null && true != h10.f38400q) {
            h10.f38400q = true;
            ArrayList arrayList = h10.f38401r;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i5, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f38480d) {
            this.f38477a.onPanelClosed(i5, menu);
            return;
        }
        c(i5, menu);
        w wVar = this.f38481e;
        if (i5 != 108) {
            if (i5 != 0) {
                wVar.getClass();
                return;
            }
            v vVarA = wVar.A(i5);
            if (vVarA.f38497m) {
                wVar.r(vVarA, false);
                return;
            }
            return;
        }
        wVar.B();
        H h10 = wVar.f38541o;
        if (h10 == null || !h10.f38400q) {
            return;
        }
        h10.f38400q = false;
        ArrayList arrayList = h10.f38401r;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC3632m.a(this.f38477a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i5, View view, Menu menu) {
        p.k kVar = menu instanceof p.k ? (p.k) menu : null;
        if (i5 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f43061x = true;
        }
        boolean zOnPreparePanel = this.f38477a.onPreparePanel(i5, view, menu);
        if (kVar != null) {
            kVar.f43061x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i5) {
        p.k kVar = this.f38481e.A(0).f38493h;
        if (kVar != null) {
            d(list, kVar, i5);
        } else {
            d(list, menu, i5);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC3630k.a(this.f38477a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f38477a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f38477a.onWindowFocusChanged(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.s.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f38477a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
