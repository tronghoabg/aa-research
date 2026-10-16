package androidx.media3.exoplayer.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.d.ci;
import com.google.d.d.fo;
import com.google.d.d.fu;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String TAG = "DefaultDrmSessionMgr";
    private final MediaDrmCallback callback;
    private ExoMediaDrm exoMediaDrm;
    private final ExoMediaDrm.Provider exoMediaDrmProvider;
    private final Set<DefaultDrmSession> keepaliveSessions;
    private final HashMap<String, String> keyRequestParameters;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    volatile MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private DefaultDrmSession noMultiSessionDrmSession;
    private byte[] offlineLicenseKeySetId;
    private DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private Handler playbackHandler;
    private Looper playbackLooper;
    private PlayerId playerId;
    private final Set<PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final ProvisioningManagerImpl provisioningManagerImpl;
    private final ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final List<DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final UUID uuid;

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean multiSession;
        private final HashMap<String, String> keyRequestParameters = new HashMap<>();
        private UUID uuid = C.WIDEVINE_UUID;
        private ExoMediaDrm.Provider exoMediaDrmProvider = FrameworkMediaDrm.DEFAULT_PROVIDER;
        private int[] useDrmSessionsForClearContentTrackTypes = new int[0];
        private boolean playClearSamplesWithoutKeys = true;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
        private long sessionKeepaliveMs = 300000;

        public DefaultDrmSessionManager build(MediaDrmCallback mediaDrmCallback) {
            return new DefaultDrmSessionManager(this.uuid, this.exoMediaDrmProvider, mediaDrmCallback, this.keyRequestParameters, this.multiSession, this.useDrmSessionsForClearContentTrackTypes, this.playClearSamplesWithoutKeys, this.loadErrorHandlingPolicy, this.sessionKeepaliveMs);
        }

        public Builder setKeyRequestParameters(Map<String, String> map) {
            this.keyRequestParameters.clear();
            if (map != null) {
                this.keyRequestParameters.putAll(map);
            }
            return this;
        }

        public Builder setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            an.B(loadErrorHandlingPolicy);
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Builder setMultiSession(boolean z) {
            this.multiSession = z;
            return this;
        }

        public Builder setPlayClearSamplesWithoutKeys(boolean z) {
            this.playClearSamplesWithoutKeys = z;
            return this;
        }

        public Builder setSessionKeepaliveMs(long j2) {
            boolean z = true;
            if (j2 <= 0) {
                if (j2 == C.TIME_UNSET) {
                    j2 = -9223372036854775807L;
                } else {
                    z = false;
                }
            }
            an.l(z);
            this.sessionKeepaliveMs = j2;
            return this;
        }

        public Builder setUseDrmSessionsForClearContent(int... iArr) {
            for (int i2 : iArr) {
                boolean z = true;
                if (i2 != 2 && i2 != 1) {
                    z = false;
                }
                an.l(z);
            }
            this.useDrmSessionsForClearContentTrackTypes = (int[]) iArr.clone();
            return this;
        }

        public Builder setUuidAndExoMediaDrmProvider(UUID uuid, ExoMediaDrm.Provider provider) {
            an.B(uuid);
            this.uuid = uuid;
            an.B(provider);
            this.exoMediaDrmProvider = provider;
            return this;
        }
    }

    /* compiled from: WazeSource */
    class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        final /* synthetic */ DefaultDrmSessionManager this$0;

        private MediaDrmEventListener(DefaultDrmSessionManager defaultDrmSessionManager) {
            Objects.requireNonNull(defaultDrmSessionManager);
            this.this$0 = defaultDrmSessionManager;
        }

        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm exoMediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
            MediaDrmHandler mediaDrmHandler = this.this$0.mediaDrmHandler;
            an.B(mediaDrmHandler);
            mediaDrmHandler.obtainMessage(i2, bArr).sendToTarget();
        }
    }

    /* compiled from: WazeSource */
    class MediaDrmHandler extends Handler {
        final /* synthetic */ DefaultDrmSessionManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaDrmHandler(DefaultDrmSessionManager defaultDrmSessionManager, Looper looper) {
            super(looper);
            Objects.requireNonNull(defaultDrmSessionManager);
            this.this$0 = defaultDrmSessionManager;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : this.this$0.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: ".concat(String.valueOf(String.valueOf(uuid))));
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* compiled from: WazeSource */
    class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {
        private final DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;
        private DrmSession session;
        final /* synthetic */ DefaultDrmSessionManager this$0;

        public PreacquiredSessionReference(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
            Objects.requireNonNull(defaultDrmSessionManager);
            this.this$0 = defaultDrmSessionManager;
            this.eventDispatcher = eventDispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$acquire$0(Format format) {
            if (this.this$0.prepareCallsCount == 0 || this.isReleased) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = this.this$0;
            Looper looper = defaultDrmSessionManager.playbackLooper;
            an.B(looper);
            this.session = defaultDrmSessionManager.acquireSession(looper, this.eventDispatcher, format, false);
            this.this$0.preacquiredSessionReferences.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$release$0() {
            if (this.isReleased) {
                return;
            }
            DrmSession drmSession = this.session;
            if (drmSession != null) {
                drmSession.release(this.eventDispatcher);
            }
            this.this$0.preacquiredSessionReferences.remove(this);
            this.isReleased = true;
        }

        public void acquire(final Format format) {
            Handler handler = this.this$0.playbackHandler;
            an.B(handler);
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$acquire$0(format);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            Handler handler = this.this$0.playbackHandler;
            an.B(handler);
            Util.postOrRun(handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$release$0();
                }
            });
        }
    }

    /* compiled from: WazeSource */
    class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {
        private DefaultDrmSession provisioningSession;
        private final Set<DefaultDrmSession> sessionsAwaitingProvisioning;

        public ProvisioningManagerImpl(DefaultDrmSessionManager defaultDrmSessionManager) {
            Objects.requireNonNull(defaultDrmSessionManager);
            this.sessionsAwaitingProvisioning = new HashSet();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
            this.provisioningSession = null;
            Set<DefaultDrmSession> set = this.sessionsAwaitingProvisioning;
            bn bnVarN = bn.n(set);
            set.clear();
            int size = bnVarN.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((DefaultDrmSession) bnVarN.get(i2)).onProvisionCompleted();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(Exception exc, boolean z) {
            this.provisioningSession = null;
            Set<DefaultDrmSession> set = this.sessionsAwaitingProvisioning;
            bn bnVarN = bn.n(set);
            set.clear();
            int size = bnVarN.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((DefaultDrmSession) bnVarN.get(i2)).onProvisionError(exc, z);
            }
        }

        public void onSessionFullyReleased(DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.remove(defaultDrmSession);
            if (this.provisioningSession == defaultDrmSession) {
                this.provisioningSession = null;
                if (this.sessionsAwaitingProvisioning.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.sessionsAwaitingProvisioning.iterator().next();
                this.provisioningSession = next;
                next.provision();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.add(defaultDrmSession);
            if (this.provisioningSession != null) {
                return;
            }
            this.provisioningSession = defaultDrmSession;
            defaultDrmSession.provision();
        }
    }

    /* compiled from: WazeSource */
    class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        final /* synthetic */ DefaultDrmSessionManager this$0;

        private ReferenceCountListenerImpl(DefaultDrmSessionManager defaultDrmSessionManager) {
            Objects.requireNonNull(defaultDrmSessionManager);
            this.this$0 = defaultDrmSessionManager;
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(final DefaultDrmSession defaultDrmSession, int i2) {
            if (i2 == 1) {
                if (this.this$0.prepareCallsCount > 0 && this.this$0.sessionKeepaliveMs != C.TIME_UNSET) {
                    this.this$0.keepaliveSessions.add(defaultDrmSession);
                    Handler handler = this.this$0.playbackHandler;
                    an.B(handler);
                    handler.postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            defaultDrmSession.release(null);
                        }
                    }, defaultDrmSession, SystemClock.uptimeMillis() + this.this$0.sessionKeepaliveMs);
                }
            } else if (i2 == 0) {
                this.this$0.sessions.remove(defaultDrmSession);
                if (this.this$0.placeholderDrmSession == defaultDrmSession) {
                    this.this$0.placeholderDrmSession = null;
                }
                if (this.this$0.noMultiSessionDrmSession == defaultDrmSession) {
                    this.this$0.noMultiSessionDrmSession = null;
                }
                this.this$0.provisioningManagerImpl.onSessionFullyReleased(defaultDrmSession);
                if (this.this$0.sessionKeepaliveMs != C.TIME_UNSET) {
                    Handler handler2 = this.this$0.playbackHandler;
                    an.B(handler2);
                    handler2.removeCallbacksAndMessages(defaultDrmSession);
                    this.this$0.keepaliveSessions.remove(defaultDrmSession);
                }
            }
            this.this$0.maybeReleaseMediaDrm();
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i2) {
            if (this.this$0.sessionKeepaliveMs != C.TIME_UNSET) {
                this.this$0.keepaliveSessions.remove(defaultDrmSession);
                Handler handler = this.this$0.playbackHandler;
                an.B(handler);
                handler.removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    private DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider provider, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2) {
        an.B(uuid);
        an.m(!C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        this.exoMediaDrmProvider = provider;
        this.callback = mediaDrmCallback;
        this.keyRequestParameters = map;
        this.multiSession = z;
        this.useDrmSessionsForClearContentTrackTypes = iArr;
        this.playClearSamplesWithoutKeys = z2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.provisioningManagerImpl = new ProvisioningManagerImpl(this);
        this.referenceCountListener = new ReferenceCountListenerImpl();
        this.mode = 0;
        this.sessions = new ArrayList();
        this.preacquiredSessionReferences = fo.g();
        this.keepaliveSessions = fo.g();
        this.sessionKeepaliveMs = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession acquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
        List<DrmInitData.SchemeData> schemeDatas;
        maybeCreateMediaDrmHandler(looper);
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            return maybeAcquirePlaceholderSession(MimeTypes.getTrackType(format.sampleMimeType), z);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.offlineLicenseKeySetId == null) {
            schemeDatas = getSchemeDatas(drmInitData, this.uuid, false);
            if (schemeDatas.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.uuid);
                Log.e(TAG, "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException, PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR));
            }
        } else {
            schemeDatas = null;
        }
        if (this.multiSession) {
            Iterator<DefaultDrmSession> it = this.sessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (Objects.equals(next.schemeDatas, schemeDatas)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.noMultiSessionDrmSession;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.acquire(eventDispatcher);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(schemeDatas, false, eventDispatcher, z);
        if (!this.multiSession) {
            this.noMultiSessionDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
        }
        this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
        return defaultDrmSessionCreateAndAcquireSessionWithRetry;
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        DrmSession.DrmSessionException error = drmSession.getError();
        an.B(error);
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || DrmUtil.isFailureToConstructResourceBusyException(cause);
    }

    private boolean canAcquireSession(DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeDatas(drmInitData, this.uuid, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(C.COMMON_PSSH_UUID)) {
                return false;
            }
            Log.w(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(String.valueOf(String.valueOf(this.uuid))));
        }
        String str = drmInitData.schemeType;
        if (str == null || C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
            return true;
        }
        return (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private DefaultDrmSession createAndAcquireSession(List<DrmInitData.SchemeData> list, boolean z, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        an.B(this.exoMediaDrm);
        ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        int i2 = this.mode;
        byte[] bArr = this.offlineLicenseKeySetId;
        Looper looper = this.playbackLooper;
        an.B(looper);
        PlayerId playerId = this.playerId;
        an.B(playerId);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        HashMap<String, String> map = this.keyRequestParameters;
        MediaDrmCallback mediaDrmCallback = this.callback;
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.uuid, exoMediaDrm, this.provisioningManagerImpl, this.referenceCountListener, list, i2, this.playClearSamplesWithoutKeys | z, z, bArr, map, mediaDrmCallback, looper, loadErrorHandlingPolicy, playerId);
        defaultDrmSession.acquire(eventDispatcher);
        if (this.sessionKeepaliveMs != C.TIME_UNSET) {
            defaultDrmSession.acquire(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession createAndAcquireSessionWithRetry(List<DrmInitData.SchemeData> list, boolean z, DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z2) {
        DefaultDrmSession defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        if (acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) && !this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
            undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
            defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        }
        if (!acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) || !z2 || this.preacquiredSessionReferences.isEmpty()) {
            return defaultDrmSessionCreateAndAcquireSession;
        }
        releaseAllPreacquiredSessions();
        if (!this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
        }
        undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
        return createAndAcquireSession(list, z, eventDispatcher);
    }

    private static List<DrmInitData.SchemeData> getSchemeDatas(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i2 = 0; i2 < drmInitData.schemeDataCount; i2++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i2);
            if ((schemeData.matches(uuid) || (C.CLEARKEY_UUID.equals(uuid) && schemeData.matches(C.COMMON_PSSH_UUID))) && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    private synchronized void initPlaybackLooper(Looper looper) {
        Looper looper2 = this.playbackLooper;
        if (looper2 == null) {
            this.playbackLooper = looper;
            this.playbackHandler = new Handler(looper);
        } else {
            an.u(looper2 == looper);
            an.B(this.playbackHandler);
        }
    }

    private DrmSession maybeAcquirePlaceholderSession(int i2, boolean z) {
        ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        an.B(exoMediaDrm);
        if ((exoMediaDrm.getCryptoType() == 2 && MediaLibraryInfo.enableWorkarounds() && FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) || Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, i2) == -1 || exoMediaDrm.getCryptoType() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.placeholderDrmSession;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(bn.p(), true, null, z);
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
            this.placeholderDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
        } else {
            defaultDrmSession.acquire(null);
        }
        return this.placeholderDrmSession;
    }

    private void maybeCreateMediaDrmHandler(Looper looper) {
        if (this.mediaDrmHandler == null) {
            this.mediaDrmHandler = new MediaDrmHandler(this, looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReleaseMediaDrm() {
        if (this.exoMediaDrm != null && this.prepareCallsCount == 0 && this.sessions.isEmpty() && this.preacquiredSessionReferences.isEmpty()) {
            ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
            an.B(exoMediaDrm);
            exoMediaDrm.release();
            this.exoMediaDrm = null;
        }
    }

    private void releaseAllKeepaliveSessions() {
        fu fuVarListIterator = ci.m(this.keepaliveSessions).listIterator();
        while (fuVarListIterator.hasNext()) {
            ((DrmSession) fuVarListIterator.next()).release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void releaseAllPreacquiredSessions() {
        fu fuVarListIterator = ci.m(this.preacquiredSessionReferences).listIterator();
        while (fuVarListIterator.hasNext()) {
            ((PreacquiredSessionReference) fuVarListIterator.next()).release();
        }
    }

    private void undoAcquisition(DrmSession drmSession, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSession.release(eventDispatcher);
        if (this.sessionKeepaliveMs != C.TIME_UNSET) {
            drmSession.release(null);
        }
    }

    private void verifyPlaybackThread(boolean z) {
        if (z && this.playbackLooper == null) {
            Log.w(TAG, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.playbackLooper;
        an.B(looper);
        if (threadCurrentThread != looper.getThread()) {
            Log.w(TAG, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public int getCryptoType(Format format) {
        verifyPlaybackThread(false);
        ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        an.B(exoMediaDrm);
        int cryptoType = exoMediaDrm.getCryptoType();
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            if (Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, MimeTypes.getTrackType(format.sampleMimeType)) == -1) {
                return 0;
            }
        } else if (!canAcquireSession(drmInitData)) {
            return 1;
        }
        return cryptoType;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public DrmSessionManager.DrmSessionReference preacquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        an.u(this.prepareCallsCount > 0);
        an.B(this.playbackLooper);
        PreacquiredSessionReference preacquiredSessionReference = new PreacquiredSessionReference(this, eventDispatcher);
        preacquiredSessionReference.acquire(format);
        return preacquiredSessionReference;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void prepare() {
        verifyPlaybackThread(true);
        int i2 = this.prepareCallsCount;
        this.prepareCallsCount = i2 + 1;
        if (i2 != 0) {
            return;
        }
        if (this.exoMediaDrm == null) {
            ExoMediaDrm exoMediaDrmAcquireExoMediaDrm = this.exoMediaDrmProvider.acquireExoMediaDrm(this.uuid);
            this.exoMediaDrm = exoMediaDrmAcquireExoMediaDrm;
            exoMediaDrmAcquireExoMediaDrm.setOnEventListener(new MediaDrmEventListener());
        } else if (this.sessionKeepaliveMs != C.TIME_UNSET) {
            for (int i3 = 0; i3 < this.sessions.size(); i3++) {
                this.sessions.get(i3).acquire(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        verifyPlaybackThread(true);
        int i2 = this.prepareCallsCount - 1;
        this.prepareCallsCount = i2;
        if (i2 != 0) {
            return;
        }
        if (this.sessionKeepaliveMs != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.sessions);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((DefaultDrmSession) arrayList.get(i3)).release(null);
            }
        }
        releaseAllPreacquiredSessions();
        maybeReleaseMediaDrm();
    }

    public void setMode(int i2, byte[] bArr) {
        an.u(this.sessions.isEmpty());
        if (i2 == 1) {
            an.B(bArr);
        } else if (i2 == 3) {
            i2 = 3;
            an.B(bArr);
        }
        this.mode = i2;
        this.offlineLicenseKeySetId = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public void setPlayer(Looper looper, PlayerId playerId) {
        initPlaybackLooper(looper);
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        verifyPlaybackThread(false);
        an.u(this.prepareCallsCount > 0);
        an.B(this.playbackLooper);
        return acquireSession(this.playbackLooper, eventDispatcher, format, true);
    }
}
