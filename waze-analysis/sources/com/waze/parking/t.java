package com.waze.parking;

import androidx.compose.runtime.State;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class t extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32991a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f32992b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32993c = i2;
        this.f32992b = state;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f32993c;
        if (i2 == 0) {
            return new t((y) this.f32992b, eVar, 0);
        }
        if (i2 == 1) {
            return new t((State) this.f32992b, eVar, 1);
        }
        Object obj2 = this.f32992b;
        return i2 != 2 ? new t((y) obj2, eVar, 3, (char[]) null) : new t((y) obj2, eVar, 2, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f32993c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((t) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((t) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((t) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((t) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f32993c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f32991a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f32991a = 1;
                obj = ai.h(((y) this.f32992b).f33004b.d(), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((y) this.f32992b).f33003a.f(((com.waze.sharedui.e.c) obj).f());
            return ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f32991a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f32991a = 1;
                if (aj.q(2000L, this) == aVar2) {
                    return aVar2;
                }
            }
            a.a.t(this.f32992b).invoke();
            return ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f32991a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                y yVar = (y) this.f32992b;
                this.f32991a = 1;
                if (ai.e(yVar.f33003a.d(), new x(yVar, null), this) == aVar3) {
                    return aVar3;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f32991a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            y yVar2 = (y) this.f32992b;
            this.f32991a = 1;
            if (ai.y(ai.q(yVar2.f33004b.d(), yVar2.f33003a.d(), new v(null))).collect(new w(yVar2), this) == aVar4) {
                return aVar4;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(y yVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32993c = i2;
        this.f32992b = yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(y yVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f32993c = i2;
        this.f32992b = yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(y yVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f32993c = i2;
        this.f32992b = yVar;
    }
}
