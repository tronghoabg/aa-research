package androidx.media3.extractor.mp3;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Mp3InfoReplayGain implements Metadata.Entry {
    public GainField field1;
    public GainField field2;
    public final float peak;

    /* compiled from: WazeSource */
    public final class GainField {
        public static final int NAME_AUDIOPHILE = 2;
        public static final int NAME_RADIO = 1;
        public static final int ORIGINATOR_ARTIST = 1;
        public static final int ORIGINATOR_REPLAYGAIN = 3;
        public static final int ORIGINATOR_SIMPLE_RMS = 4;
        public static final int ORIGINATOR_UNSET = 0;
        public static final int ORIGINATOR_USER = 2;
        public final float gain;
        public final int name;
        public final int originator;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Name {
        }

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Originator {
        }

        private GainField(int i2, int i3, float f2) {
            this.name = i2;
            this.originator = i3;
            this.gain = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static GainField parse(int i2) {
            int i3 = (i2 >> 13) & 7;
            if (i3 == 0) {
                return null;
            }
            return new GainField(i3, (i2 >> 10) & 7, ((i2 & 511) * ((i2 & 512) != 0 ? -1 : 1)) / 10.0f);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GainField)) {
                return false;
            }
            GainField gainField = (GainField) obj;
            return this.name == gainField.name && this.originator == gainField.originator && Float.compare(this.gain, gainField.gain) == 0;
        }

        public int hashCode() {
            return (((this.name * 31) + this.originator) * 31) + Float.floatToIntBits(this.gain);
        }

        public String toString() {
            return "GainField{name=" + this.name + ", originator=" + this.originator + ", gain=" + this.gain + "}";
        }
    }

    private Mp3InfoReplayGain(float f2, GainField gainField, GainField gainField2) {
        this.peak = f2;
        this.field1 = gainField;
        this.field2 = gainField2;
    }

    public static Mp3InfoReplayGain parse(float f2, int i2, int i3) {
        GainField gainField = GainField.parse(i2);
        GainField gainField2 = GainField.parse(i3);
        if (f2 <= 0.0f && gainField == null && gainField2 == null) {
            return null;
        }
        return new Mp3InfoReplayGain(f2, gainField, gainField2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Mp3InfoReplayGain)) {
            return false;
        }
        Mp3InfoReplayGain mp3InfoReplayGain = (Mp3InfoReplayGain) obj;
        return Float.compare(this.peak, mp3InfoReplayGain.peak) == 0 && Objects.equals(this.field1, mp3InfoReplayGain.field1) && Objects.equals(this.field2, mp3InfoReplayGain.field2);
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
        int iFloatToIntBits = Float.floatToIntBits(this.peak) * 31;
        GainField gainField = this.field1;
        int iHashCode = (iFloatToIntBits + (gainField != null ? gainField.hashCode() : 0)) * 31;
        GainField gainField2 = this.field2;
        return iHashCode + (gainField2 != null ? gainField2.hashCode() : 0);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
    }

    public String toString() {
        return "ReplayGain Xing/Info: peak=" + this.peak + ", field 1=" + String.valueOf(this.field1) + ", field 2=" + String.valueOf(this.field2);
    }
}
