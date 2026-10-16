package androidx.webkit.internal;

import androidx.webkit.NavigationParameters;
import java.util.Map;
import org.chromium.support_lib_boundary.NavigationParametersBoundaryInterface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class NavigationParametersAdapter implements NavigationParametersBoundaryInterface {
    private static final String[] SUPPORTED_FEATURES = {"WEBVIEW_NAVIGATE_V1"};
    private final NavigationParameters mParams;

    public NavigationParametersAdapter(NavigationParameters navigationParameters) {
        this.mParams = navigationParameters;
    }

    @Override // org.chromium.support_lib_boundary.NavigationParametersBoundaryInterface
    public Map<String, String> getAdditionalHeaders() {
        return this.mParams.getAdditionalHeaders();
    }

    @Override // org.chromium.support_lib_boundary.NavigationParametersBoundaryInterface
    public boolean getShouldReplaceCurrentEntry() {
        return this.mParams.shouldReplaceCurrentEntry();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return SUPPORTED_FEATURES;
    }
}
