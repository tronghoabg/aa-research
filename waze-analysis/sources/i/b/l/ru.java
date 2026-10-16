package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ru extends com.google.v.du<ru, rt> implements com.google.v.fj {
    private static final ru DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ru> PARSER = null;
    public static final int ROUTE_TYPE_LABEL_FIELD_NUMBER = 1;
    private int bitField0_;
    private String routeTypeLabel_ = "";

    static {
        ru ruVar = new ru();
        DEFAULT_INSTANCE = ruVar;
        com.google.v.du.registerDefaultInstance(ru.class, ruVar);
    }

    private ru() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteTypeLabel() {
        this.bitField0_ &= -2;
        this.routeTypeLabel_ = getDefaultInstance().getRouteTypeLabel();
    }

    public static ru getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static rt newBuilder() {
        return (rt) DEFAULT_INSTANCE.createBuilder();
    }

    public static ru parseDelimitedFrom(InputStream inputStream) {
        return (ru) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ru parseFrom(com.google.v.v vVar) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ru> parser() {
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "routeTypeLabel_"});
        }
        if (iOrdinal == 3) {
            return new ru();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ru> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ru.class) {
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

    public boolean hasRouteTypeLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rt newBuilder(ru ruVar) {
        return (rt) DEFAULT_INSTANCE.createBuilder(ruVar);
    }

    public static ru parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ru) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ru parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ru parseFrom(com.google.v.z zVar) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ru parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ru parseFrom(InputStream inputStream) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ru parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ru parseFrom(ByteBuffer byteBuffer) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ru parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ru parseFrom(byte[] bArr) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ru parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
