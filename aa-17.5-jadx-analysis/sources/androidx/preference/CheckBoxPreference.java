package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eyg;
import defpackage.eyh;
import defpackage.eyj;

/* loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final eyj c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iL = dlz.l(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iL, 0);
        this.c = new eyj(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eyh.b, iL, 0);
        o(dlz.r(typedArrayObtainStyledAttributes, 5, 0));
        l(dlz.r(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = dlz.s(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        super.a(eygVar);
        X(eygVar.E(android.R.id.checkbox));
        W(eygVar);
    }

    @Override // androidx.preference.Preference
    public final void gO(View view) {
        C();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(android.R.id.checkbox));
            V(view.findViewById(android.R.id.summary));
        }
    }
}
