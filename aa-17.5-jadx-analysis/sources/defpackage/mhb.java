package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import androidx.preference.Preference;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment;
import com.google.android.projection.gearhead.companion.settings.Material3VersionPreference;
import j$.util.List;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class mhb implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mhb(exi exiVar, int i) {
        this.b = i;
        this.a = exiVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                PreflightPhonePermissionsActivity preflightPhonePermissionsActivity = (PreflightPhonePermissionsActivity) this.a;
                Uri uriFromParts = Uri.fromParts("package", preflightPhonePermissionsActivity.getPackageName(), null);
                intent.setFlags(1073741824);
                intent.setData(uriFromParts);
                preflightPhonePermissionsActivity.startActivity(intent);
                ((mfp) luk.b().a()).b.a(mgl.d);
                mfq mfqVar = preflightPhonePermissionsActivity.m;
                mfqVar.getClass();
                mfqVar.a(yzy.bL);
                preflightPhonePermissionsActivity.finish();
                break;
            case 1:
                Object obj = this.a;
                ((exi) obj).g = i;
                ((exp) obj).k = -1;
                dialogInterface.dismiss();
                break;
            case 2:
                dialogInterface.dismiss();
                mfq mfqVar2 = ((PreflightPhonePermissionsActivity) this.a).m;
                mfqVar2.getClass();
                mfqVar2.a(yzy.bI);
                break;
            case 3:
                mku mkuVar = (mku) this.a;
                mkuVar.m(yzy.tu);
                mkuVar.o(new mlf());
                break;
            case 4:
                ((mku) this.a).m(yzy.tv);
                BluetoothAdapter.getDefaultAdapter().enable();
                break;
            case 5:
                ((pgt) this.a).b.startActivity(new Intent("android.net.wifi.PICK_WIFI_NETWORK").setFlags(268435456));
                break;
            case 6:
                sei seiVar = (sei) this.a;
                seiVar.c(yzy.bI);
                sdc.a.g().ai(8786).u("Critical error: user rejected car connection permanently");
                ((seb) seiVar.b().l).m(false);
                seiVar.b().f("EVENT_CAR_CONNECTION_DISALLOWED", null);
                break;
            case 7:
                sei seiVar2 = (sei) this.a;
                seiVar2.c(yzy.bK);
                sdc.a.g().ai(8787).u("Critical error: user aborted car connection");
                seiVar2.b().f("EVENT_CAR_CONNECTION_CANCELLED", null);
                break;
            case 8:
                sei seiVar3 = (sei) this.a;
                seiVar3.c(yzy.bL);
                seiVar3.b().f("EVENT_INTRO_DECLINED", null);
                break;
            case 9:
                ((sfw) this.a).c().h(9);
                break;
            case 10:
                sfh sfhVar = (sfh) this.a;
                sfhVar.b();
                sfhVar.a();
                break;
            case 11:
                ((xbo) ((xaw) this.a).a).t();
                mpl.f().a().b("key_settings_messaging_allow_notification_data_sharing_agsa", false);
                break;
            case 12:
                try {
                    ((zeu) ozf.b().g()).s();
                } catch (InterruptedException | ExecutionException e) {
                    ((ype) ((ype) ((ype) Material3ManageCarsFragment.f.h()).p(e)).ai((char) 10040)).u("Failed to clear WifiDataStore");
                }
                Object obj2 = this.a;
                Material3ManageCarsFragment material3ManageCarsFragment = (Material3ManageCarsFragment) obj2;
                material3ManageCarsFragment.g.h();
                Fragment fragment = (Fragment) obj2;
                bc activity = fragment.getActivity();
                yph yphVar = xco.a;
                roc.bp(activity).edit().clear().apply();
                material3ManageCarsFragment.r();
                rxf.i(fragment.getActivity().getApplicationContext(), mki.a.d, yxo.REJECTED_CARS);
                break;
            case 13:
                Object obj3 = this.a;
                Material3VersionPreference material3VersionPreference = (Material3VersionPreference) obj3;
                material3VersionPreference.d = true;
                material3VersionPreference.e.setText(((Preference) obj3).j.getString(R.string.developer_settings_enabled));
                material3VersionPreference.e.show();
                material3VersionPreference.g.invalidateOptionsMenu();
                kmu.b().c("developer_settings_enabled", true);
                break;
            case 14:
                ((Material3VersionPreference) this.a).c = 0;
                break;
            case 15:
                Object obj4 = this.a;
                Material3VersionPreference material3VersionPreference2 = (Material3VersionPreference) obj4;
                material3VersionPreference2.f.set(false);
                material3VersionPreference2.d = true;
                material3VersionPreference2.e.setText(((Preference) obj4).j.getString(R.string.developer_settings_enabled));
                material3VersionPreference2.e.show();
                material3VersionPreference2.g.invalidateOptionsMenu();
                kmu.b().c("developer_settings_enabled", true);
                break;
            case 16:
                Material3VersionPreference material3VersionPreference3 = (Material3VersionPreference) this.a;
                material3VersionPreference3.f.set(false);
                material3VersionPreference3.c = 0;
                break;
            default:
                yph yphVar2 = xbq.s;
                boolean z = i == 1;
                ((ype) yphVar2.l().ai((char) 10044)).y("updateOrderingSelection useCustomizedOrder=%b", Boolean.valueOf(z));
                if (z == nrz.e().i()) {
                    ((ype) yphVar2.l().ai((char) 10045)).u("no change in preference");
                } else {
                    Object obj5 = this.a;
                    nrz.e().f(z);
                    xbq xbqVar = (xbq) obj5;
                    xbqVar.E();
                    xai.t(xbqVar.a);
                    Comparator comparator = xak.a;
                    xai xaiVar = xbqVar.u;
                    List.EL.sort(xaiVar.f, comparator);
                    xaiVar.v();
                    xaiVar.j(xai.c(), (r0.size() - 1) + xai.c());
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_APP_CUSTOMIZATION, z ? yzy.pP : yzy.pR).l());
                }
                dialogInterface.dismiss();
                break;
        }
    }

    public /* synthetic */ mhb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
