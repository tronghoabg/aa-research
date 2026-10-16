package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class imx implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ imx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:119:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        int i;
        defpackage.qvl qvlVarB;
        defpackage.rdd rddVar;
        defpackage.rdd rddVar2;
        defpackage.rxo rxmVar;
        java.lang.String strFlattenToString;
        boolean zR;
        int i2 = 2;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                defpackage.inh inhVar = (defpackage.inh) this.a;
                defpackage.jkf jkfVar = inhVar.al;
                java.lang.Object obj = this.c;
                defpackage.ive iveVar = (defpackage.ive) this.b;
                jkfVar.a(iveVar, (java.util.UUID) obj);
                inhVar.am.a(iveVar);
                return;
            case 1:
                defpackage.bgk bgkVar = (defpackage.bgk) this.c;
                android.view.ActionMode actionModeU = defpackage.axd.U(bgkVar.a, (defpackage.bgh) this.a);
                bgkVar.f = actionModeU;
                if (actionModeU == null) {
                    ((defpackage.bgi) this.b).a();
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqj yqjVar = (defpackage.yqj) defpackage.ioh.b.l().ai(626);
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.c;
                yqjVar.M("Starting %s in backoff on %s.", obj2, obj3);
                ((defpackage.ioh) this.b).at((android.content.Intent) obj2, (com.google.android.gms.car.display.CarRegionId) obj3);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.inx inxVar = (defpackage.inx) ((defpackage.inw) this.b).d;
                com.google.android.gms.car.display.CarRegionId carRegionId = inxVar.d;
                defpackage.iny inyVar = inxVar.g;
                defpackage.ioh iohVar = inyVar.m;
                iohVar.W(carRegionId);
                if (!iohVar.ap(inxVar.d)) {
                    ((defpackage.inn) this.a).w((defpackage.ioa) this.c);
                    return;
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.f()).ai(628)).y("Launch canceled for %s", this.a);
                inyVar.d();
                inyVar.c();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.jdk) this.a).c((defpackage.qug) this.c);
                java.lang.Object obj4 = this.b;
                synchronized (((defpackage.jdl) obj4).h) {
                    ((defpackage.jdl) obj4).i--;
                    break;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar = defpackage.jkx.a;
                defpackage.jhi jhiVar = ((defpackage.inh) this.c).w;
                defpackage.yqm yqmVar2 = defpackage.jkx.a;
                ?? r8 = this.b;
                ((defpackage.yqj) yqmVar2.l().ai((char) 2265)).y("renderWatermark to window %s", r8);
                android.view.Surface surfaceAL = r8.aL();
                java.lang.Object obj5 = this.a;
                if (surfaceAL == null || obj5 == null) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai(2266)).M("Unable to renderWatermark: %s, %s", surfaceAL, obj5);
                    return;
                }
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setTextSize(36.0f);
                paint.setColor(-1);
                paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                paint.setAntiAlias(true);
                android.graphics.Canvas canvasLockCanvas = surfaceAL.lockCanvas(null);
                canvasLockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.SRC);
                android.util.Size size = (android.util.Size) obj5;
                int height = size.getHeight() / 2;
                int width = size.getWidth();
                if (jhiVar == null || !defpackage.actb.a.fF().d()) {
                    i = width / 2;
                } else {
                    java.util.List list = jhiVar.a.p;
                    if (list.isEmpty()) {
                        i = width / 2;
                    } else {
                        android.graphics.Rect rect = (android.graphics.Rect) list.get(0);
                        int iWidth = rect.width();
                        i = (width - iWidth) / 2;
                        if (rect.left == 0) {
                            i += iWidth;
                        }
                    }
                }
                float f = height;
                float f2 = i;
                canvasLockCanvas.drawText("PRE-PRODUCTION HARDWARE", f2, f, paint);
                canvasLockCanvas.drawText("NOT FOR RESALE", f2, (f + paint.descent()) - paint.ascent(), paint);
                surfaceAL.unlockCanvasAndPost(canvasLockCanvas);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r0 = this.a;
                android.os.IInterface iInterfaceQueryLocalInterface = r0.queryLocalInterface("com.google.android.gms.car.startup.IStartup");
                try {
                    qvlVarB = (iInterfaceQueryLocalInterface instanceof defpackage.rxo ? (defpackage.rxo) iInterfaceQueryLocalInterface : new defpackage.rxm(r0)).b();
                    if (qvlVarB == null) {
                        try {
                            rddVar2 = new defpackage.rdd("Car service unexpectedly null.");
                        } catch (android.os.RemoteException e) {
                            e = e;
                            rddVar = new defpackage.rdd("Gearhead Car Startup Service failed to become ready.", e);
                            rddVar2 = rddVar;
                        } catch (java.lang.IllegalStateException e2) {
                            e = e2;
                            rddVar = new defpackage.rdd("Gearhead Car Startup Service had an internal failure.", e);
                            rddVar2 = rddVar;
                        } catch (java.lang.SecurityException e3) {
                            e = e3;
                            rddVar = new defpackage.rdd("Not allowed to access the Gearhead Car Service.", e);
                            rddVar2 = rddVar;
                        }
                    } else {
                        rddVar2 = null;
                    }
                    break;
                } catch (android.os.RemoteException e4) {
                    e = e4;
                    qvlVarB = null;
                } catch (java.lang.IllegalStateException e5) {
                    e = e5;
                    qvlVarB = null;
                } catch (java.lang.SecurityException e6) {
                    e = e6;
                    qvlVarB = null;
                }
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.c;
                if (rddVar2 != null) {
                    defpackage.rrx.d(5, "GH.GhCarClientCtor", rddVar2, "fetchStartupService failed", new java.lang.Object[0]);
                    ((defpackage.rem) obj7).g(rddVar2, (defpackage.doe) obj6);
                    return;
                }
                if (defpackage.rrx.e("GH.GhCarClientCtor", 4)) {
                    defpackage.rrx.d(4, "GH.GhCarClientCtor", null, "Bound to startup service, got Car Service: %s", new defpackage.zkf(defpackage.zke.a, qvlVarB));
                }
                synchronized (obj7) {
                    if (obj6 != null) {
                        qvlVarB.getClass();
                        ((defpackage.doe) obj6).b(qvlVarB);
                    }
                    break;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.wyz) this.a).l((java.util.UUID) this.c, (com.google.android.gms.car.display.CarDisplayId) this.b);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.sau sauVar = (defpackage.sau) ((defpackage.qzx) this.c).a.get();
                if (sauVar != null) {
                    sauVar.m((com.google.android.gms.car.DrawingSpec) this.b, (android.content.res.Configuration) this.a);
                    return;
                }
                return;
            case 9:
                defpackage.shp shpVar = ((defpackage.shu) this.a).g;
                shpVar.getClass();
                defpackage.shu.a.f().ai(8955).u("Connection start services in conman");
                ?? r9 = this.b;
                java.lang.Object obj8 = this.c;
                try {
                    android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliableSocketPair = android.os.ParcelFileDescriptor.createReliableSocketPair();
                    shpVar.g.d.w.c(parcelFileDescriptorArrCreateReliableSocketPair[0]);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    defpackage.you youVarListIterator = ((defpackage.ygw) obj8).listIterator(0);
                    while (youVarListIterator.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((defpackage.rsi) youVarListIterator.next()).a()));
                    }
                    defpackage.rxo rxoVar = shpVar.f;
                    rxoVar.getClass();
                    rxoVar.l(shpVar.b, r9, arrayList, parcelFileDescriptorArrCreateReliableSocketPair[1], shpVar.j);
                    return;
                } catch (android.os.RemoteException | java.io.IOException | java.lang.IllegalArgumentException e7) {
                    defpackage.shu.a.f().p(e7).ai(8956).u("Start required services had exception");
                    shpVar.h.d.post(new defpackage.sho(shpVar, i2));
                    return;
                }
            default:
                ?? r1 = this.b;
                if (r1 == 0) {
                    rxmVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = r1.queryLocalInterface("com.google.android.gms.car.startup.IStartup");
                    rxmVar = iInterfaceQueryLocalInterface2 instanceof defpackage.rxo ? (defpackage.rxo) iInterfaceQueryLocalInterface2 : new defpackage.rxm(r1);
                }
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.a;
                defpackage.sid sidVar = ((defpackage.shy) obj9).a;
                sidVar.e();
                if (!j$.util.Objects.equals(obj10, sidVar.i.e)) {
                    throw new java.lang.IllegalArgumentException();
                }
                if (obj10 != null) {
                    android.content.ComponentName componentName = (android.content.ComponentName) obj10;
                    if (sidVar.i(componentName.getPackageName())) {
                        strFlattenToString = componentName.flattenToString();
                    } else if (obj10 == null) {
                        strFlattenToString = "null";
                    } else {
                        strFlattenToString = "<unknown>";
                    }
                } else if (obj10 == null) {
                    strFlattenToString = "null";
                } else {
                    strFlattenToString = "<unknown>";
                }
                java.lang.String str = strFlattenToString;
                try {
                    zR = rxmVar.r(sidVar.c);
                    try {
                        defpackage.ypu ypuVarAi = defpackage.sid.a.f().ai(8989);
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zR);
                        defpackage.zke zkeVar = defpackage.zke.a;
                        ypuVarAi.M("onStartupServiceAvailable - IStartup interest is %b for %s", new defpackage.zkf(zkeVar, boolValueOf), new defpackage.zkf(zkeVar, str));
                    } catch (android.os.RemoteException e8) {
                        e = e8;
                        if (defpackage.adax.a.fF().ah()) {
                            throw new java.lang.IllegalStateException("onStartupServiceAvailable: component is not interested", e);
                        }
                        defpackage.ypu ypuVarAi2 = defpackage.sid.a.h().p(e).ai(8990);
                        defpackage.zke zkeVar2 = defpackage.zke.a;
                        ypuVarAi2.M("onStartupServiceAvailable - RemoteException for %s, exception: %s", new defpackage.zkf(zkeVar2, str), new defpackage.zkf(zkeVar2, e.toString()));
                    }
                    break;
                } catch (android.os.RemoteException e9) {
                    e = e9;
                    zR = false;
                }
                if (zR) {
                    sidVar.i.f = rxmVar;
                } else {
                    defpackage.sic sicVar = sidVar.i;
                    sicVar.e = null;
                    if (sicVar.a) {
                        sidVar.b.unbindService(sidVar.h);
                        sicVar.a = false;
                    }
                }
                sidVar.j.c((android.content.ComponentName) obj10, zR);
                return;
        }
    }

    public /* synthetic */ imx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public imx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj2;
        this.c = obj3;
        this.b = obj;
    }

    public /* synthetic */ imx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ imx(defpackage.qzx qzxVar, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.res.Configuration configuration, int i) {
        this.d = i;
        this.c = qzxVar;
        this.b = drawingSpec;
        this.a = configuration;
    }

    public /* synthetic */ imx(defpackage.wyz wyzVar, java.util.UUID uuid, com.google.android.gms.car.display.CarDisplayId carDisplayId, int i) {
        this.d = i;
        this.a = wyzVar;
        this.c = uuid;
        this.b = carDisplayId;
    }
}
