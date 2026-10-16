package androidx.car.app.connection;

import android.content.AsyncQueryHandler;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.LiveData;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
final class CarConnectionTypeLiveData extends LiveData<Integer> {
    static final String CAR_CONNECTION_AUTHORITY = "androidx.car.app.connection";
    private static final Uri PROJECTION_HOST_URI = new Uri.Builder().scheme("content").authority(CAR_CONNECTION_AUTHORITY).build();
    private static final int QUERY_TOKEN = 42;
    private final CarConnectionBroadcastReceiver mBroadcastReceiver = new CarConnectionBroadcastReceiver();
    private final Context mContext;
    private final AsyncQueryHandler mQueryHandler;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class Api33Impl {
        private Api33Impl() {
        }

        public static void registerExportedReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public class CarConnectionBroadcastReceiver extends BroadcastReceiver {
        public CarConnectionBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CarConnectionTypeLiveData.this.queryForState();
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public class CarConnectionQueryHandler extends AsyncQueryHandler {
        public CarConnectionQueryHandler(ContentResolver contentResolver) {
            super(contentResolver);
        }

        @Override // android.content.AsyncQueryHandler
        public void onQueryComplete(int i, Object obj, Cursor cursor) {
            if (cursor == null) {
                CarConnectionTypeLiveData.this.postValue(0);
                return;
            }
            int columnIndex = cursor.getColumnIndex(CarConnection.CAR_CONNECTION_STATE);
            if (columnIndex < 0) {
                CarConnectionTypeLiveData.this.postValue(0);
            } else if (cursor.moveToNext()) {
                CarConnectionTypeLiveData.this.postValue(Integer.valueOf(cursor.getInt(columnIndex)));
            } else {
                CarConnectionTypeLiveData.this.postValue(0);
            }
        }
    }

    public CarConnectionTypeLiveData(Context context) {
        this.mContext = context;
        this.mQueryHandler = new CarConnectionQueryHandler(context.getContentResolver());
    }

    public void onActive() {
        IntentFilter intentFilter = new IntentFilter(CarConnection.ACTION_CAR_CONNECTION_UPDATED);
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.registerExportedReceiver(this.mContext, this.mBroadcastReceiver, intentFilter);
        } else {
            this.mContext.registerReceiver(this.mBroadcastReceiver, intentFilter);
        }
        queryForState();
    }

    public void onInactive() {
        this.mContext.unregisterReceiver(this.mBroadcastReceiver);
        this.mQueryHandler.cancelOperation(42);
    }

    public void queryForState() {
        this.mQueryHandler.startQuery(42, null, PROJECTION_HOST_URI, new String[]{CarConnection.CAR_CONNECTION_STATE}, null, null, null);
    }
}
