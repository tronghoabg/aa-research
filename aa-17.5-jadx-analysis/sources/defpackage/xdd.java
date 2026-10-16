package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xdd extends xds {
    private final int i;
    private final int j;
    private final int k;

    public xdd(Context context, InputConnection inputConnection, EditorInfo editorInfo, ProjectionKeyboardLayout projectionKeyboardLayout, ykd ykdVar, Locale locale, boolean z, boolean z2, boolean z3, Bundle bundle) {
        super(context, inputConnection, editorInfo, projectionKeyboardLayout, ykdVar, locale, z, z2, z3, true, 1, bundle, "projection_keyboard_layout");
        this.i = context.getResources().getInteger(R.integer.keycode_keyboard_main_switch);
        this.j = context.getResources().getInteger(R.integer.keycode_keyboard_digit_switch);
        this.k = context.getResources().getInteger(R.integer.keycode_keyboard_letter_switch);
    }

    @Override // defpackage.xds
    protected final String a(Bundle bundle) {
        return bundle != null ? bundle.getString("JapanesePrKeyboardManager_CurrentLayout") : this.g;
    }

    @Override // defpackage.xds
    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle.putString("JapanesePrKeyboardManager_CurrentLayout", a(null));
    }

    @Override // defpackage.xds
    protected final boolean c(int i) throws Resources.NotFoundException {
        if (i == this.i) {
            h("projection_keyboard_layout");
            return false;
        }
        if (i == this.j) {
            h("projection_keyboard_layout_num");
            return false;
        }
        if (i != this.k) {
            return super.c(i);
        }
        h("projection_keyboard_layout_alpha");
        return false;
    }
}
