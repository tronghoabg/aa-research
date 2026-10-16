package org.chromium.net.impl;

import defpackage.ols$$ExternalSyntheticApiModelOutline2;
import defpackage.pda$$ExternalSyntheticApiModelOutline1;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;

/* loaded from: classes2.dex */
class CronetExceptionTranslationUtils {

    interface CronetWork<T, E extends Exception> {
        Object a() throws Exception;
    }

    private CronetExceptionTranslationUtils() {
    }

    public static Object a(CronetWork cronetWork, Class cls) throws Exception {
        try {
            return cronetWork.a();
        } catch (Exception e) {
            if (ols$$ExternalSyntheticApiModelOutline2.m$1(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (ols$$ExternalSyntheticApiModelOutline2.m$2(e)) {
                throw b(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static CronetException b(Exception exc) {
        if (ols$$ExternalSyntheticApiModelOutline2.m$2(exc)) {
            return ols$$ExternalSyntheticApiModelOutline2.m373m((Object) exc) ? new AndroidQuicExceptionWrapper(ols$$ExternalSyntheticApiModelOutline2.m362m((Object) exc)) : ols$$ExternalSyntheticApiModelOutline2.m$3(exc) ? new AndroidNetworkExceptionWrapper(ols$$ExternalSyntheticApiModelOutline2.m((Object) exc)) : ols$$ExternalSyntheticApiModelOutline2.m$4(exc) ? new AndroidCallbackExceptionWrapper(pda$$ExternalSyntheticApiModelOutline1.m412m((Object) exc)) : new AndroidHttpExceptionWrapper(pda$$ExternalSyntheticApiModelOutline1.m413m((Object) exc));
        }
        throw new IllegalArgumentException("Not an Android Cronet exception", exc);
    }
}
