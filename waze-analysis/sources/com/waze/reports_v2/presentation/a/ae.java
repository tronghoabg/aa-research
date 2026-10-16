package com.waze.reports_v2.presentation.a;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.waze.reports_v2.presentation.cg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f34632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f34633b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f34634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(ab abVar, Context context, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34634c = i2;
        this.f34632a = abVar;
        this.f34633b = context;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f34634c;
        Object obj2 = this.f34632a;
        if (i2 != 0) {
            return new ae((ab) obj2, (Context) this.f34633b, eVar, 1);
        }
        return new ae((az) obj2, (cg) this.f34633b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f34634c != 0 ? ((ae) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ae) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f34634c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((ab) this.f34632a).m(ContextCompat.checkSelfPermission((Context) this.f34633b, "android.permission.RECORD_AUDIO") == 0);
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ((az) this.f34632a).i((cg) this.f34633b);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(az azVar, cg cgVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34634c = i2;
        this.f34632a = azVar;
        this.f34633b = cgVar;
    }
}
