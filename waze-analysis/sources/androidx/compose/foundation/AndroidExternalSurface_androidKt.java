package androidx.compose.foundation;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.k;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    public static final void m1966AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z, long j2, float[] fArr, final l<? super AndroidExternalSurfaceScope, ab> lVar, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long jM11344getZeroYbymL2g;
        l<? super AndroidExternalSurfaceScope, ab> lVar2;
        final float[] fArr2;
        final boolean z2;
        final Modifier modifier3;
        final long j3;
        final float[] fArr3;
        final boolean z3;
        Modifier modifier4;
        final long j4;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(217541314);
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i6 = i3 & 2;
        boolean z4 = i6 == 0;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            jM11344getZeroYbymL2g = j2;
            if ((i3 & 4) == 0 && composerStartRestartGroup.changed(jM11344getZeroYbymL2g)) {
                i7 = 256;
            }
            i4 |= i7;
        } else {
            jM11344getZeroYbymL2g = j2;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        } else if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(fArr != null ? Matrix.m8490boximpl(fArr) : null) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            lVar2 = lVar;
            i4 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 8192 : 16384;
        } else {
            lVar2 = lVar;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            int i9 = i3 & 4;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
                boolean z5 = z | (!z4);
                if (i9 != 0) {
                    i4 &= -897;
                    jM11344getZeroYbymL2g = IntSize.Companion.m11344getZeroYbymL2g();
                }
                if (i8 != 0) {
                    z3 = z5;
                    modifier4 = companion;
                    fArr3 = null;
                } else {
                    fArr3 = fArr;
                    z3 = z5;
                    modifier4 = companion;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i9 != 0) {
                    i4 &= -897;
                }
                fArr3 = fArr;
                z3 = z;
                modifier4 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217541314, i4, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
            }
            final AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0((Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l lVar3 = (l) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0((TextureView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            l lVar4 = (l) objRememberedValue2;
            boolean zChangedInstance = ((((i4 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composerStartRestartGroup.changed(jM11344getZeroYbymL2g)) || (i4 & 384) == 256) | composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState) | ((57344 & i4) == 16384) | ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(fArr3 != null ? Matrix.m8490boximpl(fArr3) : null);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                final l<? super AndroidExternalSurfaceScope, ab> lVar5 = lVar2;
                j4 = jM11344getZeroYbymL2g;
                objRememberedValue3 = new l() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0(j4, androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState, lVar5, z3, fArr3, (TextureView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                j4 = jM11344getZeroYbymL2g;
            }
            AndroidView_androidKt.AndroidView(lVar3, modifier4, lVar4, null, (l) objRememberedValue3, composerStartRestartGroup, ((i4 << 3) & 112) | DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j3 = j4;
            z2 = z3;
            fArr2 = fArr3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            fArr2 = fArr;
            z2 = z;
            modifier3 = modifier2;
            j3 = jM11344getZeroYbymL2g;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3(modifier3, z2, j3, fArr2, lVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureView AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0(Context context) {
        return new TextureView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0(TextureView textureView) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0(long j2, AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, l lVar, boolean z, float[] fArr, TextureView textureView) {
        android.graphics.Matrix matrix;
        SurfaceTexture surfaceTexture;
        if (!IntSize.m11337equalsimpl0(j2, IntSize.Companion.m11344getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize((int) (j2 >> 32), (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
        androidEmbeddedExternalSurfaceState.m1954setSurfaceSizeozmzZPI(j2);
        if (textureView.getSurfaceTextureListener() != androidEmbeddedExternalSurfaceState) {
            lVar.invoke(androidEmbeddedExternalSurfaceState);
            textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
        }
        textureView.setOpaque(z);
        if (fArr != null) {
            matrix = androidEmbeddedExternalSurfaceState.getMatrix();
            AndroidMatrixConversions_androidKt.m8095setFromEL8BTi8(matrix, fArr);
        } else {
            matrix = null;
        }
        textureView.setTransform(matrix);
        return ab.f48028a;
    }

    static final ab AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3(Modifier modifier, boolean z, long j2, float[] fArr, l lVar, int i2, int i3, Composer composer, int i4) {
        m1966AndroidEmbeddedExternalSurfacesv6N_fY(modifier, z, j2, fArr, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1967AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier r20, boolean r21, long r22, int r24, boolean r25, final h.g.a.l<? super androidx.compose.foundation.AndroidExternalSurfaceScope, h.ab> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidExternalSurface_androidKt.m1967AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier, boolean, long, int, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurfaceView AndroidExternalSurface_58FFMhA$lambda$0$0(l lVar, AndroidExternalSurfaceState androidExternalSurfaceState, Context context) {
        SurfaceView surfaceView = new SurfaceView(context);
        lVar.invoke(androidExternalSurfaceState);
        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
        return surfaceView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AndroidExternalSurface_58FFMhA$lambda$1$0(SurfaceView surfaceView) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AndroidExternalSurface_58FFMhA$lambda$2$0(long j2, boolean z, int i2, boolean z2, SurfaceView surfaceView) {
        if (IntSize.m11337equalsimpl0(j2, IntSize.Companion.m11344getZeroYbymL2g())) {
            surfaceView.getHolder().setSizeFromLayout();
        } else {
            surfaceView.getHolder().setFixedSize((int) (j2 >> 32), (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        surfaceView.getHolder().setFormat(true != z ? -3 : -1);
        if (AndroidExternalSurfaceZOrder.m1958equalsimpl0(i2, AndroidExternalSurfaceZOrder.Companion.m1962getBehindB_4ceCc())) {
            surfaceView.setZOrderOnTop(false);
        } else if (AndroidExternalSurfaceZOrder.m1958equalsimpl0(i2, AndroidExternalSurfaceZOrder.Companion.m1963getMediaOverlayB_4ceCc())) {
            surfaceView.setZOrderMediaOverlay(true);
        } else if (AndroidExternalSurfaceZOrder.m1958equalsimpl0(i2, AndroidExternalSurfaceZOrder.Companion.m1964getOnTopB_4ceCc())) {
            surfaceView.setZOrderOnTop(true);
        }
        surfaceView.setSecure(z2);
        return ab.f48028a;
    }

    static final ab AndroidExternalSurface_58FFMhA$lambda$3(Modifier modifier, boolean z, long j2, int i2, boolean z2, l lVar, int i3, int i4, Composer composer, int i5) {
        m1967AndroidExternalSurface58FFMhA(modifier, z, j2, i2, z2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i2, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:370)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        af afVar = (af) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new AndroidEmbeddedExternalSurfaceState(afVar);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEmbeddedExternalSurfaceState;
    }

    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i2, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:187)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        af afVar = (af) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new AndroidExternalSurfaceState(afVar);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidExternalSurfaceState;
    }
}
