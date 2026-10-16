package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.car.app.IOnRequestPermissionsListener;
import defpackage.p0;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class CarAppPermissionActivity extends ComponentActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermissions$0(IOnRequestPermissionsListener iOnRequestPermissionsListener, Map map) {
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
        } catch (RemoteException unused) {
        }
        finish();
    }

    private void maybeSetCustomBackground() {
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            int i = bundle != null ? bundle.getInt("androidx.car.app.theme") : 0;
            Context contextCreateConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                contextCreateConfigurationContext.setTheme(i);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier == 0) {
                return;
            }
            int resourceId = contextCreateConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
            if (resourceId == 0) {
                return;
            }
            setContentView(resourceId);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private void processInternal(Intent intent) {
        if (intent != null && "androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            requestPermissions(intent);
            return;
        }
        if (intent != null) {
            intent.getAction();
        }
        finish();
    }

    private void requestPermissions(Intent intent) {
        Bundle extras = intent.getExtras();
        IOnRequestPermissionsListener iOnRequestPermissionsListenerAsInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (iOnRequestPermissionsListenerAsInterface == null || stringArray == null) {
            finish();
        } else {
            registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new p0(this, iOnRequestPermissionsListenerAsInterface)).launch(stringArray);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        maybeSetCustomBackground();
        processInternal(getIntent());
    }
}
