package com.waze.car_lib.o;

import com.waze.ix;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class g extends h.g.b.u implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Object obj, int i2) {
        super(2, obj, com.waze.car_lib.c.a.class, "reportPersonalizedAds", "reportPersonalizedAds(ZLjava/util/List;)V", 0);
        this.f20469a = i2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f20469a;
        if (i2 == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            List list = (List) obj2;
            h.g.b.x.f(list, "p1");
            h.g.b.x.f(list, "strings");
            ix.k(zBooleanValue, list);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            List list2 = (List) obj2;
            h.g.b.x.f(list2, "p1");
            com.waze.car_lib.c.a.c(zBooleanValue2, list2);
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
            List list3 = (List) obj2;
            h.g.b.x.f(list3, "p1");
            ((com.waze.car_lib.c.a) this.receiver).b(zBooleanValue3, list3);
            return h.ab.f48028a;
        }
        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
        List list4 = (List) obj2;
        h.g.b.x.f(list4, "p1");
        com.waze.car_lib.c.a.c(zBooleanValue4, list4);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Object obj, int i2, byte[] bArr) {
        super(2, obj, com.waze.car_lib.c.a.class, "reportInvisibleMode", "reportInvisibleMode(ZLjava/util/List;)V", 0);
        this.f20469a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Object obj, int i2, char[] cArr) {
        super(2, obj, com.waze.car_lib.c.a.class, "reportTripSuggestions", "reportTripSuggestions(ZLjava/util/List;)V", 0);
        this.f20469a = i2;
    }
}
