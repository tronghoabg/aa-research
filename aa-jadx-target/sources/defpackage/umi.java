package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class umi implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ umi(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, vbb] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, zhs] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, ulj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, udx] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, udc] */
    /* JADX WARN: Type inference failed for: r9v55, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object, vav] */
    @Override // java.lang.Runnable
    public final void run() {
        android.content.SharedPreferences.Editor editorEdit = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((umk) this.a).c((umm) this.b);
                return;
            case 1:
                rfz rfzVar = new rfz((byte[]) null, (byte[]) null);
                ?? r1 = this.b;
                ((ugf) r1).e(rfzVar);
                zen zenVarG = this.a.G((udx) r1, rfzVar);
                ugo ugoVar = (ugo) r1;
                ugoVar.i = zenVarG;
                ugoVar.E();
                synchronized (ugoVar.g) {
                    ((ugo) r1).k = false;
                    break;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ?? r0 = this.b;
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    if (!r0.isEmpty()) {
                        ((umk) obj).e((java.util.List) r0);
                        r0.clear();
                    }
                    break;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                pku pkuVarB = this.a.b();
                if (pkuVarB == null) {
                    return;
                }
                unz unzVar = (unz) this.b;
                if (pkuVarB.o) {
                    pks pksVar = pkuVarB.c;
                    if (pksVar == null) {
                        pksVar = pks.a;
                    }
                    if (!pksVar.h.isEmpty()) {
                        pks pksVar2 = pkuVarB.c;
                        if (pksVar2 == null) {
                            pksVar2 = pks.a;
                        }
                        if (!pksVar2.h.equals(unzVar.u.o())) {
                            return;
                        }
                    }
                    pks pksVar3 = pkuVarB.c;
                    if (pksVar3 == null) {
                        pksVar3 = pks.a;
                    }
                    if (!pksVar3.d.isEmpty()) {
                        pks pksVar4 = pkuVarB.c;
                        if (pksVar4 == null) {
                            pksVar4 = pks.a;
                        }
                        if (!pksVar4.d.equals(java.util.Locale.getDefault().toLanguageTag())) {
                            return;
                        }
                    }
                    return;
                }
                defpackage.tmy tmyVar = unzVar.e;
                if (qsp.M(pkuVarB, tmyVar)) {
                    return;
                }
                pks pksVar5 = pkuVarB.c;
                if (pksVar5 == null) {
                    pksVar5 = pks.a;
                }
                if (!pksVar5.h.isEmpty()) {
                    pks pksVar6 = pkuVarB.c;
                    if (pksVar6 == null) {
                        pksVar6 = pks.a;
                    }
                    if (!pksVar6.h.equals(unzVar.u.o())) {
                        return;
                    }
                }
                pks pksVar7 = pkuVarB.c;
                if (pksVar7 == null) {
                    pksVar7 = pks.a;
                }
                if (!pksVar7.d.isEmpty()) {
                    pks pksVar8 = pkuVarB.c;
                    if (pksVar8 == null) {
                        pksVar8 = pks.a;
                    }
                    if (!pksVar8.d.equals(java.util.Locale.getDefault().toLanguageTag())) {
                        return;
                    }
                }
                if (unzVar.g != 0 && unzVar.g != pkuVarB.k) {
                    return;
                }
                if (pkuVarB.e != unzVar.h) {
                    return;
                } else if (qsp.O(pkuVarB, tmyVar)) {
                    return;
                } else {
                    return;
                }
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                vbn.d();
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                byte[] bArr = ((uqw) obj2).c;
                if (bArr != null) {
                    ((uoi) obj3).b.a(bArr);
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((uoi) this.a).c.a((java.lang.String) this.b);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                upy upyVar = (upy) this.a;
                long jA = upyVar.a();
                upz upzVar = (upz) this.b;
                ((defpackage.ype) ((defpackage.ype) upz.a.f()).ai(9553)).x("Database cache size: %d bytes", jA);
                upzVar.h(upyVar);
                for (java.io.File file : upzVar.k()) {
                    if (!file.equals(upzVar.f()) && file.exists()) {
                        java.lang.String[] strArr = upz.b;
                        for (int i = 0; i < 3; i++) {
                            uzi.c(new java.io.File(file, strArr[i]));
                        }
                    }
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((upz) this.b).h((upy) this.a);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                uqk uqkVar = ((uqh) this.a).a;
                if (uqkVar.m != null) {
                    uqkVar.m.a((aciy) this.b);
                    return;
                }
                return;
            case 9:
                urr urrVar = (urr) this.b;
                urrVar.e((urn) this.a, urrVar.f);
                return;
            case 10:
                ((uyv) this.a).b.removeCallbacks(this.b);
                return;
            case 11:
                defpackage.xei xeiVar = ((uzw) this.b).a;
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = xeiVar.a;
                synchronized (obj5) {
                    ((uqw) obj5).i((android.graphics.Bitmap) obj4);
                    ((uqw) obj5).f();
                    break;
                }
                return;
            case 12:
                java.lang.Object obj6 = this.b;
                if (((vbd) obj6).a) {
                    return;
                }
                ?? r9 = this.a;
                vba vbaVar = (vba) r9;
                vbaVar.p(true);
                try {
                    ((vbd) obj6).c.a((vav) r9);
                    return;
                } finally {
                    vbaVar.p(false);
                }
            case 13:
                ((vle) this.a).a.p(defpackage.rox.ai((org.chromium.net.CronetException) this.b));
                return;
            case 14:
                ((vlj) this.a).a.p(defpackage.rox.ai((org.chromium.net.CronetException) this.b));
                return;
            case 15:
                defpackage.xyn xynVar = (defpackage.xyn) this.b;
                boolean zF = xynVar.f();
                java.lang.Object obj7 = this.a;
                if (!zF || ((java.lang.Boolean) ((defpackage.afak) xynVar.b()).a()).booleanValue()) {
                    synchronized (obj7) {
                        ((vuz) obj7).a = true;
                        android.app.Activity activity = ((vuz) obj7).b;
                        if (activity != null) {
                            ((vuz) obj7).c(activity);
                        }
                        ((vuz) obj7).b = null;
                        break;
                    }
                    return;
                }
                return;
            case 16:
                ((defpackage.vvx) this.b).c.g.a(5, ((defpackage.vlu) this.a).a);
                return;
            case 17:
                android.content.SharedPreferences sharedPreferences = ((android.content.Context) this.a).getSharedPreferences("PhenotypeStickyAccount", 0);
                for (java.util.Map.Entry<java.lang.String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    if (entry.getValue() instanceof java.lang.String) {
                        if (entry.getValue().equals(this.b)) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferences.edit();
                            }
                            editorEdit.remove(entry.getKey());
                        }
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    return;
                }
                return;
            case 18:
                try {
                    defpackage.ysr.cw(this.b);
                    return;
                } catch (java.lang.Exception e) {
                    android.util.Log.w("FlagStore", "Failed to store account on flag read for: " + ((defpackage.wdn) this.a).e + " which may lead to stale flags.", e);
                    return;
                }
            case 19:
                ((defpackage.wdn) this.a).c(this.b);
                return;
            default:
                wis wisVar = (wis) this.a;
                wisVar.e.b(wisVar.a((abyn) this.b));
                return;
        }
    }

    public /* synthetic */ umi(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public umi(vlj vljVar, org.chromium.net.CronetException cronetException, int i) {
        this.c = i;
        this.b = cronetException;
        this.a = vljVar;
    }
}
