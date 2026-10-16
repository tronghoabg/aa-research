package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cwg implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cwg(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r3v10, types: [cut] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [cuw] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws java.io.IOException {
        defpackage.cuw cuwVar;
        defpackage.cxv cxvVarC;
        defpackage.cuw cuwVar2;
        ?? cutVar = 0;
        ctcVar = null;
        defpackage.ctc ctcVar = null;
        cutVar = 0;
        cutVar = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.cgd cgdVar = ((defpackage.cwi) this.a).a;
                cgdVar.getClass();
                ((defpackage.cvy) cgdVar).d();
                return defpackage.afbk.a;
            case 1:
                ((defpackage.cwi) this.a).v();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((chj) this.a).e();
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.cxw cxwVar = (defpackage.cxw) this.a;
                cxwVar.f.g = 0;
                defpackage.bzc bzcVarK = cxwVar.p().k();
                java.lang.Object[] objArr = bzcVarK.a;
                int i = bzcVarK.b;
                for (int i2 = 0; i2 < i; i2++) {
                    defpackage.cxw cxwVar2 = ((defpackage.cxl) objArr[i2]).w.p;
                    cxwVar2.getClass();
                    cxwVar2.h = cxwVar2.i;
                    cxwVar2.i = Integer.MAX_VALUE;
                    if (cxwVar2.y == 2) {
                        cxwVar2.y = 3;
                    }
                }
                cxwVar.l(new defpackage.cmr(8));
                defpackage.cxv cxvVar = ((defpackage.cxa) cxwVar.k()).g;
                if (cxvVar == null) {
                    throw new java.lang.IllegalStateException("Expected lookahead delegate");
                }
                defpackage.afgv afgvVar = new defpackage.afgv();
                java.util.List listV = cxwVar.p().v();
                int size = listV.size();
                for (int i3 = 0; i3 < size; i3++) {
                    defpackage.cxl cxlVar = (defpackage.cxl) listV.get(i3);
                    defpackage.cxv cxvVarC2 = cxlVar.q().C();
                    if (cxvVarC2 != null) {
                        if (cxvVarC2.m) {
                            defpackage.aan aanVar = (defpackage.aan) afgvVar.a;
                            if (aanVar == null) {
                                aanVar = new defpackage.aan(16);
                            }
                            afgvVar.a = aanVar;
                            ((defpackage.aan) afgvVar.a).p(cxlVar);
                        }
                        cxvVarC2.m = cxvVar.m;
                    }
                }
                cxvVar.K().h();
                java.util.List listV2 = cxwVar.p().v();
                int size2 = listV2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    defpackage.cxl cxlVar2 = (defpackage.cxl) listV2.get(i4);
                    defpackage.aan aanVar2 = (defpackage.aan) afgvVar.a;
                    boolean z = aanVar2 != null && aanVar2.e(cxlVar2);
                    defpackage.cxv cxvVarC3 = cxlVar2.q().C();
                    if (cxvVarC3 != null) {
                        cxvVarC3.m = z;
                    }
                }
                defpackage.bzc bzcVarK2 = cxwVar.p().k();
                java.lang.Object[] objArr2 = bzcVarK2.a;
                int i5 = bzcVarK2.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    defpackage.cxw cxwVar3 = ((defpackage.cxl) objArr2[i6]).w.p;
                    cxwVar3.getClass();
                    int i7 = cxwVar3.h;
                    int i8 = cxwVar3.i;
                    if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                        cxwVar3.s(true);
                    }
                }
                cxwVar.l(new defpackage.cmr(9));
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cxw cxwVar4 = (defpackage.cxw) this.a;
                defpackage.cxv cxvVarC4 = cxwVar4.r().C();
                cxvVarC4.getClass();
                cxvVarC4.v(cxwVar4.v);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cxw cxwVar5 = (defpackage.cxw) this.a;
                if (defpackage.dai.C(cxwVar5.p()) || cxwVar5.f.c) {
                    defpackage.cyl cylVar = cxwVar5.r().x;
                    if (cylVar != null) {
                        cuwVar = cylVar.n;
                    }
                } else {
                    defpackage.cyl cylVar2 = cxwVar5.r().x;
                    if (cylVar2 != null && (cxvVarC = cylVar2.C()) != null) {
                        cuwVar2 = cxvVarC.n;
                    }
                }
                if (cutVar == 0) {
                    cutVar = cuwVar;
                    cutVar = cuwVar2;
                    cutVar = new defpackage.cut(defpackage.cxo.a(cxwVar5.p()));
                }
                cutVar = cuwVar;
                cutVar = cuwVar2;
                defpackage.cxv cxvVarC5 = cxwVar5.r().C();
                cxvVarC5.getClass();
                cutVar.s(cxvVarC5, cxwVar5.m, 0.0f);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ahoi.e(((defpackage.dal) this.a).b, (java.util.concurrent.CancellationException) null);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.dbz) this.a).a.a();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj = this.a;
                defpackage.dmm dmmVar = (defpackage.dmm) obj;
                if (dmmVar.e && dmmVar.isAttachedToWindow() && dmmVar.b.getParent() == obj) {
                    ((defpackage.cez) dmmVar.j().a).b(obj, defpackage.dmm.a, dmmVar.d);
                }
                return defpackage.afbk.a;
            case 9:
                ((defpackage.dmm) this.a).v.G();
                return defpackage.afbk.a;
            case 10:
                return this.a;
            case 11:
                android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
                ((dna) this.a).x.saveHierarchyState(sparseArray);
                return sparseArray;
            case 12:
                dna dnaVar = (dna) this.a;
                dnaVar.z.invoke(dnaVar.x);
                dnaVar.o((defpackage.rqj) null);
                return defpackage.afbk.a;
            case 13:
                dna dnaVar2 = (dna) this.a;
                dnaVar2.y.invoke(dnaVar2.x);
                return defpackage.afbk.a;
            case 14:
                dny dnyVar = (dny) this.a;
                defpackage.ctc ctcVarA = dnyVar.a();
                if (ctcVarA != null && ctcVarA.t()) {
                    ctcVar = ctcVarA;
                }
                return java.lang.Boolean.valueOf((ctcVar == null || dnyVar.k() == null) ? false : true);
            case 15:
                androidx.core.telecom.extensions.Capability capability = new androidx.core.telecom.extensions.Capability();
                capability.a = 2;
                capability.b = 2;
                capability.c = new int[0];
                return new dxc(capability, new dxe(this.a, 0));
            case 16:
                androidx.core.telecom.extensions.Capability capability2 = new androidx.core.telecom.extensions.Capability();
                capability2.a = 4;
                capability2.b = 1;
                capability2.c = new int[0];
                return new dxc(capability2, new dxe(this.a, 2, (char[]) null));
            case 17:
                androidx.core.telecom.extensions.Capability capability3 = new androidx.core.telecom.extensions.Capability();
                capability3.a = 3;
                capability3.b = 1;
                capability3.c = new int[0];
                return new dxc(capability3, new dxe(this.a, 1, (byte[]) null));
            case 18:
                eha ehaVar = (eha) this.a;
                java.io.File fileG = ehaVar.g(ehaVar.a);
                eha.h(fileG);
                return fileG;
            case 19:
                int i9 = ehk.a;
                try {
                    android.os.ParcelFileDescriptor parcelFileDescriptorOpen = android.os.ParcelFileDescriptor.open((java.io.File) new defpackage.cwg(this.a, 20).invoke(), 939524096);
                    parcelFileDescriptorOpen.getClass();
                    androidx.datastore.core.NativeSharedCounter nativeSharedCounter = ehi.a;
                    if (nativeSharedCounter == null) {
                        throw new java.lang.IllegalStateException("DataStore failed to load the native library to create SharedCounter.");
                    }
                    int fd = parcelFileDescriptorOpen.getFd();
                    if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                        throw new java.io.IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new java.io.IOException("Failed to mmap counter file");
                    }
                    ehj ehjVar = new ehj(nativeSharedCounter, jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return ehjVar;
                } catch (java.lang.Throwable th) {
                    if (0 != 0) {
                        cutVar.close();
                    }
                    throw th;
                }
            default:
                eha ehaVar2 = (eha) this.a;
                java.io.File fileG2 = ehaVar2.g(ehaVar2.b);
                eha.h(fileG2);
                return fileG2;
        }
    }
}
