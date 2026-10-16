package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eya;
import defpackage.eyh;

/* loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eyh.c, i, 0);
        String strR = dlz.r(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strR;
        if (strR == null) {
            this.a = this.q;
        }
        this.b = dlz.r(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = dlz.r(typedArrayObtainStyledAttributes, 11, 3);
        this.e = dlz.r(typedArrayObtainStyledAttributes, 10, 4);
        this.f = dlz.n(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void c() {
        eya eyaVar = this.k.d;
        if (eyaVar != null) {
            eyaVar.f(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dlz.l(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
