package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.ParkedHere;
import com.waze.jni.protos.navigate.ParkedHereKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ParkedHereKtKt {
    /* renamed from: -initializeparkedHere, reason: not valid java name */
    public static final ParkedHere m27453initializeparkedHere(l<? super ParkedHereKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ParkedHereKt.Dsl.Companion companion = ParkedHereKt.Dsl.Companion;
        ParkedHere.Builder builderNewBuilder = ParkedHere.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ParkedHereKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ParkedHere copy(ParkedHere parkedHere, l<? super ParkedHereKt.Dsl, ab> lVar) {
        x.f(parkedHere, "<this>");
        x.f(lVar, "block");
        ParkedHereKt.Dsl.Companion companion = ParkedHereKt.Dsl.Companion;
        ParkedHere.Builder builder = parkedHere.toBuilder();
        x.e(builder, "toBuilder(...)");
        ParkedHereKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
