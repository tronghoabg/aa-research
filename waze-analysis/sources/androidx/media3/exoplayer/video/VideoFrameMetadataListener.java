package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.media3.common.Format;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j2, long j3, Format format, MediaFormat mediaFormat);
}
