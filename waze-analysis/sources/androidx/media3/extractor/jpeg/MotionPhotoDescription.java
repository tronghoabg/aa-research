package androidx.media3.extractor.jpeg;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.MotionPhotoMetadata;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    /* compiled from: WazeSource */
    public final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j2, long j3) {
            this.mime = str;
            this.semantic = str2;
            this.length = j2;
            this.padding = j3;
        }
    }

    public MotionPhotoDescription(long j2, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j2;
        this.items = list;
    }

    public MotionPhotoMetadata getMotionPhotoMetadata(long j2) {
        long j3;
        if (this.items.size() < 2) {
            return null;
        }
        long j4 = j2;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        long j8 = -1;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.items.get(size);
            boolean z = true;
            if (!containerItem.mime.equals(MimeTypes.VIDEO_MP4) && !containerItem.mime.equals(MimeTypes.VIDEO_QUICK_TIME)) {
                z = false;
            }
            if (size == 0) {
                j4 -= containerItem.padding;
                j3 = 0;
            } else {
                j3 = j4 - containerItem.length;
            }
            long j9 = j4;
            j4 = j3;
            if (z && j4 != j9) {
                j8 = j9 - j4;
                j7 = j4;
            }
            if (size == 0) {
                j6 = j9;
            }
            if (size == 0) {
                j5 = j4;
            }
        }
        if (j7 == -1 || j8 == -1 || j5 == -1 || j6 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j5, j6, this.photoPresentationTimestampUs, j7, j8);
    }
}
