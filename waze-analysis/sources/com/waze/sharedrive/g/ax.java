package com.waze.sharedrive.g;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.waze.reports_v2.presentation.bq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ax extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38675a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f38676b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ State f38677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(ModalBottomSheetState modalBottomSheetState, State state, h.c.e eVar) {
        super(2, eVar);
        this.f38676b = modalBottomSheetState;
        this.f38677c = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ax(this.f38676b, this.f38677c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ax) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38675a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f38675a = 1;
            if (new aw(kotlinx.coroutines.b.ai.B(SnapshotStateKt.snapshotFlow(new bq(this.f38676b, 10)), new as(null))).collect(new at(this.f38677c), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
