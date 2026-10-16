package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ret {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public ret(defpackage.shg shgVar, defpackage.afak afakVar) {
        this.e = shgVar;
        this.f = afakVar;
        int i = 4;
        this.a = new defpackage.lam(new defpackage.rdj(this, i), new defpackage.rer(this, 3));
        int i2 = 5;
        this.b = new defpackage.lam(new defpackage.rdj(this, i2), new defpackage.rer(this, i));
        int i3 = 6;
        this.c = new defpackage.lam(new defpackage.rdj(this, i3), new defpackage.rer(this, i2));
        this.d = new defpackage.lam(new defpackage.rdj(this, 7), new defpackage.rer(this, i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afak, java.lang.Object] */
    public final com.google.android.gms.car.CarUiInfo a() throws defpackage.qst {
        return (com.google.android.gms.car.CarUiInfo) ((defpackage.rps) this.f.a()).b(new defpackage.rdo(this, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afak, java.lang.Object] */
    public final void b(defpackage.rdf rdfVar) throws defpackage.qst {
        ((defpackage.rps) this.f.a()).g(new defpackage.req(this, rdfVar, 3));
    }

    public final void c(defpackage.rdf rdfVar) {
        ((defpackage.lam) this.a).F(new defpackage.rdn(rdfVar, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, zgn] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
    public final defpackage.whw d(defpackage.whg whgVar) {
        ?? r0 = this.b;
        android.net.Uri uri = whgVar.a;
        android.util.Pair pairCreate = (android.util.Pair) r0.get(uri);
        if (pairCreate == null) {
            defpackage.ysr.bc(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            java.lang.String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            defpackage.ysr.bc((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            defpackage.ysr.aY(whgVar.b != null, "Proto schema cannot be null");
            defpackage.ysr.aY(whgVar.c != null, "Handler cannot be null");
            defpackage.wht whtVar = whgVar.e;
            ?? r7 = this.f;
            java.lang.String strA = whtVar.a();
            defpackage.why whyVar = (defpackage.why) r7.get(strA);
            defpackage.ysr.bc(whyVar != 0, "No XDataStoreVariantFactory registered for ID %s", strA);
            java.lang.String lastPathSegment2 = uri.getLastPathSegment();
            java.lang.String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
            int iLastIndexOf2 = strSubstring.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            defpackage.zhs zhoVar = uri == null ? defpackage.zho.a : new defpackage.zho(uri);
            ?? r6 = this.c;
            defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
            int i = defpackage.zgh.c;
            defpackage.zgf zgfVar = new defpackage.zgf(zhoVar, r6);
            zhoVar.c(zgfVar, defpackage.ysr.ch(zgtVar, zgfVar));
            ?? r2 = this.e;
            defpackage.whx whxVarB = whyVar.b(whgVar, strSubstring, r2, (defpackage.ngb) this.d);
            whyVar.a();
            defpackage.whw whwVar = new defpackage.whw(whxVarB, zgfVar);
            defpackage.ygw ygwVar = whgVar.d;
            if (!ygwVar.isEmpty()) {
                whwVar.b(new whe(ygwVar, (java.util.concurrent.Executor) r2));
            }
            pairCreate = android.util.Pair.create(whwVar, whgVar);
            android.util.Pair pair = (android.util.Pair) r0.putIfAbsent(uri, pairCreate);
            if (pair != null) {
                pairCreate = pair;
            }
        }
        defpackage.whw whwVar2 = (defpackage.whw) pairCreate.first;
        defpackage.whg whgVar2 = (defpackage.whg) pairCreate.second;
        if (whgVar.equals(whgVar2)) {
            return whwVar2;
        }
        defpackage.abpy abpyVar = whgVar.b;
        java.lang.String strAR = defpackage.ysr.aR("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", abpyVar.getClass().getSimpleName(), uri);
        defpackage.ysr.bc(uri.equals(whgVar2.a), strAR, "uri");
        defpackage.ysr.bc(abpyVar.equals(whgVar2.b), strAR, "schema");
        defpackage.ysr.bc(whgVar.c.equals(whgVar2.c), strAR, "handler");
        defpackage.ysr.bc(defpackage.ysr.W(whgVar.d, whgVar2.d), strAR, "migrations");
        defpackage.ysr.bc(whgVar.e.equals(whgVar2.e), strAR, "variantConfig");
        defpackage.ysr.bc(whgVar.f == whgVar2.f, strAR, "useGeneratedExtensionRegistry");
        throw new java.lang.IllegalArgumentException(defpackage.ysr.aR(strAR, "unknown"));
    }

    public ret(defpackage.vtm vtmVar, defpackage.zhw zhwVar, java.util.Random random, defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3) {
        this.e = vtmVar;
        this.b = zhwVar;
        this.a = random;
        this.c = afakVar;
        this.d = afakVar2;
        this.f = afakVar3;
    }

    public ret(defpackage.wfs wfsVar) {
        this.b = wfsVar.a;
        this.d = wfsVar.b;
        this.e = wfsVar.c;
        this.c = wfsVar.d;
        this.f = wfsVar.e;
        this.a = wfsVar.f;
    }

    public ret(java.util.concurrent.Executor executor, defpackage.ngb ngbVar, defpackage.whz whzVar, java.util.Map map) {
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        executor.getClass();
        this.e = executor;
        ngbVar.getClass();
        this.d = ngbVar;
        this.a = whzVar;
        this.f = map;
        if (!map.isEmpty()) {
            this.c = new defpackage.whh(0);
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public ret(defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4, defpackage.afak afakVar5, defpackage.afak afakVar6) {
        this.a = afakVar;
        this.d = afakVar2;
        this.e = afakVar3;
        this.b = afakVar4;
        this.f = afakVar5;
        this.c = afakVar6;
    }
}
