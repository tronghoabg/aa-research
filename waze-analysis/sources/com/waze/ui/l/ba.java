package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    private boolean f42553a;
    private final Animatable p;
    private final Animatable q;
    private final Animatable r;
    private final kotlinx.coroutines.b.bn t;
    private final kotlinx.coroutines.b.k u;

    /* renamed from: b, reason: collision with root package name */
    private final AnimationSpec f42554b = AnimationSpecKt.tween$default(DisplayStrings.DS_NIGHT, 0, EasingFunctionsKt.getEaseInBack(), 2, null);

    /* renamed from: c, reason: collision with root package name */
    private final AnimationSpec f42555c = AnimationSpecKt.tween$default(DisplayStrings.DS_NIGHT, 0, EasingFunctionsKt.getEaseInBack(), 2, null);

    /* renamed from: d, reason: collision with root package name */
    private final AnimationSpec f42556d = AnimationSpecKt.spring(0.75f, 400.0f, Dp.m11162boximpl(30.0f));

    /* renamed from: e, reason: collision with root package name */
    private final AnimationSpec f42557e = AnimationSpecKt.spring(0.75f, 400.0f, Dp.m11162boximpl(30.0f));

    /* renamed from: f, reason: collision with root package name */
    private final AnimationSpec f42558f = AnimationSpecKt.tween$default(DisplayStrings.DS_NIGHT, 0, EasingFunctionsKt.getEaseOutBack(), 2, null);

    /* renamed from: g, reason: collision with root package name */
    private final AnimationSpec f42559g = AnimationSpecKt.tween$default(DisplayStrings.DS_NIGHT, 0, EasingFunctionsKt.getEaseOutBack(), 2, null);

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f42560h = kotlinx.coroutines.b.ck.b(null);

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f42561i = kotlinx.coroutines.b.ck.b(null);

    /* renamed from: j, reason: collision with root package name */
    private final MutableState f42562j = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: k, reason: collision with root package name */
    private final MutableState f42563k = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: l, reason: collision with root package name */
    private final MutableState f42564l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState m = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ai(null, 0.0f), null, 2, null);
    private final kotlinx.coroutines.b.bn n = kotlinx.coroutines.b.ck.b(false);
    private final Animatable o = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
    private final MutableState s = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public ba() {
        String str = null;
        this.p = new Animatable(Dp.m11162boximpl(0.0f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, str, 12, null);
        String str2 = null;
        this.q = new Animatable(Dp.m11162boximpl(0.0f), VectorConvertersKt.getVectorConverter(Dp.Companion), str, str2, 12, null);
        this.r = new Animatable(Dp.m11162boximpl(0.0f), VectorConvertersKt.getVectorConverter(Dp.Companion), str2, null, 12, null);
        Float fValueOf = Float.valueOf(0.0f);
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new h.k(fValueOf, fValueOf));
        this.t = bnVarB;
        this.u = new ay(bnVarB, 1);
    }

    public static final /* synthetic */ void A(ba baVar) {
        baVar.f42561i.e(null);
        baVar.f42560h.e(null);
        baVar.C(null);
    }

    public static /* synthetic */ Object H(ba baVar, ad adVar, ck ckVar, float f2, h.c.e eVar, int i2) {
        if ((i2 & 2) != 0) {
            ckVar = new ci();
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        return baVar.G(adVar, ckVar, f2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(aj ajVar) {
        this.m.setValue(ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(ad adVar) {
        this.f42562j.setValue(adVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(ad adVar) {
        this.f42563k.setValue(adVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(float r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.ba.L(float, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(float r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.ba.M(float, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r14.L(r8, r9) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r14.M(r0, r9) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if (r14.M(r20, r9) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r14.L(r8, r9) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        if (r14.m(r9) == r10) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object n(com.waze.ui.l.ba r14, kotlinx.coroutines.af r15, com.waze.ui.l.ck r16, boolean r17, float r18, boolean r19, float r20, h.c.e r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.ba.n(com.waze.ui.l.ba, kotlinx.coroutines.af, com.waze.ui.l.ck, boolean, float, boolean, float, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object o(com.waze.ui.l.ba r12, com.waze.ui.l.ad r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.ba.o(com.waze.ui.l.ba, com.waze.ui.l.ad, h.c.e):java.lang.Object");
    }

    static final h.ab p(ba baVar, float f2, Animatable animatable) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.k kVar;
        h.g.b.x.f(animatable, "$this$animateTo");
        do {
            bnVar = baVar.t;
            objD = bnVar.d();
            kVar = (h.k) objD;
        } while (!bnVar.f(objD, kVar != null ? h.k.e(kVar, null, Float.valueOf(h.k.n.g((((Dp) animatable.getValue()).m11178unboximpl() - f2) / (((Dp) animatable.getTargetValue()).m11178unboximpl() - f2), 0.0f, 1.0f)), 1) : null));
        return h.ab.f48028a;
    }

    static final h.ab q(ba baVar, float f2, Animatable animatable) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.k kVar;
        h.g.b.x.f(animatable, "$this$animateTo");
        do {
            bnVar = baVar.t;
            objD = bnVar.d();
            kVar = (h.k) objD;
        } while (!bnVar.f(objD, kVar != null ? h.k.e(kVar, Float.valueOf(h.k.n.g((((Dp) animatable.getValue()).m11178unboximpl() - f2) / (((Dp) animatable.getTargetValue()).m11178unboximpl() - f2), 0.0f, 1.0f)), null, 2) : null));
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void v(ba baVar, float f2, float f3) {
        baVar.f42561i.e(Dp.m11162boximpl(f3));
        baVar.f42560h.e(Dp.m11162boximpl(f2));
        baVar.C(Dp.m11162boximpl(f3));
    }

    public final void B(boolean z) {
        this.f42553a = z;
    }

    public final void C(Dp dp) {
        this.s.setValue(dp);
    }

    public final boolean D() {
        return this.f42553a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (kotlinx.coroutines.aj.v(r8, r0, r6) != r7) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:18:0x0049, B:42:0x0099, B:44:0x009d, B:45:0x00a2), top: B:54:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.waze.ui.l.ad r14, com.waze.ui.l.ck r15, float r16, h.c.e r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.ba.G(com.waze.ui.l.ad, com.waze.ui.l.ck, float, h.c.e):java.lang.Object");
    }

    public final Animatable a() {
        return this.q;
    }

    public final Animatable b() {
        return this.r;
    }

    public final Animatable c() {
        return this.o;
    }

    public final Animatable d() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dp i() {
        return (Dp) this.s.getValue();
    }

    public final ad j() {
        return (ad) this.f42562j.getValue();
    }

    public final ad k() {
        return (ad) this.f42563k.getValue();
    }

    public final aj l() {
        return (aj) this.m.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ak m() {
        return (ak) this.f42564l.getValue();
    }

    public final kotlinx.coroutines.b.k r() {
        return this.u;
    }

    public final kotlinx.coroutines.b.bn u() {
        return this.n;
    }
}
