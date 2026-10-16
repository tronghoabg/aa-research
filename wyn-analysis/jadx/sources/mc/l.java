package mc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f40557a;

    public l() {
        Looper mainLooper = Looper.getMainLooper();
        this.f40557a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // mc.e
    public final void a(c cVar) {
        this.f40557a.post(cVar);
    }
}
