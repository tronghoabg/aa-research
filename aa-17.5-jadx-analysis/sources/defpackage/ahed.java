package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ahed extends ahdm<agfc, ahuh<?>> {
    private final ahyk annotationDeserializer;
    private ahlc metadataVersion;
    private final agcu module;
    private final agdb notFoundClasses;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahed(agcu agcuVar, agdb agdbVar, aiei aieiVar, ahfc ahfcVar) {
        super(aieiVar, ahfcVar);
        agcuVar.getClass();
        agdbVar.getClass();
        aieiVar.getClass();
        ahfcVar.getClass();
        this.module = agcuVar;
        this.notFoundClasses = agdbVar;
        this.annotationDeserializer = new ahyk(agcuVar, agdbVar);
        this.metadataVersion = ahlc.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ahuh<?> createConstant(ahnj ahnjVar, Object obj) {
        ahuh<?> ahuhVarCreateConstantValue = ahuj.INSTANCE.createConstantValue(obj, this.module);
        if (ahuhVarCreateConstantValue != null) {
            return ahuhVarCreateConstantValue;
        }
        ahum ahumVar = ahuo.Companion;
        Objects.toString(ahnjVar);
        return ahumVar.create("Unsupported annotation argument: ".concat(String.valueOf(ahnjVar)));
    }

    private final agba resolveClass(ahnd ahndVar) {
        return agch.findNonGenericClassAcrossDependencies(this.module, ahndVar, this.notFoundClasses);
    }

    @Override // defpackage.ahdv
    public ahlc getMetadataVersion() {
        return this.metadataVersion;
    }

    @Override // defpackage.ahdv
    protected ahfe loadAnnotation(ahnd ahndVar, agdx agdxVar, List<agfc> list) {
        ahndVar.getClass();
        agdxVar.getClass();
        list.getClass();
        return new ahec(this, resolveClass(ahndVar), ahndVar, list, agdxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ahdm
    public ahuh<?> loadConstant(String str, Object obj) {
        str.getClass();
        obj.getClass();
        if (afyh.u("ZBCS", str, false)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(str);
        }
        return ahuj.INSTANCE.createConstantValue(obj, this.module);
    }

    public void setMetadataVersion(ahlc ahlcVar) {
        ahlcVar.getClass();
        this.metadataVersion = ahlcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahdm
    public ahuh<?> transformToUnsignedConstant(ahuh<?> ahuhVar) {
        ahuhVar.getClass();
        return ahuhVar instanceof ahue ? new ahvk(((Number) ((ahue) ahuhVar).getValue()).byteValue()) : ahuhVar instanceof ahvg ? new ahvn(((Number) ((ahvg) ahuhVar).getValue()).shortValue()) : ahuhVar instanceof ahuq ? new ahvl(((Number) ((ahuq) ahuhVar).getValue()).intValue()) : ahuhVar instanceof ahvd ? new ahvm(((Number) ((ahvd) ahuhVar).getValue()).longValue()) : ahuhVar;
    }

    @Override // defpackage.ahdv, defpackage.ahyl
    public agfc loadAnnotation(ahgx ahgxVar, ahld ahldVar) {
        ahgxVar.getClass();
        ahldVar.getClass();
        return this.annotationDeserializer.deserializeAnnotation(ahgxVar, ahldVar);
    }
}
