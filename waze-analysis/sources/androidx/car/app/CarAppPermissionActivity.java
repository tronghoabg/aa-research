package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.utils.LogTags;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CarAppPermissionActivity extends ComponentActivity {
    private void maybeSetCustomBackground() throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
            int i2 = applicationInfo.metaData != null ? applicationInfo.metaData.getInt("androidx.car.app.theme") : 0;
            Context contextCreateConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i2 != 0) {
                contextCreateConfigurationContext.setTheme(i2);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier == 0) {
                return;
            }
            int resourceId = contextCreateConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
            if (resourceId != 0) {
                setContentView(resourceId);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private void processInternal(Intent intent) {
        if (intent != null && "androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            requestPermissions(intent);
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected intent action for CarAppPermissionActivity: ");
        sb.append(intent == null ? "null Intent" : intent.getAction());
        Log.e(LogTags.TAG, sb.toString());
        finish();
    }

    private void requestPermissions(Intent intent) {
        Bundle extras = intent.getExtras();
        final IOnRequestPermissionsListener iOnRequestPermissionsListenerAsInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (iOnRequestPermissionsListenerAsInterface != null && stringArray != null) {
            registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: androidx.car.app.CarAppPermissionActivity$$ExternalSyntheticLambda0
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    this.f$0.m1577xe0c2baee(iOnRequestPermissionsListenerAsInterface, (Map) obj);
                }
            }).launch(stringArray);
        } else {
            Log.e(LogTags.TAG, "Intent to request permissions is missing the callback binder");
            finish();
        }
    }

    /* renamed from: lambda$requestPermissions$0$androidx-car-app-CarAppPermissionActivity, reason: not valid java name */
    /* synthetic */ void m1577xe0c2baee(IOnRequestPermissionsListener iOnRequestPermissionsListener, Map map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool == null || !bool.booleanValue()) {
                arrayList2.add((String) entry.getKey());
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        } catch (RemoteException e2) {
            Log.e(LogTags.TAG, "CarAppService dead when accepting/rejecting permissions", e2);
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        super.onCreate(bundle);
        maybeSetCustomBackground();
        processInternal(getIntent());
    }
}
