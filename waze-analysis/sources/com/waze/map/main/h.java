package com.waze.map.main;

import android.content.res.Resources;
import com.waze.map.b.dw;
import com.waze.map.gu;
import com.waze.user.UserData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29426a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.map.bq f29427b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f29428c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f29429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.waze.map.bq bqVar, h.g.b.aq aqVar, p pVar, h.c.e eVar) {
        super(2, eVar);
        this.f29427b = bqVar;
        this.f29428c = aqVar;
        this.f29429d = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f29427b, this.f29428c, this.f29429d, eVar);
        hVar.f29426a = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((com.waze.view.popups.a.n) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int iT;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.view.popups.a.n nVar = (com.waze.view.popups.a.n) this.f29426a;
        if (nVar == null) {
            this.f29427b.z();
            return h.ab.f48028a;
        }
        dw dwVarC = nVar.c();
        if (dwVarC != null) {
            h.g.b.aq aqVar = this.f29428c;
            Integer num = (Integer) aqVar.f48105a;
            int iA = nVar.a();
            if (num != null && num.intValue() == iA) {
                gu guVarA = nVar.b().a();
                gu guVar = gu.f29181a;
                if (guVarA.ordinal() != 10) {
                    iT = dwVarC.b();
                } else {
                    int iB = dwVarC.b();
                    Resources resources = this.f29429d.getResources();
                    h.g.b.x.e(resources, "getResources(...)");
                    iT = com.waze.z.a.d.ai.t(resources, guVarA) + iB;
                }
                com.waze.map.bq bqVar = this.f29427b;
                int iA2 = dwVarC.a();
                if (nVar.b().a() == gu.f29191k) {
                    bqVar.s(iA2, iT);
                } else {
                    bqVar.p(iA2, iT);
                }
                if (nVar.b() instanceof com.waze.map.bj) {
                    ((com.waze.map.bj) nVar.b()).a().a().getNumber();
                    bqVar.A(((com.waze.map.bj) nVar.b()).f28403c, ((com.waze.map.bj) nVar.b()).f28404d);
                }
            } else {
                aqVar.f48105a = new Integer(nVar.a());
                p pVar = this.f29429d;
                Resources resources2 = pVar.getResources();
                h.g.b.x.e(resources2, "getResources(...)");
                int iT2 = com.waze.z.a.d.ai.t(resources2, nVar.b().a());
                com.waze.map.bl blVarB = nVar.b();
                if (blVarB instanceof com.waze.map.bj) {
                    this.f29427b.n((com.waze.map.bj) blVarB, dwVarC.a(), dwVarC.b(), iT2);
                } else {
                    if (!(blVarB instanceof com.waze.map.bk)) {
                        throw new h.i();
                    }
                    com.waze.map.bq bqVar2 = this.f29427b;
                    android.support.v4.app.av avVarRequireActivity = pVar.requireActivity();
                    com.waze.map.bk bkVar = (com.waze.map.bk) blVarB;
                    h.g.b.x.f(bkVar, "<this>");
                    UserData userData = new UserData();
                    userData.mID = bkVar.f28413a;
                    userData.mNickName = bkVar.f28414b;
                    userData.mMood = bkVar.f28415c;
                    userData.mAddonName = bkVar.f28416d;
                    userData.mPtsStr = bkVar.f28417e;
                    userData.mJoinedStr = bkVar.f28418f;
                    userData.mSpeedStr = bkVar.f28419g;
                    userData.mAzimuth = bkVar.f28420h;
                    com.waze.shared_infra.h.c cVar = bkVar.f28421i;
                    userData.mLongitude = cVar.d();
                    userData.mLatitude = cVar.c();
                    bqVar2.o(avVarRequireActivity, userData, dwVarC.a(), dwVarC.b() + iT2);
                }
            }
        }
        return h.ab.f48028a;
    }
}
