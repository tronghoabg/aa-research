package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eyg;
import defpackage.eyh;
import defpackage.eyj;

/* loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {
    private final eyj c;
    private final CharSequence d;
    private final CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iL = dlz.l(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iL, 0);
        this.c = new eyj(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eyh.l, iL, 0);
        o(dlz.r(typedArrayObtainStyledAttributes, 7, 0));
        l(dlz.r(typedArrayObtainStyledAttributes, 6, 1));
        this.d = dlz.r(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = dlz.r(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = dlz.s(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        super.a(eygVar);
        X(eygVar.E(android.R.id.switch_widget));
        W(eygVar);
    }

    @Override // androidx.preference.Preference
    public final void gO(View view) {
        C();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(android.R.id.switch_widget));
            V(view.findViewById(android.R.id.summary));
        }
    }
}
