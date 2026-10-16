package defpackage;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.CompoundButton;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity;
import com.google.android.material.chip.Chip;
import com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment;
import j$.util.List;
import java.util.List;

/* loaded from: classes2.dex */
public final class eyj implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eyj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                if (!((Preference) obj).N(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                    break;
                } else {
                    ((TwoStatePreference) obj).k(z);
                    break;
                }
            case 1:
                Object obj2 = this.a;
                if (!((Preference) obj2).N(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                    break;
                } else {
                    ((TwoStatePreference) obj2).k(z);
                    break;
                }
            case 2:
                Object obj3 = this.a;
                if (!((Preference) obj3).N(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                    break;
                } else {
                    ((TwoStatePreference) obj3).k(z);
                    break;
                }
            case 3:
                int i = true != z ? 8 : 0;
                kbw kbwVar = (kbw) this.a;
                kbwVar.a.setVisibility(i);
                kbwVar.b.setVisibility(true == z ? 8 : 0);
                break;
            case 4:
                mkp.b();
                mpl.f().a().a("key_settings_allow_connection_while_locked", z);
                mfq mfqVar = ((PreflightPhonePermissionsActivity) this.a).m;
                mfqVar.getClass();
                mfqVar.a(yzy.cP);
                break;
            case 5:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.a).d;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case 6:
                yzy yzyVar = z ? yzy.pN : yzy.pM;
                if (kio.b().r()) {
                    yzyVar = z ? yzy.pL : yzy.pK;
                }
                Object obj4 = this.a;
                wzy wzyVar = (wzy) obj4;
                mqz mqzVar = wzyVar.w;
                ype ypeVar = (ype) wzx.s.l().ai(9990);
                String strI = mqzVar.i();
                mqc mqcVar = mqzVar.c;
                ypeVar.R("App: %s %s Enabled %b", strI, mqcVar, Boolean.valueOf(z));
                wzx wzxVar = (wzx) obj4;
                xai.t(wzxVar.x);
                nrz nrzVarE = nrz.e();
                ComponentName componentNameA = mqcVar.a();
                SharedPreferences.Editor editorPutBoolean = nrzVarE.f.edit().putBoolean(componentNameA.flattenToString(), z);
                if (kmo.d(acnp.c(), yfq.q(componentNameA))) {
                    editorPutBoolean.putBoolean(nrz.b.flattenToString(), z);
                }
                editorPutBoolean.commit();
                if (!z) {
                    nrz.e().i.edit().remove(mqcVar.a().flattenToString()).commit();
                }
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_APP_CUSTOMIZATION, yzyVar);
                rrbVarH.g(mqcVar.a().getPackageName());
                rrbVarH.p(mqcVar.a());
                ohsVarJ.F(rrbVarH.l());
                xai xaiVar = wzxVar.y;
                List list = xaiVar.e;
                int iIndexOf = list.indexOf(mqzVar);
                if (z) {
                    xaiVar.g.remove(mqzVar);
                    List list2 = xaiVar.f;
                    list2.add(mqzVar);
                    List.EL.sort(list2, xak.a);
                } else {
                    xaiVar.f.remove(mqzVar);
                    java.util.List list3 = xaiVar.g;
                    list3.add(mqzVar);
                    List.EL.sort(list3, new tui(10));
                }
                xaiVar.v();
                int iIndexOf2 = list.indexOf(mqzVar);
                if (iIndexOf < list.size()) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) xaiVar.j.g();
                    View viewT = linearLayoutManager.T(0, linearLayoutManager.av(), true, false);
                    int iBl = viewT != null ? LinearLayoutManager.bl(viewT) : -1;
                    xaiVar.i(iIndexOf, iIndexOf2);
                    if (iBl >= 0) {
                        linearLayoutManager.ad(iBl);
                    }
                } else {
                    xaiVar.b.e(list.size() - 1, 1);
                    xaiVar.i(list.size() - 1, iIndexOf2);
                }
                if (nrz.e().i()) {
                    xaiVar.s();
                }
                wzyVar.I(z);
                break;
            default:
                boolean z2 = !z;
                ebf.j().h(z2);
                Object obj5 = this.a;
                try {
                    ols.C(((Material3ManageCarsFragment) obj5).k, "car_only_connect_to_known_cars", z2);
                    ((ype) Material3ManageCarsFragment.f.l().ai(10041)).N("%s: %b", "car_only_connect_to_known_cars", z2);
                    if (z) {
                        rxf.i(((Fragment) obj5).getActivity().getApplicationContext(), mki.a.d, yxo.ONLY_KNOWN_CARS);
                    }
                } catch (IllegalStateException | SecurityException | qrz e) {
                    ((ype) ((ype) ((ype) Material3ManageCarsFragment.f.h()).p(e)).ai((char) 10042)).u("Error getting settings from CAR_FIRST_PARTY_API");
                }
                ((Material3ManageCarsFragment) this.a).i.setText(Material3ManageCarsFragment.s(z));
                break;
        }
    }

    public /* synthetic */ eyj(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
