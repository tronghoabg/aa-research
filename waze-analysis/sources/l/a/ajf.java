package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajf extends com.google.v.du<ajf, aje> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ajf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajf> PARSER;
    private int action_;

    static {
        ajf ajfVar = new ajf();
        DEFAULT_INSTANCE = ajfVar;
        com.google.v.du.registerDefaultInstance(ajf.class, ajfVar);
    }

    private ajf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static ajf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aje newBuilder() {
        return (aje) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajf parseDelimitedFrom(InputStream inputStream) {
        return (ajf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajf parseFrom(com.google.v.v vVar) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ajd ajdVar) {
        this.action_ = ajdVar.getNumber();
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
            return new ajf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aje(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ajd getAction() {
        int i2 = this.action_;
        ajd ajdVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ajd.ZOOM_OUT : ajd.ZOOM_IN : ajd.BUTTON_EXPANDED : ajd.ACTION_UNSPECIFIED;
        return ajdVar == null ? ajd.UNRECOGNIZED : ajdVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static aje newBuilder(ajf ajfVar) {
        return (aje) DEFAULT_INSTANCE.createBuilder(ajfVar);
    }

    public static ajf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajf parseFrom(com.google.v.z zVar) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajf parseFrom(InputStream inputStream) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajf parseFrom(ByteBuffer byteBuffer) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajf parseFrom(byte[] bArr) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
