package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eyg;

/* loaded from: classes2.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, dlz.l(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean Q() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        super.a(eygVar);
        eygVar.a.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.Q();
    }
}
