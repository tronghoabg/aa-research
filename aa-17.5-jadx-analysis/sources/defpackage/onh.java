package defpackage;

import android.app.AlertDialog;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.apps.auto.components.ui.telecom.UnCallView;
import com.google.android.apps.auto.wireless.deeplink.DeepLinkResolver;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView;
import com.google.android.gms.carsetup.CarErrorDisplayActivityImpl;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class onh implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ onh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((UnCallView) this.a).m.C();
                break;
            case 1:
                ((UnCallView) this.a).m.E();
                break;
            case 2:
                ((View) this.a).callOnClick();
                break;
            case 3:
                ((DeepLinkResolver) this.a).C();
                break;
            case 4:
                ((DeepLinkResolver) this.a).C();
                break;
            case 5:
                ((DeepLinkResolver) this.a).finish();
                break;
            case 6:
                ((qgg) this.a).d();
                break;
            case 7:
                qgc qgcVar = ((qgm) this.a).d;
                if (!qgcVar.c()) {
                    qgcVar.a();
                    break;
                }
                break;
            case 8:
                ((qgm) this.a).g();
                break;
            case 9:
                ((qgm) this.a).r(true);
                break;
            case 10:
                qgc qgcVar2 = ((qgy) this.a).d;
                if (qgcVar2.c()) {
                    qgcVar2.b();
                    break;
                }
                break;
            case 11:
                ((StatusBarView) this.a).d.performClick();
                break;
            case 12:
                ((StatusBarView) this.a).f.performClick();
                break;
            case 13:
                ((BottomSheetView) this.a).a.U(5);
                break;
            case 14:
                CarErrorDisplayActivityImpl carErrorDisplayActivityImpl = (CarErrorDisplayActivityImpl) this.a;
                if (!carErrorDisplayActivityImpl.isFinishing()) {
                    carErrorDisplayActivityImpl.finish();
                    break;
                }
                break;
            case 15:
                sei seiVar = (sei) this.a;
                seiVar.c(yzy.bH);
                ((seb) seiVar.b().l).m(true);
                seiVar.b().f("EVENT_CAR_CONNECTION_ALLOWED", null);
                break;
            case 16:
                Object obj = this.a;
                Fragment fragment = (Fragment) obj;
                new AlertDialog.Builder(fragment.getContext(), R.style.CakewalkPhoneScreenRejectDialog).setTitle(fragment.getString(R.string.car_setup_exit_dialog_title)).setNegativeButton(fragment.getString(R.string.common_never), new mhb(obj, 6)).setPositiveButton(fragment.getString(R.string.bt_auth_exit_dialog_later), new mhb(obj, 7)).create().show();
                break;
            case 17:
                sei seiVar2 = (sei) this.a;
                seiVar2.c(yzy.bL);
                seiVar2.b().f("EVENT_USER_EXIT", null);
                break;
            case 18:
                sei seiVar3 = (sei) this.a;
                seiVar3.c(yzy.bL);
                sde.a.g().ai(8788).u("Critical error: user aborted apps installation");
                seiVar3.b().f("EVENT_APPLICATION_INSTALLATION_CANCELLED", null);
                break;
            case 19:
                sei seiVar4 = (sei) this.a;
                seiVar4.c(yzy.bH);
                seiVar4.b().f("EVENT_APPLICATION_INSTALLATION_ALLOWED", null);
                break;
            default:
                sei seiVar5 = (sei) this.a;
                seiVar5.b().f("EVENT_USER_EXIT", null);
                seiVar5.c(yzy.bL);
                break;
        }
    }

    public onh(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
