package e.a.d;

import j$.util.Objects;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InputStream f46703a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46704b;

    bv(ce ceVar, InputStream inputStream) {
        this.f46703a = inputStream;
        Objects.requireNonNull(ceVar);
        this.f46704b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46704b.f46730d.n(this.f46703a);
    }
}
