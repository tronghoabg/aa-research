package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
final class ew extends gu {
    public boolean a;
    public boolean b;
    final /* synthetic */ fe c;
    public izj d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(fe feVar, Window.Callback callback) {
        super(callback);
        this.c = feVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.e.dispatchKeyEvent(keyEvent) : this.c.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            fe feVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            ef efVarB = feVar.b();
            if (efVarB == null || !efVarB.o(keyCode, keyEvent)) {
                fc fcVar = feVar.B;
                if (fcVar == null || !feVar.R(fcVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (feVar.B == null) {
                        fc fcVarQ = feVar.Q(0);
                        feVar.N(fcVarQ, keyEvent);
                        boolean zR = feVar.R(fcVarQ, keyEvent.getKeyCode(), keyEvent);
                        fcVarQ.k = false;
                        if (!zR) {
                        }
                    }
                    return false;
                }
                fc fcVar2 = feVar.B;
                if (fcVar2 != null) {
                    fcVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof hg)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        izj izjVar = this.d;
        if (izjVar != null) {
            if (i == 0) {
                view = new View(((fl) izjVar.a).c.a());
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

    @Override // defpackage.gu, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        ef efVarB;
        super.onMenuOpened(i, menu);
        if (i == 108 && (efVarB = this.c.b()) != null) {
            efVarB.d(true);
        }
        return true;
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        fe feVar = this.c;
        if (i == 108) {
            ef efVarB = feVar.b();
            if (efVarB != null) {
                efVarB.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            fc fcVarQ = feVar.Q(0);
            if (fcVarQ.m) {
                feVar.E(fcVarQ, false);
            }
        }
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        hg hgVar = menu instanceof hg ? (hg) menu : null;
        if (i == 0) {
            if (hgVar == null) {
                return false;
            }
            i = 0;
        }
        if (hgVar != null) {
            hgVar.j = true;
        }
        izj izjVar = this.d;
        if (izjVar != null && i == 0) {
            fl flVar = (fl) izjVar.a;
            if (!flVar.b) {
                flVar.c.f();
                flVar.b = true;
            }
            i = 0;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (hgVar != null) {
            hgVar.j = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        hg hgVar = this.c.Q(0).h;
        if (hgVar != null) {
            super.onProvideKeyboardShortcuts(list, hgVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        fe feVar = this.c;
        if (!feVar.u || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        Context context = feVar.k;
        gn gnVar = new gn(context, callback);
        gl glVar = feVar.q;
        if (glVar != null) {
            glVar.f();
        }
        ev evVar = new ev(feVar, gnVar);
        ef efVarB = feVar.b();
        if (efVarB != null) {
            feVar.q = efVarB.c(evVar);
        }
        if (feVar.q == null) {
            feVar.G();
            gl glVar2 = feVar.q;
            if (glVar2 != null) {
                glVar2.f();
            }
            if (feVar.r == null) {
                if (feVar.z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        pi piVar = new pi(context, 0);
                        piVar.getTheme().setTo(themeNewTheme);
                        context = piVar;
                    }
                    feVar.r = new ActionBarContextView(context);
                    feVar.s = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    feVar.s.setWindowLayoutType(2);
                    feVar.s.setContentView(feVar.r);
                    feVar.s.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    feVar.r.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    feVar.s.setHeight(-2);
                    feVar.t = new ag(feVar, 15, null);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) feVar.v.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(feVar.w());
                        feVar.r = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (feVar.r != null) {
                feVar.G();
                feVar.r.i();
                gm gmVar = new gm(feVar.r.getContext(), feVar.r, evVar);
                if (evVar.c(gmVar, gmVar.a)) {
                    gmVar.g();
                    feVar.r.h(gmVar);
                    feVar.q = gmVar;
                    if (feVar.O()) {
                        feVar.r.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        erb erbVarV = ebm.v(feVar.r);
                        erbVarV.u(1.0f);
                        feVar.J = erbVarV;
                        feVar.J.w(new et(feVar));
                    } else {
                        feVar.r.setAlpha(1.0f);
                        feVar.r.setVisibility(0);
                        if (feVar.r.getParent() instanceof View) {
                            View view = (View) feVar.r.getParent();
                            int[] iArr = ebm.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (feVar.s != null) {
                        feVar.l.getDecorView().post(feVar.t);
                    }
                } else {
                    feVar.q = null;
                }
            }
            feVar.J();
        }
        feVar.J();
        gl glVar3 = feVar.q;
        if (glVar3 != null) {
            return gnVar.e(glVar3);
        }
        return null;
    }

    @Override // defpackage.gu, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
