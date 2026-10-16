package com.waze.reports_v2.presentation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.reports_v2.c.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cu extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f34983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f34984b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f34985c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f34986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cu(cz czVar, dj djVar, boolean z, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34986d = i2;
        this.f34984b = czVar;
        this.f34985c = djVar;
        this.f34983a = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f34986d != 0) {
            return new cu(this.f34983a, (com.waze.reports_v2.a.a.a.b) this.f34985c, (com.waze.reports_v2.c.al) this.f34984b, eVar, 1);
        }
        Object obj2 = this.f34984b;
        return new cu((cz) obj2, (dj) this.f34985c, this.f34983a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f34986d != 0 ? ((cu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((cu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f34986d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            boolean z = this.f34983a;
            Object obj2 = this.f34985c;
            if (z) {
                com.waze.reports_v2.c.ah ahVar = (com.waze.reports_v2.c.ah) this.f34984b;
                ((com.waze.reports_v2.a.a.a.b) obj2).j(ahVar.b(), ahVar.a());
            } else {
                ((com.waze.reports_v2.a.a.a.b) obj2).c();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Object obj3 = this.f34984b;
        ViewModel viewModel = (ViewModel) obj3;
        cz czVar = (cz) obj3;
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(viewModel), null, null, new bj(czVar, (h.c.e) null, 15, (byte[][]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(viewModel), null, null, new bj(czVar, (h.c.e) null, 16, (char[][]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(viewModel), null, null, new cl(czVar, (dj) this.f34985c, this.f34983a, null), 3);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cu(boolean z, com.waze.reports_v2.a.a.a.b bVar, com.waze.reports_v2.c.al alVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34986d = i2;
        this.f34983a = z;
        this.f34985c = bVar;
        this.f34984b = alVar;
    }
}
