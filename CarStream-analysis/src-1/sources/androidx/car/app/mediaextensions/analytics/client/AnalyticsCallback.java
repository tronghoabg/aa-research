package androidx.car.app.mediaextensions.analytics.client;

import android.os.Bundle;
import androidx.car.app.mediaextensions.analytics.event.BrowseChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.ErrorEvent;
import androidx.car.app.mediaextensions.analytics.event.MediaClickedEvent;
import androidx.car.app.mediaextensions.analytics.event.ViewChangeEvent;
import androidx.car.app.mediaextensions.analytics.event.VisibleItemsEvent;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface AnalyticsCallback {
    void onBrowseNodeChangeEvent(BrowseChangeEvent browseChangeEvent);

    void onErrorEvent(ErrorEvent errorEvent);

    void onMediaClickedEvent(MediaClickedEvent mediaClickedEvent);

    void onViewChangeEvent(ViewChangeEvent viewChangeEvent);

    void onVisibleItemsEvent(VisibleItemsEvent visibleItemsEvent);

    default void onUnknownEvent(Bundle bundle) {
    }
}
