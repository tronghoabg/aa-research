package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class aiae {
    public static final aiae INSTANCE = new aiae();

    private aiae() {
    }

    public final agbb classKind(ahhb ahhbVar) {
        if (ahhbVar != null) {
            ahij ahijVar = ahij.FINAL;
            agcp agcpVar = agcq.Companion;
            ahkn ahknVar = ahkn.INTERNAL;
            ahtp ahtpVar = ahtq.Companion;
            ahjc ahjcVar = ahjc.UNSPECIFIED;
            agbb agbbVar = agbb.CLASS;
            ahju ahjuVar = ahju.IN;
            ahjk ahjkVar = ahjk.IN;
            aijg aijgVar = aijg.INVARIANT;
            switch (ahhbVar) {
                case CLASS:
                    return agbb.CLASS;
                case INTERFACE:
                    return agbb.INTERFACE;
                case ENUM_CLASS:
                    return agbb.ENUM_CLASS;
                case ENUM_ENTRY:
                    return agbb.ENUM_ENTRY;
                case ANNOTATION_CLASS:
                    return agbb.ANNOTATION_CLASS;
                case OBJECT:
                case COMPANION_OBJECT:
                    return agbb.OBJECT;
            }
        }
        return agbb.CLASS;
    }

    public final agcq modality(ahij ahijVar) {
        if (ahijVar != null) {
            agcp agcpVar = agcq.Companion;
            ahkn ahknVar = ahkn.INTERNAL;
            ahtp ahtpVar = ahtq.Companion;
            ahjc ahjcVar = ahjc.UNSPECIFIED;
            ahhb ahhbVar = ahhb.CLASS;
            agbb agbbVar = agbb.CLASS;
            ahju ahjuVar = ahju.IN;
            ahjk ahjkVar = ahjk.IN;
            aijg aijgVar = aijg.INVARIANT;
            int iOrdinal = ahijVar.ordinal();
            if (iOrdinal == 0) {
                return agcq.FINAL;
            }
            if (iOrdinal == 1) {
                return agcq.OPEN;
            }
            if (iOrdinal == 2) {
                return agcq.ABSTRACT;
            }
            if (iOrdinal == 3) {
                return agcq.SEALED;
            }
        }
        return agcq.FINAL;
    }

    public final aijg variance(ahjk ahjkVar) {
        ahjkVar.getClass();
        ahij ahijVar = ahij.FINAL;
        agcp agcpVar = agcq.Companion;
        ahkn ahknVar = ahkn.INTERNAL;
        ahtp ahtpVar = ahtq.Companion;
        ahjc ahjcVar = ahjc.UNSPECIFIED;
        ahhb ahhbVar = ahhb.CLASS;
        agbb agbbVar = agbb.CLASS;
        ahju ahjuVar = ahju.IN;
        ahjk ahjkVar2 = ahjk.IN;
        aijg aijgVar = aijg.INVARIANT;
        int iOrdinal = ahjkVar.ordinal();
        if (iOrdinal == 0) {
            return aijg.IN_VARIANCE;
        }
        if (iOrdinal == 1) {
            return aijg.OUT_VARIANCE;
        }
        if (iOrdinal == 2) {
            return aijg.INVARIANT;
        }
        if (iOrdinal != 3) {
            throw new aezs();
        }
        Objects.toString(ahjkVar);
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: ".concat(ahjkVar.toString()));
    }

    public final aijg variance(ahju ahjuVar) {
        ahjuVar.getClass();
        ahij ahijVar = ahij.FINAL;
        agcp agcpVar = agcq.Companion;
        ahkn ahknVar = ahkn.INTERNAL;
        ahtp ahtpVar = ahtq.Companion;
        ahjc ahjcVar = ahjc.UNSPECIFIED;
        ahhb ahhbVar = ahhb.CLASS;
        agbb agbbVar = agbb.CLASS;
        ahju ahjuVar2 = ahju.IN;
        ahjk ahjkVar = ahjk.IN;
        aijg aijgVar = aijg.INVARIANT;
        int iOrdinal = ahjuVar.ordinal();
        if (iOrdinal == 0) {
            return aijg.IN_VARIANCE;
        }
        if (iOrdinal == 1) {
            return aijg.OUT_VARIANCE;
        }
        if (iOrdinal == 2) {
            return aijg.INVARIANT;
        }
        throw new aezs();
    }
}
