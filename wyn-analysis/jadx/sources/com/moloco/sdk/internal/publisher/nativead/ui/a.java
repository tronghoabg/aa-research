package com.moloco.sdk.internal.publisher.nativead.ui;

import E.F;
import K.A;
import K.AbstractC0676a;
import K.AbstractC0682g;
import K.C0680e;
import K.C0685j;
import K.z;
import N.C0732k;
import N.C0740o;
import N.L0;
import Z.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2108e;
import com.wynauto.wyn.R;
import e0.C2465q;
import ef.C2515C;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import tf.q;

/* loaded from: classes4.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.a f29249b;

    public /* synthetic */ a(tf.a aVar, int i5) {
        this.f29248a = i5;
        this.f29249b = aVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2515C c2515c = C2515C.f34653a;
        switch (this.f29248a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0740o c0740o = (C0740o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0740o.f(zBooleanValue) ? 4 : 2;
                }
                if ((iIntValue & 19) != 18 || !c0740o.x()) {
                    Fe.b.a(AbstractC2641B.H(zBooleanValue ? R.drawable.moloco_twotone_pause_24 : R.drawable.moloco_twotone_play_arrow_24, c0740o), this.f29249b, null, false, "play/pause", C2465q.f34375d, 0L, 0L, null, 0L, c0740o, 221184, 972);
                    break;
                } else {
                    c0740o.I();
                    break;
                }
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C0740o c0740o2 = (C0740o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0740o2.f(zBooleanValue2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18 || !c0740o2.x()) {
                    V.d dVarB = V.e.b(c0740o2, -919554769, new C2108e(zBooleanValue2));
                    tf.a onClick = this.f29249b;
                    AbstractC3340k.e(onClick, "onClick");
                    c0740o2.M(288797557);
                    i iVar = i.f16922a;
                    c0740o2.M(-492369756);
                    Object objF = c0740o2.F();
                    if (objF == C0732k.f7800a) {
                        objF = new D.i();
                        c0740o2.U(objF);
                    }
                    c0740o2.p(false);
                    D.i iVar2 = (D.i) objF;
                    H.d dVar = ((z) c0740o2.j(A.f6149a)).f6309a;
                    F f10 = AbstractC0676a.f6216a;
                    c0740o2.M(182742216);
                    long j8 = C2465q.f34379h;
                    L0 l02 = AbstractC0682g.f6260a;
                    long jB = ((C0680e) c0740o2.j(l02)).b();
                    long jA = ((C0680e) c0740o2.j(l02)).a();
                    Ba.c.y(c0740o2);
                    C0685j c0685j = new C0685j(j8, jB, j8, C2465q.a(jA, 0.38f));
                    c0740o2.p(false);
                    A6.h.a(onClick, iVar, true, iVar2, null, dVar, null, c0685j, AbstractC0676a.f6220e, dVarB, c0740o2, 805306368, 0);
                    c0740o2.p(false);
                    break;
                } else {
                    c0740o2.I();
                    break;
                }
                break;
        }
        return c2515c;
    }
}
