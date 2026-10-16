package com.waze.reports_v2.presentation.a;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.waze.reports_v2.presentation.bw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34645a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableState f34646b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bw f34647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(MutableState mutableState, bw bwVar, h.c.e eVar) {
        super(2, eVar);
        this.f34646b = mutableState;
        this.f34647c = bwVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new al(this.f34646b, this.f34647c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((al) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34645a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f34645a = 1;
            if (SnapshotStateKt.snapshotFlow(new com.waze.planned_drive.ae(this.f34646b, 12)).collect(new ak(this.f34647c), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
