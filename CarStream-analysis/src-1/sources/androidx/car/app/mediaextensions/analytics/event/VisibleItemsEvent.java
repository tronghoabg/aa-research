package androidx.car.app.mediaextensions.analytics.event;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.Constants;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class VisibleItemsEvent extends AnalyticsEvent {
    private final List<String> mItemsIds;
    private final String mNodeId;
    private final int mViewAction;
    private final int mViewActionMode;
    private final int mViewComponent;

    public VisibleItemsEvent(Bundle bundle) {
        super(bundle, 1);
        this.mViewComponent = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VIEW_COMPONENT);
        this.mViewAction = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VIEW_ACTION);
        this.mViewActionMode = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VIEW_ACTION_MODE);
        this.mNodeId = bundle.getString(Constants.ANALYTICS_EVENT_DATA_KEY_PARENT_NODE_ID);
        this.mItemsIds = bundle.getStringArrayList(Constants.ANALYTICS_EVENT_DATA_KEY_ITEM_IDS);
    }

    public List<String> getItemsIds() {
        return this.mItemsIds;
    }

    public String getNodeId() {
        return this.mNodeId;
    }

    public int getViewAction() {
        return this.mViewAction;
    }

    public int getViewActionMode() {
        return this.mViewActionMode;
    }

    public int getViewComponent() {
        return this.mViewComponent;
    }

    @Override // androidx.car.app.mediaextensions.analytics.event.AnalyticsEvent
    public String toString() {
        return "VisibleItemsEvent{mViewComponent=" + AnalyticsEventsUtil.viewComponentToString(this.mViewComponent) + ", mViewAction=" + AnalyticsEventsUtil.viewActionToString(this.mViewAction) + ", mViewActionMode=" + AnalyticsEventsUtil.viewActionModeToString(this.mViewActionMode) + ", mNodeId='" + this.mNodeId + "', mItemsIds=" + this.mItemsIds + '}';
    }
}
