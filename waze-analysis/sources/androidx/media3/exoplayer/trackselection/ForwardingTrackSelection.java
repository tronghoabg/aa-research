package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ForwardingTrackSelection implements ExoTrackSelection {
    private final ExoTrackSelection trackSelection;

    public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void clearTrackExclusions() {
        this.trackSelection.clearTrackExclusions();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
        this.trackSelection.disable();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
        this.trackSelection.enable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForwardingTrackSelection) {
            return this.trackSelection.equals(((ForwardingTrackSelection) obj).trackSelection);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j2, List<? extends MediaChunk> list) {
        return this.trackSelection.evaluateQueueSize(j2, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i2, long j2) {
        return this.trackSelection.excludeTrack(i2, j2);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public Format getFormat(int i2) {
        return this.trackSelection.getFormat(i2);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int getIndexInTrackGroup(int i2) {
        return this.trackSelection.getIndexInTrackGroup(i2);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public long getLatestBitrateEstimate() {
        return this.trackSelection.getLatestBitrateEstimate();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public Format getSelectedFormat() {
        return this.trackSelection.getSelectedFormat();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.trackSelection.getSelectedIndex();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndexInTrackGroup() {
        return this.trackSelection.getSelectedIndexInTrackGroup();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public Object getSelectionData() {
        return this.trackSelection.getSelectionData();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.trackSelection.getSelectionReason();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public TrackGroup getTrackGroup() {
        return this.trackSelection.getTrackGroup();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int getType() {
        return this.trackSelection.getType();
    }

    public ExoTrackSelection getWrappedInstance() {
        return this.trackSelection;
    }

    public int hashCode() {
        return this.trackSelection.hashCode();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int indexOf(int i2) {
        return this.trackSelection.indexOf(i2);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i2, long j2) {
        return this.trackSelection.isTrackExcluded(i2, j2);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int length() {
        return this.trackSelection.length();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onDiscontinuity() {
        this.trackSelection.onDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlayWhenReadyChanged(boolean z) {
        this.trackSelection.onPlayWhenReadyChanged(z);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f2) {
        this.trackSelection.onPlaybackSpeed(f2);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onRebuffer() {
        this.trackSelection.onRebuffer();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean shouldCancelChunkLoad(long j2, Chunk chunk, List<? extends MediaChunk> list) {
        return this.trackSelection.shouldCancelChunkLoad(j2, chunk, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        this.trackSelection.updateSelectedTrack(j2, j3, j4, list, mediaChunkIteratorArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int indexOf(Format format) {
        return this.trackSelection.indexOf(format);
    }
}
