package androidx.car.app.mediaextensions.analytics.event;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.Constants;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class BrowseChangeEvent extends AnalyticsEvent {
    public static final int BROWSE_MODE_LINK = 4;
    public static final int BROWSE_MODE_LINK_BROWSE = 5;
    public static final int BROWSE_MODE_SEARCH_BROWSE = 6;
    public static final int BROWSE_MODE_SEARCH_RESULTS = 7;
    public static final int BROWSE_MODE_TREE_BROWSE = 2;
    public static final int BROWSE_MODE_TREE_ROOT = 1;
    public static final int BROWSE_MODE_TREE_TAB = 3;
    public static final int BROWSE_MODE_UNKNOWN = 0;
    private final int mBrowseMode;
    private final String mBrowseNodeId;
    private final int mViewAction;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowseMode {
    }

    public BrowseChangeEvent(Bundle bundle) {
        super(bundle, 3);
        this.mViewAction = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VIEW_ACTION);
        this.mBrowseMode = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_BROWSE_MODE);
        this.mBrowseNodeId = bundle.getString(Constants.ANALYTICS_EVENT_DATA_KEY_MEDIA_ID);
    }

    public int getBrowseMode() {
        return this.mBrowseMode;
    }

    public String getBrowseNodeId() {
        return this.mBrowseNodeId;
    }

    public int getViewAction() {
        return this.mViewAction;
    }

    @Override // androidx.car.app.mediaextensions.analytics.event.AnalyticsEvent
    public String toString() {
        StringBuilder sb = new StringBuilder("BrowseChangeEvent{mBrowseMode=");
        sb.append(AnalyticsEventsUtil.browseModeToString(this.mBrowseMode));
        sb.append(", mViewAction=");
        sb.append(AnalyticsEventsUtil.viewActionToString(this.mViewAction));
        sb.append(", mBrowseNodeId='");
        return ad.e(sb, this.mBrowseNodeId, "'}");
    }
}
