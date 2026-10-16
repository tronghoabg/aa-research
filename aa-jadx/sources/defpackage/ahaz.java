package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahaz {
    public static final boolean isSuperWildcard(defpackage.ahaw ahawVar) {
        defpackage.ahba ahbaVar = ahawVar instanceof defpackage.ahba ? (defpackage.ahba) ahawVar : null;
        return (ahbaVar == null || ahbaVar.getBound() == null || ahbaVar.isExtends()) ? false : true;
    }
}
