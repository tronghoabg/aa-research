package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mld implements mkt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mld(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [eqa, java.lang.Object] */
    @Override // defpackage.mkt
    public final void a(Activity activity) {
        int i = this.b;
        if (i == 0) {
            oqf oqfVar = (oqf) this.a;
            oqfVar.a();
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.getScanMode() == 23 || oqm.b(defaultAdapter, 23)) {
                return;
            }
            if (oqfVar.b == null) {
                oqfVar.b = new oqf(null);
            }
            activity.startActivity(new Intent().setAction("android.bluetooth.adapter.action.REQUEST_DISCOVERABLE").putExtra("android.bluetooth.adapter.extra.DISCOVERABLE_DURATION", 120000L).addFlags(268435456));
            return;
        }
        int i2 = 2;
        int i3 = 1;
        if (i == 1) {
            Preference preferenceK = ((mku) this.a).k("key_settings_connection_launch_wireless");
            preferenceK.n(String.format(activity.getString(R.string.settings_connection_usb_launch_wireless_summary), 2021));
            preferenceK.o = new mky(activity, i2);
            return;
        }
        if (i == 2) {
            oqt oqtVar = (oqt) mki.a.i(oqt.class);
            ?? r5 = this.a;
            oqtVar.fE(r5, new lsh(r5, 17));
            return;
        }
        Object obj = this.a;
        synchronized (((mlg) obj).c) {
            if (((mlg) obj).d != null) {
                return;
            }
            ((mku) obj).m(yzy.tr);
            em emVar = new em(activity);
            emVar.n(R.string.settings_connection_bluetooth_dialog_title);
            emVar.g(R.string.settings_connection_bluetooth_dialog_body);
            emVar.i(R.string.settings_connection_bluetooth_dialog_button_cancel, new mhb(obj, 3));
            emVar.k(R.string.settings_connection_bluetooth_dialog_button_accept, new mhb(obj, 4));
            sdm sdmVar = new sdm((Fragment) obj, i3);
            ej ejVar = emVar.a;
            ejVar.l = sdmVar;
            final mlg mlgVar = (mlg) obj;
            ejVar.m = new DialogInterface.OnDismissListener() { // from class: mle
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    mlg mlgVar2 = mlgVar;
                    synchronized (mlgVar2.c) {
                        mlgVar2.d = null;
                    }
                }
            };
            en enVarB = emVar.b();
            enVarB.show();
            ((mlg) obj).d = enVarB;
        }
    }
}
