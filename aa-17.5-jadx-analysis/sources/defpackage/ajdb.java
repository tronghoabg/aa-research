package defpackage;

/* loaded from: classes2.dex */
public final class ajdb {
    public static final ajcz a = new ajcz("NO_THREAD_ELEMENTS");
    private static final afeg b = new nno(13);
    private static final afeg c = new nno(14);
    private static final afeg d = new nno(15);

    public static final Object a(afco afcoVar) {
        Object objFold = afcoVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(afco afcoVar, Object obj) {
        if (obj == null) {
            obj = a(afcoVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? afcoVar.fold(new ajdg(afcoVar, ((Number) obj).intValue()), d) : ((aiwi) obj).hC(afcoVar);
    }

    public static final void c(afco afcoVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof ajdg)) {
            Object objFold = afcoVar.fold(null, c);
            objFold.getClass();
            ((aiwi) objFold).hD(obj);
            return;
        }
        ajdg ajdgVar = (ajdg) obj;
        aiwi[] aiwiVarArr = ajdgVar.c;
        int length = aiwiVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            aiwi aiwiVar = aiwiVarArr[length];
            aiwiVar.getClass();
            aiwiVar.hD(ajdgVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
