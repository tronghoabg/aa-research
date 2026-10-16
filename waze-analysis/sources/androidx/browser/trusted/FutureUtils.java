package androidx.browser.trusted;

import androidx.concurrent.futures.ResolvableFuture;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class FutureUtils {
    private FutureUtils() {
    }

    static <T> bm<T> immediateFailedFuture(Throwable th) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.setException(th);
        return resolvableFutureCreate;
    }
}
