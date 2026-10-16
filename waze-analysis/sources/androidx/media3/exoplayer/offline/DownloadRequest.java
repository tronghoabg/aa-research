package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.d.bn;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i2) {
            return new DownloadRequest[i2];
        }
    };
    public final ByteRange byteRange;
    public final String customCacheKey;
    public final byte[] data;
    public final String id;
    public final byte[] keySetId;
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final TimeRange timeRange;
    public final Uri uri;

    /* compiled from: WazeSource */
    public class Builder {
        private String customCacheKey;
        private byte[] data;
        private final String id;
        private byte[] keySetId;
        private String mimeType;
        private List<StreamKey> streamKeys;
        private final Uri uri;
        private ByteRange byteRange = null;
        private TimeRange timeRange = null;

        public Builder(String str, Uri uri) {
            this.id = str;
            this.uri = uri;
        }

        public DownloadRequest build() {
            String str = this.mimeType;
            List listP = this.streamKeys;
            if (listP == null) {
                listP = bn.p();
            }
            List list = listP;
            return new DownloadRequest(this.id, this.uri, str, list, this.keySetId, this.customCacheKey, this.data, this.byteRange, this.timeRange);
        }

        public Builder setByteRange(long j2, long j3) {
            this.byteRange = new ByteRange(j2, j3);
            return this;
        }

        public Builder setCustomCacheKey(String str) {
            this.customCacheKey = str;
            return this;
        }

        public Builder setData(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder setKeySetId(byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        public Builder setStreamKeys(List<StreamKey> list) {
            this.streamKeys = list;
            return this;
        }

        public Builder setTimeRange(long j2, long j3) {
            this.timeRange = new TimeRange(j2, j3);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public class UnsupportedRequestException extends IOException {
    }

    DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.SDK_INT;
        this.id = string;
        this.uri = Uri.parse(parcel.readString());
        this.mimeType = parcel.readString();
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.streamKeys = DesugarCollections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = parcel.createByteArray();
        this.byteRange = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
        this.timeRange = (TimeRange) parcel.readParcelable(TimeRange.class.getClassLoader());
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data, this.byteRange, this.timeRange);
    }

    public DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new DownloadRequest(this.id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data, this.byteRange, this.timeRange);
    }

    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        List arrayList;
        an.l(this.id.equals(downloadRequest.id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(this.streamKeys);
            for (int i2 = 0; i2 < downloadRequest.streamKeys.size(); i2++) {
                StreamKey streamKey = downloadRequest.streamKeys.get(i2);
                if (!arrayList.contains(streamKey)) {
                    arrayList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.id, downloadRequest.uri, downloadRequest.mimeType, arrayList, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data, downloadRequest.byteRange, downloadRequest.timeRange);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.id.equals(downloadRequest.id) && this.uri.equals(downloadRequest.uri) && Objects.equals(this.mimeType, downloadRequest.mimeType) && this.streamKeys.equals(downloadRequest.streamKeys) && Arrays.equals(this.keySetId, downloadRequest.keySetId) && Objects.equals(this.customCacheKey, downloadRequest.customCacheKey) && Arrays.equals(this.data, downloadRequest.data) && Objects.equals(this.byteRange, downloadRequest.byteRange) && Objects.equals(this.timeRange, downloadRequest.timeRange);
    }

    public int hashCode() {
        int iHashCode = (this.id.hashCode() * 961) + this.uri.hashCode();
        String str = this.mimeType;
        int iHashCode2 = (((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.streamKeys.hashCode()) * 31) + Arrays.hashCode(this.keySetId);
        String str2 = this.customCacheKey;
        int iHashCode3 = ((((iHashCode2 * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.data)) * 31;
        ByteRange byteRange = this.byteRange;
        int iHashCode4 = (iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0)) * 31;
        TimeRange timeRange = this.timeRange;
        return iHashCode4 + (timeRange != null ? timeRange.hashCode() : 0);
    }

    public MediaItem toMediaItem(MediaItem.Builder builder) {
        builder.setMediaId(this.id);
        builder.setUri(this.uri);
        builder.setCustomCacheKey(this.customCacheKey);
        builder.setMimeType(this.mimeType);
        builder.setStreamKeys(this.streamKeys);
        return builder.build();
    }

    public String toString() {
        return this.mimeType + ":" + this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i3 = 0; i3 < this.streamKeys.size(); i3++) {
            parcel.writeParcelable(this.streamKeys.get(i3), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
        parcel.writeParcelable(this.byteRange, 0);
        parcel.writeParcelable(this.timeRange, 0);
    }

    /* compiled from: WazeSource */
    public final class TimeRange implements Parcelable {
        public static final Parcelable.Creator<TimeRange> CREATOR = new Parcelable.Creator<TimeRange>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.TimeRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TimeRange createFromParcel(Parcel parcel) {
                return new TimeRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TimeRange[] newArray(int i2) {
                return new TimeRange[i2];
            }
        };
        public final long durationUs;
        public final long startPositionUs;

        TimeRange(long j2, long j3) {
            boolean z = true;
            if (j3 < 0) {
                if (j3 == C.TIME_UNSET) {
                    j3 = -9223372036854775807L;
                } else {
                    z = false;
                }
            }
            an.l(z);
            this.startPositionUs = j2;
            this.durationUs = j3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) obj;
            return this.startPositionUs == timeRange.startPositionUs && this.durationUs == timeRange.durationUs;
        }

        public int hashCode() {
            return (((int) this.startPositionUs) * 961) + ((int) this.durationUs);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.startPositionUs);
            parcel.writeLong(this.durationUs);
        }

        TimeRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    public MediaItem toMediaItem() {
        return toMediaItem(new MediaItem.Builder());
    }

    /* compiled from: WazeSource */
    public final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new Parcelable.Creator<ByteRange>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.ByteRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ByteRange[] newArray(int i2) {
                return new ByteRange[i2];
            }
        };
        public final long length;
        public final long offset;

        ByteRange(long j2, long j3) {
            an.l(j2 >= 0);
            an.l(j3 >= 0 || j3 == -1);
            this.offset = j2;
            this.length = j3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.offset == byteRange.offset && this.length == byteRange.length;
        }

        public int hashCode() {
            return (((int) this.offset) * 961) + ((int) this.length);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.offset);
            parcel.writeLong(this.length);
        }

        ByteRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    private DownloadRequest(String str, Uri uri, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2, ByteRange byteRange, TimeRange timeRange) {
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(uri, str2);
        if (iInferContentTypeForUriAndMimeType != 0 && iInferContentTypeForUriAndMimeType != 2 && iInferContentTypeForUriAndMimeType != 1) {
            this.byteRange = byteRange;
            this.timeRange = null;
        } else {
            an.o(str3 == null, "customCacheKey must be null for type: %s", iInferContentTypeForUriAndMimeType);
            this.byteRange = null;
            this.timeRange = timeRange;
        }
        this.id = str;
        this.uri = uri;
        this.mimeType = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = DesugarCollections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : Util.EMPTY_BYTE_ARRAY;
    }
}
