package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* loaded from: classes3.dex */
final class wxe extends ArrayAdapter {
    final /* synthetic */ wxf a;
    private final ColorStateList b;
    private final ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxe(wxf wxfVar, Context context, int i, String[] strArr) {
        ColorStateList colorStateList;
        super(context, i, strArr);
        this.a = wxfVar;
        ColorStateList colorStateList2 = null;
        if (b()) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{wxfVar.f.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{dvd.d(wxfVar.f.getColorForState(iArr3, 0), wxfVar.e), dvd.d(wxfVar.f.getColorForState(iArr2, 0), wxfVar.e), wxfVar.e});
        }
        this.b = colorStateList2;
    }

    private final boolean a() {
        return this.a.e != 0;
    }

    private final boolean b() {
        return this.a.f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            wxf wxfVar = this.a;
            ColorDrawable colorDrawable = null;
            if (wxfVar.getText().toString().contentEquals(textView.getText()) && a()) {
                ColorDrawable colorDrawable2 = new ColorDrawable(wxfVar.e);
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    colorDrawable2.setTintList(this.b);
                    ?? rippleDrawable = new RippleDrawable(colorStateList, colorDrawable2, null);
                    FocusRingDrawable focusRingDrawableC = FocusRingDrawable.c(getContext(), rippleDrawable, null);
                    if (focusRingDrawableC != null) {
                        focusRingDrawableC.c.x = wxfVar.b;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
