package com.google.android.projection.gearhead.companion.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;
import defpackage.eyg;
import defpackage.wyh;

/* loaded from: classes3.dex */
public class Material3CarPreferenceButton extends Preference {
    public View.OnClickListener a;
    private String b;

    public Material3CarPreferenceButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = R.layout.material3_preference_list_button;
        this.b = context.getTheme().obtainStyledAttributes(attributeSet, wyh.a, i, i2).getString(0);
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        super.a(eygVar);
        TextView textView = (TextView) eygVar.E(R.id.preference_button);
        if (textView != null) {
            textView.setOnClickListener(this.a);
            if (TextUtils.isEmpty(this.b)) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.b);
                textView.setVisibility(0);
            }
        }
    }

    public Material3CarPreferenceButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Material3CarPreferenceButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Material3CarPreferenceButton(Context context) {
        this(context, null);
    }
}
