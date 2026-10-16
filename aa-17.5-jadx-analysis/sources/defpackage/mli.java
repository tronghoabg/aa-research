package defpackage;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.ErrorPageFragment;
import com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity;
import com.google.android.apps.auto.components.system.dashboard.design.DashboardCardView;
import com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.projection.gearhead.R;
import java.util.UUID;

/* loaded from: classes2.dex */
public final /* synthetic */ class mli implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mli(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 3;
        CoolwalkButton coolwalkButton = null;
        int i2 = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                mlk mlkVar = (mlk) obj;
                final String strTrim = mlkVar.h.getText().toString().trim();
                if (!strTrim.isEmpty()) {
                    Fragment fragment = (Fragment) obj;
                    ((mlj) tec.b(fragment, mlj.class)).t().f(mlkVar.g.a, new mkw(fragment, i), new kpw() { // from class: kps
                        @Override // defpackage.kpw
                        public final boolean a(jlo jloVar, CarInfoInternal carInfoInternal) {
                            CarInfo carInfo = carInfoInternal.a;
                            jloVar.j(carInfo.d, carInfo.a, strTrim);
                            return true;
                        }
                    });
                    break;
                } else {
                    mlkVar.h(false);
                    break;
                }
            case 1:
                Object obj2 = this.a;
                ((ao) obj2).c();
                ((Fragment) obj2).startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                mlb.h(yzy.tw);
                break;
            case 2:
                ((ao) this.a).g(false, false);
                break;
            case 3:
                ((Fragment) this.a).requireActivity().finish();
                break;
            case 4:
                ((Fragment) this.a).requireActivity().finish();
                break;
            case 5:
                Object obj3 = this.a;
                mhr mhrVar = new mhr(obj3, 6);
                DisableAdbFragment disableAdbFragment = (DisableAdbFragment) obj3;
                disableAdbFragment.j = true;
                disableAdbFragment.k = mhrVar;
                Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
                intent.setFlags(268435456);
                ((Fragment) obj3).startActivity(intent);
                break;
            case 6:
                ((Fragment) this.a).requireActivity().finish();
                break;
            case 7:
                Object obj4 = this.a;
                ((ErrorPageFragment) obj4).h.a++;
                NavHostFragment.b((Fragment) obj4).f(R.id.action_errorPageFragment_to_connectCarFragment, null);
                break;
            case 8:
                ohe oheVar = ((ErrorPageFragment) this.a).i;
                if (oheVar != null) {
                    oheVar.f();
                    break;
                }
                break;
            case 9:
                ((Fragment) this.a).requireActivity().finish();
                break;
            case 10:
                mmg mmgVar = (mmg) this.a;
                ojn ojnVar = mmgVar.s;
                if (!ojnVar.a().f()) {
                    if (ojnVar.f() == 5 && ojnVar.k().f()) {
                        TroubleshooterActivity.B((UUID) ojnVar.k().b());
                        TroubleshooterActivity.A(yzy.Bm);
                        break;
                    }
                } else {
                    new ojl(ojnVar.a().b(), mmgVar.w.a, i2).run();
                    TroubleshooterActivity.A(yzy.Bl);
                    break;
                }
                break;
            case 11:
                ((DashboardCardView) this.a).a();
                break;
            case 12:
                int i3 = MediaPlayerFragment.b;
                ((ltg) this.a).c.invoke();
                break;
            case 13:
                ((MediaPlayerFragment) this.a).c().e.c();
                break;
            case 14:
                ((MediaPlayerFragment) this.a).c().u();
                break;
            case 15:
                ((MediaPlayerFragment) this.a).c().u();
                break;
            case 16:
                Object obj5 = this.a;
                nbb nbbVar = (nbb) obj5;
                aivh aivhVar = nbbVar.d;
                if (aivhVar != null) {
                    aivhVar.s(null);
                }
                nbbVar.d = ahnc.d(dty.f(((Fragment) obj5).getViewLifecycleOwner()), null, 0, new gfw(nbbVar, (afck) null, 20), 3);
                break;
            case 17:
                Object obj6 = this.a;
                niy niyVar = (niy) obj6;
                if (niyVar.M != null) {
                    bt childFragmentManager = ((Fragment) obj6).getChildFragmentManager();
                    childFragmentManager.getClass();
                    w wVar = new w(childFragmentManager);
                    Fragment fragment2 = niyVar.M;
                    fragment2.getClass();
                    wVar.k(fragment2);
                    wVar.c();
                }
                niyVar.a().m(niyVar.e);
                mud mudVarA = mud.h.a();
                int i4 = mua.a;
                mudVarA.x();
                CoolwalkButton coolwalkButton2 = niyVar.v;
                if (coolwalkButton2 == null) {
                    affa.d("assistantIcon");
                } else {
                    coolwalkButton = coolwalkButton2;
                }
                coolwalkButton.setVisibility(0);
                break;
            case 18:
                Object obj7 = this.a;
                niy niyVar2 = (niy) obj7;
                niyVar2.a().p(niyVar2.e, niyVar2.f, ((Fragment) obj7).getContext(), false);
                break;
            case 19:
                niy niyVar3 = (niy) this.a;
                niyVar3.a().n(niyVar3.e);
                break;
            default:
                ((niy) this.a).a().l();
                break;
        }
    }
}
