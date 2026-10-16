package androidx.window.embedding;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.util.Consumer;
import h.g.a.l;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface EmbeddingInterfaceCompat {

    /* compiled from: WazeSource */
    public interface EmbeddingCallbackInterface {
        void onActivityStackChanged(List<ActivityStack> list);

        void onSplitInfoChanged(List<SplitInfo> list);
    }

    void addEmbeddedActivityWindowInfoCallbackForActivity(Activity activity, Consumer<EmbeddedActivityWindowInfo> consumer);

    void addOverlayInfoCallback(String str, Executor executor, Consumer<OverlayInfo> consumer);

    void clearOverlayAttributesCalculator();

    void clearSplitAttributesCalculator();

    void finishActivityStacks(Set<ActivityStack> set);

    void invalidateVisibleActivityStacks();

    boolean isActivityEmbedded(Activity activity);

    boolean pinTopActivityStack(int i2, SplitPinRule splitPinRule);

    void removeEmbeddedActivityWindowInfoCallbackForActivity(Consumer<EmbeddedActivityWindowInfo> consumer);

    void removeOverlayInfoCallback(Consumer<OverlayInfo> consumer);

    void setEmbeddingCallback(EmbeddingCallbackInterface embeddingCallbackInterface);

    void setEmbeddingConfiguration(EmbeddingConfiguration embeddingConfiguration);

    Bundle setLaunchingActivityStack(Bundle bundle, ActivityStack activityStack);

    void setOverlayAttributesCalculator(l<? super OverlayAttributesCalculatorParams, OverlayAttributes> lVar);

    Bundle setOverlayCreateParams(Bundle bundle, OverlayCreateParams overlayCreateParams);

    void setRules(Set<? extends EmbeddingRule> set);

    void setSplitAttributesCalculator(l<? super SplitAttributesCalculatorParams, SplitAttributes> lVar);

    void unpinTopActivityStack(int i2);

    void updateOverlayAttributes(String str, OverlayAttributes overlayAttributes);

    void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes);
}
