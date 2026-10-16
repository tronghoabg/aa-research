package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmh {
    private final java.util.List<defpackage.ahkn> types;

    public ahmh(defpackage.ahky ahkyVar) {
        ahkyVar.getClass();
        java.util.List<defpackage.ahkn> typeList = ahkyVar.getTypeList();
        if (ahkyVar.hasFirstNullable()) {
            int firstNullable = ahkyVar.getFirstNullable();
            java.util.List<defpackage.ahkn> typeList2 = ahkyVar.getTypeList();
            typeList2.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(typeList2, 10));
            int i = 0;
            for (java.lang.Object obj : typeList2) {
                int i2 = i + 1;
                if (i < 0) {
                    defpackage.afga.ai();
                }
                defpackage.ahkn ahknVarBuild = (defpackage.ahkn) obj;
                if (i >= firstNullable) {
                    defpackage.ahkm builder = ahknVarBuild.toBuilder();
                    builder.setNullable(true);
                    ahknVarBuild = builder.build();
                }
                arrayList.add(ahknVarBuild);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.types = typeList;
    }

    public final defpackage.ahkn get(int i) {
        return this.types.get(i);
    }
}
