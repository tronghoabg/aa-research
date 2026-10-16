package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.widget.EditText;
import com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity;
import com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity;
import com.google.android.gms.car.CarInfo;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class jmn implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jmn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, mdn, mdp] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, mdp] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Resources.NotFoundException {
        int i2 = this.c;
        if (i2 == 0) {
            ((ype) ((ype) jmo.g.h()).ai((char) 2357)).u("onClick: exit / ask later");
            ((jms) this.a).j(yzy.bK);
            ((PhonescreenFrxActivity) this.b).D();
            return;
        }
        if (i2 == 1) {
            ((ype) ((ype) jmo.g.h()).ai((char) 2356)).u("onClick: exit / never ask again");
            ((jms) this.a).j(yzy.bI);
            PhonescreenFrxActivity phonescreenFrxActivity = (PhonescreenFrxActivity) this.b;
            phonescreenFrxActivity.B(false);
            phonescreenFrxActivity.D();
            return;
        }
        if (i2 == 2) {
            ?? r5 = this.b;
            WirelessPreflightActivity.D(r5.a(), yzy.cd);
            dialogInterface.dismiss();
            Object obj = this.a;
            WirelessPreflightActivity wirelessPreflightActivity = (WirelessPreflightActivity) obj;
            wirelessPreflightActivity.u = true;
            wirelessPreflightActivity.s.a(r5, new lez(wirelessPreflightActivity), obj);
            r5.c((Context) obj);
            return;
        }
        if (i2 == 3) {
            WirelessPreflightActivity.D(this.b.a(), yzy.cc);
            dialogInterface.dismiss();
            ((lex) this.a).E();
            return;
        }
        if (i2 == 4) {
            int i3 = PreflightPhonePermissionsActivity.p;
            ((mko) this.a).b("key_settings_messaging_allow_notification_data_sharing_agsa", true);
            ((SwitchCompat) this.b).setChecked(true);
            dialogInterface.dismiss();
            return;
        }
        String string = ((EditText) ((AlertDialog) dialogInterface).findViewById(R.id.name_text)).getText().toString();
        if (string.isEmpty()) {
            return;
        }
        Object obj2 = this.b;
        xap xapVar = (xap) obj2;
        CarInfo carInfo = (CarInfo) this.a;
        xapVar.b.j(carInfo.d, carInfo.a, string);
        xapVar.a(carInfo.d);
    }

    public jmn(xap xapVar, CarInfo carInfo, int i) {
        this.c = i;
        this.a = carInfo;
        this.b = xapVar;
    }
}
