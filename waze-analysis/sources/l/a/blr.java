package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class blr extends com.google.v.du<blr, blo> implements com.google.v.fj {
    private static final blr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<blr> PARSER = null;
    public static final int TO_MODE_FIELD_NUMBER = 1;
    public static final int UPDATE_SOURCE_FIELD_NUMBER = 2;
    private int toMode_;
    private int updateSource_;

    static {
        blr blrVar = new blr();
        DEFAULT_INSTANCE = blrVar;
        com.google.v.du.registerDefaultInstance(blr.class, blrVar);
    }

    private blr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToMode() {
        this.toMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateSource() {
        this.updateSource_ = 0;
    }

    public static blr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static blo newBuilder() {
        return (blo) DEFAULT_INSTANCE.createBuilder();
    }

    public static blr parseDelimitedFrom(InputStream inputStream) {
        return (blr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blr parseFrom(com.google.v.v vVar) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<blr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToMode(blp blpVar) {
        this.toMode_ = blpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToModeValue(int i2) {
        this.toMode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateSource(blq blqVar) {
        this.updateSource_ = blqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateSourceValue(int i2) {
        this.updateSource_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"toMode_", "updateSource_"});
        }
        if (iOrdinal == 3) {
            return new blr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new blo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<blr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (blr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public blp getToMode() {
        int i2 = this.toMode_;
        blp blpVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : blp.LIST_VIEW_MODE : blp.PANE_VIEW_MODE : blp.MODE_UNSPECIFIED;
        return blpVar == null ? blp.UNRECOGNIZED : blpVar;
    }

    public int getToModeValue() {
        return this.toMode_;
    }

    public blq getUpdateSource() {
        int i2 = this.updateSource_;
        blq blqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : blq.SYSTEM : blq.USER_ACTION : blq.UPDATE_SOURCE_UNSPECIFIED;
        return blqVar == null ? blq.UNRECOGNIZED : blqVar;
    }

    public int getUpdateSourceValue() {
        return this.updateSource_;
    }

    public static blo newBuilder(blr blrVar) {
        return (blo) DEFAULT_INSTANCE.createBuilder(blrVar);
    }

    public static blr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static blr parseFrom(com.google.v.z zVar) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static blr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static blr parseFrom(InputStream inputStream) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blr parseFrom(ByteBuffer byteBuffer) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static blr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static blr parseFrom(byte[] bArr) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static blr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (blr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
