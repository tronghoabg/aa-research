package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jni.protos.navigate.DriveToKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DriveToKtKt {
    /* renamed from: -initializedriveTo, reason: not valid java name */
    public static final DriveTo m27179initializedriveTo(l<? super DriveToKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DriveToKt.Dsl.Companion companion = DriveToKt.Dsl.Companion;
        DriveTo.Builder builderNewBuilder = DriveTo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DriveToKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DriveTo copy(DriveTo driveTo, l<? super DriveToKt.Dsl, ab> lVar) {
        x.f(driveTo, "<this>");
        x.f(lVar, "block");
        DriveToKt.Dsl.Companion companion = DriveToKt.Dsl.Companion;
        DriveTo.Builder builder = driveTo.toBuilder();
        x.e(builder, "toBuilder(...)");
        DriveToKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
