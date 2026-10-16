package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jv f46709a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cd f46710b;

    bz(cd cdVar, jv jvVar) {
        this.f46709a = jvVar;
        Objects.requireNonNull(cdVar);
        this.f46710b = cdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46710b.f46724a.e(this.f46709a);
    }
}
