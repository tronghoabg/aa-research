package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class wlw implements edr {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public wlw(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.edr
    public final boolean a(View view) {
        this.b.U(this.a);
        return true;
    }
}
