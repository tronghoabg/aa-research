package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class obw implements ocx {
    public static final /* synthetic */ int b = 0;
    private static final LinearInterpolator c = new LinearInterpolator();
    public eqn a;
    private final Interpolator d = mcd.D(new obx(new obz(0.5f), new DecelerateInterpolator(), 1.0f).a(0.5f).a());
    private final Interpolator e = mcd.D(new obx(new obz(BitmapDescriptorFactory.HUE_RED).a().a(0.25f), new AccelerateDecelerateInterpolator(), 1.0f).a(0.75f).a());
    private final Interpolator f;
    private final Interpolator g;

    public obw() {
        obz obzVar = new obz(BitmapDescriptorFactory.HUE_RED);
        LinearInterpolator linearInterpolator = c;
        this.f = mcd.D(new obx(obzVar, linearInterpolator, 1.0f).a(0.25f).a());
        this.g = mcd.D(new obx(new obz(BitmapDescriptorFactory.HUE_RED).a().a(0.5f), linearInterpolator, 1.0f));
    }

    @Override // defpackage.ocx
    public final int a(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelOffset(R.dimen.gearhead_tooltip_bubble_external_padding) + (resources.getDimensionPixelSize(R.dimen.gearhead_tooltip_arrow_base_width) / 2) + resources.getDimensionPixelOffset(R.dimen.gearhead_tooltip_arrow_margin);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    @Override // defpackage.ocx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View b(android.content.Context r24, defpackage.ocs r25, int r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obw.b(android.content.Context, ocs, int):android.view.View");
    }

    protected abstract View c(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams);

    @Override // defpackage.ocx
    public final void d(View view, float f) {
        int iCenterY;
        int iCenterX;
        kzt kztVar = (kzt) view.getTag();
        kztVar.getClass();
        Object obj = kztVar.b;
        float interpolation = this.d.getInterpolation(f);
        View view2 = (View) obj;
        Rect rect = (Rect) view2.getTag();
        if (rect == null) {
            rect = new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            view2.setTag(rect);
        }
        Object obj2 = kztVar.d;
        int i = ((FrameLayout.LayoutParams) view2.getLayoutParams()).gravity;
        int iA = a(view2.getContext());
        int i2 = i & 112;
        if (i2 == 48) {
            iCenterY = rect.top + (true != ((ocs) obj2).e ? iA : 0);
        } else if (i2 != 80) {
            iCenterY = rect.centerY();
        } else {
            iCenterY = rect.bottom - (true != ((ocs) obj2).e ? iA : 0);
        }
        int i3 = i & 7;
        if (i3 == 3) {
            int i4 = rect.left;
            if (true != ((ocs) obj2).e) {
                iA = 0;
            }
            iCenterX = i4 + iA;
        } else if (i3 != 5) {
            iCenterX = rect.centerX();
        } else {
            int i5 = rect.right;
            if (true != ((ocs) obj2).e) {
                iA = 0;
            }
            iCenterX = i5 - iA;
        }
        float f2 = iCenterY;
        float f3 = 1.0f - interpolation;
        float f4 = f2 * f3;
        view2.setTop((int) ((rect.top * interpolation) + f4));
        view2.setBottom((int) (f4 + (rect.bottom * interpolation)));
        float f5 = f3 * iCenterX;
        view2.setLeft((int) ((rect.left * interpolation) + f5));
        view2.setRight((int) (f5 + (interpolation * rect.right)));
        ((wue) kztVar.a).P(this.e.getInterpolation(f));
        ((FrameLayout) obj).setAlpha(this.f.getInterpolation(f));
        float interpolation2 = this.g.getInterpolation(f);
        View view3 = (View) kztVar.c;
        view3.setAlpha(interpolation2);
        view3.setVisibility(f <= 0.5f ? 8 : 0);
    }

    @Override // defpackage.ocx
    public void e() {
        throw null;
    }
}
