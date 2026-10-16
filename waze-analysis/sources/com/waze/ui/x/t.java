package com.waze.ui.x;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.State;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43839a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f43840b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ State f43841c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f43842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(ModalBottomSheetState modalBottomSheetState, State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43842d = i2;
        this.f43840b = modalBottomSheetState;
        this.f43841c = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f43842d != 0 ? new t(this.f43840b, this.f43841c, eVar, 1, null) : new t(this.f43840b, this.f43841c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f43842d != 0 ? ((t) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((t) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f43842d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f43839a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                a.a.q(this.f43841c).invoke(new k(j.f43819c));
                this.f43839a = 1;
                if (this.f43840b.hide(this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f43839a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            a.a.q(this.f43841c).invoke(new k(j.f43818b));
            this.f43839a = 1;
            if (this.f43840b.hide(this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(ModalBottomSheetState modalBottomSheetState, State state, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f43842d = i2;
        this.f43840b = modalBottomSheetState;
        this.f43841c = state;
    }
}
