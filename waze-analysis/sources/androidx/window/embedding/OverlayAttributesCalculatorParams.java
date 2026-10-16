package androidx.window.embedding;

import android.content.res.Configuration;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverlayAttributesCalculatorParams {
    private final OverlayAttributes defaultOverlayAttributes;
    private final String overlayTag;
    private final Configuration parentConfiguration;
    private final WindowLayoutInfo parentWindowLayoutInfo;
    private final WindowMetrics parentWindowMetrics;

    public OverlayAttributesCalculatorParams(WindowMetrics windowMetrics, Configuration configuration, WindowLayoutInfo windowLayoutInfo, String str, OverlayAttributes overlayAttributes) {
        x.f(windowMetrics, "parentWindowMetrics");
        x.f(configuration, "parentConfiguration");
        x.f(windowLayoutInfo, "parentWindowLayoutInfo");
        x.f(str, "overlayTag");
        x.f(overlayAttributes, "defaultOverlayAttributes");
        this.parentWindowMetrics = windowMetrics;
        this.parentConfiguration = configuration;
        this.parentWindowLayoutInfo = windowLayoutInfo;
        this.overlayTag = str;
        this.defaultOverlayAttributes = overlayAttributes;
    }

    public final OverlayAttributes getDefaultOverlayAttributes() {
        return this.defaultOverlayAttributes;
    }

    public final String getOverlayTag() {
        return this.overlayTag;
    }

    public final Configuration getParentConfiguration() {
        return this.parentConfiguration;
    }

    public final WindowLayoutInfo getParentWindowLayoutInfo() {
        return this.parentWindowLayoutInfo;
    }

    public final WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }

    public String toString() {
        return OverlayAttributesCalculatorParams.class + ":{parentWindowMetrics=" + this.parentWindowMetrics + "parentConfiguration=" + this.parentConfiguration + "parentWindowLayoutInfo=" + this.parentWindowLayoutInfo + "overlayTag=" + this.overlayTag + "defaultOverlayAttributes=" + this.defaultOverlayAttributes;
    }
}
