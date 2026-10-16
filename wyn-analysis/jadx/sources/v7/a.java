package V7;

import A6.h;
import U8.v0;
import android.content.Context;
import com.wynauto.wyn.R;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f13160f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13164d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13165e;

    public a(Context context) {
        boolean zK = h.K(context, R.attr.elevationOverlayEnabled, false);
        int iJ = v0.J(context, R.attr.elevationOverlayColor, 0);
        int iJ2 = v0.J(context, R.attr.elevationOverlayAccentColor, 0);
        int iJ3 = v0.J(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f13161a = zK;
        this.f13162b = iJ;
        this.f13163c = iJ2;
        this.f13164d = iJ3;
        this.f13165e = f10;
    }
}
