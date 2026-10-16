package androidx.car.app.mediaextensions.analytics.client;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.event.BrowseChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.ErrorEvent;
import androidx.car.app.mediaextensions.analytics.event.MediaClickedEvent;
import androidx.car.app.mediaextensions.analytics.event.ViewChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.VisibleItemsEvent;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AnalyticsCallback {
    void onBrowseNodeChangeEvent(BrowseChangeEvent browseChangeEvent);

    void onErrorEvent(ErrorEvent errorEvent);

    void onMediaClickedEvent(MediaClickedEvent mediaClickedEvent);

    void onUnknownEvent(Bundle bundle);

    void onViewChangeEvent(ViewChangeEvent viewChangeEvent);

    void onVisibleItemsEvent(VisibleItemsEvent visibleItemsEvent);

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.mediaextensions.analytics.client.AnalyticsCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onUnknownEvent(AnalyticsCallback analyticsCallback, Bundle bundle) {
        }
    }
}
