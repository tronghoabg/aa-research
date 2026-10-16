package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class wmv extends eek {
    final /* synthetic */ Chip e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmv(Chip chip, Chip chip2) {
        super(chip2);
        this.e = chip;
    }

    @Override // defpackage.eek
    protected final int j(float f, float f2) {
        Chip chip = this.e;
        return (chip.f() && chip.b().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.eek
    protected final void l(List list) {
        list.add(0);
        this.e.f();
    }

    @Override // defpackage.eek
    protected final void o(edg edgVar) {
        Chip chip = this.e;
        edgVar.p(chip.g());
        edgVar.s(chip.isClickable());
        edgVar.r(chip.getAccessibilityClassName());
        edgVar.Q(chip.getText());
    }

    @Override // defpackage.eek
    protected final void p(int i, edg edgVar) {
        if (i != 1) {
            edgVar.v("");
            edgVar.n(Chip.b);
            return;
        }
        Chip chip = this.e;
        CharSequence text = chip.getText();
        edgVar.v(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, true != TextUtils.isEmpty(text) ? text : "").trim());
        RectF rectFB = chip.b();
        int i2 = (int) rectFB.left;
        int i3 = (int) rectFB.top;
        int i4 = (int) rectFB.right;
        int i5 = (int) rectFB.bottom;
        Rect rect = chip.f;
        rect.set(i2, i3, i4, i5);
        edgVar.n(rect);
        edgVar.h(edf.c);
        edgVar.x(chip.isEnabled());
        edgVar.r(Button.class.getName());
    }

    @Override // defpackage.eek
    protected final void q(int i, boolean z) {
        if (i == 1) {
            this.e.e = z;
        }
        Chip chip = this.e;
        wmx wmxVar = chip.c;
        boolean z2 = chip.e;
        if (wmxVar.f != null) {
            if (wmxVar.s(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : wmx.a)) {
                chip.refreshDrawableState();
            }
        }
    }

    @Override // defpackage.eek
    public final boolean u(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.e.performClick();
            }
            if (i == 1) {
                this.e.playSoundEffect(0);
            }
        }
        return false;
    }
}
