package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b3.AbstractC1504b;
import com.wynauto.wyn.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: h, reason: collision with root package name */
    public final int f18749h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18750i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1504b.f19293i, R.attr.seekBarPreferenceStyle, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i10 = i10 < i5 ? i5 : i10;
        if (i10 != this.f18749h) {
            this.f18749h = i10;
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i11 != this.f18750i) {
            this.f18750i = Math.min(this.f18749h - i5, Math.abs(i11));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i5) {
        return Integer.valueOf(typedArray.getInt(i5, 0));
    }
}
