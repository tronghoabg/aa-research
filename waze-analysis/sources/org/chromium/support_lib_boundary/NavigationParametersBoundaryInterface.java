package org.chromium.support_lib_boundary;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface NavigationParametersBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    Map<String, String> getAdditionalHeaders();

    boolean getShouldReplaceCurrentEntry();
}
