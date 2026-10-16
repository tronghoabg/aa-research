package com.waze.search.f;

import androidx.compose.material.ModalBottomSheetState;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35742a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f35743b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35744c = i2;
        this.f35743b = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f35744c != 0 ? new q(this.f35743b, eVar, 1, null) : new q(this.f35743b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f35744c != 0 ? ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f35744c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f35742a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f35742a = 1;
                if (this.f35743b.hide(this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f35742a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f35742a = 1;
            if (this.f35743b.show(this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f35744c = i2;
        this.f35743b = modalBottomSheetState;
    }
}
