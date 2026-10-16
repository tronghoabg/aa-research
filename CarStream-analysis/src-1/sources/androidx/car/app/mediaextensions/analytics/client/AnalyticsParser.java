package androidx.car.app.mediaextensions.analytics.client;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.mediaextensions.analytics.Constants;
import androidx.car.app.mediaextensions.analytics.ThreadUtils;
import androidx.car.app.mediaextensions.analytics.event.BrowseChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.ErrorEvent;
import androidx.car.app.mediaextensions.analytics.event.MediaClickedEvent;
import androidx.car.app.mediaextensions.analytics.event.ViewChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.VisibleItemsEvent;
import defpackage.c0;
import defpackage.d0;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class AnalyticsParser {
    private static final String TAG = "AnalyticsParser";

    private AnalyticsParser() {
    }

    private static void createEvent(AnalyticsCallback analyticsCallback, int i, Bundle bundle) {
        if (i == 1) {
            analyticsCallback.onVisibleItemsEvent(new VisibleItemsEvent(bundle));
            return;
        }
        if (i == 2) {
            analyticsCallback.onMediaClickedEvent(new MediaClickedEvent(bundle));
            return;
        }
        if (i == 3) {
            analyticsCallback.onBrowseNodeChangeEvent(new BrowseChangeEvent(bundle));
        } else if (i != 4) {
            analyticsCallback.onUnknownEvent(bundle);
        } else {
            analyticsCallback.onViewChangeEvent(new ViewChangeEvent(bundle));
        }
    }

    private static int getEventType(String str) {
        str.getClass();
        switch (str) {
            case "androidx.car.app.mediaextensions.analytics.mediaClicked":
                return 2;
            case "androidx.car.app.mediaextensions.analytics.viewchange":
                return 4;
            case "androidx.car.app.mediaextensions.analytics.browsenodechange":
                return 3;
            case "androidx.car.app.mediaextensions.analytics.visibleitems":
                return 1;
            default:
                return 0;
        }
    }

    public static boolean isAnalyticsAction(String str) {
        return Constants.ACTION_ANALYTICS.equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$parseAnalyticsBundle$0(AnalyticsCallback analyticsCallback, Bundle bundle) {
        analyticsCallback.onErrorEvent(new ErrorEvent(bundle, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$parseAnalyticsBundle$1(AnalyticsCallback analyticsCallback, String str, Bundle bundle) {
        createEvent(analyticsCallback, getEventType(str), bundle);
    }

    public static void parseAnalyticsAction(String str, Bundle bundle, AnalyticsCallback analyticsCallback) {
        parseAnalyticsAction(str, bundle, ThreadUtils.getMainThreadExecutor(), analyticsCallback);
    }

    public static void parseAnalyticsBundle(Bundle bundle, Executor executor, AnalyticsCallback analyticsCallback) {
        String string = bundle.getString(Constants.ANALYTICS_EVENT_DATA_KEY_EVENT_NAME, "");
        if (TextUtils.isEmpty(string)) {
            executor.execute(new c0(0, analyticsCallback, bundle));
        } else {
            executor.execute(new d0(analyticsCallback, string, bundle, 0));
        }
    }

    public static void parseAnalyticsAction(String str, Bundle bundle, Executor executor, AnalyticsCallback analyticsCallback) {
        if (!str.equals(Constants.ACTION_ANALYTICS)) {
            analyticsCallback.onErrorEvent(new ErrorEvent(new Bundle(), 2));
            return;
        }
        int i = 0;
        if (bundle == null || bundle.isEmpty()) {
            analyticsCallback.onErrorEvent(new ErrorEvent(new Bundle(), 0));
            return;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Constants.ANALYTICS_EVENT_BUNDLE_ARRAY_KEY);
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            analyticsCallback.onErrorEvent(new ErrorEvent(new Bundle(), 1));
            return;
        }
        int size = parcelableArrayList.size();
        while (i < size) {
            Object obj = parcelableArrayList.get(i);
            i++;
            parseAnalyticsBundle((Bundle) obj, executor, analyticsCallback);
        }
    }
}
