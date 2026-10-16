package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PickVisualMediaRequest {
    private long accentColor;
    private boolean isCustomAccentColorApplied;
    private boolean isOrderedSelection;
    private ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
    private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity();
    private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

    /* compiled from: WazeSource */
    public final class Builder {
        private long accentColor;
        private boolean isCustomAccentColorApplied;
        private boolean isOrderedSelection;
        private ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
        private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity();
        private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

        public final PickVisualMediaRequest build() {
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.setMediaType$activity(this.mediaType);
            pickVisualMediaRequest.setMaxItems$activity(this.maxItems);
            pickVisualMediaRequest.setOrderedSelection$activity(this.isOrderedSelection);
            pickVisualMediaRequest.setDefaultTab$activity(this.defaultTab);
            pickVisualMediaRequest.setCustomAccentColorApplied$activity(this.isCustomAccentColorApplied);
            pickVisualMediaRequest.setAccentColor$activity(this.accentColor);
            pickVisualMediaRequest.setMediaCapabilitiesForTranscoding$activity(this.mediaCapabilitiesForTranscoding);
            return pickVisualMediaRequest;
        }

        public final Builder setAccentColor(long j2) {
            this.accentColor = j2;
            this.isCustomAccentColorApplied = true;
            return this;
        }

        public final Builder setDefaultTab(ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
            x.f(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        public final Builder setMaxItems(int i2) {
            this.maxItems = i2;
            return this;
        }

        public final Builder setMediaCapabilitiesForTranscoding(ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities) {
            this.mediaCapabilitiesForTranscoding = mediaCapabilities;
            return this;
        }

        public final Builder setMediaType(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
            x.f(visualMediaType, "mediaType");
            this.mediaType = visualMediaType;
            return this;
        }

        public final Builder setOrderedSelection(boolean z) {
            this.isOrderedSelection = z;
            return this;
        }
    }

    public final long getAccentColor() {
        return this.accentColor;
    }

    public final ActivityResultContracts.PickVisualMedia.DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    public final int getMaxItems() {
        return this.maxItems;
    }

    public final ActivityResultContracts.PickVisualMedia.MediaCapabilities getMediaCapabilitiesForTranscoding() {
        return this.mediaCapabilitiesForTranscoding;
    }

    public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    public final boolean isCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final boolean isOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void setAccentColor$activity(long j2) {
        this.accentColor = j2;
    }

    public final void setCustomAccentColorApplied$activity(boolean z) {
        this.isCustomAccentColorApplied = z;
    }

    public final void setDefaultTab$activity(ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        x.f(defaultTab, "<set-?>");
        this.defaultTab = defaultTab;
    }

    public final void setMaxItems$activity(int i2) {
        this.maxItems = i2;
    }

    public final void setMediaCapabilitiesForTranscoding$activity(ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities) {
        this.mediaCapabilitiesForTranscoding = mediaCapabilities;
    }

    public final void setMediaType$activity(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        x.f(visualMediaType, "<set-?>");
        this.mediaType = visualMediaType;
    }

    public final void setOrderedSelection$activity(boolean z) {
        this.isOrderedSelection = z;
    }
}
