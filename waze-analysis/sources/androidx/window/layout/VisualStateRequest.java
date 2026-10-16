package androidx.window.layout;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class VisualStateRequest {
    private final boolean sustainedVisualsEnabled;

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean isSustainedVisualsEnabled;

        public final VisualStateRequest build() {
            return new VisualStateRequest(this.isSustainedVisualsEnabled);
        }

        public final Builder setSustainedVisualsEnabled(boolean z) {
            this.isSustainedVisualsEnabled = z;
            return this;
        }
    }

    public VisualStateRequest(boolean z) {
        this.sustainedVisualsEnabled = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VisualStateRequest) && this.sustainedVisualsEnabled == ((VisualStateRequest) obj).sustainedVisualsEnabled;
    }

    public int hashCode() {
        return VisualStateRequest$$ExternalSyntheticBackport0.m(this.sustainedVisualsEnabled);
    }

    public final boolean isSustainedVisualsEnabled() {
        return this.sustainedVisualsEnabled;
    }

    public String toString() {
        return "VisualStateRequest{isSustainedVisualsEnabled=" + this.sustainedVisualsEnabled + "}";
    }
}
