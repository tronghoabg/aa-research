package com.waze.jni.protos;

import com.waze.jni.protos.PinAdDisplay;
import com.waze.jni.protos.PinAdDisplayKt;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PinAdDisplayKtKt {
    /* renamed from: -initializepinAdDisplay, reason: not valid java name */
    public static final PinAdDisplay m25460initializepinAdDisplay(l<? super PinAdDisplayKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PinAdDisplayKt.Dsl.Companion companion = PinAdDisplayKt.Dsl.Companion;
        PinAdDisplay.Builder builderNewBuilder = PinAdDisplay.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PinAdDisplayKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PinAdDisplay copy(PinAdDisplay pinAdDisplay, l<? super PinAdDisplayKt.Dsl, ab> lVar) {
        x.f(pinAdDisplay, "<this>");
        x.f(lVar, "block");
        PinAdDisplayKt.Dsl.Companion companion = PinAdDisplayKt.Dsl.Companion;
        PinAdDisplay.Builder builder = pinAdDisplay.toBuilder();
        x.e(builder, "toBuilder(...)");
        PinAdDisplayKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getPositionOrNull(PinAdDisplayOrBuilder pinAdDisplayOrBuilder) {
        x.f(pinAdDisplayOrBuilder, "<this>");
        if (pinAdDisplayOrBuilder.hasPosition()) {
            return pinAdDisplayOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(PinAdDisplayOrBuilder pinAdDisplayOrBuilder) {
    }
}
