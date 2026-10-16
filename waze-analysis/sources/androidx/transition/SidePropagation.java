package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SidePropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int distance(android.view.View r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r4 = this;
            int r4 = r4.mSide
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = 1
            r2 = 5
            r3 = 3
            if (r4 != r0) goto L14
            int r4 = r5.getLayoutDirection()
            if (r4 != r1) goto L12
        L10:
            r4 = r2
            goto L20
        L12:
            r4 = r3
            goto L20
        L14:
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r4 != r0) goto L20
            int r4 = r5.getLayoutDirection()
            if (r4 != r1) goto L10
            goto L12
        L20:
            if (r4 == r3) goto L46
            if (r4 == r2) goto L3e
            r5 = 48
            if (r4 == r5) goto L36
            r5 = 80
            if (r4 == r5) goto L2e
            r4 = 0
            return r4
        L2e:
            int r8 = r8 - r6
            int r7 = r7 - r11
            int r4 = java.lang.Math.abs(r8)
            int r7 = r7 + r4
            return r7
        L36:
            int r8 = r8 - r6
            int r13 = r13 - r7
            int r4 = java.lang.Math.abs(r8)
            int r13 = r13 + r4
            return r13
        L3e:
            int r9 = r9 - r7
            int r6 = r6 - r10
            int r4 = java.lang.Math.abs(r9)
            int r6 = r6 + r4
            return r6
        L46:
            int r9 = r9 - r7
            int r12 = r12 - r6
            int r4 = java.lang.Math.abs(r9)
            int r12 = r12 + r4
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.SidePropagation.distance(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i2 = this.mSide;
        return (i2 == 3 || i2 == 5 || i2 == 8388611 || i2 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        Rect rect;
        int i3;
        int iCenterY;
        int i4;
        ViewGroup viewGroup2;
        int i5;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i2 = -1;
            rect = epicenter;
        } else {
            transitionValues3 = transitionValues2;
            rect = epicenter;
            i2 = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rect != null) {
            int iCenterX = rect.centerX();
            i4 = viewY;
            viewGroup2 = viewGroup;
            i5 = iRound2;
            iCenterY = rect.centerY();
            i3 = iCenterX;
        } else {
            i3 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i4 = viewY;
            viewGroup2 = viewGroup;
            i5 = iRound2;
        }
        float fDistance = distance(viewGroup2, viewX, i4, i3, iCenterY, iRound, i5, width, height);
        float maxDistance = getMaxDistance(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * i2) / this.mPropagationSpeed) * (fDistance / maxDistance));
    }

    public void setPropagationSpeed(float f2) {
        if (f2 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.mPropagationSpeed = f2;
    }

    public void setSide(int i2) {
        this.mSide = i2;
    }
}
