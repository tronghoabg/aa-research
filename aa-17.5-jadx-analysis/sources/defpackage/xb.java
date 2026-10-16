package defpackage;

import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class xb {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.cfy r16, float r17, long r18, defpackage.bux r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb.a(cfy, float, long, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.cfy r16, float r17, long r18, defpackage.bux r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb.b(cfy, float, long, bux, int, int):void");
    }

    public static final void c(cyz cyzVar, afec afecVar) {
        if (afecVar.invoke(cyzVar) != cyy.a) {
            return;
        }
        czz.p(cyzVar, afecVar);
    }

    public static final boolean d(cgu cguVar, long j) {
        if (!cguVar.q.A) {
            return false;
        }
        cyc cycVarP = bzi.q(cguVar).p();
        if (cycVarP.t()) {
            long j2 = cycVarP.j(0L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            long j3 = cguVar.c;
            float f = ((int) (j3 >> 32)) + fIntBitsToFloat;
            float f2 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
            if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= f) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void e(cgq cgqVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        hig higVar;
        Object obj;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM26m = a$$ExternalSyntheticApiModelOutline2.m26m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM26m != null && (value = viewTranslationResponseM26m.getValue("android:text")) != null && (text = value.getText()) != null && (higVar = (hig) cgqVar.h().a((int) jKeyAt)) != null && (obj = higVar.b) != null) {
                ddf ddfVar = (ddf) ((ddu) obj).b.g(ddq.l);
                if (ddfVar != null) {
                }
            }
        }
    }

    public static final String f(cto ctoVar) {
        String string;
        Object objD = bzi.D(ctoVar);
        if (objD == null) {
            objD = g(ctoVar);
        }
        return (objD == null || (string = objD.toString()) == null) ? "null" : string;
    }

    public static final Object g(cto ctoVar) {
        Object objG = ctoVar.g();
        dop dopVar = objG instanceof dop ? (dop) objG : null;
        if (dopVar != null) {
            return dopVar.a();
        }
        return null;
    }

    public static final void h(dpz dpzVar, List list) {
        ArrayList arrayList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cto ctoVar = (cto) list.get(i);
            Object objD = bzi.D(ctoVar);
            if (objD == null && (objD = g(ctoVar)) == null) {
                objD = new xb();
            }
            dpp dppVarB = dpzVar.b(objD.toString());
            if (dppVarB != null) {
                dppVarB.af = ctoVar;
                dqn dqnVar = dppVarB.ag;
                if (dqnVar != null) {
                    dqnVar.aq = dppVarB.af;
                }
            }
            Object objG = ctoVar.g();
            dop dopVar = objG instanceof dop ? (dop) objG : null;
            String strB = dopVar != null ? dopVar.b() : null;
            if (strB != null && (objD instanceof String)) {
                String str = (String) objD;
                if (dpzVar.b(str) instanceof dpp) {
                    HashMap map = dpzVar.e;
                    if (map.containsKey(strB)) {
                        arrayList = (ArrayList) map.get(strB);
                    } else {
                        arrayList = new ArrayList();
                        map.put(strB, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }
}
