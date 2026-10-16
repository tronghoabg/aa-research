package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes3.dex */
public final class wmq extends fhh {
    final /* synthetic */ MaterialCheckBox b;

    public wmq(MaterialCheckBox materialCheckBox) {
        this.b = materialCheckBox;
    }

    @Override // defpackage.fhh
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.fhh
    public final void c(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.b;
        ColorStateList colorStateList = materialCheckBox.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.d, colorStateList.getDefaultColor()));
        }
    }
}
