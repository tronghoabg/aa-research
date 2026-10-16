package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class qgg implements qgd {
    public static final yph a = yph.c("ADU.InputController");
    public final qfs b;
    public final qgf c;
    public final qgx d;
    public boolean e;
    public boolean f;
    private final qfi g;
    private final qgp h;
    private final lay i;
    private final lzc j;

    public qgg(qfi qfiVar, qfs qfsVar, qgf qgfVar, qgp qgpVar, qgx qgxVar, lay layVar, View view, View view2, View view3, lzc lzcVar) {
        this.g = qfiVar;
        this.b = qfsVar;
        this.c = qgfVar;
        this.h = qgpVar;
        this.d = qgxVar;
        this.i = layVar;
        this.j = lzcVar;
        qfiVar.d(this);
        view3.setOnClickListener(new jmq(this, qgfVar, 18, null));
        onh onhVar = new onh(this, 6);
        view.setOnClickListener(onhVar);
        view2.setOnClickListener(onhVar);
    }

    @Override // defpackage.qgd
    public final void a(Bundle bundle) {
        this.e = bundle.getBoolean("status_bar_buttons_focusable", false);
        this.f = bundle.getBoolean("rotary_nudge_focus_menu", false);
    }

    public final boolean b(boolean z) {
        qgx qgxVar = this.d;
        if (z) {
            if (!qgxVar.t()) {
                return d();
            }
            qgxVar.g();
            return true;
        }
        if (qgxVar.t() && !qgxVar.s() && qgxVar.v()) {
            return true;
        }
        qgp qgpVar = this.h;
        if (qgpVar.v() && !qgpVar.x()) {
            return qgpVar.y();
        }
        return false;
    }

    public final boolean c(boolean z) {
        qgf qgfVar = this.c;
        if (qgfVar.j() && !this.h.x()) {
            qgfVar.e();
            return true;
        }
        if (z) {
            this.b.a(null);
            return true;
        }
        qgx qgxVar = this.d;
        if (qgxVar.t() && qgxVar.s() && qgxVar.w()) {
            return true;
        }
        if (this.h.x()) {
            return qgfVar.j() ? qgfVar.a.requestFocus(66) : this.g.e();
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final boolean d() {
        qgp qgpVar = this.h;
        if (!qgpVar.v()) {
            return false;
        }
        lay layVar = this.i;
        if (layVar.d()) {
            layVar.a();
            layVar.g(0);
            return true;
        }
        qgf qgfVar = this.c;
        if (!qgfVar.j()) {
            qgfVar.f();
        } else if (!qgpVar.u() || (qgfVar.j() && this.j.c == lzb.a)) {
            qgfVar.e();
        } else {
            qgpVar.n();
        }
        return true;
    }
}
