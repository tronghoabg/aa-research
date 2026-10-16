package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rl extends com.google.v.du<rl, rk> implements com.google.v.fj {
    private static final rl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<rl> PARSER = null;
    public static final int ROUTE_TYPE_LABEL_FIELD_NUMBER = 1;
    public static final int TRAFFIC_STATUS_LABEL_FIELD_NUMBER = 2;
    private int bitField0_;
    private String routeTypeLabel_ = "";
    private String trafficStatusLabel_ = "";

    static {
        rl rlVar = new rl();
        DEFAULT_INSTANCE = rlVar;
        com.google.v.du.registerDefaultInstance(rl.class, rlVar);
    }

    private rl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteTypeLabel() {
        this.bitField0_ &= -2;
        this.routeTypeLabel_ = getDefaultInstance().getRouteTypeLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficStatusLabel() {
        this.bitField0_ &= -3;
        this.trafficStatusLabel_ = getDefaultInstance().getTrafficStatusLabel();
    }

    public static rl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static rk newBuilder() {
        return (rk) DEFAULT_INSTANCE.createBuilder();
    }

    public static rl parseDelimitedFrom(InputStream inputStream) {
        return (rl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rl parseFrom(com.google.v.v vVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteTypeLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.routeTypeLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteTypeLabelBytes(com.google.v.v vVar) {
        this.routeTypeLabel_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficStatusLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.trafficStatusLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficStatusLabelBytes(com.google.v.v vVar) {
        this.trafficStatusLabel_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "routeTypeLabel_", "trafficStatusLabel_"});
        }
        if (iOrdinal == 3) {
            return new rl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getRouteTypeLabel() {
        return this.routeTypeLabel_;
    }

    public com.google.v.v getRouteTypeLabelBytes() {
        return com.google.v.v.s(this.routeTypeLabel_);
    }

    public String getTrafficStatusLabel() {
        return this.trafficStatusLabel_;
    }

    public com.google.v.v getTrafficStatusLabelBytes() {
        return com.google.v.v.s(this.trafficStatusLabel_);
    }

    public boolean hasRouteTypeLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrafficStatusLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static rk newBuilder(rl rlVar) {
        return (rk) DEFAULT_INSTANCE.createBuilder(rlVar);
    }

    public static rl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rl parseFrom(com.google.v.z zVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rl parseFrom(InputStream inputStream) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rl parseFrom(ByteBuffer byteBuffer) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rl parseFrom(byte[] bArr) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
