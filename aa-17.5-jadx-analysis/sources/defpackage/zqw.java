package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* loaded from: classes3.dex */
public final class zqw extends zsj implements zra {
    public static final String a = "zqw";
    public final String b;
    public final String c;
    private final Context m;
    private boolean n;

    public zqw(Context context, String str, String str2) {
        super(context, zrz.d("atsc"));
        this.n = false;
        this.m = context;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.zsj
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.auth.IApiTokenService");
        return iInterfaceQueryLocalInterface instanceof suc ? (suc) iInterfaceQueryLocalInterface : new suc(iBinder);
    }

    @Override // defpackage.zra
    public final void b(zqz zqzVar) {
        zsi zsiVar = new zsi(new sxp(this, zqzVar, 3));
        ServiceConnection serviceConnection = this.j;
        synchronized (serviceConnection) {
            int i = this.l;
            if (i != 1) {
                if (i == 2) {
                    this.g.add(zsiVar);
                    return;
                }
                if (i == 3) {
                    this.f.execute(zsiVar);
                    return;
                }
                if (i != 4) {
                    throw new IllegalStateException(a.bp(i, "Unknown state: "));
                }
                String str = zsj.d;
                if (zrn.e(str, 3)) {
                    Log.d(str, "Request ignored after failure to bind to the service " + this.i);
                }
                return;
            }
            Intent intent = new Intent();
            String str2 = this.h;
            String str3 = this.i;
            Intent className = intent.setClassName(str2, str3);
            synchronized (serviceConnection) {
                zkt.g(this.l == 1, "Binding has already been attempted");
                this.l = 2;
                boolean zBindService = this.e.bindService(className, serviceConnection, 1);
                if (!zBindService) {
                    String str4 = zsj.d;
                    if (zrn.e(str4, 6)) {
                        Log.e(str4, String.format("Service \"%s\" in application \"%s\" cannot be found or bound to.", str3, str2));
                    }
                    this.l = 4;
                }
                if (zBindService) {
                    this.g.add(zsiVar);
                }
            }
        }
    }

    public final void c() throws PackageManager.NameNotFoundException {
        String str;
        if (this.n) {
            return;
        }
        zrn.b("Authorization failure.  Please see https://developers.google.com/maps/documentation/android-sdk/start for how to correctly set up the map.");
        Context context = this.m;
        String str2 = this.c;
        String strA = zrg.a(context, str2);
        if (strA == null) {
            str = null;
        } else {
            String strAs = woy.as(strA);
            int length = strAs.length();
            String strConcat = "";
            for (int i = 0; i < length; i++) {
                strConcat = strConcat + strAs.charAt(i);
                if (i > 0 && i % 2 == 1 && i < length - 1) {
                    strConcat = strConcat.concat(":");
                }
            }
            str = strConcat;
        }
        zrn.b("In the Google Developer Console (https://console.developers.google.com)\nEnsure that the \"Maps SDK for Android\" is enabled.\nEnsure that the following Android Key exists:\n\tAPI Key: " + this.b + "\n\tAndroid Application (<cert_fingerprint>;<package_name>): " + str + ";" + str2);
        this.n = true;
    }
}
