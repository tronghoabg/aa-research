package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class CronetExceptionTranslationUtils {

    interface CronetWork<T, E extends java.lang.Exception> {
        java.lang.Object a() throws java.lang.Exception;
    }

    private CronetExceptionTranslationUtils() {
    }

    public static java.lang.Object a(org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork cronetWork, java.lang.Class cls) throws java.lang.Exception {
        try {
            return cronetWork.a();
        } catch (java.lang.Exception e) {
            if (defpackage.omv$$ExternalSyntheticApiModelOutline1.m$1(e)) {
                org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = new org.chromium.net.InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (defpackage.omv$$ExternalSyntheticApiModelOutline1.m$2(e)) {
                throw b(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static org.chromium.net.CronetException b(java.lang.Exception exc) {
        if (!defpackage.omv$$ExternalSyntheticApiModelOutline1.m$2(exc)) {
            throw new java.lang.IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (defpackage.omv$$ExternalSyntheticApiModelOutline1.m378m((java.lang.Object) exc)) {
            return new org.chromium.net.impl.AndroidQuicExceptionWrapper(defpackage.omv$$ExternalSyntheticApiModelOutline1.m367m((java.lang.Object) exc));
        }
        if (defpackage.omv$$ExternalSyntheticApiModelOutline1.m$3(exc)) {
            return new org.chromium.net.impl.AndroidNetworkExceptionWrapper(defpackage.omv$$ExternalSyntheticApiModelOutline1.m((java.lang.Object) exc));
        }
        return defpackage.pdw$$ExternalSyntheticApiModelOutline1.m419m((java.lang.Object) exc) ? new org.chromium.net.impl.AndroidCallbackExceptionWrapper(defpackage.pdw$$ExternalSyntheticApiModelOutline1.m417m((java.lang.Object) exc)) : new org.chromium.net.impl.AndroidHttpExceptionWrapper(defpackage.pdw$$ExternalSyntheticApiModelOutline1.m418m((java.lang.Object) exc));
    }
}
