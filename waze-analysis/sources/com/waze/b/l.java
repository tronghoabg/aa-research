package com.waze.b;

import com.waze.config.ConfigValues;
import com.waze.sharedui.profile.AgeRestrictionMode;
import com.waze.sharedui.profile.UserProfile;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l implements y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f16150a;

    /* renamed from: b, reason: collision with root package name */
    private final af f16151b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f16152c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f16153d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f16154e;

    public l(com.waze.sharedui.profile.b bVar, af afVar) {
        h.g.b.x.f(bVar, "profileManager");
        h.g.b.x.f(afVar, "coroutineScope");
        this.f16150a = bVar;
        this.f16151b = afVar;
        this.f16152c = h.g.a(new g(this, 1));
        this.f16153d = ck.b(h.f16142a);
        this.f16154e = h.g.a(new g(this, 0));
    }

    static final e b(l lVar) {
        Boolean boolB = ConfigValues.CONFIG_VALUE_AADC_IS_FEATURE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        boolean zBooleanValue = boolB.booleanValue();
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_AADC_IS_AGE_REQUIRED.b();
        h.g.b.x.e(boolB2, "getValue(...)");
        boolean zBooleanValue2 = boolB2.booleanValue();
        UserProfile userProfileB = lVar.f16150a.b();
        h.g.b.x.e(userProfileB, "getMyProfile(...)");
        return g(zBooleanValue, zBooleanValue2, userProfileB, (j) lVar.f16153d.d());
    }

    static final ch c(l lVar) {
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_AADC_IS_FEATURE_ENABLED.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        kotlinx.coroutines.b.k kVarK2 = ConfigValues.CONFIG_VALUE_AADC_IS_AGE_REQUIRED.k();
        h.g.b.x.e(kVarK2, "getFlow(...)");
        ch chVarF = lVar.f16150a.f();
        h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
        kotlinx.coroutines.b.k kVarS = ai.s(kVarK, kVarK2, chVarF, lVar.f16153d, new k(lVar, null));
        int i2 = bz.f51630a;
        return ai.V(kVarS, lVar.f16151b, by.b(), (e) lVar.f16152c.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e g(boolean z, boolean z2, UserProfile userProfile, j jVar) {
        com.waze.shared_infra.q.i iVarA;
        if (!z || !z2) {
            return c.f16139a;
        }
        Long birthDateSec = userProfile.getBasicInfo().getBirthDateSec();
        if (birthDateSec != null) {
            int i2 = com.waze.shared_infra.q.i.f37938a;
            iVarA = new com.waze.shared_infra.q.i(TimeUnit.SECONDS.toMillis(birthDateSec.longValue()));
        } else if (h.g.b.x.n(jVar, h.f16142a)) {
            iVarA = null;
        } else {
            if (!(jVar instanceof i)) {
                throw new h.i();
            }
            iVarA = ((i) jVar).a();
        }
        if (iVarA == null) {
            return b.f16138a;
        }
        return new a(iVarA, jVar instanceof i ? ((i) jVar).b() : userProfile.getStatus().getAadcRestrictionMode());
    }

    @Override // com.waze.b.f
    public final ch a() {
        return (ch) this.f16154e.getValue();
    }

    @Override // com.waze.b.y
    public final void d() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f16153d;
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.f16142a));
    }

    @Override // com.waze.b.y
    public final void e(com.waze.shared_infra.q.i iVar, AgeRestrictionMode ageRestrictionMode) {
        bn bnVar;
        Object objD;
        h.g.b.x.f(iVar, "birthdate");
        h.g.b.x.f(ageRestrictionMode, "aadcAgeRestrictionMode");
        do {
            bnVar = this.f16153d;
            objD = bnVar.d();
        } while (!bnVar.f(objD, new i(iVar, ageRestrictionMode)));
    }
}
