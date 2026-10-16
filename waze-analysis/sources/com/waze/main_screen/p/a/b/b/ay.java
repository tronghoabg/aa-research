package com.waze.main_screen.p.a.b.b;

import com.waze.config.ConfigValues;
import com.waze.navigate.fu;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ay extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26935a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ az f26936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(az azVar, h.c.e eVar) {
        super(2, eVar);
        this.f26936b = azVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ay(this.f26936b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.waze.main_screen.p.a.b.b.ay] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.waze.main_screen.p.a.b.b.az] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        al alVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            try {
                if (this.f26935a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Long lB = ConfigValues.CONFIG_VALUE_PLAN_DRIVE_SHOW_TIME_IN_ETA.b();
                    h.g.b.x.e(lB, "getValue(...)");
                    this.f26935a = 1;
                    if (kotlinx.coroutines.aj.r(h.o.c.j(lB.longValue(), h.o.d.f48273d), this) == aVar) {
                        return aVar;
                    }
                }
                this = this.f26936b;
                ((az) this).f26942f = null;
                bn bnVar = ((az) this).f26943g;
                do {
                    objD = bnVar.d();
                    alVar = (al) objD;
                } while (!bnVar.f(objD, al.b(alVar, null, fu.c(alVar.f26914b, null, false, 1), null, false, 13)));
                return h.ab.f48028a;
            } catch (CancellationException unused) {
                h.ab abVar = h.ab.f48028a;
                this.f26936b.f26942f = null;
                return abVar;
            }
        } catch (Throwable th) {
            this.f26936b.f26942f = null;
            throw th;
        }
    }
}
