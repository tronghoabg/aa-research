package com.waze.uid.c;

import androidx.compose.material.ModalBottomSheetState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44410a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f44411b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44412c = i2;
        this.f44411b = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f44412c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new r(this.f44411b, eVar, 3, (short[]) null) : new r(this.f44411b, eVar, 2, (char[]) null) : new r(this.f44411b, eVar, 1, (byte[]) null) : new r(this.f44411b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f44412c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f44412c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f44410a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f44410a = 1;
                if (this.f44411b.hide(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f44410a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f44410a = 1;
                if (this.f44411b.show(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f44410a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f44410a = 1;
                if (this.f44411b.show(this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f44410a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f44410a = 1;
            if (this.f44411b.hide(this) == aVar4) {
                return aVar4;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f44412c = i2;
        this.f44411b = modalBottomSheetState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f44412c = i2;
        this.f44411b = modalBottomSheetState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f44412c = i2;
        this.f44411b = modalBottomSheetState;
    }
}
