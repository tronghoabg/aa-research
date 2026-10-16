package com.google.android.gms.ads;

import D6.C0364c;
import D6.C0388o;
import D6.C0392q;
import H6.l;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbzi;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public zzbzi f26287a;

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzm(i5, i10, intent);
            }
        } catch (Exception e7) {
            l.i("#007 Could not call remote method.", e7);
        }
        super.onActivityResult(i5, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                if (!zzbziVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
        super.onBackPressed();
        try {
            zzbzi zzbziVar2 = this.f26287a;
            if (zzbziVar2 != null) {
                zzbziVar2.zze();
            }
        } catch (RemoteException e10) {
            l.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzn(new BinderC3877b(configuration));
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.a("AdActivity onCreate");
        C0388o c0388o = C0392q.f2477g.f2479b;
        c0388o.getClass();
        C0364c c0364c = new C0364c(c0388o, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            l.c("useClientJar flag not found in activity intent extras.");
        }
        zzbzi zzbziVar = (zzbzi) c0364c.d(this, booleanExtra);
        this.f26287a = zzbziVar;
        if (zzbziVar == null) {
            l.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbziVar.zzh(bundle);
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        l.a("AdActivity onDestroy");
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzq();
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        l.a("AdActivity onPause");
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzl();
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzH(i5, strArr, iArr);
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        l.a("AdActivity onRestart");
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzi();
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        l.a("AdActivity onResume");
        super.onResume();
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzk();
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzo(bundle);
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        l.a("AdActivity onStart");
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzj();
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        l.a("AdActivity onStop");
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzp();
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzi zzbziVar = this.f26287a;
            if (zzbziVar != null) {
                zzbziVar.zzf();
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i5) {
        super.setContentView(i5);
        zzbzi zzbziVar = this.f26287a;
        if (zzbziVar != null) {
            try {
                zzbziVar.zzs();
            } catch (RemoteException e7) {
                l.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzbzi zzbziVar = this.f26287a;
        if (zzbziVar != null) {
            try {
                zzbziVar.zzs();
            } catch (RemoteException e7) {
                l.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbzi zzbziVar = this.f26287a;
        if (zzbziVar != null) {
            try {
                zzbziVar.zzs();
            } catch (RemoteException e7) {
                l.i("#007 Could not call remote method.", e7);
            }
        }
    }
}
