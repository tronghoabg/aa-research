package com.waze.uid.c;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ca extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44343a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f44344b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.state_impl.g.w f44345c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f44346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ca(ModalBottomSheetState modalBottomSheetState, com.waze.uid.state_impl.g.w wVar, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f44344b = modalBottomSheetState;
        this.f44345c = wVar;
        this.f44346d = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ca(this.f44344b, this.f44345c, this.f44346d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ca) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44343a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ModalBottomSheetState modalBottomSheetState = this.f44344b;
            this.f44343a = 1;
            if (SnapshotStateKt.snapshotFlow(new com.waze.stats.ay(modalBottomSheetState, 13)).collect(new bz(this.f44345c, modalBottomSheetState, this.f44346d), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
