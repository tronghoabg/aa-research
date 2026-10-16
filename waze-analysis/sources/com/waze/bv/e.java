package com.waze.bv;

import com.waze.config.ConfigValues;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f17512a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17513b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f17514c;

    public e(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = new e((h.c.e) obj3);
        eVar.f17514c = (kotlinx.coroutines.b.l) obj;
        eVar.f17513b = (Object[]) obj2;
        return eVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17512a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f17514c;
            Boolean boolB = ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEEDOMETER.b();
            h.g.b.x.e(boolB, "getValue(...)");
            boolean zBooleanValue = boolB.booleanValue();
            Boolean boolB2 = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_ENABLED.b();
            h.g.b.x.e(boolB2, "getValue(...)");
            boolean zBooleanValue2 = boolB2.booleanValue();
            String strB = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_USER_ENABLED.b();
            Boolean boolB3 = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_SOUNDS.b();
            h.g.b.x.e(boolB3, "getValue(...)");
            boolean zBooleanValue3 = boolB3.booleanValue();
            Boolean boolB4 = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_DEBUG_SPEED_LIMIT.b();
            h.g.b.x.e(boolB4, "getValue(...)");
            d dVar = new d(zBooleanValue, zBooleanValue2, strB, zBooleanValue3, boolB4.booleanValue(), (int) ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_ALERT_OFFSET.b().longValue(), ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_STYLE.b());
            this.f17512a = 1;
            if (lVar.emit(dVar, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
