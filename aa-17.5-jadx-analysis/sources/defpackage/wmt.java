package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public final class wmt extends wtf {
    final /* synthetic */ Chip a;

    public wmt(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.wtf
    public final void b(Typeface typeface, boolean z) {
        Chip chip = this.a;
        wmx wmxVar = chip.c;
        chip.setText(wmxVar.n ? wmxVar.d : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }

    @Override // defpackage.wtf
    public final void a(int i) {
    }
}
