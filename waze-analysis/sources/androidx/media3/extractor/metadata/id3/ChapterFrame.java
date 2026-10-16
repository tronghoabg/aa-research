package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Label;
import androidx.media3.extractor.metadata.Chapter;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ChapterFrame extends Id3Frame implements Chapter {
    public static final String ID = "CHAP";
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final Id3Frame[] subFrames;
    private final Label title;

    public ChapterFrame(String str, int i2, int i3, long j2, long j3, Id3Frame[] id3FrameArr) {
        super(ID);
        an.l(i2 <= i3);
        this.chapterId = str;
        this.startTimeMs = i2;
        this.endTimeMs = i3;
        String strFindTitle = findTitle(id3FrameArr);
        this.title = strFindTitle != null ? new Label(null, strFindTitle) : null;
        this.startOffset = j2;
        this.endOffset = j3;
        this.subFrames = id3FrameArr;
    }

    private static String findTitle(Id3Frame[] id3FrameArr) {
        for (Id3Frame id3Frame : id3FrameArr) {
            if (id3Frame instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) id3Frame;
                if (textInformationFrame.id.equals("TIT2") && !textInformationFrame.values.isEmpty()) {
                    return textInformationFrame.values.get(0);
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && Objects.equals(this.chapterId, chapterFrame.chapterId) && Arrays.equals(this.subFrames, chapterFrame.subFrames)) {
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

    public Id3Frame getSubFrame(int i2) {
        return this.subFrames[i2];
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.chapterId;
        return ((((((((this.startTimeMs + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public boolean isHidden() {
        return false;
    }
}
