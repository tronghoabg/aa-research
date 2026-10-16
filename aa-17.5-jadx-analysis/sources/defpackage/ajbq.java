package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class ajbq extends aisz implements aivx {
    public final ajbp b;

    public ajbq(afco afcoVar) {
        super(afcoVar, true);
        this.b = new ajbp(this);
    }

    @Override // defpackage.afdb
    public final /* synthetic */ StackTraceElement ea() {
        return aiwc.a(this);
    }

    @Override // defpackage.afdb
    public final /* synthetic */ afdb eb() {
        return aijm.a(this);
    }

    @Override // defpackage.aisz
    protected final void hI(Throwable th, boolean z) {
        ajbp ajbpVar = this.b;
        if (th instanceof CancellationException) {
            ajbpVar.a.o(new ajbo((CancellationException) th));
        } else if (ajbpVar.a.p(th)) {
            ajbpVar.b = true;
        }
    }

    @Override // defpackage.aisz
    protected final void hJ(Object obj) {
        this.b.a.o(obj);
    }

    @Override // defpackage.aiwe
    public final /* synthetic */ StackTraceElement k() {
        return aiwd.d;
    }
}
