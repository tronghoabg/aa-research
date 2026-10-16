package defpackage;

/* loaded from: classes3.dex */
public final class ahei {
    public static final aheh Companion = new aheh(null);
    private final ahyv components;

    public ahei(aiei aieiVar, agcu agcuVar, ahyx ahyxVar, aheo aheoVar, ahed ahedVar, agvt agvtVar, agdb agdbVar, ahzh ahzhVar, aglq aglqVar, ahyu ahyuVar, aike aikeVar, ailo ailoVar) {
        aggb customizer;
        agfx customizer2;
        aieiVar.getClass();
        agcuVar.getClass();
        ahyxVar.getClass();
        aheoVar.getClass();
        ahedVar.getClass();
        agvtVar.getClass();
        agdbVar.getClass();
        ahzhVar.getClass();
        aglqVar.getClass();
        ahyuVar.getClass();
        aikeVar.getClass();
        ailoVar.getClass();
        afye builtIns = agcuVar.getBuiltIns();
        agab agabVar = builtIns instanceof agab ? (agab) builtIns : null;
        ahzn ahznVar = ahzn.INSTANCE;
        ahep ahepVar = ahep.INSTANCE;
        afbe afbeVar = afbe.a;
        this.components = new ahyv(aieiVar, agcuVar, ahyxVar, aheoVar, ahedVar, agvtVar, ahznVar, ahzhVar, aglqVar, ahepVar, afbeVar, agdbVar, ahyuVar, (agabVar == null || (customizer2 = agabVar.getCustomizer()) == null) ? agfw.INSTANCE : customizer2, (agabVar == null || (customizer = agabVar.getCustomizer()) == null) ? agga.INSTANCE : customizer, ahmt.INSTANCE.getEXTENSION_REGISTRY(), aikeVar, new ahwi(aieiVar, afbeVar), ailoVar.getTranslators(), ahzl.INSTANCE);
    }

    public final ahyv getComponents() {
        return this.components;
    }
}
