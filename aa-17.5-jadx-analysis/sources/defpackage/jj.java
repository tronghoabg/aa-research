package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class jj extends RadioButton {
    private final ja a;
    private final iw b;
    private final jw c;
    private bii d;

    public jj(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.radioButtonStyle);
        nb.d(this, getContext());
        ja jaVar = new ja(this);
        this.a = jaVar;
        jaVar.b(attributeSet, R.attr.radioButtonStyle);
        iw iwVar = new iw(this);
        this.b = iwVar;
        iwVar.b(attributeSet, R.attr.radioButtonStyle);
        jw jwVar = new jw(this);
        this.c = jwVar;
        jwVar.c(attributeSet, R.attr.radioButtonStyle);
        a().I(attributeSet, R.attr.radioButtonStyle);
    }

    private final bii a() {
        bii biiVar = this.d;
        if (biiVar != null) {
            return biiVar;
        }
        bii biiVar2 = new bii((TextView) this);
        this.d = biiVar2;
        return biiVar2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        iw iwVar = this.b;
        if (iwVar != null) {
            iwVar.a();
        }
        jw jwVar = this.c;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        emr emrVar = emr.b;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        iw iwVar = this.b;
        if (iwVar != null) {
            iwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        iw iwVar = this.b;
        if (iwVar != null) {
            iwVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(ca.e(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.c;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.c;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        emr emrVar = emr.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ja jaVar = this.a;
        if (jaVar != null) {
            jaVar.c();
        }
    }
}
