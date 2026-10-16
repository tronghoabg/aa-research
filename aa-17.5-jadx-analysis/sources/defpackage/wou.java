package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wou extends em {
    private final Drawable b;
    private final Rect c;

    /* JADX WARN: Illegal instructions before constructor call */
    public wou(Context context, int i) {
        int iC = C(context);
        Context contextA = wxp.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        super(iC != 0 ? new pi(contextA, iC) : contextA, i == 0 ? C(context) : i);
        Context contextA2 = a();
        Resources.Theme theme = contextA2.getTheme();
        int[] iArr = wov.a;
        TypedArray typedArrayA = wqr.a(contextA2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(3, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(1, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(0, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayA.recycle();
        int layoutDirection = contextA2.getResources().getConfiguration().getLayoutDirection();
        this.c = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iS = woy.s(contextA2, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = contextA2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes.getColor(4, iS);
        typedArrayObtainStyledAttributes.recycle();
        wue wueVar = new wue(contextA2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        wueVar.K(contextA2);
        wueVar.O(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= BitmapDescriptorFactory.HUE_RED) {
            wueVar.d(wueVar.p.a.c(dimension));
        }
        this.b = wueVar;
    }

    private static int C(Context context) {
        TypedValue typedValueW = woy.w(context, R.attr.materialAlertDialogTheme);
        if (typedValueW == null) {
            return 0;
        }
        return typedValueW.data;
    }

    public final void A(int i) {
        super.n(i);
    }

    public final void B(CharSequence charSequence) {
        super.o(charSequence);
    }

    @Override // defpackage.em
    public final en b() {
        en enVarB = super.b();
        Window window = enVarB.getWindow();
        View decorView = window.getDecorView();
        float elevation = decorView.getElevation();
        Drawable drawable = this.b;
        ((wue) drawable).N(elevation);
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new wot(enVarB, rect));
        return enVarB;
    }

    public final void q(ListAdapter listAdapter) {
        super.c(listAdapter, null);
    }

    public final void r(View view) {
        super.e(view);
    }

    public final void s(boolean z) {
        super.d(z);
    }

    public final void t(Drawable drawable) {
        super.f(drawable);
    }

    public final void u(int i) {
        super.g(i);
    }

    public final void v(CharSequence charSequence) {
        super.h(charSequence);
    }

    public final void w(int i, DialogInterface.OnClickListener onClickListener) {
        super.i(i, onClickListener);
    }

    public final void x(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.j(charSequence, onClickListener);
    }

    public final void y(int i, DialogInterface.OnClickListener onClickListener) {
        super.k(i, onClickListener);
    }

    public final void z(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.l(charSequence, onClickListener);
    }
}
