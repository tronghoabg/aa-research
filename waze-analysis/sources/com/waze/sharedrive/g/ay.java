package com.waze.sharedrive.g;

import androidx.compose.material.ModalBottomSheetState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ay extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38678a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f38679b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f38680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38680c = i2;
        this.f38679b = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f38680c != 0 ? new ay(this.f38679b, eVar, 1, null) : new ay(this.f38679b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f38680c != 0 ? ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f38680c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f38678a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f38678a = 1;
                if (this.f38679b.show(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f38678a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f38678a = 1;
            if (this.f38679b.hide(this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f38680c = i2;
        this.f38679b = modalBottomSheetState;
    }
}
