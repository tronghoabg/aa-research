package com.waze.b;

import com.waze.sharedui.profile.AgeRestrictionMode;
import com.waze.sharedui.profile.UserProfile;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w implements u {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f16175b;

    /* renamed from: c, reason: collision with root package name */
    private final f f16176c;

    /* renamed from: d, reason: collision with root package name */
    private final af f16177d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f16178e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f16179f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f16180g;

    public w(com.waze.sharedui.profile.b bVar, f fVar, af afVar) {
        h.g.b.x.f(bVar, "profileManager");
        h.g.b.x.f(fVar, "aadcAgeRestrictionRepository");
        h.g.b.x.f(afVar, "coroutineScope");
        this.f16175b = bVar;
        this.f16176c = fVar;
        this.f16177d = afVar;
        this.f16178e = h.g.a(new g(this, 2));
        this.f16179f = h.g.a(new g(this, 3));
        ch chVarF = bVar.f();
        h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
        this.f16180g = chVarF;
    }

    static final s b(w wVar) {
        e eVar = (e) wVar.f16176c.a().d();
        UserProfile userProfileB = wVar.f16175b.b();
        h.g.b.x.e(userProfileB, "getMyProfile(...)");
        return e(eVar, userProfileB);
    }

    static final ch c(w wVar) {
        kotlinx.coroutines.b.k kVarQ = ai.q(wVar.f16176c.a(), wVar.f16180g, new v(wVar, null));
        int i2 = bz.f51630a;
        return ai.V(kVarQ, wVar.f16177d, by.b(), (s) wVar.f16178e.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s e(e eVar, UserProfile userProfile) {
        AgeRestrictionMode ageRestrictionModeB;
        com.waze.shared_infra.q.i iVar;
        if (h.g.b.x.n(eVar, c.f16139a) || h.g.b.x.n(eVar, b.f16138a)) {
            ageRestrictionModeB = AgeRestrictionMode.UNRESTRICTED;
            iVar = null;
        } else {
            if (!(eVar instanceof a)) {
                throw new h.i();
            }
            a aVar = (a) eVar;
            iVar = aVar.a();
            ageRestrictionModeB = aVar.b();
        }
        AgeRestrictionMode u18RestrictionMode = userProfile.isValid() ? userProfile.getStatus().getU18RestrictionMode() : AgeRestrictionMode.INVALID;
        AgeRestrictionMode ageRestrictionMode = AgeRestrictionMode.RESTRICTED;
        boolean z = true;
        if (ageRestrictionModeB != ageRestrictionMode && u18RestrictionMode != ageRestrictionMode) {
            z = false;
        }
        Long birthDateSec = userProfile.getBasicInfo().getBirthDateSec();
        if (birthDateSec != null) {
            long jLongValue = birthDateSec.longValue();
            int i2 = com.waze.shared_infra.q.i.f37938a;
            iVar = new com.waze.shared_infra.q.i(TimeUnit.SECONDS.toMillis(jLongValue));
        }
        return new s(z, iVar, eVar, new z(u18RestrictionMode));
    }

    @Override // com.waze.b.u
    public final ch a() {
        return (ch) this.f16179f.getValue();
    }
}
