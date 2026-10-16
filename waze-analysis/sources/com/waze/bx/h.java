package com.waze.bx;

import com.waze.config.ConfigValues;
import com.waze.nightmode.t;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f18190a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18191b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.waze.an.a.a.p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18192c = i2;
        this.f18191b = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18192c;
        Object obj2 = this.f18191b;
        return i2 != 0 ? new h((com.waze.an.a.a.p) obj2, eVar, 1) : new h((i) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f18192c != 0 ? ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f18192c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18190a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18190a = 1;
                if (aj.q(10000L, this) == aVar) {
                    return aVar;
                }
            }
            ((i) this.f18191b).x("Toggling day-night mode now.");
            ConfigValues.CONFIG_VALUE_DISPLAY_MAP_SUB_SKIN.d(true != t.f() ? "day" : "night");
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f18190a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f18190a = 1;
            if (aj.q(5000L, this) == aVar2) {
                return aVar2;
            }
        }
        Object obj2 = this.f18191b;
        if (obj2 != null) {
            ((com.waze.an.a.a.p) obj2).g();
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18192c = i2;
        this.f18191b = iVar;
    }
}
