package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.ToggleButton;

/* loaded from: classes2.dex */
public final class kc extends ToggleButton {
    private final iw a;
    private final jw b;
    private bii c;

    public kc(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        nb.d(this, getContext());
        iw iwVar = new iw(this);
        this.a = iwVar;
        iwVar.b(attributeSet, R.attr.buttonStyleToggle);
        jw jwVar = new jw(this);
        this.b = jwVar;
        jwVar.c(attributeSet, R.attr.buttonStyleToggle);
        a().I(attributeSet, R.attr.buttonStyleToggle);
    }

    private final bii a() {
        bii biiVar = this.c;
        if (biiVar != null) {
            return biiVar;
        }
        bii biiVar2 = new bii((TextView) this);
        this.c = biiVar2;
        return biiVar2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.a();
        }
        jw jwVar = this.b;
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

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.b;
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
}
