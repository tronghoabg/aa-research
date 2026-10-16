package com.waze.speech;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class Alternative {
    private final float confidence;
    private final String transcript;

    public Alternative(String str, float f2) {
        h.g.b.x.f(str, "transcript");
        this.transcript = str;
        this.confidence = f2;
    }

    public static /* synthetic */ Alternative copy$default(Alternative alternative, String str, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = alternative.transcript;
        }
        if ((i2 & 2) != 0) {
            f2 = alternative.confidence;
        }
        return alternative.copy(str, f2);
    }

    public final String component1() {
        return this.transcript;
    }

    public final float component2() {
        return this.confidence;
    }

    public final Alternative copy(String str, float f2) {
        h.g.b.x.f(str, "transcript");
        return new Alternative(str, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alternative)) {
            return false;
        }
        Alternative alternative = (Alternative) obj;
        return h.g.b.x.n(this.transcript, alternative.transcript) && Float.compare(this.confidence, alternative.confidence) == 0;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final String getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        return (this.transcript.hashCode() * 31) + Float.floatToIntBits(this.confidence);
    }

    public String toString() {
        return "Alternative(transcript=" + this.transcript + ", confidence=" + this.confidence + ")";
    }
}
