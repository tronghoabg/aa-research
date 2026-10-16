package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahlm {
    private ahlm() {
    }

    public final ahln create(ahkl ahklVar) {
        ahklVar.getClass();
        if (ahklVar.getRequirementCount() == 0) {
            return getEMPTY();
        }
        List<ahki> requirementList = ahklVar.getRequirementList();
        requirementList.getClass();
        return new ahln(requirementList, null);
    }

    public final ahln getEMPTY() {
        return ahln.EMPTY;
    }

    public /* synthetic */ ahlm(afeu afeuVar) {
        this();
    }
}
