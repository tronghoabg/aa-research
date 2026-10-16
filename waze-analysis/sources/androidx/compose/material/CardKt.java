package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import h.ab;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CardKt {
    /* renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m4000CardFjzlyU(Modifier modifier, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i3 & 2) != 0) {
            shape = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        }
        Shape shape2 = shape;
        long jM4031getSurface0d7_KjU = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU() : j2;
        long jM4045contentColorForek8zF_U = (i3 & 8) != 0 ? ColorsKt.m4045contentColorForek8zF_U(jM4031getSurface0d7_KjU, composer, (i2 >> 6) & 14) : j3;
        BorderStroke borderStroke2 = (i3 & 16) != 0 ? null : borderStroke;
        float f3 = (i3 & 32) != 0 ? 1.0f : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574573525, i2, -1, "androidx.compose.material.Card (Card.kt:63)");
        }
        SurfaceKt.m4216SurfaceFjzlyU(modifier, shape2, jM4031getSurface0d7_KjU, jM4045contentColorForek8zF_U, borderStroke2, f3, pVar, composer, i2 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m4001CardLPr_se0(a<ab> aVar, Modifier modifier, boolean z, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, MutableInteractionSource mutableInteractionSource, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2, int i3) {
        Modifier.Companion companion = (i3 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z2 = (!((i3 & 4) == 0)) | z;
        CornerBasedShape medium = (i3 & 8) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM4031getSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU() : j2;
        long jM4045contentColorForek8zF_U = (i3 & 32) != 0 ? ColorsKt.m4045contentColorForek8zF_U(jM4031getSurface0d7_KjU, composer, (i2 >> 12) & 14) : j3;
        BorderStroke borderStroke2 = (i3 & 64) != 0 ? null : borderStroke;
        float f3 = (i3 & 128) != 0 ? 1.0f : f2;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 256) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-103820906, i2, -1, "androidx.compose.material.Card (Card.kt:115)");
        }
        SurfaceKt.m4217SurfaceLPr_se0(aVar, companion, z2, medium, jM4031getSurface0d7_KjU, jM4045contentColorForek8zF_U, borderStroke2, f3, mutableInteractionSource2, pVar, composer, i2 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
