package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.HwrView;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;

/* loaded from: classes3.dex */
public final class xdi extends xcs {
    private final ConstraintLayout o;

    public xdi(Context context, InputConnection inputConnection, RotaryKeyboardLayout rotaryKeyboardLayout, HwrView hwrView, Size size, EditorInfo editorInfo, ajmd ajmdVar, boolean z) {
        ConstraintLayout constraintLayout;
        super(context, inputConnection, rotaryKeyboardLayout, hwrView, size, editorInfo, ajmdVar, z, false);
        if (ldz.a().b()) {
            constraintLayout = (ConstraintLayout) rotaryKeyboardLayout.getParent().getParent();
            this.o = constraintLayout;
        } else {
            constraintLayout = (ConstraintLayout) rotaryKeyboardLayout.getParent();
            this.o = constraintLayout;
        }
        drx drxVar = new drx();
        drxVar.e(constraintLayout);
        drxVar.g(R.id.use_phone_keyboard_label, 1, 0, 1);
        fgm fgmVar = new fgm(null);
        fgmVar.R(context.getResources().getInteger(R.integer.limited_rotary_keyboard_duration_ms));
        fgh.b(constraintLayout, fgmVar);
        drxVar.c(constraintLayout);
        constraintLayout.findViewById(R.id.use_phone_keyboard_label).setVisibility(0);
    }

    @Override // defpackage.xcs
    protected final xdy c() {
        return d(this.b, "rotary_limited_keyboard_layout", this.g, this.f);
    }

    @Override // defpackage.xcs
    public final void f(int i, boolean z) {
        if (i == -2) {
            ConstraintLayout constraintLayout = this.o;
            constraintLayout.findViewById(R.id.use_phone_keyboard_label).setVisibility(4);
            drx drxVar = new drx();
            drxVar.e(constraintLayout);
            drxVar.g(R.id.use_phone_keyboard_label, 1, 0, 2);
            fgm fgmVar = new fgm(null);
            fgmVar.R(this.b.getResources().getInteger(R.integer.limited_rotary_keyboard_duration_ms));
            fgh.b(constraintLayout, fgmVar);
            drxVar.c(constraintLayout);
            i = -2;
        }
        super.f(i, z);
    }

    @Override // defpackage.xcs
    public final boolean i() {
        return true;
    }
}
