package androidx.compose.foundation.text.selection;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.ProcessText_androidKt;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.LocaleList;
import h.ab;
import h.c.j;
import h.g.a.a;
import h.g.a.l;
import h.g.a.r;
import h.g.b.x;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviors_androidKt {
    private static final ProvidableCompositionLocal<j> LocalTextClassifierCoroutineContext = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return av.b();
        }
    });
    private static r<? super j, ? super Context, ? super SelectedTextType, ? super LocaleList, ? extends PlatformSelectionBehaviors> PlatformSelectionBehaviorsFactory = new r() { // from class: androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt$$ExternalSyntheticLambda1
        @Override // h.g.a.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return PlatformSelectionBehaviors_androidKt.PlatformSelectionBehaviorsFactory$lambda$0((j) obj, (Context) obj2, (SelectedTextType) obj3, (LocaleList) obj4);
        }
    };
    private static final long TEXT_CLASSIFICATION_TIMEOUT_MILLIS = 200;
    private static final long TEXT_CLASSIFIER_INITIALIZATION_TIMEOUT_MILLIS = 300;

    static final PlatformSelectionBehaviorsImpl PlatformSelectionBehaviorsFactory$lambda$0(j jVar, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        return new PlatformSelectionBehaviorsImpl(jVar, context, selectedTextType, localeList);
    }

    /* renamed from: addPlatformTextContextMenuItems-71BSaZU, reason: not valid java name */
    public static final void m3863addPlatformTextContextMenuItems71BSaZU(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, boolean z, CharSequence charSequence, TextRange textRange, PlatformSelectionBehaviors platformSelectionBehaviors, l<? super TextContextMenuBuilderScope, ab> lVar) {
        if (charSequence != null && textRange != null && platformSelectionBehaviors != null && (platformSelectionBehaviors instanceof PlatformSelectionBehaviorsImpl)) {
            ((PlatformSelectionBehaviorsImpl) platformSelectionBehaviors).m3860addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(textContextMenuBuilderScope, charSequence, textRange.m10550unboximpl(), lVar);
            ProcessText_androidKt.m3431addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.m10550unboximpl());
            return;
        }
        lVar.invoke(textContextMenuBuilderScope);
        if (charSequence == null || textRange == null) {
            return;
        }
        ProcessText_androidKt.m3431addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.m10550unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: canReuse-h5sm0ck, reason: not valid java name */
    public static final boolean m3864canReuseh5sm0ck(TextClassificationResult textClassificationResult, CharSequence charSequence, long j2) {
        return TextRange.m10539equalsimpl0(j2, textClassificationResult.m3912getSelectiond9O1mEE()) && x.n(charSequence, textClassificationResult.getText());
    }

    public static final ProvidableCompositionLocal<j> getLocalTextClassifierCoroutineContext() {
        return LocalTextClassifierCoroutineContext;
    }

    public static final r<j, Context, SelectedTextType, LocaleList, PlatformSelectionBehaviors> getPlatformSelectionBehaviorsFactory() {
        return PlatformSelectionBehaviorsFactory;
    }

    public static final PlatformSelectionBehaviors rememberPlatformSelectionBehaviors(SelectedTextType selectedTextType, LocaleList localeList, Composer composer, int i2) {
        composer.startReplaceGroup(430530635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(430530635, i2, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:97)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        j jVar = (j) composer.consume(LocalTextClassifierCoroutineContext);
        boolean zChanged = composer.changed(jVar) | composer.changed(context) | ((((i2 & 14) ^ 6) > 4 && composer.changed(selectedTextType.ordinal())) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(localeList)) || (i2 & 48) == 32);
        PlatformSelectionBehaviors platformSelectionBehaviorsRememberedValue = composer.rememberedValue();
        if (zChanged || platformSelectionBehaviorsRememberedValue == Composer.Companion.getEmpty()) {
            platformSelectionBehaviorsRememberedValue = PlatformSelectionBehaviorsFactory.invoke(jVar, context, selectedTextType, localeList);
            composer.updateRememberedValue(platformSelectionBehaviorsRememberedValue);
        }
        PlatformSelectionBehaviors platformSelectionBehaviors = (PlatformSelectionBehaviors) platformSelectionBehaviorsRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return platformSelectionBehaviors;
    }

    public static final void setPlatformSelectionBehaviorsFactory(r<? super j, ? super Context, ? super SelectedTextType, ? super LocaleList, ? extends PlatformSelectionBehaviors> rVar) {
        PlatformSelectionBehaviorsFactory = rVar;
    }

    public static /* synthetic */ void getPlatformSelectionBehaviorsFactory$annotations() {
    }
}
