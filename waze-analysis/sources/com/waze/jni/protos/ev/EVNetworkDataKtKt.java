package com.waze.jni.protos.ev;

import com.waze.jni.protos.ev.EVNetworkData;
import com.waze.jni.protos.ev.EVNetworkDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EVNetworkDataKtKt {
    /* renamed from: -initializeeVNetworkData, reason: not valid java name */
    public static final EVNetworkData m26156initializeeVNetworkData(l<? super EVNetworkDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EVNetworkDataKt.Dsl.Companion companion = EVNetworkDataKt.Dsl.Companion;
        EVNetworkData.Builder builderNewBuilder = EVNetworkData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EVNetworkDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EVNetworkData copy(EVNetworkData eVNetworkData, l<? super EVNetworkDataKt.Dsl, ab> lVar) {
        x.f(eVNetworkData, "<this>");
        x.f(lVar, "block");
        EVNetworkDataKt.Dsl.Companion companion = EVNetworkDataKt.Dsl.Companion;
        EVNetworkData.Builder builder = eVNetworkData.toBuilder();
        x.e(builder, "toBuilder(...)");
        EVNetworkDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
