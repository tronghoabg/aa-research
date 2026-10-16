package l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import m.AbstractC3472a;

/* loaded from: classes.dex */
public final class c extends Ba.c {

    /* renamed from: j, reason: collision with root package name */
    public final ObjectAnimator f39817j;
    public final boolean k;

    public c(AnimationDrawable animationDrawable, boolean z2, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i5 = z2 ? numberOfFrames - 1 : 0;
        int i10 = z2 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f39819b = numberOfFrames2;
        int[] iArr = dVar.f39818a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f39818a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f39818a;
        int i11 = 0;
        for (int i12 = 0; i12 < numberOfFrames2; i12++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i12) - 1 : i12);
            iArr2[i12] = duration;
            i11 += duration;
        }
        dVar.f39820c = i11;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i5, i10);
        AbstractC3472a.a(objectAnimatorOfInt, true);
        objectAnimatorOfInt.setDuration(dVar.f39820c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.k = z10;
        this.f39817j = objectAnimatorOfInt;
    }

    @Override // Ba.c
    public final void L() {
        this.f39817j.reverse();
    }

    @Override // Ba.c
    public final void P() {
        this.f39817j.start();
    }

    @Override // Ba.c
    public final void Q() {
        this.f39817j.cancel();
    }

    @Override // Ba.c
    public final boolean j() {
        return this.k;
    }
}
