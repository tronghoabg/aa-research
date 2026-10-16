package defpackage;

/* loaded from: classes3.dex */
final class ainr implements aing {
    public static final ainr INSTANCE = new ainr();
    private static final String description = "second parameter must be of type KProperty<*> or its supertype";

    private ainr() {
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        agel agelVar = agcjVar.getValueParameters().get(1);
        afyl afylVar = afym.Companion;
        agelVar.getClass();
        aigl aiglVarCreateKPropertyStarType = afylVar.createKPropertyStarType(ahvz.getModule(agelVar));
        if (aiglVarCreateKPropertyStarType == null) {
            return false;
        }
        aigl type = agelVar.getType();
        type.getClass();
        return aimr.isSubtypeOf(aiglVarCreateKPropertyStarType, aimr.makeNotNullable(type));
    }

    @Override // defpackage.aing
    public String getDescription() {
        return description;
    }

    @Override // defpackage.aing
    public /* bridge */ String invoke(agcj agcjVar) {
        return ainf.invoke(this, agcjVar);
    }
}
