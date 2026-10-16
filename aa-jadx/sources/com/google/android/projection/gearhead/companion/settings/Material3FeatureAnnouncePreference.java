package com.google.android.projection.gearhead.companion.settings;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Material3FeatureAnnouncePreference extends androidx.preference.Preference {
    public android.content.SharedPreferences a;

    public Material3FeatureAnnouncePreference(android.content.Context context) {
        super(context);
        this.E = com.google.android.projection.gearhead.R.layout.feature_announce_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.eym eymVar) {
        super.a(eymVar);
        android.widget.ImageView imageView = (android.widget.ImageView) eymVar.E(com.google.android.projection.gearhead.R.id.feature_announce_icon);
        imageView.setImageResource(2131233012);
        imageView.setContentDescription(this.j.getString(com.google.android.projection.gearhead.R.string.vanagon_deprecation_icon_description));
        ((android.widget.TextView) eymVar.E(com.google.android.projection.gearhead.R.id.feature_announce_title)).setText(com.google.android.projection.gearhead.R.string.vanagon_deprecation_announcement);
        ((android.widget.Button) eymVar.E(com.google.android.projection.gearhead.R.id.feature_announce_accept)).setVisibility(8);
        ((android.widget.Button) eymVar.E(com.google.android.projection.gearhead.R.id.feature_announce_decline)).setVisibility(8);
    }

    public Material3FeatureAnnouncePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = com.google.android.projection.gearhead.R.layout.feature_announce_preference;
    }

    public Material3FeatureAnnouncePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = com.google.android.projection.gearhead.R.layout.feature_announce_preference;
    }

    public Material3FeatureAnnouncePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = com.google.android.projection.gearhead.R.layout.feature_announce_preference;
    }
}
