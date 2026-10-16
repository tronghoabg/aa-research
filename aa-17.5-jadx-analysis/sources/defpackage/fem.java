package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class fem extends fhd {
    private final int[] B;
    private static final TimeInterpolator z = new DecelerateInterpolator();
    private static final TimeInterpolator A = new AccelerateInterpolator();

    public fem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new int[2];
        this.t = new fel();
    }

    private static float W(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    private final void X(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        int[] iArr2 = this.B;
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect rectH = h();
        if (rectH == null) {
            width = (view.getWidth() / 2) + i + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i2 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectH.centerX();
            iCenterY = rectH.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == BitmapDescriptorFactory.HUE_RED && fCenterY == BitmapDescriptorFactory.HUE_RED) {
            double dRandom = Math.random();
            double dRandom2 = Math.random();
            fCenterY = ((float) (dRandom2 + dRandom2)) - 1.0f;
            fCenterX = ((float) (dRandom + dRandom)) - 1.0f;
        }
        float fW = W(fCenterX, fCenterY);
        int i3 = width - i;
        int i4 = iCenterY - i2;
        float fW2 = W(Math.max(i3, view.getWidth() - i3), Math.max(i4, view.getHeight() - i4));
        iArr[0] = Math.round((fCenterX / fW) * fW2);
        iArr[1] = Math.round(fW2 * (fCenterY / fW));
    }

    private final void Y(fgo fgoVar) {
        View view = fgoVar.b;
        int[] iArr = this.B;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        fgoVar.a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // defpackage.fhd, defpackage.fgc
    public final void b(fgo fgoVar) {
        fhd.V(fgoVar);
        Y(fgoVar);
    }

    @Override // defpackage.fhd, defpackage.fgc
    public final void c(fgo fgoVar) {
        fhd.V(fgoVar);
        Y(fgoVar);
    }

    @Override // defpackage.fgc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fhd
    public final Animator f(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        Rect rect = (Rect) fgoVar2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        X(viewGroup, rect, this.B);
        return dat.g(view, fgoVar2, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, z, this);
    }

    @Override // defpackage.fhd
    public final Animator g(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        float f;
        float f2;
        Rect rect = (Rect) fgoVar.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) fgoVar.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        X(viewGroup, rect, this.B);
        return dat.g(view, fgoVar, i, i2, translationX, translationY, f + r0[0], f2 + r0[1], A, this);
    }
}
