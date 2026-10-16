package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eyg;
import defpackage.eyh;
import defpackage.eyj;

/* loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private CharSequence c;
    private CharSequence d;
    private final eyj e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new eyj(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eyh.m, i, i2);
        o(dlz.r(typedArrayObtainStyledAttributes, 7, 0));
        l(dlz.r(typedArrayObtainStyledAttributes, 6, 1));
        this.c = dlz.r(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.d = dlz.r(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = dlz.s(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X(View view) throws Resources.NotFoundException {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.g(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.d();
            }
            switchCompat.f(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public void a(eyg eygVar) throws Resources.NotFoundException {
        super.a(eygVar);
        X(eygVar.E(R.id.switchWidget));
        W(eygVar);
    }

    @Override // androidx.preference.Preference
    public final void gO(View view) throws Resources.NotFoundException {
        C();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(R.id.switchWidget));
            V(view.findViewById(android.R.id.summary));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }
}
