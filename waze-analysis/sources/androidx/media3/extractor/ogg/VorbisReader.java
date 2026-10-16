package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.VorbisUtil;
import androidx.media3.extractor.ogg.StreamReader;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class VorbisReader extends StreamReader {
    private VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;
    private VorbisUtil.VorbisIdHeader vorbisIdHeader;
    private VorbisSetup vorbisSetup;

    /* compiled from: WazeSource */
    final class VorbisSetup {
        public final VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final VorbisUtil.VorbisIdHeader idHeader;
        public final VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i2) {
            this.idHeader = vorbisIdHeader;
            this.commentHeader = commentHeader;
            this.setupHeaderData = bArr;
            this.modes = modeArr;
            this.iLogModes = i2;
        }
    }

    VorbisReader() {
    }

    static void appendNumberOfSamples(ParsableByteArray parsableByteArray, long j2) {
        if (parsableByteArray.capacity() < parsableByteArray.limit() + 4) {
            parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit() + 4));
        } else {
            parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        }
        byte[] data = parsableByteArray.getData();
        data[parsableByteArray.limit() - 4] = (byte) (j2 & 255);
        data[parsableByteArray.limit() - 3] = (byte) ((j2 >>> 8) & 255);
        data[parsableByteArray.limit() - 2] = (byte) ((j2 >>> 16) & 255);
        data[parsableByteArray.limit() - 1] = (byte) ((j2 >>> 24) & 255);
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        try {
            return VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected void onSeekEnd(long j2) {
        super.onSeekEnd(j2);
        this.seenFirstAudioPacket = j2 != 0;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        this.previousPacketBlockSize = vorbisIdHeader != null ? vorbisIdHeader.blockSize0 : 0;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected long preparePayload(ParsableByteArray parsableByteArray) {
        if ((parsableByteArray.getData()[0] & 1) == 1) {
            return -1L;
        }
        VorbisSetup vorbisSetup = this.vorbisSetup;
        an.B(vorbisSetup);
        int packetBlockSize = VorbisUtil.getPacketBlockSize(parsableByteArray.getData()[0], vorbisSetup.idHeader, vorbisSetup.modes);
        long sampleCountInPacket = VorbisUtil.getSampleCountInPacket(packetBlockSize, this.previousPacketBlockSize, this.seenFirstAudioPacket);
        appendNumberOfSamples(parsableByteArray, sampleCountInPacket);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = packetBlockSize;
        return sampleCountInPacket;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected boolean readHeaders(ParsableByteArray parsableByteArray, long j2, StreamReader.SetupData setupData) throws ParserException {
        if (this.vorbisSetup != null) {
            an.B(setupData.format);
            return false;
        }
        VorbisSetup setupHeaders = readSetupHeaders(parsableByteArray);
        this.vorbisSetup = setupHeaders;
        if (setupHeaders == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        VorbisUtil.VorbisIdHeader vorbisIdHeader = setupHeaders.idHeader;
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(setupHeaders.setupHeaderData);
        Metadata vorbisComments = androidx.media3.extractor.VorbisUtil.parseVorbisComments(bn.o(setupHeaders.commentHeader.comments));
        Format.Builder builder = new Format.Builder();
        builder.setContainerMimeType(MimeTypes.AUDIO_OGG);
        builder.setSampleMimeType(MimeTypes.AUDIO_VORBIS);
        builder.setAverageBitrate(vorbisIdHeader.bitrateNominal);
        builder.setPeakBitrate(vorbisIdHeader.bitrateMaximum);
        builder.setChannelCount(vorbisIdHeader.channels);
        builder.setSampleRate(vorbisIdHeader.sampleRate);
        builder.setInitializationData(arrayList);
        builder.setMetadata(vorbisComments);
        setupData.format = builder.build();
        return true;
    }

    VorbisSetup readSetupHeaders(ParsableByteArray parsableByteArray) throws ParserException {
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader == null) {
            this.vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        VorbisUtil.CommentHeader commentHeader = this.commentHeader;
        if (commentHeader == null) {
            this.commentHeader = VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        System.arraycopy(parsableByteArray.getData(), 0, bArr, 0, parsableByteArray.limit());
        return new VorbisSetup(vorbisIdHeader, commentHeader, bArr, VorbisUtil.readVorbisModes(parsableByteArray, vorbisIdHeader.channels), VorbisUtil.iLog(r4.length - 1));
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }
}
