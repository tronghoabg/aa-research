package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tp extends com.google.v.du<tp, to> implements com.google.v.fj {
    private static final tp DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int EVENT_ID_FIELD_NUMBER = 1;
    public static final int EVENT_NAME_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<tp> PARSER;
    private int bitField0_;
    private int duration_;
    private String eventId_ = "";
    private String eventName_ = "";
    private i.b.am params_;

    static {
        tp tpVar = new tp();
        DEFAULT_INSTANCE = tpVar;
        com.google.v.du.registerDefaultInstance(tp.class, tpVar);
    }

    private tp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.bitField0_ &= -9;
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.bitField0_ &= -2;
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventName() {
        this.bitField0_ &= -3;
        this.eventName_ = getDefaultInstance().getEventName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
        this.bitField0_ &= -5;
    }

    public static tp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.params_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.params_ = amVar;
        this.bitField0_ |= 4;
    }

    public static to newBuilder() {
        return (to) DEFAULT_INSTANCE.createBuilder();
    }

    public static tp parseDelimitedFrom(InputStream inputStream) {
        return (tp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tp parseFrom(com.google.v.v vVar) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i2) {
        this.bitField0_ |= 8;
        this.duration_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(com.google.v.v vVar) {
        this.eventId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.eventName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventNameBytes(com.google.v.v vVar) {
        this.eventName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.params_ = amVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"bitField0_", "eventId_", "eventName_", "params_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new tp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new to(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDuration() {
        return this.duration_;
    }

    public String getEventId() {
        return this.eventId_;
    }

    public com.google.v.v getEventIdBytes() {
        return com.google.v.v.s(this.eventId_);
    }

    public String getEventName() {
        return this.eventName_;
    }

    public com.google.v.v getEventNameBytes() {
        return com.google.v.v.s(this.eventName_);
    }

    public i.b.am getParams() {
        i.b.am amVar = this.params_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    public boolean hasDuration() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEventId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasEventName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParams() {
        return (this.bitField0_ & 4) != 0;
    }

    public static to newBuilder(tp tpVar) {
        return (to) DEFAULT_INSTANCE.createBuilder(tpVar);
    }

    public static tp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tp parseFrom(com.google.v.z zVar) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tp parseFrom(InputStream inputStream) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tp parseFrom(ByteBuffer byteBuffer) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tp parseFrom(byte[] bArr) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
