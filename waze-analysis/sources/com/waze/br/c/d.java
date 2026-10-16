package com.waze.br.c;

import android.content.Context;
import android.content.Intent;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.settings.SettingsMainActivity;
import com.waze.settings.al;
import com.waze.strings.DisplayStrings;
import h.ab;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {
    public static final void a(n nVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        n nVar2;
        Modifier modifier2;
        int i4;
        h.g.b.x.f(modifier, "modifier");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-131782010);
        int i6 = 2;
        int i7 = 1;
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(nVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131782010, i3, -1, "com.waze.search_mate.presentation.SearchMateOverlay (SearchMateOverlay.kt:30)");
            }
            if (nVar instanceof i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(nVar, modifier, i2, 20, null));
                    return;
                }
                return;
            }
            nVar2 = nVar;
            modifier2 = modifier;
            i4 = i2;
            int i8 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new com.waze.bk.f(nVar2, i7));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i8 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new com.waze.bk.f(nVar2, i6));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            d((w) ((State) objRememberedValue2).getValue(), (x) state.getValue(), modifier2, composerStartRestartGroup, (i3 << 3) & DisplayStrings.DS_TAP_TO_VERIFY);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            nVar2 = nVar;
            modifier2 = modifier;
            i4 = i2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new com.waze.copilot.presentation.c(nVar2, modifier2, i4, 3, null));
        }
    }

    public static /* synthetic */ ab c(List list, State state, State state2, State state3, State state4, MutableFloatState mutableFloatState, State state5, DrawScope drawScope) throws Throwable {
        DrawContext drawContext;
        DrawScope drawScope2 = drawScope;
        h.g.b.x.f(drawScope2, "$this$Canvas");
        char c2 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float fFloatValue = ((Number) state.getValue()).floatValue();
        float fFloatValue2 = (fFloatValue + fFloatValue) * ((Number) state2.getValue()).floatValue();
        float f2 = fIntBitsToFloat2 * 0.75f;
        float f3 = drawScope2.mo2127toPx0680j_4(360.0f) * ((Number) state3.getValue()).floatValue() * 0.22f;
        float fFloatValue3 = fIntBitsToFloat * ((Number) state3.getValue()).floatValue() * 0.22f;
        float fFloatValue4 = ((((Number) state4.getValue()).floatValue() * 100.0f) + 8.0f) * ((Number) state3.getValue()).floatValue();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            float f4 = fFloatValue2 + 1.0f;
            float f5 = fFloatValue4 * f4;
            float f6 = fFloatValue3 * f4;
            float f7 = f3 * f4;
            long jM8238unboximpl = ((Color) obj).m8238unboximpl();
            float fG = g(mutableFloatState);
            float f8 = i2;
            float fSin = (float) Math.sin((((Number) state5.getValue()).floatValue() * f8) + fG);
            float fCos = f2 + (f5 * ((float) Math.cos((fG * 1.2f) + f8)));
            float f9 = (fIntBitsToFloat * 0.5f) + (0.4f * fIntBitsToFloat * fSin);
            long jFloatToRawIntBits = Float.floatToRawIntBits(f9) << c2;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fCos) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            DrawContext drawContext2 = drawScope2.getDrawContext();
            char c3 = c2;
            float f10 = fIntBitsToFloat;
            long jMo8758getSizeNHjbRc = drawContext2.mo8758getSizeNHjbRc();
            drawContext2.getCanvas().save();
            try {
                drawContext2.getTransform().mo8765scale0AR0LA0(f6 / f7, 1.0f, jFloatToRawIntBits | jFloatToRawIntBits2);
                try {
                    DrawScope.CC.m8822drawCircleV9BoPsw$default(drawScope2, Brush.Companion.m8180radialGradientP_VxKs$default(Brush.Companion, new h.k[]{new h.k(Float.valueOf(0.0f), Color.m8218boximpl(Color.m8227copywmQWz5c$default(jM8238unboximpl, Color.m8230getAlphaimpl(jM8238unboximpl) * 0.75f, 0.0f, 0.0f, 0.0f, 14, null))), new h.k(Float.valueOf(0.5f), Color.m8218boximpl(Color.m8227copywmQWz5c$default(jM8238unboximpl, Color.m8230getAlphaimpl(jM8238unboximpl) * 0.25f, 0.0f, 0.0f, 0.0f, 14, null))), new h.k(Float.valueOf(1.0f), Color.m8218boximpl(Color.Companion.m8263getTransparent0d7_KjU()))}, (Float.floatToRawIntBits(f9) << c3) | (Float.floatToRawIntBits(fCos) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f7, 0, 8, (Object) null), f7, (Float.floatToRawIntBits(f9) << c3) | (Float.floatToRawIntBits(fCos) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), 0.0f, null, null, BlendMode.Companion.m8162getScreen0nO6VwU(), 56, null);
                    drawContext2.getCanvas().restore();
                    drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                    drawScope2 = drawScope;
                    i2 = i3;
                    c2 = c3;
                    fIntBitsToFloat = f10;
                } catch (Throwable th) {
                    th = th;
                    drawContext = drawContext2;
                    drawContext.getCanvas().restore();
                    drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                drawContext = drawContext2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.ui.draw.BlurredEdgeTreatment, h.c.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public static final void d(w wVar, x xVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4;
        ?? r15;
        float fFloatValue;
        h.g.b.x.f(wVar, "amplitude");
        h.g.b.x.f(xVar, "state");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1722497777);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(wVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(xVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1722497777, i3, -1, "com.waze.search_mate.presentation.SearchMateGlow (SearchMateGlow.kt:226)");
            }
            final List listI = h.a.i.i(Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).G()), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).G()), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).H()), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).E()), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).E()), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).F()), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).F()));
            if (wVar instanceof u) {
                composerStartRestartGroup.startReplaceGroup(-1757938700);
                composerStartRestartGroup.endReplaceGroup();
                fFloatValue = ((u) wVar).a();
                i4 = 2;
                r15 = 0;
            } else {
                if (!(wVar instanceof v)) {
                    composerStartRestartGroup.startReplaceGroup(-1757939814);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(1338537491);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.01f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i6 = i3 & 14;
                MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
                c cVarRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i6 == 4 || cVarRememberedValue == Composer.Companion.getEmpty()) {
                    cVarRememberedValue = new c(wVar, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(cVarRememberedValue);
                }
                EffectsKt.LaunchedEffect(wVar, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) cVarRememberedValue, composerStartRestartGroup, i6);
                i4 = 2;
                r15 = 0;
                fFloatValue = ((Number) AnimateAsStateKt.animateFloatAsState(mutableFloatState.getFloatValue(), AnimationSpecKt.tween$default(DisplayStrings.DS_NIGHT, 0, EasingKt.getLinearOutSlowInEasing(), 2, null), 0.0f, "randomAmplitude", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20).getValue()).floatValue();
                composerStartRestartGroup.endReplaceGroup();
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(h.k.n.f(fFloatValue, 0.6f), AnimationSpecKt.spring$default(1.0f, 200.0f, r15, 4, r15), 0.0f, "amplitude", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 20);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(xVar.c() * xVar.d(), AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), i4, r15), 0.0f, "animatedSpeed", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20);
            final State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(xVar.a(), AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), i4, r15), 0.0f, "animatedAmp", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20);
            final State<Float> stateAnimateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(xVar.e(), AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), i4, r15), 0.0f, "animatedThicknessMultiplier", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20);
            final State<Float> stateAnimateFloatAsState5 = AnimateAsStateKt.animateFloatAsState(xVar.b(), AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), i4, r15), 0.0f, "animatedRippleDensity", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20);
            final State<Float> stateAnimateFloatAsState6 = AnimateAsStateKt.animateFloatAsState((xVar == x.f17418c || xVar == x.f17420e) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), i4, r15), 0.0f, "useAmplitude", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            ab abVar = ab.f48028a;
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState2);
            b bVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || bVarRememberedValue == Composer.Companion.getEmpty()) {
                bVarRememberedValue = new b(mutableFloatState2, stateAnimateFloatAsState2, r15);
                composerStartRestartGroup.updateRememberedValue(bVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) bVarRememberedValue, composerStartRestartGroup, 6);
            Modifier modifierM7748blurF8QBwvs$default = BlurKt.m7748blurF8QBwvs$default(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, r15), 400.0f), 60.0f, r15, i4, r15);
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | composerStartRestartGroup.changed(stateAnimateFloatAsState6) | composerStartRestartGroup.changed(stateAnimateFloatAsState4) | composerStartRestartGroup.changed(stateAnimateFloatAsState3) | composerStartRestartGroup.changed(listI) | composerStartRestartGroup.changed(stateAnimateFloatAsState5);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new h.g.a.l() { // from class: com.waze.br.c.a
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return d.c(listI, stateAnimateFloatAsState, stateAnimateFloatAsState6, stateAnimateFloatAsState4, stateAnimateFloatAsState3, mutableFloatState2, stateAnimateFloatAsState5, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CanvasKt.Canvas(modifierM7748blurF8QBwvs$default, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w((Object) wVar, (Object) xVar, modifier, i2, 18));
        }
    }

    public static final Intent e(Context context, String str, String str2) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(str, "model");
        h.g.b.x.f(str2, TtmlNode.ATTR_TTS_ORIGIN);
        Intent intentPutExtra = new Intent(context, (Class<?>) SettingsMainActivity.class).putExtra("model", str).putExtra(TtmlNode.ATTR_TTS_ORIGIN, str2);
        h.g.b.x.e(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public static final al f(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        return new al(aVar, h.a.i.i(new com.waze.settings.tree.d.g(CredentialEntry.TRUE_STRING, com.waze.ui.ad.b.c(Integer.valueOf(R.string.CALENDAR_REMINDER_OPTIONS_EARLY_AND_TTL)), null, null, null, null, 60), new com.waze.settings.tree.d.g(CredentialEntry.FALSE_STRING, com.waze.ui.ad.b.c(Integer.valueOf(R.string.CALENDAR_REMINDER_OPTIONS_TTL_ONLY)), null, null, null, null, 60), new com.waze.settings.tree.d.g("none", com.waze.ui.ad.b.c(Integer.valueOf(R.string.CALENDAR_REMINDER_OPTIONS_NONE)), null, null, null, null, 60)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }
}
