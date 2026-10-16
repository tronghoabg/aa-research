package com.waze.utils;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap implements com.waze.shared_infra.q.r {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f44856a;

    public ap(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "getCurrentTime");
        this.f44856a = aVar;
    }

    @Override // com.waze.shared_infra.q.r
    public final com.waze.shared_infra.q.k a(long j2, long j3) {
        return com.waze.ui.ad.b.g(j2, j3);
    }

    @Override // com.waze.shared_infra.q.r
    public final String b(long j2, String str, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        com.waze.shared_infra.q.k kVarG = com.waze.ui.ad.b.g(j2, ((Number) this.f44856a.invoke()).longValue());
        int iA = kVarG.a();
        String strH = iA != 0 ? iA != 1 ? com.waze.ui.ad.b.h(false, kVarG, aVar) : aVar.c(R.string.LAST_UPDATE_YESTERDAY_FORMAT, new Object[0]) : aVar.c(R.string.LAST_UPDATE_TODAY_FORMAT, new Object[0]);
        h.n.l lVar = new h.n.l("<USER>");
        String str2 = str;
        if (str2 == null || h.n.o.G(str2)) {
            str = aVar.c(R.string.WAZER, new Object[0]);
        }
        return lVar.b(strH, str);
    }

    @Override // com.waze.shared_infra.q.r
    public final String c(long j2, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        com.waze.shared_infra.q.k kVarG = com.waze.ui.ad.b.g(j2, ((Number) this.f44856a.invoke()).longValue());
        return kVarG.c() > 1 ? aVar.c(R.string.PD_YEARS_AGO, Integer.valueOf(kVarG.c())) : kVarG.c() == 1 ? aVar.c(R.string.ONE_YEAR_AGO, new Object[0]) : kVarG.b() > 1 ? aVar.c(R.string.PD_MONTHS_AGO, Integer.valueOf(kVarG.b())) : kVarG.b() == 1 ? aVar.c(R.string.ONE_MONTH_AGO, new Object[0]) : kVarG.a() > 1 ? aVar.c(R.string.PD_DAYS_AGO, Integer.valueOf(kVarG.a())) : kVarG.a() == 1 ? aVar.c(R.string.ONE_DAY_AGO, new Object[0]) : aVar.c(R.string.TODAY, new Object[0]);
    }

    @Override // com.waze.shared_infra.q.r
    public final String d(long j2, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        com.waze.shared_infra.q.k kVarG = com.waze.ui.ad.b.g(j2, ((Number) this.f44856a.invoke()).longValue());
        int iA = kVarG.a();
        return iA != 0 ? iA != 1 ? com.waze.ui.ad.b.h(true, kVarG, aVar) : aVar.c(R.string.LAST_UPDATE_YESTERDAY_SHORT_FORMAT, new Object[0]) : aVar.c(R.string.LAST_UPDATE_TODAY_SHORT_FORMAT, new Object[0]);
    }
}
