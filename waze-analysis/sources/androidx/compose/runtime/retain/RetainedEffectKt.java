package androidx.compose.runtime.retain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.waze.strings.DisplayStrings;
import h.g.a.a;
import h.g.a.l;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetainedEffectKt {
    private static final RetainedEffectScope InternalRetainedEffectScope = new RetainedEffectScope();
    private static final String RetainedEffectNoParamError = "RetainedEffect must provide one or more 'key' parameters that define the identity of the RetainedEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    public static final void RetainedEffect(Object obj, Object obj2, Object obj3, final l<? super RetainedEffectScope, ? extends RetainedEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(130977115, i2, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:243)");
        }
        boolean z = true;
        Object[] objArr = {obj, obj2, obj3};
        if ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) <= 2048 || !composer.changed(lVar)) && (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 2048) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return RetainedEffectKt.RetainedEffect$lambda$2$0(lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(objArr, 3), (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$0$0(l lVar) {
        return new RetainedEffectImpl(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$1$0(l lVar) {
        return new RetainedEffectImpl(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$2$0(l lVar) {
        return new RetainedEffectImpl(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$3$0(l lVar) {
        return new RetainedEffectImpl(lVar);
    }

    public static final void RetainedEffect(Object obj, Object obj2, final l<? super RetainedEffectScope, ? extends RetainedEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-593547589, i2, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:190)");
        }
        boolean z = true;
        Object[] objArr = {obj, obj2};
        if ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(lVar)) && (i2 & 384) != 256) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return RetainedEffectKt.RetainedEffect$lambda$1$0(lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(objArr, 2), (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void RetainedEffect(Object obj, final l<? super RetainedEffectScope, ? extends RetainedEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(45580315, i2, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:138)");
        }
        Object[] objArr = {obj};
        boolean z = (((i2 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i2 & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return RetainedEffectKt.RetainedEffect$lambda$0$0(lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(objArr, 1), (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void RetainedEffect(l<? super RetainedEffectScope, ? extends RetainedEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(829391227, i2, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:87)");
        }
        throw new IllegalStateException(RetainedEffectNoParamError);
    }

    public static final void RetainedEffect(Object[] objArr, final l<? super RetainedEffectScope, ? extends RetainedEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(712993160, i2, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:293)");
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean z = true;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(lVar)) && (i2 & 48) != 32) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return RetainedEffectKt.RetainedEffect$lambda$3$0(lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
