package com.waze.bi;

import com.waze.inbox.aa;
import h.ab;
import h.g.b.u;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class d extends u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f16809a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2) {
        super(1, obj, b.class, "saveNotifications", "saveNotifications(Ljava/util/Map;)V", 0);
        this.f16809a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f16809a != 0) {
            ((aa) this.receiver).b(((Number) obj).longValue());
            return ab.f48028a;
        }
        Map map = (Map) obj;
        x.f(map, "p0");
        ((b) this.receiver).c(map);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, byte[] bArr) {
        super(1, obj, aa.class, "saveTimetamp", "saveTimetamp(J)V", 0);
        this.f16809a = i2;
    }
}
