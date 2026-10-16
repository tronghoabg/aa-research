package androidx.car.app.mediaextensions.analytics.event;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.Constants;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ViewChangeEvent extends AnalyticsEvent {
    private final int mViewAction;
    private final int mViewComponent;

    public ViewChangeEvent(Bundle bundle) {
        super(bundle, 4);
        this.mViewComponent = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VIEW_COMPONENT);
        this.mViewAction = bundle.getInt(Constants.ANALYTICS_EVENT_DATA_KEY_VIEW_ACTION);
    }

    public int getViewAction() {
        return this.mViewAction;
    }

    public int getViewComponent() {
        return this.mViewComponent;
    }

    @Override // androidx.car.app.mediaextensions.analytics.event.AnalyticsEvent
    public String toString() {
        return "ViewChangeEvent{mViewComponent=" + AnalyticsEventsUtil.viewComponentToString(this.mViewComponent) + ", mViewAction=" + AnalyticsEventsUtil.viewActionToString(this.mViewAction) + "'}";
    }
}
