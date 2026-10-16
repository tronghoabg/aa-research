package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.AddAssistantShortcutActivity;

/* loaded from: classes3.dex */
public final class wzw implements TextWatcher {
    final /* synthetic */ mrk a;
    final /* synthetic */ TextView b;
    final /* synthetic */ ImageView c;
    final /* synthetic */ AddAssistantShortcutActivity d;

    public wzw(AddAssistantShortcutActivity addAssistantShortcutActivity, mrk mrkVar, TextView textView, ImageView imageView) {
        this.a = mrkVar;
        this.b = textView;
        this.c = imageView;
        this.d = addAssistantShortcutActivity;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string = TextUtils.isEmpty(charSequence) ? this.d.getString(R.string.settings_customize_add_assistant_shortcut_label_placeholder) : charSequence.toString();
        this.a.a = string;
        this.b.setText(string);
        this.c.invalidate();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
