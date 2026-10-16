package androidx.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.text.CueDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.google.d.b.an;
import com.google.d.d.bn;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final long MAX_READ_AHEAD_DURATION_US = 1000000;
    private static final int MSG_UPDATE_OUTPUT = 1;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private final CueDecoder cueDecoder;
    private final DecoderInputBuffer cueDecoderInputBuffer;
    private CuesResolver cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private boolean legacyDecodingEnabled;
    private SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private SubtitleInputBuffer nextSubtitleInputBuffer;
    private final TextOutput output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private Format streamFormat;
    private SubtitleOutputBuffer subtitle;
    private SubtitleDecoder subtitleDecoder;
    private final SubtitleDecoderFactory subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface ReplacementState {
    }

    public TextRenderer(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        an.B(textOutput);
        this.output = textOutput;
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.subtitleDecoderFactory = subtitleDecoderFactory;
        this.cueDecoder = new CueDecoder();
        this.cueDecoderInputBuffer = new DecoderInputBuffer(1);
        this.formatHolder = new FormatHolder();
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        this.lastRendererPositionUs = C.TIME_UNSET;
        this.legacyDecodingEnabled = false;
    }

    private void assertLegacyDecodingEnabledIfRequired() {
        boolean z = true;
        if (!this.legacyDecodingEnabled && !Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_CEA608) && !Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_MP4CEA608) && !Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_CEA708)) {
            z = false;
        }
        an.z(z, "Legacy decoding is disabled, can't handle %s samples (expected %s).", this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_MEDIA3_CUES);
    }

    private void clearOutput() {
        updateOutput(new CueGroup(bn.p(), getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    private long getCurrentEventTimeUs(long j2) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j2);
        if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
            return this.subtitle.timeUs;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        return nextEventTimeIndex == -1 ? subtitleOutputBuffer.getEventTime(subtitleOutputBuffer.getEventTimeCount() - 1) : subtitleOutputBuffer.getEventTime(nextEventTimeIndex - 1);
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        an.B(this.subtitle);
        if (this.nextSubtitleEventIndex < this.subtitle.getEventTimeCount()) {
            return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
        }
        return Long.MAX_VALUE;
    }

    private long getPresentationTimeUs(long j2) {
        an.u(j2 != C.TIME_UNSET);
        return j2 - getStreamOffsetUs();
    }

    private void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        Log.e(TAG, "Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.streamFormat))), subtitleDecoderException);
        clearOutput();
        replaceSubtitleDecoder();
    }

    private static boolean hasEventsAfter(Subtitle subtitle, long j2) {
        return subtitle != null && subtitle.getEventTimeCount() > 0 && subtitle.getEventTime(subtitle.getEventTimeCount() + (-1)) > j2;
    }

    private void initSubtitleDecoder() {
        this.waitingForKeyFrame = true;
        Format format = this.streamFormat;
        an.B(format);
        SubtitleDecoder subtitleDecoderCreateDecoder = this.subtitleDecoderFactory.createDecoder(format);
        this.subtitleDecoder = subtitleDecoderCreateDecoder;
        subtitleDecoderCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    private void invokeUpdateOutputInternal(CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    private static boolean isCuesWithTiming(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_MEDIA3_CUES);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[PHI: r0
  0x0035: PHI (r0v4 int) = (r0v3 int), (r0v17 int) binds: [B:11:0x0020, B:17:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean readAndDecodeCuesWithTiming(long r13) {
        /*
            r12 = this;
            boolean r0 = r12.inputStreamEnded
            r1 = 0
            if (r0 == 0) goto L7
            goto L9a
        L7:
            androidx.media3.exoplayer.FormatHolder r0 = r12.formatHolder
            androidx.media3.decoder.DecoderInputBuffer r2 = r12.cueDecoderInputBuffer
            r3 = 5
            int r0 = r12.readSource(r0, r2, r3)
            r2 = -3
            if (r0 != r2) goto L1c
            androidx.media3.decoder.DecoderInputBuffer r0 = r12.cueDecoderInputBuffer
            boolean r0 = r0.isEndOfStream()
            if (r0 == 0) goto L9a
            r0 = r2
        L1c:
            r3 = -1000000(0xfffffffffff0bdc0, double:NaN)
            r5 = -4
            if (r0 != r5) goto L35
            androidx.media3.decoder.DecoderInputBuffer r0 = r12.cueDecoderInputBuffer
            boolean r0 = r0.isEndOfStream()
            if (r0 != 0) goto L34
            androidx.media3.decoder.DecoderInputBuffer r0 = r12.cueDecoderInputBuffer
            long r6 = r0.timeUs
            long r6 = r6 + r3
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L9a
            goto L52
        L34:
            r0 = r5
        L35:
            if (r0 == r5) goto L39
            if (r0 != r2) goto L52
        L39:
            long r6 = r12.getStreamEndPositionUs()
            long r8 = r12.getStreamOffsetUs()
            long r8 = r13 - r8
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L9a
            long r6 = r6 + r3
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L52
            goto L9a
        L52:
            androidx.media3.exoplayer.FormatHolder r0 = r12.formatHolder
            androidx.media3.decoder.DecoderInputBuffer r2 = r12.cueDecoderInputBuffer
            int r0 = r12.readSource(r0, r2, r1)
            if (r0 == r5) goto L5d
            goto L9a
        L5d:
            androidx.media3.decoder.DecoderInputBuffer r0 = r12.cueDecoderInputBuffer
            boolean r0 = r0.isEndOfStream()
            if (r0 == 0) goto L69
            r13 = 1
            r12.inputStreamEnded = r13
            return r1
        L69:
            androidx.media3.decoder.DecoderInputBuffer r0 = r12.cueDecoderInputBuffer
            r0.flip()
            androidx.media3.decoder.DecoderInputBuffer r0 = r12.cueDecoderInputBuffer
            java.nio.ByteBuffer r0 = r0.data
            com.google.d.b.an.B(r0)
            androidx.media3.extractor.text.CueDecoder r1 = r12.cueDecoder
            androidx.media3.decoder.DecoderInputBuffer r2 = r12.cueDecoderInputBuffer
            r3 = r0
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            long r2 = r2.timeUs
            byte[] r4 = r0.array()
            int r5 = r0.arrayOffset()
            int r6 = r0.limit()
            androidx.media3.extractor.text.CuesWithTiming r0 = r1.decode(r2, r4, r5, r6)
            androidx.media3.decoder.DecoderInputBuffer r1 = r12.cueDecoderInputBuffer
            r1.clear()
            androidx.media3.exoplayer.text.CuesResolver r12 = r12.cuesResolver
            boolean r12 = r12.addCues(r0, r13)
            return r12
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.TextRenderer.readAndDecodeCuesWithTiming(long):boolean");
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
        an.B(subtitleDecoder);
        subtitleDecoder.release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    private void renderFromCuesWithTiming(long j2) {
        boolean andDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j2);
        long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.inputStreamEnded && !andDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if ((nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j2) || andDecodeCuesWithTiming) {
            bn<Cue> cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j2);
            long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j2);
            updateOutput(new CueGroup(cuesAtTimeUs, getPresentationTimeUs(previousCueChangeTimeUs)));
            this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.lastRendererPositionUs = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c A[Catch: SubtitleDecoderException -> 0x0164, TryCatch #0 {SubtitleDecoderException -> 0x0164, blocks: (B:41:0x00b0, B:43:0x00b4, B:45:0x00b8, B:47:0x00c8, B:48:0x00ca, B:50:0x00ce, B:52:0x00e2, B:54:0x00ec, B:59:0x00f9, B:61:0x00ff, B:72:0x0125, B:74:0x012d, B:76:0x0133, B:81:0x0152, B:77:0x0139, B:79:0x013f, B:67:0x010c, B:69:0x011f), top: B:88:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f A[Catch: SubtitleDecoderException -> 0x0164, TryCatch #0 {SubtitleDecoderException -> 0x0164, blocks: (B:41:0x00b0, B:43:0x00b4, B:45:0x00b8, B:47:0x00c8, B:48:0x00ca, B:50:0x00ce, B:52:0x00e2, B:54:0x00ec, B:59:0x00f9, B:61:0x00ff, B:72:0x0125, B:74:0x012d, B:76:0x0133, B:81:0x0152, B:77:0x0139, B:79:0x013f, B:67:0x010c, B:69:0x011f), top: B:88:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void renderFromSubtitles(long r20) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.TextRenderer.renderFromSubtitles(long):void");
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    private void updateOutput(CueGroup cueGroup) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z) {
        this.legacyDecodingEnabled = z;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        invokeUpdateOutputInternal((CueGroup) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        Format format = this.streamFormat;
        if (format == null) {
            return true;
        }
        if (!isCuesWithTiming(format)) {
            if (this.outputStreamEnded) {
                return false;
            }
            return !this.inputStreamEnded || hasEventsAfter(this.subtitle, this.lastRendererPositionUs) || hasEventsAfter(this.nextSubtitle, this.lastRendererPositionUs) || this.nextSubtitleInputBuffer == null;
        }
        CuesResolver cuesResolver = this.cuesResolver;
        an.B(cuesResolver);
        if (cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs) != Long.MIN_VALUE) {
            return true;
        }
        try {
            maybeThrowStreamError();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        clearOutput();
        this.lastRendererPositionUs = C.TIME_UNSET;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j2, boolean z, boolean z2) {
        this.lastRendererPositionUs = j2;
        CuesResolver cuesResolver = this.cuesResolver;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        Format format = this.streamFormat;
        if (format == null || isCuesWithTiming(format)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
        an.B(subtitleDecoder);
        subtitleDecoder.flush();
        subtitleDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(Format[] formatArr, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        Format format = formatArr[0];
        this.streamFormat = format;
        if (isCuesWithTiming(format)) {
            this.cuesResolver = this.streamFormat.cueReplacementBehavior == 1 ? new MergingCuesResolver() : new ReplacingCuesResolver();
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.subtitleDecoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j2, long j3) {
        if (isCurrentStreamFinal()) {
            long j4 = this.finalStreamEndPositionUs;
            if (j4 != C.TIME_UNSET && j2 >= j4) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        Format format = this.streamFormat;
        an.B(format);
        if (isCuesWithTiming(format)) {
            an.B(this.cuesResolver);
            renderFromCuesWithTiming(j2);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j2);
        }
    }

    public void setFinalStreamEndPositionUs(long j2) {
        an.u(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j2;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        if (isCuesWithTiming(format) || this.subtitleDecoderFactory.supportsFormat(format)) {
            return RendererCapabilities.CC.create(format.cryptoType == 0 ? 4 : 2);
        }
        return RendererCapabilities.CC.create(MimeTypes.isText(format.sampleMimeType) ? 1 : 0);
    }

    public TextRenderer(TextOutput textOutput, Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.DEFAULT);
    }
}
