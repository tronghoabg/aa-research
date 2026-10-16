package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.d.f.h;
import com.google.d.f.i;
import e.a.ac;
import e.a.cm;
import e.a.dt;
import e.a.du;
import e.a.dv;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class WindowTokenServerInterceptor {
    private static final i logger = i.l("com/google/android/apps/search/assistant/platform/appintegration/grpc/WindowTokenServerInterceptor");

    ParcelableBinder extractWindowTokenFromHeader(cm cmVar) {
        Iterable iterableC = cmVar.c(WindowTokenKeys.METADATA_KEY);
        if (iterableC == null || !iterableC.iterator().hasNext()) {
            return null;
        }
        return (ParcelableBinder) iterableC.iterator().next();
    }

    public <ReqT, RespT> dt<ReqT> interceptCall(du<ReqT, RespT> duVar, cm cmVar, dv<ReqT, RespT> dvVar) {
        ParcelableBinder parcelableBinderExtractWindowTokenFromHeader = extractWindowTokenFromHeader(cmVar);
        if (parcelableBinderExtractWindowTokenFromHeader != null) {
            ((h) ((h) logger.c()).i("com/google/android/apps/search/assistant/platform/appintegration/grpc/WindowTokenServerInterceptor", "interceptCall", 27, "WindowTokenServerInterceptor.java")).o("Token keys found.");
            return dt.o(ac.g().h(WindowTokenKeys.CONTEXT_KEY, parcelableBinderExtractWindowTokenFromHeader), duVar, dvVar);
        }
        ((h) ((h) logger.c()).i("com/google/android/apps/search/assistant/platform/appintegration/grpc/WindowTokenServerInterceptor", "interceptCall", 31, "WindowTokenServerInterceptor.java")).o("No token key found.");
        return dvVar.a(duVar);
    }
}
