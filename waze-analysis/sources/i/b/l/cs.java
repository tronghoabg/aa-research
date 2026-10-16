package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cs extends com.google.v.du<cs, cr> implements com.google.v.fj {
    private static final cs DEFAULT_INSTANCE;
    public static final int MEETING_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<cs> PARSER;
    private int bitField0_;
    private ex meeting_;

    static {
        cs csVar = new cs();
        DEFAULT_INSTANCE = csVar;
        com.google.v.du.registerDefaultInstance(cs.class, csVar);
    }

    private cs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeeting() {
        this.meeting_ = null;
        this.bitField0_ &= -2;
    }

    public static cs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMeeting(ex exVar) {
        Objects.requireNonNull(exVar);
        ex exVar2 = this.meeting_;
        if (exVar2 != null && exVar2 != ex.getDefaultInstance()) {
            ew ewVarNewBuilder = ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.meeting_ = exVar;
        this.bitField0_ |= 1;
    }

    public static cr newBuilder() {
        return (cr) DEFAULT_INSTANCE.createBuilder();
    }

    public static cs parseDelimitedFrom(InputStream inputStream) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(com.google.v.v vVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeeting(ex exVar) {
        Objects.requireNonNull(exVar);
        this.meeting_ = exVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "meeting_"});
        }
        if (iOrdinal == 3) {
            return new cs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ex getMeeting() {
        ex exVar = this.meeting_;
        return exVar == null ? ex.getDefaultInstance() : exVar;
    }

    public boolean hasMeeting() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cr newBuilder(cs csVar) {
        return (cr) DEFAULT_INSTANCE.createBuilder(csVar);
    }

    public static cs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cs parseFrom(com.google.v.z zVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cs parseFrom(InputStream inputStream) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(ByteBuffer byteBuffer) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cs parseFrom(byte[] bArr) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
