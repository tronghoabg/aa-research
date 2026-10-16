package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SupportSQLiteCompat {

    /* compiled from: WazeSource */
    public final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        public static final void cancel(CancellationSignal cancellationSignal) {
            x.f(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }
    }

    /* compiled from: WazeSource */
    public final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        public static final Uri getNotificationUri(Cursor cursor) {
            x.f(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            x.e(notificationUri, "getNotificationUri(...)");
            return notificationUri;
        }

        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            x.f(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* compiled from: WazeSource */
    public final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final List<Uri> getNotificationUris(Cursor cursor) {
            x.f(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            x.c(notificationUris);
            return notificationUris;
        }

        public static final void setNotificationUris(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
            x.f(cursor, "cursor");
            x.f(contentResolver, "cr");
            x.f(list, "uris");
            cursor.setNotificationUris(contentResolver, list);
        }
    }

    private SupportSQLiteCompat() {
    }
}
