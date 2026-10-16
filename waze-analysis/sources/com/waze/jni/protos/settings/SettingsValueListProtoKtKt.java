package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.SettingsValueListProto;
import com.waze.jni.protos.settings.SettingsValueListProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SettingsValueListProtoKtKt {
    /* renamed from: -initializesettingsValueListProto, reason: not valid java name */
    public static final SettingsValueListProto m28318initializesettingsValueListProto(l<? super SettingsValueListProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SettingsValueListProtoKt.Dsl.Companion companion = SettingsValueListProtoKt.Dsl.Companion;
        SettingsValueListProto.Builder builderNewBuilder = SettingsValueListProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SettingsValueListProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SettingsValueListProto copy(SettingsValueListProto settingsValueListProto, l<? super SettingsValueListProtoKt.Dsl, ab> lVar) {
        x.f(settingsValueListProto, "<this>");
        x.f(lVar, "block");
        SettingsValueListProtoKt.Dsl.Companion companion = SettingsValueListProtoKt.Dsl.Companion;
        SettingsValueListProto.Builder builder = settingsValueListProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        SettingsValueListProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
