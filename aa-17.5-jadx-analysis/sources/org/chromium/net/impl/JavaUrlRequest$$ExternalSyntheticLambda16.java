package org.chromium.net.impl;

import org.chromium.net.impl.JavaUrlRequestUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class JavaUrlRequest$$ExternalSyntheticLambda16 implements Runnable {
    public final /* synthetic */ JavaUrlRequest a;
    public final /* synthetic */ JavaUrlRequestUtils.CheckedRunnable b;

    public /* synthetic */ JavaUrlRequest$$ExternalSyntheticLambda16(JavaUrlRequest javaUrlRequest, JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        this.a = javaUrlRequest;
        this.b = checkedRunnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = JavaUrlRequest.a;
        try {
            this.b.a();
        } catch (Throwable th) {
            this.a.c(th);
        }
    }
}
