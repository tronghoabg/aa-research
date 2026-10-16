package androidx.car.app.mediaextensions.analytics.event;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.Constants;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class MediaClickedEvent extends AnalyticsEvent {
    private final String mMediaId;
    private final int mViewComponent;

    public MediaClickedEvent(Bundle bundle) {
        super(bundle, 2);
        this.mMediaId = bundle.getString(Constants.ANALYTICS_EVENT_DATA_KEY_MEDIA_ID);
        this.mViewComponent = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VIEW_COMPONENT);
    }

    public String getMediaId() {
        return this.mMediaId;
    }

    public int getViewComponent() {
        return this.mViewComponent;
    }

    @Override // androidx.car.app.mediaextensions.analytics.event.AnalyticsEvent
    public String toString() {
        return "MediaClickedEvent{mMediaId='" + this.mMediaId + "', mViewComponent=" + AnalyticsEventsUtil.viewComponentToString(this.mViewComponent) + '}';
    }
}
