package androidx.media3.muxer;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class WebmElements {
    private static final int MAX_CHROMATICITY = 50000;
    private static final int TIMESTAMP_SCALE = 1000000;

    private WebmElements() {
    }

    private static ByteBuffer createAudioTrackEntryElement(int i2, Format format) {
        List<ByteBuffer> commonTrackEntry = getCommonTrackEntry(2, i2, 2, format);
        ArrayList arrayList = new ArrayList();
        arrayList.add(createUnsignedIntElement(159L, format.channelCount));
        arrayList.add(createFloatElement(181L, format.sampleRate));
        arrayList.add(createFloatElement(25188L, format.pcmEncoding));
        String str = format.sampleMimeType;
        an.B(str);
        ByteBuffer vorbisInitializationData = str.equals(MimeTypes.AUDIO_VORBIS) ? CodecSpecificDataUtil.getVorbisInitializationData(format) : ByteBuffer.wrap(format.initializationData.get(0));
        ByteBuffer byteBufferWrapIntoElement = wrapIntoElement(225L, arrayList);
        ByteBuffer byteBufferWrapIntoElement2 = wrapIntoElement(25506L, vorbisInitializationData);
        commonTrackEntry.add(byteBufferWrapIntoElement);
        commonTrackEntry.add(byteBufferWrapIntoElement2);
        return wrapIntoElement(174L, commonTrackEntry);
    }

    private static ByteBuffer createColorElement(ColorInfo colorInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(createUnsignedIntElement(21947L, ColorInfo.colorSpaceToIsoColorPrimaries(colorInfo.colorSpace)));
        arrayList.add(createUnsignedIntElement(21946L, ColorInfo.colorTransferToIsoTransferCharacteristics(colorInfo.colorTransfer)));
        arrayList.add(createUnsignedIntElement(21937L, ColorInfo.colorSpaceToIsoMatrixCoefficients(colorInfo.colorSpace)));
        arrayList.add(createUnsignedIntElement(21945L, colorInfo.colorRange));
        byte[] bArr = colorInfo.hdrStaticInfo;
        if (bArr != null && bArr.length == 25) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            if (byteBufferOrder.get() == 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(createFloatElement(21969L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21970L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21971L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21972L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21973L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21974L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21975L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21976L, byteBufferOrder.getShort() / 50000.0f));
                arrayList2.add(createFloatElement(21977L, byteBufferOrder.getShort()));
                arrayList2.add(createFloatElement(21978L, byteBufferOrder.getShort() * 1.0E-4f));
                short s = byteBufferOrder.getShort();
                short s2 = byteBufferOrder.getShort();
                arrayList2.add(createUnsignedIntElement(21948L, s));
                arrayList2.add(createUnsignedIntElement(21949L, s2));
                arrayList.add(wrapIntoElement(21968L, arrayList2));
            }
        }
        return wrapIntoElement(21936L, arrayList);
    }

    public static ByteBuffer createCuePointElement(long j2, int i2, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(createUnsignedIntElement(179L, j2));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(createUnsignedIntElement(247L, i2));
        arrayList2.add(createUnsignedIntElement(241L, j3));
        arrayList.add(wrapIntoElement(183L, arrayList2));
        return wrapIntoElement(187L, arrayList);
    }

    public static ByteBuffer createEbmlHeaderElement() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(createUnsignedIntElement(17030L, 1L));
        arrayList.add(createUnsignedIntElement(17143L, 1L));
        arrayList.add(createUnsignedIntElement(17138L, 4L));
        arrayList.add(createUnsignedIntElement(17139L, 8L));
        arrayList.add(createStringElement(17026L, "webm"));
        arrayList.add(createUnsignedIntElement(17031L, 2L));
        arrayList.add(createUnsignedIntElement(17029L, 2L));
        return wrapIntoElement(440786851L, arrayList);
    }

    public static ByteBuffer createFloatElement(long j2, float f2) {
        return wrapIntoElement(j2, ByteBuffer.wrap(Util.toByteArray(f2)));
    }

    public static ByteBuffer createInfoElement(float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(createFloatElement(17545L, f2));
        arrayList.add(createUnsignedIntElement(2807729L, 1000000L));
        arrayList.add(createStringElement(19840L, "android"));
        arrayList.add(createStringElement(22337L, "android"));
        return wrapIntoElement(357149030L, arrayList);
    }

    public static ByteBuffer createSeekHeadElement(long j2, long j3, long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(createUnsignedIntElement(21419L, 357149030L));
        arrayList2.add(createUnsignedIntElement(21420L, j2));
        arrayList.add(wrapIntoElement(19899L, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(createUnsignedIntElement(21419L, 374648427L));
        arrayList3.add(createUnsignedIntElement(21420L, j3));
        arrayList.add(wrapIntoElement(19899L, arrayList3));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(createUnsignedIntElement(21419L, 475249515L));
        arrayList4.add(createUnsignedIntElement(21420L, j4));
        arrayList.add(wrapIntoElement(19899L, arrayList4));
        return wrapIntoElement(290298740L, arrayList);
    }

    public static ByteBuffer createSimpleBlockElement(int i2, long j2, boolean z, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferEncodeVInt = EbmlUtils.encodeVInt(i2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferEncodeVInt.remaining() + 3 + byteBuffer.remaining());
        byteBufferAllocate.put(byteBufferEncodeVInt);
        byteBufferAllocate.put((byte) ((j2 >> 8) & 255));
        byteBufferAllocate.put((byte) (j2 & 255));
        byteBufferAllocate.put((byte) (true != z ? 0 : 128));
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return wrapIntoElement(163L, byteBufferAllocate);
    }

    public static ByteBuffer createStringElement(long j2, String str) {
        return wrapIntoElement(j2, ByteBuffer.wrap(Util.getUtf8Bytes(str)));
    }

    public static ByteBuffer createTrackElements(List<Track> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Track track = list.get(i2);
            int trackType = MimeTypes.getTrackType(track.format.sampleMimeType);
            if (trackType == 1) {
                arrayList.add(createAudioTrackEntryElement(track.id, track.format));
            } else {
                if (trackType != 2) {
                    throw new IllegalArgumentException(String.format("Track MimeType %s is not supported in WebM.", track.format.sampleMimeType));
                }
                arrayList.add(createVideoTrackEntryElement(track.id, track.format));
            }
        }
        return wrapIntoElement(374648427L, arrayList);
    }

    public static ByteBuffer createUnsignedIntElement(long j2, long j3) {
        return wrapIntoElement(j2, uintToMinimumLengthByteBuffer(j3));
    }

    private static ByteBuffer createVideoElement(Format format) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(createUnsignedIntElement(176L, format.width));
        arrayList.add(createUnsignedIntElement(186L, format.height));
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null) {
            arrayList.add(createColorElement(colorInfo));
        }
        return wrapIntoElement(224L, arrayList);
    }

    private static ByteBuffer createVideoTrackEntryElement(int i2, Format format) {
        List<ByteBuffer> commonTrackEntry = getCommonTrackEntry(1, i2, 1, format);
        an.B(format.sampleMimeType);
        if (!format.initializationData.isEmpty()) {
            commonTrackEntry.add(wrapIntoElement(25506L, ByteBuffer.wrap(format.initializationData.get(0))));
        }
        commonTrackEntry.add(createVideoElement(format));
        return wrapIntoElement(174L, commonTrackEntry);
    }

    public static ByteBuffer createVoidElement(int i2) {
        ByteBuffer byteBufferUintToMinimumLengthByteBuffer = uintToMinimumLengthByteBuffer(236L);
        int iRemaining = byteBufferUintToMinimumLengthByteBuffer.remaining();
        an.l(i2 >= 2);
        int i3 = i2 - iRemaining;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
        byteBufferAllocate.put(byteBufferUintToMinimumLengthByteBuffer);
        int i4 = i2 >= 9 ? 8 : 1;
        int i5 = i3 - i4;
        byteBufferAllocate.put(EbmlUtils.encodeVIntWithWidth(i5, i4));
        byteBufferAllocate.position(byteBufferAllocate.position() + i5);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private static String getCodecId(String str) {
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals(MimeTypes.AUDIO_VORBIS)) {
                    return "A_VORBIS";
                }
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    return "A_OPUS";
                }
                break;
            case 1599127256:
                if (str.equals(MimeTypes.VIDEO_VP8)) {
                    return "V_VP8";
                }
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    return "V_VP9";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported mime type: ".concat(String.valueOf(str)));
    }

    private static List<ByteBuffer> getCommonTrackEntry(int i2, int i3, int i4, Format format) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(createUnsignedIntElement(215L, i2));
        arrayList.add(createUnsignedIntElement(29637L, i3));
        arrayList.add(createUnsignedIntElement(156L, 0L));
        String str = format.language;
        an.B(str);
        arrayList.add(createStringElement(2274716L, str));
        String str2 = format.sampleMimeType;
        an.B(str2);
        arrayList.add(createStringElement(134L, getCodecId(str2)));
        arrayList.add(createUnsignedIntElement(131L, i4));
        return arrayList;
    }

    public static ByteBuffer uintToMinimumLengthByteBuffer(long j2) {
        int iNumberOfLeadingZeros = j2 == 0 ? 1 : (71 - Long.numberOfLeadingZeros(j2)) / 8;
        byte[] bArr = new byte[iNumberOfLeadingZeros];
        while (true) {
            iNumberOfLeadingZeros--;
            if (iNumberOfLeadingZeros < 0) {
                return ByteBuffer.wrap(bArr);
            }
            bArr[iNumberOfLeadingZeros] = (byte) (255 & j2);
            j2 >>>= 8;
        }
    }

    public static ByteBuffer wrapIntoElement(long j2, List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iRemaining = 0;
        while (it.hasNext()) {
            iRemaining += it.next().remaining();
        }
        ByteBuffer byteBufferUintToMinimumLengthByteBuffer = uintToMinimumLengthByteBuffer(j2);
        ByteBuffer byteBufferEncodeVInt = EbmlUtils.encodeVInt(iRemaining);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferUintToMinimumLengthByteBuffer.remaining() + byteBufferEncodeVInt.remaining() + iRemaining);
        byteBufferAllocate.put(byteBufferUintToMinimumLengthByteBuffer);
        byteBufferAllocate.put(byteBufferEncodeVInt);
        Iterator<ByteBuffer> it2 = list.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put(it2.next());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer wrapIntoElement(long j2, ByteBuffer byteBuffer) {
        return wrapIntoElement(j2, (List<ByteBuffer>) Collections.singletonList(byteBuffer));
    }
}
