package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gearhead.service.SharedService;

/* loaded from: classes.dex */
public final class qjt implements mkg {
    public static final yph a = yph.c("GH.SharedServiceConnect");
    public boolean b = false;
    public final mke c;
    public mka d;
    private ServiceConnection e;
    private final Context f;

    public qjt(Context context, mke mkeVar) {
        this.f = context;
        this.c = mkeVar;
    }

    @Override // defpackage.mkg
    public final void a() {
        woy.aa(!this.b, "Cannot be bound already");
        Intent component = new Intent().setComponent(new ComponentName("com.google.android.projection.gearhead", SharedService.class.getCanonicalName()));
        sae saeVar = new sae(this, 1);
        this.e = saeVar;
        this.b = this.f.bindService(component, saeVar, 65);
        ((ype) a.l().ai((char) 7418)).u("Shared service started.");
    }

    @Override // defpackage.mkg
    public final void b() {
        ((ype) a.l().ai((char) 7419)).y("unbind() [bound:%b]", Boolean.valueOf(this.b));
        if (this.b) {
            this.f.unbindService(this.e);
            this.b = false;
            this.e = null;
        }
        this.d = null;
    }
}
