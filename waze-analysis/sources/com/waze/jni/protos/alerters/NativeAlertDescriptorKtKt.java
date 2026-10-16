package com.waze.jni.protos.alerters;

import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.alerters.NativeAlertDescriptor;
import com.waze.jni.protos.alerters.NativeAlertDescriptorKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeAlertDescriptorKtKt {
    /* renamed from: -initializenativeAlertDescriptor, reason: not valid java name */
    public static final NativeAlertDescriptor m25885initializenativeAlertDescriptor(l<? super NativeAlertDescriptorKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NativeAlertDescriptorKt.Dsl.Companion companion = NativeAlertDescriptorKt.Dsl.Companion;
        NativeAlertDescriptor.Builder builderNewBuilder = NativeAlertDescriptor.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NativeAlertDescriptorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeAlertDescriptor copy(NativeAlertDescriptor nativeAlertDescriptor, l<? super NativeAlertDescriptorKt.Dsl, ab> lVar) {
        x.f(nativeAlertDescriptor, "<this>");
        x.f(lVar, "block");
        NativeAlertDescriptorKt.Dsl.Companion companion = NativeAlertDescriptorKt.Dsl.Companion;
        NativeAlertDescriptor.Builder builder = nativeAlertDescriptor.toBuilder();
        x.e(builder, "toBuilder(...)");
        NativeAlertDescriptorKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlerterId getAlertIdOrNull(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
        x.f(nativeAlertDescriptorOrBuilder, "<this>");
        if (nativeAlertDescriptorOrBuilder.hasAlertId()) {
            return nativeAlertDescriptorOrBuilder.getAlertId();
        }
        return null;
    }

    public static /* synthetic */ void getAlertIdOrNull$annotations(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
    }

    public static final AlerterInfo getInfoOrNull(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
        x.f(nativeAlertDescriptorOrBuilder, "<this>");
        if (nativeAlertDescriptorOrBuilder.hasInfo()) {
            return nativeAlertDescriptorOrBuilder.getInfo();
        }
        return null;
    }

    public static /* synthetic */ void getInfoOrNull$annotations(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
    }

    public static final InsightPriority getInsightPriorityOrNull(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
        x.f(nativeAlertDescriptorOrBuilder, "<this>");
        if (nativeAlertDescriptorOrBuilder.hasInsightPriority()) {
            return nativeAlertDescriptorOrBuilder.getInsightPriority();
        }
        return null;
    }

    public static /* synthetic */ void getInsightPriorityOrNull$annotations(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
    }

    public static final ZoneAlertData getZoneAlertDataOrNull(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
        x.f(nativeAlertDescriptorOrBuilder, "<this>");
        if (nativeAlertDescriptorOrBuilder.hasZoneAlertData()) {
            return nativeAlertDescriptorOrBuilder.getZoneAlertData();
        }
        return null;
    }

    public static /* synthetic */ void getZoneAlertDataOrNull$annotations(NativeAlertDescriptorOrBuilder nativeAlertDescriptorOrBuilder) {
    }
}
