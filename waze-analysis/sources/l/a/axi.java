package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axi extends com.google.v.du<axi, axg> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final axi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<axi> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int action_;
    private int type_;

    static {
        axi axiVar = new axi();
        DEFAULT_INSTANCE = axiVar;
        com.google.v.du.registerDefaultInstance(axi.class, axiVar);
    }

    private axi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static axi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axg newBuilder() {
        return (axg) DEFAULT_INSTANCE.createBuilder();
    }

    public static axi parseDelimitedFrom(InputStream inputStream) {
        return (axi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axi parseFrom(com.google.v.v vVar) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(axf axfVar) {
        this.action_ = axfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(axh axhVar) {
        this.type_ = axhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"action_", "type_"});
        }
        if (iOrdinal == 3) {
            return new axi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public axf getAction() {
        int i2 = this.action_;
        axf axfVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : axf.SELECT : axf.NEW : axf.EDIT : axf.CLOSE : axf.ACTION_UNSPECIFIED;
        return axfVar == null ? axf.UNRECOGNIZED : axfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public axh getType() {
        int i2 = this.type_;
        axh axhVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : axh.WORK : axh.OTHER_PLACE : axh.HOME : axh.TYPE_UNSPECIFIED;
        return axhVar == null ? axh.UNRECOGNIZED : axhVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static axg newBuilder(axi axiVar) {
        return (axg) DEFAULT_INSTANCE.createBuilder(axiVar);
    }

    public static axi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axi parseFrom(com.google.v.z zVar) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axi parseFrom(InputStream inputStream) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axi parseFrom(ByteBuffer byteBuffer) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axi parseFrom(byte[] bArr) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
