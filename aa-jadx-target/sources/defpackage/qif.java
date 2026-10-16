package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qif implements defpackage.jqw {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.AccountUtils");
    private java.lang.String b;

    @Override // defpackage.jqw
    public final synchronized java.lang.String a() {
        java.lang.String str = this.b;
        if (str != null) {
            return str;
        }
        defpackage.mkp.a.d.execute(new defpackage.qie(this, 0));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013b A[Catch: slg -> 0x0142, slh -> 0x0144, RemoteException | slg | slh -> 0x0146, all -> 0x01b9, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:6:0x000a, B:8:0x0010, B:10:0x002a, B:12:0x003a, B:16:0x004e, B:17:0x007c, B:18:0x0080, B:19:0x0097, B:20:0x00a0, B:22:0x00a6, B:23:0x00b9, B:52:0x0157, B:54:0x015a, B:55:0x0166, B:57:0x0171, B:60:0x018c, B:62:0x0194, B:64:0x0197, B:66:0x01a1, B:70:0x01a8, B:25:0x00c4, B:26:0x00da, B:28:0x00dc, B:30:0x00e4, B:32:0x00ec, B:34:0x00f4, B:35:0x00fa, B:36:0x00fb, B:37:0x010a, B:38:0x010b, B:39:0x0111, B:40:0x0112, B:41:0x0118, B:42:0x0119, B:43:0x013b, B:50:0x0147), top: B:80:0x0001 }] */
    public final synchronized void b() {
        android.accounts.Account[] accountArrC;
        defpackage.wfp.b();
        if (this.b == null) {
            android.content.Context context = defpackage.mkp.a.c;
            java.lang.String str = null;
            try {
                defpackage.wba.c(context);
                defpackage.sma qpqVar = new qpq(context);
                java.lang.String packageName = context.getPackageName();
                adbe adbeVar = adbe.a;
                if (adbeVar.b().e()) {
                    defpackage.abpj abpjVar = adbeVar.b().b().b;
                    if (!abpjVar.contains(packageName) || abpjVar.contains("-".concat(java.lang.String.valueOf(packageName)))) {
                        try {
                            qpr.a(defpackage.skr.a.b(qpqVar, new defpackage.sma[0]));
                            ((defpackage.ype) ((defpackage.ype) qpr.a.f().o(sqm.a, 343)).ai(7525)).y("Using GoogleAuthClient for getAccounts for 1p app: %s", context.getPackageName());
                            int i = defpackage.ygw.d;
                            defpackage.ygw ygwVar = defpackage.ymx.a;
                            try {
                                qph qphVarA = com.google.android.gms.auth.aang.GetAccountsRequest.a();
                                qphVarA.b("com.google");
                                java.util.List<com.google.android.gms.auth.aang.GoogleAccount> list = ((com.google.android.gms.auth.aang.GetAccountsResponse) qpr.a(qpqVar.a(qphVarA.a()))).a;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (com.google.android.gms.auth.aang.GoogleAccount googleAccount : list) {
                                    arrayList.add(new android.accounts.Account(googleAccount.c, googleAccount.b));
                                }
                                accountArrC = (android.accounts.Account[]) arrayList.toArray(new android.accounts.Account[0]);
                            } catch (java.lang.InterruptedException e) {
                                java.lang.Thread.currentThread().interrupt();
                                throw new android.os.RemoteException("Fetching accounts was interrupted. ".concat(e.toString()));
                            } catch (java.util.concurrent.ExecutionException e2) {
                                if (e2.getCause() instanceof android.os.RemoteException) {
                                    throw ((android.os.RemoteException) e2.getCause());
                                }
                                if (e2.getCause() instanceof defpackage.slh) {
                                    throw ((defpackage.slh) e2.getCause());
                                }
                                if (!(e2.getCause() instanceof defpackage.slg)) {
                                    throw new android.os.RemoteException("Unexpected error was thrown by GoogleAuthClient when fetching accounts. ".concat(e2.toString()));
                                }
                                throw ((defpackage.slg) e2.getCause());
                            }
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                            ((defpackage.ype) ((defpackage.ype) qpr.a.f().o(sqm.a, 343)).ai((char) 7526)).y("Using GoogleAuthUtil for getAccounts for 1p app: %s", context.getPackageName());
                            java.lang.String str2 = qpb.a;
                            accountArrC = qpd.c(context);
                        }
                    } else {
                        java.lang.String str3 = qpb.a;
                        accountArrC = qpd.c(context);
                    }
                } else {
                    java.lang.String str4 = qpb.a;
                    accountArrC = qpd.c(context);
                }
            } catch (android.os.RemoteException | defpackage.slg | defpackage.slh e3) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e3)).ai((char) 7281)).u("GoogleAuthUtil.getAccounts failed");
                accountArrC = null;
            }
            if (accountArrC != null && accountArrC.length != 0) {
                defpackage.kxf kxfVarK = defpackage.ebo.n().k();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                while (android.os.SystemClock.elapsedRealtime() - jElapsedRealtime < 1500) {
                    defpackage.wfp.b();
                    java.lang.String str5 = (java.lang.String) ((defpackage.kzh) kxfVarK).b(((defpackage.kzh) kxfVarK).d.n(), java.lang.String.class);
                    if (str5 != null) {
                        str = str5;
                        break;
                    }
                    android.os.SystemClock.sleep(100L);
                }
                if (str != null) {
                    for (android.accounts.Account account : accountArrC) {
                        if (str.equalsIgnoreCase(account.name)) {
                            this.b = str;
                            return;
                        }
                    }
                }
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 7280)).u("No user found!");
            }
        }
    }

    @Override // defpackage.lhn
    public final synchronized void d() {
        this.b = null;
    }

    @Override // defpackage.lhn
    public final void eQ() {
    }
}
