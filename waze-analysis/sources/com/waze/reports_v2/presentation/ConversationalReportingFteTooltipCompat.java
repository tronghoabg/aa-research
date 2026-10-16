package com.waze.reports_v2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.waze.fa;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ConversationalReportingFteTooltipCompat extends AbstractComposeView {

    /* renamed from: a, reason: collision with root package name */
    private final MutableState f34607a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationalReportingFteTooltipCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        h.g.b.x.f(context, "context");
        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        this.f34607a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1470222749);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1470222749, i3, -1, "com.waze.reports_v2.presentation.ConversationalReportingFteTooltipCompat.Content (ConversationalReportingFteTooltip.kt:83)");
            }
            h.g.a.a aVar = (h.g.a.a) this.f34607a.getValue();
            if (aVar == null) {
                composerStartRestartGroup.startReplaceGroup(670613201);
            } else {
                composerStartRestartGroup.startReplaceGroup(670613202);
                bx.c(aVar, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(this, i2, 16));
        }
    }

    public final void a() {
        this.f34607a.setValue(null);
    }

    public final void b(h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar, "onShown");
        h.g.b.x.f(aVar2, "onDismissedByUI");
        MutableState mutableState = this.f34607a;
        if (mutableState.getValue() != null) {
            return;
        }
        mutableState.setValue(aVar2);
        aVar.invoke();
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        h.g.a.a aVar;
        if (!z && (aVar = (h.g.a.a) this.f34607a.getValue()) != null) {
            aVar.invoke();
        }
        super.onVisibilityAggregated(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationalReportingFteTooltipCompat(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        h.g.b.x.f(context, "context");
    }

    public /* synthetic */ ConversationalReportingFteTooltipCompat(Context context, AttributeSet attributeSet, int i2, h.g.b.o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
