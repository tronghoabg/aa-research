package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;
import defpackage.ob;
import defpackage.ox;
import defpackage.pc;
import defpackage.pg;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class CarAppPermissionActivity extends ob {
    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        super.onCreate(bundle);
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
            int i = applicationInfo.metaData != null ? applicationInfo.metaData.getInt("androidx.car.app.theme") : 0;
            Context contextCreateConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                contextCreateConfigurationContext.setTheme(i);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = contextCreateConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            StringBuilder sb = new StringBuilder("Unexpected intent action for CarAppPermissionActivity: ");
            sb.append(intent == null ? "null Intent" : intent.getAction());
            Log.e("CarApp", sb.toString());
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        final IOnRequestPermissionsListener iOnRequestPermissionsListenerAsInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (iOnRequestPermissionsListenerAsInterface == null || stringArray == null) {
            Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            finish();
            return;
        }
        pg pgVar = new pg();
        ox oxVar = new ox() { // from class: qf
            @Override // defpackage.ox
            public final void a(Object obj) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                IOnRequestPermissionsListener iOnRequestPermissionsListener = iOnRequestPermissionsListenerAsInterface;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Boolean bool = (Boolean) entry.getValue();
                    if (bool == null || !bool.booleanValue()) {
                        arrayList2.add((String) entry.getKey());
                    } else {
                        arrayList.add((String) entry.getKey());
                    }
                }
                try {
                    iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
                } catch (RemoteException e) {
                    Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
                }
                this.a.finish();
            }
        };
        pc pcVar = this.j;
        pcVar.getClass();
        pcVar.b("activity_rq#" + this.i.getAndIncrement(), this, pgVar, oxVar).b(stringArray);
    }
}
