package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0732k;
import N.C0740o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2048i;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class I implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31753d;

    public /* synthetic */ I(String str, long j8, tf.a aVar, int i5) {
        this.f31750a = i5;
        this.f31751b = str;
        this.f31752c = j8;
        this.f31753d = aVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31750a) {
            case 0:
                Z.k it = (Z.k) obj;
                C0740o c0740o = (C0740o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC3340k.e(it, "it");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0740o.e(it) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0740o.x()) {
                    c0740o.I();
                } else {
                    c0740o.M(-1483980455);
                    tf.a aVar = (tf.a) this.f31753d;
                    boolean zE = c0740o.e(aVar) | c0740o.e(null);
                    Object objF = c0740o.F();
                    if (zE || objF == C0732k.f7800a) {
                        objF = new C2048i(aVar, 1);
                        c0740o.U(objF);
                    }
                    c0740o.p(false);
                    AbstractC2127y.a(it, this.f31751b, this.f31752c, (tf.a) objF, c0740o, iIntValue & 14);
                }
                break;
            case 1:
                Z.k it2 = (Z.k) obj;
                C0740o c0740o2 = (C0740o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC3340k.e(it2, "it");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0740o2.e(it2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c0740o2.x()) {
                    c0740o2.I();
                } else {
                    c0740o2.M(-1483961383);
                    tf.a aVar2 = (tf.a) this.f31753d;
                    boolean zE2 = c0740o2.e(aVar2) | c0740o2.e(null);
                    Object objF2 = c0740o2.F();
                    if (zE2 || objF2 == C0732k.f7800a) {
                        objF2 = new C2048i(aVar2, 2);
                        c0740o2.U(objF2);
                    }
                    c0740o2.p(false);
                    AbstractC2127y.a(it2, this.f31751b, this.f31752c, (tf.a) objF2, c0740o2, iIntValue2 & 14);
                }
                break;
            default:
                E.K Button = (E.K) obj;
                C0740o c0740o3 = (C0740o) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC3340k.e(Button, "$this$Button");
                if ((iIntValue3 & 17) == 16 && c0740o3.x()) {
                    c0740o3.I();
                } else {
                    String str = this.f31751b;
                    Integer num = (Integer) this.f31753d;
                    L0.j jVar = num != null ? new L0.j(Fe.b.E(num.intValue())) : null;
                    c0740o3.M(-1245056940);
                    long j8 = jVar == null ? ((K.L) c0740o3.j(K.M.f6215a)).k.f48337a.f48301b : jVar.f6811a;
                    c0740o3.p(false);
                    K.I.b(str, null, this.f31752c, j8, E0.l.f2800f, null, 0L, null, 0L, 2, false, 1, null, null, c0740o3, 196608, 3120, 55250);
                }
                break;
        }
        return C2515C.f34653a;
    }

    public I(String str, Integer num, long j8) {
        this.f31750a = 2;
        this.f31751b = str;
        this.f31753d = num;
        this.f31752c = j8;
    }
}
