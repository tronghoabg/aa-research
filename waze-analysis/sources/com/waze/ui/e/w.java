package com.waze.ui.e;

import android.content.res.Configuration;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w {
    public static final boolean a(x xVar) {
        h.g.b.x.f(xVar, "<this>");
        return xVar == x.f42252a || xVar == x.f42253b || xVar == x.f42254c || xVar == x.f42256e;
    }

    public static final v b(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1493789632, 0, -1, "com.waze.ui.button_pack.rememberPackButtonCollapsedState (PackButtonCollapseState.kt:158)");
        }
        Configuration configuration = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new v();
            composer.updateRememberedValue(objRememberedValue);
        }
        v vVar = (v) objRememberedValue;
        Integer numValueOf = Integer.valueOf(configuration.orientation);
        boolean zChangedInstance = composer.changedInstance(configuration);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (h.g.a.p) new c(vVar, configuration, (h.c.e) null, 3);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(numValueOf, (h.g.a.p<? super af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.waze.ui.f.ak r26, androidx.compose.ui.Modifier r27, h.g.a.a r28, com.waze.ui.f.aa r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.e.w.c(com.waze.ui.f.ak, androidx.compose.ui.Modifier, h.g.a.a, com.waze.ui.f.aa, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0c9a  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0ea2  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0f15  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x105a  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x1066  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x106a  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x10a8  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x10bd  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x10f3  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x10ff  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x1103  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x114b  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x115c  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x1198  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x11e9  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x11f6  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x121c  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x1238  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x1264  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x127a  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x13cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x13eb  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x13f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:712:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final com.waze.ui.e.y r85, androidx.compose.ui.Modifier r86, com.waze.ui.e.v r87, long r88, final h.g.a.a r90, final h.g.a.a r91, h.g.a.q r92, androidx.compose.runtime.Composer r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 5132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.e.w.f(com.waze.ui.e.y, androidx.compose.ui.Modifier, com.waze.ui.e.v, long, h.g.a.a, h.g.a.a, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void h(float f2, long j2) {
        float f3 = f2 / 2.0f;
        Offset.m7987timestuRUvjQ(Offset.m7984minusMKHz9U(j2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 3.5714285f);
    }

    public static final void i(x xVar, Transition transition) {
        h.g.b.x.f(xVar, "currentState");
        h.g.b.x.f(transition, "transition");
    }

    static /* synthetic */ SpringSpec k(Composer composer, int i2) {
        composer.startReplaceGroup(-985243360);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-985243360, i2, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:2155)");
        }
        SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return springSpecSpring$default;
    }

    private static final float l(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float m(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float n(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float o(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float p(State state) {
        return ((Dp) state.getValue()).m11178unboximpl();
    }

    private static final float q(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float r(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final long s(State state) {
        return ((Color) state.getValue()).m8238unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final z t(MutableState mutableState) {
        return (z) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    private static final com.airbnb.lottie.h v(com.airbnb.lottie.b.w wVar) {
        return a.a.G(wVar);
    }

    private static final float w(String str, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(931991107, 0, -1, "com.waze.ui.button_pack.getTextWidth (ButtonPackButton.kt:593)");
        }
        TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composer, 0, 1);
        float fMo2124toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2124toDpu2uoSUM((int) (textMeasurerRememberTextMeasurer.m10521measurewNUYSr0(str, (1004 & 2) != 0 ? TextStyle.Companion.getDefault() : com.waze.bz.a.h(composer).h(), (1004 & 4) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : 0, (!((1004 & 8) == 0)) | false, (1004 & 16) != 0 ? Integer.MAX_VALUE : 1, (1004 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (1004 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (1004 & 128) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (1004 & 256) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, ((1004 & 512) == 0) & false).m10517getSizeYbymL2g() >> 32));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo2124toDpu2uoSUM;
    }
}
