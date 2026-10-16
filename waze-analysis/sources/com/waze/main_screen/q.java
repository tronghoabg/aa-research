package com.waze.main_screen;

import androidx.navigation.NavController;
import androidx.navigation.NavHostController;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27373a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(NavHostController navHostController, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27374b = i2;
        this.f27373a = navHostController;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27374b;
        if (i2 == 0) {
            return new q((NavHostController) this.f27373a, eVar, 0);
        }
        Object obj2 = this.f27373a;
        return i2 != 1 ? new q((ab) obj2, eVar, 2) : new q((NavHostController) obj2, eVar, 1, null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27374b;
        return i2 != 0 ? i2 != 1 ? ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27374b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((NavController) this.f27373a).popBackStack();
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((ab) this.f27373a).n();
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ((NavController) this.f27373a).popBackStack();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(NavHostController navHostController, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27374b = i2;
        this.f27373a = navHostController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27374b = i2;
        this.f27373a = abVar;
    }
}
