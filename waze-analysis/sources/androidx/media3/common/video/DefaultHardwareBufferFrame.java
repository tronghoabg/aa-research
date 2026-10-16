package androidx.media3.common.video;

import android.hardware.HardwareBuffer;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.video.HardwareBufferFrame;
import com.google.d.d.bs;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultHardwareBufferFrame implements HardwareBufferFrame {
    private final long contentTimeUs;
    private final Format format;
    private final HardwareBuffer hardwareBuffer;
    private final Object internalImage;
    private final bs<String, Object> metadata;

    private DefaultHardwareBufferFrame(Builder builder) {
        this.hardwareBuffer = builder.hardwareBuffer;
        this.format = builder.format;
        this.metadata = builder.metadata;
        this.contentTimeUs = builder.contentTimeUs;
        this.internalImage = builder.internalImage;
    }

    @Override // androidx.media3.common.video.HardwareBufferFrame
    public HardwareBufferFrame.Builder buildUpon() {
        return new Builder();
    }

    @Override // androidx.media3.common.video.Frame
    public long getContentTimeUs() {
        return this.contentTimeUs;
    }

    @Override // androidx.media3.common.video.Frame
    public Format getFormat() {
        return this.format;
    }

    @Override // androidx.media3.common.video.HardwareBufferFrame
    public HardwareBuffer getHardwareBuffer() {
        return this.hardwareBuffer;
    }

    public Object getInternalImage() {
        return this.internalImage;
    }

    @Override // androidx.media3.common.video.Frame
    public bs<String, Object> getMetadata() {
        return this.metadata;
    }

    /* compiled from: WazeSource */
    public final class Builder implements HardwareBufferFrame.Builder {
        private long contentTimeUs;
        private Format format;
        private final HardwareBuffer hardwareBuffer;
        private Object internalImage;
        private bs<String, Object> metadata;

        private Builder(DefaultHardwareBufferFrame defaultHardwareBufferFrame) {
            this.hardwareBuffer = defaultHardwareBufferFrame.hardwareBuffer;
            this.format = defaultHardwareBufferFrame.format;
            this.metadata = defaultHardwareBufferFrame.metadata;
            this.contentTimeUs = defaultHardwareBufferFrame.contentTimeUs;
            this.internalImage = defaultHardwareBufferFrame.internalImage;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public DefaultHardwareBufferFrame build() {
            return new DefaultHardwareBufferFrame(this);
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public /* bridge */ /* synthetic */ HardwareBufferFrame.Builder setContentTimeUs(long j2) {
            setContentTimeUs(j2);
            return this;
        }

        public Builder setFormat(Format format) {
            this.format = format;
            return this;
        }

        public Builder setInternalImage(Object obj) {
            this.internalImage = obj;
            return this;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public Builder setMetadata(Map<String, Object> map) {
            this.metadata = bs.e(map);
            return this;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public Builder setContentTimeUs(long j2) {
            this.contentTimeUs = j2;
            return this;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public /* bridge */ /* synthetic */ HardwareBufferFrame.Builder setMetadata(Map map) {
            setMetadata((Map<String, Object>) map);
            return this;
        }

        public Builder(HardwareBuffer hardwareBuffer) {
            this.hardwareBuffer = hardwareBuffer;
            this.format = new Format.Builder().build();
            this.metadata = bs.f();
            this.contentTimeUs = C.TIME_UNSET;
        }
    }
}
