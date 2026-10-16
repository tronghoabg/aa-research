package com.waze.ui.z;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.waze.sound.gv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43905a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.b.ab f43906b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f43907c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f43908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(MutableState mutableState, com.waze.z.a.b.ab abVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43908d = i2;
        this.f43907c = mutableState;
        this.f43906b = abVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f43908d;
        return i2 != 0 ? i2 != 1 ? new ai(this.f43906b, (State) this.f43907c, eVar, 2) : new ai((MutableState) this.f43907c, this.f43906b, eVar, 1) : new ai(this.f43906b, (LazyListState) this.f43907c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f43908d;
        return i2 != 0 ? i2 != 1 ? ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f43908d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f43905a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f43905a = 1;
                if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new gv(this.f43906b, 15))), new ah((LazyListState) this.f43907c, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f43905a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f43905a = 1;
                if (kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new gv(this.f43906b, 16))).collect(new aj(this.f43907c), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f43905a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ?? r6 = this.f43907c;
            if (!((Boolean) r6.getValue()).booleanValue()) {
                r6.setValue(true);
                this.f43905a = 1;
                if (this.f43906b.n(this) == aVar3) {
                    return aVar3;
                }
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(com.waze.z.a.b.ab abVar, LazyListState lazyListState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43908d = i2;
        this.f43906b = abVar;
        this.f43907c = lazyListState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(com.waze.z.a.b.ab abVar, State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43908d = i2;
        this.f43906b = abVar;
        this.f43907c = state;
    }
}
