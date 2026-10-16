package com.waze.trip_overview.c.a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.waze.map.b.dz;
import com.waze.trip_overview.views.RouteHeader;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f41245a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ int f41246b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f41247c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ab f41248d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ View f41249e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ RouteHeader f41250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(ab abVar, View view, RouteHeader routeHeader, h.c.e eVar) {
        super(3, eVar);
        this.f41248d = abVar;
        this.f41249e = view;
        this.f41250f = routeHeader;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        p pVar = new p(this.f41248d, this.f41249e, this.f41250f, (h.c.e) obj3);
        pVar.f41246b = iIntValue;
        pVar.f41247c = (com.waze.speech.k) obj2;
        return pVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f41245a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            int i2 = this.f41246b;
            com.waze.speech.k kVar = (com.waze.speech.k) this.f41247c;
            ab abVar = this.f41248d;
            View view = this.f41249e;
            RouteHeader routeHeader = this.f41250f;
            ComposeView composeViewD = abVar.D();
            if (kVar == null) {
                composeViewD = null;
            }
            this.f41245a = 1;
            obj = ab.j(abVar, view, routeHeader, composeViewD, i2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new dz((Rect) obj);
    }
}
