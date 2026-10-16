package com.waze.jni.protos;

import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.NativeBitmapKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeBitmapKtKt {
    /* renamed from: -initializenativeBitmap, reason: not valid java name */
    public static final NativeBitmap m25246initializenativeBitmap(l<? super NativeBitmapKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NativeBitmapKt.Dsl.Companion companion = NativeBitmapKt.Dsl.Companion;
        NativeBitmap.Builder builderNewBuilder = NativeBitmap.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NativeBitmapKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeBitmap copy(NativeBitmap nativeBitmap, l<? super NativeBitmapKt.Dsl, ab> lVar) {
        x.f(nativeBitmap, "<this>");
        x.f(lVar, "block");
        NativeBitmapKt.Dsl.Companion companion = NativeBitmapKt.Dsl.Companion;
        NativeBitmap.Builder builder = nativeBitmap.toBuilder();
        x.e(builder, "toBuilder(...)");
        NativeBitmapKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
