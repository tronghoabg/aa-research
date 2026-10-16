package com.waze;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AbstractComposeView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class MapCoverView extends AbstractComposeView {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f13558a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f13559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapCoverView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        h.g.b.x.f(context, "context");
        this.f13559b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new h.k(false, false), null, 2, null);
    }

    public static /* synthetic */ h.ab a(MapCoverView mapCoverView) {
        Runnable runnable = mapCoverView.f13558a;
        if (runnable != null) {
            runnable.run();
        }
        return h.ab.f48028a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1988539375);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1988539375, i3, -1, "com.waze.MapCoverView.Content (MapCoverComposable.kt:85)");
            }
            h.k kVar = (h.k) this.f13559b.getValue();
            final boolean zBooleanValue = ((Boolean) kVar.a()).booleanValue();
            final boolean zBooleanValue2 = ((Boolean) kVar.b()).booleanValue();
            com.waze.car_lib.r.cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1170253901, true, new h.g.a.p() { // from class: com.waze.fc
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1170253901, iIntValue, -1, "com.waze.MapCoverView.Content.<anonymous> (MapCoverComposable.kt:88)");
                        }
                        MapCoverView mapCoverView = this.f23843a;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, Color.m8227copywmQWz5c$default(com.waze.bz.a.d(composer2, 0).c(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 0.0f, 1, null);
                        boolean zChangedInstance = composer2.changedInstance(mapCoverView);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new com.airbnb.lottie.b.v(mapCoverView, 8);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        ix.b(com.waze.z.a.be.J(modifierFillMaxSize$default, false, null, (h.g.a.a) objRememberedValue, composer2, 0, 15), zBooleanValue, zBooleanValue2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(this, i2, i5));
        }
    }

    public final void b(Runnable runnable) {
        this.f13558a = runnable;
    }

    public final void c(boolean z) {
        this.f13559b.setValue(new h.k(false, Boolean.valueOf(z)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        h.g.b.x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapCoverView(Context context) {
        this(context, null, 0, 6, null);
        h.g.b.x.f(context, "context");
    }

    public /* synthetic */ MapCoverView(Context context, AttributeSet attributeSet, int i2, int i3, h.g.b.o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
