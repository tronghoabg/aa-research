package defpackage;

/* loaded from: classes3.dex */
public final class agan extends aioy {
    final /* synthetic */ String $jvmDescriptor;
    final /* synthetic */ affv<agal> $result;

    public agan(String str, affv<agal> affvVar) {
        this.$jvmDescriptor = str;
        this.$result = affvVar;
    }

    @Override // defpackage.aioy, defpackage.aipa
    public boolean beforeChildren(agba agbaVar) {
        agbaVar.getClass();
        String strSignature = ahfo.signature(ahft.INSTANCE, agbaVar, this.$jvmDescriptor);
        if (agas.INSTANCE.getHIDDEN_METHOD_SIGNATURES().contains(strSignature)) {
            this.$result.a = agal.HIDDEN;
        } else if (agas.INSTANCE.getVISIBLE_METHOD_SIGNATURES().contains(strSignature)) {
            this.$result.a = agal.VISIBLE;
        } else if (agas.INSTANCE.getDEPRECATED_LIST_METHODS().contains(strSignature)) {
            this.$result.a = agal.DEPRECATED_LIST_METHODS;
        } else if (agas.INSTANCE.getDROP_LIST_METHOD_SIGNATURES().contains(strSignature)) {
            this.$result.a = agal.DROP;
        }
        return this.$result.a == null;
    }

    @Override // defpackage.aipa
    public agal result() {
        agal agalVar = (agal) this.$result.a;
        return agalVar == null ? agal.NOT_CONSIDERED : agalVar;
    }
}
