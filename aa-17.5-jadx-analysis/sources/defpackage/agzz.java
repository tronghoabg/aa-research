package defpackage;

/* loaded from: classes3.dex */
public final class agzz {
    public static final boolean isSuperWildcard(agzw agzwVar) {
        ahaa ahaaVar = agzwVar instanceof ahaa ? (ahaa) agzwVar : null;
        return (ahaaVar == null || ahaaVar.getBound() == null || ahaaVar.isExtends()) ? false : true;
    }
}
