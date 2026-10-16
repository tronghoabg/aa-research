package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import B.C0317h;
import K.AbstractC0676a;
import K.C0685j;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.V;
import U8.v0;
import android.graphics.Color;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import e0.C2465q;
import ef.C2515C;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final long f30777a = e0.z.b(-12093714);

    /* renamed from: b, reason: collision with root package name */
    public static final long f30778b;

    static {
        int i5 = C2465q.f34381j;
        f30778b = C2465q.f34375d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d7  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [L0.j] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.B0] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(Z.k r38, java.lang.String r39, tf.a r40, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F0 r41, N.C0740o r42, int r43) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(Z.k, java.lang.String, tf.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F0, N.o, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17, types: [Z.k] */
    public static final void b(final String str, final tf.a onClick, final Integer num, final Integer num2, final List list, final boolean z2, final long j8, final long j10, final int i5, C0740o c0740o, final int i10) {
        int i11;
        List listD;
        ?? E10;
        AbstractC3340k.e(onClick, "onClick");
        c0740o.N(1721864917);
        if ((i10 & 6) == 0) {
            i11 = (c0740o.e(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0740o.e(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0740o.e(num) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0740o.e(num2) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0740o.e(list) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0740o.f(z2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0740o.d(j8) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((12582912 & i10) == 0) {
            i12 |= c0740o.d(j10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0740o.c(i5) ? 67108864 : 33554432;
        }
        int i13 = i12 | 805306368;
        if ((i13 & 306783379) == 306783378 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(-1671934187);
            c0740o.M(2024277948);
            Object objF = c0740o.F();
            if (objF == C0732k.f7800a) {
                objF = C0718d.G(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), N.P.f7730f);
                c0740o.U(objF);
            }
            c0740o.p(false);
            c0740o.p(false);
            double radians = Math.toRadians(((Number) ((V) objF).getValue()).floatValue());
            long jF = v0.f(((float) Math.cos(radians)) * 300.0f, ((float) Math.sin(radians)) * 300.0f);
            double d3 = radians + 3.141592653589793d;
            long jF2 = v0.f(((float) Math.cos(d3)) * 300.0f, ((float) Math.sin(d3)) * 300.0f);
            if (list == null || list.isEmpty()) {
                long j11 = f30777a;
                listD = AbstractC3935e.D(new C2465q(j11), new C2465q(j11));
            } else {
                listD = AbstractC3935e.D(new C2465q(e0.z.b(Color.parseColor((String) ff.o.q0(list)))), new C2465q(e0.z.b(Color.parseColor((String) ff.o.y0(list)))));
            }
            e0.u uVar = new e0.u(listD, jF, jF2);
            H.d dVar = H.e.f4848a;
            C0685j c0685jA = AbstractC0676a.a(j10, j8, c0740o, ((i13 >> 21) & 14) | ((i13 >> 15) & 112), 12);
            C0317h c0317h = z2 ? new C0317h(i5, uVar) : null;
            Z.i iVar = Z.i.f16922a;
            if (num != null && (E10 = E.L.e(iVar, num.intValue(), num.intValue() * 0.33f)) != 0) {
                iVar = E10;
            }
            A6.h.a(onClick, iVar, false, null, null, dVar, c0317h, c0685jA, null, V.e.b(c0740o, -469621531, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.I(str, num2, j8)), c0740o, ((i13 >> 3) & 14) | 805306368, 284);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i14 = i10 | 1;
                    String str2 = str;
                    long j12 = j10;
                    int i15 = i5;
                    B.b(str2, onClick, num, num2, list, z2, j8, j12, i15, (C0740o) obj, i14);
                    return C2515C.f34653a;
                }
            };
        }
    }
}
