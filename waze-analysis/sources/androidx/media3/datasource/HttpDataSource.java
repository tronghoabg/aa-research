package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.HttpDataSource;
import com.google.d.b.ab;
import com.google.d.b.an;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface HttpDataSource extends DataSource {
    public static final ab<String> REJECT_PAYWALL_TYPES = new ab() { // from class: androidx.media3.datasource.HttpDataSource$$ExternalSyntheticLambda0
        @Override // com.google.d.b.ab
        public final boolean apply(Object obj) {
            return HttpDataSource.CC.lambda$static$0((String) obj);
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.datasource.HttpDataSource$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ boolean lambda$static$0(String str) {
            if (str == null) {
                return false;
            }
            String strK = an.K(str);
            return (TextUtils.isEmpty(strK) || (strK.contains("text") && !strK.contains(MimeTypes.TEXT_VTT)) || strK.contains("html") || strK.contains("xml")) ? false : true;
        }
    }

    /* compiled from: WazeSource */
    public abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        @Override // androidx.media3.datasource.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }

        protected abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    /* compiled from: WazeSource */
    public interface Factory extends DataSource.Factory {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.datasource.HttpDataSource$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        HttpDataSource createDataSource();

        Factory setDefaultRequestProperties(Map<String, String> map);
    }

    /* compiled from: WazeSource */
    public final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super("Invalid content type: ".concat(String.valueOf(str)), dataSpec, 2003, 1);
            this.contentType = str;
        }
    }

    /* compiled from: WazeSource */
    public final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final String responseMessage;

        public InvalidResponseCodeException(int i2, String str, IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super("Response code: " + i2, iOException, dataSpec, 2004, 1);
            this.responseCode = i2;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // androidx.media3.datasource.DataSource
    void close();

    int getResponseCode();

    @Override // androidx.media3.datasource.DataSource
    Map<String, List<String>> getResponseHeaders();

    @Override // androidx.media3.datasource.DataSource
    long open(DataSpec dataSpec);

    @Override // androidx.media3.common.DataReader
    int read(byte[] bArr, int i2, int i3);

    void setRequestProperty(String str, String str2);

    /* compiled from: WazeSource */
    public class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException(DataSpec dataSpec, int i2, int i3) {
            super(assignErrorCode(i2, i3));
            this.dataSpec = dataSpec;
            this.type = i3;
        }

        private static int assignErrorCode(int i2, int i3) {
            return i2 == 2000 ? i3 != 1 ? 2000 : 2001 : i2;
        }

        public static HttpDataSourceException createForIOException(IOException iOException, DataSpec dataSpec, int i2) {
            String message = iOException.getMessage();
            int i3 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !an.K(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i3 == 2007 ? new CleartextNotPermittedException(iOException, dataSpec) : new HttpDataSourceException(iOException, dataSpec, i3, i2);
        }

        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int i2) {
            this(dataSpec, 2000, i2);
        }

        @Deprecated
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i2) {
            this(iOException, dataSpec, 2000, i2);
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i2, int i3) {
            super(iOException, assignErrorCode(i2, i3));
            this.dataSpec = dataSpec;
            this.type = i3;
        }

        @Deprecated
        public HttpDataSourceException(String str, DataSpec dataSpec, int i2) {
            this(str, dataSpec, 2000, i2);
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i2, int i3) {
            super(str, assignErrorCode(i2, i3));
            this.dataSpec = dataSpec;
            this.type = i3;
        }

        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i2) {
            this(str, iOException, dataSpec, 2000, i2);
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i2, int i3) {
            super(str, iOException, assignErrorCode(i2, i3));
            this.dataSpec = dataSpec;
            this.type = i3;
        }
    }

    /* compiled from: WazeSource */
    public final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            Map<String, String> mapUnmodifiableMap;
            mapUnmodifiableMap = this.requestPropertiesSnapshot;
            if (mapUnmodifiableMap == null) {
                mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap(this.requestProperties));
                this.requestPropertiesSnapshot = mapUnmodifiableMap;
            }
            return mapUnmodifiableMap;
        }

        public synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }
}
