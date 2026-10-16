package com.waze.ui;

import androidx.compose.material.ModalBottomSheetState;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41771a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f41772b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41773c = i2;
        this.f41772b = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f41773c;
        if (i2 == 0) {
            return new ad((f) this.f41772b, eVar, 0);
        }
        Object obj2 = this.f41772b;
        return i2 != 1 ? new ad((f) obj2, eVar, 2, null) : new ad((ModalBottomSheetState) obj2, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f41773c;
        return i2 != 0 ? i2 != 1 ? ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f41773c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f41771a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                h.g.a.l lVarB = ((e) this.f41772b).b();
                this.f41771a = 1;
                if (lVarB.invoke(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f41771a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f41772b;
                this.f41771a = 1;
                if (((ModalBottomSheetState) obj2).show(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f41771a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.g.a.p pVarC = ((d) this.f41772b).c();
            Boolean boolValueOf = Boolean.valueOf(!r4.d());
            this.f41771a = 1;
            if (pVarC.invoke(boolValueOf, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(f fVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41773c = i2;
        this.f41772b = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(f fVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f41773c = i2;
        this.f41772b = fVar;
    }
}
