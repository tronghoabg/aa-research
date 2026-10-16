package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xdj extends xds {
    public xdj(Context context, InputConnection inputConnection, EditorInfo editorInfo, ProjectionKeyboardLayout projectionKeyboardLayout, ykd ykdVar, Locale locale, boolean z, boolean z2, boolean z3, Bundle bundle) {
        super(context, inputConnection, editorInfo, projectionKeyboardLayout, ykdVar, locale, z, z2, z3, false, 2, bundle, "projection_keyboard_layout");
        ykdVar.c(true);
        projectionKeyboardLayout.getRootView().findViewById(R.id.use_phone_keyboard_overlay).setVisibility(0);
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            xdo xdoVar = (xdo) childAt.getTag();
            if (!xdoVar.e() && !xdoVar.d() && !xdoVar.c()) {
                childAt.setFocusable(false);
                childAt.setEnabled(false);
                childAt.setAlpha(0.125f);
            }
        }
    }

    @Override // defpackage.xds
    protected final boolean c(int i) {
        if (i == -2) {
            this.d.getRootView().findViewById(R.id.use_phone_keyboard_overlay).setVisibility(8);
            i = -2;
        }
        return super.c(i);
    }

    @Override // defpackage.xds
    public final void d(boolean z) {
        super.d(z);
        this.d.getRootView().findViewById(R.id.use_phone_keyboard_overlay).setVisibility(true != z ? 8 : 0);
    }
}
