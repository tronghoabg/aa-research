package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class ffr extends fhd {
    private ffo H;
    private static final TimeInterpolator z = new DecelerateInterpolator();
    private static final TimeInterpolator A = new AccelerateInterpolator();
    private static final ffo B = new ffi();
    private static final ffo C = new ffj();
    private static final ffo D = new ffk();
    private static final ffo E = new ffl();
    private static final ffo F = new ffm();
    private static final ffo G = new ffn();

    public ffr(Context context, AttributeSet attributeSet) {
        ffo ffoVar;
        super(context, attributeSet);
        ffo ffoVar2 = G;
        this.H = ffoVar2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.g);
        int iM = dlz.m(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        if (iM == 3) {
            this.H = B;
        } else if (iM != 5) {
            if (iM == 48) {
                ffoVar = D;
            } else if (iM == 80) {
                this.H = ffoVar2;
            } else if (iM == 8388611) {
                ffoVar = C;
            } else {
                if (iM != 8388613) {
                    throw new IllegalArgumentException("Invalid slide direction");
                }
                ffoVar = F;
            }
            this.H = ffoVar;
        } else {
            this.H = E;
        }
        ffh ffhVar = new ffh();
        ffhVar.a = iM;
        this.t = ffhVar;
    }

    private static final void W(fgo fgoVar) {
        int[] iArr = new int[2];
        fgoVar.b.getLocationOnScreen(iArr);
        fgoVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.fhd, defpackage.fgc
    public final void b(fgo fgoVar) {
        fhd.V(fgoVar);
        W(fgoVar);
    }

    @Override // defpackage.fhd, defpackage.fgc
    public final void c(fgo fgoVar) {
        fhd.V(fgoVar);
        W(fgoVar);
    }

    @Override // defpackage.fgc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fhd
    public final Animator f(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        int[] iArr = (int[]) fgoVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return dat.g(view, fgoVar2, iArr[0], iArr[1], this.H.a(viewGroup, view), this.H.b(viewGroup, view), translationX, translationY, z, this);
    }

    @Override // defpackage.fhd
    public final Animator g(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        int[] iArr = (int[]) fgoVar.a.get("android:slide:screenPosition");
        return dat.g(view, fgoVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.H.a(viewGroup, view), this.H.b(viewGroup, view), A, this);
    }
}
