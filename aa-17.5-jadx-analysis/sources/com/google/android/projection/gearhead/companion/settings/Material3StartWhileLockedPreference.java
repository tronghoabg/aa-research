package com.google.android.projection.gearhead.companion.settings;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.preference.SwitchPreferenceCompat;
import defpackage.acli;
import defpackage.eyg;

/* loaded from: classes3.dex */
public class Material3StartWhileLockedPreference extends SwitchPreferenceCompat {
    boolean c;

    public Material3StartWhileLockedPreference(Context context) {
        super(context);
        this.c = false;
    }

    public final void X(String str, String str2, ClickableSpan clickableSpan) {
        if (!str.contains(str2)) {
            throw new IllegalArgumentException(String.format("Invalid preference summary. String \"%s\" doesn't contain string \"%s\"", str, str2));
        }
        this.c = true;
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(clickableSpan, iIndexOf, length, 33);
        super.n(spannableString);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void a(eyg eygVar) throws Resources.NotFoundException {
        TextView textView;
        super.a(eygVar);
        if (!acli.e() || (textView = (TextView) eygVar.E(R.id.summary)) == null) {
            return;
        }
        textView.setMovementMethod(this.c ? LinkMovementMethod.getInstance() : null);
        textView.setHighlightColor(0);
        if (this.c) {
            textView.setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
        }
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void c() {
        if (acli.e() && this.c) {
            return;
        }
        super.c();
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        this.c = false;
        super.n(charSequence);
    }

    public Material3StartWhileLockedPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
    }

    public Material3StartWhileLockedPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
    }

    public Material3StartWhileLockedPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = false;
    }
}
