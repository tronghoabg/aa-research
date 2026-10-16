package com.waze.map;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gk implements com.waze.ui.p.l {

    /* renamed from: a, reason: collision with root package name */
    private final cj f29156a;

    public gk(cj cjVar) {
        h.g.b.x.f(cjVar, "presenterBuilder");
        this.f29156a = cjVar;
    }

    @Override // com.waze.ui.p.l
    public final View a(Context context, LifecycleOwner lifecycleOwner, kotlinx.coroutines.b.bn bnVar, ec ecVar, boolean z, dr drVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(lifecycleOwner, "lifecycleOwner");
        h.g.b.x.f(bnVar, "mapStateFlow");
        h.g.b.x.f(ecVar, "touchNotifier");
        gs gsVar = new gs(context, ecVar, bnVar);
        gsVar.q(z);
        gsVar.g(drVar);
        lifecycleOwner.getLifecycle().addObserver(gsVar.b());
        return gsVar;
    }

    @Override // com.waze.ui.p.l
    public final ec b() {
        return new ec();
    }

    @Override // com.waze.ui.p.l
    public final gb c(kotlinx.coroutines.af afVar, kotlinx.coroutines.b.ch chVar, kotlinx.coroutines.b.ch chVar2, Context context, dq dqVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(chVar, "mapState");
        h.g.b.x.f(chVar2, "canvasViewBounds");
        h.g.b.x.f(context, "context");
        h.g.b.x.f(dqVar, "touchNotifier");
        WeakReference weakReference = new WeakReference(context);
        cv cvVar = cv.f28708b;
        kotlinx.coroutines.b.k kVarG = kotlinx.coroutines.b.ai.G(false);
        gh ghVar = new gh(weakReference);
        return this.f29156a.a(cvVar, afVar, chVar, kVarG, new gj(chVar2, null), ghVar, dqVar);
    }
}
