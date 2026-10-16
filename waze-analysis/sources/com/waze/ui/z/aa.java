package com.waze.ui.z;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.waze.sound.gv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43858a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ State f43859b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableState f43860c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.p.i f43861d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f43862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(State state, MutableState mutableState, com.waze.ui.p.i iVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43862e = i2;
        this.f43859b = state;
        this.f43860c = mutableState;
        this.f43861d = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f43862e != 0 ? new aa(this.f43859b, this.f43860c, this.f43861d, eVar, 1, null) : new aa(this.f43859b, this.f43860c, this.f43861d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f43862e != 0 ? ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f43862e != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f43858a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f43858a = 1;
                if (kotlinx.coroutines.b.ai.q(kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new gv(this.f43859b, 11))), kotlinx.coroutines.b.ai.y(new z(SnapshotStateKt.snapshotFlow(new gv(this.f43860c, 12)), 1)), new t(null)).collect(new w(this.f43861d, 1), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f43858a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f43858a = 1;
            if (kotlinx.coroutines.b.ai.q(kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new gv(this.f43859b, 13))), kotlinx.coroutines.b.ai.y(new z(SnapshotStateKt.snapshotFlow(new gv(this.f43860c, 14)), 0)), new v(null)).collect(new w(this.f43861d, 0), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(State state, MutableState mutableState, com.waze.ui.p.i iVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f43862e = i2;
        this.f43859b = state;
        this.f43860c = mutableState;
        this.f43861d = iVar;
    }
}
