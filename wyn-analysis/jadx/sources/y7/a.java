package Y7;

import U8.v0;
import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;

/* loaded from: classes4.dex */
public final class a extends AppCompatRadioButton {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f16710g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f16711e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16712f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16711e == null) {
            int I3 = v0.I(com.wynauto.wyn.R.attr.colorControlActivated, this);
            int I10 = v0.I(com.wynauto.wyn.R.attr.colorOnSurface, this);
            int I11 = v0.I(com.wynauto.wyn.R.attr.colorSurface, this);
            this.f16711e = new ColorStateList(f16710g, new int[]{v0.S(1.0f, I11, I3), v0.S(0.54f, I11, I10), v0.S(0.38f, I11, I10), v0.S(0.38f, I11, I10)});
        }
        return this.f16711e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16712f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f16712f = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
