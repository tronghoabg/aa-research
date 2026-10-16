package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rs extends com.google.v.du<rs, rr> implements com.google.v.fj {
    private static final rs DEFAULT_INSTANCE;
    public static final int MAX_ALLOWED_MILLIMETER_PER_SEC_FIELD_NUMBER = 2;
    public static final int NUM_MINUTES_ADDED_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<rs> PARSER;
    private int bitField0_;
    private int maxAllowedMillimeterPerSec_;
    private int numMinutesAdded_;

    static {
        rs rsVar = new rs();
        DEFAULT_INSTANCE = rsVar;
        com.google.v.du.registerDefaultInstance(rs.class, rsVar);
    }

    private rs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAllowedMillimeterPerSec() {
        this.bitField0_ &= -3;
        this.maxAllowedMillimeterPerSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumMinutesAdded() {
        this.bitField0_ &= -2;
        this.numMinutesAdded_ = 0;
    }

    public static rs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static rr newBuilder() {
        return (rr) DEFAULT_INSTANCE.createBuilder();
    }

    public static rs parseDelimitedFrom(InputStream inputStream) {
        return (rs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rs parseFrom(com.google.v.v vVar) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAllowedMillimeterPerSec(int i2) {
        this.bitField0_ |= 2;
        this.maxAllowedMillimeterPerSec_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumMinutesAdded(int i2) {
        this.bitField0_ |= 1;
        this.numMinutesAdded_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "numMinutesAdded_", "maxAllowedMillimeterPerSec_"});
        }
        if (iOrdinal == 3) {
            return new rs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getMaxAllowedMillimeterPerSec() {
        return this.maxAllowedMillimeterPerSec_;
    }

    public int getNumMinutesAdded() {
        return this.numMinutesAdded_;
    }

    public boolean hasMaxAllowedMillimeterPerSec() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNumMinutesAdded() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rr newBuilder(rs rsVar) {
        return (rr) DEFAULT_INSTANCE.createBuilder(rsVar);
    }

    public static rs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rs parseFrom(com.google.v.z zVar) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rs parseFrom(InputStream inputStream) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rs parseFrom(ByteBuffer byteBuffer) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rs parseFrom(byte[] bArr) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
