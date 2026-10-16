package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import com.google.d.b.an;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final long MAX_READ_AHEAD_DURATION_US = 1000000;
    private static final int MSG_INVOKE_RENDERER = 1;
    private static final String TAG = "MetadataRenderer";
    private final MetadataInputBuffer buffer;
    private MetadataDecoder decoder;
    private final MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final MetadataOutput output;
    private final Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private Metadata pendingMetadata;
    private long subsampleOffsetUs;

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory, boolean z) {
        super(5);
        an.B(metadataOutput);
        this.output = metadataOutput;
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        an.B(metadataDecoderFactory);
        this.decoderFactory = metadataDecoderFactory;
        this.outputMetadataEarly = z;
        this.buffer = new MetadataInputBuffer();
        this.outputStreamOffsetUs = C.TIME_UNSET;
    }

    private void decodeWrappedMetadata(Metadata metadata, List<Metadata.Entry> list) {
        for (int i2 = 0; i2 < metadata.length(); i2++) {
            Format wrappedMetadataFormat = metadata.get(i2).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                list.add(metadata.get(i2));
            } else {
                MetadataDecoder metadataDecoderCreateDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] wrappedMetadataBytes = metadata.get(i2).getWrappedMetadataBytes();
                an.B(wrappedMetadataBytes);
                byte[] bArr = wrappedMetadataBytes;
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(bArr.length);
                ByteBuffer byteBuffer = this.buffer.data;
                int i3 = Util.SDK_INT;
                byteBuffer.put(bArr);
                this.buffer.flip();
                Metadata metadataDecode = metadataDecoderCreateDecoder.decode(this.buffer);
                if (metadataDecode != null) {
                    decodeWrappedMetadata(metadataDecode, list);
                }
            }
        }
    }

    private long getPresentationTimeUs(long j2) {
        an.u(j2 != C.TIME_UNSET);
        an.u(this.outputStreamOffsetUs != C.TIME_UNSET);
        return j2 - this.outputStreamOffsetUs;
    }

    private void invokeRenderer(Metadata metadata) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void invokeRendererInternal(Metadata metadata) {
        this.output.onMetadata(metadata);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean outputMetadata(long r6) {
        /*
            r5 = this;
            androidx.media3.common.Metadata r0 = r5.pendingMetadata
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r3 = r5.outputMetadataEarly
            if (r3 != 0) goto L14
            long r6 = r5.getPresentationTimeUs(r6)
            long r3 = r0.presentationTimeUs
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 > 0) goto L1d
        L14:
            androidx.media3.common.Metadata r6 = r5.pendingMetadata
            r5.invokeRenderer(r6)
            r6 = 0
            r5.pendingMetadata = r6
            r2 = r1
        L1d:
            boolean r6 = r5.inputStreamEnded
            if (r6 == 0) goto L27
            androidx.media3.common.Metadata r6 = r5.pendingMetadata
            if (r6 != 0) goto L27
            r5.outputStreamEnded = r1
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.metadata.MetadataRenderer.outputMetadata(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readMetadata(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.inputStreamEnded
            if (r0 != 0) goto Lc5
            androidx.media3.common.Metadata r0 = r8.pendingMetadata
            if (r0 != 0) goto Lc5
            androidx.media3.extractor.metadata.MetadataInputBuffer r0 = r8.buffer
            r0.clear()
            androidx.media3.exoplayer.FormatHolder r0 = r8.getFormatHolder()
            androidx.media3.extractor.metadata.MetadataInputBuffer r1 = r8.buffer
            r2 = 5
            int r1 = r8.readSource(r0, r1, r2)
            r2 = -3
            if (r1 != r2) goto L24
            androidx.media3.extractor.metadata.MetadataInputBuffer r1 = r8.buffer
            boolean r1 = r1.isEndOfStream()
            if (r1 == 0) goto Lc5
            r1 = r2
        L24:
            r3 = -1000000(0xfffffffffff0bdc0, double:NaN)
            r5 = -4
            if (r1 != r5) goto L41
            androidx.media3.extractor.metadata.MetadataInputBuffer r1 = r8.buffer
            boolean r1 = r1.isEndOfStream()
            if (r1 != 0) goto L40
            boolean r1 = r8.outputMetadataEarly
            if (r1 != 0) goto L5d
            androidx.media3.extractor.metadata.MetadataInputBuffer r1 = r8.buffer
            long r1 = r1.timeUs
            long r1 = r1 + r3
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto Lc5
            goto L5d
        L40:
            r1 = r5
        L41:
            if (r1 == r5) goto L45
            if (r1 != r2) goto L5d
        L45:
            long r1 = r8.getStreamEndPositionUs()
            long r6 = r8.getStreamOffsetUs()
            long r9 = r9 - r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 == 0) goto Lc5
            long r1 = r1 + r3
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 >= 0) goto L5d
            goto Lc5
        L5d:
            androidx.media3.extractor.metadata.MetadataInputBuffer r9 = r8.buffer
            r10 = 0
            int r9 = r8.readSource(r0, r9, r10)
            if (r9 != r5) goto Lb6
            androidx.media3.extractor.metadata.MetadataInputBuffer r9 = r8.buffer
            boolean r9 = r9.isEndOfStream()
            if (r9 == 0) goto L72
            r9 = 1
            r8.inputStreamEnded = r9
            return
        L72:
            androidx.media3.extractor.metadata.MetadataInputBuffer r9 = r8.buffer
            long r0 = r9.timeUs
            long r2 = r8.getLastResetPositionUs()
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto Lc5
            long r0 = r8.subsampleOffsetUs
            r9.subsampleOffsetUs = r0
            r9.flip()
            androidx.media3.extractor.metadata.MetadataDecoder r9 = r8.decoder
            int r10 = androidx.media3.common.util.Util.SDK_INT
            r10 = r9
            androidx.media3.extractor.metadata.MetadataDecoder r10 = (androidx.media3.extractor.metadata.MetadataDecoder) r10
            androidx.media3.extractor.metadata.MetadataInputBuffer r10 = r8.buffer
            androidx.media3.common.Metadata r9 = r9.decode(r10)
            if (r9 == 0) goto Lc5
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r9.length()
            r10.<init>(r0)
            r8.decodeWrappedMetadata(r9, r10)
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto Lc5
            androidx.media3.extractor.metadata.MetadataInputBuffer r9 = r8.buffer
            androidx.media3.common.Metadata r0 = new androidx.media3.common.Metadata
            long r1 = r9.timeUs
            long r1 = r8.getPresentationTimeUs(r1)
            r0.<init>(r1, r10)
            r8.pendingMetadata = r0
            return
        Lb6:
            r10 = -5
            if (r9 != r10) goto Lc5
            androidx.media3.common.Format r9 = r0.format
            com.google.d.b.an.B(r9)
            r10 = r9
            androidx.media3.common.Format r10 = (androidx.media3.common.Format) r10
            long r9 = r9.subsampleOffsetUs
            r8.subsampleOffsetUs = r9
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.metadata.MetadataRenderer.readMetadata(long):void");
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
        invokeRendererInternal((Metadata) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j2, boolean z, boolean z2) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(Format[] formatArr, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
        Metadata metadata = this.pendingMetadata;
        if (metadata != null) {
            this.pendingMetadata = metadata.copyWithPresentationTimeUs((metadata.presentationTimeUs + this.outputStreamOffsetUs) - j3);
        }
        this.outputStreamOffsetUs = j3;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j2, long j3) {
        do {
            readMetadata(j2);
        } while (outputMetadata(j2));
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return RendererCapabilities.CC.create(format.cryptoType == 0 ? 4 : 2);
        }
        return RendererCapabilities.CC.create(0);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        this(metadataOutput, looper, metadataDecoderFactory, false);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.DEFAULT);
    }
}
