package androidx.compose.ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.DpKt;
import androidx.media3.muxer.MuxerUtil;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AndroidWindowInfo_androidKt {
    public static final DerivedSize calculateWindowSize(View view) {
        Context context = view.getContext();
        Context contextTryUnwrapContext = tryUnwrapContext(context);
        if (contextTryUnwrapContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            return DerivedSize.Companion.m10228fromDpSizeitqla9I(DpKt.m11186DpSizeYgX7TsA(configuration.screenWidthDp, configuration.screenHeightDp), AndroidDensity_androidKt.Density(context));
        }
        WindowMetrics windowMetricsComputeCurrentWindowMetrics = WindowMetricsCalculator.Companion.getOrCreate().computeCurrentWindowMetrics(contextTryUnwrapContext);
        return DerivedSize.Companion.m10229fromPxSizeviCIZxY((windowMetricsComputeCurrentWindowMetrics.getBounds().width() << 32) | (windowMetricsComputeCurrentWindowMetrics.getBounds().height() & MuxerUtil.UNSIGNED_INT_MAX_VALUE), AndroidDensity_androidKt.Density(contextTryUnwrapContext));
    }

    private static final Context tryUnwrapContext(Context context) {
        while (context instanceof ContextWrapper) {
            if ((context instanceof Activity) || (context instanceof InputMethodService) || (context instanceof Application)) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}
