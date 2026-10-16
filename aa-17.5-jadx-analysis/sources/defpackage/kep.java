package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialSearchHeaderView;
import com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard;
import com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneDataNoticeActivity;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity;
import com.google.android.apps.auto.sdk.AlphaJumpKeyItem;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class kep implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kep(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, mfq] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        switch (this.b) {
            case 0:
                gsy gsyVar = (gsy) ((geu) this.a).l(gsy.class);
                gsyVar.getClass();
                gsyVar.a();
                break;
            case 1:
                ((MaterialSearchHeaderView) this.a).a.performClick();
                break;
            case 2:
                mox.b().e();
                ((Fragment) this.a).getActivity().finish();
                ebf.j().o(yzz.LOCK_SCREEN, yzy.jr);
                break;
            case 3:
                yph yphVar = krl.s;
                ((urg) this.a).f();
                break;
            case 4:
                yph yphVar2 = krl.s;
                ((urg) this.a).f();
                break;
            case 5:
                yph yphVar3 = krl.s;
                ((urg) this.a).f();
                break;
            case 6:
                ((kzm) this.a).a(yzy.Lh);
                break;
            case 7:
                Object obj = this.a;
                ((lay) obj).g(8);
                lat latVar = (lat) obj;
                if (latVar.c != null) {
                    latVar.b();
                    break;
                } else {
                    latVar.f.a();
                    break;
                }
            case 8:
                String string = ((Button) view).getText().toString();
                Character chValueOf = "123".equals(string) ? ((AlphaJumpKeyboard) this.a).e : Character.valueOf(string.charAt(0));
                Object obj2 = ((AlphaJumpKeyboard) this.a).f.a;
                lat latVar2 = (lat) obj2;
                latVar2.c(yzy.bz, Long.valueOf(SystemClock.elapsedRealtime() - latVar2.e));
                latVar2.f.b();
                latVar2.b.d(((AlphaJumpKeyItem) latVar2.d.get(chValueOf)).c);
                latVar2.a();
                lay layVar = (lay) obj2;
                layVar.h();
                layVar.g(0);
                break;
            case 9:
                lev levVar = (lev) this.a;
                lex lexVar = levVar.g;
                yph yphVar4 = lfc.a;
                SharedPreferences sharedPreferences = lexVar.getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0);
                ((ype) ((ype) lfc.a.h()).ai((char) 3859)).u("Setting Don't Show Again for TapHeadUnit");
                ebf.j().f(rrc.h(yxy.FRX, yzz.FRX_WIRELESS_TAP_HEAD_UNIT_ACTIVITY, yzy.cp));
                sharedPreferences.edit().putBoolean("tap_hu_dsa", true).apply();
                lex lexVar2 = levVar.g;
                lexVar2.r = true;
                lexVar2.E();
                break;
            case 10:
                ley leyVar = (ley) this.a;
                lex lexVar3 = leyVar.g;
                yph yphVar5 = lfc.a;
                SharedPreferences sharedPreferences2 = lexVar3.getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0);
                ((ype) ((ype) lfc.a.h()).ai((char) 3856)).u("Setting Don't Show Again for Preflight");
                ebf.j().f(rrc.h(yxy.FRX, yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.cp));
                sharedPreferences2.edit().putBoolean("preflight_dsa", true).apply();
                lex lexVar4 = leyVar.g;
                lexVar4.r = true;
                lexVar4.E();
                break;
            case 11:
                Object obj3 = this.a;
                WirelessPreflightActivity wirelessPreflightActivity = (WirelessPreflightActivity) obj3;
                if (wirelessPreflightActivity.K()) {
                    wirelessPreflightActivity.I();
                    ((ype) ((ype) WirelessPreflightActivity.n.f()).ai((char) 3840)).u("Prompting unlock");
                    ((KeyguardManager) wirelessPreflightActivity.getSystemService("keyguard")).requestDismissKeyguard((Activity) obj3, new lfa(wirelessPreflightActivity));
                    WirelessPreflightActivity.D(yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.cj);
                } else {
                    ((ype) ((ype) WirelessPreflightActivity.n.h()).ai((char) 3839)).u("Button set to unlock when screen already unlocked. Continuing into resolution flow");
                    wirelessPreflightActivity.H();
                    wirelessPreflightActivity.J();
                }
                wirelessPreflightActivity.G();
                break;
            case 12:
                ((WirelessPreflightActivity) this.a).H();
                break;
            case 13:
                ((ype) mfy.a.l().ai((char) 4873)).u("Permissions Button click. launching request");
                ((Fragment) this.a).getContext().startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS").setFlags(268435456), luk.c());
                break;
            case 14:
                ((ype) ((ype) mgi.a.f()).ai((char) 4888)).u("DSA exit button clicked");
                this.a.a(yzy.bK);
                ((mfp) luk.b().a()).b.a(mgl.d);
                break;
            case 15:
                ((ob) this.a).r().y();
                break;
            case 16:
                Object obj4 = this.a;
                PreflightPhoneDataNoticeActivity preflightPhoneDataNoticeActivity = (PreflightPhoneDataNoticeActivity) obj4;
                preflightPhoneDataNoticeActivity.C(view);
                ((ImageView) view.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(preflightPhoneDataNoticeActivity.m);
                ((mhe) obj4).F();
                break;
            case 17:
                ((TextView) view.findViewById(R.id.data_notice_entry_body)).setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
                ImageView imageView = (ImageView) view.findViewById(R.id.data_notice_entry_arrow);
                Object obj5 = this.a;
                imageView.setImageDrawable(((PreflightPhoneDataNoticeActivity) obj5).n);
                ((mhe) obj5).F();
                view.setOnClickListener(new kep(obj5, 16, null));
                break;
            case 18:
                Object obj6 = this.a;
                wou wouVar = new wou((Context) obj6, 0);
                wouVar.A(R.string.permissions_settings_alert_dialog_title);
                wouVar.u(R.string.permissions_settings_alert_dialog_body);
                wouVar.y(R.string.permissions_settings_continue_button_text, new mhb(obj6, i));
                wouVar.w(R.string.permissions_settings_cancel_button_text, new mhb(obj6, 2));
                PreflightPhonePermissionsActivity preflightPhonePermissionsActivity = (PreflightPhonePermissionsActivity) obj6;
                preflightPhonePermissionsActivity.n = wouVar.b();
                preflightPhonePermissionsActivity.n.show();
                mfq mfqVar = preflightPhonePermissionsActivity.m;
                mfqVar.getClass();
                mfqVar.a(yzy.bJ);
                break;
            case 19:
                ((ob) this.a).r().y();
                break;
            default:
                mhe mheVar = (mhe) this.a;
                if (!mheVar.s) {
                    mheVar.r.o(130);
                    break;
                } else {
                    mheVar.B();
                    break;
                }
        }
    }

    public kep(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
