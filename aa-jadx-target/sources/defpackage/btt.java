package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class btt extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(aack aackVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = aackVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.btt((defpackage.btw) this.b, afdkVar, 0);
            case 1:
                return new defpackage.btt((brz) this.b, afdkVar, 1);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.btt((defpackage.crv) this.b, afdkVar, 2);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.btt((defpackage.cus) this.b, afdkVar, 3);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.btt((aack) this.b, afdkVar, 4);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.btt((aack) this.b, afdkVar, 5, (byte[]) null);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.btt((aack) this.b, afdkVar, 6, (char[]) null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.btt((aack) this.b, afdkVar, 7, (short[]) null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.btt((defpackage.egk) this.b, afdkVar, 8);
            case 9:
                return new defpackage.btt((defpackage.egk) this.b, afdkVar, 9, (byte[]) null);
            case 10:
                return new defpackage.btt((defpackage.ndd) this.b, afdkVar, 10);
            case 11:
                return new defpackage.btt((defpackage.epf) this.b, afdkVar, 11);
            case 12:
                return new defpackage.btt((eyy) this.b, afdkVar, 12);
            case 13:
                return new defpackage.btt((fab) this.b, afdkVar, 13);
            case 14:
                return new defpackage.btt((aium) this.b, afdkVar, 14);
            case 15:
                return new defpackage.btt((androidx.work.CoroutineWorker) this.b, afdkVar, 15);
            case 16:
                return new defpackage.btt((androidx.work.CoroutineWorker) this.b, afdkVar, 16, (byte[]) null);
            case 17:
                return new defpackage.btt((fmg) this.b, afdkVar, 17);
            case 18:
                return new defpackage.btt((fmg) this.b, afdkVar, 18, (byte[]) null);
            case 19:
                return new defpackage.btt((androidx.work.impl.workers.ConstraintTrackingWorker) this.b, afdkVar, 19);
            default:
                return new defpackage.btt((fqm) this.b, afdkVar, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [cri, java.lang.Object] */
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
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        flx fmeVar;
        flx fmdVar;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.afdr afdrVar = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    java.lang.Object obj2 = this.b;
                    java.lang.Float f = new java.lang.Float(0.0f);
                    this.a = 1;
                    if (((defpackage.btw) obj2).j.e(f, this) == afdrVar) {
                        return afdrVar;
                    }
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.afdr afdrVar2 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    defpackage.afgt afgtVar = new defpackage.afgt();
                    java.lang.Object obj3 = this.b;
                    aizj aizjVarA = ((brz) obj3).a.a();
                    fmv fmvVar = new fmv(afgtVar, obj3, 1);
                    this.a = 1;
                    if (aizjVarA.hd(fmvVar, this) == afdrVar2) {
                        return afdrVar2;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.afdr afdrVar3 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    ?? r8 = this.b;
                    androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler = ((defpackage.crv) r8).c;
                    this.a = 2;
                    if (pointerInputEventHandler.invoke(r8, this) == afdrVar3) {
                        return afdrVar3;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.afdr afdrVar4 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    long j = ((defpackage.cus) this.b).a;
                    this.a = 1;
                    if (aipw.c(j, this) == afdrVar4) {
                        return afdrVar4;
                    }
                }
                ((defpackage.cus) this.b).d();
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object obj4 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    java.lang.Object obj5 = this.b;
                    this.a = 1;
                    aiug aiugVar = new aiug(defpackage.afga.s(this), 1);
                    aiugVar.z();
                    aack aackVar = (aack) obj5;
                    dxn dxnVar = new dxn(aiugVar, aackVar);
                    ((se) aackVar.a).k(dxnVar, new android.os.Handler(android.os.Looper.getMainLooper()));
                    aiugVar.d(new defpackage.daq(obj5, dxnVar, 2));
                    java.lang.Object objK = aiugVar.k();
                    if (objK != obj4) {
                        objK = defpackage.afbk.a;
                    }
                    if (objK == obj4) {
                        return obj4;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.afdr afdrVar5 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                java.lang.Object obj6 = this.b;
                this.a = 1;
                aiug aiugVar2 = new aiug(defpackage.afga.s(this), 1);
                aiugVar2.z();
                android.os.IBinder eyvVar = new eyv(aiugVar2, 1);
                android.util.Log.d("CallExtensions", "registerWithRemoteService: sending event:");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBinder("androidx.core.telecom.extensions.extra.CAPABILITY_EXCHANGE_BINDER", eyvVar);
                bundle.putInt("androidx.core.telecom.extensions.extra.CAPABILITY_EXCHANGE_VERSION", 1);
                je$.ExternalSyntheticApiModelOutline0.m((android.telecom.Call) ((se) ((aack) obj6).a).a, "android.telecom.event.CAPABILITY_EXCHANGE", bundle);
                java.lang.Object objK2 = aiugVar2.k();
                return objK2 == afdrVar5 ? afdrVar5 : objK2;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afdr afdrVar6 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                aack aackVar2 = (aack) this.b;
                aizj aizjVarJ = ((se) aackVar2.a).j();
                defpackage.dxw dxwVar = new defpackage.dxw(aackVar2, (defpackage.afdk) null, 1);
                this.a = 1;
                java.lang.Object objX = afsg.x(aizjVarJ, dxwVar, this);
                return objX == afdrVar6 ? afdrVar6 : objX;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.afdr afdrVar7 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                aizj aizjVarJ2 = ((se) ((aack) this.b).a).j();
                this.a = 1;
                java.lang.Object objW = afsg.w(aizjVarJ2, this);
                return objW == afdrVar7 ? afdrVar7 : objW;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afdr afdrVar8 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                defpackage.egw egwVarC = ((defpackage.egk) this.b).c();
                this.a = 1;
                java.lang.Object objA = egwVarC.a(this);
                return objA == afdrVar8 ? afdrVar8 : objA;
            case 9:
                defpackage.afdr afdrVar9 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                defpackage.egw egwVarC2 = ((defpackage.egk) this.b).c();
                this.a = 1;
                java.lang.Object objA2 = egwVarC2.a(this);
                return objA2 == afdrVar9 ? afdrVar9 : objA2;
            case 10:
                defpackage.afdr afdrVar10 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                java.lang.Object obj7 = this.b;
                this.a = 1;
                java.lang.Object objD = ((defpackage.egk) ((defpackage.ndd) obj7).a).d(this);
                return objD == afdrVar10 ? afdrVar10 : objD;
            case 11:
                defpackage.afdr afdrVar11 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    java.lang.Object obj8 = this.b;
                    this.a = 1;
                    if (aipw.c(((defpackage.epf) obj8).c, this) == afdrVar11) {
                        return afdrVar11;
                    }
                }
                defpackage.epf epfVar = (defpackage.epf) this.b;
                if (!epfVar.a.n()) {
                    aiwg aiwgVar = epfVar.f;
                    if (aiwgVar != null) {
                        aiwgVar.s((java.util.concurrent.CancellationException) null);
                    }
                    epfVar.f = null;
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.afdr afdrVar12 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    java.lang.Object obj9 = this.b;
                    this.a = 1;
                    if (((eyy) obj9).a(this) == afdrVar12) {
                        return afdrVar12;
                    }
                }
                return defpackage.afbk.a;
            case 13:
                defpackage.afdr afdrVar13 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    java.lang.Object obj10 = this.b;
                    this.a = 1;
                    if (((fab) obj10).e(this) == afdrVar13) {
                        return afdrVar13;
                    }
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.afdr afdrVar14 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                java.lang.Object obj11 = this.b;
                this.a = 1;
                java.lang.Object objGX = ((aiwn) obj11).gX(this);
                return objGX == afdrVar14 ? afdrVar14 : objGX;
            case 15:
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                this.a = 1;
                throw new java.lang.IllegalStateException("Not implemented");
            case 16:
                defpackage.afdr afdrVar15 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                java.lang.Object obj12 = this.b;
                this.a = 1;
                java.lang.Object objC = ((androidx.work.CoroutineWorker) obj12).c(this);
                return objC == afdrVar15 ? afdrVar15 : objC;
            case 17:
                defpackage.afdr afdrVar16 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                java.lang.Object obj13 = this.b;
                this.a = 1;
                java.lang.Object objB = ((fmg) obj13).b(this);
                return objB == afdrVar16 ? afdrVar16 : objB;
            case 18:
                defpackage.afdr afdrVar17 = defpackage.afdr.a;
                try {
                    if (this.a != 0) {
                        defpackage.afga.cz(obj);
                    } else {
                        defpackage.afga.cz(obj);
                        java.lang.Object obj14 = this.b;
                        aiwi aiwiVar = ((fmg) obj14).j;
                        defpackage.btt bttVar = new defpackage.btt((fmg) obj14, (defpackage.afdk) null, 17);
                        this.a = 1;
                        obj = ahoc.a(aiwiVar, bttVar, this);
                        if (obj == afdrVar17) {
                            return afdrVar17;
                        }
                    }
                    fmeVar = (flx) obj;
                    break;
                } catch (flz e) {
                    fmdVar = new fmd(e.a);
                } catch (java.util.concurrent.CancellationException unused) {
                    fmeVar = new fmb();
                } catch (java.lang.Throwable th) {
                    java.lang.String str = fmh.a;
                    fjv.a();
                    android.util.Log.e(str, "Unexpected error in WorkerWrapper", th);
                    fmeVar = new fme(false);
                }
                fmdVar = fmeVar;
                java.lang.Object obj15 = this.b;
                defpackage.afgq afgqVar = new defpackage.afgq();
                ((fmg) obj15).e.m(new ae(fmdVar, afgqVar, obj15, 13, (short[]) null));
                return java.lang.Boolean.valueOf(afgqVar.a);
            case 19:
                defpackage.afdr afdrVar18 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                java.lang.Object obj16 = this.b;
                this.a = 1;
                java.lang.Object objI = ((androidx.work.impl.workers.ConstraintTrackingWorker) obj16).i(this);
                return objI == afdrVar18 ? afdrVar18 : objI;
            default:
                defpackage.afdr afdrVar19 = defpackage.afdr.a;
                int i = this.a;
                defpackage.afga.cz(obj);
                if (i == 0) {
                    java.lang.Object obj17 = this.b;
                    aizj aizjVarAu = defpackage.dai.au(new fke(obj17, 13));
                    fqm fqmVar = (fqm) obj17;
                    aizj aizjVarA2 = ajab.a(aizjVarAu, new gjf(fqmVar, (defpackage.afdk) null, 1));
                    fqj fqjVar = new fqj(fqmVar);
                    this.a = 1;
                    if (aizjVarA2.hd(fqjVar, this) == afdrVar19) {
                        return afdrVar19;
                    }
                }
                return defpackage.afbk.a;
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 1:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return ((defpackage.btt) b(bool, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 9:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.booleanValue();
                return ((defpackage.btt) b(bool2, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 10:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 11:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 12:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 13:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 14:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 15:
                defpackage.afdk afdkVarB = b((aiuw) obj, (defpackage.afdk) obj2);
                defpackage.afbk afbkVar = defpackage.afbk.a;
                ((defpackage.btt) afdkVarB).hf(afbkVar);
                return afbkVar;
            case 16:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 17:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 18:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 19:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            default:
                return ((defpackage.btt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(aack aackVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = aackVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(aack aackVar, defpackage.afdk afdkVar, int i, char[] cArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = aackVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(aack aackVar, defpackage.afdk afdkVar, int i, short[] sArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = aackVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(aium aiumVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = aiumVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(androidx.work.CoroutineWorker coroutineWorker, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(androidx.work.CoroutineWorker coroutineWorker, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = constraintTrackingWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(brz brzVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = brzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(defpackage.btw btwVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = btwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(defpackage.crv crvVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = crvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(defpackage.cus cusVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = cusVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(defpackage.egk egkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = egkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(defpackage.egk egkVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = egkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(defpackage.epf epfVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = epfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(eyy eyyVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = eyyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(fab fabVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = fabVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(fmg fmgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = fmgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(fmg fmgVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = fmgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(fqm fqmVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = fqmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(defpackage.ndd nddVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = nddVar;
    }
}
