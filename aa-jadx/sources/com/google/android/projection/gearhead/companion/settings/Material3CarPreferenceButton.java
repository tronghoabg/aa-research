package com.google.android.projection.gearhead.companion.settings;

/* JADX INFO: loaded from: classes3.dex */
public class Material3CarPreferenceButton extends androidx.preference.Preference {
    public android.view.View.OnClickListener a;
    private java.lang.String b;

    public Material3CarPreferenceButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = com.google.android.projection.gearhead.R.layout.material3_preference_list_button;
        this.b = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.wzd.a, i, i2).getString(0);
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.eym eymVar) {
        super.a(eymVar);
        android.widget.TextView textView = (android.widget.TextView) eymVar.E(com.google.android.projection.gearhead.R.id.preference_button);
        if (textView != null) {
            textView.setOnClickListener(this.a);
            if (android.text.TextUtils.isEmpty(this.b)) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.b);
                textView.setVisibility(0);
            }
        }
    }

    public Material3CarPreferenceButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Material3CarPreferenceButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Material3CarPreferenceButton(android.content.Context context) {
        this(context, null);
    }
}
