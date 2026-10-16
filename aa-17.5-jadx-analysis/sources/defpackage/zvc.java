package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class zvc {
    public final zys a;
    private String b;
    private boolean c;
    private boolean d;
    private final gjt e;

    public zvc(gjt gjtVar, zys zysVar) {
        zkt.n(gjtVar, "contextManager");
        this.e = gjtVar;
        this.a = zysVar;
        this.b = null;
        this.c = false;
        this.d = false;
    }

    private static boolean d(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
        try {
            packageManager.getPackageInfo(str, 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting(str);
            if (applicationEnabledSetting == 1) {
                return true;
            }
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3 && applicationEnabledSetting != 4) {
                try {
                    return packageManager.getApplicationInfo(str, 0).enabled;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused2) {
            return false;
        }
    }

    public final void a(CameraPosition cameraPosition, zwv zwvVar, boolean z) {
        String str;
        LatLng position;
        c();
        if (z) {
            zys zysVar = this.a;
            if (zwvVar == null) {
                zysVar.b(aahu.INTENT_VIEW_MULTIPLE_MARKERS_NONE_SELECTED);
            } else {
                zysVar.b(aahu.INTENT_VIEW_MULTIPLE_MARKERS_ONE_SELECTED);
            }
        } else {
            zys zysVar2 = this.a;
            if (zwvVar != null) {
                zysVar2.b(aahu.INTENT_VIEW_ONE_MARKER);
            } else {
                zysVar2.b(aahu.INTENT_VIEW_NO_MARKERS);
            }
        }
        LatLng latLng = cameraPosition.target;
        String str2 = "geo:" + latLng.latitude + "," + latLng.longitude + "?z=";
        if (this.c) {
            str = str2 + cameraPosition.zoom;
        } else {
            str = str2 + ((int) Math.floor(cameraPosition.zoom));
        }
        if (zwvVar != null && (position = zwvVar.getPosition()) != null) {
            str = str + "&q=" + position.latitude + "," + position.longitude;
            String title = zwvVar.getTitle();
            if (!ysi.R(title) && this.d) {
                str = str + "(" + title + ")";
            }
        }
        b(str);
    }

    public final void b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        gjt gjtVar = this.e;
        Object obj = gjtVar.a;
        String str2 = this.b;
        if (str2 != null) {
            intent.setPackage(str2);
            ((Context) obj).startActivity(intent);
        } else {
            Toast.makeText((Context) obj, gjtVar.F(R.string.maps_NO_GMM), 0).show();
        }
    }

    public final void c() {
        PackageManager packageManager = ((Context) this.e.a).getPackageManager();
        if (d("com.google.android.apps.gmm", packageManager)) {
            this.b = "com.google.android.apps.gmm";
        } else if (d("com.google.android.apps.maps", packageManager)) {
            this.b = "com.google.android.apps.maps";
        } else {
            this.b = d("com.google.android.apps.mapslite", packageManager) ? "com.google.android.apps.mapslite" : null;
        }
        String str = this.b;
        if (str != null) {
            boolean z = true;
            try {
                int i = packageManager.getPackageInfo(str, 1).versionCode;
                this.c = i > 700000000;
                if (i <= 703000000) {
                    z = false;
                }
                this.d = z;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }
}
