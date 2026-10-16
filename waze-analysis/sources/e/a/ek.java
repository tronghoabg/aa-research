package e.a;

import java.util.concurrent.ScheduledFuture;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ek {

    /* renamed from: a, reason: collision with root package name */
    private final ej f47425a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f47426b;

    /* synthetic */ ek(ej ejVar, ScheduledFuture scheduledFuture) {
        this.f47425a = ejVar;
        com.google.d.b.an.C(scheduledFuture, "future");
        this.f47426b = scheduledFuture;
    }

    public final void a() {
        this.f47425a.f47423b = true;
        this.f47426b.cancel(false);
    }

    public final boolean b() {
        ej ejVar = this.f47425a;
        return (ejVar.f47424c || ejVar.f47423b) ? false : true;
    }
}
