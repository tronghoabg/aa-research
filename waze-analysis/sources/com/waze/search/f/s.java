package com.waze.search.f;

import androidx.compose.material.ModalBottomSheetState;
import com.waze.search.h.ae;
import com.waze.search.h.bx;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f35749a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f35750b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bx f35751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(ModalBottomSheetState modalBottomSheetState, ae aeVar, bx bxVar, h.c.e eVar) {
        super(2, eVar);
        this.f35749a = modalBottomSheetState;
        this.f35750b = aeVar;
        this.f35751c = bxVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f35749a, this.f35750b, this.f35751c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (!this.f35749a.isVisible() && this.f35750b != null) {
            this.f35751c.s();
        }
        return ab.f48028a;
    }
}
