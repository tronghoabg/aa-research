package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aup extends com.google.v.du<aup, auo> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final aup DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aup> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int action_;
    private int type_;

    static {
        aup aupVar = new aup();
        DEFAULT_INSTANCE = aupVar;
        com.google.v.du.registerDefaultInstance(aup.class, aupVar);
    }

    private aup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static aup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static auo newBuilder() {
        return (auo) DEFAULT_INSTANCE.createBuilder();
    }

    public static aup parseDelimitedFrom(InputStream inputStream) {
        return (aup) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aup parseFrom(com.google.v.v vVar) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aun aunVar) {
        this.action_ = aunVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bob bobVar) {
        this.type_ = bobVar.getNumber();
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
            return new aup();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new auo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aup> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aup.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aun getAction() {
        int i2 = this.action_;
        aun aunVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : aun.SELECT : aun.CLOSE : aun.ACTION_UNSPECIFIED;
        return aunVar == null ? aun.UNRECOGNIZED : aunVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public bob getType() {
        bob bobVarA = bob.a(this.type_);
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static auo newBuilder(aup aupVar) {
        return (auo) DEFAULT_INSTANCE.createBuilder(aupVar);
    }

    public static aup parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aup) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aup parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aup parseFrom(com.google.v.z zVar) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aup parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aup parseFrom(InputStream inputStream) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aup parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aup parseFrom(ByteBuffer byteBuffer) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aup parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aup parseFrom(byte[] bArr) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aup parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aup) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
