package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class ofz extends BroadcastReceiver implements lhg {
    public static final ofy a = new ofy();
    public static final afgl b = new ofw(mki.b, 2);
    private static final yph c = new yph(yrc.c.a("GH.CallActionRec"));
    private final Context d;

    public ofz(Context context) {
        this.d = context;
    }

    public static final ofz a() {
        Context context = mki.a.c;
        context.getClass();
        return new ofz(context);
    }

    @Override // defpackage.lhg
    public final void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gearhead.ACTION_HANDLE_PROJECTION_NOTIFICATION_INTENT");
        dup.e(this.d, this, intentFilter, null, 2);
    }

    @Override // defpackage.lhg
    public final void d() {
        this.d.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName componentNameA;
        if (intent == null) {
            ((ype) c.h()).u("Received a call notification action with no intent");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("action")) {
            ((ype) ofx.c.h()).y("Ignoring call intent with no action: %s", intent);
            return;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null || !extras2.containsKey("call_id")) {
            ((ype) ofx.c.h()).y("Ignoring call intent with no call id: %s", intent);
            return;
        }
        Bundle extras3 = intent.getExtras();
        Serializable serializable = extras3 != null ? extras3.getSerializable("action") : null;
        oft oftVar = serializable instanceof oft ? (oft) serializable : null;
        if (oftVar == null) {
            ((ype) ofx.c.h()).y("Ignoring call intent with invalid action: %s", intent);
            return;
        }
        Bundle extras4 = intent.getExtras();
        if (extras4 == null) {
            ((ype) ofx.c.h()).y("Ignoring call intent with invalid call id: %s", intent);
            return;
        }
        int i = extras4.getInt("call_id");
        int iOrdinal = oftVar.ordinal();
        if (iOrdinal == 0) {
            ComponentName componentName = mkn.b;
            componentName.getClass();
            CarCall carCallE = odn.a().e(i);
            odp odpVarA = mcd.A();
            if (carCallE != null && odpVarA.t(carCallE) && (componentNameA = odpVarA.a(mki.a.c, odpVarA.b(carCallE).getPackageName())) != null) {
                componentName = componentNameA;
            }
            mpe mpeVarA = mpe.a();
            Intent intent2 = new Intent();
            intent2.setComponent(componentName);
            mpeVarA.i(intent2);
            ofu.b(i, yzy.aa);
            return;
        }
        if (iOrdinal == 1) {
            ebf.A().u(i, true);
            ofu.b(i, yzy.J);
            return;
        }
        if (iOrdinal == 2) {
            ebf.A().u(i, false);
            ofu.b(i, yzy.J);
            return;
        }
        if (iOrdinal == 3) {
            ebf.A().y(i);
            ofu.b(i, yzy.I);
        } else if (iOrdinal == 4) {
            ebf.A().m(i);
            ofu.b(i, yzy.E);
        } else {
            if (iOrdinal != 5) {
                throw new aezs();
            }
            ebf.A().y(i);
            ofu.b(i, yzy.G);
        }
    }
}
