package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class daz {
    public static final boolean a(android.view.View view) {
        return bgp$.ExternalSyntheticApiModelOutline0.m(view);
    }

    public static final boolean b(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ces)) {
            if ((obj instanceof defpackage.afan) && (obj instanceof java.io.Serializable)) {
                return false;
            }
            return (obj instanceof android.os.Parcelable) || (obj instanceof java.io.Serializable) || (obj instanceof android.os.Binder) || (obj instanceof android.util.Size) || (obj instanceof android.util.SizeF) || (obj instanceof android.util.SparseArray);
        }
        defpackage.ces cesVar = (defpackage.ces) obj;
        defpackage.byo byoVarF = cesVar.f();
        if (byoVarF != defpackage.bxv.b && byoVarF != defpackage.bxv.c && byoVarF != defpackage.bxv.a) {
            return false;
        }
        java.lang.Object objA = cesVar.a();
        return objA == null || b(objA);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062 A[LOOP:0: B:5:0x000d->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:5:0x000d->B:35:0x0062], SYNTHETIC] */
    public static final defpackage.dec c(defpackage.cxl cxlVar, boolean z) {
        defpackage.cyg cygVar = cxlVar.v;
        java.lang.Object obj = null;
        if ((cygVar.a() & 8) != 0) {
            loop0: for (defpackage.cge cgeVar = cygVar.f; cgeVar != null; cgeVar = cgeVar.u) {
                if ((cgeVar.r & 8) == 0) {
                    if ((cgeVar.s & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    defpackage.cge cgeVarO = cgeVar;
                    defpackage.bzc bzcVar = null;
                    while (cgeVarO != null) {
                        if (cgeVarO instanceof defpackage.czc) {
                            obj = cgeVarO;
                            break loop0;
                        }
                        if ((cgeVarO.r & 8) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                            int i = 0;
                            for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                if ((cgeVar2.r & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cgeVarO = cgeVar2;
                                    } else {
                                        if (bzcVar == null) {
                                            bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                        }
                                        if (cgeVarO != null) {
                                            bzcVar.n(cgeVarO);
                                        }
                                        bzcVar.n(cgeVar2);
                                        cgeVarO = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        cgeVarO = defpackage.cjv.o(bzcVar);
                    }
                    if ((cgeVar.s & 8) != 0) {
                        break;
                    }
                }
            }
        }
        obj.getClass();
        defpackage.cge cgeVarM = ((defpackage.czc) obj).M();
        defpackage.ddz ddzVarR = cxlVar.r();
        if (ddzVarR == null) {
            ddzVarR = new defpackage.ddz();
        }
        return new defpackage.dec(cgeVarM, z, cxlVar, ddzVarR);
    }
}
