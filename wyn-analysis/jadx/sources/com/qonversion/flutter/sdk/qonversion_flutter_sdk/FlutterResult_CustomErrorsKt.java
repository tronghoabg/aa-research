package com.qonversion.flutter.sdk.qonversion_flutter_sdk;

import Ge.v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"noNecessaryDataError", "", "Lio/flutter/plugin/common/MethodChannel$Result;", "sandwichError", "error", "Lio/qonversion/sandwich/SandwichError;", "qonversion_flutter_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlutterResult_CustomErrorsKt {
    public static final void noNecessaryDataError(@NotNull InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(interfaceC4280q, "<this>");
        interfaceC4280q.b("NoNecessaryDataError", "Could not find necessary arguments", "Make sure you pass correct call arguments");
    }

    public static final void sandwichError(@NotNull InterfaceC4280q interfaceC4280q, @NotNull v error) {
        AbstractC3340k.e(interfaceC4280q, "<this>");
        AbstractC3340k.e(error, "error");
        interfaceC4280q.b(error.f4777a, error.f4778b, error.f4779c);
    }
}
