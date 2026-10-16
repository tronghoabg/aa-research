package org.chromium.net.impl;

import java.net.URL;
import org.chromium.net.impl.CronetExceptionTranslationUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class AndroidHttpEngineWrapper$$ExternalSyntheticLambda1 implements CronetExceptionTranslationUtils.CronetWork {
    public final /* synthetic */ AndroidHttpEngineWrapper a;
    public final /* synthetic */ URL b;

    public /* synthetic */ AndroidHttpEngineWrapper$$ExternalSyntheticLambda1(AndroidHttpEngineWrapper androidHttpEngineWrapper, URL url) {
        this.a = androidHttpEngineWrapper;
        this.b = url;
    }

    @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
    public final Object a() {
        int i = AndroidHttpEngineWrapper.b;
        return this.a.a.openConnection(this.b);
    }
}
