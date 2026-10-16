package com.waze.ui.e;

import android.support.v7.widget.ej;
import androidx.compose.animation.core.Transition;
import com.waze.strings.DisplayStrings;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f42192a;

    /* renamed from: b, reason: collision with root package name */
    int f42193b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Transition f42194c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.b.b f42195d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v f42196e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.b.w f42197f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Transition transition, com.airbnb.lottie.b.b bVar, v vVar, com.airbnb.lottie.b.w wVar, h.c.e eVar) {
        super(2, eVar);
        this.f42194c = transition;
        this.f42195d = bVar;
        this.f42196e = vVar;
        this.f42197f = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f42194c, this.f42195d, this.f42196e, this.f42197f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        x xVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f42193b == 0) {
            e.b.c.b(obj);
            x xVar2 = (x) this.f42194c.getTargetState();
            if (xVar2 == x.f42254c || xVar2 == x.f42257f) {
                com.airbnb.lottie.b.w wVar = this.f42197f;
                if (a.a.G(wVar) != null) {
                    this.f42192a = xVar2;
                    this.f42193b = 1;
                    if (ej.k(this.f42195d, a.a.G(wVar), 1, false, 0.0f, new com.airbnb.lottie.b.u(null), 0.0f, null, this, DisplayStrings.DS_AUDIO_SDK_POPUP_UPDATE_APP_TITLE) == aVar) {
                        return aVar;
                    }
                    xVar = xVar2;
                }
            }
            return h.ab.f48028a;
        }
        xVar = (x) this.f42192a;
        e.b.c.b(obj);
        x xVar3 = x.f42257f;
        v vVar = this.f42196e;
        if (xVar == xVar3) {
            vVar.j(x.f42255d);
        } else {
            vVar.j(x.f42252a);
        }
        CompletableDeferred completableDeferredG = this.f42196e.g();
        if (completableDeferredG != null) {
            completableDeferredG.a(h.ab.f48028a);
        }
        return h.ab.f48028a;
    }
}
