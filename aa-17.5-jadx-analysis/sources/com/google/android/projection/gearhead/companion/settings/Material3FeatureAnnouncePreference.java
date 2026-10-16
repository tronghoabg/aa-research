package com.google.android.projection.gearhead.companion.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;
import defpackage.eyg;

/* loaded from: classes3.dex */
public abstract class Material3FeatureAnnouncePreference extends Preference {
    public SharedPreferences a;

    public Material3FeatureAnnouncePreference(Context context) {
        super(context);
        this.E = R.layout.feature_announce_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        super.a(eygVar);
        ImageView imageView = (ImageView) eygVar.E(R.id.feature_announce_icon);
        imageView.setImageResource(2131233012);
        imageView.setContentDescription(this.j.getString(R.string.vanagon_deprecation_icon_description));
        ((TextView) eygVar.E(R.id.feature_announce_title)).setText(R.string.vanagon_deprecation_announcement);
        ((Button) eygVar.E(R.id.feature_announce_accept)).setVisibility(8);
        ((Button) eygVar.E(R.id.feature_announce_decline)).setVisibility(8);
    }

    public Material3FeatureAnnouncePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = R.layout.feature_announce_preference;
    }

    public Material3FeatureAnnouncePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = R.layout.feature_announce_preference;
    }

    public Material3FeatureAnnouncePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = R.layout.feature_announce_preference;
    }
}
