package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes3.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    private static final int MSG_ADD = 1;
    private static final int MSG_MOVE = 3;
    private static final int MSG_ON_COMPLETION = 6;
    private static final int MSG_REMOVE = 2;
    private static final int MSG_SET_SHUFFLE_ORDER = 4;
    private static final int MSG_UPDATE_TIMELINE = 5;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM;
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private Set<HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;
    private final Set<HandlerAndRunnable> pendingOnCompletionActions;
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    /* compiled from: WazeSource */
    final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            this.childIndexByUid = new HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i2 = 0;
            for (MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i2] = mediaSourceHolder.mediaSource.getTimeline();
                this.firstWindowInChildIndices[i2] = windowCount;
                this.firstPeriodInChildIndices[i2] = periodCount;
                windowCount += this.timelines[i2].getWindowCount();
                periodCount += this.timelines[i2].getPeriodCount();
                Object[] objArr = this.uids;
                Object obj = mediaSourceHolder.uid;
                objArr[i2] = obj;
                this.childIndexByUid.put(obj, Integer.valueOf(i2));
                i2++;
            }
            this.windowCount = windowCount;
            this.periodCount = periodCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByPeriodIndex(int i2) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i2 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByWindowIndex(int i2) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i2 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected Object getChildUidByChildIndex(int i2) {
            return this.uids[i2];
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getFirstPeriodIndexByChildIndex(int i2) {
            return this.firstPeriodInChildIndices[i2];
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getFirstWindowIndexByChildIndex(int i2) {
            return this.firstWindowInChildIndices[i2];
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected Timeline getTimelineByChildIndex(int i2) {
            return this.timelines[i2];
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.windowCount;
        }
    }

    /* compiled from: WazeSource */
    final class HandlerAndRunnable {
        private final Handler handler;
        private final Runnable runnable;

        public HandlerAndRunnable(Handler handler, Runnable runnable) {
            this.handler = handler;
            this.runnable = runnable;
        }

        public void dispatch() {
            this.handler.post(this.runnable);
        }
    }

    /* compiled from: WazeSource */
    public final class MediaSourceHolder {
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z);
        }

        public void reset(int i2, int i3) {
            this.childIndex = i2;
            this.firstWindowIndexInChild = i3;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    /* compiled from: WazeSource */
    final class MessageData<T> {
        public final T customData;
        public final int index;
        public final HandlerAndRunnable onCompletionAction;

        public MessageData(int i2, T t, HandlerAndRunnable handlerAndRunnable) {
            this.index = i2;
            this.customData = t;
            this.onCompletionAction = handlerAndRunnable;
        }
    }

    /* renamed from: $r8$lambda$Z-q1-xciSnqpjHcncsvPi_Oj9KU, reason: not valid java name */
    public static /* synthetic */ boolean m12752$r8$lambda$Zq1xciSnqpjHcncsvPi_Oj9KU(ConcatenatingMediaSource concatenatingMediaSource, Message message) {
        concatenatingMediaSource.handleMessage(message);
        return true;
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.setUri(Uri.EMPTY);
        PLACEHOLDER_MEDIA_ITEM = builder.build();
    }

    public ConcatenatingMediaSource(boolean z, boolean z2, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            an.B(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        this.pendingOnCompletionActions = new HashSet();
        this.enabledMediaSourceHolders = new HashSet();
        this.isAtomic = z;
        this.useLazyPreparation = z2;
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    private void addMediaSourceInternal(int i2, MediaSourceHolder mediaSourceHolder) {
        if (i2 > 0) {
            MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i2 - 1);
            mediaSourceHolder.reset(i2, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
        } else {
            mediaSourceHolder.reset(i2, 0);
        }
        correctOffsets(i2, 1, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i2, mediaSourceHolder);
        this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        } else {
            disableChildSource(mediaSourceHolder);
        }
    }

    private void addMediaSourcesInternal(int i2, Collection<MediaSourceHolder> collection) {
        Iterator<MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i2, it.next());
            i2++;
        }
    }

    private void addPublicMediaSources(int i2, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        an.l((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            an.B(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new MediaSourceHolder(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i2, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new MessageData(i2, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void correctOffsets(int i2, int i3, int i4) {
        while (i2 < this.mediaSourceHolders.size()) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i2);
            mediaSourceHolder.childIndex += i3;
            mediaSourceHolder.firstWindowIndexInChild += i4;
            i2++;
        }
    }

    private HandlerAndRunnable createOnCompletionAction(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        HandlerAndRunnable handlerAndRunnable = new HandlerAndRunnable(handler, runnable);
        this.pendingOnCompletionActions.add(handlerAndRunnable);
        return handlerAndRunnable;
    }

    private void disableUnusedMediaSources() {
        Iterator<MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private synchronized void dispatchOnCompletionActions(Set<HandlerAndRunnable> set) {
        Iterator<HandlerAndRunnable> it = set.iterator();
        while (it.hasNext()) {
            it.next().dispatch();
        }
        this.pendingOnCompletionActions.removeAll(set);
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        enableChildSource(mediaSourceHolder);
    }

    private static Object getChildPeriodUid(Object obj) {
        return ConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return ConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        return ConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        Handler handler = this.playbackThreadHandler;
        an.B(handler);
        return handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094 A[LOOP:0: B:17:0x0090->B:19:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.what
            r1 = 1
            switch(r0) {
                case 1: goto L9e;
                case 2: goto L62;
                case 3: goto L2f;
                case 4: goto L1c;
                case 5: goto L17;
                case 6: goto Lc;
                default: goto L6;
            }
        L6:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        Lc:
            java.lang.Object r5 = r5.obj
            int r0 = androidx.media3.common.util.Util.SDK_INT
            java.util.Set r5 = (java.util.Set) r5
            r4.dispatchOnCompletionActions(r5)
            goto Lc4
        L17:
            r4.updateTimelineAndScheduleOnCompletionActions()
            goto Lc4
        L1c:
            java.lang.Object r5 = r5.obj
            int r0 = androidx.media3.common.util.Util.SDK_INT
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$MessageData r5 = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) r5
            T r0 = r5.customData
            androidx.media3.exoplayer.source.ShuffleOrder r0 = (androidx.media3.exoplayer.source.ShuffleOrder) r0
            r4.shuffleOrder = r0
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
            goto Lc4
        L2f:
            java.lang.Object r5 = r5.obj
            int r0 = androidx.media3.common.util.Util.SDK_INT
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$MessageData r5 = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) r5
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r4.shuffleOrder
            int r2 = r5.index
            int r3 = r2 + 1
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r0.cloneAndRemove(r2, r3)
            r4.shuffleOrder = r0
            T r2 = r5.customData
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r0.cloneAndInsert(r2, r1)
            r4.shuffleOrder = r0
            int r0 = r5.index
            T r2 = r5.customData
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.moveMediaSourceInternal(r0, r2)
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
            goto Lc4
        L62:
            java.lang.Object r5 = r5.obj
            int r0 = androidx.media3.common.util.Util.SDK_INT
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$MessageData r5 = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) r5
            int r0 = r5.index
            T r2 = r5.customData
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r0 != 0) goto L87
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r4.shuffleOrder
            int r0 = r0.getLength()
            r3 = 0
            if (r2 != r0) goto L86
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r4.shuffleOrder
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r0.cloneAndClear()
            r4.shuffleOrder = r0
            goto L90
        L86:
            r0 = r3
        L87:
            androidx.media3.exoplayer.source.ShuffleOrder r3 = r4.shuffleOrder
            androidx.media3.exoplayer.source.ShuffleOrder r3 = r3.cloneAndRemove(r0, r2)
            r4.shuffleOrder = r3
            r3 = r0
        L90:
            int r2 = r2 + (-1)
            if (r2 < r3) goto L98
            r4.removeMediaSourceInternal(r2)
            goto L90
        L98:
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
            goto Lc4
        L9e:
            java.lang.Object r5 = r5.obj
            int r0 = androidx.media3.common.util.Util.SDK_INT
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$MessageData r5 = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) r5
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r4.shuffleOrder
            int r2 = r5.index
            T r3 = r5.customData
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            androidx.media3.exoplayer.source.ShuffleOrder r0 = r0.cloneAndInsert(r2, r3)
            r4.shuffleOrder = r0
            int r0 = r5.index
            T r2 = r5.customData
            java.util.Collection r2 = (java.util.Collection) r2
            r4.addMediaSourcesInternal(r0, r2)
            androidx.media3.exoplayer.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ConcatenatingMediaSource.handleMessage(android.os.Message):boolean");
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void moveMediaSourceInternal(int i2, int i3) {
        List<MediaSourceHolder> list = this.mediaSourceHolders;
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int windowCount = list.get(iMin).firstWindowIndexInChild;
        this.mediaSourceHolders.add(i3, this.mediaSourceHolders.remove(i2));
        while (iMin <= iMax) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.childIndex = iMin;
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
    }

    private void movePublicMediaSource(int i2, int i3, Handler handler, Runnable runnable) {
        an.l((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        this.mediaSourcesPublic.add(i3, this.mediaSourcesPublic.remove(i2));
        if (handler2 != null) {
            handler2.obtainMessage(3, new MessageData(i2, Integer.valueOf(i3), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removeMediaSourceInternal(int i2) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i2);
        this.mediaSourceByUid.remove(mediaSourceHolderRemove.uid);
        correctOffsets(i2, -1, -mediaSourceHolderRemove.mediaSource.getTimeline().getWindowCount());
        mediaSourceHolderRemove.isRemoved = true;
        maybeReleaseChildSource(mediaSourceHolderRemove);
    }

    private void removePublicMediaSources(int i2, int i3, Handler handler, Runnable runnable) {
        an.l((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Util.removeRange(this.mediaSourcesPublic, i2, i3);
        if (handler2 != null) {
            handler2.obtainMessage(2, new MessageData(i2, Integer.valueOf(i3), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void scheduleTimelineUpdate(HandlerAndRunnable handlerAndRunnable) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (handlerAndRunnable != null) {
            this.nextTimelineUpdateOnCompletionActions.add(handlerAndRunnable);
        }
    }

    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        an.l((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(4, new MessageData(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder.childIndex + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(mediaSourceHolder.childIndex + 1).firstWindowIndexInChild - mediaSourceHolder.firstWindowIndexInChild);
            if (windowCount != 0) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        Set<HandlerAndRunnable> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        refreshSourceInfo(new ConcatenatedTimeline(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(6, set).sendToTarget();
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        MediaSourceHolder mediaSourceHolder = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (mediaSourceHolder == null) {
            mediaSourceHolder = new MediaSourceHolder(new FakeMediaSource(), this.useLazyPreparation);
            mediaSourceHolder.isRemoved = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        }
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j2);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
        ShuffleOrder shuffleOrderCloneAndInsert;
        int length = this.shuffleOrder.getLength();
        int size = this.mediaSourcesPublic.size();
        shuffleOrderCloneAndInsert = this.shuffleOrder;
        if (length != size) {
            shuffleOrderCloneAndInsert = shuffleOrderCloneAndInsert.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size());
        }
        return new ConcatenatedTimeline(this.mediaSourcesPublic, shuffleOrderCloneAndInsert, this.isAtomic);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return PLACEHOLDER_MEDIA_ITEM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i2 = 0; i2 < mediaSourceHolder.activeMediaPeriodIds.size(); i2++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i2).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    public synchronized MediaSource getMediaSource(int i2) {
        return this.mediaSourcesPublic.get(i2).mediaSource;
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public synchronized void moveMediaSource(int i2, int i3) {
        movePublicMediaSource(i2, i3, null, null);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected synchronized void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ConcatenatingMediaSource.m12752$r8$lambda$Zq1xciSnqpjHcncsvPi_Oj9KU(this.f$0, message);
                return true;
            }
        });
        if (this.mediaSourcesPublic.isEmpty()) {
            updateTimelineAndScheduleOnCompletionActions();
            return;
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
        addMediaSourcesInternal(0, this.mediaSourcesPublic);
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceByMediaPeriod.remove(mediaPeriod);
        an.B(mediaSourceHolderRemove);
        mediaSourceHolderRemove.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolderRemove.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolderRemove);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected synchronized void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.enabledMediaSourceHolders.clear();
        this.mediaSourceByUid.clear();
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
        this.nextTimelineUpdateOnCompletionActions.clear();
        dispatchOnCompletionActions(this.pendingOnCompletionActions);
    }

    public synchronized MediaSource removeMediaSource(int i2) {
        MediaSource mediaSource;
        int i3 = i2 + 1;
        mediaSource = getMediaSource(i2);
        removePublicMediaSources(i2, i3, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i2, int i3) {
        removePublicMediaSources(i2, i3, null, null);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    /* compiled from: WazeSource */
    final class FakeMediaSource extends BaseMediaSource {
        @Override // androidx.media3.exoplayer.source.MediaSource
        public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public MediaItem getMediaItem() {
            return ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        protected void prepareSourceInternal(TransferListener transferListener) {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public void releasePeriod(MediaPeriod mediaPeriod) {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        protected void releaseSourceInternal() {
        }

        private FakeMediaSource() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i2) {
        return i2 + mediaSourceHolder.firstWindowIndexInChild;
    }

    public synchronized void moveMediaSource(int i2, int i3, Handler handler, Runnable runnable) {
        movePublicMediaSource(i2, i3, handler, runnable);
    }

    public synchronized void removeMediaSourceRange(int i2, int i3, Handler handler, Runnable runnable) {
        removePublicMediaSources(i2, i3, handler, runnable);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    public synchronized void addMediaSource(int i2, MediaSource mediaSource, Handler handler, Runnable runnable) {
        addPublicMediaSources(i2, Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(int i2, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i2, collection, handler, runnable);
    }

    public synchronized MediaSource removeMediaSource(int i2, Handler handler, Runnable runnable) {
        MediaSource mediaSource;
        int i3 = i2 + 1;
        mediaSource = getMediaSource(i2);
        removePublicMediaSources(i2, i3, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i2, MediaSource mediaSource) {
        addPublicMediaSources(i2, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSources(int i2, Collection<MediaSource> collection) {
        addPublicMediaSources(i2, collection, null, null);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        this(z, false, shuffleOrder, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }
}
