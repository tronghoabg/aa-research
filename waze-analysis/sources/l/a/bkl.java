package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkl extends com.google.v.du<bkl, bki> implements com.google.v.fj {
    private static final bkl DEFAULT_INSTANCE;
    public static final int IMPACT_INFO_TYPE_FIELD_NUMBER = 2;
    public static final int IMPACT_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bkl> PARSER;
    private int impactInfoType_;
    private int impactType_;

    static {
        bkl bklVar = new bkl();
        DEFAULT_INSTANCE = bklVar;
        com.google.v.du.registerDefaultInstance(bkl.class, bklVar);
    }

    private bkl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpactInfoType() {
        this.impactInfoType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpactType() {
        this.impactType_ = 0;
    }

    public static bkl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bki newBuilder() {
        return (bki) DEFAULT_INSTANCE.createBuilder();
    }

    public static bkl parseDelimitedFrom(InputStream inputStream) {
        return (bkl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkl parseFrom(com.google.v.v vVar) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bkl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactInfoType(bkj bkjVar) {
        this.impactInfoType_ = bkjVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactInfoTypeValue(int i2) {
        this.impactInfoType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactType(bkk bkkVar) {
        this.impactType_ = bkkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactTypeValue(int i2) {
        this.impactType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"impactType_", "impactInfoType_"});
        }
        if (iOrdinal == 3) {
            return new bkl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bki(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bkl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bkl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bkj getImpactInfoType() {
        int i2 = this.impactInfoType_;
        bkj bkjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bkj.DEFAULT : bkj.STREET : bkj.MTE : bkj.IMPACT_INFO_TYPE_UNSPECIFIED;
        return bkjVar == null ? bkj.UNRECOGNIZED : bkjVar;
    }

    public int getImpactInfoTypeValue() {
        return this.impactInfoType_;
    }

    public bkk getImpactType() {
        int i2 = this.impactType_;
        bkk bkkVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bkk.UNREACHABLE_DESTINATION_SHORT : bkk.LONGER_DRIVE_TIME : bkk.UNAVAILABLE_NATURAL_ROUTE : bkk.UNAVAILABLE_PREFERRED_ROUTE : bkk.UNREACHABLE_DESTINATION_LONG : bkk.IMPACT_TYPE_UNSPECIFIED;
        return bkkVar == null ? bkk.UNRECOGNIZED : bkkVar;
    }

    public int getImpactTypeValue() {
        return this.impactType_;
    }

    public static bki newBuilder(bkl bklVar) {
        return (bki) DEFAULT_INSTANCE.createBuilder(bklVar);
    }

    public static bkl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bkl parseFrom(com.google.v.z zVar) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bkl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bkl parseFrom(InputStream inputStream) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkl parseFrom(ByteBuffer byteBuffer) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bkl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bkl parseFrom(byte[] bArr) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bkl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bkl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
