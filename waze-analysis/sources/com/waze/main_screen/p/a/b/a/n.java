package com.waze.main_screen.p.a.b.a;

import android.content.res.Resources;
import androidx.compose.ui.node.Ref;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f26808a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f26809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(Ref ref, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f26809b = i2;
        this.f26808a = ref;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f26809b;
        if (i2 == 0) {
            return new n((t) this.f26808a, eVar, 0);
        }
        if (i2 == 1) {
            return new n((Ref) this.f26808a, eVar, 1);
        }
        Object obj2 = this.f26808a;
        return i2 != 2 ? new n((Ref) obj2, eVar, 3, (char[]) null) : new n((Ref) obj2, eVar, 2, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f26809b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
        int i2 = this.f26809b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((t) this.f26808a).B();
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.bottom_bars.scrollable_eta.d dVar = (com.waze.main_screen.bottom_bars.scrollable_eta.d) ((Ref) this.f26808a).getValue();
            if (dVar != null) {
                dVar.e();
            }
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.i iVar = (com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.i) ((Ref) this.f26808a).getValue();
            if (iVar != null) {
                iVar.a();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.main_screen.bottom_bars.scrollable_eta.h hVar = (com.waze.main_screen.bottom_bars.scrollable_eta.h) ((Ref) this.f26808a).getValue();
        if (hVar != null) {
            hVar.c();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(Ref ref, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f26809b = i2;
        this.f26808a = ref;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(Ref ref, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f26809b = i2;
        this.f26808a = ref;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(t tVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f26809b = i2;
        this.f26808a = tVar;
    }
}
