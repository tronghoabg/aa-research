package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.HwrView;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class xcs {
    public static final yph a = yph.c("GH.CarRotaryKeyboard");
    protected final Context b;
    public final InputConnection c;
    protected final RotaryKeyboardLayout d;
    protected final xdy e;
    protected final EditorInfo f;
    protected final boolean g;
    public final HwrView h;
    final int i;
    boolean j;
    final View.OnKeyListener k;
    final ykd l;
    final ykd m;
    public final ajmd n;

    public xcs(Context context, InputConnection inputConnection, RotaryKeyboardLayout rotaryKeyboardLayout, HwrView hwrView, Size size, EditorInfo editorInfo, ajmd ajmdVar, boolean z, boolean z2) {
        jzs jzsVar = new jzs(this, 5, null);
        this.k = jzsVar;
        ykd ykdVar = new ykd(this, null);
        this.m = ykdVar;
        ykd ykdVar2 = new ykd(this, null);
        this.l = ykdVar2;
        this.b = context;
        this.c = inputConnection;
        this.d = rotaryKeyboardLayout;
        this.h = hwrView;
        this.f = editorInfo;
        this.n = ajmdVar;
        this.g = z;
        rotaryKeyboardLayout.x = ykdVar;
        rotaryKeyboardLayout.setOnKeyListener(jzsVar);
        rotaryKeyboardLayout.u = hwrView;
        int width = size.getWidth();
        int height = size.getHeight();
        hwrView.e = width;
        hwrView.f = height;
        hwrView.a.setWritingGuide(width, height);
        hwrView.c.setWritingAreaSize(hwrView.e, hwrView.f);
        hwrView.m = ykdVar2;
        hwrView.setOnKeyListener(jzsVar);
        hwrView.b();
        xdy xdyVarC = c();
        this.e = xdyVarC;
        rotaryKeyboardLayout.e((xdx) new ntn(xdyVarC.c).h(new vdv(xdyVarC, 16)), z2);
        if (z) {
            hwrView.setVisibility(8);
            hwrView.j = true;
            rotaryKeyboardLayout.q = true;
            rotaryKeyboardLayout.w = new mok(new ykd(rotaryKeyboardLayout, null), rotaryKeyboardLayout.t);
        }
        this.i = context.getResources().getInteger(R.integer.keycode_handwriting);
        this.j = false;
        if (i()) {
            ajmdVar.c(true);
        }
    }

    public static xdy d(Context context, String str, boolean z, EditorInfo editorInfo) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale = configuration.locale;
        configuration.locale = lgp.a().d();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        xdy xdyVar = new xdy(context, resources.getIdentifier(str, "xml", context.getPackageName()), z, editorInfo);
        configuration.locale = locale;
        return xdyVar;
    }

    protected int a(List list) {
        String lowerCase = ((String) ((Pair) list.get(0)).second).toLowerCase(lgp.a().d());
        this.c.commitText(lowerCase, 1);
        this.n.e();
        return lowerCase.length();
    }

    public final xdw b() {
        return this.e.d;
    }

    protected abstract xdy c();

    public void f(int i, boolean z) {
        if (i == -8) {
            xdw xdwVar = this.e.d;
            if (z) {
                this.d.f();
            }
            this.n.c(xdwVar.c());
            return;
        }
        if (i == -2) {
            ajmd ajmdVar = this.n;
            lgp.a().e();
            ((xdv) ajmdVar.a).g(true);
            return;
        }
        if (i == -5) {
            if (z) {
                this.d.f();
            }
            this.c.deleteSurroundingText(1, 0);
            this.n.e();
            return;
        }
        if (i == -4) {
            this.c.performEditorAction(this.f.imeOptions & 255);
            ebf.j().o(((xdv) this.n.a).f(), yzy.eB);
            return;
        }
        if (z) {
            this.d.f();
        }
        if (i == this.i) {
            this.j = true;
            HwrView hwrView = this.h;
            hwrView.setVisibility(0);
            hwrView.requestFocus();
            return;
        }
        InputConnection inputConnection = this.c;
        String strValueOf = String.valueOf((char) i);
        inputConnection.commitText(strValueOf, 1);
        this.n.e();
        this.d.d();
        ((ype) a.l().ai((char) 10114)).y("Committing text: %s", strValueOf);
    }

    public void g() {
        ebf.j().o(((xdv) this.n.a).f(), yzy.eD);
    }

    public void h() {
        this.n.d();
    }

    public boolean i() {
        return false;
    }

    public boolean j(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1) {
            return false;
        }
        if (i != 2) {
            if (i == 4 || i == 19 || i == 20) {
                if (this.j) {
                    this.j = false;
                    this.h.setVisibility(8);
                }
                this.n.d();
            }
            return false;
        }
        xqb xqbVar = ((xdv) this.n.a).h;
        yph yphVar = xbs.a;
        Bundle bundle = new Bundle();
        bundle.putInt("open_cause", 3);
        bundle.putInt("open_cause_key_code", 2);
        try {
            xqbVar.b(bundle);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) xbs.a.f()).p(e)).ai((char) 10048)).u("failed to open demand space");
        }
        return true;
    }

    public boolean k() {
        return true;
    }

    public void e(int i, int i2) {
    }
}
