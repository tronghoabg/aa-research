package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PickVisualMediaRequestKt {
    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, long j2, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        x.f(visualMediaType, "mediaType");
        x.f(defaultTab, "defaultTab");
        PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
        builder.setMediaType(visualMediaType);
        builder.setMaxItems(i2);
        builder.setOrderedSelection(z);
        builder.setDefaultTab(defaultTab);
        builder.setAccentColor(j2);
        builder.setMediaCapabilitiesForTranscoding(mediaCapabilities);
        return builder.build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, long j2, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i3 & 8) != 0) {
            i2 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity();
        }
        int i4 = i2;
        boolean z2 = ((i3 & 16) == 0) & z;
        if ((i3 & 32) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(mediaCapabilities, j2, visualMediaType2, i4, z2, defaultTab);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(long j2, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        x.f(visualMediaType, "mediaType");
        x.f(defaultTab, "defaultTab");
        PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
        builder.setMediaType(visualMediaType);
        builder.setMaxItems(i2);
        builder.setOrderedSelection(z);
        builder.setDefaultTab(defaultTab);
        builder.setAccentColor(j2);
        return builder.build();
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        x.f(visualMediaType, "mediaType");
        x.f(defaultTab, "defaultTab");
        PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
        builder.setMediaType(visualMediaType);
        builder.setMaxItems(i2);
        builder.setOrderedSelection(z);
        builder.setDefaultTab(defaultTab);
        builder.setMediaCapabilitiesForTranscoding(mediaCapabilities);
        return builder.build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(long j2, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i3 & 4) != 0) {
            i2 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity();
        }
        int i4 = i2;
        boolean z2 = ((i3 & 8) == 0) & z;
        if ((i3 & 16) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(j2, visualMediaType2, i4, z2, defaultTab);
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i3 & 4) != 0) {
            i2 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity();
        }
        boolean z2 = z & ((i3 & 8) == 0);
        if ((i3 & 16) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(mediaCapabilities, visualMediaType, i2, z2, defaultTab);
    }

    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        x.f(visualMediaType, "mediaType");
        PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
        builder.setMediaType(visualMediaType);
        return builder.build();
    }

    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2) {
        x.f(visualMediaType, "mediaType");
        PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
        builder.setMediaType(visualMediaType);
        builder.setMaxItems(i2);
        return builder.build();
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        x.f(visualMediaType, "mediaType");
        x.f(defaultTab, "defaultTab");
        PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
        builder.setMediaType(visualMediaType);
        builder.setMaxItems(i2);
        builder.setOrderedSelection(z);
        builder.setDefaultTab(defaultTab);
        return builder.build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity();
        }
        return PickVisualMediaRequest(visualMediaType, i2);
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity();
        }
        boolean z2 = z & ((i3 & 4) == 0);
        if ((i3 & 8) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType, i2, z2, defaultTab);
    }
}
