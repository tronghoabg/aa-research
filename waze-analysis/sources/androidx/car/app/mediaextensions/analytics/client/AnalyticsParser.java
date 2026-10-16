package androidx.car.app.mediaextensions.analytics.client;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.mediaextensions.analytics.Constants;
import androidx.car.app.mediaextensions.analytics.ThreadUtils;
import androidx.car.app.mediaextensions.analytics.event.BrowseChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.ErrorEvent;
import androidx.car.app.mediaextensions.analytics.event.MediaClickedEvent;
import androidx.car.app.mediaextensions.analytics.event.ViewChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.VisibleItemsEvent;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AnalyticsParser {
    private static final String TAG = "AnalyticsParser";

    private AnalyticsParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createEvent(AnalyticsCallback analyticsCallback, int i2, Bundle bundle) {
        if (i2 == 1) {
            analyticsCallback.onVisibleItemsEvent(new VisibleItemsEvent(bundle));
            return;
        }
        if (i2 == 2) {
            analyticsCallback.onMediaClickedEvent(new MediaClickedEvent(bundle));
            return;
        }
        if (i2 == 3) {
            analyticsCallback.onBrowseNodeChangeEvent(new BrowseChangeEvent(bundle));
        } else if (i2 != 4) {
            analyticsCallback.onUnknownEvent(bundle);
        } else {
            analyticsCallback.onViewChangeEvent(new ViewChangeEvent(bundle));
        }
    }

    private static int getEventType(String str) {
        switch (str.hashCode()) {
            case -1394641875:
                return str.equals(Constants.ANALYTICS_EVENT_MEDIA_CLICKED) ? 2 : 0;
            case -358793825:
                return str.equals(Constants.ANALYTICS_EVENT_VIEW_CHANGE) ? 4 : 0;
            case 60066246:
                return str.equals(Constants.ANALYTICS_EVENT_BROWSE_NODE_CHANGE) ? 3 : 0;
            case 1792348952:
                return str.equals(Constants.ANALYTICS_EVENT_VISIBLE_ITEMS) ? 1 : 0;
            default:
                return 0;
        }
    }

    public static boolean isAnalyticsAction(String str) {
        return Constants.ACTION_ANALYTICS.equalsIgnoreCase(str);
    }

    public static void parseAnalyticsAction(String str, Bundle bundle, Executor executor, AnalyticsCallback analyticsCallback) {
        if (!str.equals(Constants.ACTION_ANALYTICS)) {
            analyticsCallback.onErrorEvent(new ErrorEvent(new Bundle(), 2));
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            Log.e(TAG, "Analytics event bundle is null or empty.");
            analyticsCallback.onErrorEvent(new ErrorEvent(new Bundle(), 0));
            return;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Constants.ANALYTICS_EVENT_BUNDLE_ARRAY_KEY);
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            Log.e(TAG, "Analytics event bundle list is empty.");
            analyticsCallback.onErrorEvent(new ErrorEvent(new Bundle(), 1));
        } else {
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                parseAnalyticsBundle((Bundle) parcelableArrayList.get(i2), executor, analyticsCallback);
            }
        }
    }

    public static void parseAnalyticsBundle(final Bundle bundle, Executor executor, final AnalyticsCallback analyticsCallback) {
        final String string = bundle.getString(Constants.ANALYTICS_EVENT_DATA_KEY_EVENT_NAME, "");
        if (TextUtils.isEmpty(string)) {
            executor.execute(new Runnable() { // from class: androidx.car.app.mediaextensions.analytics.client.AnalyticsParser$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    analyticsCallback.onErrorEvent(new ErrorEvent(bundle, 2));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: androidx.car.app.mediaextensions.analytics.client.AnalyticsParser$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AnalyticsParser.createEvent(analyticsCallback, AnalyticsParser.getEventType(string), bundle);
                }
            });
        }
    }

    public static void parseAnalyticsAction(String str, Bundle bundle, AnalyticsCallback analyticsCallback) {
        parseAnalyticsAction(str, bundle, ThreadUtils.getMainThreadExecutor(), analyticsCallback);
    }
}
