package org.chromium.support_lib_boundary;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface NoVarySearchDataBoundaryInterface {
    List<String> getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    List<String> getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
