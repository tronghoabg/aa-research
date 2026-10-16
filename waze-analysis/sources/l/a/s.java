package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class s extends com.google.v.du<s, q> implements com.google.v.fj {
    public static final int AD_INTERACTION_EVENT_WRAPPER_FIELD_NUMBER = 1;
    private static final s DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<s> PARSER;
    private int eventWrapperCase_ = 0;
    private Object eventWrapper_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        com.google.v.du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdInteractionEventWrapper() {
        if (this.eventWrapperCase_ == 1) {
            this.eventWrapperCase_ = 0;
            this.eventWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventWrapper() {
        this.eventWrapperCase_ = 0;
        this.eventWrapper_ = null;
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdInteractionEventWrapper(z zVar) {
        Objects.requireNonNull(zVar);
        if (this.eventWrapperCase_ == 1 && this.eventWrapper_ != z.getDefaultInstance()) {
            x xVarNewBuilder = z.newBuilder((z) this.eventWrapper_);
            xVarNewBuilder.mergeFrom((x) zVar);
            zVar = xVarNewBuilder.buildPartial();
        }
        this.eventWrapper_ = zVar;
        this.eventWrapperCase_ = 1;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdInteractionEventWrapper(z zVar) {
        Objects.requireNonNull(zVar);
        this.eventWrapper_ = zVar;
        this.eventWrapperCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"eventWrapper_", "eventWrapperCase_", z.class});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public z getAdInteractionEventWrapper() {
        return this.eventWrapperCase_ == 1 ? (z) this.eventWrapper_ : z.getDefaultInstance();
    }

    public r getEventWrapperCase() {
        int i2 = this.eventWrapperCase_;
        if (i2 == 0) {
            return r.f55328b;
        }
        if (i2 != 1) {
            return null;
        }
        return r.f55327a;
    }

    public boolean hasAdInteractionEventWrapper() {
        return this.eventWrapperCase_ == 1;
    }

    public static q newBuilder(s sVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
