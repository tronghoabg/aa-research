package androidx.preference;

import a1.AbstractC1312b;
import a2.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b3.AbstractC1504b;
import com.wynauto.wyn.R;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iB = AbstractC1312b.b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iB);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1504b.f19287c, iB, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (k.f17188a == null) {
                k.f17188a = new k();
            }
            this.f18748g = k.f17188a;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i5) {
        return typedArray.getString(i5);
    }
}
