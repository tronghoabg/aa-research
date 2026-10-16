package f8;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import b1.AbstractC1492a;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public final class s extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f35215a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f35216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f35217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i5, String[] strArr) {
        super(context, i5, strArr);
        this.f35217c = tVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        t tVar = this.f35217c;
        ColorStateList colorStateList2 = tVar.k;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f35216b = colorStateList;
        if (tVar.f35223j != 0 && tVar.k != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC1492a.b(tVar.k.getColorForState(iArr3, 0), tVar.f35223j), AbstractC1492a.b(tVar.k.getColorForState(iArr2, 0), tVar.f35223j), tVar.f35223j});
        }
        this.f35215a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i5, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f35217c;
            Drawable rippleDrawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText()) && tVar.f35223j != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(tVar.f35223j);
                if (this.f35216b != null) {
                    colorDrawable.setTintList(this.f35215a);
                    rippleDrawable = new RippleDrawable(this.f35216b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = S.f38779a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
