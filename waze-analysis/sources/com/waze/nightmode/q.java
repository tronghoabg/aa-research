package com.waze.nightmode;

import com.waze.ConfigManager;
import com.waze.bc;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f32488a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f32489b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32489b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f32489b != 0) {
            q qVar = new q(eVar, 1, null);
            qVar.f32488a = ((Boolean) obj).booleanValue();
            return qVar;
        }
        q qVar2 = new q(eVar, 0);
        qVar2.f32488a = ((Boolean) obj).booleanValue();
        return qVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f32489b != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((q) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((q) create(bool2, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f32489b == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            t.f32500g.e(Boolean.valueOf(this.f32488a));
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f32488a;
        ConfigManager configManager = ConfigManager.getInstance();
        h.g.b.x.e(configManager, "getInstance(...)");
        bc.setMapSkin$default(configManager, true != z ? "day" : "night", null, 2, null);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f32489b = i2;
    }
}
