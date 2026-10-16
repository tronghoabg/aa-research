package com.moloco.sdk.internal.services.bidtoken;

import android.hardware.SensorManager;
import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.B;
import com.moloco.sdk.C;
import com.moloco.sdk.C1945j;
import com.moloco.sdk.C1947k;
import com.moloco.sdk.C1949l;
import com.moloco.sdk.C1951m;
import com.moloco.sdk.C1953n;
import com.moloco.sdk.C1957p;
import com.moloco.sdk.C1968s;
import com.moloco.sdk.C1970t;
import com.moloco.sdk.C1972u;
import com.moloco.sdk.C1976w;
import com.moloco.sdk.C1978x;
import com.moloco.sdk.C2141y;
import com.moloco.sdk.C2143z;
import com.moloco.sdk.D;
import com.moloco.sdk.E;
import com.moloco.sdk.EnumC1955o;
import com.moloco.sdk.EnumC1965q;
import com.moloco.sdk.EnumC1974v;
import com.moloco.sdk.G;
import com.moloco.sdk.H;
import com.moloco.sdk.I;
import com.moloco.sdk.J;
import com.moloco.sdk.K;
import com.moloco.sdk.L;
import com.moloco.sdk.M;
import com.moloco.sdk.N;
import com.moloco.sdk.O;
import com.moloco.sdk.P;
import com.moloco.sdk.Q;
import com.moloco.sdk.internal.services.C1937a;
import com.moloco.sdk.internal.services.C1938b;
import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.v f29536a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f29537b;

    public r(com.moloco.sdk.internal.services.v deviceInfoService, com.moloco.sdk.internal.services.i screenInfoService) {
        AbstractC3340k.e(deviceInfoService, "deviceInfoService");
        AbstractC3340k.e(screenInfoService, "screenInfoService");
        this.f29536a = deviceInfoService;
        this.f29537b = screenInfoService;
    }

    public final Q a(com.moloco.sdk.internal.services.bidtoken.providers.k kVar, g bidTokenConfig) {
        Boolean boolValueOf;
        EnumC1955o enumC1955o;
        EnumC1974v enumC1974v;
        I i5;
        AbstractC3340k.e(bidTokenConfig, "bidTokenConfig");
        com.moloco.sdk.internal.services.v vVar = this.f29536a;
        F fA = vVar.a();
        com.moloco.sdk.internal.services.h hVarA = this.f29537b.a();
        C1970t c1970tN = Q.n();
        M mC = N.c();
        mC.a(kVar.f29486a);
        c1970tN.h((N) mC.build());
        com.moloco.sdk.F fE = G.e();
        com.moloco.sdk.internal.services.bidtoken.providers.q qVar = kVar.f29488c;
        Boolean bool = qVar.f29514a;
        if (bool != null) {
            fE.a(bool.booleanValue());
        }
        Long l10 = qVar.f29515b;
        if (l10 != null) {
            fE.b(l10.longValue());
        }
        Long l11 = qVar.f29516c;
        if (l11 != null) {
            fE.c(l11.longValue());
        }
        c1970tN.j((G) fE.build());
        C1978x c1978xC = C2141y.c();
        Long l12 = kVar.f29489d.f29474a;
        if (l12 != null) {
            c1978xC.a(l12.longValue());
        }
        c1970tN.f((C2141y) c1978xC.build());
        H hF = J.f();
        com.moloco.sdk.internal.services.bidtoken.providers.s sVar = kVar.f29490e;
        Integer num = sVar.f29519a;
        if (num != null) {
            hF.a(num.intValue());
        }
        Integer num2 = sVar.f29520b;
        if (num2 != null) {
            hF.b(num2.intValue());
        }
        Boolean bool2 = sVar.f29521c;
        if (bool2 != null) {
            hF.c(bool2.booleanValue());
        }
        Ba.c cVar = sVar.f29522d;
        if (cVar != null) {
            if (cVar instanceof C1937a) {
                i5 = I.CELLULAR;
            } else if (cVar.equals(C1938b.f29407j)) {
                i5 = I.NO_NETWORK;
            } else {
                if (!cVar.equals(C1938b.k)) {
                    throw new E5.Q((byte) 0, 9);
                }
                i5 = I.WIFI;
            }
            hF.d(i5);
        }
        c1970tN.k((J) hF.build());
        com.moloco.sdk.r rVarE = C1968s.e();
        com.moloco.sdk.internal.services.bidtoken.providers.h hVar = kVar.f29491f;
        Integer num3 = hVar.f29481a;
        if (num3 != null) {
            rVarE.c(num3.intValue());
        }
        Integer num4 = hVar.f29482b;
        if (num4 != null) {
            int iIntValue = num4.intValue();
            rVarE.a(iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? EnumC1965q.UNKNOWN : EnumC1965q.FULL : EnumC1965q.NOT_CHARGING : EnumC1965q.DISCHARGING : EnumC1965q.CHARGING);
        }
        Boolean bool3 = hVar.f29483c;
        if (bool3 != null) {
            rVarE.b(bool3.booleanValue());
        }
        c1970tN.d((C1968s) rVarE.build());
        C1949l c1949lD = C1951m.d();
        Fe.c cVar2 = kVar.f29492g;
        if (cVar2 instanceof com.moloco.sdk.internal.services.o) {
            c1949lD.a(false);
            c1949lD.b(((com.moloco.sdk.internal.services.o) cVar2).f29714a);
        } else {
            if (!cVar2.equals(com.moloco.sdk.internal.services.p.f29715a)) {
                throw new E5.Q((byte) 0, 9);
            }
            c1949lD.a(true);
        }
        c1970tN.b((C1951m) c1949lD.build());
        K kG = L.g();
        MolocoPrivacy.PrivacySettings privacySettings = kVar.f29487b;
        Boolean isAgeRestrictedUser = privacySettings.getIsAgeRestrictedUser();
        if (isAgeRestrictedUser != null) {
            kG.b(isAgeRestrictedUser.booleanValue());
        }
        Boolean isUserConsent = privacySettings.getIsUserConsent();
        if (isUserConsent != null) {
            kG.c(isUserConsent.booleanValue());
        }
        Boolean isDoNotSell = privacySettings.getIsDoNotSell();
        if (isDoNotSell != null) {
            kG.a(isDoNotSell.booleanValue());
        }
        String tCFConsent = privacySettings.getTCFConsent();
        if (tCFConsent != null) {
            kG.d(tCFConsent);
        }
        kG.e(privacySettings.get_usPrivacy());
        c1970tN.l((L) kG.build());
        C1972u c1972uY = C1976w.y();
        c1972uY.m(fA.f29387f);
        String str = Build.VERSION.RELEASE;
        c1972uY.s();
        c1972uY.o(fA.f29382a);
        c1972uY.p(fA.f29383b);
        c1972uY.j(fA.f29384c);
        c1972uY.b(fA.f29388g);
        c1972uY.d(fA.f29385d ? 5 : 1);
        c1972uY.k();
        C2143z c2143zC = com.moloco.sdk.A.c();
        c2143zC.a(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
        c1972uY.e((com.moloco.sdk.A) c2143zC.build());
        c1972uY.v(hVarA.f29617a);
        c1972uY.f(hVarA.f29619c);
        c1972uY.u(hVarA.f29621e);
        c1972uY.t(hVarA.f29622f);
        c1972uY.r();
        if (bidTokenConfig.f29436a) {
            c1972uY.c(fA.f29390i * 1000000);
        }
        com.moloco.sdk.internal.services.bidtoken.providers.m mVar = kVar.f29493h;
        com.moloco.sdk.internal.services.j jVar = mVar.f29498a;
        if (jVar != null) {
            int i10 = q.f29534a[jVar.ordinal()];
            if (i10 == 1) {
                enumC1974v = EnumC1974v.UNKNOWN;
            } else if (i10 == 2) {
                enumC1974v = EnumC1974v.PORTRAIT;
            } else {
                if (i10 != 3) {
                    throw new E5.Q((byte) 0, 9);
                }
                enumC1974v = EnumC1974v.LANDSCAPE;
            }
            c1972uY.q(enumC1974v);
        }
        vVar.getClass();
        try {
            Object systemService = vVar.f29732a.getSystemService("sensor");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            boolValueOf = Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (Exception unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            c1972uY.h(boolValueOf.booleanValue());
        }
        String str2 = mVar.f29500c;
        if (str2 != null) {
            c1972uY.l(str2);
        }
        String str3 = mVar.f29499b;
        if (str3 != null) {
            c1972uY.n(str3);
        }
        c1972uY.w(hVarA.f29623g);
        c1972uY.x(hVarA.f29624h);
        c1972uY.g(fA.f29391j);
        c1972uY.a(fA.k);
        c1970tN.e((C1976w) c1972uY.build());
        C1953n c1953nD = C1957p.d();
        com.moloco.sdk.internal.services.bidtoken.providers.f fVar = kVar.f29494i;
        com.moloco.sdk.internal.services.G g9 = fVar.f29477a;
        if (g9 != null) {
            int i11 = q.f29535b[g9.ordinal()];
            if (i11 == 1) {
                enumC1955o = EnumC1955o.SILENT;
            } else if (i11 == 2) {
                enumC1955o = EnumC1955o.VIBRATE;
            } else {
                if (i11 != 3) {
                    throw new E5.Q((byte) 0, 9);
                }
                enumC1955o = EnumC1955o.NORMAL;
            }
            c1953nD.a(enumC1955o);
        }
        Integer num5 = fVar.f29478b;
        if (num5 != null) {
            c1953nD.b(num5.intValue());
        }
        c1970tN.c((C1957p) c1953nD.build());
        C1945j c1945jF = C1947k.f();
        com.moloco.sdk.internal.services.bidtoken.providers.a aVar = kVar.f29495j;
        Float f10 = aVar.f29469d;
        if (f10 != null) {
            c1945jF.c(f10.floatValue());
        }
        Boolean bool4 = aVar.f29467b;
        if (bool4 != null) {
            c1945jF.b(bool4.booleanValue());
        }
        Boolean bool5 = aVar.f29466a;
        if (bool5 != null) {
            c1945jF.a(bool5.booleanValue());
        }
        Boolean bool6 = aVar.f29468c;
        if (bool6 != null) {
            c1945jF.d(bool6.booleanValue());
        }
        c1970tN.a((C1947k) c1945jF.build());
        com.moloco.sdk.internal.services.bidtoken.providers.o oVar = kVar.k;
        if (oVar.f29504a.length() > 0) {
            B bF = E.f();
            bF.c(oVar.f29504a);
            bF.b(oVar.f29506c);
            bF.d(oVar.f29505b);
            C cG = D.g();
            cG.a(oVar.f29507d);
            cG.c(oVar.f29508e);
            cG.d(oVar.f29509f);
            cG.b(oVar.f29510g);
            cG.e(oVar.f29511h);
            bF.a((D) cG.build());
            c1970tN.g((E) bF.build());
        }
        String str4 = kVar.f29496l.f29528a;
        if (str4 != null && !Bf.k.y0(str4)) {
            O oC = P.c();
            oC.a(str4);
            c1970tN.m((P) oC.build());
        }
        GeneratedMessageLite generatedMessageLiteBuild = c1970tN.build();
        AbstractC3340k.d(generatedMessageLiteBuild, "build(...)");
        return (Q) generatedMessageLiteBuild;
    }
}
