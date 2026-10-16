package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.MediaDrmCallback;
import androidx.media3.exoplayer.source.LoadEventInfo;
import com.google.d.h.h;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;
    private static final int MAX_MANUAL_REDIRECTS = 5;

    /* compiled from: WazeSource */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static MediaDrmCallback.Response executePost(DataSource dataSource, String str, byte[] bArr, Map<String, String> map) throws Throwable {
        DataSpec dataSpec;
        DataSourceInputStream dataSourceInputStream;
        byte[] bArrB;
        StatsDataSource statsDataSource = new StatsDataSource(dataSource);
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.setUri(str);
        builder.setHttpRequestHeaders(map);
        builder.setHttpMethod(2);
        builder.setHttpBody(bArr);
        builder.setFlags(1);
        DataSpec dataSpecBuild = builder.build();
        int i2 = 0;
        DataSpec dataSpecBuild2 = dataSpecBuild;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream2 = new DataSourceInputStream(statsDataSource, dataSpecBuild2);
                try {
                    bArrB = h.b(dataSourceInputStream2);
                } catch (HttpDataSource.InvalidResponseCodeException e2) {
                    e = e2;
                    dataSourceInputStream = dataSourceInputStream2;
                    dataSpec = dataSpecBuild;
                } catch (Throwable th) {
                    th = th;
                    dataSourceInputStream = dataSourceInputStream2;
                }
                try {
                    dataSpec = dataSpecBuild;
                    dataSourceInputStream = dataSourceInputStream2;
                    try {
                        LoadEventInfo loadEventInfo = new LoadEventInfo(-1L, dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), SystemClock.elapsedRealtime(), 0L, bArrB.length);
                        MediaDrmCallback.Response.Builder builder2 = new MediaDrmCallback.Response.Builder(bArrB);
                        builder2.setLoadEventInfo(loadEventInfo);
                        MediaDrmCallback.Response responseBuild = builder2.build();
                        Util.closeQuietly(dataSourceInputStream);
                        return responseBuild;
                    } catch (HttpDataSource.InvalidResponseCodeException e3) {
                        e = e3;
                        try {
                            String redirectUrl = getRedirectUrl(e, i2);
                            if (redirectUrl == null) {
                                throw e;
                            }
                            i2++;
                            DataSpec.Builder builderBuildUpon = dataSpecBuild2.buildUpon();
                            builderBuildUpon.setUri(redirectUrl);
                            dataSpecBuild2 = builderBuildUpon.build();
                            try {
                                Util.closeQuietly(dataSourceInputStream);
                                dataSpecBuild = dataSpec;
                            } catch (Exception e4) {
                                e = e4;
                                throw new MediaDrmCallbackException(dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Util.closeQuietly(dataSourceInputStream);
                            throw th;
                        }
                    }
                } catch (HttpDataSource.InvalidResponseCodeException e5) {
                    e = e5;
                    dataSpec = dataSpecBuild;
                    dataSourceInputStream = dataSourceInputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    dataSourceInputStream = dataSourceInputStream2;
                    Util.closeQuietly(dataSourceInputStream);
                    throw th;
                }
                dataSpecBuild = dataSpec;
            } catch (Exception e6) {
                e = e6;
                dataSpec = dataSpecBuild;
            }
        }
    }

    public static int getErrorCodeForMediaDrmException(Throwable th, int i2) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (th instanceof MediaDrmResetException) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if ((th instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        if (th instanceof KeysExpiredException) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i2 == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i2 == 2) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i2 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i2) {
        Map<String, List<String>> map;
        List<String> list;
        int i3 = invalidResponseCodeException.responseCode;
        if ((i3 != 307 && i3 != 308) || i2 >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean isFailureToConstructNotProvisionedException(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
