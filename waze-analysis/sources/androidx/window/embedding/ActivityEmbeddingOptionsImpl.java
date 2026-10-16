package androidx.window.embedding;

import android.os.Bundle;
import androidx.window.WindowSdkExtensions;
import androidx.window.embedding.EmbeddingBounds;
import androidx.window.extensions.embedding.ActivityStack;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityEmbeddingOptionsImpl {
    private static final String DIMENSION_TYPE_EXPANDED = "expanded";
    private static final String DIMENSION_TYPE_HINGE = "hinge";
    private static final String DIMENSION_TYPE_PIXEL = "pixel";
    private static final String DIMENSION_TYPE_RATIO = "ratio";
    public static final ActivityEmbeddingOptionsImpl INSTANCE = new ActivityEmbeddingOptionsImpl();
    private static final String KEY_ACTIVITY_STACK_ALIGNMENT = "androidx.window.embedding.ActivityStackAlignment";
    private static final String KEY_EMBEDDING_BOUNDS = "androidx.window.embedding.EmbeddingBounds";
    private static final String KEY_EMBEDDING_BOUNDS_ALIGNMENT = "androidx.window.embedding.EmbeddingBounds.alignment";
    private static final String KEY_EMBEDDING_BOUNDS_DIMENSION_TYPE = "androidx.window.embedding.EmbeddingBounds.dimension_type";
    private static final String KEY_EMBEDDING_BOUNDS_DIMENSION_VALUE = "androidx.window.embedding.EmbeddingBounds.dimension_value";
    private static final String KEY_EMBEDDING_BOUNDS_HEIGHT = "androidx.window.embedding.EmbeddingBounds.height";
    private static final String KEY_EMBEDDING_BOUNDS_WIDTH = "androidx.window.embedding.EmbeddingBounds.width";

    private ActivityEmbeddingOptionsImpl() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final EmbeddingBounds.Dimension getDimension(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        x.c(bundle2);
        String string = bundle2.getString(KEY_EMBEDDING_BOUNDS_DIMENSION_TYPE);
        if (string != null) {
            switch (string.hashCode()) {
                case -1939100487:
                    if (string.equals(DIMENSION_TYPE_EXPANDED)) {
                        return EmbeddingBounds.Dimension.DIMENSION_EXPANDED;
                    }
                    break;
                case 99283243:
                    if (string.equals(DIMENSION_TYPE_HINGE)) {
                        return EmbeddingBounds.Dimension.DIMENSION_HINGE;
                    }
                    break;
                case 106680966:
                    if (string.equals(DIMENSION_TYPE_PIXEL)) {
                        return EmbeddingBounds.Dimension.Companion.pixel(bundle2.getInt(KEY_EMBEDDING_BOUNDS_DIMENSION_VALUE));
                    }
                    break;
                case 108285963:
                    if (string.equals(DIMENSION_TYPE_RATIO)) {
                        return EmbeddingBounds.Dimension.Companion.ratio(bundle2.getFloat(KEY_EMBEDDING_BOUNDS_DIMENSION_VALUE));
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Illegal type ".concat(String.valueOf(string)));
    }

    private final EmbeddingBounds getEmbeddingBounds(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(KEY_EMBEDDING_BOUNDS);
        if (bundle2 == null) {
            return null;
        }
        return new EmbeddingBounds(new EmbeddingBounds.Alignment(bundle2.getInt(KEY_EMBEDDING_BOUNDS_ALIGNMENT)), getDimension(bundle2, KEY_EMBEDDING_BOUNDS_WIDTH), getDimension(bundle2, KEY_EMBEDDING_BOUNDS_HEIGHT));
    }

    private final void putDimension(Bundle bundle, String str, EmbeddingBounds.Dimension dimension) {
        Bundle bundle2 = new Bundle();
        if (x.n(dimension, EmbeddingBounds.Dimension.DIMENSION_EXPANDED)) {
            bundle2.putString(KEY_EMBEDDING_BOUNDS_DIMENSION_TYPE, DIMENSION_TYPE_EXPANDED);
        } else if (x.n(dimension, EmbeddingBounds.Dimension.DIMENSION_HINGE)) {
            bundle2.putString(KEY_EMBEDDING_BOUNDS_DIMENSION_TYPE, DIMENSION_TYPE_HINGE);
        } else if (dimension instanceof EmbeddingBounds.Dimension.Ratio) {
            bundle2.putString(KEY_EMBEDDING_BOUNDS_DIMENSION_TYPE, DIMENSION_TYPE_RATIO);
            bundle2.putFloat(KEY_EMBEDDING_BOUNDS_DIMENSION_VALUE, ((EmbeddingBounds.Dimension.Ratio) dimension).getValue$window());
        } else if (dimension instanceof EmbeddingBounds.Dimension.Pixel) {
            bundle2.putString(KEY_EMBEDDING_BOUNDS_DIMENSION_TYPE, DIMENSION_TYPE_PIXEL);
            bundle2.putInt(KEY_EMBEDDING_BOUNDS_DIMENSION_VALUE, ((EmbeddingBounds.Dimension.Pixel) dimension).getValue$window());
        }
        bundle.putBundle(str, bundle2);
    }

    private final void putEmbeddingBounds(Bundle bundle, EmbeddingBounds embeddingBounds) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(KEY_EMBEDDING_BOUNDS_ALIGNMENT, embeddingBounds.getAlignment().getValue$window());
        ActivityEmbeddingOptionsImpl activityEmbeddingOptionsImpl = INSTANCE;
        activityEmbeddingOptionsImpl.putDimension(bundle2, KEY_EMBEDDING_BOUNDS_WIDTH, embeddingBounds.getWidth());
        activityEmbeddingOptionsImpl.putDimension(bundle2, KEY_EMBEDDING_BOUNDS_HEIGHT, embeddingBounds.getHeight());
        bundle.putBundle(KEY_EMBEDDING_BOUNDS, bundle2);
    }

    public final OverlayAttributes getOverlayAttributes$window(Bundle bundle) {
        x.f(bundle, "<this>");
        EmbeddingBounds embeddingBounds = getEmbeddingBounds(bundle);
        if (embeddingBounds == null) {
            return null;
        }
        return new OverlayAttributes(embeddingBounds);
    }

    public final void putActivityStackAlignment$window(Bundle bundle, EmbeddingBounds embeddingBounds) {
        x.f(bundle, "<this>");
        x.f(embeddingBounds, "embeddingBounds");
        bundle.putInt(KEY_ACTIVITY_STACK_ALIGNMENT, embeddingBounds.getAlignment().getValue$window());
    }

    public final void setActivityStackToken$window(Bundle bundle, ActivityStack.Token token) {
        x.f(bundle, "options");
        x.f(token, "activityStackToken");
        bundle.putBundle("androidx.window.extensions.embedding.ActivityStackToken", token.toBundle());
    }

    public final void setOverlayCreateParams$window(Bundle bundle, OverlayCreateParams overlayCreateParams) {
        x.f(bundle, "options");
        x.f(overlayCreateParams, "overlayCreateParams");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(8);
        bundle.putString("androidx.window.extensions.embedding.OverlayTag", overlayCreateParams.getTag());
        putEmbeddingBounds(bundle, overlayCreateParams.getOverlayAttributes().getBounds());
    }
}
