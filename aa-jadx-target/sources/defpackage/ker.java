package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ker implements android.view.View.OnClickListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ker(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, mfy] */
    /* JADX WARN: Type inference failed for: r7v49, types: [eqg, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                gtg gtgVarL = ((gfa) this.a).l(gtg.class);
                gtgVarL.getClass();
                gtgVarL.a();
                break;
            case 1:
                ((com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialSearchHeaderView) this.a).a.performClick();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.mpd.b().e();
                ((android.support.v4.app.Fragment) this.a).getActivity().finish();
                defpackage.omf.u().o(defpackage.zbe.LOCK_SCREEN, defpackage.zbd.jr);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar = krs.s;
                ((usd) this.a).f();
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = krs.s;
                ((usd) this.a).f();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar3 = krs.s;
                ((usd) this.a).f();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((kzr) this.a).a(defpackage.zbd.Ll);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj = this.a;
                ((lbd) obj).g(8);
                lay layVar = (lay) obj;
                if (layVar.c != null) {
                    layVar.b();
                } else {
                    layVar.f.a();
                }
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String string = ((android.widget.Button) view).getText().toString();
                java.lang.Character chValueOf = "123".equals(string) ? ((com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard) this.a).e : java.lang.Character.valueOf(string.charAt(0));
                java.lang.Object obj2 = ((com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard) this.a).f.a;
                lay layVar2 = (lay) obj2;
                layVar2.c(defpackage.zbd.bz, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - layVar2.e));
                layVar2.f.b();
                layVar2.b.d(((com.google.android.apps.auto.sdk.AlphaJumpKeyItem) layVar2.d.get(chValueOf)).c);
                layVar2.a();
                lbd lbdVar = (lbd) obj2;
                lbdVar.h();
                lbdVar.g(0);
                break;
            case 9:
                lfa lfaVar = (lfa) this.a;
                lfc lfcVar = lfaVar.g;
                defpackage.yqm yqmVar4 = lfh.a;
                android.content.SharedPreferences sharedPreferences = lfcVar.getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0);
                ((defpackage.yqj) ((defpackage.yqj) lfh.a.h()).ai((char) 3862)).u("Setting Don't Show Again for TapHeadUnit");
                defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.FRX_WIRELESS_TAP_HEAD_UNIT_ACTIVITY, defpackage.zbd.cp));
                sharedPreferences.edit().putBoolean("tap_hu_dsa", true).apply();
                lfc lfcVar2 = lfaVar.g;
                lfcVar2.r = true;
                lfcVar2.E();
                break;
            case 10:
                lfd lfdVar = (lfd) this.a;
                lfc lfcVar3 = lfdVar.g;
                defpackage.yqm yqmVar5 = lfh.a;
                android.content.SharedPreferences sharedPreferences2 = lfcVar3.getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0);
                ((defpackage.yqj) ((defpackage.yqj) lfh.a.h()).ai((char) 3859)).u("Setting Don't Show Again for Preflight");
                defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.FRX_WIRELESS_PREFLIGHT_ACTIVITY, defpackage.zbd.cp));
                sharedPreferences2.edit().putBoolean("preflight_dsa", true).apply();
                lfc lfcVar4 = lfdVar.g;
                lfcVar4.r = true;
                lfcVar4.E();
                break;
            case 11:
                java.lang.Object obj3 = this.a;
                com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity wirelessPreflightActivity = (com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity) obj3;
                if (wirelessPreflightActivity.K()) {
                    wirelessPreflightActivity.I();
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity.n.f()).ai((char) 3843)).u("Prompting unlock");
                    ep$.ExternalSyntheticApiModelOutline1.m((android.app.KeyguardManager) wirelessPreflightActivity.getSystemService("keyguard"), (android.app.Activity) obj3, new lff(wirelessPreflightActivity));
                    com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity.D(defpackage.zbe.FRX_WIRELESS_PREFLIGHT_ACTIVITY, defpackage.zbd.cj);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity.n.h()).ai((char) 3842)).u("Button set to unlock when screen already unlocked. Continuing into resolution flow");
                    wirelessPreflightActivity.H();
                    wirelessPreflightActivity.J();
                }
                wirelessPreflightActivity.G();
                break;
            case 12:
                ((com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity) this.a).H();
                break;
            case 13:
                ((defpackage.yqj) mgg.a.l().ai((char) 4876)).u("Permissions Button click. launching request");
                ((android.support.v4.app.Fragment) this.a).getContext().startActivity(new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS").setFlags(268435456), defpackage.luq.c());
                break;
            case 14:
                ((defpackage.yqj) ((defpackage.yqj) mgq.a.f()).ai((char) 4891)).u("DSA exit button clicked");
                this.a.a(defpackage.zbd.bK);
                ((defpackage.mfx) defpackage.luq.b().a()).b.a(defpackage.mgt.d);
                break;
            case 15:
                if (((defpackage.mfx) defpackage.luq.b().a()).c != null) {
                    ?? r7 = this.a;
                    defpackage.mgw mgwVar = (defpackage.mgw) r7;
                    mgwVar.h = true;
                    mgwVar.j.getClass();
                    if (defpackage.mdp.h() && !defpackage.mgw.h()) {
                        defpackage.mgy mgyVar = (defpackage.mgy) r7;
                        defpackage.bc bcVar = mgyVar.k;
                        if (bcVar instanceof com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity) {
                            com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity = (com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity) bcVar;
                            preflightPhoneWelcomeActivity.r = new mhk(preflightPhoneWelcomeActivity);
                            if (android.os.Build.VERSION.SDK_INT >= 33) {
                                preflightPhoneWelcomeActivity.registerReceiver(preflightPhoneWelcomeActivity.r, preflightPhoneWelcomeActivity.o, 2);
                            } else {
                                preflightPhoneWelcomeActivity.registerReceiver(preflightPhoneWelcomeActivity.r, preflightPhoneWelcomeActivity.o);
                            }
                            preflightPhoneWelcomeActivity.p.removeCallbacks(preflightPhoneWelcomeActivity.s);
                            mgyVar.i();
                        }
                    } else {
                        defpackage.mdp.f(r7);
                    }
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.mgw.g.h()).ai((char) 4896)).u("Cannot progress through FRX because session has ended");
                }
                break;
            case 16:
                java.lang.Object obj4 = this.a;
                android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) obj4;
                fragment.requireContext().startActivity(new android.content.Intent(fragment.requireContext(), (java.lang.Class<?>) com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity.class).setFlags(268435456), defpackage.luq.c());
                ((defpackage.mgw) obj4).i.a(defpackage.zbd.bJ);
                break;
            case 17:
                java.lang.Object obj5 = this.a;
                ((defpackage.mgy) obj5).i();
                ((defpackage.mfx) defpackage.luq.b().a()).b.a(defpackage.mgt.d);
                ((defpackage.ao) obj5).c();
                break;
            case 18:
                ((defpackage.od) this.a).r().y();
                break;
            case 19:
                java.lang.Object obj6 = this.a;
                com.google.android.apps.auto.components.preflight.phone.PreflightPhoneDataNoticeActivity preflightPhoneDataNoticeActivity = (com.google.android.apps.auto.components.preflight.phone.PreflightPhoneDataNoticeActivity) obj6;
                preflightPhoneDataNoticeActivity.C(view);
                ((android.widget.ImageView) view.findViewById(2131427924)).setImageDrawable(preflightPhoneDataNoticeActivity.m);
                ((mhl) obj6).F();
                break;
            default:
                ((android.widget.TextView) view.findViewById(2131427925)).setMaxLines(Integer.MAX_VALUE);
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131427924);
                java.lang.Object obj7 = this.a;
                imageView.setImageDrawable(((com.google.android.apps.auto.components.preflight.phone.PreflightPhoneDataNoticeActivity) obj7).n);
                ((mhl) obj7).F();
                view.setOnClickListener(new defpackage.ker(obj7, 19, null));
                break;
        }
    }

    public ker(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
