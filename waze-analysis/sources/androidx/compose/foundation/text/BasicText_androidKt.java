package androidx.compose.foundation.text;

import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.ac;
import h.g.a.a;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BasicText_androidKt {
    private static final ProvidableCompositionLocal<Executor> LocalBackgroundTextMeasurementExecutor = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            int i2 = BasicText_androidKt.f1653a;
            return null;
        }
    });
    private static final int MaxTextLengthThreshold = 1000;
    private static final int MinTextLengthThreshold = 8;
    private static final int PrefetchTextMinimumCoreCount = 4;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1653a = 0;
    private static Boolean backingCoreCountSatisfactory;

    public static final void BackgroundTextMeasurement(final AnnotatedString annotatedString, final TextStyle textStyle, final FontFamily.Resolver resolver, final List<AnnotatedString.Range<Placeholder>> list, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-650368117, i2, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:112)");
        }
        Executor executor = (Executor) composer.consume(LocalBackgroundTextMeasurementExecutor);
        if (executor == null || !shouldPrefetch(annotatedString.length())) {
            composer.startReplaceGroup(-517090505);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-518737659);
            final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            try {
                executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BasicText_androidKt.BackgroundTextMeasurement$lambda$1(textStyle, layoutDirection, list, annotatedString, density, resolver);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    static final void BackgroundTextMeasurement$lambda$0(TextStyle textStyle, LayoutDirection layoutDirection, String str, Density density, FontFamily.Resolver resolver) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.Companion, null, null, 3, null);
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot$default;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    ParagraphIntrinsics paragraphIntrinsicsParagraphIntrinsics$default = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, TextStyleKt.resolveDefaults(textStyle, layoutDirection), ac.f47967a, density, resolver, (List) null, 32, (Object) null);
                    paragraphIntrinsicsParagraphIntrinsics$default.getMaxIntrinsicWidth();
                    paragraphIntrinsicsParagraphIntrinsics$default.getMinIntrinsicWidth();
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    mutableSnapshotTakeMutableSnapshot$default.dispose();
                } catch (Throwable th) {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    static final void BackgroundTextMeasurement$lambda$1(TextStyle textStyle, LayoutDirection layoutDirection, List list, AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.Companion, null, null, 3, null);
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot$default;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                    if (list == null) {
                        list = ac.f47967a;
                    }
                    MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, (List<AnnotatedString.Range<Placeholder>>) list, density, resolver);
                    multiParagraphIntrinsics.getMaxIntrinsicWidth();
                    multiParagraphIntrinsics.getMinIntrinsicWidth();
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    mutableSnapshotTakeMutableSnapshot$default.dispose();
                } catch (Throwable th) {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    static final Executor LocalBackgroundTextMeasurementExecutor$lambda$0() {
        return null;
    }

    public static final boolean getCoreCountSatisfactory() {
        Boolean boolValueOf = backingCoreCountSatisfactory;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            backingCoreCountSatisfactory = boolValueOf;
        }
        if (boolValueOf == null) {
            x.g();
        }
        return boolValueOf.booleanValue();
    }

    public static final ProvidableCompositionLocal<Executor> getLocalBackgroundTextMeasurementExecutor() {
        return LocalBackgroundTextMeasurementExecutor;
    }

    public static final boolean shouldPrefetch(int i2) {
        return i2 >= 8 && i2 < 1000 && getCoreCountSatisfactory();
    }

    public static /* synthetic */ void getCoreCountSatisfactory$annotations() {
    }

    public static final void BackgroundTextMeasurement(final String str, final TextStyle textStyle, final FontFamily.Resolver resolver, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1589371739, i2, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        Executor executor = (Executor) composer.consume(LocalBackgroundTextMeasurementExecutor);
        if (executor != null && shouldPrefetch(str.length())) {
            composer.startReplaceGroup(1254298614);
            final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            try {
                executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BasicText_androidKt.BackgroundTextMeasurement$lambda$0(textStyle, layoutDirection, str, density, resolver);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1255914055);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
