package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wdg implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wdg(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.wvd wvdVarA;
        int iU = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.wdn) this.a).b();
                return;
            case 1:
                ((android.content.BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj = this.a;
                defpackage.wdn wdnVar = (defpackage.wdn) obj;
                defpackage.wba wbaVar = wdnVar.d;
                defpackage.zhs zhsVarA = wdu.b(wbaVar).a(new phr(wdnVar.e, 6), wbaVar.b());
                zhsVarA.c(new defpackage.umi(obj, zhsVarA, 18), wbaVar.b());
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                wdj wdkVar = new wdk(0);
                java.lang.Object obj2 = this.a;
                java.util.Iterator it = ((defpackage.wdm) obj2).b.values().iterator();
                while (it.hasNext()) {
                    ((defpackage.sjr) it.next()).d(wdkVar);
                }
                synchronized (obj2) {
                    ((defpackage.wdm) obj2).a = null;
                    break;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                throw new java.lang.RuntimeException(((java.util.concurrent.ExecutionException) this.a).getCause());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                try {
                    defpackage.ysr.cw(this.a);
                    return;
                } catch (java.lang.Exception e) {
                    android.util.Log.i("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e);
                    return;
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                if (((java.lang.Boolean) ((wdy) this.a).a.fF()).booleanValue()) {
                    android.util.Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    java.lang.System.exit(0);
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    defpackage.ysr.cw(this.a);
                    return;
                } catch (java.lang.Exception e2) {
                    if (android.util.Log.isLoggable("StorageInfoHandler", 3)) {
                        android.util.Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e2);
                        return;
                    }
                    return;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                wjb wjbVar = new wjb();
                java.lang.Object obj3 = this.a;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = wik.b;
                wij wijVar = (wij) obj3;
                java.lang.Object obj4 = wijVar.b;
                java.lang.Object obj5 = wijVar.a;
                java.lang.Object obj6 = wijVar.c;
                synchronized (atomicBoolean) {
                    ?? r13 = ((wif) obj5).c;
                    if (android.text.TextUtils.isEmpty(r13)) {
                        android.util.Log.w("SurveyController", "No trigger ID set, ignoring show request.");
                        ((ldp) ((wif) obj5).e).a((java.lang.String) r13, wie.d);
                        return;
                    }
                    ((wik) obj6).g = j$.time.Instant.now().toEpochMilli();
                    ((wik) obj6).c.c.put(r13, java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
                    defpackage.abor aborVarN = acaj.a.n();
                    aborVarN.t();
                    aborVarN.b.b = (java.lang.String) r13;
                    defpackage.wpu wpuVar = wiz.c;
                    wiz.c(adji.a.b().c(wiz.b));
                    java.lang.String language = java.util.Locale.getDefault().getLanguage();
                    defpackage.wpu wpuVar2 = wiz.c;
                    if (wiz.b(adiz.c(wiz.b))) {
                        language = java.util.Locale.getDefault().toLanguageTag();
                    }
                    defpackage.ygw ygwVarQ = defpackage.ygw.q(language);
                    aborVarN.t();
                    acaj acajVar = aborVarN.b;
                    defpackage.abpj abpjVar = acajVar.c;
                    if (!abpjVar.c()) {
                        acajVar.c = defpackage.abox.I(abpjVar);
                    }
                    defpackage.abnf.i(ygwVarQ, acajVar.c);
                    boolean z = ((wif) obj5).a;
                    aborVarN.t();
                    aborVarN.b.d = z;
                    acaj acajVarQ = aborVarN.q();
                    java.lang.Object obj7 = ((wif) obj5).b;
                    abyv abyvVarD = wjc.d((android.content.Context) obj7);
                    defpackage.abor aborVarN2 = abym.a.n();
                    aborVarN2.t();
                    abym abymVar = aborVarN2.b;
                    acajVarQ.getClass();
                    abymVar.c = acajVarQ;
                    abymVar.b |= 1;
                    aborVarN2.t();
                    abym abymVar2 = aborVarN2.b;
                    abyvVarD.getClass();
                    abymVar2.d = abyvVarD;
                    abymVar2.b = 2 | abymVar2.b;
                    abym abymVarQ = aborVarN2.q();
                    wjb wjbVar2 = new wjb();
                    if (abymVarQ == null) {
                        android.util.Log.e("NetworkCallerGrpc", "Survey trigger request was null");
                    } else {
                        wip.a().execute(new defpackage.unw(obj4, (java.lang.Object) abymVarQ, (java.lang.Object) wjbVar2, 8, (byte[]) null));
                    }
                    defpackage.abor aborVarN3 = abwp.a.n();
                    aborVarN3.t();
                    aborVarN3.b.b = (java.lang.String) r13;
                    aborVarN3.t();
                    aborVarN3.b.c = z;
                    aborVarN3.t();
                    aborVarN3.b.d = false;
                    abwp abwpVarQ = aborVarN3.q();
                    defpackage.wpu wpuVar3 = wiz.c;
                    if (wiz.c(adhs.c(wiz.b))) {
                        wja wjaVarA = wja.a();
                        defpackage.abor aborVarN4 = abwq.a.n();
                        aborVarN4.t();
                        abwq abwqVar = aborVarN4.b;
                        abwpVarQ.getClass();
                        abwqVar.c = abwpVarQ;
                        abwqVar.b = 3;
                        wjaVarA.c(aborVarN4.q(), wjbVar.b(), wjbVar.a(), (android.content.Context) obj7, (java.lang.String) null);
                    }
                    return;
                }
            case 9:
                android.widget.EditText editText = (android.widget.EditText) this.a;
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                return;
            case 10:
                wki wkiVar = (wki) this.a;
                wkh wkhVar = wkiVar.a;
                if (wkhVar != null) {
                    wkhVar.a(1);
                    wkiVar.a = null;
                    return;
                }
                return;
            case 11:
                wki wkiVar2 = (wki) this.a;
                wkh wkhVar2 = wkiVar2.a;
                if (wkhVar2 != null) {
                    wkhVar2.a(2);
                    wkiVar2.a = null;
                    return;
                }
                return;
            case 12:
                wkv wkvVar = (wkv) this.a;
                wkvVar.j = true;
                wkvVar.u.finish();
                return;
            case 13:
                defpackage.wmx wmxVar = (defpackage.wmx) this.a;
                wmxVar.b = false;
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = wmxVar.c;
                defpackage.eeu eeuVar = bottomSheetBehavior.z;
                if (eeuVar != null && eeuVar.l()) {
                    wmxVar.a(wmxVar.a);
                    return;
                } else {
                    if (bottomSheetBehavior.y == 2) {
                        bottomSheetBehavior.K(wmxVar.a);
                        return;
                    }
                    return;
                }
            case 14:
                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) this.a;
                if (materialButton.j && materialButton.l && (wvdVarA = materialButton.e.a(false)) != null) {
                    iU = (int) (wvdVarA.u() * 0.11f);
                }
                materialButton.k = iU;
                materialButton.o();
                materialButton.invalidate();
                return;
            case 15:
                ((wsl) this.a).e();
                return;
            case 16:
                wsl wslVar = (wsl) this.a;
                wslVar.getCurrentDrawable().l(false, false, true);
                if (wslVar.b() == null || !wslVar.b().isVisible()) {
                    if (wslVar.c() == null || !wslVar.c().isVisible()) {
                        wslVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((wut) this.a).h();
                return;
            case 18:
                android.widget.EditText editText2 = ((com.google.android.material.search.SearchView) this.a).k;
                if (editText2.requestFocus()) {
                    editText2.sendAccessibilityEvent(8);
                }
                defpackage.wqn.g(editText2).showSoftInput(editText2, 1);
                return;
            case 19:
                ((com.google.android.material.search.SearchView) this.a).i();
                return;
            default:
                android.widget.EditText editText3 = ((com.google.android.material.search.SearchView) this.a).k;
                if (editText3.requestFocus()) {
                    editText3.sendAccessibilityEvent(8);
                    return;
                }
                return;
        }
    }

    public wdg(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
