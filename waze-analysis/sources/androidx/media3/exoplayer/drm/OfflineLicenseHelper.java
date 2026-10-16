package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.an;
import com.google.d.m.a.bv;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA;
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    static {
        Format.Builder builder = new Format.Builder();
        builder.setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0]));
        FORMAT_WITH_EMPTY_DRM_INIT_DATA = builder.build();
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener(this) { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            final /* synthetic */ OfflineLicenseHelper this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i2, MediaSource.MediaPeriodId mediaPeriodId, KeyRequestInfo keyRequestInfo) {
                this.this$0.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
                this.this$0.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
                this.this$0.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public /* synthetic */ void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                this.this$0.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public /* synthetic */ void onDrmSessionReleased(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public /* synthetic */ void onDrmKeysLoaded(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DrmSession acquireFirstSessionOnHandlerThread(final int i2, final byte[] bArr, final Format format) throws DrmSession.DrmSessionException {
        an.B(format.drmInitData);
        ConditionVariable conditionVariable = this.drmListenerConditionVariable;
        final bv bvVarF = bv.f();
        conditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$acquireFirstSessionOnHandlerThread$0(i2, bArr, bvVarF, format);
            }
        });
        try {
            final DrmSession drmSession = (DrmSession) bvVarF.get();
            this.drmListenerConditionVariable.block();
            Handler handler = this.handler;
            final bv bvVarF2 = bv.f();
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$acquireFirstSessionOnHandlerThread$1(drmSession, bvVarF2);
                }
            });
            try {
                if (bvVarF2.get() == 0) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) bvVarF2.get());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (InterruptedException | ExecutionException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i2, byte[] bArr, Format format) throws DrmSession.DrmSessionException {
        final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i2, bArr, format);
        final bv bvVarF = bv.f();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$0(bvVarF, drmSessionAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                byte[] bArr2 = (byte[]) bvVarF.get();
                an.B(bArr2);
                return bArr2;
            } finally {
                releaseManagerOnHandlerThread();
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$0(int i2, byte[] bArr, bv bvVar, Format format) {
        try {
            DefaultDrmSessionManager defaultDrmSessionManager = this.drmSessionManager;
            Looper looperMyLooper = Looper.myLooper();
            an.B(looperMyLooper);
            Looper looper = looperMyLooper;
            defaultDrmSessionManager.setPlayer(looperMyLooper, PlayerId.UNSET);
            this.drmSessionManager.prepare();
            try {
                this.drmSessionManager.setMode(i2, bArr);
                DrmSession drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.eventDispatcher, format);
                an.B(drmSessionAcquireSession);
                DrmSession drmSession = drmSessionAcquireSession;
                bvVar.c(drmSessionAcquireSession);
            } catch (Throwable th) {
                this.drmSessionManager.release();
                throw th;
            }
        } catch (Throwable th2) {
            bvVar.d(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$1(DrmSession drmSession, bv bvVar) {
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(this.eventDispatcher);
                this.drmSessionManager.release();
            }
            bvVar.c(error);
        } catch (Throwable th) {
            bvVar.d(th);
            drmSession.release(this.eventDispatcher);
            this.drmSessionManager.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$0(bv bvVar, DrmSession drmSession) {
        try {
            bvVar.c(drmSession.getOfflineLicenseKeySetId());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLicenseDurationRemainingSec$0(bv bvVar, DrmSession drmSession) {
        try {
            Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(drmSession);
            an.B(licenseDurationRemainingSec);
            Pair<Long, Long> pair = licenseDurationRemainingSec;
            bvVar.c(licenseDurationRemainingSec);
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseManagerOnHandlerThread$0(bv bvVar) {
        try {
            this.drmSessionManager.release();
            bvVar.c(null);
        } catch (Throwable th) {
            bvVar.d(th);
        }
    }

    private static OfflineLicenseHelper newWidevineInstance(String str, boolean z, Map<String, String> map, DataSource.Factory factory, Map<String, String> map2, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(str, z, factory);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpMediaDrmCallback.setKeyRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DefaultDrmSessionManager.Builder builder = new DefaultDrmSessionManager.Builder();
        builder.setKeyRequestParameters(map2);
        return new OfflineLicenseHelper(builder.build(httpMediaDrmCallback), eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        final bv bvVarF = bv.f();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$releaseManagerOnHandlerThread$0(bvVarF);
            }
        });
        try {
            bvVarF.get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public synchronized byte[] downloadLicense(Format format) {
        an.l(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) {
        final bv bvVarF;
        an.B(bArr);
        try {
            final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            Handler handler = this.handler;
            bvVarF = bv.f();
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$getLicenseDurationRemainingSec$0(bvVarF, drmSessionAcquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                } finally {
                    releaseManagerOnHandlerThread();
                }
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (DrmSession.DrmSessionException e3) {
            if (e3.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e3;
        }
        return (Pair) bvVarF.get();
    }

    public void release() {
        this.handlerThread.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) {
        an.B(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) {
        an.B(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, factory, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, null, factory, map, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(MediaItem.DrmConfiguration drmConfiguration, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        an.l(drmConfiguration.scheme.equals(C.WIDEVINE_UUID));
        Uri uri = drmConfiguration.licenseUri;
        an.B(uri);
        return newWidevineInstance(uri.toString(), drmConfiguration.forceDefaultLicenseUri, drmConfiguration.licenseRequestHeaders, factory, null, eventDispatcher);
    }
}
