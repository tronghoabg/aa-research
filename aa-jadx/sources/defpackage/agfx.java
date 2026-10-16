package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agfx {
    private static final defpackage.agfv DEFAULT_VISIBILITY;
    public static final defpackage.agfx INSTANCE = new defpackage.agfx();
    private static final java.util.Map<defpackage.agfy, java.lang.Integer> ORDERED_VISIBILITIES;

    static {
        defpackage.afcy afcyVar = new defpackage.afcy(8);
        afcyVar.put(defpackage.agft.INSTANCE, 0);
        afcyVar.put(defpackage.agfs.INSTANCE, 0);
        afcyVar.put(defpackage.agfp.INSTANCE, 1);
        afcyVar.put(defpackage.agfu.INSTANCE, 1);
        afcyVar.put(defpackage.agfv.INSTANCE, 2);
        ORDERED_VISIBILITIES = afcyVar.e();
        DEFAULT_VISIBILITY = defpackage.agfv.INSTANCE;
    }

    private agfx() {
    }

    public final java.lang.Integer compareLocal$org_jetbrains_kotlin_compiler_common(defpackage.agfy agfyVar, defpackage.agfy agfyVar2) {
        agfyVar.getClass();
        agfyVar2.getClass();
        if (agfyVar == agfyVar2) {
            return 0;
        }
        java.util.Map<defpackage.agfy, java.lang.Integer> map = ORDERED_VISIBILITIES;
        java.lang.Integer num = map.get(agfyVar);
        java.lang.Integer num2 = map.get(agfyVar2);
        if (num == null || num2 == null || defpackage.afga.f(num, num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(defpackage.agfy agfyVar) {
        agfyVar.getClass();
        return agfyVar == defpackage.agfs.INSTANCE || agfyVar == defpackage.agft.INSTANCE;
    }
}
