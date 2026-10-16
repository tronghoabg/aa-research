package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eyg;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0012"}, d2 = {"Lcom/android/settingslib/widget/SpacePreference;", "Landroidx/preference/Preference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mHeight", "setHeight", "", "height", "onBindViewHolder", "view", "Landroidx/preference/PreferenceViewHolder;", "third_party.java_src.android_libs.settingslib.settingstheme_settingstheme"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpacePreference extends Preference {
    private final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public SpacePreference(Context context, AttributeSet attributeSet) {
        context.getClass();
        int iL = dlz.l(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle);
        super(context, attributeSet, iL, 0);
        this.E = R.layout.space_preference;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height}, iL, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        eygVar.getClass();
        super.a(eygVar);
        eygVar.v = false;
        eygVar.u = false;
        eygVar.a.setLayoutParams(new ViewGroup.LayoutParams(-1, this.a));
    }
}
