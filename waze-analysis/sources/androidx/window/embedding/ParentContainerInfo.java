package androidx.window.embedding;

import android.content.res.Configuration;
import androidx.window.core.Bounds;
import androidx.window.layout.WindowLayoutInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ParentContainerInfo {
    private final Configuration configuration;
    private final float density;
    private final Bounds windowBounds;
    private final WindowLayoutInfo windowLayoutInfo;

    public ParentContainerInfo(Bounds bounds, WindowLayoutInfo windowLayoutInfo, Configuration configuration, float f2) {
        x.f(bounds, "windowBounds");
        x.f(windowLayoutInfo, "windowLayoutInfo");
        x.f(configuration, "configuration");
        this.windowBounds = bounds;
        this.windowLayoutInfo = windowLayoutInfo;
        this.configuration = configuration;
        this.density = f2;
    }

    public static /* synthetic */ ParentContainerInfo copy$default(ParentContainerInfo parentContainerInfo, Bounds bounds, WindowLayoutInfo windowLayoutInfo, Configuration configuration, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bounds = parentContainerInfo.windowBounds;
        }
        if ((i2 & 2) != 0) {
            windowLayoutInfo = parentContainerInfo.windowLayoutInfo;
        }
        if ((i2 & 4) != 0) {
            configuration = parentContainerInfo.configuration;
        }
        if ((i2 & 8) != 0) {
            f2 = parentContainerInfo.density;
        }
        return parentContainerInfo.copy(bounds, windowLayoutInfo, configuration, f2);
    }

    public final Bounds component1() {
        return this.windowBounds;
    }

    public final WindowLayoutInfo component2() {
        return this.windowLayoutInfo;
    }

    public final Configuration component3() {
        return this.configuration;
    }

    public final float component4() {
        return this.density;
    }

    public final ParentContainerInfo copy(Bounds bounds, WindowLayoutInfo windowLayoutInfo, Configuration configuration, float f2) {
        x.f(bounds, "windowBounds");
        x.f(windowLayoutInfo, "windowLayoutInfo");
        x.f(configuration, "configuration");
        return new ParentContainerInfo(bounds, windowLayoutInfo, configuration, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentContainerInfo)) {
            return false;
        }
        ParentContainerInfo parentContainerInfo = (ParentContainerInfo) obj;
        return x.n(this.windowBounds, parentContainerInfo.windowBounds) && x.n(this.windowLayoutInfo, parentContainerInfo.windowLayoutInfo) && x.n(this.configuration, parentContainerInfo.configuration) && Float.compare(this.density, parentContainerInfo.density) == 0;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final float getDensity() {
        return this.density;
    }

    public final Bounds getWindowBounds() {
        return this.windowBounds;
    }

    public final WindowLayoutInfo getWindowLayoutInfo() {
        return this.windowLayoutInfo;
    }

    public int hashCode() {
        return (((((this.windowBounds.hashCode() * 31) + this.windowLayoutInfo.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Float.floatToIntBits(this.density);
    }

    public String toString() {
        return "ParentContainerInfo(windowBounds=" + this.windowBounds + ", windowLayoutInfo=" + this.windowLayoutInfo + ", configuration=" + this.configuration + ", density=" + this.density + ")";
    }
}
