package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AndroidHttpEngineWrapper$$ExternalSyntheticLambda1 implements org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork {
    public final /* synthetic */ org.chromium.net.impl.AndroidHttpEngineWrapper a;
    public final /* synthetic */ java.net.URL b;

    public /* synthetic */ AndroidHttpEngineWrapper$$ExternalSyntheticLambda1(org.chromium.net.impl.AndroidHttpEngineWrapper androidHttpEngineWrapper, java.net.URL url) {
        this.a = androidHttpEngineWrapper;
        this.b = url;
    }

    @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
    public final java.lang.Object a() {
        int i = org.chromium.net.impl.AndroidHttpEngineWrapper.b;
        return this.a.a.openConnection(this.b);
    }
}
