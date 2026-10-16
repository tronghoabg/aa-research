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
import android.util.Log;
import androidx.car.app.utils.LogTags;
import androidx.lifecycle.LiveData;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CarConnectionTypeLiveData extends LiveData<Integer> {
    static final String CAR_CONNECTION_AUTHORITY = "androidx.car.app.connection";
    private static final Uri PROJECTION_HOST_URI = new Uri.Builder().scheme("content").authority(CAR_CONNECTION_AUTHORITY).build();
    private static final int QUERY_TOKEN = 42;
    private final CarConnectionBroadcastReceiver mBroadcastReceiver = new CarConnectionBroadcastReceiver();
    private final Context mContext;
    private final AsyncQueryHandler mQueryHandler;

    /* compiled from: WazeSource */
    class Api33Impl {
        private Api33Impl() {
        }

        static void registerExportedReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }

    /* compiled from: WazeSource */
    class CarConnectionBroadcastReceiver extends BroadcastReceiver {
        CarConnectionBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CarConnectionTypeLiveData.this.queryForState();
        }
    }

    /* compiled from: WazeSource */
    class CarConnectionQueryHandler extends AsyncQueryHandler {
        CarConnectionQueryHandler(ContentResolver contentResolver) {
            super(contentResolver);
        }

        @Override // android.content.AsyncQueryHandler
        protected void onQueryComplete(int i2, Object obj, Cursor cursor) {
            if (cursor == null) {
                Log.w(LogTags.TAG_CONNECTION_TO_CAR, "Null response from content provider when checking connection to the car, treating as disconnected");
                CarConnectionTypeLiveData.this.postValue(0);
                return;
            }
            int columnIndex = cursor.getColumnIndex(CarConnection.CAR_CONNECTION_STATE);
            if (columnIndex < 0) {
                Log.e(LogTags.TAG_CONNECTION_TO_CAR, "Connection to car response is missing the connection type, treating as disconnected");
                CarConnectionTypeLiveData.this.postValue(0);
            } else if (cursor.moveToNext()) {
                CarConnectionTypeLiveData.this.postValue(Integer.valueOf(cursor.getInt(columnIndex)));
            } else {
                Log.e(LogTags.TAG_CONNECTION_TO_CAR, "Connection to car response is empty, treating as disconnected");
                CarConnectionTypeLiveData.this.postValue(0);
            }
        }
    }

    CarConnectionTypeLiveData(Context context) {
        this.mContext = context;
        this.mQueryHandler = new CarConnectionQueryHandler(context.getContentResolver());
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        IntentFilter intentFilter = new IntentFilter(CarConnection.ACTION_CAR_CONNECTION_UPDATED);
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.mContext;
        if (i2 >= 33) {
            Api33Impl.registerExportedReceiver(context, this.mBroadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(this.mBroadcastReceiver, intentFilter);
        }
        queryForState();
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        this.mContext.unregisterReceiver(this.mBroadcastReceiver);
        this.mQueryHandler.cancelOperation(42);
    }

    void queryForState() {
        this.mQueryHandler.startQuery(42, null, PROJECTION_HOST_URI, new String[]{CarConnection.CAR_CONNECTION_STATE}, null, null, null);
    }
}
