package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kzz implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kzz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, lzo] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v17, types: [affc, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        int i = 6;
        int i2 = 0;
        defpackage.lby lbyVar = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.abpj abpjVar = ((oth) this.b).c;
                java.lang.Object obj = this.a;
                ((defpackage.saf) obj).k(abpjVar, new defpackage.kzu(obj, i));
                return;
            case 1:
                java.lang.Object obj2 = this.a;
                defpackage.saf safVar = (defpackage.saf) obj2;
                safVar.l();
                java.lang.Object obj3 = this.b;
                oth othVar = (oth) obj3;
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(othVar.b).map(new defpackage.khy(18));
                int i3 = defpackage.ygw.d;
                safVar.a("text", map.collect(defpackage.yds.a)).b("icons", new defpackage.kzz(obj2, obj3, i2)).a("starts_interleaving_with_text", java.lang.Boolean.valueOf(othVar.d));
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.saf safVar2 = (defpackage.saf) this.a;
                safVar2.l();
                java.lang.Object obj4 = this.b;
                osy osyVar = (osy) obj4;
                if ((1 & osyVar.b) != 0) {
                    defpackage.abqv abqvVar = osyVar.c;
                    if (abqvVar == null) {
                        abqvVar = defpackage.abqv.a;
                    }
                    safVar2.a("timestamp", defpackage.abrx.f(abqvVar));
                }
                if ((osyVar.b & 2) != 0) {
                    safVar2.b("navigation_signal", new defpackage.kza(safVar2, obj4, 19));
                }
                if ((osyVar.b & 4) != 0) {
                    safVar2.b("media_signal", new defpackage.kza(safVar2, obj4, 20));
                }
                if ((osyVar.b & 16) != 0) {
                    otc otcVar = osyVar.f;
                    if (otcVar == null) {
                        otcVar = otc.a;
                    }
                    safVar2.a("media_rec_request_signal", otcVar);
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                otg otgVar = ((osw) this.b).e;
                if (otgVar == null) {
                    otgVar = otg.a;
                }
                defpackage.saf safVar3 = (defpackage.saf) this.a;
                safVar3.f("RenderingMetadata", new defpackage.kza(safVar3, (java.lang.Object) otgVar, i));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                oti otiVar = ((osw) this.b).f;
                if (otiVar == null) {
                    otiVar = oti.a;
                }
                defpackage.saf safVar4 = (defpackage.saf) this.a;
                safVar4.f("UpdateMetadata", new defpackage.kza(safVar4, (java.lang.Object) otiVar, 12));
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.lde ldeVar = defpackage.ldf.a;
                defpackage.lby lbyVarValueOf = defpackage.lby.valueOf(defpackage.acqn.f());
                ?? r1 = this.b;
                if (r1.contains(lbyVarValueOf)) {
                    ((defpackage.yqj) defpackage.ldf.b.f()).y("In proof mode for survey %s. Bypassing rate-limiting and sampling.", lbyVarValueOf.name());
                    lbyVar = lbyVarValueOf;
                } else {
                    ((defpackage.yqj) defpackage.ldf.b.h()).y("In proof mode for survey %s, but it was not triggered. Skipping all CSAT surveys for this session.", lbyVarValueOf.name());
                }
                defpackage.ldf.b.l().y("Proof mode survey: %s", lbyVar);
                for (defpackage.lby lbyVar2 : r1) {
                    if (lbyVar2 != lbyVar) {
                        defpackage.jzl.g(lbyVar2, defpackage.zbd.FM);
                    }
                }
                this.a.invoke(lbyVar);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ajnd) this.a).z((android.graphics.drawable.Drawable) ((lgi) this.b).b.obj);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj5 = this.a;
                defpackage.liu liuVar = (defpackage.liu) this.b;
                liuVar.h = (defpackage.liy) obj5;
                liuVar.a();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                dq dqVar = (dq) ((defpackage.lma) this.a).b;
                java.util.Set set = dqVar.b;
                java.lang.Object obj6 = this.b;
                if (!set.remove(obj6)) {
                    android.util.Log.w("MediaControllerCompat", "the callback has never been registered");
                    return;
                }
                try {
                    ajer ajerVar = dqVar.c;
                    ((android.media.session.MediaController) ajerVar.e).unregisterCallback(((dl) obj6).a);
                    synchronized (ajerVar.d) {
                        java.lang.Object obj7 = ajerVar.a;
                        if (((android.support.v4.media.session.MediaSessionCompat.Token) obj7).a() != null) {
                            try {
                                dm dmVar = (dm) ((java.util.HashMap) ajerVar.c).remove(obj6);
                                if (dmVar != null) {
                                    ((dl) obj6).c = null;
                                    ((android.support.v4.media.session.MediaSessionCompat.Token) obj7).a().c(dmVar);
                                }
                            } catch (android.os.RemoteException e) {
                                android.util.Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                            }
                        } else {
                            ajerVar.b.remove(obj6);
                        }
                        break;
                    }
                    ((dl) obj6).h((android.os.Handler) null);
                    return;
                } catch (java.lang.Throwable th) {
                    ((dl) obj6).h((android.os.Handler) null);
                    throw th;
                }
            case 9:
                dq dqVar2 = (dq) ((defpackage.lma) this.a).b;
                java.util.Set set2 = dqVar2.b;
                java.lang.Object obj8 = this.b;
                if (!set2.add(obj8)) {
                    android.util.Log.w("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                android.os.Handler handler = new android.os.Handler();
                dl dlVar = (dl) obj8;
                dlVar.h(handler);
                ajer ajerVar2 = dqVar2.c;
                ((android.media.session.MediaController) ajerVar2.e).registerCallback(dlVar.a, handler);
                synchronized (ajerVar2.d) {
                    java.lang.Object obj9 = ajerVar2.a;
                    if (((android.support.v4.media.session.MediaSessionCompat.Token) obj9).a() != null) {
                        dm dmVar2 = new dm((dl) obj8);
                        ((java.util.HashMap) ajerVar2.c).put(obj8, dmVar2);
                        ((dl) obj8).c = dmVar2;
                        try {
                            ((android.support.v4.media.session.MediaSessionCompat.Token) obj9).a().b(dmVar2);
                            ((dl) obj8).g(13, (java.lang.Object) null, (android.os.Bundle) null);
                        } catch (android.os.RemoteException e2) {
                            android.util.Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                        }
                    } else {
                        ((dl) obj8).c = null;
                        ajerVar2.b.add(obj8);
                    }
                    break;
                }
                return;
            case 10:
                defpackage.lwn.a().c((java.lang.String) this.b, (java.lang.String) this.a);
                return;
            case 11:
                defpackage.nve nveVar = defpackage.ogv.k() ? defpackage.nve.h : null;
                java.lang.Object obj10 = this.a;
                defpackage.mcj.b().a((java.lang.String) this.b).b(nveVar);
                defpackage.lwn.a().b((java.lang.String) obj10);
                return;
            case 12:
                lvn lvnVar = (lvp) this.b;
                defpackage.wfp.c();
                java.lang.Long lValueOf = java.lang.Long.valueOf(lvnVar.e);
                defpackage.lvv lvvVar = (defpackage.lvv) this.a;
                java.util.Map map2 = lvvVar.c;
                lvp lvpVar = (lvn) map2.get(lValueOf);
                if ((lvpVar instanceof lvp) && lvpVar.l(lvnVar)) {
                    return;
                }
                lvnVar.a = false;
                defpackage.lvv.l(lvnVar.g, ((lvp) lvnVar).o);
                map2.put(lValueOf, lvnVar);
                lvvVar.e(lvnVar);
                return;
            case 13:
                java.lang.Object lvrVar = this.b;
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(((lvn) lvrVar).e);
                defpackage.lvv lvvVar2 = (defpackage.lvv) this.a;
                java.util.Map map3 = lvvVar2.c;
                lvr lvrVar2 = (lvn) map3.get(lValueOf2);
                if (lvrVar2 instanceof lvr) {
                    lvr lvrVar3 = lvrVar2;
                    ((defpackage.yqj) defpackage.lvv.a.l().ai((char) 4300)).u("Updating existing SMS conversation");
                    defpackage.ygw ygwVarO = defpackage.ygw.o(((lvr) lvrVar).n);
                    java.util.ArrayList arrayList = new java.util.ArrayList(lvrVar3.n);
                    arrayList.addAll(ygwVarO);
                    lvq lvqVar = new lvq();
                    lvqVar.b(lvrVar3);
                    defpackage.ojm.a();
                    j$.time.Instant.now().toEpochMilli();
                    lvqVar.l = arrayList;
                    lvqVar.m = lvrVar3.m;
                    lvqVar.n = lvrVar3.o;
                    defpackage.ojm.a();
                    lvqVar.o = j$.time.Instant.now().toEpochMilli();
                    ((lvm) lvqVar).g = ((lvn) lvrVar3).f;
                    lvqVar.p = lvrVar3.p;
                    lvqVar.q = lvrVar3.q;
                    lvrVar = new lvr(lvqVar);
                }
                lvn lvnVar2 = (lvn) lvrVar;
                map3.put(java.lang.Long.valueOf(lvnVar2.e), lvrVar);
                lvnVar2.a = lvnVar2.p() && ((lvr) lvrVar).a() > 0;
                lvvVar2.e(lvnVar2);
                return;
            case 14:
                defpackage.yqm yqmVar = lwa.a;
                defpackage.lwn.a().c((java.lang.String) this.b, (java.lang.String) this.a);
                return;
            case 15:
                defpackage.yqm yqmVar2 = defpackage.lws.a;
                defpackage.lwn.a().c((java.lang.String) this.b, (java.lang.String) this.a);
                return;
            case 16:
                defpackage.lws.e((defpackage.zbd) this.b, (java.lang.String) this.a);
                return;
            case 17:
                defpackage.yqm yqmVar3 = defpackage.lws.a;
                luk lukVarA = defpackage.lxy.o().a((defpackage.zaw) this.a, ((android.content.Intent) this.b).getLongExtra("EXTRA_STREAM_ITEM_ID", 0L));
                defpackage.yqm yqmVar4 = defpackage.lws.a;
                if (yqmVar4.l().Z()) {
                    ((defpackage.yqj) yqmVar4.l().ai((char) 4416)).y("Muting conversation %s", j$.util.Objects.toString(lukVarA));
                }
                defpackage.lnt.k().f(lukVarA, true);
                return;
            case 18:
                lwt.e((defpackage.zbd) this.b, (java.lang.String) this.a);
                return;
            case 19:
                defpackage.wfp.c();
                ?? r2 = this.b;
                ((defpackage.yqj) defpackage.mad.a.l().ai((char) 4557)).y("onClientHandleReady(%s)", r2);
                mae maeVar = ((defpackage.maf) this.a).e;
                defpackage.mad madVar = (defpackage.mad) maeVar;
                madVar.f.removeCallbacks(madVar.h);
                synchronized (madVar.d) {
                    lzz lzzVar = ((defpackage.mad) maeVar).c;
                    defpackage.wfp.c();
                    ((defpackage.lzw) lzzVar).o(r2);
                    defpackage.eqs eqsVar = ((defpackage.lzw) lzzVar).f;
                    ajot ajotVar = new ajot((char[]) null);
                    android.content.ComponentName componentName = ((defpackage.mac) r2).b;
                    ajotVar.k(componentName);
                    ajotVar.a = 3;
                    eqsVar.m(ajotVar.j());
                    ((defpackage.lzw) lzzVar).j(defpackage.lzv.a(componentName, "Successfully connected"));
                    ((defpackage.mad) maeVar).g = 0;
                    break;
                }
                return;
            default:
                defpackage.mas masVar = (defpackage.mas) ((defpackage.mar) this.a).a.get();
                if (masVar == null) {
                    return;
                }
                java.lang.Object obj11 = this.b;
                if (obj11 != defpackage.maq.e || masVar.e == defpackage.maq.d) {
                    masVar.e((defpackage.maq) obj11);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ kzz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public kzz(lgi lgiVar, ajnd ajndVar, int i) {
        this.c = i;
        this.a = ajndVar;
        this.b = lgiVar;
    }
}
