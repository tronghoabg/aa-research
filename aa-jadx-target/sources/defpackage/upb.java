package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class upb implements defpackage.xzi {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ upb(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [aclm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, vft] */
    /* JADX WARN: Type inference failed for: r8v49, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v80, types: [java.lang.Object, xzi] */
    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        java.lang.CharSequence applicationLabel;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                upc upcVar = (upc) this.a;
                return new upf(upcVar.n, upcVar, upcVar.l.e());
            case 1:
                defpackage.ypg ypgVar = unz.a;
                defpackage.abor aborVarN = zda.a.n();
                defpackage.abor aborVarN2 = zru.a.n();
                defpackage.abor aborVarN3 = zrt.a.n();
                aborVarN3.t();
                zrt zrtVar = aborVarN3.b;
                java.lang.String str = ((tpv) this.a).a;
                str.getClass();
                zrtVar.b |= 1;
                zrtVar.c = str;
                aborVarN3.t();
                zrt zrtVar2 = aborVarN3.b;
                zrtVar2.d = 1;
                zrtVar2.b |= 2;
                aborVarN2.t();
                zru zruVar = aborVarN2.b;
                zrt zrtVarQ = aborVarN3.q();
                zrtVarQ.getClass();
                zruVar.c = zrtVarQ;
                zruVar.b |= 64;
                aborVarN.t();
                zda zdaVar = aborVarN.b;
                zru zruVarQ = aborVarN2.q();
                zruVarQ.getClass();
                zdaVar.s = zruVarQ;
                zdaVar.e |= 4;
                return aborVarN.q();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                upc upcVar2 = (upc) this.a;
                return new upg(upcVar2.n, upcVar2.c, upcVar2, upcVar2.l.e());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ypg ypgVar2 = uqk.a;
                return new plv(32, plt.v, (plr) this.a.a(), (defpackage.vlu) null);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((zxp) this.a.a()).b();
                return java.lang.Boolean.FALSE;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(((zxp) this.a.a()).c().W);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return vjx.p((android.content.Context) ((defpackage.kez) this.a).c);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.zif zifVar = new defpackage.zif();
                ?? r8 = this.a;
                if (r8 == 0) {
                    zifVar.p(new java.lang.RuntimeException("App Check token provider is null."));
                    return zifVar;
                }
                try {
                    r8.e(new vfp(zifVar));
                    return zifVar;
                } catch (android.os.RemoteException e) {
                    zifVar.p(e);
                    return zifVar;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((android.content.Context) this.a).getPackageName();
            case 9:
                android.content.Context context = (android.content.Context) this.a;
                return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            case 10:
                return defpackage.ysr.bv(((android.os.Bundle) this.a).getString("com.google.android.libraries.navigation.service.usage_server_url_override"));
            case 11:
                return (defpackage.zhw) this.a.a();
            case 12:
                return java.lang.Double.valueOf((java.lang.String) ((vqm) this.a).a.fF());
            case 13:
                return this.a;
            case 14:
                return ((defpackage.vtg) this.a).a();
            case 15:
                java.lang.Object obj = this.a;
                int i = vvc.a;
                long jCeil = vvb.f;
                if (jCeil == 0) {
                    synchronized (vvb.class) {
                        jCeil = vvb.f;
                        if (jCeil == 0) {
                            float f = 60.0f;
                            float fFloatValue = ((java.lang.Float) vvb.l((android.content.Context) obj).d(java.lang.Float.valueOf(60.0f))).floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                            jCeil = (long) java.lang.Math.ceil(1.0E9d / ((double) f));
                            vvb.f = jCeil;
                        }
                        break;
                    }
                }
                return java.lang.Long.valueOf(jCeil);
            case 16:
                return (android.content.SharedPreferences) ((defpackage.xyn) this.a).b();
            case 17:
                return java.lang.Boolean.valueOf(adgs.a.b().b((android.content.Context) this.a));
            case 18:
                return defpackage.xyn.h(new wdy((defpackage.xzi) ((defpackage.wfs) this.a).a));
            case 19:
                long j = wjc.a;
                return (android.app.UiModeManager) ((android.content.Context) this.a).getSystemService("uimode");
            default:
                androidx.preference.Preference preference = (androidx.preference.Preference) this.a;
                android.content.Context context2 = preference.j;
                android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context2.getSystemService("telecom");
                telecomManager.getClass();
                java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
                hashSet.add(telecomManager.getDefaultDialerPackage());
                android.content.pm.PackageManager packageManager = context2.getPackageManager();
                hashSet.addAll(qja.a(packageManager));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(context2.getString(2132085023));
                sb.append("\n");
                for (java.lang.String str2 : hashSet) {
                    try {
                        if (!com.google.android.projection.gearhead.companion.settings.Material3VersionPreference.b.contains(str2)) {
                            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                            sb.append((packageInfo.applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo)) == null) ? str2 : applicationLabel.toString());
                            sb.append(": ");
                            java.lang.String str3 = packageInfo.versionName;
                            java.lang.String strValueOf = java.lang.String.valueOf(packageInfo.versionCode);
                            if (!android.text.TextUtils.isEmpty(str3)) {
                                strValueOf = str3 + " (" + strValueOf + ")";
                            }
                            sb.append(strValueOf);
                            sb.append("\n");
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.companion.settings.Material3VersionPreference.a.h()).p(e2)).ai((char) 10071)).y("Package not found: %s", str2);
                    }
                }
                sb.append("\n");
                android.content.Context context3 = preference.j;
                sb.append(context3.getString(2132085024));
                sb.append("\n");
                defpackage.yot it = defpackage.mdp.d().b().entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    sb.append(((defpackage.mdr) entry.getKey()).name().toLowerCase(java.util.Locale.getDefault()));
                    sb.append(": ");
                    sb.append(((java.lang.Boolean) entry.getValue()).booleanValue() ? context3.getString(2132085022) : context3.getString(2132085021));
                    sb.append("\n");
                }
                return sb.toString();
        }
    }
}
