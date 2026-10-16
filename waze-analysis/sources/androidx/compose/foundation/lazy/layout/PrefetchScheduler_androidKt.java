package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.waze.R;
import h.g.b.x;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PrefetchScheduler_androidKt {
    private static final PrefetchScheduler_androidKt$RobolectricImpl$1 RobolectricImpl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1] */
    static {
        PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$1 = null;
        prefetchScheduler_androidKt$RobolectricImpl$1 = null;
        if (Build.FINGERPRINT != null) {
            String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            if (x.n(lowerCase, "robolectric")) {
                prefetchScheduler_androidKt$RobolectricImpl$1 = new PrefetchScheduler() { // from class: androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1
                    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler, androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
                    public void schedulePrefetch(PrefetchRequest prefetchRequest) {
                    }
                };
            }
        }
        RobolectricImpl = prefetchScheduler_androidKt$RobolectricImpl$1;
    }

    public static final PrefetchScheduler rememberDefaultPrefetchScheduler(Composer composer, int i2) {
        PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141871251, i2, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$12 = RobolectricImpl;
        if (prefetchScheduler_androidKt$RobolectricImpl$12 != null) {
            composer.startReplaceGroup(1345554384);
            composer.endReplaceGroup();
            prefetchScheduler_androidKt$RobolectricImpl$1 = prefetchScheduler_androidKt$RobolectricImpl$12;
        } else {
            composer.startReplaceGroup(1345603457);
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            boolean zChanged = composer.changed(view);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                objRememberedValue = tag instanceof PrefetchScheduler ? (PrefetchScheduler) tag : null;
                if (objRememberedValue == null) {
                    Object androidPrefetchScheduler = new AndroidPrefetchScheduler(view);
                    view.setTag(R.id.compose_prefetch_scheduler, androidPrefetchScheduler);
                    objRememberedValue = (PrefetchScheduler) androidPrefetchScheduler;
                }
                composer.updateRememberedValue(objRememberedValue);
            }
            prefetchScheduler_androidKt$RobolectricImpl$1 = (PrefetchScheduler) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return prefetchScheduler_androidKt$RobolectricImpl$1;
    }

    private static /* synthetic */ void getRobolectricImpl$annotations() {
    }
}
