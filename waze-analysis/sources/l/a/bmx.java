package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmx extends com.google.v.du<bmx, bmv> implements com.google.v.fj {
    public static final int CHANGED_TO_FIELD_NUMBER = 1;
    private static final bmx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bmx> PARSER;
    private int changedTo_;

    static {
        bmx bmxVar = new bmx();
        DEFAULT_INSTANCE = bmxVar;
        com.google.v.du.registerDefaultInstance(bmx.class, bmxVar);
    }

    private bmx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = 0;
    }

    public static bmx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bmv newBuilder() {
        return (bmv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmx parseDelimitedFrom(InputStream inputStream) {
        return (bmx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmx parseFrom(com.google.v.v vVar) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(bmw bmwVar) {
        this.changedTo_ = bmwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToValue(int i2) {
        this.changedTo_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"changedTo_"});
        }
        if (iOrdinal == 3) {
            return new bmx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bmw getChangedTo() {
        int i2 = this.changedTo_;
        bmw bmwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bmw.UGC_BUTTON_UNSHRINK : bmw.UGC_BUTTON_SHRINK : bmw.UGC_BUTTON_HIDDEN : bmw.UGC_BUTTON_SHOWN : bmw.UGC_BUTTON_STATE_UNSPECIFIED;
        return bmwVar == null ? bmw.UNRECOGNIZED : bmwVar;
    }

    public int getChangedToValue() {
        return this.changedTo_;
    }

    public static bmv newBuilder(bmx bmxVar) {
        return (bmv) DEFAULT_INSTANCE.createBuilder(bmxVar);
    }

    public static bmx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmx parseFrom(com.google.v.z zVar) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmx parseFrom(InputStream inputStream) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmx parseFrom(ByteBuffer byteBuffer) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmx parseFrom(byte[] bArr) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
