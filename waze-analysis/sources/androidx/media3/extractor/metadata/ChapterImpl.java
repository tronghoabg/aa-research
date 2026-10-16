package androidx.media3.extractor.metadata;

import a.a;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MediaMetadata;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ChapterImpl implements Chapter {
    private final long endTimeMs;
    private final boolean isHidden;
    private final long startTimeMs;
    private final Label title;

    public ChapterImpl(long j2, long j3, boolean z, Label label) {
        boolean z2 = true;
        if (j2 != C.TIME_UNSET && j3 != C.TIME_UNSET && j2 > j3) {
            z2 = false;
        }
        an.l(z2);
        this.startTimeMs = j2;
        this.endTimeMs = j3;
        this.isHidden = z;
        this.title = label;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChapterImpl chapterImpl = (ChapterImpl) obj;
            if (this.startTimeMs == chapterImpl.startTimeMs && this.endTimeMs == chapterImpl.endTimeMs && this.isHidden == chapterImpl.isHidden && Objects.equals(this.title, chapterImpl.title)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public long getEndTimeMs() {
        return this.endTimeMs;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public long getStartTimeMs() {
        return this.startTimeMs;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public Label getTitle() {
        return this.title;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        Label label = this.title;
        return ((((((a.b(this.startTimeMs) + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + a.b(this.endTimeMs)) * 31) + (this.isHidden ? 1 : 0)) * 31) + (label != null ? label.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public boolean isHidden() {
        return this.isHidden;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
    }

    public String toString() {
        String str;
        long j2 = this.startTimeMs;
        Object objValueOf = j2 == C.TIME_UNSET ? "UNSET" : Long.valueOf(j2);
        long j3 = this.endTimeMs;
        String string = objValueOf.toString();
        if (j3 == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", endTimeMs=" + this.endTimeMs;
        }
        boolean z = this.isHidden;
        Label label = this.title;
        String strConcat = label == null ? "" : ", title=".concat(label.toString());
        return "Chapter: startTimeMs=" + string + str + (true == z ? ", hidden" : "") + strConcat;
    }
}
