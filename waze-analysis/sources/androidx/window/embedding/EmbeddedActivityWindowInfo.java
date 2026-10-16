package androidx.window.embedding;

import android.graphics.Rect;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmbeddedActivityWindowInfo {
    private final Rect boundsInParentHost;
    private final boolean isEmbedded;
    private final Rect parentHostBounds;

    public EmbeddedActivityWindowInfo(boolean z, Rect rect, Rect rect2) {
        x.f(rect, "parentHostBounds");
        x.f(rect2, "boundsInParentHost");
        this.isEmbedded = z;
        this.parentHostBounds = rect;
        this.boundsInParentHost = rect2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedActivityWindowInfo)) {
            return false;
        }
        EmbeddedActivityWindowInfo embeddedActivityWindowInfo = (EmbeddedActivityWindowInfo) obj;
        return this.isEmbedded == embeddedActivityWindowInfo.isEmbedded && x.n(this.parentHostBounds, embeddedActivityWindowInfo.parentHostBounds) && x.n(this.boundsInParentHost, embeddedActivityWindowInfo.boundsInParentHost);
    }

    public final Rect getBoundsInParentHost() {
        return this.boundsInParentHost;
    }

    public final Rect getParentHostBounds() {
        return this.parentHostBounds;
    }

    public int hashCode() {
        return (((EmbeddedActivityWindowInfo$$ExternalSyntheticBackport0.m(this.isEmbedded) * 31) + this.parentHostBounds.hashCode()) * 31) + this.boundsInParentHost.hashCode();
    }

    public final boolean isEmbedded() {
        return this.isEmbedded;
    }

    public String toString() {
        return "EmbeddedActivityWindowInfo{isEmbedded=" + this.isEmbedded + ", parentHostBounds=" + this.parentHostBounds + ", boundsInParentHost=" + this.boundsInParentHost + "}";
    }
}
