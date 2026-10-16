package android.support.v4.app;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class h extends k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f336a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f337b;

    /* renamed from: c, reason: collision with root package name */
    private aw f338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cz czVar, boolean z) {
        super(czVar);
        h.g.b.x.f(czVar, "operation");
        this.f336a = z;
    }

    public final aw a(Context context) throws Resources.NotFoundException {
        h.g.b.x.f(context, "context");
        if (this.f337b) {
            return this.f338c;
        }
        aw awVarA = bi.a(context, b().c(), b().e() == cy.f304b, this.f336a);
        this.f338c = awVarA;
        this.f337b = true;
        return awVarA;
    }
}
