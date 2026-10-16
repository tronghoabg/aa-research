package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wsb extends wrp {
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;

    public wsb(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayA = wqr.a(context, attributeSet, wsw.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.q = typedArrayA.getInt(0, 0);
        int iF = wub.f(context, typedArrayA, 4, dimensionPixelSize);
        int i = this.a;
        this.r = Math.max(iF, i + i);
        this.s = wub.f(context, typedArrayA, 3, dimensionPixelSize2);
        this.t = typedArrayA.getInt(2, 0);
        this.u = typedArrayA.getBoolean(1, true);
        typedArrayA.recycle();
        b();
    }
}
