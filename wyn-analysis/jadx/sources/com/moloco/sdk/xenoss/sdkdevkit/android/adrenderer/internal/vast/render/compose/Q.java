package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import K.AbstractC0682g;
import K.C0680e;
import N.C0740o;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.wynauto.wyn.R;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class Q implements tf.p {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f31792b = new Q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Q f31793c = new Q(1);

    /* renamed from: d, reason: collision with root package name */
    public static final Q f31794d = new Q(2);

    /* renamed from: e, reason: collision with root package name */
    public static final Q f31795e = new Q(3);

    /* renamed from: f, reason: collision with root package name */
    public static final Q f31796f = new Q(4);

    /* renamed from: g, reason: collision with root package name */
    public static final Q f31797g = new Q(5);

    /* renamed from: h, reason: collision with root package name */
    public static final Q f31798h = new Q(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31799a;

    public /* synthetic */ Q(int i5) {
        this.f31799a = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        switch (this.f31799a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o.M(-1165352185);
                V.d dVarB = AbstractC3935e.b(0L, 0L, 0L, null, null, 0L, null, null, c0740o, 1023);
                c0740o.p(false);
                return dVarB;
            case 1:
                C0740o c0740o2 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o2.M(1971947846);
                V.d dVarB2 = Ba.c.b(null, null, 0L, 0L, 0L, null, null, c0740o2, 255);
                c0740o2.p(false);
                return dVarB2;
            case 2:
                C0740o c0740o3 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o3.M(489092871);
                V.d dVarD = ic.d.d(null, null, 0L, 0L, 0L, null, null, c0740o3, 255);
                c0740o3.p(false);
                return dVarD;
            case 3:
                C0740o c0740o4 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o4.M(-462412988);
                c0740o4.M(-926425258);
                float f10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31057a;
                E.F f11 = new E.F(f10, f10, f10, f10);
                long jB = ((C0680e) c0740o4.j(AbstractC0682g.f6260a)).b();
                c0740o4.j(AndroidCompositionLocals_androidKt.f18011a);
                Resources resources = ((Context) c0740o4.j(AndroidCompositionLocals_androidKt.f18012b)).getResources();
                AbstractC3340k.d(resources, "LocalContext.current.resources");
                String string = resources.getString(R.string.com_moloco_sdk_xenoss_player_learn_more);
                AbstractC3340k.d(string, "resources.getString(id)");
                V.d dVarB3 = V.e.b(c0740o4, 432764356, new K(f11, string, jB));
                c0740o4.p(false);
                c0740o4.p(false);
                return dVarB3;
            case 4:
                C0740o c0740o5 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o5.M(-185458362);
                V.d dVarC = AbstractC3935e.c(null, null, 0L, c0740o5, 7);
                c0740o5.p(false);
                return dVarC;
            case 5:
                C0740o c0740o6 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o6.M(1409102370);
                V.d dVarC2 = AbstractC3230e0.c(null, null, c0740o6, 3);
                c0740o6.p(false);
                return dVarC2;
            default:
                C0740o c0740o7 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o7.M(-1364519647);
                c0740o7.p(false);
                return null;
        }
    }
}
