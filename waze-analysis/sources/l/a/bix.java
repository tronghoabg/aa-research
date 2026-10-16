package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bix extends com.google.v.du<bix, biw> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bix DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bix> PARSER;
    private int action_;

    static {
        bix bixVar = new bix();
        DEFAULT_INSTANCE = bixVar;
        com.google.v.du.registerDefaultInstance(bix.class, bixVar);
    }

    private bix() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static bix getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static biw newBuilder() {
        return (biw) DEFAULT_INSTANCE.createBuilder();
    }

    public static bix parseDelimitedFrom(InputStream inputStream) {
        return (bix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bix parseFrom(com.google.v.v vVar) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bix> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(biv bivVar) {
        this.action_ = bivVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"action_"});
        }
        if (iOrdinal == 3) {
            return new bix();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new biw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bix> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bix.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public biv getAction() {
        int i2 = this.action_;
        biv bivVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : biv.HELP_URL_CLICKED : biv.URL_ACTION_CLICKED : biv.CLOSED : biv.ACTION_UNSPECIFIED;
        return bivVar == null ? biv.UNRECOGNIZED : bivVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static biw newBuilder(bix bixVar) {
        return (biw) DEFAULT_INSTANCE.createBuilder(bixVar);
    }

    public static bix parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bix parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bix parseFrom(com.google.v.z zVar) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bix parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bix parseFrom(InputStream inputStream) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bix parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bix parseFrom(ByteBuffer byteBuffer) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bix parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bix parseFrom(byte[] bArr) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bix parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
