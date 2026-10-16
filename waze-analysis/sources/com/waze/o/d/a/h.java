package com.waze.o.d.a;

import androidx.car.app.CarContext;
import com.waze.R;
import com.waze.car_lib.f.gh;
import com.waze.car_lib.p.cy;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32848a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f32849b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f32850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, CarContext carContext, h.c.e eVar) {
        super(2, eVar);
        this.f32849b = iVar;
        this.f32850c = carContext;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f32849b, this.f32850c, eVar);
        hVar.f32848a = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((s) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        s sVar = (s) this.f32848a;
        i iVar = this.f32849b;
        com.waze.shared_infra.o.a aVar3 = iVar.f32852b;
        if (x.n(sVar, p.f32864a)) {
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_SUBTITLE_PROCESSING_GENERAL, new Object[0]), null, R.drawable.icon_report_conversational_processing_vector);
        } else if (x.n(sVar, o.f32863a)) {
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_LISTENING, new Object[0]), null, R.drawable.icon_report_conversational_listening_vector);
        } else if (x.n(sVar, r.f32866a)) {
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_SUBTITLE_SPEAKING, new Object[0]), null, R.drawable.icon_report_conversational_listening_vector);
        } else if (x.n(sVar, q.f32865a)) {
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_SUBTITLE_PROCESSING_GENERAL, new Object[0]), null, R.drawable.icon_report_conversational_processing_vector);
        } else if (x.n(sVar, l.f32860a)) {
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_SUBTITLE_CANCELED, new Object[0]), null, R.drawable.icon_report_conversational_cancel_vector);
        } else if (x.n(sVar, k.f32859a)) {
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_CANCELED, new Object[0]), aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_SUBTITLE_CANCELED, new Object[0]), R.drawable.icon_report_conversational_cancel_vector);
        } else if (x.n(sVar, n.f32862a)) {
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_ERROR, new Object[0]), null, R.drawable.icon_report_conversational_error_vector);
        } else {
            if (!x.n(sVar, m.f32861a)) {
                throw new h.i();
            }
            aVar = new a(aVar3.c(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_ERROR, new Object[0]), null, R.drawable.icon_report_conversational_error_vector);
        }
        cy cyVar = new cy(aVar3.c(R.string.COMPANINIO_BOTTOM_SHEET_TITLE, new Object[0]), true, h.a.i.d(new com.waze.car_lib.p.t(aVar.c(), aVar.a(), "COMPANINIO_MAIN_ITEM_ID", aVar.b())));
        f fVar = new f(iVar);
        iVar.q(gh.c(cyVar, this.f32850c, new g(iVar), fVar));
        if (sVar instanceof l) {
            i.e(iVar);
        }
        return ab.f48028a;
    }
}
