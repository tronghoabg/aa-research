package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.BeaconInformation;
import com.waze.jni.protos.navigate.BeaconInformationKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BeaconInformationKtKt {
    /* renamed from: -initializebeaconInformation, reason: not valid java name */
    public static final BeaconInformation m27144initializebeaconInformation(l<? super BeaconInformationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        BeaconInformationKt.Dsl.Companion companion = BeaconInformationKt.Dsl.Companion;
        BeaconInformation.Builder builderNewBuilder = BeaconInformation.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        BeaconInformationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BeaconInformation copy(BeaconInformation beaconInformation, l<? super BeaconInformationKt.Dsl, ab> lVar) {
        x.f(beaconInformation, "<this>");
        x.f(lVar, "block");
        BeaconInformationKt.Dsl.Companion companion = BeaconInformationKt.Dsl.Companion;
        BeaconInformation.Builder builder = beaconInformation.toBuilder();
        x.e(builder, "toBuilder(...)");
        BeaconInformationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
