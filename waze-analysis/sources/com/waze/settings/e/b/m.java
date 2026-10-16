package com.waze.settings.e.b;

import androidx.lifecycle.ViewModel;
import com.waze.settings.c.n;
import com.waze.settings.dy;
import com.waze.settings.gu;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.e.a.e f37150a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.e.c.a f37151b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f37152c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f37153d;

    /* renamed from: e, reason: collision with root package name */
    private final bm f37154e;

    /* renamed from: f, reason: collision with root package name */
    private final bq f37155f;

    /* renamed from: g, reason: collision with root package name */
    private String f37156g;

    public m(com.waze.settings.e.a.e eVar, com.waze.settings.e.c.a aVar, com.waze.shared_infra.i.e eVar2) {
        Object objD;
        x.f(eVar, "hncSettingsDataSource");
        x.f(aVar, "hncStatsSender");
        x.f(eVar2, "logger");
        this.f37150a = eVar;
        this.f37151b = aVar;
        bn bnVarB = ck.b(new com.waze.ui.k.i("", h.a.i.h(), false, !o.G(eVar.b())));
        this.f37152c = bnVarB;
        this.f37153d = ai.U(bnVarB);
        String str = null;
        bm bmVarE = bu.e(0, 1, null, 5);
        this.f37154e = bmVarE;
        this.f37155f = ai.S(bmVarE);
        eVar.g();
        List listD = eVar.d();
        if (listD.size() > 1) {
            eVar2.g("More than one active HNC permit, clearing all. (" + listD + ")");
            eVar.f();
        } else {
            str = (String) h.a.i.R(listD);
        }
        List<String> listE = eVar.e();
        ArrayList arrayList = new ArrayList(h.a.i.q(listE, 10));
        for (String str2 : listE) {
            com.waze.settings.e.a.d dVarA = this.f37150a.a(str2);
            arrayList.add(new com.waze.ui.k.h(str2, gu.h(dVarA), gu.g(dVarA), x.n(str, str2)));
        }
        ArrayList arrayList2 = arrayList;
        String strC = this.f37150a.c();
        this.f37156g = strC;
        bn bnVar = this.f37152c;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, n.d(com.waze.ui.k.i.e((com.waze.ui.k.i) objD, strC, arrayList2, false, 12))));
        this.f37151b.d(dy.f37098a, null);
    }

    public final bq a() {
        return this.f37155f;
    }

    public final ch b() {
        return this.f37153d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.waze.ui.k.g r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.e.b.m.c(com.waze.ui.k.g):void");
    }
}
