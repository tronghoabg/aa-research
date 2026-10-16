package androidx.media3.extractor.metadata.id3;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InternalFrame extends Id3Frame {
    public static final String ID = "----";
    public final String description;
    public final String domain;
    public final String text;

    public InternalFrame(String str, String str2, String str3) {
        super(ID);
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (Objects.equals(this.description, internalFrame.description) && Objects.equals(this.domain, internalFrame.domain) && Objects.equals(this.text, internalFrame.text)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.domain;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.description;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL;
        String str3 = this.text;
        return (((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.id + ": domain=" + this.domain + ", description=" + this.description;
    }
}
