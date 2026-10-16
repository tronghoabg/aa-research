package androidx.camera.video.internal.config;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FormatCombo {
    private final String audioMime;
    private final int container;
    private final String videoMime;

    public FormatCombo(int i2, String str, String str2) {
        this.container = i2;
        this.videoMime = str;
        this.audioMime = str2;
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("FormatCombo must have at least one valid track. Both videoMime and audioMime cannot be null.");
        }
    }

    public static /* synthetic */ FormatCombo copy$default(FormatCombo formatCombo, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = formatCombo.container;
        }
        if ((i3 & 2) != 0) {
            str = formatCombo.videoMime;
        }
        if ((i3 & 4) != 0) {
            str2 = formatCombo.audioMime;
        }
        return formatCombo.copy(i2, str, str2);
    }

    public final int component1() {
        return this.container;
    }

    public final String component2() {
        return this.videoMime;
    }

    public final String component3() {
        return this.audioMime;
    }

    public final FormatCombo copy(int i2, String str, String str2) {
        return new FormatCombo(i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatCombo)) {
            return false;
        }
        FormatCombo formatCombo = (FormatCombo) obj;
        return this.container == formatCombo.container && x.n(this.videoMime, formatCombo.videoMime) && x.n(this.audioMime, formatCombo.audioMime);
    }

    public final String getAudioMime() {
        return this.audioMime;
    }

    public final int getContainer() {
        return this.container;
    }

    public final String getVideoMime() {
        return this.videoMime;
    }

    public int hashCode() {
        String str = this.videoMime;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = this.container;
        String str2 = this.audioMime;
        return (((i2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FormatCombo(container=" + this.container + ", videoMime=" + this.videoMime + ", audioMime=" + this.audioMime + ")";
    }

    public static /* synthetic */ void getContainer$annotations() {
    }
}
