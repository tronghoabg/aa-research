package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class pbu implements jle {
    public static final ygr a = yrm.o(yze.PROTOCOL_BYEBYE_REQUESTED_BY_CAR, yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yze.PREFLIGHT_FAILED, yze.SOCKET_VPN_CONNECTION_ERROR, yze.USB_ACCESSORY_ERROR, yze.USB_CHARGE_ONLY, yze.NO_MANAGE_USB_PERMISSION_ERROR, yze.BLUETOOTH_FAILURE);
    public final boolean b;
    public final Context c;
    public long d;
    public final pbw e;
    public jla f;
    public final Handler g;
    public jlf i;
    public Bundle j;
    public ComponentName k;
    public boolean l;
    public final List n;
    public final Supplier o;
    public final pbs p;
    public final boolean q;
    public final ajdr r;
    public final Runnable h = new oyy(this, 16);
    public final AtomicBoolean m = new AtomicBoolean(false);

    public pbu(boolean z, ajdr ajdrVar, Context context, Looper looper, pbw pbwVar, Supplier supplier, List list, pbs pbsVar) {
        this.q = Build.VERSION.SDK_INT >= 30;
        this.b = z;
        this.r = ajdrVar;
        this.c = context;
        this.g = new Handler(looper);
        this.e = pbwVar;
        this.n = list;
        this.o = supplier;
        this.p = pbsVar;
    }

    @Override // defpackage.jle
    public final void a(ComponentName componentName, boolean z) {
        yph yphVar = pbx.a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(6292);
        String strFlattenToString = componentName == null ? "null" : componentName.flattenToString();
        zjc zjcVar = zjc.a;
        ypeVar.M("Interested in handoff %s %s", new zjd(zjcVar, strFlattenToString), new zjd(zjcVar, Boolean.toString(z)));
        if (this.b) {
            ((kny) this.r.e).d(yxi.WIRELESS_WIFI_STARTUP_MANAGER_ON_INTERESTED_IN_HANDOFF);
        } else {
            ols.M(this.c, yxi.STARTUP_MANAGER_ON_INTERESTED_IN_HANDOFF);
        }
        if (z) {
            componentName.getClass();
            this.k = componentName;
            ((ype) ((ype) yphVar.f()).ai((char) 6285)).u("Interested in handoff - start handoff");
            this.g.post(new oyy(this, 15));
            return;
        }
        jlf jlfVar = this.i;
        if (componentName != null) {
            jlfVar.a();
        } else {
            jlfVar.c();
            throw new IllegalStateException("No component accepted the handoff.");
        }
    }
}
