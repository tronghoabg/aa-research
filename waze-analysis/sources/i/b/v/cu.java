package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cu extends com.google.v.du<cu, ct> implements com.google.v.fj {
    private static final cu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cu> PARSER = null;
    public static final int PAYMENTTYPE_FIELD_NUMBER = 1;
    private static final com.google.v.el<cs> paymentType_converter_ = new al(4);
    private com.google.v.ek paymentType_ = emptyIntList();

    static {
        cu cuVar = new cu();
        DEFAULT_INSTANCE = cuVar;
        com.google.v.du.registerDefaultInstance(cu.class, cuVar);
    }

    private cu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaymentType(Iterable<? extends cs> iterable) {
        ensurePaymentTypeIsMutable();
        Iterator<? extends cs> it = iterable.iterator();
        while (it.hasNext()) {
            this.paymentType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaymentType(cs csVar) {
        Objects.requireNonNull(csVar);
        ensurePaymentTypeIsMutable();
        this.paymentType_.i(csVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaymentType() {
        this.paymentType_ = emptyIntList();
    }

    private void ensurePaymentTypeIsMutable() {
        com.google.v.ek ekVar = this.paymentType_;
        if (ekVar.c()) {
            return;
        }
        this.paymentType_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static cu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ct newBuilder() {
        return (ct) DEFAULT_INSTANCE.createBuilder();
    }

    public static cu parseDelimitedFrom(InputStream inputStream) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(com.google.v.v vVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaymentType(int i2, cs csVar) {
        Objects.requireNonNull(csVar);
        ensurePaymentTypeIsMutable();
        this.paymentType_.e(i2, csVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"paymentType_", z.p});
        }
        if (iOrdinal == 3) {
            return new cu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ct(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cs getPaymentType(int i2) {
        cs csVarA = cs.a(this.paymentType_.d(i2));
        return csVarA == null ? cs.CASH : csVarA;
    }

    public int getPaymentTypeCount() {
        return this.paymentType_.size();
    }

    public List<cs> getPaymentTypeList() {
        return new com.google.v.em(this.paymentType_, paymentType_converter_);
    }

    public static ct newBuilder(cu cuVar) {
        return (ct) DEFAULT_INSTANCE.createBuilder(cuVar);
    }

    public static cu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cu parseFrom(com.google.v.z zVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cu parseFrom(InputStream inputStream) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(ByteBuffer byteBuffer) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cu parseFrom(byte[] bArr) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
