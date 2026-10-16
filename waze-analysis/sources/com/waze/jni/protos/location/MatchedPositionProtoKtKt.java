package com.waze.jni.protos.location;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.MatchedPositionProto;
import com.waze.jni.protos.location.MatchedPositionProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MatchedPositionProtoKtKt {
    /* renamed from: -initializematchedPositionProto, reason: not valid java name */
    public static final MatchedPositionProto m26286initializematchedPositionProto(l<? super MatchedPositionProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MatchedPositionProtoKt.Dsl.Companion companion = MatchedPositionProtoKt.Dsl.Companion;
        MatchedPositionProto.Builder builderNewBuilder = MatchedPositionProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MatchedPositionProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MatchedPositionProto copy(MatchedPositionProto matchedPositionProto, l<? super MatchedPositionProtoKt.Dsl, ab> lVar) {
        x.f(matchedPositionProto, "<this>");
        x.f(lVar, "block");
        MatchedPositionProtoKt.Dsl.Companion companion = MatchedPositionProtoKt.Dsl.Companion;
        MatchedPositionProto.Builder builder = matchedPositionProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        MatchedPositionProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getPositionOrNull(MatchedPositionProtoOrBuilder matchedPositionProtoOrBuilder) {
        x.f(matchedPositionProtoOrBuilder, "<this>");
        if (matchedPositionProtoOrBuilder.hasPosition()) {
            return matchedPositionProtoOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(MatchedPositionProtoOrBuilder matchedPositionProtoOrBuilder) {
    }
}
