package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class mhr implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mhr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v49, types: [eqa, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 6;
        int i2 = 4;
        int i3 = 0;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                wer.c();
                if (lbh.d().i()) {
                    return;
                }
                Object obj = this.a;
                mki.a.d.execute(new mgw(obj, lem.a().e(kio.b().e(), nyj.a()), i2, bArr));
                wer.c();
                mjv.a();
                mhv mhvVar = (mhv) obj;
                Context context = mhvVar.d;
                ajmd ajmdVar = new ajmd(obj);
                HashSet hashSet = new HashSet();
                hashSet.add(new mju(context, ajmdVar));
                mhvVar.b = new tlu(hashSet);
                return;
            case 1:
                wer.b();
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (lbh.d().i()) {
                        return;
                    }
                    kgq.d(new kyi(obj2, i), "GH.ProjectedApps", yzz.PROJECTED_APPS, yzy.MI, "Could not get vendor extension manager", new Object[0]);
                    rol rolVar = ((mhv) obj2).h;
                    if (rolVar == null) {
                        return;
                    }
                    final mhv mhvVar2 = (mhv) obj2;
                    rolVar.b = new qsv() { // from class: mhq
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.qsv
                        public final void a(byte[] bArr2) {
                            wer.c();
                            int length = bArr2.length;
                            try {
                                akgb akgbVar = (akgb) abnv.B(akgb.a, bArr2, abnj.a);
                                int i4 = akgbVar.b;
                                int i5 = 3;
                                int i6 = i4 != 0 ? i4 != 1 ? i4 != 2 ? 0 : 2 : 1 : 3;
                                byte[] bArr3 = null;
                                if (i6 == 0) {
                                    throw null;
                                }
                                int i7 = i6 - 1;
                                mhv mhvVar3 = mhvVar2;
                                if (i7 == 0) {
                                    String str = i4 == 1 ? (String) akgbVar.c : "";
                                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                    if (componentNameUnflattenFromString == null) {
                                        ((ype) ((ype) mhv.a.h()).ai((char) 4966)).y("Invalid component name %s", str);
                                        return;
                                    }
                                    mqc mqcVarA = lem.a().a(kio.b().e(), new mqb(componentNameUnflattenFromString));
                                    if (mqcVarA == null) {
                                        ((ype) ((ype) mhv.a.h()).ai((char) 4965)).y("App not found %s", str);
                                        return;
                                    } else {
                                        mhvVar3.b(mqcVarA);
                                        return;
                                    }
                                }
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        return;
                                    }
                                    ((ype) ((ype) mhv.a.h()).ai((char) 4968)).u("Payload not set");
                                    return;
                                }
                                akga akgaVar = i4 == 2 ? (akga) akgbVar.c : akga.a;
                                Map map = mhvVar3.g;
                                String str2 = akgaVar.b;
                                mhu mhuVar = (mhu) map.get(str2);
                                if (mhuVar == null) {
                                    ((ype) ((ype) mhv.a.h()).ai((char) 4960)).y("Notification not found: %s", str2);
                                    return;
                                }
                                int iAu = a.au(akgaVar.c);
                                if (iAu == 0) {
                                    iAu = 1;
                                }
                                int i8 = iAu - 2;
                                tlv tlvVar = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? tlv.a : tlv.f : tlv.e : tlv.d : tlv.c : tlv.b : tlv.a;
                                yph yphVar = mhv.a;
                                ((ype) yphVar.l().ai(4958)).M("Handling interaction %s for %s", tlvVar, str2);
                                yno it = lem.a().e(kio.b().e(), nyj.a()).iterator();
                                while (it.hasNext()) {
                                    mqc mqcVar = (mqc) it.next();
                                    if (mqcVar.a().getPackageName().equals(mhuVar.a)) {
                                        mhvVar3.b(mqcVar);
                                        mhvVar3.c = new mgw(mhuVar, tlvVar, i5, bArr3);
                                        return;
                                    }
                                }
                                ((ype) ((ype) yphVar.h()).ai(4959)).y("App not found %s", mhuVar.a);
                            } catch (abon e) {
                                ((ype) ((ype) ((ype) mhv.a.h()).p(e)).ai((char) 4969)).u("Exception parsing as CarToPhone.");
                            }
                        }
                    };
                    ((ype) mhv.a.l().ai(4957)).u("Registered Projected Apps vendor extension listener");
                    wer.e(new mhr(obj2, i3));
                    return;
                }
            case 2:
                ((RadioMediaBrowserService) this.a).n = null;
                return;
            case 3:
                yph yphVar = mjm.a;
                ((mjl) this.a).e.a();
                return;
            case 4:
                NavHostFragment.b((Fragment) this.a).f(R.id.action_chargeOnlyFragment_to_projectionFragment, null);
                return;
            case 5:
                ((mlx) this.a).d();
                return;
            case 6:
                Object obj3 = this.a;
                Fragment fragment = (Fragment) obj3;
                if (Settings.Global.getInt(fragment.requireContext().getContentResolver(), "adb_enabled", 0) == 1) {
                    ((DisableAdbFragment) obj3).c();
                    return;
                }
                ols.M(fragment.requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_DISABLED_ADB);
                DisableAdbFragment disableAdbFragment = (DisableAdbFragment) obj3;
                disableAdbFragment.a.setImageResource(R.drawable.gs_android_auto_vd_theme_24);
                disableAdbFragment.b.setText(R.string.projection_step_title);
                disableAdbFragment.d.setImageResource(R.drawable.usb_cable_checking);
                disableAdbFragment.c.setVisibility(8);
                disableAdbFragment.e.setVisibility(0);
                disableAdbFragment.f.setVisibility(8);
                disableAdbFragment.g.setText(R.string.exit_button);
                disableAdbFragment.l.postDelayed(disableAdbFragment.m, DisableAdbFragment.h.toMillis());
                return;
            case 7:
                Object obj4 = this.a;
                ols.M(((Fragment) obj4).requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_ADB_DISABLE_DID_NOT_RESOLVE);
                ((DisableAdbFragment) obj4).c();
                return;
            case 8:
                Object obj5 = this.a;
                Fragment fragment2 = (Fragment) obj5;
                if (Settings.Global.getInt(fragment2.requireContext().getContentResolver(), "adb_enabled", 0) == 0) {
                    ols.M(fragment2.requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_ADB_ALREADY_DISABLED);
                    ((DisableAdbFragment) obj5).c();
                    return;
                }
                DisableAdbFragment disableAdbFragment2 = (DisableAdbFragment) obj5;
                disableAdbFragment2.a.setImageResource(R.drawable.warning_icon);
                disableAdbFragment2.d.setImageResource(R.drawable.usb_cable_error);
                disableAdbFragment2.b.setText(R.string.usb_debugging_error_title);
                disableAdbFragment2.c.setText(R.string.usb_debugging_error_message);
                disableAdbFragment2.c.setVisibility(0);
                disableAdbFragment2.e.setVisibility(8);
                disableAdbFragment2.g.setText(R.string.adb_no);
                disableAdbFragment2.g.setOnClickListener(new mli(obj5, i2));
                disableAdbFragment2.f.setVisibility(0);
                disableAdbFragment2.f.setText(R.string.adb_open_settings);
                disableAdbFragment2.f.setOnClickListener(new mli(obj5, 5));
                return;
            case 9:
                Fragment fragment3 = (Fragment) this.a;
                ols.M(fragment3.requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_PROJECTION_NOT_STARTED);
                NavHostFragment.b(fragment3).f(R.id.action_projectionFragment_to_disableAdbFragment, null);
                return;
            case 10:
                Object obj6 = this.a;
                synchronized (((mok) obj6).f) {
                    if (!((mok) obj6).k) {
                        ((mok) obj6).m.b();
                        ((mok) obj6).k = true;
                    }
                }
                return;
            case 11:
                mok mokVar = (mok) this.a;
                if (((RotaryKeyboardLayout) mokVar.l.a).i(mokVar.d)) {
                    mokVar.c = true;
                    mokVar.b.postDelayed(mokVar.a, 400L);
                    return;
                }
                return;
            case 12:
                Object obj7 = this.a;
                obs obsVarA = obs.a();
                Context context2 = ((msc) obj7).d;
                obsVarA.c(context2, new ComponentName(context2, (Class<?>) msc.class), R.string.compat_mode_toast, 1);
                return;
            case 13:
                Object obj8 = this.a;
                try {
                    ((msx) obj8).b().b.fE(((Fragment) obj8).getViewLifecycleOwner(), new med(new mqm(obj8, i2), 6));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            case 14:
                mtv.b.l().u("onDragStarted()");
                ((mtv) this.a).d.m(true);
                return;
            case 15:
                ?? r13 = this.a;
                if (!((Fragment) r13).isAdded()) {
                    ((ype) niy.b.h()).u("Trying to set up hotseat and widget while not added");
                    return;
                }
                eqj eqjVar = lmi.a.a().e() ? ((nnu) ((niy) r13).q.a()).k : ((nms) ((niy) r13).p.a()).a;
                eqjVar.getClass();
                tby.j(eqy.a(eqjVar), new mqe(20)).fE(r13, new med(new niw(r13, 13), 20));
                return;
            case 16:
                afia[] afiaVarArr = niy.a;
                ((View) this.a).setAlpha(0.67f);
                return;
            case 17:
                Object obj9 = this.a;
                RailHotseatItemView railHotseatItemView = (RailHotseatItemView) obj9;
                nmj nmjVar = railHotseatItemView.d;
                nmjVar.getClass();
                railHotseatItemView.e = nmjVar;
                nmj nmjVar2 = railHotseatItemView.e;
                if (nmjVar2 == null) {
                    affa.d("currentHotseatItem");
                    nmjVar2 = null;
                }
                gjo gjoVar = nmjVar2.d;
                if (gjoVar != null) {
                    railHotseatItemView.d(gjoVar);
                } else {
                    hrt.e((View) obj9).i(railHotseatItemView.h);
                    ImageView imageView = railHotseatItemView.c;
                    nmj nmjVar3 = railHotseatItemView.e;
                    if (nmjVar3 == null) {
                        affa.d("currentHotseatItem");
                        nmjVar3 = null;
                    }
                    nmj nmjVar4 = railHotseatItemView.e;
                    if (nmjVar4 == null) {
                        affa.d("currentHotseatItem");
                        nmjVar4 = null;
                    }
                    railHotseatItemView.b(imageView, nmjVar3.a, nmjVar4.e);
                }
                nmj nmjVar5 = railHotseatItemView.e;
                if (nmjVar5 == null) {
                    affa.d("currentHotseatItem");
                    nmjVar5 = null;
                }
                GhIcon ghIcon = nmjVar5.c;
                if (ghIcon != null) {
                    ImageView imageView2 = railHotseatItemView.b;
                    lgi.d(imageView2, ghIcon, true, true, false);
                    imageView2.setVisibility(0);
                } else {
                    railHotseatItemView.b.setVisibility(8);
                }
                ImageView imageView3 = railHotseatItemView.c;
                imageView3.setOnTouchListener(new jzt(obj9, i, bArr));
                imageView3.setOnClickListener(new nmp(obj9, 3));
                yop yopVarL = RailHotseatItemView.a.l();
                nmj nmjVar6 = railHotseatItemView.e;
                if (nmjVar6 == null) {
                    affa.d("currentHotseatItem");
                    nmjVar6 = null;
                }
                yopVarL.M("Successfully set %s as an app for %s", nmjVar6, railHotseatItemView.f);
                railHotseatItemView.d = null;
                RailHotseatItemView.f(imageView3, 1.0f, 1.0f, new DecelerateInterpolator(), new ily(14));
                return;
            case 18:
                RailWidgetView railWidgetView = (RailWidgetView) this.a;
                railWidgetView.h = false;
                nnl nnlVar = railWidgetView.i;
                if (nnlVar != null) {
                    railWidgetView.i = null;
                    railWidgetView.b(nnlVar);
                    return;
                }
                return;
            case 19:
                ((RailWidgetView) this.a).e.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(RailWidgetView.b.toMillis() / 2).start();
                return;
            default:
                RailWidgetView railWidgetView2 = (RailWidgetView) this.a;
                railWidgetView2.setVisibility(4);
                railWidgetView2.e.setAlpha(1.0f);
                railWidgetView2.h = false;
                nnl nnlVar2 = railWidgetView2.i;
                if (nnlVar2 != null) {
                    railWidgetView2.i = null;
                    railWidgetView2.b(nnlVar2);
                    return;
                }
                return;
        }
    }

    public mhr(mok mokVar, int i) {
        this.b = i;
        this.a = mokVar;
    }
}
