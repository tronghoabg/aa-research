package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.cm f46718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cd f46719b;

    cb(cd cdVar, e.a.cm cmVar) {
        this.f46718a = cmVar;
        Objects.requireNonNull(cdVar);
        this.f46719b = cdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46719b.f46724a.d(this.f46718a);
    }
}
