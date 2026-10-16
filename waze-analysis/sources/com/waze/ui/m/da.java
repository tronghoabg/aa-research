package com.waze.ui.m;

import androidx.compose.material.ModalBottomSheetState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class da extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42942a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f42943b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    da(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42944c = i2;
        this.f42943b = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f42944c;
        return i2 != 0 ? i2 != 1 ? new da(this.f42943b, eVar, 2, (char[]) null) : new da(this.f42943b, eVar, 1, (byte[]) null) : new da(this.f42943b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f42944c;
        return i2 != 0 ? i2 != 1 ? ((da) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((da) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((da) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f42944c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f42942a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f42942a = 1;
                if (this.f42943b.hide(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f42942a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f42942a = 1;
                if (this.f42943b.hide(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f42942a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f42942a = 1;
            if (this.f42943b.show(this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    da(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42944c = i2;
        this.f42943b = modalBottomSheetState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    da(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f42944c = i2;
        this.f42943b = modalBottomSheetState;
    }
}
