package com.qonversion.flutter.sdk.qonversion_flutter_sdk;

import Ge.u;
import Ge.v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import la.l;
import org.jetbrains.annotations.NotNull;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"toResultListener", "Lio/qonversion/sandwich/ResultListener;", "Lio/flutter/plugin/common/MethodChannel$Result;", "toJsonResultListener", "qonversion_flutter_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtenstionsKt {
    @NotNull
    public static final u toJsonResultListener(@NotNull final InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(interfaceC4280q, "<this>");
        return new u() { // from class: com.qonversion.flutter.sdk.qonversion_flutter_sdk.ExtenstionsKt.toJsonResultListener.1
            @Override // Ge.u
            public void onError(v error) {
                AbstractC3340k.e(error, "error");
                FlutterResult_CustomErrorsKt.sandwichError(interfaceC4280q, error);
            }

            @Override // Ge.u
            public void onSuccess(Map<String, ? extends Object> data) {
                AbstractC3340k.e(data, "data");
                interfaceC4280q.a(new l().f(data));
            }
        };
    }

    @NotNull
    public static final u toResultListener(@NotNull final InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(interfaceC4280q, "<this>");
        return new u() { // from class: com.qonversion.flutter.sdk.qonversion_flutter_sdk.ExtenstionsKt.toResultListener.1
            @Override // Ge.u
            public void onError(v error) {
                AbstractC3340k.e(error, "error");
                FlutterResult_CustomErrorsKt.sandwichError(interfaceC4280q, error);
            }

            @Override // Ge.u
            public void onSuccess(Map<String, ? extends Object> data) {
                AbstractC3340k.e(data, "data");
                interfaceC4280q.a(data);
            }
        };
    }
}
