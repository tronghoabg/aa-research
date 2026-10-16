package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jdh implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jdh(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, jjd] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, jjd] */
    /* JADX WARN: Type inference failed for: r1v60, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        defpackage.rxo rxmVar;
        android.os.RemoteException e;
        boolean zR;
        int i;
        int i2;
        defpackage.oxj oxjVar = null;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.jdk) this.b).c((defpackage.qug) this.c);
                java.lang.Object obj = this.a;
                synchronized (((defpackage.jdl) obj).h) {
                    ((defpackage.jdl) obj).i--;
                    break;
                }
                return;
            case 1:
                ((defpackage.jdk) this.b).c((defpackage.qug) this.c);
                java.lang.Object obj2 = this.a;
                synchronized (((defpackage.jdl) obj2).h) {
                    ((defpackage.jdl) obj2).i--;
                    break;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.jcu jcuVar = new defpackage.jcu((java.nio.ByteBuffer) this.c, null, false);
                defpackage.qug qugVar = (defpackage.qug) this.a;
                defpackage.izu izuVar = new defpackage.izu(qugVar.e, qugVar.h, qugVar.i);
                defpackage.jcu jcuVarF = jcuVar.f();
                jcuVarF.m();
                iJ = jcuVarF.e() >= 2 ? jcuVarF.j() : 0;
                defpackage.izv izvVar = ((defpackage.jec) this.b).e;
                if (iJ == 0 || ((defpackage.jed) izvVar).a.a.a(iJ) == 1) {
                    defpackage.izv izvVar2 = ((defpackage.jed) izvVar).a.w;
                    izvVar2.getClass();
                    izvVar2.d(jcuVar, izuVar);
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar = defpackage.jit.a;
                ((defpackage.jis) this.c).a.E(this.b, (defpackage.jik) this.a);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = defpackage.jit.a;
                ((defpackage.jis) this.c).a.H(this.b, (defpackage.jik) this.a);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i3 = defpackage.jjc.a;
                java.lang.Object obj3 = this.c;
                obj3.getClass();
                defpackage.ive iveVar = ((defpackage.jhi) this.b).a;
                this.a.a(defpackage.ebm.m((java.nio.IntBuffer) obj3, iveVar.b, iveVar.c));
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i4 = defpackage.jjc.a;
                java.lang.Object obj4 = this.c;
                obj4.getClass();
                defpackage.ive iveVar2 = ((defpackage.jhi) this.b).a;
                this.a.a(defpackage.ebm.m((java.nio.IntBuffer) obj4, iveVar2.b, iveVar2.c));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? r0 = this.a;
                if (r0 == 0) {
                    rxmVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = r0.queryLocalInterface("com.google.android.gms.car.startup.IStartup");
                    rxmVar = iInterfaceQueryLocalInterface instanceof defpackage.rxo ? (defpackage.rxo) iInterfaceQueryLocalInterface : new defpackage.rxm(r0);
                }
                java.lang.Object obj5 = this.c;
                java.lang.Object obj6 = this.b;
                jlu jluVar = ((jlp) obj5).a;
                jluVar.g();
                defpackage.ysr.aX(j$.util.Objects.equals(obj6, jluVar.j.e));
                try {
                    zR = rxmVar.r(jluVar.c);
                    try {
                        ((defpackage.yqj) ((defpackage.yqj) jlu.a.f()).ai(2317)).P("onStartupServiceAvailable - IStartup interest is %b for %s", zR, obj6);
                    } catch (android.os.RemoteException e2) {
                        e = e2;
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) jlu.a.f()).p(e)).ai((char) 2318)).y("onStartupServiceAvailable - RemoteException for %s", obj6);
                    }
                    break;
                } catch (android.os.RemoteException e3) {
                    e = e3;
                    zR = false;
                }
                if (zR) {
                    jluVar.j.f = rxmVar;
                } else {
                    jlt jltVar = jluVar.j;
                    jltVar.e = null;
                    if (jltVar.a) {
                        jluVar.b.unbindService(jluVar.i);
                        jltVar.a = false;
                    }
                }
                jluVar.h.a((android.content.ComponentName) obj6, zR);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.yqj) ((defpackage.yqj) jsq.a.f()).ai((char) 2754)).u("Start delayed transition, remove all views, and add the new template view");
                jsq jsqVar = (jsq) this.a;
                defpackage.mlv.A(jsqVar.i, (fgj) this.b);
                jsqVar.i.removeAllViews();
                jsqVar.i.addView((android.view.View) this.c);
                return;
            case 9:
                ((defpackage.yqj) jsq.a.l().ai((char) 2746)).u("TemplateContext ErrorHandler invoked, calling finishCarApp and removeAppFromCaches");
                jsq jsqVar2 = ((jsp) this.a).b;
                java.lang.Object obj7 = this.b;
                defpackage.mqi mqiVar = (defpackage.mqi) this.c;
                androidx.car.app.SessionInfo sessionInfo = (androidx.car.app.SessionInfo) obj7;
                jsqVar2.f(mqiVar, sessionInfo);
                jsqVar2.g(mqiVar, sessionInfo);
                return;
            case 10:
                ((gdx) this.a).d.b.f((defpackage.mqi) this.c, (androidx.car.app.SessionInfo) this.b);
                return;
            case 11:
                java.lang.Object obj8 = this.c;
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                synchronized (obj10) {
                    defpackage.ysr.bk(((defpackage.kou) obj10).c.contains(obj9), "Injection is no longer active");
                    ((defpackage.kou) obj10).g((kor) obj9, java.lang.String.format(java.util.Locale.US, "timeout after %d ms", java.lang.Long.valueOf(defpackage.abrv.a((defpackage.aboh) obj8))));
                    break;
                }
                return;
            case 12:
                boolean zR2 = defpackage.kit.b().r();
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.c;
                java.lang.Object obj13 = this.b;
                if (zR2) {
                    ((defpackage.kzb) obj13).T((java.lang.Throwable) obj12, (defpackage.yxo) obj11);
                    return;
                } else {
                    ((defpackage.kzb) obj13).V((java.lang.Throwable) obj12, (defpackage.yxo) obj11);
                    return;
                }
            case 13:
                java.lang.Object obj14 = this.a;
                tal talVar = (tal) obj14;
                int size = talVar.c.size();
                ?? r5 = this.c;
                defpackage.ysr.bd(size == r5.size(), "Different number of suggestions than notifications: %s suggestions, %s notifications", talVar.c.size(), r5.size());
                java.lang.Object obj15 = ((kzy) this.b).b;
                synchronized (obj15) {
                    java.util.Iterator<E> it = ((tal) obj14).b.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((lad) obj15).a((java.lang.String) it.next())) {
                            i++;
                        }
                    }
                    i2 = 0;
                    for (int iJ = 0; iJ < ((tal) obj14).c.size(); iJ++) {
                        nvh nvhVar = (nvh) r5.get(iJ);
                        osw oswVar = (osw) ((tal) obj14).c.get(iJ);
                        java.util.Map map = ((lad) obj15).b;
                        java.lang.Long l = (java.lang.Long) map.get(oswVar.c);
                        if (l != null) {
                            ((defpackage.yqj) lad.a.l().ai(3673)).M("Updating notification with ID %d for suggestion %s", l, oswVar.c);
                            defpackage.nuz.b().j("GH.Assistant.Suggestion", l.longValue(), nvhVar);
                        } else {
                            ((defpackage.yqj) lad.a.l().ai(3672)).H("Posting notification with ID %d for suggestion %s", ((lad) obj15).c, oswVar.c);
                            map.put(oswVar.c, java.lang.Long.valueOf(((lad) obj15).c));
                            defpackage.nuz.b().j("GH.Assistant.Suggestion", ((lad) obj15).c, nvhVar);
                            ((lad) obj15).c++;
                            i2++;
                        }
                    }
                    break;
                }
                kzy.b(defpackage.zbd.tJ, i);
                kzy.b(defpackage.zbd.tK, talVar.b.size() - i);
                kzy.b(defpackage.zbd.tH, i2);
                kzy.b(defpackage.zbd.tI, talVar.c.size() - i2);
                return;
            case 14:
                ((do) ((defpackage.lma) this.a).b).d((java.lang.String) this.c, (android.os.Bundle) this.b);
                return;
            case 15:
                ((do) ((defpackage.lma) this.a).b).g((java.lang.String) this.c, (android.os.Bundle) this.b);
                return;
            case 16:
                ((do) ((defpackage.lma) this.a).b).f((android.support.v4.media.session.PlaybackStateCompat.CustomAction) ((defpackage.lma) this.c).b, (android.os.Bundle) this.b);
                return;
            case 17:
                ((do) ((defpackage.lma) this.a).b).c((java.lang.String) this.c, (android.os.Bundle) this.b);
                return;
            case 18:
                defpackage.wfp.b();
                java.lang.Object obj16 = this.b;
                ?? r1 = this.a;
                java.lang.Object obj17 = this.c;
                synchronized (obj17) {
                    defpackage.yqm yqmVar3 = defpackage.maf.a;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(4564)).y("onServiceConnected: cleanedUp=%b", java.lang.Boolean.valueOf(((defpackage.maf) obj17).c));
                    if (((defpackage.maf) obj17).c) {
                        defpackage.maf.c(defpackage.zbd.pD);
                        return;
                    }
                    if (r1 != 0) {
                        android.os.IInterface iInterfaceQueryLocalInterface2 = r1.queryLocalInterface("com.google.android.apps.auto.sdk.nav.INavigationProvider");
                        oxjVar = iInterfaceQueryLocalInterface2 instanceof defpackage.oxj ? (defpackage.oxj) iInterfaceQueryLocalInterface2 : new defpackage.oxj(r1);
                    }
                    if (oxjVar == null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar3.g()).ai(4566)).u("INavigationProvider is null");
                        defpackage.maf.c(defpackage.zbd.pE);
                        ((defpackage.maf) obj17).b();
                        return;
                    }
                    ((defpackage.maf) obj17).b = new defpackage.mac(oxjVar, (android.content.ComponentName) obj16);
                    boolean zF = ((defpackage.maf) obj17).b.f();
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(4565)).y("onServiceConnected: isCleanInit=%b", java.lang.Boolean.valueOf(zF));
                    if (!zF) {
                        ((defpackage.maf) obj17).b();
                        return;
                    }
                    defpackage.mac macVar = ((defpackage.maf) obj17).b;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 4567)).y("notifyClientReady(%s)", macVar);
                    defpackage.tna.i(new defpackage.kzz(obj17, macVar, 19));
                    return;
                }
            case 19:
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL_WIDGET, defpackage.zbd.ld);
                rrvVarH.p((android.content.ComponentName) this.b);
                defpackage.abor aborVarE = rrvVarH.E();
                int iA = ((nvh) this.c).x.a();
                aborVarE.t();
                defpackage.zaf zafVar = (defpackage.zaf) aborVarE.b;
                defpackage.zaf zafVar2 = defpackage.zaf.a;
                zafVar.d = iA - 1;
                zafVar.b = 2 | zafVar.b;
                defpackage.omf.u().F(rrvVarH.l());
                ((noe) this.a).l.run();
                return;
            default:
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView = (com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) this.c;
                android.content.Context context = railWidgetView.getContext();
                java.lang.Object obj18 = this.a;
                java.lang.Object obj19 = this.b;
                railWidgetView.d(context, (com.google.android.material.button.MaterialButton) obj19, (defpackage.noc) obj18);
                ((com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton) obj19).animate().alpha(1.0f).setDuration(83L);
                return;
        }
    }

    public /* synthetic */ jdh(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ jdh(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ jdh(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ jdh(kzy kzyVar, tal talVar, defpackage.ygw ygwVar, int i) {
        this.d = i;
        this.b = kzyVar;
        this.a = talVar;
        this.c = ygwVar;
    }

    public /* synthetic */ jdh(defpackage.maf mafVar, android.os.IBinder iBinder, android.content.ComponentName componentName, int i) {
        this.d = i;
        this.c = mafVar;
        this.a = iBinder;
        this.b = componentName;
    }
}
