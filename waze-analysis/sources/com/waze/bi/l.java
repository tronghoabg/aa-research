package com.waze.bi;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f16820a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16821b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f16822c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f16823d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f16824e;

    public l(h.g.a.l lVar, Map map) {
        x.f(lVar, "saveClearedNotifications");
        x.f(map, "initialClearedNotifications");
        this.f16820a = lVar;
        this.f16821b = map;
        this.f16822c = ck.b(false);
        this.f16823d = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f16824e = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    private final void e(String str, long j2) {
        this.f16824e.put(str, Long.valueOf(j2));
    }

    @Override // com.waze.bi.g
    public final /* synthetic */ ch a() {
        return this.f16822c;
    }

    @Override // com.waze.bi.g
    public final void b(String str) {
        x.f(str, TtmlNode.ATTR_ID);
        Map map = this.f16823d;
        Long l2 = (Long) map.remove(str);
        if (l2 != null) {
            e(str, l2.longValue());
            this.f16820a.invoke(this.f16824e);
        }
        if (map.isEmpty()) {
            this.f16822c.e(false);
        }
    }

    @Override // com.waze.bi.g
    public final void c() {
        Map map = this.f16823d;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            x.c(obj);
            e(str, ((Number) obj).longValue());
        }
        map.clear();
        this.f16820a.invoke(this.f16824e);
        this.f16822c.e(false);
    }

    @Override // com.waze.bi.g
    public final void d(String str, long j2) {
        x.f(str, TtmlNode.ATTR_ID);
        Object obj = this.f16824e.get(str);
        if (obj == null) {
            obj = 0L;
        }
        if (((Number) obj).longValue() < j2) {
            Map map = this.f16823d;
            if (!map.containsKey(str)) {
                this.f16822c.e(true);
            }
            map.put(str, Long.valueOf(j2));
        }
    }
}
