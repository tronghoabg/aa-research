package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class iq extends com.google.v.du<iq, ip> implements com.google.v.fj {
    public static final int BIRTH_DATE_SEC_FIELD_NUMBER = 1;
    private static final iq DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<iq> PARSER;
    private long birthDateSec_;
    private int bitField0_;
    private i.b.s location_;

    static {
        iq iqVar = new iq();
        DEFAULT_INSTANCE = iqVar;
        com.google.v.du.registerDefaultInstance(iq.class, iqVar);
    }

    private iq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirthDateSec() {
        this.bitField0_ &= -2;
        this.birthDateSec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -3;
    }

    public static iq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.location_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.location_ = sVar;
        this.bitField0_ |= 2;
    }

    public static ip newBuilder() {
        return (ip) DEFAULT_INSTANCE.createBuilder();
    }

    public static iq parseDelimitedFrom(InputStream inputStream) {
        return (iq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iq parseFrom(com.google.v.v vVar) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirthDateSec(long j2) {
        this.bitField0_ |= 1;
        this.birthDateSec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.location_ = sVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "birthDateSec_", "location_"});
        }
        if (iOrdinal == 3) {
            return new iq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ip(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<iq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (iq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBirthDateSec() {
        return this.birthDateSec_;
    }

    public i.b.s getLocation() {
        i.b.s sVar = this.location_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasBirthDateSec() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ip newBuilder(iq iqVar) {
        return (ip) DEFAULT_INSTANCE.createBuilder(iqVar);
    }

    public static iq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iq parseFrom(com.google.v.z zVar) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static iq parseFrom(InputStream inputStream) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iq parseFrom(ByteBuffer byteBuffer) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iq parseFrom(byte[] bArr) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
