package androidx.webkit.internal;

import androidx.webkit.NoVarySearchHeader;
import androidx.webkit.PrefetchParameters;
import androidx.webkit.PrerenderParameters;
import androidx.webkit.SpeculativeLoadingParameters;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SpeculativeLoadingParametersAdapter implements SpeculativeLoadingParametersBoundaryInterface {
    private final SpeculativeLoadingParameters mSpeculativeLoadingParameters;

    public SpeculativeLoadingParametersAdapter(PrefetchParameters prefetchParameters) {
        this.mSpeculativeLoadingParameters = new SpeculativeLoadingParameters(prefetchParameters);
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public Map<String, String> getAdditionalHeaders() {
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        return speculativeLoadingParameters == null ? new HashMap() : speculativeLoadingParameters.getAdditionalHeaders();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public InvocationHandler getNoVarySearchData() {
        NoVarySearchHeader expectedNoVarySearchData;
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        if (speculativeLoadingParameters == null || (expectedNoVarySearchData = speculativeLoadingParameters.getExpectedNoVarySearchData()) == null) {
            return null;
        }
        return b.c(new NoVarySearchHeaderAdapter(expectedNoVarySearchData));
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public Integer getVariationsId() {
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        if (speculativeLoadingParameters == null) {
            return null;
        }
        return speculativeLoadingParameters.getVariationsId();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public boolean isJavaScriptEnabled() {
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        if (speculativeLoadingParameters == null) {
            return false;
        }
        return speculativeLoadingParameters.isJavaScriptEnabled();
    }

    public SpeculativeLoadingParametersAdapter(SpeculativeLoadingParameters speculativeLoadingParameters) {
        this.mSpeculativeLoadingParameters = speculativeLoadingParameters;
    }

    public SpeculativeLoadingParametersAdapter(PrerenderParameters prerenderParameters) {
        this.mSpeculativeLoadingParameters = new SpeculativeLoadingParameters(prerenderParameters);
    }
}
