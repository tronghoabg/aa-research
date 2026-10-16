package androidx.car.app.mediaextensions.analytics.event;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.Constants;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class AnalyticsEvent {
    public static final int EVENT_TYPE_BROWSE_NODE_CHANGED_EVENT = 3;
    public static final int EVENT_TYPE_ERROR_EVENT = 5;
    public static final int EVENT_TYPE_MEDIA_CLICKED_EVENT = 2;
    public static final int EVENT_TYPE_UNKNOWN_EVENT = 0;
    public static final int EVENT_TYPE_VIEW_CHANGE_EVENT = 4;
    public static final int EVENT_TYPE_VISIBLE_ITEMS_EVENT = 1;
    public static final int VIEW_ACTION_HIDE = 0;
    public static final int VIEW_ACTION_MODE_NONE = 0;
    public static final int VIEW_ACTION_MODE_SCROLL = 1;
    public static final int VIEW_ACTION_SHOW = 1;
    public static final int VIEW_COMPONENT_BROWSE_ACTION_OVERFLOW = 8;
    public static final int VIEW_COMPONENT_BROWSE_LIST = 1;
    public static final int VIEW_COMPONENT_BROWSE_TABS = 2;
    public static final int VIEW_COMPONENT_ERROR_MESSAGE = 10;
    public static final int VIEW_COMPONENT_LAUNCHER = 6;
    public static final int VIEW_COMPONENT_MEDIA_HOST = 9;
    public static final int VIEW_COMPONENT_MINI_PLAYBACK = 5;
    public static final int VIEW_COMPONENT_PLAYBACK = 4;
    public static final int VIEW_COMPONENT_QUEUE_LIST = 3;
    public static final int VIEW_COMPONENT_SETTINGS_VIEW = 7;
    public static final int VIEW_COMPONENT_UNKNOWN_COMPONENT = 0;
    private final int mAnalyticsVersion;
    private final String mComponent;
    private final int mEventType;
    private final long mTimeStampMillis;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventType {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewAction {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewActionMode {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewComponent {
    }

    public AnalyticsEvent(Bundle bundle, int i) {
        this.mAnalyticsVersion = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VERSION, -1);
        this.mTimeStampMillis = bundle.getLong(Constants.ANALYTICS_EVENT_DATA_KEY_TIMESTAMP, -1L);
        this.mComponent = bundle.getString(Constants.ANALYTICS_EVENT_DATA_KEY_HOST_COMPONENT_ID, "");
        this.mEventType = i;
    }

    public int getAnalyticsVersion() {
        return this.mAnalyticsVersion;
    }

    public String getComponent() {
        return this.mComponent;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public long getTimestampMillis() {
        return this.mTimeStampMillis;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsEvent{mAnalyticsVersion=");
        sb.append(this.mAnalyticsVersion);
        sb.append(", mEventType=");
        sb.append(this.mEventType);
        sb.append(", mTime=");
        sb.append(this.mTimeStampMillis);
        sb.append(", mComponent='");
        return ad.e(sb, this.mComponent, "'}");
    }
}
