package defpackage;

/* loaded from: classes3.dex */
public final class aikh {
    public static final aikh INSTANCE = new aikh();

    private aikh() {
    }

    public final boolean isSubtypeOfAny(aijf aijfVar) {
        aijfVar.getClass();
        return aiel.INSTANCE.hasNotNullSupertype(aimb.newTypeCheckerState$default(aikj.INSTANCE, false, true, false, 4, null), aige.lowerIfFlexible(aijfVar), aihy.INSTANCE);
    }
}
