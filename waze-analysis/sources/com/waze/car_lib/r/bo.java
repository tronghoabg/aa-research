package com.waze.car_lib.r;

import android.content.Context;
import com.waze.config.ConfigValues;
import com.waze.navbar.InstructionView;
import com.waze.ui.navbar.LaneGuidanceView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bo extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21073a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21074b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bp f21075c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f21076d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ LaneGuidanceView f21077e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InstructionView f21078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bp bpVar, Context context, LaneGuidanceView laneGuidanceView, InstructionView instructionView, h.c.e eVar) {
        super(3, eVar);
        this.f21075c = bpVar;
        this.f21076d = context;
        this.f21077e = laneGuidanceView;
        this.f21078f = instructionView;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        bo boVar = new bo(this.f21075c, this.f21076d, this.f21077e, this.f21078f, (h.c.e) obj3);
        boVar.f21073a = (com.waze.navigate.cq) obj;
        boVar.f21074b = (com.waze.navigate.bv) obj2;
        return boVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        ce ceVarE;
        com.waze.navigate.cp cpVarB;
        com.waze.navigate.cp cpVarA;
        com.waze.navigate.cp cpVarA2;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.navigate.cq cqVar = (com.waze.navigate.cq) this.f21073a;
        com.waze.navigate.bv bvVar = (com.waze.navigate.bv) this.f21074b;
        ce ceVarE2 = null;
        if (cqVar == null || (cpVarA2 = cqVar.a()) == null) {
            ceVarE = null;
        } else {
            Context context = this.f21076d;
            LaneGuidanceView laneGuidanceView = this.f21077e;
            InstructionView instructionView = this.f21078f;
            Boolean boolB = ConfigValues.CONFIG_VALUE_LANE_GUIDANCE_SHOW_INSTURCTION_ICON_WHEN_SHOWING_LANE_GUIDANCE_ON_ROUNDABOUTS.b();
            h.g.b.x.e(boolB, "getValue(...)");
            ceVarE = bp.e(cpVarA2, context, laneGuidanceView, bvVar, instructionView, boolB.booleanValue());
        }
        com.waze.navigate.de deVarA = (cqVar == null || (cpVarA = cqVar.a()) == null) ? null : cpVarA.a();
        if (cqVar != null && (cpVarB = cqVar.b()) != null) {
            ceVarE2 = bp.e(cpVarB, this.f21076d, this.f21077e, bvVar, this.f21078f, false);
        }
        return new cf(ceVarE, deVarA, ceVarE2);
    }
}
