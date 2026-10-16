package R8;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f10475b;

    public l(m mVar, long j8) {
        this.f10475b = mVar;
        this.f10474a = j8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f10474a);
        this.f10475b.k.q(bundle);
        return null;
    }
}
