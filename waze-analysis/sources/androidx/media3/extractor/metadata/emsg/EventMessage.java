package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class EventMessage implements Metadata.Entry {
    private static final Format ID3_FORMAT;
    public static final String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    private static final Format SCTE35_FORMAT;
    public static final String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;
    public final long id;
    public final byte[] messageData;
    public final String schemeIdUri;
    public final String value;

    static {
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(MimeTypes.APPLICATION_ID3);
        ID3_FORMAT = builder.build();
        Format.Builder builder2 = new Format.Builder();
        builder2.setSampleMimeType(MimeTypes.APPLICATION_SCTE35);
        SCTE35_FORMAT = builder2.build();
    }

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j2;
        this.id = j3;
        this.messageData = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.durationMs == eventMessage.durationMs && this.id == eventMessage.id && Objects.equals(this.schemeIdUri, eventMessage.schemeIdUri) && Objects.equals(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public Format getWrappedMetadataFormat() {
        String str = this.schemeIdUri;
        int iHashCode = str.hashCode();
        if (iHashCode == -1468477611) {
            if (str.equals(SCTE35_SCHEME_ID)) {
                return SCTE35_FORMAT;
            }
            return null;
        }
        if (iHashCode != -795945609) {
            if (iHashCode != 1303648457 || !str.equals(ID3_SCHEME_ID_APPLE)) {
                return null;
            }
        } else if (!str.equals(ID3_SCHEME_ID_AOM)) {
            return null;
        }
        return ID3_FORMAT;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        String str = this.schemeIdUri;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.value;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i3 = iHashCode + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL;
        long j2 = this.durationMs;
        long j3 = this.id;
        int iHashCode3 = (((((((i3 * 31) + iHashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.messageData);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
    }

    public String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }
}
