package com.waze.ui.q;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.waze.strings.DisplayStrings;
import com.waze.ui.ac.i;
import com.waze.z.a.aa;
import com.waze.z.a.z;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43252a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final RoundedCornerShape f43253b = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final ExitTransition f43254c = EnterExitTransitionKt.m1754scaleOutL8ZKhE$default(aa.d(z.f46212a), 0.8f, 0, 4, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null));

    /* renamed from: d, reason: collision with root package name */
    private static final EnterTransition f43255d = EnterExitTransitionKt.m1752scaleInL8ZKhE$default(aa.c(z.f46212a), 0.8f, 0, 4, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null));

    public static final EnterTransition a() {
        return f43255d;
    }

    public static final ExitTransition b() {
        return f43254c;
    }

    public static final void c(final h hVar, final String str, TransitionState transitionState, Modifier modifier, String str2, i iVar, final l lVar, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        String str3;
        i iVar2;
        x.f(hVar, "style");
        x.f(str, "message");
        x.f(transitionState, "visibleState");
        x.f(lVar, "eventCallback");
        Composer composerStartRestartGroup = composer.startRestartGroup(1739529177);
        if ((i2 & 6) == 0) {
            i3 = (true != composerStartRestartGroup.changed(hVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(true) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(transitionState) : composerStartRestartGroup.changedInstance(transitionState)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i3 |= true != composerStartRestartGroup.changed(modifier2) ? 8192 : 16384;
        } else {
            modifier2 = modifier;
        }
        if ((196608 & i2) == 0) {
            str3 = str2;
            i3 |= true != composerStartRestartGroup.changed(str3) ? 65536 : 131072;
        } else {
            str3 = str2;
        }
        if ((1572864 & i2) == 0) {
            iVar2 = iVar;
            i3 |= true != composerStartRestartGroup.changed(iVar2) ? 524288 : 1048576;
        } else {
            iVar2 = iVar;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1739529177, i3, -1, "com.waze.ui.message_card.AnimatedMessageCard (MessageCard.kt:186)");
            }
            final Modifier modifier3 = modifier2;
            final String str4 = str3;
            final i iVar3 = iVar2;
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) transitionState.getTargetState()).booleanValue(), (Modifier) null, f43255d, f43254c, (String) null, ComposableLambdaKt.rememberComposableLambda(382012081, true, new q() { // from class: com.waze.ui.q.f
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i4 = g.f43252a;
                    x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(382012081, iIntValue, -1, "com.waze.ui.message_card.AnimatedMessageCard.<anonymous> (MessageCard.kt:192)");
                    }
                    l lVar2 = lVar;
                    i iVar4 = iVar3;
                    String str5 = str4;
                    Modifier modifier4 = modifier3;
                    g.d(hVar, str, modifier4, str5, iVar4, lVar2, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.a.a.b(hVar, str, transitionState, modifier, str2, iVar, lVar, i2, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final com.waze.ui.q.h r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, java.lang.String r23, final com.waze.ui.ac.i r24, final h.g.a.l r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.q.g.d(com.waze.ui.q.h, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, com.waze.ui.ac.i, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
