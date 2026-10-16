package androidx.media3.datasource;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.common.MediaLibraryInfo;
import com.google.d.b.an;
import j$.util.DesugarCollections;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @Deprecated
    public final long absoluteStreamPosition;
    public final Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    private DataSpec(Uri uri, long j2, int i2, byte[] bArr, Map<String, String> map, long j3, long j4, String str, int i3, Object obj) {
        long j5;
        byte[] bArr2;
        long j6 = j2 + j3;
        boolean z = false;
        an.l(j6 >= 0);
        an.l(j3 >= 0);
        if (j4 <= 0) {
            j5 = -1;
            if (j4 != -1) {
                j5 = j4;
            }
            an.l(z);
            an.B(uri);
            this.uri = uri;
            this.uriPositionOffset = j2;
            this.httpMethod = i2;
            bArr2 = null;
            if (bArr != null && bArr.length != 0) {
                bArr2 = bArr;
            }
            this.httpBody = bArr2;
            this.httpRequestHeaders = DesugarCollections.unmodifiableMap(new HashMap(map));
            this.position = j3;
            this.absoluteStreamPosition = j6;
            this.length = j5;
            this.key = str;
            this.flags = i3;
            this.customData = obj;
        }
        j5 = j4;
        z = true;
        an.l(z);
        an.B(uri);
        this.uri = uri;
        this.uriPositionOffset = j2;
        this.httpMethod = i2;
        bArr2 = null;
        if (bArr != null) {
            bArr2 = bArr;
        }
        this.httpBody = bArr2;
        this.httpRequestHeaders = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.position = j3;
        this.absoluteStreamPosition = j6;
        this.length = j5;
        this.key = str;
        this.flags = i3;
        this.customData = obj;
    }

    public static String getStringForHttpMethod(int i2) {
        if (i2 == 1) {
            return ShareTarget.METHOD_GET;
        }
        if (i2 == 2) {
            return ShareTarget.METHOD_POST;
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i2) {
        return (this.flags & i2) == i2;
    }

    public DataSpec subrange(long j2, long j3) {
        long j4 = 0;
        if (j2 != 0) {
            j4 = j2;
        } else if (this.length == j3) {
            return this;
        }
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j4, j3, this.key, this.flags, this.customData);
    }

    public String toString() {
        Uri uri = this.uri;
        return "DataSpec[" + getHttpMethodString() + " " + String.valueOf(uri) + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + "]";
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.httpRequestHeaders);
        map2.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map2, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;
        private String key;
        private long length;
        private long position;
        private Uri uri;
        private long uriPositionOffset;

        private Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }

        public DataSpec build() {
            an.C(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        public Builder setCustomData(Object obj) {
            this.customData = obj;
            return this;
        }

        public Builder setFlags(int i2) {
            this.flags = i2;
            return this;
        }

        public Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public Builder setHttpMethod(int i2) {
            this.httpMethod = i2;
            return this;
        }

        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setLength(long j2) {
            this.length = j2;
            return this;
        }

        public Builder setPosition(long j2) {
            this.position = j2;
            return this;
        }

        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }

        public Builder setUriPositionOffset(long j2) {
            this.uriPositionOffset = j2;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.EMPTY_MAP;
            this.length = -1L;
        }
    }

    public DataSpec subrange(long j2) {
        long j3 = this.length;
        return subrange(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec(Uri uri, long j2, long j3) {
        this(uri, j2, j3, null);
    }

    @Deprecated
    public DataSpec(Uri uri, long j2, long j3, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j2, j3, str, 0, null);
    }
}
