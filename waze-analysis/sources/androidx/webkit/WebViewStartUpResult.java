package androidx.webkit;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WebViewStartUpResult {
    Long getMaxTimePerTaskInUiThreadMillis();

    List<StartUpLocation> getNonUiThreadBlockingStartUpLocations();

    Long getTotalTimeInUiThreadMillis();

    List<StartUpLocation> getUiThreadBlockingStartUpLocations();
}
