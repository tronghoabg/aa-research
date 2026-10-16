package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {
    private final MutableState<p<Composer, Integer, ab>> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(420213850);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(420213850, i3, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:615)");
            }
            p<Composer, Integer, ab> value = this.content.getValue();
            if (value == null) {
                composerStartRestartGroup.startReplaceGroup(-1238823553);
            } else {
                composerStartRestartGroup.startReplaceGroup(98585282);
                value.invoke(composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass1(i2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(p<? super Composer, ? super Integer, ab> pVar) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(pVar);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            createComposition();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.ComposeView$Content$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2) {
            super(2);
            this.$$changed = i2;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }

        public final void invoke(Composer composer, int i2) {
            ComposeView.this.Content(composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
