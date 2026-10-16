package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahlh {
    private final List<ahjn> types;

    public ahlh(ahjy ahjyVar) {
        ahjyVar.getClass();
        List<ahjn> typeList = ahjyVar.getTypeList();
        if (ahjyVar.hasFirstNullable()) {
            int firstNullable = ahjyVar.getFirstNullable();
            List<ahjn> typeList2 = ahjyVar.getTypeList();
            typeList2.getClass();
            ArrayList arrayList = new ArrayList(woy.bp(typeList2, 10));
            int i = 0;
            for (Object obj : typeList2) {
                int i2 = i + 1;
                if (i < 0) {
                    woy.bo();
                }
                ahjn ahjnVarBuild = (ahjn) obj;
                if (i >= firstNullable) {
                    ahjm builder = ahjnVarBuild.toBuilder();
                    builder.setNullable(true);
                    ahjnVarBuild = builder.build();
                }
                arrayList.add(ahjnVarBuild);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.types = typeList;
    }

    public final ahjn get(int i) {
        return this.types.get(i);
    }
}
