package androidx.media3.container;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import com.google.d.b.an;
import com.google.d.b.w;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final byte AUXILIARY_TRACKS_SAMPLES_INTERLEAVED = 1;
    public static final byte AUXILIARY_TRACKS_SAMPLES_NOT_INTERLEAVED = 0;
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final String KEY_AUXILIARY_TRACKS_INTERLEAVED = "auxiliary.tracks.interleaved";
    public static final String KEY_AUXILIARY_TRACKS_LENGTH = "auxiliary.tracks.length";
    public static final String KEY_AUXILIARY_TRACKS_MAP = "auxiliary.tracks.map";
    public static final String KEY_AUXILIARY_TRACKS_OFFSET = "auxiliary.tracks.offset";
    public static final int TYPE_INDICATOR_8_BIT_UNSIGNED_INT = 75;
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_RESERVED = 0;
    public static final int TYPE_INDICATOR_STRING = 1;
    public static final int TYPE_INDICATOR_UNSIGNED_INT64 = 78;
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(String str, byte[] bArr, int i2, int i3) {
        validateData(str, bArr, i3);
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i2;
        this.typeIndicator = i3;
    }

    private static String getFormattedValueForAuxiliaryTracksMap(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("track types = ");
        w.f().h(sb, list);
        return sb.toString();
    }

    private static void validateData(String str, byte[] bArr, int i2) {
        byte b2;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals(KEY_ANDROID_CAPTURE_FPS)) {
                    an.l(i2 == 23 && bArr.length == 4);
                    return;
                }
                return;
            case -269399509:
                if (str.equals(KEY_AUXILIARY_TRACKS_INTERLEAVED)) {
                    if (i2 != 75 || bArr.length != 1 || ((b2 = bArr[0]) != 0 && b2 != 1)) {
                        z = false;
                    }
                    an.l(z);
                    return;
                }
                return;
            case 1011693540:
                if (!str.equals(KEY_AUXILIARY_TRACKS_LENGTH)) {
                    return;
                }
                break;
            case 1098277265:
                if (!str.equals(KEY_AUXILIARY_TRACKS_OFFSET)) {
                    return;
                }
                break;
            case 2002123038:
                if (str.equals(KEY_AUXILIARY_TRACKS_MAP)) {
                    an.l(i2 == 0);
                    return;
                }
                return;
            default:
                return;
        }
        an.l(i2 == 78 && bArr.length == 8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getAuxiliaryTrackTypesFromMap() {
        an.v(this.key.equals(KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte b2 = this.value[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < b2; i2++) {
            arrayList.add(Integer.valueOf(this.value[i2 + 2] & 255));
        }
        return arrayList;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return ((((((this.key.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + Arrays.hashCode(this.value)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.typeIndicator
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            byte[] r0 = r3.value
            androidx.media3.common.util.ParsableByteArray r1 = new androidx.media3.common.util.ParsableByteArray
            r1.<init>(r0)
            long r0 = r1.readUnsignedLongToLong()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r3.value
            r1 = 0
            r0 = r0[r1]
            int r0 = androidx.media3.container.MdtaMetadataEntry$$ExternalSyntheticBackport0.m(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r3.value
            int r0 = com.google.d.l.j.i(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r3.value
            int r0 = com.google.d.l.j.i(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r3.value
            java.lang.String r0 = androidx.media3.common.util.Util.fromUtf8Bytes(r0)
            goto L70
        L57:
            java.lang.String r0 = r3.key
            java.lang.String r1 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r3.getAuxiliaryTrackTypesFromMap()
            java.lang.String r0 = getFormattedValueForAuxiliaryTracksMap(r0)
            goto L70
        L6a:
            byte[] r0 = r3.value
            java.lang.String r0 = androidx.media3.common.util.Util.toHexString(r0)
        L70:
            java.lang.String r3 = r3.key
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mdta: key="
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ", value="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.MdtaMetadataEntry.toString():java.lang.String");
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i2) {
        this(str, bArr, 0, i2);
    }
}
