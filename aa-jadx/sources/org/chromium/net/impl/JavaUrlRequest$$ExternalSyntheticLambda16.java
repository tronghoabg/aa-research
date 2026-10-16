package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class JavaUrlRequest$$ExternalSyntheticLambda16 implements java.lang.Runnable {
    public final /* synthetic */ org.chromium.net.impl.JavaUrlRequest a;
    public final /* synthetic */ org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable b;

    public /* synthetic */ JavaUrlRequest$$ExternalSyntheticLambda16(org.chromium.net.impl.JavaUrlRequest javaUrlRequest, org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        this.a = javaUrlRequest;
        this.b = checkedRunnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = org.chromium.net.impl.JavaUrlRequest.a;
        try {
            this.b.a();
        } catch (java.lang.Throwable th) {
            this.a.c(th);
        }
    }
}
