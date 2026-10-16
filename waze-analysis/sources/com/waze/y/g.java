package com.waze.y;

import android.content.Context;
import com.waze.uid.b.ab;
import com.waze.uid.d.i;
import com.waze.z.a.b.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements com.waze.shared_infra.f.b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f45551a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f45552b;

    public g(a aVar, Context context, int i2) {
        this.f45551a = i2;
        x.f(aVar, "copilotDeepLinksNotifier");
        x.f(context, "context");
        this.f45552b = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.waze.uid.d.i, java.lang.Object] */
    @Override // com.waze.shared_infra.f.b
    public final boolean a(com.waze.shared_infra.f.a aVar) {
        if (this.f45551a == 0) {
            x.f(aVar, "deeplink");
            n nVarE = com.waze.calendar.b.e(aVar);
            if (nVarE == null) {
                return false;
            }
            ((a) this.f45552b).c(nVarE);
            return true;
        }
        x.f(aVar, "deeplink");
        if (!x.n(com.waze.sharedui.c.a.f38841b.a(), aVar.a())) {
            return false;
        }
        ab abVarA = ab.f44136a.a();
        if (!abVarA.p()) {
            return true;
        }
        abVarA.i();
        this.f45552b.i();
        return true;
    }

    public g(i iVar, int i2) {
        this.f45551a = i2;
        x.f(iVar, "installServices");
        this.f45552b = iVar;
    }
}
