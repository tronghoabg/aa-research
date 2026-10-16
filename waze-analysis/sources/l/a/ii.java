package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ii extends com.google.v.du<ii, ih> implements com.google.v.fj {
    private static final ii DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ii> PARSER = null;
    public static final int REQUEST_TRIGGER_FIELD_NUMBER = 1;
    private int requestTrigger_;

    static {
        ii iiVar = new ii();
        DEFAULT_INSTANCE = iiVar;
        com.google.v.du.registerDefaultInstance(ii.class, iiVar);
    }

    private ii() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTrigger() {
        this.requestTrigger_ = 0;
    }

    public static ii getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ih newBuilder() {
        return (ih) DEFAULT_INSTANCE.createBuilder();
    }

    public static ii parseDelimitedFrom(InputStream inputStream) {
        return (ii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ii parseFrom(com.google.v.v vVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ii> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTrigger(in inVar) {
        this.requestTrigger_ = inVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTriggerValue(int i2) {
        this.requestTrigger_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"requestTrigger_"});
        }
        if (iOrdinal == 3) {
            return new ii();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ih(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ii> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ii.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public in getRequestTrigger() {
        in inVarA = in.a(this.requestTrigger_);
        return inVarA == null ? in.UNRECOGNIZED : inVarA;
    }

    public int getRequestTriggerValue() {
        return this.requestTrigger_;
    }

    public static ih newBuilder(ii iiVar) {
        return (ih) DEFAULT_INSTANCE.createBuilder(iiVar);
    }

    public static ii parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ii parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ii parseFrom(com.google.v.z zVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ii parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ii parseFrom(InputStream inputStream) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ii parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ii parseFrom(ByteBuffer byteBuffer) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ii parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ii parseFrom(byte[] bArr) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ii parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
