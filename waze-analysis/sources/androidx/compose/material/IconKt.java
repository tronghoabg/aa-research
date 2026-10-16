package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4110Iconww6aTOc(final androidx.compose.ui.graphics.painter.Painter r24, final java.lang.String r25, androidx.compose.ui.Modifier r26, long r27, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconKt.m4110Iconww6aTOc(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Icon_ww6aTOc$lambda$2$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10320getImageo7Vup1c());
        return ab.f48028a;
    }

    static final ab Icon_ww6aTOc$lambda$3(Painter painter, String str, Modifier modifier, long j2, int i2, int i3, Composer composer, int i4) {
        m4110Iconww6aTOc(painter, str, modifier, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m8045equalsimpl0(painter.mo8959getIntrinsicSizeNHjbRc(), Size.Companion.m8057getUnspecifiedNHjbRc()) || m4112isInfiniteuvyYCjk(painter.mo8959getIntrinsicSizeNHjbRc())) ? DefaultIconSizeModifier : Modifier.Companion);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m4112isInfiniteuvyYCjk(long j2) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j2 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m4109Iconww6aTOc(ImageBitmap imageBitmap, String str, Modifier modifier, long j2, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i2, -1, "androidx.compose.material.Icon (Icon.kt:100)");
        }
        boolean zChanged = composer.changed(imageBitmap);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(bitmapPainter);
            objRememberedValue = bitmapPainter;
        }
        m4110Iconww6aTOc((BitmapPainter) objRememberedValue, str, modifier2, jM8227copywmQWz5c$default, composer, i2 & 8176, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m4111Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j2, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i2, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        m4110Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i2 & 14), str, modifier2, jM8227copywmQWz5c$default, composer, (i2 & 112) | VectorPainter.$stable | (i2 & DisplayStrings.DS_TAP_TO_VERIFY) | (i2 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
