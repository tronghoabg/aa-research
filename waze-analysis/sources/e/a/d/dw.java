package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f46831a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f46832b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eh f46833c;

    dw(eh ehVar, as asVar, boolean z) {
        this.f46831a = asVar;
        this.f46832b = z;
        Objects.requireNonNull(ehVar);
        this.f46833c = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46833c.t.c(this.f46831a, this.f46832b);
    }
}
