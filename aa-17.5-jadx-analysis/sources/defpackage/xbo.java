package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService;
import com.google.android.projection.gearhead.companion.devsettings.DeveloperSettingsActivity;
import com.google.android.projection.gearhead.companion.settings.EngineerSettingsActivity;
import com.google.android.projection.gearhead.companion.settings.Material3VersionPreference;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public final class xbo extends xas implements eqa {
    public static final yph f = yph.c("GH.CommonSettings");
    static final BiFunction g;
    private static final yfy v;
    private static final yfy w;
    private static final yfy x;
    public Preference i;
    en o;
    public xau q;
    public qsz r;
    public xaz s;
    public boolean t;
    public boolean u;
    private boolean y;
    public boolean h = false;
    public final oy j = registerForActivityResult(new ph(), new ox() { // from class: xbk
        @Override // defpackage.ox
        public final void a(Object obj) {
            if (aczy.c()) {
                this.a.getActivity().recreate();
            }
        }
    });
    final lwh k = new xbl(this);
    public final SharedPreferences.OnSharedPreferenceChangeListener l = new kwq(this, 8, null);
    public final SharedPreferences.OnSharedPreferenceChangeListener m = new kwq(this, 9, null);
    public final eqn n = new xay(this, 2);
    public final rbt p = new pdn(this, 4);

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e("key_settings_messaging_notifications_enabled", yzy.cs);
        yfuVar.e("key_settings_autoplay_media", yzy.dB);
        yfuVar.e("key_settings_messaging_visual_preview_enabled", yzy.cy);
        yfuVar.e("key_settings_messaging_group_notifications", yzy.cA);
        yfuVar.e("key_settings_show_message_summarization", yzy.cI);
        yfuVar.e("key_settings_notification_chime_enabled", yzy.cL);
        yfuVar.e("key_settings_allow_connection_while_locked", yzy.cP);
        yfuVar.e("key_settings_show_rail_widget", yzy.dS);
        yfuVar.e("key_settings_driver_aligned_dashboard", yzy.dO);
        v = yfuVar.d(true);
        yfu yfuVar2 = new yfu(4);
        yfuVar2.e("key_settings_messaging_visual_preview_enabled", yzy.cD);
        yfuVar2.e("key_settings_messaging_group_notifications", yzy.cF);
        yfuVar2.e("key_settings_messaging_allow_notification_data_sharing_agsa", yzy.cJ);
        yfuVar2.e("key_settings_autoplay_messages", yzy.cB);
        yfuVar2.e("key_settings_allow_connection_while_locked", yzy.cQ);
        yfuVar2.e("key_work_profile_support", yzy.BA);
        yfuVar2.e("key_settings_show_rail_widget", yzy.dS);
        w = yfuVar2.d(true);
        yfu yfuVar3 = new yfu(4);
        yfuVar3.e("key_settings_messaging_visual_preview_enabled", yzy.cE);
        yfuVar3.e("key_settings_messaging_group_notifications", yzy.cG);
        yfuVar3.e("key_settings_autoplay_messages", yzy.cC);
        yfuVar3.e("key_settings_messaging_allow_notification_data_sharing_agsa", yzy.cK);
        yfuVar3.e("key_settings_allow_connection_while_locked", yzy.cR);
        yfuVar3.e("key_work_profile_support", yzy.BB);
        yfuVar3.e("key_settings_show_rail_widget", yzy.dS);
        x = yfuVar3.d(true);
        g = new moq(2);
    }

    private final void B() {
        w("key_settings_notifications_category", "key_settings_no_notification_sound");
        r("key_settings_notification_chime_enabled").E(E());
        r("key_settings_messaging_visual_preview_enabled").E(E());
        r("key_settings_messaging_group_notifications").E(E());
    }

    private final void C() {
        w("key_settings_connection_category", "key_settings_connection_wireless_enable");
    }

    private final void D(String str) {
        p(yzy.dV);
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) r(str);
        switchPreferenceCompat.k(omc.a().k(getActivity()));
        switchPreferenceCompat.n = new xaw(this, 3);
    }

    private static final boolean E() {
        return mpl.f().a().n() && mpl.f().a().j();
    }

    private static final boolean F() {
        try {
            return omc.a().h(mki.a.d).get(3000L, TimeUnit.MILLISECONDS) != oqd.a;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ype) ((ype) ((ype) f.g()).p(e)).ai((char) 10012)).u("fail to get whether wireless projection is enabled.");
            return false;
        }
    }

    public final /* synthetic */ void A() {
        String strA = jrv.a().a();
        Bundle bundle = new Bundle();
        Integer num = 15;
        num.getClass();
        bundle.putInt("assistant_surface", 15);
        tbg tbgVar = new tbg(bundle, strA);
        try {
            getActivity().startActivityForResult(new Intent().setPackage(tbgVar.c).putExtra("account_name", tbgVar.b).putExtra("assistant_settings_feature", (String) null).putExtras(tbgVar.a).setAction("com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS"), 200);
        } catch (ActivityNotFoundException e) {
            ((ype) ((ype) ((ype) f.h()).p(e)).ai((char) 10016)).u("Failed to start activity assistant settings");
            y(R.string.settings_digital_assistant_error);
        }
    }

    @Override // defpackage.xas
    protected final yzz k() {
        return yzz.SETTINGS_COMMON;
    }

    @Override // defpackage.xas
    protected final Map l() {
        return v;
    }

    @Override // defpackage.xas
    protected final Map m() {
        return x;
    }

    @Override // defpackage.xas
    protected final Map n() {
        return w;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        szp.u(new wxj(this, 6));
    }

    @Override // defpackage.xas, defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.y = (bundle == null || !bundle.containsKey("show_wireless_projection_setting_key")) ? !omc.a().k(getActivity()) : bundle.getBoolean("show_wireless_projection_setting_key");
        qsz qszVar = (qsz) g.apply(this, getContext());
        this.r = qszVar;
        qszVar.e();
        getActivity().setTitle(getString(R.string.android_auto_settings));
    }

    @Override // android.support.v4.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (!kmu.b().d("developer_settings_enabled")) {
            menuInflater.inflate(R.menu.settings_menu, menu);
            return;
        }
        menuInflater.inflate(R.menu.settings_menu_engineer_mode, menu);
        lbl lblVarK = kzd.k();
        getActivity();
        if (!lblVarK.c()) {
            menu.removeItem(R.id.action_send_feedback);
        }
        menu.removeItem(R.id.action_engineer_settings);
    }

    @Override // defpackage.xas, defpackage.exv, android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.getClass();
        if (!this.r.b()) {
            wer.c();
            layoutInflater.inflate(R.layout.loading_placeholder, (ViewGroup) viewOnCreateView, true);
        }
        return viewOnCreateView;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.xas, android.support.v4.app.Fragment
    public final void onDestroy() {
        mpl.f().a().b.unregisterOnSharedPreferenceChangeListener(this.l);
        mpl.f().a().c.unregisterOnSharedPreferenceChangeListener(this.m);
        lwi.a().e(this.k);
        lws.d().a().k(this.n);
        this.r.g();
        super.onDestroy();
    }

    @Override // defpackage.xas, android.support.v4.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        lbl lblVarK = kzd.k();
        bc bcVarRequireActivity = requireActivity();
        if (itemId == R.id.action_feedback) {
            lblVarK.b(bcVarRequireActivity);
            return true;
        }
        if (itemId == R.id.action_send_feedback) {
            Intent intentE = lblVarK.e();
            if (intentE != null) {
                startActivity(intentE);
            } else {
                ldw.e(bcVarRequireActivity);
            }
            return true;
        }
        if (itemId == R.id.action_developer_settings) {
            startActivity(new Intent(bcVarRequireActivity, (Class<?>) DeveloperSettingsActivity.class));
            return true;
        }
        if (itemId == R.id.action_engineer_settings) {
            startActivity(new Intent(bcVarRequireActivity, (Class<?>) EngineerSettingsActivity.class));
            return true;
        }
        if (itemId == R.id.action_developer_head_unit_network_server) {
            bcVarRequireActivity.startService(new Intent(bcVarRequireActivity, (Class<?>) DeveloperHeadUnitNetworkService.class));
            Toast.makeText(getActivity(), getString(R.string.developer_head_unit_network_service_starting), 0).show();
            return true;
        }
        if (itemId == R.id.action_developer_head_unit_network_server_stop) {
            Intent intent = new Intent(bcVarRequireActivity, (Class<?>) DeveloperHeadUnitNetworkService.class);
            intent.setAction("shutdown");
            bcVarRequireActivity.startService(intent);
            Toast.makeText(getActivity(), getString(R.string.developer_head_unit_network_service_stopping), 0).show();
            return true;
        }
        if (itemId != R.id.action_quit_developer_mode) {
            return super.onOptionsItemSelected(menuItem);
        }
        kmu.b().c("developer_settings_enabled", false);
        bcVarRequireActivity.invalidateOptionsMenu();
        Material3VersionPreference material3VersionPreference = (Material3VersionPreference) this.a.d("key_settings_version");
        material3VersionPreference.d = false;
        material3VersionPreference.c = 0;
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        if (kmu.b().d("developer_settings_enabled")) {
            boolean z = DeveloperHeadUnitNetworkService.b;
            menu.findItem(R.id.action_developer_head_unit_network_server).setVisible(!z);
            menu.findItem(R.id.action_developer_head_unit_network_server_stop).setVisible(z);
        }
    }

    @Override // defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putBoolean("show_wireless_projection_setting_key", this.y);
    }

    public final Preference r(CharSequence charSequence) {
        Preference preferenceA = a(charSequence);
        preferenceA.getClass();
        return preferenceA;
    }

    public final void s() {
        if (!isAdded() || isStateSaved() || getParentFragmentManager().af()) {
            ((ype) ((ype) f.h()).ai((char) 10011)).u("Trying to cancel dialog when fragment isn't ready");
            this.t = true;
            return;
        }
        getParentFragmentManager().ah();
        Fragment fragmentF = getParentFragmentManager().f("androidx.preference.PreferenceFragment.DIALOG");
        if (fragmentF != null) {
            w wVar = new w(getParentFragmentManager());
            wVar.k(fragmentF);
            wVar.i(false, true);
        }
    }

    public final void t() {
        y(R.string.settings_takes_effect_on_restart);
        lup lupVarE = lup.e();
        lupVarE.a = null;
        lupVarE.b.c();
    }

    public final void u(xbn xbnVar) {
        new Handler(Looper.getMainLooper()).post(new xab(this, xbnVar, 3));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void v(String str) {
        switch (str.hashCode()) {
            case -1888016373:
                if (str.equals("key_settings_show_rail_widget")) {
                    boolean zG = mpl.f().a().g("key_settings_show_rail_widget", false);
                    z("key_settings_show_rail_widget", mpl.f().a().g("key_settings_show_rail_widget", false));
                    if (nsr.c().h()) {
                        nso nsoVarB = nsr.c().b();
                        if (nsoVarB.I() && nsoVarB.F() == zG) {
                            nsr.c().b().O();
                            break;
                        }
                    }
                }
                break;
            case -1071100057:
                if (str.equals("key_settings_allow_connection_while_locked")) {
                    mkp.b();
                    z("key_settings_allow_connection_while_locked", mkp.a());
                    break;
                }
                break;
            case -930590741:
                if (str.equals("key_work_profile_support")) {
                    z("key_work_profile_support", mpl.f().a().o());
                    break;
                }
                break;
            case -929582140:
                if (str.equals("key_settings_autoplay_media")) {
                    z("key_settings_autoplay_media", mpl.f().a().i());
                    break;
                }
                break;
            case 186410685:
                if (str.equals("key_settings_no_notification_sound")) {
                    B();
                    break;
                }
                break;
            case 316335536:
                if (str.equals("key_settings_always_autoplay_media_3")) {
                    z("key_settings_always_autoplay_media_3", mpl.f().a().c());
                    break;
                }
                break;
            case 448619411:
                if (str.equals("key_settings_show_message_summarization") && lwi.a().a) {
                    z("key_settings_show_message_summarization", mpl.f().a().m());
                    break;
                }
                break;
            case 1048637541:
                if (str.equals("key_settings_messaging_allow_notification_data_sharing_agsa")) {
                    boolean zJ = mpl.f().a().j();
                    z("key_settings_messaging_allow_notification_data_sharing_agsa", zJ);
                    r("key_settings_messaging_notifications_enabled").E(zJ);
                    r("key_settings_messaging_group_notifications").E(zJ);
                    r("key_settings_messaging_visual_preview_enabled").E(zJ);
                    r("key_settings_notification_chime_enabled").E(zJ);
                    if (lwi.a().a) {
                        r("key_settings_show_message_summarization").E(zJ);
                        break;
                    }
                }
                break;
            case 1206366572:
                if (str.equals("key_settings_autoplay_messages")) {
                    z("key_settings_autoplay_messages", mpl.f().a().d());
                    break;
                }
                break;
            case 1380152610:
                if (str.equals("key_settings_messaging_visual_preview_enabled")) {
                    z("key_settings_messaging_visual_preview_enabled", lws.d().h());
                    break;
                }
                break;
            case 1422267046:
                if (str.equals("key_settings_notification_chime_enabled")) {
                    z("key_settings_notification_chime_enabled", mpl.f().a().k());
                    break;
                }
                break;
            case 1757736371:
                if (str.equals("key_settings_messaging_notifications_enabled")) {
                    z("key_settings_messaging_notifications_enabled", E());
                    B();
                    break;
                }
                break;
            case 2063869319:
                if (str.equals("key_settings_gemini_share_precise_location")) {
                    z("key_settings_gemini_share_precise_location", mpl.f().a().f());
                    break;
                }
                break;
        }
    }

    public final void w(String str, String... strArr) {
        for (String str2 : strArr) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) a(str);
            Preference preferenceA = a(str2);
            if (preferenceA != null && preferenceCategory != null) {
                preferenceCategory.Y(preferenceA);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x04e9 A[PHI: r10
  0x04e9: PHI (r10v11 android.content.Intent) = (r10v7 android.content.Intent), (r10v8 android.content.Intent) binds: [B:119:0x04e7, B:122:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0528  */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbo.x():void");
    }

    public final void y(int i) {
        Snackbar.k(this.b, i).f();
    }

    public final void z(String str, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) b().l(str);
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.k(z);
        }
    }
}
