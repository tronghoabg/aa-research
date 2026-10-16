package com.waze.jni.protos.crash;

import com.waze.jni.protos.crash.NonFatalErrorInfo;
import com.waze.jni.protos.crash.NonFatalErrorInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NonFatalErrorInfoKtKt {
    /* renamed from: -initializenonFatalErrorInfo, reason: not valid java name */
    public static final NonFatalErrorInfo m26130initializenonFatalErrorInfo(l<? super NonFatalErrorInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NonFatalErrorInfoKt.Dsl.Companion companion = NonFatalErrorInfoKt.Dsl.Companion;
        NonFatalErrorInfo.Builder builderNewBuilder = NonFatalErrorInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NonFatalErrorInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NonFatalErrorInfo copy(NonFatalErrorInfo nonFatalErrorInfo, l<? super NonFatalErrorInfoKt.Dsl, ab> lVar) {
        x.f(nonFatalErrorInfo, "<this>");
        x.f(lVar, "block");
        NonFatalErrorInfoKt.Dsl.Companion companion = NonFatalErrorInfoKt.Dsl.Companion;
        NonFatalErrorInfo.Builder builder = nonFatalErrorInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        NonFatalErrorInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
