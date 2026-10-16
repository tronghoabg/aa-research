package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.RankingDataComparator;
import com.google.d.b.ab;
import com.google.d.b.an;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BasePreloadManager<T, PreloadStatusT> {
    private final Handler applicationHandler;
    private int indexForSourceHolderToClear;
    private int indexForSourceHolderToPreload;
    private final ListenerSet<PreloadManagerListener> listeners;
    private final Object lock = new Object();
    private final MediaSource.Factory mediaSourceFactory;
    private final BasePreloadManager<T, PreloadStatusT>.MediaSourceHolderMap mediaSourceHolderMap;
    protected final RankingDataComparator<T> rankingDataComparator;
    private final List<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> sourceHolderPriorityList;
    private final TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl;
    private PreloadStatusT targetPreloadStatusOfCurrentPreloadingSource;

    /* compiled from: WazeSource */
    public abstract class BuilderBase<T, PreloadStatusT> {
        protected MediaSourceFactorySupplier mediaSourceFactorySupplier;
        protected RankingDataComparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl;

        public BuilderBase(RankingDataComparator<T> rankingDataComparator, TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl, MediaSourceFactorySupplier mediaSourceFactorySupplier) {
            this.rankingDataComparator = rankingDataComparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactorySupplier = mediaSourceFactorySupplier;
        }

        public abstract BasePreloadManager<T, PreloadStatusT> build();
    }

    /* compiled from: WazeSource */
    public class MediaSourceHolder implements Comparable<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> {
        public final MediaItem mediaItem;
        private MediaSource mediaSource;
        public final T rankingData;
        private boolean released;
        final /* synthetic */ BasePreloadManager this$0;

        public MediaSourceHolder(BasePreloadManager basePreloadManager, MediaItem mediaItem, T t, MediaSource mediaSource) {
            Objects.requireNonNull(basePreloadManager);
            this.this$0 = basePreloadManager;
            this.mediaItem = mediaItem;
            this.rankingData = t;
            this.mediaSource = mediaSource;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
            return this.this$0.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }

        public synchronized MediaSource getMediaSource() {
            return this.mediaSource;
        }

        public final boolean isReleased() {
            return this.released;
        }

        public final void release() {
            this.released = true;
        }

        public synchronized void setMediaSource(MediaSource mediaSource) {
            this.mediaSource = mediaSource;
        }
    }

    protected BasePreloadManager(RankingDataComparator<T> rankingDataComparator, TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl, MediaSource.Factory factory) {
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        this.rankingDataComparator = rankingDataComparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
        this.listeners = new ListenerSet<>(handlerCreateHandlerForCurrentOrMainLooper.getLooper());
        this.mediaSourceHolderMap = new MediaSourceHolderMap(this);
        rankingDataComparator.setInvalidationListener(new RankingDataComparator.InvalidationListener() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda3
            @Override // androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener
            public final void onRankingDataComparatorInvalidated() {
                this.f$0.invalidate();
            }
        });
        this.sourceHolderPriorityList = new ArrayList();
    }

    private BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder getCurrentlyPreloadingMediaSourceHolder() {
        if (this.indexForSourceHolderToPreload >= this.sourceHolderPriorityList.size()) {
            return null;
        }
        return this.sourceHolderPriorityList.get(this.indexForSourceHolderToPreload);
    }

    private boolean isCurrentlyPreloading(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
        boolean z;
        synchronized (this.lock) {
            z = mediaSourceHolder == getCurrentlyPreloadingMediaSourceHolder();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCompleted$0(MediaSource mediaSource, ab abVar) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaSource);
        if (targetPreloadStatusIfCurrentlyPreloading == null) {
            return;
        }
        final BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaSource);
        an.B(mediaSourceHolder);
        if (abVar.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((PreloadManagerListener) obj).onCompleted(mediaSourceHolder.mediaItem);
                }
            });
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCompleted$2(MediaItem mediaItem, ab abVar) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
        if (targetPreloadStatusIfCurrentlyPreloading == null) {
            return;
        }
        final BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        an.B(mediaSourceHolder);
        if (abVar.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((PreloadManagerListener) obj).onCompleted(mediaSourceHolder.mediaItem);
                }
            });
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$0(MediaSource mediaSource, ab abVar, final PreloadException preloadException) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaSource);
        if (targetPreloadStatusIfCurrentlyPreloading != null && abVar.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((PreloadManagerListener) obj).onError(preloadException);
                }
            });
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$2(MediaItem mediaItem, ab abVar, final PreloadException preloadException) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
        if (targetPreloadStatusIfCurrentlyPreloading != null && abVar.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda6
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((PreloadManagerListener) obj).onError(preloadException);
                }
            });
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMediaSourceUpdated$0(MediaItem mediaItem, MediaSource mediaSource) {
        if (getTargetPreloadStatusIfCurrentlyPreloading(mediaItem) == null) {
            return;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        an.B(mediaSourceHolder);
        this.mediaSourceHolderMap.remove(mediaItem);
        mediaSourceHolder.setMediaSource(mediaSource);
        this.mediaSourceHolderMap.put(mediaItem, mediaSource, mediaSourceHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSkipped$0(MediaSource mediaSource, ab abVar) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaSource);
        if (targetPreloadStatusIfCurrentlyPreloading != null && abVar.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    private void maybeAdvanceToNextMediaSourceHolder() {
        synchronized (this.lock) {
            do {
                int i2 = this.indexForSourceHolderToPreload + 1;
                this.indexForSourceHolderToPreload = i2;
                if (i2 >= this.sourceHolderPriorityList.size()) {
                    break;
                }
            } while (!maybeStartPreloadingNextSourceHolder());
        }
    }

    private boolean maybeStartPreloadingNextSourceHolder() {
        if (!shouldStartPreloadingNextSource()) {
            return false;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.sourceHolderPriorityList.get(this.indexForSourceHolderToPreload);
        if (mediaSourceHolder.isReleased()) {
            return false;
        }
        PreloadStatusT targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
        this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
        preloadMediaSourceHolderInternal(mediaSourceHolder, targetPreloadStatus);
        return true;
    }

    private void resetSourceHolderPriorityList() {
        this.sourceHolderPriorityList.clear();
        this.sourceHolderPriorityList.addAll(this.mediaSourceHolderMap.values());
        Collections.sort(this.sourceHolderPriorityList);
        this.indexForSourceHolderToPreload = 0;
        this.indexForSourceHolderToClear = this.sourceHolderPriorityList.size() - 1;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() != this.applicationHandler.getLooper()) {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public final void add(MediaSource mediaSource, T t) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolderCreateMediaSourceHolder = createMediaSourceHolder(mediaSource.getMediaItem(), mediaSource, t);
        this.mediaSourceHolderMap.put(mediaSourceHolderCreateMediaSourceHolder.mediaItem, mediaSourceHolderCreateMediaSourceHolder.getMediaSource(), mediaSourceHolderCreateMediaSourceHolder);
    }

    public void addListener(PreloadManagerListener preloadManagerListener) {
        this.listeners.add(preloadManagerListener);
    }

    public final void addMediaItems(List<MediaItem> list, List<T> list2) {
        an.l(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            add(list.get(i2), (MediaItem) list2.get(i2));
        }
        invalidate();
    }

    public final void addMediaSources(List<MediaSource> list, List<T> list2) {
        an.l(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            add(list.get(i2), (MediaSource) list2.get(i2));
        }
        invalidate();
    }

    public void clearListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    protected abstract BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder createMediaSourceHolder(MediaItem mediaItem, MediaSource mediaSource, T t);

    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (!this.mediaSourceHolderMap.containsKey(mediaItem)) {
            return null;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        an.B(mediaSourceHolder);
        return mediaSourceHolder.getMediaSource();
    }

    protected BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder getMediaSourceHolderToClear() {
        synchronized (this.lock) {
            int i2 = this.indexForSourceHolderToPreload;
            int i3 = this.indexForSourceHolderToClear;
            if (i2 >= i3) {
                return null;
            }
            return this.sourceHolderPriorityList.get(i3);
        }
    }

    public final int getSourceCount() {
        return this.mediaSourceHolderMap.size();
    }

    protected final PreloadStatusT getTargetPreloadStatusIfCurrentlyPreloading(MediaItem mediaItem) {
        synchronized (this.lock) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
            if (currentlyPreloadingMediaSourceHolder != null && mediaItem.equals(currentlyPreloadingMediaSourceHolder.mediaItem)) {
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            }
            return null;
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            resetSourceHolderPriorityList();
            while (this.indexForSourceHolderToPreload < this.sourceHolderPriorityList.size() && !maybeStartPreloadingNextSourceHolder()) {
                this.indexForSourceHolderToPreload++;
            }
        }
    }

    protected final void onCompleted(final MediaItem mediaItem, final ab<PreloadStatusT> abVar) {
        this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onCompleted$2(mediaItem, abVar);
            }
        });
    }

    protected final void onError(final PreloadException preloadException, final MediaItem mediaItem, final ab<PreloadStatusT> abVar) {
        this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onError$2(mediaItem, abVar, preloadException);
            }
        });
    }

    protected final void onMediaSourceUpdated(final MediaItem mediaItem, final MediaSource mediaSource) {
        Util.postOrRun(this.applicationHandler, new Runnable() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onMediaSourceUpdated$0(mediaItem, mediaSource);
            }
        });
    }

    protected final void onSkipped(final MediaSource mediaSource, final ab<PreloadStatusT> abVar) {
        Util.postOrRun(this.applicationHandler, new Runnable() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onSkipped$0(mediaSource, abVar);
            }
        });
    }

    protected final void onSourceCleared() {
        synchronized (this.lock) {
            this.indexForSourceHolderToClear--;
        }
    }

    protected abstract void preloadMediaSourceHolderInternal(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder, PreloadStatusT preloadstatust);

    public final void release() {
        reset();
        releaseInternal();
        clearListeners();
    }

    protected void releaseInternal() {
    }

    protected void releaseMediaSourceHolderInternal(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
        mediaSourceHolder.release();
    }

    public final boolean remove(MediaItem mediaItem) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        if (mediaSourceHolder == null) {
            return false;
        }
        releaseMediaSourceHolderInternal(mediaSourceHolder);
        this.mediaSourceHolderMap.remove(mediaItem);
        if (!isCurrentlyPreloading(mediaSourceHolder)) {
            return true;
        }
        maybeAdvanceToNextMediaSourceHolder();
        return true;
    }

    public void removeListener(PreloadManagerListener preloadManagerListener) {
        verifyApplicationThread();
        this.listeners.remove(preloadManagerListener);
    }

    public final void removeMediaItems(List<MediaItem> list) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder;
        for (MediaItem mediaItem : list) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
            if (mediaSourceHolder != null) {
                releaseMediaSourceHolderInternal(mediaSourceHolder);
                this.mediaSourceHolderMap.remove(mediaItem);
            }
        }
        synchronized (this.lock) {
            currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
        }
        if (currentlyPreloadingMediaSourceHolder == null || !currentlyPreloadingMediaSourceHolder.isReleased()) {
            return;
        }
        maybeAdvanceToNextMediaSourceHolder();
    }

    public final void removeMediaSources(List<MediaSource> list) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder;
        for (MediaSource mediaSource : list) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaSource);
            if (mediaSourceHolder != null) {
                releaseMediaSourceHolderInternal(mediaSourceHolder);
                this.mediaSourceHolderMap.remove(mediaSource);
            }
        }
        synchronized (this.lock) {
            currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
        }
        if (currentlyPreloadingMediaSourceHolder == null || !currentlyPreloadingMediaSourceHolder.isReleased()) {
            return;
        }
        maybeAdvanceToNextMediaSourceHolder();
    }

    public final void reset() {
        Iterator<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> it = this.mediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseMediaSourceHolderInternal(it.next());
        }
        this.mediaSourceHolderMap.clear();
        synchronized (this.lock) {
            resetSourceHolderPriorityList();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    protected boolean shouldStartPreloadingNextSource() {
        return true;
    }

    protected final void onCompleted(final MediaSource mediaSource, final ab<PreloadStatusT> abVar) {
        this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onCompleted$0(mediaSource, abVar);
            }
        });
    }

    protected final void onError(final PreloadException preloadException, final MediaSource mediaSource, final ab<PreloadStatusT> abVar) {
        this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onError$0(mediaSource, abVar, preloadException);
            }
        });
    }

    public final void add(MediaItem mediaItem, T t) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), (MediaSource) t);
    }

    protected final PreloadStatusT getTargetPreloadStatusIfCurrentlyPreloading(MediaSource mediaSource) {
        synchronized (this.lock) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
            if (currentlyPreloadingMediaSourceHolder != null && mediaSource == currentlyPreloadingMediaSourceHolder.getMediaSource()) {
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            }
            return null;
        }
    }

    public final boolean remove(MediaSource mediaSource) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaSource);
        if (mediaSourceHolder == null) {
            return false;
        }
        releaseMediaSourceHolderInternal(mediaSourceHolder);
        this.mediaSourceHolderMap.remove(mediaSource);
        if (!isCurrentlyPreloading(mediaSourceHolder)) {
            return true;
        }
        maybeAdvanceToNextMediaSourceHolder();
        return true;
    }

    /* compiled from: WazeSource */
    final class MediaSourceHolderMap {
        private final HashMap<MediaItem, BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> mediaItemToMediaSourceHolder;
        private final HashMap<MediaSource, MediaItem> mediaSourceToMediaItem;

        public MediaSourceHolderMap(BasePreloadManager basePreloadManager) {
            Objects.requireNonNull(basePreloadManager);
            this.mediaItemToMediaSourceHolder = new HashMap<>();
            this.mediaSourceToMediaItem = new HashMap<>();
        }

        public synchronized void clear() {
            this.mediaItemToMediaSourceHolder.clear();
            this.mediaSourceToMediaItem.clear();
        }

        public synchronized boolean containsKey(MediaItem mediaItem) {
            return this.mediaItemToMediaSourceHolder.containsKey(mediaItem);
        }

        public synchronized BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder get(MediaSource mediaSource) {
            MediaItem mediaItem = this.mediaSourceToMediaItem.get(mediaSource);
            if (mediaItem == null) {
                return null;
            }
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaItemToMediaSourceHolder.get(mediaItem);
            an.B(mediaSourceHolder);
            return mediaSourceHolder;
        }

        public synchronized void put(MediaItem mediaItem, MediaSource mediaSource, BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
            this.mediaItemToMediaSourceHolder.put(mediaItem, mediaSourceHolder);
            this.mediaSourceToMediaItem.put(mediaSource, mediaItem);
        }

        public synchronized boolean remove(MediaItem mediaItem) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolderRemove = this.mediaItemToMediaSourceHolder.remove(mediaItem);
            if (mediaSourceHolderRemove == null) {
                return false;
            }
            an.B(this.mediaSourceToMediaItem.remove(mediaSourceHolderRemove.getMediaSource()));
            return true;
        }

        public synchronized int size() {
            return this.mediaItemToMediaSourceHolder.size();
        }

        public synchronized Collection<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> values() {
            return this.mediaItemToMediaSourceHolder.values();
        }

        public synchronized BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder get(MediaItem mediaItem) {
            return this.mediaItemToMediaSourceHolder.get(mediaItem);
        }

        public synchronized boolean remove(MediaSource mediaSource) {
            MediaItem mediaItemRemove = this.mediaSourceToMediaItem.remove(mediaSource);
            if (mediaItemRemove == null) {
                return false;
            }
            an.B(this.mediaItemToMediaSourceHolder.remove(mediaItemRemove));
            return true;
        }
    }
}
