package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.SearchByVoiceDataProto;
import com.waze.jni.protos.settings.SearchByVoiceDataProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SearchByVoiceDataProtoKtKt {
    /* renamed from: -initializesearchByVoiceDataProto, reason: not valid java name */
    public static final SearchByVoiceDataProto m28310initializesearchByVoiceDataProto(l<? super SearchByVoiceDataProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SearchByVoiceDataProtoKt.Dsl.Companion companion = SearchByVoiceDataProtoKt.Dsl.Companion;
        SearchByVoiceDataProto.Builder builderNewBuilder = SearchByVoiceDataProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SearchByVoiceDataProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SearchByVoiceDataProto copy(SearchByVoiceDataProto searchByVoiceDataProto, l<? super SearchByVoiceDataProtoKt.Dsl, ab> lVar) {
        x.f(searchByVoiceDataProto, "<this>");
        x.f(lVar, "block");
        SearchByVoiceDataProtoKt.Dsl.Companion companion = SearchByVoiceDataProtoKt.Dsl.Companion;
        SearchByVoiceDataProto.Builder builder = searchByVoiceDataProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        SearchByVoiceDataProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
