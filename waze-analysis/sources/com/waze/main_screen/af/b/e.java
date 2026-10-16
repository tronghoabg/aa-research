package com.waze.main_screen.af.b;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotStateKt;
import com.waze.asks.ah;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25792a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableIntState f25793b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f25794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(MutableIntState mutableIntState, ah ahVar, h.c.e eVar) {
        super(2, eVar);
        this.f25793b = mutableIntState;
        this.f25794c = ahVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f25793b, this.f25794c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25792a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f25792a = 1;
            if (SnapshotStateKt.snapshotFlow(new c(this.f25793b)).collect(new d(this.f25794c), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
