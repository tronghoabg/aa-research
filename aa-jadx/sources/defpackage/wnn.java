package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wnn extends defpackage.fhn {
    final /* synthetic */ com.google.android.material.checkbox.MaterialCheckBox b;

    public wnn(com.google.android.material.checkbox.MaterialCheckBox materialCheckBox) {
        this.b = materialCheckBox;
    }

    @Override // defpackage.fhn
    public final void b(android.graphics.drawable.Drawable drawable) {
        android.content.res.ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.fhn
    public final void c(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.checkbox.MaterialCheckBox materialCheckBox = this.b;
        android.content.res.ColorStateList colorStateList = materialCheckBox.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.d, colorStateList.getDefaultColor()));
        }
    }
}
