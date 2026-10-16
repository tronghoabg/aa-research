package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.container.VorbisUtil;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class OggWriter {
    private static final byte HEADER_TYPE_BOS = 2;
    private static final byte HEADER_TYPE_CONTINUATION = 1;
    private static final byte HEADER_TYPE_EOS = 4;
    private static final byte HEADER_TYPE_NEW_PAGE = 0;
    private static final int MAX_PAGE_SIZE_BYTES = 65025;
    private static final int MAX_SEGMENT_COUNT = 255;
    private static final int MAX_SEGMENT_SIZE_BYTES = 255;
    private static final int OGG_PAGE_HEADER_CRC_OFFSET = 22;
    private static final int OGG_PAGE_HEADER_SIZE_BYTES = 27;
    private static final byte[] oggCapturePattern = Util.getUtf8Bytes("OggS");
    private static final byte[] opusCommentHeaderSignature = Util.getUtf8Bytes("OpusTags");
    private static final byte[] vorbisCommentHeaderSignature = Util.getUtf8Bytes("\u0003vorbis");
    private boolean isContinuedPage;
    private final WritableByteChannel outputChannel;
    private int pageSequenceNumber;
    private int previousVorbisPacketBlockSize;
    private String sampleMimeType;
    private boolean seenFirstVorbisAudioPacket;
    private long streamGranulePosition;
    private final String vendorString;
    private VorbisUtil.VorbisIdHeader vorbisIdHeader;
    private VorbisUtil.Mode[] vorbisModes;
    private boolean wroteIdentificationAndCommentHeader;
    private final int streamSerialNumber = new Random().nextInt();
    private final ByteBuffer pageHeaderBuffer = ByteBuffer.allocate(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_MESSAGE).order(ByteOrder.LITTLE_ENDIAN);
    private final ByteBuffer pageDataBuffer = ByteBuffer.allocate(65025);
    private final List<Byte> segmentTable = new ArrayList();
    private long currentPageGranulePosition = -1;

    OggWriter(WritableByteChannel writableByteChannel, String str) {
        this.outputChannel = writableByteChannel;
        this.vendorString = str;
    }

    private void addPacketToPage(ByteBuffer byteBuffer, long j2, boolean z) throws IOException {
        int iMin;
        do {
            iMin = Math.min(byteBuffer.remaining(), 255);
            if (this.segmentTable.size() == 255 || this.pageDataBuffer.remaining() < iMin) {
                writeOggPage((byte) 0, this.currentPageGranulePosition);
                this.isContinuedPage = true;
                this.currentPageGranulePosition = -1L;
            }
            this.segmentTable.add(Byte.valueOf((byte) iMin));
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + iMin);
            this.pageDataBuffer.put(byteBuffer);
            byteBuffer.limit(iLimit);
        } while (iMin == 255);
        this.currentPageGranulePosition = j2;
        if (z) {
            writeOggPage((byte) 0, j2);
        }
    }

    private void writeIdentificationHeader(byte[] bArr) throws IOException {
        this.pageDataBuffer.put(bArr);
        this.segmentTable.add(Byte.valueOf((byte) bArr.length));
        writeOggPage((byte) 2, 0L);
    }

    private void writeOggPage(byte b2, long j2) throws IOException {
        if (this.isContinuedPage) {
            b2 = (byte) (b2 | 1);
        }
        this.pageHeaderBuffer.put(oggCapturePattern);
        this.pageHeaderBuffer.put((byte) 0);
        this.pageHeaderBuffer.put(b2);
        this.pageHeaderBuffer.putLong(j2);
        this.pageHeaderBuffer.putInt(this.streamSerialNumber);
        ByteBuffer byteBuffer = this.pageHeaderBuffer;
        int i2 = this.pageSequenceNumber;
        this.pageSequenceNumber = i2 + 1;
        byteBuffer.putInt(i2);
        this.pageHeaderBuffer.putInt(0);
        this.pageHeaderBuffer.put((byte) this.segmentTable.size());
        int i3 = 0;
        while (true) {
            int size = this.segmentTable.size();
            ByteBuffer byteBuffer2 = this.pageHeaderBuffer;
            if (i3 >= size) {
                byteBuffer2.flip();
                ByteBuffer byteBuffer3 = this.pageHeaderBuffer;
                int iCrc32 = Util.crc32(byteBuffer3.array(), byteBuffer3.position(), byteBuffer3.remaining(), 0);
                this.pageDataBuffer.flip();
                ByteBuffer byteBuffer4 = this.pageDataBuffer;
                int iCrc322 = Util.crc32(byteBuffer4.array(), byteBuffer4.position(), byteBuffer4.remaining(), iCrc32);
                this.pageHeaderBuffer.position(22);
                this.pageHeaderBuffer.putInt(iCrc322);
                this.pageHeaderBuffer.position(0);
                this.outputChannel.write(this.pageHeaderBuffer);
                this.outputChannel.write(this.pageDataBuffer);
                this.pageHeaderBuffer.clear();
                this.pageDataBuffer.clear();
                this.segmentTable.clear();
                this.isContinuedPage = false;
                return;
            }
            byteBuffer2.put(this.segmentTable.get(i3).byteValue());
            i3++;
        }
    }

    private void writeOpusCommentHeader() throws IOException {
        byte[] utf8Bytes = Util.getUtf8Bytes(this.vendorString);
        byte[] bArr = opusCommentHeaderSignature;
        int length = bArr.length + 4;
        int length2 = utf8Bytes.length;
        int i2 = length + length2 + 4;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.putInt(length2);
        byteBufferOrder.put(utf8Bytes);
        byteBufferOrder.putInt(0);
        byteBufferOrder.flip();
        this.pageDataBuffer.put(byteBufferOrder);
        this.segmentTable.add(Byte.valueOf((byte) i2));
        writeOggPage((byte) 0, 0L);
    }

    private void writeVorbisCommentHeader() throws IOException {
        byte[] utf8Bytes = Util.getUtf8Bytes(this.vendorString);
        byte[] bArr = vorbisCommentHeaderSignature;
        int length = bArr.length + 4;
        int length2 = utf8Bytes.length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + length2 + 5).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.putInt(length2);
        byteBufferOrder.put(utf8Bytes);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.flip();
        addPacketToPage(byteBufferOrder, 0L);
    }

    private void writeVorbisSetupHeader(byte[] bArr) throws IOException {
        addPacketToPage(ByteBuffer.wrap(bArr), 0L, true);
    }

    void close() {
        try {
            if (this.wroteIdentificationAndCommentHeader) {
                long j2 = this.currentPageGranulePosition;
                if (j2 == -1) {
                    j2 = 0;
                }
                writeOggPage((byte) 4, j2);
            }
        } finally {
            this.outputChannel.close();
        }
    }

    void setFormat(Format format) throws IOException {
        an.u(!this.wroteIdentificationAndCommentHeader);
        String str = format.sampleMimeType;
        an.B(str);
        this.sampleMimeType = str;
        int iHashCode = str.hashCode();
        if (iHashCode != -1003765268) {
            if (iHashCode == 1504891608 && str.equals(MimeTypes.AUDIO_OPUS)) {
                byte[] opusInitializationData = CodecSpecificDataUtil.getOpusInitializationData(format);
                this.streamGranulePosition = ((opusInitializationData[11] & 255) << 8) | (opusInitializationData[10] & 255);
                writeIdentificationHeader(opusInitializationData);
                writeOpusCommentHeader();
                this.wroteIdentificationAndCommentHeader = true;
                return;
            }
            throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
        }
        if (str.equals(MimeTypes.AUDIO_VORBIS)) {
            an.l(format.initializationData.size() > 1);
            this.vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(new ParsableByteArray(format.initializationData.get(0)));
            this.vorbisModes = VorbisUtil.readVorbisModes(new ParsableByteArray(format.initializationData.get(1)), this.vorbisIdHeader.channels);
            writeIdentificationHeader(format.initializationData.get(0));
            writeVorbisCommentHeader();
            writeVorbisSetupHeader(format.initializationData.get(1));
            this.wroteIdentificationAndCommentHeader = true;
            return;
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    void writeSampleData(ByteBuffer byteBuffer, BufferInfo bufferInfo) throws IOException {
        long packetAudioSampleCount;
        an.u(this.wroteIdentificationAndCommentHeader);
        String str = this.sampleMimeType;
        an.B(str);
        int iHashCode = str.hashCode();
        if (iHashCode != -1003765268) {
            if (iHashCode == 1504891608 && str.equals(MimeTypes.AUDIO_OPUS)) {
                packetAudioSampleCount = this.streamGranulePosition + OpusUtil.parsePacketAudioSampleCount(byteBuffer);
                this.streamGranulePosition = packetAudioSampleCount;
                addPacketToPage(byteBuffer, packetAudioSampleCount);
                return;
            }
            throw new IllegalStateException("Codec not supported.");
        }
        if (str.equals(MimeTypes.AUDIO_VORBIS)) {
            byte b2 = byteBuffer.get(byteBuffer.position());
            VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
            an.B(vorbisIdHeader);
            VorbisUtil.Mode[] modeArr = this.vorbisModes;
            an.B(modeArr);
            int packetBlockSize = VorbisUtil.getPacketBlockSize(b2, vorbisIdHeader, modeArr);
            long sampleCountInPacket = this.streamGranulePosition + VorbisUtil.getSampleCountInPacket(packetBlockSize, this.previousVorbisPacketBlockSize, this.seenFirstVorbisAudioPacket);
            this.streamGranulePosition = sampleCountInPacket;
            this.seenFirstVorbisAudioPacket = true;
            this.previousVorbisPacketBlockSize = packetBlockSize;
            packetAudioSampleCount = sampleCountInPacket;
            addPacketToPage(byteBuffer, packetAudioSampleCount);
            return;
        }
        throw new IllegalStateException("Codec not supported.");
    }

    private void addPacketToPage(ByteBuffer byteBuffer, long j2) throws IOException {
        addPacketToPage(byteBuffer, j2, false);
    }
}
