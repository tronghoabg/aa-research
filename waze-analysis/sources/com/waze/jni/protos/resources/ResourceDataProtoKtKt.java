package com.waze.jni.protos.resources;

import com.waze.jni.protos.resources.ResourceDataProto;
import com.waze.jni.protos.resources.ResourceDataProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ResourceDataProtoKtKt {
    /* renamed from: -initializeresourceDataProto, reason: not valid java name */
    public static final ResourceDataProto m28148initializeresourceDataProto(l<? super ResourceDataProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ResourceDataProtoKt.Dsl.Companion companion = ResourceDataProtoKt.Dsl.Companion;
        ResourceDataProto.Builder builderNewBuilder = ResourceDataProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ResourceDataProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ResourceDataProto copy(ResourceDataProto resourceDataProto, l<? super ResourceDataProtoKt.Dsl, ab> lVar) {
        x.f(resourceDataProto, "<this>");
        x.f(lVar, "block");
        ResourceDataProtoKt.Dsl.Companion companion = ResourceDataProtoKt.Dsl.Companion;
        ResourceDataProto.Builder builder = resourceDataProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        ResourceDataProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
