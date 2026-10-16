package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zv extends com.google.v.du<zv, zu> implements com.google.v.fj {
    public static final int ASSISTANT_TRIGGERING_TYPE_FIELD_NUMBER = 1;
    private static final zv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<zv> PARSER;
    private int assistantTriggeringType_;

    static {
        zv zvVar = new zv();
        DEFAULT_INSTANCE = zvVar;
        com.google.v.du.registerDefaultInstance(zv.class, zvVar);
    }

    private zv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantTriggeringType() {
        this.assistantTriggeringType_ = 0;
    }

    public static zv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static zu newBuilder() {
        return (zu) DEFAULT_INSTANCE.createBuilder();
    }

    public static zv parseDelimitedFrom(InputStream inputStream) {
        return (zv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zv parseFrom(com.google.v.v vVar) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<zv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantTriggeringType(aad aadVar) {
        this.assistantTriggeringType_ = aadVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantTriggeringTypeValue(int i2) {
        this.assistantTriggeringType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"assistantTriggeringType_"});
        }
        if (iOrdinal == 3) {
            return new zv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<zv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (zv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aad getAssistantTriggeringType() {
        aad aadVarA = aad.a(this.assistantTriggeringType_);
        return aadVarA == null ? aad.UNRECOGNIZED : aadVarA;
    }

    public int getAssistantTriggeringTypeValue() {
        return this.assistantTriggeringType_;
    }

    public static zu newBuilder(zv zvVar) {
        return (zu) DEFAULT_INSTANCE.createBuilder(zvVar);
    }

    public static zv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static zv parseFrom(com.google.v.z zVar) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static zv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static zv parseFrom(InputStream inputStream) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zv parseFrom(ByteBuffer byteBuffer) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static zv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static zv parseFrom(byte[] bArr) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static zv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (zv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
