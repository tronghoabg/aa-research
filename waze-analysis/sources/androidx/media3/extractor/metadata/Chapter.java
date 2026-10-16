package androidx.media3.extractor.metadata;

import androidx.media3.common.C;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Chapter extends Metadata.Entry {

    /* compiled from: WazeSource */
    public class Builder {
        private boolean isHidden;
        private Label title;
        private long startTimeMs = C.TIME_UNSET;
        private long endTimeMs = C.TIME_UNSET;

        public Chapter build() {
            return new ChapterImpl(this.startTimeMs, this.endTimeMs, this.isHidden, this.title);
        }

        public Builder setEndTimeMs(long j2) {
            this.endTimeMs = j2;
            return this;
        }

        public Builder setHidden(boolean z) {
            this.isHidden = z;
            return this;
        }

        public Builder setStartTimeMs(long j2) {
            this.startTimeMs = j2;
            return this;
        }

        public Builder setTitle(Label label) {
            this.title = label;
            return this;
        }
    }

    long getEndTimeMs();

    long getStartTimeMs();

    Label getTitle();

    boolean isHidden();
}
