package com.waze.jni.protos;

import com.waze.jni.protos.NativeBitmapWithAlignment;
import com.waze.jni.protos.NativeBitmapWithAlignmentKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeBitmapWithAlignmentKtKt {
    /* renamed from: -initializenativeBitmapWithAlignment, reason: not valid java name */
    public static final NativeBitmapWithAlignment m25254initializenativeBitmapWithAlignment(l<? super NativeBitmapWithAlignmentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NativeBitmapWithAlignmentKt.Dsl.Companion companion = NativeBitmapWithAlignmentKt.Dsl.Companion;
        NativeBitmapWithAlignment.Builder builderNewBuilder = NativeBitmapWithAlignment.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NativeBitmapWithAlignmentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeBitmapWithAlignment copy(NativeBitmapWithAlignment nativeBitmapWithAlignment, l<? super NativeBitmapWithAlignmentKt.Dsl, ab> lVar) {
        x.f(nativeBitmapWithAlignment, "<this>");
        x.f(lVar, "block");
        NativeBitmapWithAlignmentKt.Dsl.Companion companion = NativeBitmapWithAlignmentKt.Dsl.Companion;
        NativeBitmapWithAlignment.Builder builder = nativeBitmapWithAlignment.toBuilder();
        x.e(builder, "toBuilder(...)");
        NativeBitmapWithAlignmentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeBitmap getBitmapOrNull(NativeBitmapWithAlignmentOrBuilder nativeBitmapWithAlignmentOrBuilder) {
        x.f(nativeBitmapWithAlignmentOrBuilder, "<this>");
        if (nativeBitmapWithAlignmentOrBuilder.hasBitmap()) {
            return nativeBitmapWithAlignmentOrBuilder.getBitmap();
        }
        return null;
    }

    public static /* synthetic */ void getBitmapOrNull$annotations(NativeBitmapWithAlignmentOrBuilder nativeBitmapWithAlignmentOrBuilder) {
    }
}
