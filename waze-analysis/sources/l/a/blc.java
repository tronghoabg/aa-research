package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class blc extends com.google.v.du<blc, bla> implements com.google.v.fj {
    public static final int BUTTON_FIELD_NUMBER = 1;
    private static final blc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<blc> PARSER;
    private int button_;

    static {
        blc blcVar = new blc();
        DEFAULT_INSTANCE = blcVar;
        com.google.v.du.registerDefaultInstance(blc.class, blcVar);
    }

    private blc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = 0;
    }

    public static blc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bla newBuilder() {
        return (bla) DEFAULT_INSTANCE.createBuilder();
    }

    public static blc parseDelimitedFrom(InputStream inputStream) {
        return (blc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blc parseFrom(com.google.v.v vVar) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<blc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(blb blbVar) {
        this.button_ = blbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonValue(int i2) {
        this.button_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"button_"});
        }
        if (iOrdinal == 3) {
            return new blc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bla(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<blc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (blc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public blb getButton() {
        int i2 = this.button_;
        blb blbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : blb.CTA : blb.CLOSE : blb.BUTTON_UNSPECIFIED;
        return blbVar == null ? blb.UNRECOGNIZED : blbVar;
    }

    public int getButtonValue() {
        return this.button_;
    }

    public static bla newBuilder(blc blcVar) {
        return (bla) DEFAULT_INSTANCE.createBuilder(blcVar);
    }

    public static blc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static blc parseFrom(com.google.v.z zVar) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static blc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static blc parseFrom(InputStream inputStream) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blc parseFrom(ByteBuffer byteBuffer) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static blc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static blc parseFrom(byte[] bArr) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static blc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (blc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
