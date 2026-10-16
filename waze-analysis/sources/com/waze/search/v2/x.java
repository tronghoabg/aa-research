package com.waze.search.v2;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f36640a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f36641b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f36642c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f36643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(MutableState mutableState, ck ckVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36643d = i2;
        this.f36642c = mutableState;
        this.f36641b = ckVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.br.c.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f36643d;
        if (i2 == 0) {
            return new x((com.waze.br.c.o) this.f36641b, (SearchV2Activity) this.f36642c, eVar, 0);
        }
        if (i2 == 1) {
            return new x((MutableState) this.f36642c, (ck) this.f36641b, eVar, 1);
        }
        Object obj2 = this.f36641b;
        if (i2 != 2) {
            return new x((fi) obj2, (com.waze.av.d.k) this.f36642c, eVar, 3);
        }
        return new x((fi) obj2, (com.waze.speech.k) this.f36642c, eVar, 2);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f36643d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.waze.br.c.o, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f36643d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f36640a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ?? r7 = this.f36641b;
                kotlinx.coroutines.b.ch chVarA = r7.a();
                Object obj2 = this.f36642c;
                this.f36640a = 1;
                if (FlowExtKt.flowWithLifecycle(chVarA, ((android.support.v4.app.dd) obj2).getLifecycle(), Lifecycle.State.RESUMED).collect(new w(r7, (SearchV2Activity) obj2), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f36640a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f36640a = 1;
                if (SnapshotStateKt.snapshotFlow(new com.waze.bi.a(this.f36642c, 4)).collect(new em(this.f36641b, 1), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f36640a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f36641b;
                Object obj4 = this.f36642c;
                this.f36640a = 1;
                if (fi.U((fi) obj3, (com.waze.av.d.k) obj4, this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f36640a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj5 = this.f36641b;
            Object obj6 = this.f36642c;
            this.f36640a = 1;
            if (fi.Z((fi) obj5, (com.waze.speech.k) obj6, this) == aVar4) {
                return aVar4;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(com.waze.br.c.o oVar, SearchV2Activity searchV2Activity, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36643d = i2;
        this.f36641b = oVar;
        this.f36642c = searchV2Activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(fi fiVar, com.waze.av.d.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36643d = i2;
        this.f36641b = fiVar;
        this.f36642c = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(fi fiVar, com.waze.speech.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36643d = i2;
        this.f36641b = fiVar;
        this.f36642c = kVar;
    }
}
