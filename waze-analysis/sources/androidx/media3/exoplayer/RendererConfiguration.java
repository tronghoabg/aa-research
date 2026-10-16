package androidx.media3.exoplayer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RendererConfiguration {
    public static final RendererConfiguration DEFAULT = new RendererConfiguration(0, false);
    public final int offloadModePreferred;
    public final boolean tunneling;

    public RendererConfiguration(boolean z) {
        this.offloadModePreferred = 0;
        this.tunneling = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
            if (this.offloadModePreferred == rendererConfiguration.offloadModePreferred && this.tunneling == rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.offloadModePreferred;
        return i2 + i2 + (this.tunneling ? 1 : 0);
    }

    public RendererConfiguration(int i2, boolean z) {
        this.offloadModePreferred = i2;
        this.tunneling = z;
    }
}
