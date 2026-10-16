package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.projection.gearhead.input.HwrView;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;
import java.util.List;

/* loaded from: classes3.dex */
public final class xdg extends xcs {
    private final xee o;

    public xdg(Context context, InputConnection inputConnection, RotaryKeyboardLayout rotaryKeyboardLayout, HwrView hwrView, Size size, EditorInfo editorInfo, ajmd ajmdVar, boolean z, boolean z2) {
        super(context, inputConnection, rotaryKeyboardLayout, hwrView, size, editorInfo, ajmdVar, z, z2);
        this.o = new xee();
    }

    @Override // defpackage.xcs
    protected final int a(List list) {
        wpq.B(this.c, this.o);
        return super.a(list);
    }

    @Override // defpackage.xcs
    protected final xdy c() {
        return d(this.b, "rotary_keyboard_layout", this.g, this.f);
    }

    @Override // defpackage.xcs
    public final void f(int i, boolean z) {
        if (i == -5) {
            xee xeeVar = this.o;
            if (!xeeVar.h()) {
                this.c.setComposingText(xeeVar.d(), 0);
                return;
            }
            i = -5;
        }
        if (!wpq.D(i)) {
            if (i != -1) {
                wpq.B(this.c, this.o);
            }
            super.f(i, z);
        } else {
            if (z) {
                this.d.f();
            }
            wpq.C(this.c, this.o, i, false, false);
            this.d.d();
        }
    }

    @Override // defpackage.xcs
    public final void g() {
        wpq.B(this.c, this.o);
        super.g();
    }

    @Override // defpackage.xcs
    public final void h() {
        wpq.B(this.c, this.o);
        super.h();
    }

    @Override // defpackage.xcs
    public final boolean j(int i, KeyEvent keyEvent) {
        if (!wpq.D(i) && i != 23) {
            wpq.B(this.c, this.o);
        }
        return super.j(i, keyEvent);
    }
}
