package androidx.media3.exoplayer.analytics;

import android.util.Base64;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.aj;
import com.google.d.b.an;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final aj<String> DEFAULT_SESSION_ID_GENERATOR = new aj() { // from class: androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0
        @Override // com.google.d.b.aj
        public final Object get() {
            return DefaultPlaybackSessionManager.generateDefaultSessionId();
        }
    };
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;
    private String currentSessionId;
    private Timeline currentTimeline;
    private long lastRemovedCurrentWindowSequenceNumber;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final aj<String> sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    private final Timeline.Window window;

    /* compiled from: WazeSource */
    final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        final /* synthetic */ DefaultPlaybackSessionManager this$0;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(DefaultPlaybackSessionManager defaultPlaybackSessionManager, String str, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            Objects.requireNonNull(defaultPlaybackSessionManager);
            this.this$0 = defaultPlaybackSessionManager;
            this.sessionId = str;
            this.windowIndex = i2;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i2) {
            if (i2 < timeline.getWindowCount()) {
                timeline.getWindow(i2, this.this$0.window);
                for (int i3 = this.this$0.window.firstPeriodIndex; i3 <= this.this$0.window.lastPeriodIndex; i3++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i3));
                    if (indexOfPeriod != -1) {
                        return timeline2.getPeriod(indexOfPeriod, this.this$0.period).windowIndex;
                    }
                }
            } else if (i2 < timeline2.getWindowCount()) {
                return i2;
            }
            return -1;
        }

        public boolean belongsToSession(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId != null) {
                long j2 = mediaPeriodId.windowSequenceNumber;
                if (j2 != -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
                    return mediaPeriodId2 == null ? !mediaPeriodId.isAd() && j2 == this.windowSequenceNumber : j2 == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
                }
            }
            return i2 == this.windowIndex;
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            long j2 = this.windowSequenceNumber;
            if (j2 == -1) {
                return false;
            }
            if (mediaPeriodId.windowSequenceNumber > j2) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!mediaPeriodId2.isAd()) {
                int i2 = eventTime.mediaPeriodId.nextAdGroupIndex;
                return i2 == -1 || i2 > this.adMediaPeriodId.adGroupIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            int i3 = mediaPeriodId3.adGroupIndex;
            int i4 = mediaPeriodId3.adIndexInAdGroup;
            MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
            int i5 = mediaPeriodId4.adGroupIndex;
            if (i3 <= i5) {
                return i3 == i5 && i4 > mediaPeriodId4.adIndexInAdGroup;
            }
            return true;
        }

        public void maybeSetWindowSequenceNumber(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber == -1 && i2 == this.windowIndex && mediaPeriodId != null) {
                DefaultPlaybackSessionManager defaultPlaybackSessionManager = this.this$0;
                long j2 = mediaPeriodId.windowSequenceNumber;
                if (j2 >= defaultPlaybackSessionManager.getMinWindowSequenceNumber()) {
                    this.windowSequenceNumber = j2;
                }
            }
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int iResolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = iResolveWindowIndexToNewTimeline;
            if (iResolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }
    }

    public DefaultPlaybackSessionManager(aj<String> ajVar) {
        this.sessionIdGenerator = ajVar;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
        this.lastRemovedCurrentWindowSequenceNumber = -1L;
    }

    private void clearCurrentSession(SessionDescriptor sessionDescriptor) {
        if (sessionDescriptor.windowSequenceNumber != -1 && sessionDescriptor.isCreated) {
            this.lastRemovedCurrentWindowSequenceNumber = sessionDescriptor.windowSequenceNumber;
        }
        this.currentSessionId = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        return (sessionDescriptor == null || sessionDescriptor.windowSequenceNumber == -1) ? this.lastRemovedCurrentWindowSequenceNumber + 1 : sessionDescriptor.windowSequenceNumber;
    }

    private SessionDescriptor getOrAddSession(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        long j2 = Long.MAX_VALUE;
        SessionDescriptor sessionDescriptor = null;
        for (SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i2, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i2, mediaPeriodId)) {
                long j3 = sessionDescriptor2.windowSequenceNumber;
                if (j3 == -1 || j3 < j2) {
                    sessionDescriptor = sessionDescriptor2;
                    j2 = j3;
                } else if (j3 == j2) {
                    int i3 = Util.SDK_INT;
                    if (sessionDescriptor.adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                        sessionDescriptor = sessionDescriptor2;
                    }
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String str = this.sessionIdGenerator.get();
        SessionDescriptor sessionDescriptor3 = new SessionDescriptor(this, str, i2, mediaPeriodId);
        this.sessions.put(str, sessionDescriptor3);
        return sessionDescriptor3;
    }

    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            String str = this.currentSessionId;
            if (str != null) {
                SessionDescriptor sessionDescriptor = this.sessions.get(str);
                an.B(sessionDescriptor);
                clearCurrentSession(sessionDescriptor);
                return;
            }
            return;
        }
        SessionDescriptor sessionDescriptor2 = this.sessions.get(this.currentSessionId);
        SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            return;
        }
        if (sessionDescriptor2 != null && sessionDescriptor2.windowSequenceNumber == eventTime.mediaPeriodId.windowSequenceNumber && sessionDescriptor2.adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && sessionDescriptor2.adMediaPeriodId.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).sessionId, orAddSession.sessionId);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        String str = this.currentSessionId;
        if (str != null) {
            SessionDescriptor sessionDescriptor = this.sessions.get(str);
            an.B(sessionDescriptor);
            clearCurrentSession(sessionDescriptor);
        }
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            it.remove();
            if (next.isCreated && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
        SessionDescriptor sessionDescriptor;
        an.B(this.listener);
        if (!eventTime.timeline.isEmpty()) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null) {
                long j2 = mediaPeriodId.windowSequenceNumber;
                if ((j2 == -1 || j2 >= getMinWindowSequenceNumber()) && ((sessionDescriptor = this.sessions.get(this.currentSessionId)) == null || sessionDescriptor.windowSequenceNumber != -1 || sessionDescriptor.windowIndex == eventTime.windowIndex)) {
                }
            }
            SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
            if (this.currentSessionId == null) {
                this.currentSessionId = orAddSession.sessionId;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2 != null && mediaPeriodId2.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId3 = new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex);
                SessionDescriptor orAddSession2 = getOrAddSession(eventTime.windowIndex, mediaPeriodId3);
                if (!orAddSession2.isCreated) {
                    orAddSession2.isCreated = true;
                    eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                    this.listener.onSessionCreated(new AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId3, Math.max(0L, Util.usToMs(this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.period.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), orAddSession2.sessionId);
                }
            }
            if (!orAddSession.isCreated) {
                orAddSession.isCreated = true;
                this.listener.onSessionCreated(eventTime, orAddSession.sessionId);
            }
            if (orAddSession.sessionId.equals(this.currentSessionId) && !orAddSession.isActive) {
                orAddSession.isActive = true;
                this.listener.onSessionActive(eventTime, orAddSession.sessionId);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i2) {
        an.B(this.listener);
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            if (next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                boolean zEquals = next.sessionId.equals(this.currentSessionId);
                if (zEquals) {
                    clearCurrentSession(next);
                }
                if (next.isCreated) {
                    boolean z = false;
                    if (i2 == 0 && zEquals && next.isActive) {
                        z = true;
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, z);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        an.B(this.listener);
        Timeline timeline = this.currentTimeline;
        this.currentTimeline = eventTime.timeline;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline) || next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.sessionId.equals(this.currentSessionId)) {
                    clearCurrentSession(next);
                }
                if (next.isCreated) {
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }
}
