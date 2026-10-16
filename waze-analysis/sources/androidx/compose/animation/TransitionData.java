package androidx.compose.animation;

import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransitionData {
    public static final int $stable = 0;
    private final ChangeSize changeSize;
    private final Map<TransitionEffectKey<?>, TransitionEffect> effectsMap;
    private final Fade fade;
    private final boolean hold;
    private final Scale scale;
    private final Slide slide;
    private final Veil veil;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransitionData(androidx.compose.animation.Fade r9, androidx.compose.animation.Slide r10, androidx.compose.animation.ChangeSize r11, androidx.compose.animation.Scale r12, androidx.compose.animation.Veil r13, boolean r14, java.util.Map r15, int r16, h.g.b.o r17) {
        /*
            r8 = this;
            r0 = r16 & 64
            if (r0 == 0) goto L9
            java.util.Map r0 = h.a.r.j()
            goto La
        L9:
            r0 = r15
        La:
            r1 = r16 & 32
            r2 = r16 & 16
            r3 = r16 & 8
            r4 = r16 & 4
            r5 = r16 & 2
            r6 = 1
            if (r1 == 0) goto L19
            r1 = 0
            goto L1a
        L19:
            r1 = r6
        L1a:
            r7 = r16 & 1
            r14 = r14 & r1
            r1 = 0
            if (r2 == 0) goto L21
            r13 = r1
        L21:
            if (r3 == 0) goto L24
            r12 = r1
        L24:
            if (r4 == 0) goto L27
            r11 = r1
        L27:
            if (r5 == 0) goto L2a
            r10 = r1
        L2a:
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            if (r6 != r7) goto L36
            r10 = r1
            r9 = r8
            r16 = r0
            goto L3a
        L36:
            r10 = r9
            r16 = r0
            r9 = r8
        L3a:
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.TransitionData.<init>(androidx.compose.animation.Fade, androidx.compose.animation.Slide, androidx.compose.animation.ChangeSize, androidx.compose.animation.Scale, androidx.compose.animation.Veil, boolean, java.util.Map, int, h.g.b.o):void");
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, Veil veil, boolean z, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i2 & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i2 & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((i2 & 8) != 0) {
            scale = transitionData.scale;
        }
        if ((i2 & 16) != 0) {
            veil = transitionData.veil;
        }
        if ((i2 & 32) != 0) {
            z = transitionData.hold;
        }
        if ((i2 & 64) != 0) {
            map = transitionData.effectsMap;
        }
        boolean z2 = z;
        Map map2 = map;
        Veil veil2 = veil;
        ChangeSize changeSize2 = changeSize;
        return transitionData.copy(fade, slide, changeSize2, scale, veil2, z2, map2);
    }

    public final Fade component1() {
        return this.fade;
    }

    public final Slide component2() {
        return this.slide;
    }

    public final ChangeSize component3() {
        return this.changeSize;
    }

    public final Scale component4() {
        return this.scale;
    }

    public final Veil component5() {
        return this.veil;
    }

    public final boolean component6() {
        return this.hold;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> component7() {
        return this.effectsMap;
    }

    public final TransitionData copy(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, Veil veil, boolean z, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        return new TransitionData(fade, slide, changeSize, scale, veil, z, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return x.n(this.fade, transitionData.fade) && x.n(this.slide, transitionData.slide) && x.n(this.changeSize, transitionData.changeSize) && x.n(this.scale, transitionData.scale) && x.n(this.veil, transitionData.veil) && this.hold == transitionData.hold && x.n(this.effectsMap, transitionData.effectsMap);
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> getEffectsMap() {
        return this.effectsMap;
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final boolean getHold() {
        return this.hold;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public final Veil getVeil() {
        return this.veil;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = fade == null ? 0 : fade.hashCode();
        Slide slide = this.slide;
        int iHashCode2 = slide == null ? 0 : slide.hashCode();
        int i2 = iHashCode * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        int iHashCode4 = (iHashCode3 + (scale == null ? 0 : scale.hashCode())) * 31;
        Veil veil = this.veil;
        return ((((iHashCode4 + (veil != null ? veil.hashCode() : 0)) * 31) + TransitionData$$ExternalSyntheticBackport0.m(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", veil=" + this.veil + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, Veil veil, boolean z, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.veil = veil;
        this.hold = z;
        this.effectsMap = map;
    }

    public TransitionData() {
        this(null, null, null, null, null, false, null, 127, null);
    }
}
