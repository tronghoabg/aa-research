package com.moloco.sdk.acm.db;

import a9.C1342b;
import ff.o;
import java.util.List;
import k3.AbstractC3173e;
import kotlin.jvm.internal.AbstractC3340k;
import o3.g;

/* loaded from: classes4.dex */
public final class d extends AbstractC3173e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f28361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, MetricsDb_Impl metricsDb_Impl, int i5) {
        super(metricsDb_Impl);
        this.f28360d = i5;
        this.f28361e = eVar;
    }

    @Override // E9.c
    public final String d() {
        switch (this.f28360d) {
            case 0:
                return "INSERT OR REPLACE INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    @Override // k3.AbstractC3173e
    public final void w(g gVar, Object obj) {
        switch (this.f28360d) {
            case 0:
                a aVar = (a) obj;
                gVar.G(1, aVar.f28346a);
                String str = aVar.f28347b;
                if (str == null) {
                    gVar.N(2);
                } else {
                    gVar.x(2, str);
                }
                gVar.G(3, aVar.f28348c);
                C1342b c1342b = this.f28361e.f28364c;
                b eventType = aVar.f28349d;
                AbstractC3340k.e(eventType, "eventType");
                String strName = eventType.name();
                if (strName == null) {
                    gVar.N(4);
                } else {
                    gVar.x(4, strName);
                }
                Long l10 = aVar.f28350e;
                if (l10 == null) {
                    gVar.N(5);
                } else {
                    gVar.G(5, l10.longValue());
                }
                List tags = aVar.f28351f;
                AbstractC3340k.e(tags, "tags");
                String strW0 = o.w0(tags, ",", null, null, null, 62);
                if (strW0 != null) {
                    gVar.x(6, strW0);
                    break;
                } else {
                    gVar.N(6);
                    break;
                }
            default:
                a aVar2 = (a) obj;
                gVar.G(1, aVar2.f28346a);
                String str2 = aVar2.f28347b;
                if (str2 == null) {
                    gVar.N(2);
                } else {
                    gVar.x(2, str2);
                }
                gVar.G(3, aVar2.f28348c);
                C1342b c1342b2 = this.f28361e.f28364c;
                b eventType2 = aVar2.f28349d;
                AbstractC3340k.e(eventType2, "eventType");
                String strName2 = eventType2.name();
                if (strName2 == null) {
                    gVar.N(4);
                } else {
                    gVar.x(4, strName2);
                }
                Long l11 = aVar2.f28350e;
                if (l11 == null) {
                    gVar.N(5);
                } else {
                    gVar.G(5, l11.longValue());
                }
                List tags2 = aVar2.f28351f;
                AbstractC3340k.e(tags2, "tags");
                String strW02 = o.w0(tags2, ",", null, null, null, 62);
                if (strW02 != null) {
                    gVar.x(6, strW02);
                    break;
                } else {
                    gVar.N(6);
                    break;
                }
        }
    }
}
