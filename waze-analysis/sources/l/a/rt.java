package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class rt extends com.google.v.du<rt, rs> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final rt DEFAULT_INSTANCE;
    public static final int DETOUR_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<rt> PARSER;
    private int action_;
    private int bitField0_;
    private ro detour_;

    static {
        rt rtVar = new rt();
        DEFAULT_INSTANCE = rtVar;
        com.google.v.du.registerDefaultInstance(rt.class, rtVar);
    }

    private rt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetour() {
        this.detour_ = null;
        this.bitField0_ &= -2;
    }

    public static rt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        ro roVar2 = this.detour_;
        if (roVar2 != null && roVar2 != ro.getDefaultInstance()) {
            rn rnVarNewBuilder = ro.newBuilder(roVar2);
            rnVarNewBuilder.mergeFrom((rn) roVar);
            roVar = rnVarNewBuilder.buildPartial();
        }
        this.detour_ = roVar;
        this.bitField0_ |= 1;
    }

    public static rs newBuilder() {
        return (rs) DEFAULT_INSTANCE.createBuilder();
    }

    public static rt parseDelimitedFrom(InputStream inputStream) {
        return (rt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rt parseFrom(com.google.v.v vVar) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(rr rrVar) {
        this.action_ = rrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        this.detour_ = roVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "detour_", "action_"});
        }
        if (iOrdinal == 3) {
            return new rt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public rr getAction() {
        int i2 = this.action_;
        rr rrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : rr.NAIVE_ROUTE_LABEL : rr.NAIVE_ROUTE : rr.ACTION_UNSPECIFIED;
        return rrVar == null ? rr.UNRECOGNIZED : rrVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public ro getDetour() {
        ro roVar = this.detour_;
        return roVar == null ? ro.getDefaultInstance() : roVar;
    }

    public boolean hasDetour() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rs newBuilder(rt rtVar) {
        return (rs) DEFAULT_INSTANCE.createBuilder(rtVar);
    }

    public static rt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rt parseFrom(com.google.v.z zVar) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rt parseFrom(InputStream inputStream) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rt parseFrom(ByteBuffer byteBuffer) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rt parseFrom(byte[] bArr) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
