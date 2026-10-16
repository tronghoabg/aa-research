package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agex {
    private static final agev DEFAULT_VISIBILITY;
    public static final agex INSTANCE = new agex();
    private static final Map<agey, Integer> ORDERED_VISIBILITIES;

    static {
        afby afbyVar = new afby(8);
        afbyVar.put(aget.INSTANCE, 0);
        afbyVar.put(ages.INSTANCE, 0);
        afbyVar.put(agep.INSTANCE, 1);
        afbyVar.put(ageu.INSTANCE, 1);
        afbyVar.put(agev.INSTANCE, 2);
        ORDERED_VISIBILITIES = afbyVar.e();
        DEFAULT_VISIBILITY = agev.INSTANCE;
    }

    private agex() {
    }

    public final Integer compareLocal$org_jetbrains_kotlin_compiler_common(agey ageyVar, agey ageyVar2) {
        ageyVar.getClass();
        ageyVar2.getClass();
        if (ageyVar == ageyVar2) {
            return 0;
        }
        Map<agey, Integer> map = ORDERED_VISIBILITIES;
        Integer num = map.get(ageyVar);
        Integer num2 = map.get(ageyVar2);
        if (num == null || num2 == null || affa.f(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(agey ageyVar) {
        ageyVar.getClass();
        return ageyVar == ages.INSTANCE || ageyVar == aget.INSTANCE;
    }
}
