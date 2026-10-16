package com.moloco.sdk.internal.publisher.nativead.ui;

import E.C0427q;
import N.C0732k;
import N.C0740o;
import Z.i;
import Z.k;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.publisher.H;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;
import tf.s;

/* loaded from: classes4.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f29250a = new b();

    @Override // tf.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i5;
        C0427q c0427q = (C0427q) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        tf.a onClick = (tf.a) obj3;
        C0740o c0740o = (C0740o) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC3340k.e(onClick, "onClick");
        if ((iIntValue & 6) == 0) {
            i5 = (c0740o.e(c0427q) ? 4 : 2) | iIntValue;
        } else {
            i5 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i5 |= c0740o.f(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i5 |= c0740o.e(onClick) ? 256 : 128;
        }
        if ((i5 & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
        } else {
            k kVarF0 = H.f0(c0427q.a(i.f16922a, Z.a.f16907h), 4);
            c0740o.M(277443603);
            boolean zE = c0740o.e("playback_control_button");
            Object objF = c0740o.F();
            if (zE || objF == C0732k.f7800a) {
                objF = new C1915d(2);
                c0740o.U(objF);
            }
            c0740o.p(false);
            Fe.g.c(bool, Fe.g.J(kVarF0, false, (l) objF), null, V.e.b(c0740o, 1776469658, new a(onClick, 0)), c0740o, ((i5 >> 3) & 14) | 3072, 4);
        }
        return C2515C.f34653a;
    }
}
