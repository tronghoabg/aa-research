package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kll implements aizk {
    final /* synthetic */ aizk a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public kll(defpackage.afgq afgqVar, aizk aizkVar, defpackage.affg affgVar, int i) {
        this.d = i;
        this.c = afgqVar;
        this.a = aizkVar;
        this.b = affgVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    /* JADX WARN: Type inference failed for: r15v5, types: [affg, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.afer aferVarA;
        aizy aizyVar;
        int i = this.d;
        if (i == 0) {
            java.lang.Object objA = this.a.a(((eii) obj).a(((klq) this.b).a((klx) this.c)), afdkVar);
            return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
        }
        gaz gboVar = null;
        int i2 = 0;
        if (i == 1) {
            int iOrdinal = ((gbq) obj).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    java.lang.Object obj2 = this.c;
                    java.lang.Object obj3 = this.b;
                    ebx ebxVar = ebx.c;
                    gfa gfaVar = (gfa) obj2;
                    java.lang.String packageName = gfaVar.getPackageName();
                    defpackage.kdj kdjVarU = gfaVar.u();
                    kdjVarU.getClass();
                    java.lang.String str = java.lang.String.format("android.resource://%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{packageName, ebxVar.invoke(kdjVarU)}, 2));
                    str.getClass();
                    android.net.Uri uri = android.net.Uri.parse(str);
                    uri.getClass();
                    gboVar = new gbo(uri, (androidx.car.app.model.CarColor) obj3, 0, (java.lang.String) null, (hce) null);
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.afas();
                    }
                    gboVar = new gaz((androidx.car.app.model.CarColor) this.b);
                }
            }
            java.lang.Object objA2 = this.a.a(gboVar, afdkVar);
            return objA2 == defpackage.afdr.a ? objA2 : defpackage.afbk.a;
        }
        if (i == 2) {
            java.lang.Boolean bool = (java.lang.Boolean) ((eii) obj).a(((klq) this.b).b((klx) this.c));
            java.lang.Object objA3 = this.a.a(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : true), afdkVar);
            return objA3 == defpackage.afdr.a ? objA3 : defpackage.afbk.a;
        }
        if (i == 3) {
            java.lang.Object obj4 = this.c;
            lyc lycVar = (lyc) obj4;
            defpackage.ygw ygwVarA = lycVar.c.a();
            ygwVarA.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(ygwVarA, 10));
            defpackage.you youVarListIterator = ygwVarA.listIterator(0);
            while (youVarListIterator.hasNext()) {
                kra kraVar = (kra) youVarListIterator.next();
                defpackage.ygw ygwVar = kraVar.b;
                ygwVar.getClass();
                krg krgVar = (krg) defpackage.afga.aJ(ygwVar);
                defpackage.lyb lybVar = new defpackage.lyb(krgVar, obj4, kraVar, i2);
                if (krgVar != null) {
                    java.lang.Object obj5 = this.b;
                    java.lang.String str2 = kraVar.a;
                    str2.getClass();
                    aferVarA = lya.a(krgVar, str2, defpackage.mkc.R().i(((android.content.Context) obj5).getPackageManager(), lycVar.b.getPackageName()));
                } else {
                    aferVarA = null;
                }
                java.lang.String str3 = krgVar != null ? lycVar.f : lycVar.g;
                java.lang.String str4 = kraVar.a;
                str4.getClass();
                tlf tlfVar = lycVar.h;
                kraVar.getClass();
                arrayList.add(new ajer(str4, str3, tlfVar.b(defpackage.lwz.g(kraVar)), aferVarA, lybVar));
            }
            java.lang.Object objA4 = this.a.a(arrayList, afdkVar);
            return objA4 == defpackage.afdr.a ? objA4 : defpackage.afbk.a;
        }
        if (i == 4) {
            aizh aizhVar = (aizh) this.c;
            java.lang.Object objInvoke = aizhVar.a.invoke(obj);
            defpackage.afgv afgvVar = (defpackage.afgv) this.b;
            java.lang.Object obj6 = afgvVar.a;
            if (obj6 != ajcb.a && ((java.lang.Boolean) aizhVar.b.invoke(obj6, objInvoke)).booleanValue()) {
                return defpackage.afbk.a;
            }
            afgvVar.a = objInvoke;
            return this.a.a(obj, afdkVar);
        }
        if (afdkVar instanceof aizy) {
            aizyVar = (aizy) afdkVar;
            int i3 = aizyVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aizyVar.c = i3 - Integer.MIN_VALUE;
            } else {
                aizyVar = new aizy(this, afdkVar);
            }
        } else {
            aizyVar = new aizy(this, afdkVar);
        }
        java.lang.Object objInvoke2 = aizyVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i4 = aizyVar.c;
        if (i4 == 0) {
            defpackage.afga.cz(objInvoke2);
            if (((defpackage.afgq) this.c).a) {
                aizk aizkVar = this.a;
                aizyVar.c = 1;
                java.lang.Object objA5 = aizkVar.a(obj, aizyVar);
                if (objA5 != afdrVar) {
                    return objA5;
                }
            } else {
                ?? r15 = this.b;
                aizyVar.a = obj;
                aizyVar.c = 2;
                objInvoke2 = r15.invoke(obj, aizyVar);
                if (objInvoke2 != afdrVar) {
                }
            }
        }
        if (i4 == 1) {
            defpackage.afga.cz(objInvoke2);
            return objInvoke2;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(objInvoke2);
            return objInvoke2;
        }
        obj = aizyVar.a;
        defpackage.afga.cz(objInvoke2);
        if (((java.lang.Boolean) objInvoke2).booleanValue()) {
            return defpackage.afbk.a;
        }
        ((defpackage.afgq) this.c).a = true;
        aizk aizkVar2 = this.a;
        aizyVar.a = null;
        aizyVar.c = 3;
        java.lang.Object objA6 = aizkVar2.a(obj, aizyVar);
        return objA6 == afdrVar ? afdrVar : objA6;
    }

    public kll(aizh aizhVar, defpackage.afgv afgvVar, aizk aizkVar, int i) {
        this.d = i;
        this.c = aizhVar;
        this.b = afgvVar;
        this.a = aizkVar;
    }

    public kll(aizk aizkVar, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.d = i;
        this.a = aizkVar;
        this.c = obj;
        this.b = obj2;
    }

    public kll(aizk aizkVar, klq klqVar, klx klxVar, int i) {
        this.d = i;
        this.a = aizkVar;
        this.b = klqVar;
        this.c = klxVar;
    }
}
