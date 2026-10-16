package android.support.v7.app;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class af extends android.support.v7.view.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f504a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f505c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f506d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(an anVar, Window.Callback callback) {
        super(callback);
        this.f504a = anVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f505c = true;
            callback.onContentChanged();
        } finally {
            this.f505c = false;
        }
    }

    public final void b(Window.Callback callback, int i2, Menu menu) {
        try {
            this.f507e = true;
            callback.onPanelClosed(i2, menu);
        } finally {
            this.f507e = false;
        }
    }

    public final boolean c(Window.Callback callback, KeyEvent keyEvent) {
        try {
            this.f506d = true;
            return callback.dispatchKeyEvent(keyEvent);
        } finally {
            this.f506d = false;
        }
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f506d ? d().dispatchKeyEvent(keyEvent) : this.f504a.Q(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f504a.T(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f505c) {
            d().onContentChanged();
        }
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            if (!(menu instanceof android.support.v7.view.menu.q)) {
                return false;
            }
            i2 = 0;
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) {
        android.support.a.i iVarC;
        super.onMenuOpened(i2, menu);
        if (i2 == 108 && (iVarC = this.f504a.C()) != null) {
            iVarC.f(true);
        }
        return true;
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f507e) {
            d().onPanelClosed(i2, menu);
            return;
        }
        super.onPanelClosed(i2, menu);
        an anVar = this.f504a;
        if (i2 == 108) {
            android.support.a.i iVarC = anVar.C();
            if (iVarC != null) {
                iVarC.f(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            al alVarX = anVar.X(0);
            if (alVarX.m) {
                anVar.K(alVarX, false);
            }
        }
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        android.support.v7.view.menu.q qVar = menu instanceof android.support.v7.view.menu.q ? (android.support.v7.view.menu.q) menu : null;
        if (i2 == 0) {
            if (qVar == null) {
                return false;
            }
            i2 = 0;
        }
        if (qVar != null) {
            qVar.v(true);
        }
        boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
        if (qVar != null) {
            qVar.v(false);
        }
        return zOnPreparePanel;
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        android.support.v7.view.menu.q qVar = this.f504a.X(0).f523h;
        if (qVar != null) {
            super.onProvideKeyboardShortcuts(list, qVar, i2);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i2);
        }
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        an anVar = this.f504a;
        if (!anVar.R() || i2 != 0) {
            return super.onWindowStartingActionMode(callback, i2);
        }
        android.support.v7.view.e eVar = new android.support.v7.view.e(anVar.f530d, callback);
        android.support.v7.view.b bVar = anVar.f533g;
        if (bVar != null) {
            bVar.f();
        }
        ac acVar = new ac(anVar, eVar);
        android.support.a.i iVarC = anVar.C();
        if (iVarC != null) {
            az azVar = (az) iVarC;
            ay ayVar = azVar.f569f;
            if (ayVar != null) {
                ayVar.f();
            }
            azVar.f565b.g(false);
            azVar.f567d.l();
            ay ayVar2 = new ay(azVar, azVar.f567d.getContext(), acVar);
            if (ayVar2.n()) {
                azVar.f569f = ayVar2;
                ayVar2.g();
                azVar.f567d.k(ayVar2);
                azVar.k(true);
            } else {
                ayVar2 = null;
            }
            anVar.f533g = ayVar2;
        }
        if (anVar.f533g == null) {
            anVar.f533g = anVar.G(acVar);
        }
        anVar.P();
        android.support.v7.view.b bVar2 = anVar.f533g;
        if (bVar2 != null) {
            return eVar.e(bVar2);
        }
        return null;
    }

    @Override // android.support.v7.view.l, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
