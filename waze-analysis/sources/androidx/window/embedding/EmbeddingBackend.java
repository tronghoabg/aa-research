package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.core.util.Consumer;
import androidx.window.embedding.EmbeddingBackend;
import androidx.window.embedding.SplitController;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface EmbeddingBackend {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.embedding.EmbeddingBackend$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static EmbeddingBackend getInstance(Context context) {
            return EmbeddingBackend.Companion.getInstance(context);
        }

        public static void overrideDecorator(EmbeddingBackendDecorator embeddingBackendDecorator) {
            EmbeddingBackend.Companion.overrideDecorator(embeddingBackendDecorator);
        }

        public static void reset() {
            EmbeddingBackend.Companion.reset();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static l<? super EmbeddingBackend, ? extends EmbeddingBackend> decorator = new l() { // from class: androidx.window.embedding.EmbeddingBackend$Companion$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                EmbeddingBackend embeddingBackend = (EmbeddingBackend) obj;
                EmbeddingBackend.Companion.decorator$lambda$0(embeddingBackend);
                return embeddingBackend;
            }
        };

        private Companion() {
        }

        static final EmbeddingBackend decorator$lambda$0(EmbeddingBackend embeddingBackend) {
            x.f(embeddingBackend, "it");
            return embeddingBackend;
        }

        static final EmbeddingBackend reset$lambda$0(EmbeddingBackend embeddingBackend) {
            x.f(embeddingBackend, "it");
            return embeddingBackend;
        }

        public final EmbeddingBackend getInstance(Context context) {
            x.f(context, "context");
            return decorator.invoke(ExtensionEmbeddingBackend.Companion.getInstance(context));
        }

        public final void overrideDecorator(EmbeddingBackendDecorator embeddingBackendDecorator) {
            x.f(embeddingBackendDecorator, "overridingDecorator");
            decorator = new EmbeddingBackend$Companion$overrideDecorator$1(embeddingBackendDecorator);
        }

        public final void reset() {
            decorator = new l() { // from class: androidx.window.embedding.EmbeddingBackend$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    EmbeddingBackend embeddingBackend = (EmbeddingBackend) obj;
                    EmbeddingBackend.Companion.reset$lambda$0(embeddingBackend);
                    return embeddingBackend;
                }
            };
        }
    }

    void addEmbeddedActivityWindowInfoCallbackForActivity(Activity activity, Consumer<EmbeddedActivityWindowInfo> consumer);

    void addOverlayInfoCallback(String str, Executor executor, Consumer<OverlayInfo> consumer);

    void addRule(EmbeddingRule embeddingRule);

    void addSplitListenerForActivity(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer);

    void clearOverlayAttributesCalculator();

    void clearSplitAttributesCalculator();

    void finishActivityStacks(Set<ActivityStack> set);

    ActivityStack getActivityStack(Activity activity);

    Set<EmbeddingRule> getRules();

    SplitController.SplitSupportStatus getSplitSupportStatus();

    void invalidateVisibleActivityStacks();

    boolean isActivityEmbedded(Activity activity);

    boolean pinTopActivityStack(int i2, SplitPinRule splitPinRule);

    void removeEmbeddedActivityWindowInfoCallbackForActivity(Consumer<EmbeddedActivityWindowInfo> consumer);

    void removeOverlayInfoCallback(Consumer<OverlayInfo> consumer);

    void removeRule(EmbeddingRule embeddingRule);

    void removeSplitListenerForActivity(Consumer<List<SplitInfo>> consumer);

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
