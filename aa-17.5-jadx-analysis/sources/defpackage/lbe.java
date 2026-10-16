package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;
import androidx.car.app.model.SearchTemplate;
import com.google.android.apps.auto.components.externalkeyboard.phone.PhoneKeyboardActivity;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.search.SearchView;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.feedback.FeedbackEditorActivity;

/* loaded from: classes2.dex */
public final class lbe implements TextWatcher {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lbe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.b;
        if (i == 1) {
            String string = editable.toString();
            hlf hlfVar = (hlf) this.a;
            hlfVar.i.t().p(((SearchTemplate) hlfVar.C()).getSearchCallbackDelegate(), string);
            return;
        }
        if (i != 2) {
            return;
        }
        ((qgm) this.a).k(editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        InputConnection inputConnection;
        int i4 = this.b;
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return;
            }
            if (i4 == 3) {
                ((wiu) this.a).a.a(charSequence.toString().trim());
                return;
            } else if (i4 != 4) {
                ((FeedbackEditorActivity) this.a).d.setEnabled(charSequence.length() > 0);
                return;
            } else {
                ((SearchView) this.a).l.setVisibility(charSequence.length() <= 0 ? 8 : 0);
                return;
            }
        }
        PhoneKeyboardActivity phoneKeyboardActivity = (PhoneKeyboardActivity) this.a;
        String string = phoneKeyboardActivity.r.getText().toString();
        if (phoneKeyboardActivity.t.k()) {
            if (string.isEmpty()) {
                phoneKeyboardActivity.p.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(phoneKeyboardActivity.getResources().getInteger(R.integer.keyboard_activity_background_text_fade_out_duration_ms)).start();
                phoneKeyboardActivity.q.animate().alpha(1.0f).setDuration(phoneKeyboardActivity.getResources().getInteger(R.integer.keyboard_activity_background_text_fade_in_duration_ms)).start();
            } else {
                phoneKeyboardActivity.p.animate().alpha(1.0f).setDuration(phoneKeyboardActivity.getResources().getInteger(R.integer.keyboard_activity_background_text_fade_in_duration_ms)).start();
                phoneKeyboardActivity.q.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(phoneKeyboardActivity.getResources().getInteger(R.integer.keyboard_activity_background_text_fade_out_duration_ms)).start();
            }
        }
        lbd lbdVar = phoneKeyboardActivity.u;
        if (lbdVar == null || string.equals(lbdVar.a())) {
            return;
        }
        lbd lbdVar2 = phoneKeyboardActivity.u;
        if (lbdVar2.c) {
            ((ype) ((ype) lbd.a.h()).ai((char) 3727)).u("setString called after being told to detach.");
        } else {
            xcv xcvVar = lbdVar2.d;
            if (xcvVar.a(lbdVar2.b) && (inputConnection = xcvVar.a.c) != null) {
                inputConnection.beginBatchEdit();
                inputConnection.setComposingRegion(0, Alert.DURATION_SHOW_INDEFINITELY);
                inputConnection.commitText(string, 1);
                inputConnection.endBatchEdit();
            }
        }
        if (phoneKeyboardActivity.o) {
            return;
        }
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.KEYBOARD_EXTERNAL, yzy.eH).l());
        phoneKeyboardActivity.o = true;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
