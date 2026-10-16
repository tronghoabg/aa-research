package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class amb extends com.google.v.du<amb, ama> implements com.google.v.fj {
    private static final amb DEFAULT_INSTANCE;
    public static final int DESTINATION_COORDINATES_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<amb> PARSER;
    private int bitField0_;
    private afx destinationCoordinates_;

    static {
        amb ambVar = new amb();
        DEFAULT_INSTANCE = ambVar;
        com.google.v.du.registerDefaultInstance(amb.class, ambVar);
    }

    private amb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCoordinates() {
        this.destinationCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    public static amb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.destinationCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    public static ama newBuilder() {
        return (ama) DEFAULT_INSTANCE.createBuilder();
    }

    public static amb parseDelimitedFrom(InputStream inputStream) {
        return (amb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amb parseFrom(com.google.v.v vVar) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<amb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "destinationCoordinates_"});
        }
        if (iOrdinal == 3) {
            return new amb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ama(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<amb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (amb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public afx getDestinationCoordinates() {
        afx afxVar = this.destinationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean hasDestinationCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ama newBuilder(amb ambVar) {
        return (ama) DEFAULT_INSTANCE.createBuilder(ambVar);
    }

    public static amb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static amb parseFrom(com.google.v.z zVar) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static amb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static amb parseFrom(InputStream inputStream) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amb parseFrom(ByteBuffer byteBuffer) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static amb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static amb parseFrom(byte[] bArr) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static amb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (amb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
