package androidx.media3.common.audio;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    AudioFormat configure(AudioFormat audioFormat);

    @Deprecated
    void flush();

    void flush(StreamMetadata streamMetadata);

    long getDurationAfterProcessorApplied(long j2);

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.common.audio.AudioProcessor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$flush(AudioProcessor audioProcessor) {
            throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
        }

        public static long $default$getDurationAfterProcessorApplied(AudioProcessor audioProcessor, long j2) {
            return j2;
        }
    }

    /* compiled from: WazeSource */
    public final class StreamMetadata {
        public static final StreamMetadata DEFAULT = new Builder().build();
        public final Object periodUid;
        public final long positionOffsetUs;
        public final Timeline timeline;

        private StreamMetadata(Builder builder) {
            this.positionOffsetUs = builder.positionOffsetUs;
            this.timeline = builder.timeline;
            this.periodUid = builder.periodUid;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private Object periodUid;
            private long positionOffsetUs;
            private Timeline timeline;

            private Builder(StreamMetadata streamMetadata) {
                this.positionOffsetUs = streamMetadata.positionOffsetUs;
                this.timeline = streamMetadata.timeline;
                this.periodUid = streamMetadata.periodUid;
            }

            public StreamMetadata build() {
                Object obj;
                if (!this.timeline.isEmpty() && (obj = this.periodUid) != null) {
                    an.l(this.timeline.getIndexOfPeriod(obj) != -1);
                }
                return new StreamMetadata(this);
            }

            public Builder setPeriodUid(Object obj) {
                this.periodUid = obj;
                return this;
            }

            public Builder setPositionOffsetUs(long j2) {
                this.positionOffsetUs = j2;
                return this;
            }

            public Builder setTimeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            public Builder() {
                this.positionOffsetUs = 0L;
                this.timeline = Timeline.EMPTY;
                this.periodUid = null;
            }
        }

        @Deprecated
        public StreamMetadata(long j2) {
            Builder builder = new Builder();
            builder.setPositionOffsetUs(j2);
            this(builder);
        }
    }

    /* compiled from: WazeSource */
    public final class AudioFormat {
        public static final AudioFormat NOT_SET = new AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(int i2, int i3, int i4) {
            this.sampleRate = i2;
            this.channelCount = i3;
            this.encoding = i4;
            this.bytesPerFrame = Util.isEncodingLinearPcm(i4) ? Util.getPcmFrameSize(i4, i3) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount), Integer.valueOf(this.encoding));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", encoding=" + this.encoding + "]";
        }

        public AudioFormat(Format format) {
            this(format.sampleRate, format.channelCount, format.pcmEncoding);
        }
    }

    /* compiled from: WazeSource */
    public final class UnhandledAudioFormatException extends Exception {
        public final AudioFormat inputAudioFormat;

        public UnhandledAudioFormatException(String str, AudioFormat audioFormat) {
            super(str + " " + String.valueOf(audioFormat));
            this.inputAudioFormat = audioFormat;
        }

        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }
    }
}
