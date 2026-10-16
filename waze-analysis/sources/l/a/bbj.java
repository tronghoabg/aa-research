package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbj extends com.google.v.du<bbj, bbg> implements com.google.v.fj {
    private static final bbj DEFAULT_INSTANCE;
    public static final int LOCATION_STATUS_FIELD_NUMBER = 1;
    public static final int LOCATION_TYPE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bbj> PARSER;
    private int locationStatus_;
    private int locationType_;

    static {
        bbj bbjVar = new bbj();
        DEFAULT_INSTANCE = bbjVar;
        com.google.v.du.registerDefaultInstance(bbj.class, bbjVar);
    }

    private bbj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationStatus() {
        this.locationStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationType() {
        this.locationType_ = 0;
    }

    public static bbj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bbg newBuilder() {
        return (bbg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bbj parseDelimitedFrom(InputStream inputStream) {
        return (bbj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbj parseFrom(com.google.v.v vVar) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bbj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationStatus(bbh bbhVar) {
        this.locationStatus_ = bbhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationStatusValue(int i2) {
        this.locationStatus_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationType(bbi bbiVar) {
        this.locationType_ = bbiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationTypeValue(int i2) {
        this.locationType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"locationStatus_", "locationType_"});
        }
        if (iOrdinal == 3) {
            return new bbj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bbj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bbj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bbh getLocationStatus() {
        int i2 = this.locationStatus_;
        bbh bbhVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bbh.TO_BE_EDITED : bbh.TO_BE_SET : bbh.LOCATION_STATUS_UNSPECIFIED;
        return bbhVar == null ? bbh.UNRECOGNIZED : bbhVar;
    }

    public int getLocationStatusValue() {
        return this.locationStatus_;
    }

    public bbi getLocationType() {
        int i2 = this.locationType_;
        bbi bbiVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bbi.WORK : bbi.HOME : bbi.LOCATION_TYPE_UNSPECIFIED;
        return bbiVar == null ? bbi.UNRECOGNIZED : bbiVar;
    }

    public int getLocationTypeValue() {
        return this.locationType_;
    }

    public static bbg newBuilder(bbj bbjVar) {
        return (bbg) DEFAULT_INSTANCE.createBuilder(bbjVar);
    }

    public static bbj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bbj parseFrom(com.google.v.z zVar) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bbj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bbj parseFrom(InputStream inputStream) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbj parseFrom(ByteBuffer byteBuffer) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bbj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bbj parseFrom(byte[] bArr) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bbj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bbj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
