package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.google.android.apps.auto.components.bugreport.BugreporterReceiver;
import com.google.android.apps.auto.components.settings.connectacar.ConnectACarActivity;
import com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class mky implements exm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mky(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.exm
    public final boolean b() {
        int i = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (obj) {
                    ogz ogzVar = ((mkz) obj).f;
                    kqg kqgVar = ((mkz) obj).d;
                    ogzVar.f(kqgVar.a, new mkw((Fragment) obj, i), new kpu(1));
                }
                return true;
            case 1:
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((mkz) obj2).d.i()) {
                        ogz ogzVar2 = ((mkz) obj2).f;
                        kqg kqgVar2 = ((mkz) obj2).d;
                        ogzVar2.f(kqgVar2.a, new mkw((Fragment) obj2, 2), new kpu(2));
                    } else {
                        ((mkz) obj2).p(R.string.settings_car_details_forget_not_attempted);
                    }
                }
                return true;
            case 2:
                yph yphVar = mlc.c;
                boolean zG = lgv.c().g();
                Object obj3 = this.a;
                if (zG) {
                    Intent intent = new Intent((Context) obj3, (Class<?>) ConnectACarActivity.class);
                    intent.putExtra("key_wireless", 1);
                    ((Activity) obj3).startActivity(intent);
                } else {
                    ((ype) ((ype) mlc.c.h()).ai((char) 5051)).u("Attempted to connect wireless car while lacking Bluetooth permissions");
                    lgv.c().e((Activity) obj3, lgv.c().a(mdj.h));
                }
                return true;
            case 3:
                new mlb().e(((mlg) this.a).getParentFragmentManager(), "connect_a_car_options_dialog");
                return true;
            case 4:
                ((xas) this.a).p(yzy.dO);
                return false;
            case 5:
                ((xas) this.a).p(yzy.dI);
                return false;
            case 6:
                Intent intent2 = new Intent("com.google.android.googlequicksearchbox.action.HOTWORD_DETECTION_SETTINGS").setPackage(RemoteApiConstants.NOW_PACKAGE);
                Fragment fragment = (Fragment) this.a;
                if (fragment.getActivity().getPackageManager().resolveActivity(intent2, 65536) == null) {
                    ((ype) ((ype) xbo.f.h()).ai((char) 10015)).u("Could not resolve hotword settings intent");
                    return false;
                }
                fragment.getActivity().startActivity(intent2);
                return true;
            case 7:
                ((xbo) this.a).A();
                return true;
            case 8:
                ((Fragment) this.a).getContext().sendBroadcast(BugreporterReceiver.c("ORIGIN_SETTINGS", null));
                return true;
            default:
                Object obj4 = this.a;
                ((xas) obj4).p(yzy.cO);
                final xbo xboVar = (xbo) obj4;
                xboVar.u(new xbn() { // from class: xba
                    @Override // defpackage.xbn
                    public final void a(Activity activity) {
                        Intent intent3 = new Intent(activity, (Class<?>) TroubleshooterActivity.class);
                        intent3.setPackage("com.google.android.projection.gearhead");
                        xboVar.j.b(intent3);
                    }
                });
                return true;
        }
    }
}
