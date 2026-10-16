package com.waze.cb;

import com.waze.sharedui.profile.AgeRestrictionMode;
import com.waze.sharedui.profile.UserProfile;
import com.waze.sharedui.profile.UserProfileSource;
import com.waze.uid.b.ab;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f22118a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f22119b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.b.o f22120c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22121d;

    /* renamed from: e, reason: collision with root package name */
    private final j f22122e;

    /* renamed from: f, reason: collision with root package name */
    private final ab f22123f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f22124g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f22125h;

    /* renamed from: i, reason: collision with root package name */
    private final String f22126i;

    /* renamed from: j, reason: collision with root package name */
    private com.waze.app_nav.hub.c.b f22127j;

    public s(com.waze.sharedui.profile.b bVar, com.waze.shared_infra.o.a aVar, com.waze.b.o oVar, com.waze.shared_infra.i.e eVar, j jVar, ab abVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        x.f(bVar, "profileManager");
        x.f(aVar, "stringProvider");
        x.f(oVar, "ageRestrictionApi");
        x.f(eVar, "logger");
        x.f(jVar, "u16BlockScreenController");
        x.f(abVar, "uidEventsController");
        x.f(aVar2, "isU16Enabled");
        x.f(aVar3, "silentLogOut");
        this.f22118a = bVar;
        this.f22119b = aVar;
        this.f22120c = oVar;
        this.f22121d = eVar;
        this.f22122e = jVar;
        this.f22123f = abVar;
        this.f22124g = aVar2;
        this.f22125h = aVar3;
        String canonicalName = s.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f22126i = canonicalName;
    }

    public static final /* synthetic */ void f(final s sVar, UserProfile userProfile, final af afVar) {
        if (userProfile.getSource() == UserProfileSource.CACHE) {
            sVar.f22121d.e("profile updates from a cached profile are to be ignored");
            return;
        }
        if (!((Boolean) sVar.f22124g.invoke()).booleanValue()) {
            sVar.f22121d.e("isU16Enabled == false");
            return;
        }
        Long birthDateSec = userProfile.getBasicInfo().getBirthDateSec();
        if (birthDateSec != null) {
            final com.waze.shared_infra.q.i iVar = new com.waze.shared_infra.q.i(birthDateSec.longValue() * 1000);
            AgeRestrictionMode u16RestrictionMode = userProfile.getStatus().getU16RestrictionMode();
            AgeRestrictionMode ageRestrictionMode = AgeRestrictionMode.INVALID;
            if (u16RestrictionMode.ordinal() != 2) {
                com.waze.app_nav.hub.c.b bVar = sVar.f22127j;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            }
            if (userProfile.getStatus().isAgeConfirmed()) {
                sVar.f22123f.f();
                sVar.f22127j = sVar.f22122e.b(com.waze.uid.stats.b.f44725c);
                sVar.f22125h.invoke();
            } else {
                final int i2 = 1;
                final int i3 = 0;
                sVar.f22127j = sVar.f22122e.a(com.waze.uid.stats.b.f44725c, iVar, new h.g.a.a() { // from class: com.waze.cb.n
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i4 = i2;
                        com.waze.shared_infra.q.i iVar2 = iVar;
                        if (i4 != 0) {
                            aj.z(afVar, null, null, new o(sVar, iVar2, null, 1, null), 3);
                            return h.ab.f48028a;
                        }
                        aj.z(afVar, null, null, new o(sVar, iVar2, null, 0), 3);
                        return h.ab.f48028a;
                    }
                }, new h.g.a.a() { // from class: com.waze.cb.n
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i4 = i3;
                        com.waze.shared_infra.q.i iVar2 = iVar;
                        if (i4 != 0) {
                            aj.z(afVar, null, null, new o(sVar, iVar2, null, 1, null), 3);
                            return h.ab.f48028a;
                        }
                        aj.z(afVar, null, null, new o(sVar, iVar2, null, 0), 3);
                        return h.ab.f48028a;
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.cb.p
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.cb.p r0 = (com.waze.cb.p) r0
            int r1 = r0.f22112c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22112c = r1
            goto L18
        L13:
            com.waze.cb.p r0 = new com.waze.cb.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22110a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22112c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r5)
            goto L43
        L2f:
            e.b.c.b(r5)
            com.waze.cb.r r5 = new com.waze.cb.r
            r2 = 0
            r5.<init>(r4, r2)
            h.g.a.p r5 = (h.g.a.p) r5
            r0.f22112c = r3
            java.lang.Object r4 = kotlinx.coroutines.aj.O(r5, r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cb.s.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f22126i;
    }
}
