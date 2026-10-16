package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zt extends com.google.v.du<zt, zs> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int ASSISTANT_TRIGGERING_TYPE_FIELD_NUMBER = 2;
    private static final zt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<zt> PARSER;
    private int action_;
    private int assistantTriggeringType_;

    static {
        zt ztVar = new zt();
        DEFAULT_INSTANCE = ztVar;
        com.google.v.du.registerDefaultInstance(zt.class, ztVar);
    }

    private zt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantTriggeringType() {
        this.assistantTriggeringType_ = 0;
    }

    public static zt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static zs newBuilder() {
        return (zs) DEFAULT_INSTANCE.createBuilder();
    }

    public static zt parseDelimitedFrom(InputStream inputStream) {
        return (zt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zt parseFrom(com.google.v.v vVar) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<zt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(zr zrVar) {
        this.action_ = zrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"action_", "assistantTriggeringType_"});
        }
        if (iOrdinal == 3) {
            return new zt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<zt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (zt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public zr getAction() {
        int i2 = this.action_;
        zr zrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : zr.CLOSE : zr.CONFIRM : zr.ACTION_UNSPECIFIED;
        return zrVar == null ? zr.UNRECOGNIZED : zrVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public aad getAssistantTriggeringType() {
        aad aadVarA = aad.a(this.assistantTriggeringType_);
        return aadVarA == null ? aad.UNRECOGNIZED : aadVarA;
    }

    public int getAssistantTriggeringTypeValue() {
        return this.assistantTriggeringType_;
    }

    public static zs newBuilder(zt ztVar) {
        return (zs) DEFAULT_INSTANCE.createBuilder(ztVar);
    }

    public static zt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static zt parseFrom(com.google.v.z zVar) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static zt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static zt parseFrom(InputStream inputStream) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zt parseFrom(ByteBuffer byteBuffer) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static zt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static zt parseFrom(byte[] bArr) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static zt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (zt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
