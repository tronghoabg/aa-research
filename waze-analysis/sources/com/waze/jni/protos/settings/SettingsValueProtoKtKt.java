package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.SettingsValueProto;
import com.waze.jni.protos.settings.SettingsValueProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SettingsValueProtoKtKt {
    /* renamed from: -initializesettingsValueProto, reason: not valid java name */
    public static final SettingsValueProto m28331initializesettingsValueProto(l<? super SettingsValueProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SettingsValueProtoKt.Dsl.Companion companion = SettingsValueProtoKt.Dsl.Companion;
        SettingsValueProto.Builder builderNewBuilder = SettingsValueProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SettingsValueProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SettingsValueProto copy(SettingsValueProto settingsValueProto, l<? super SettingsValueProtoKt.Dsl, ab> lVar) {
        x.f(settingsValueProto, "<this>");
        x.f(lVar, "block");
        SettingsValueProtoKt.Dsl.Companion companion = SettingsValueProtoKt.Dsl.Companion;
        SettingsValueProto.Builder builder = settingsValueProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        SettingsValueProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
