package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class ahrb {
    private ahrb() {
    }

    public final String getClassifierKindPrefix(agbe agbeVar) {
        agbeVar.getClass();
        if (agbeVar instanceof aged) {
            return "typealias";
        }
        if (!(agbeVar instanceof agba)) {
            Objects.toString(agbeVar);
            throw new AssertionError("Unexpected classifier: ".concat(agbeVar.toString()));
        }
        agba agbaVar = (agba) agbeVar;
        if (agbaVar.isCompanionObject()) {
            return "companion object";
        }
        agbb kind = agbaVar.getKind();
        agbb agbbVar = agbb.CLASS;
        int iOrdinal = kind.ordinal();
        if (iOrdinal == 0) {
            return "class";
        }
        if (iOrdinal == 1) {
            return "interface";
        }
        if (iOrdinal == 2) {
            return "enum class";
        }
        if (iOrdinal == 3) {
            return "enum entry";
        }
        if (iOrdinal == 4) {
            return "annotation class";
        }
        if (iOrdinal == 5) {
            return "object";
        }
        throw new aezs();
    }

    public final ahre withOptions(afec<? super ahrt, afak> afecVar) {
        afecVar.getClass();
        ahry ahryVar = new ahry();
        afecVar.invoke(ahryVar);
        ahryVar.lock();
        return new ahrp(ahryVar);
    }

    public /* synthetic */ ahrb(afeu afeuVar) {
        this();
    }
}
