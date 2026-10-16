package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mk extends com.google.v.du<mk, mj> implements com.google.v.fj {
    public static final int CURRENT_ROUTE_FIELD_NUMBER = 2;
    private static final mk DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mk> PARSER;
    private int bitField0_;
    private me currentRoute_;
    private String name_ = "unexpected_eta";

    static {
        mk mkVar = new mk();
        DEFAULT_INSTANCE = mkVar;
        com.google.v.du.registerDefaultInstance(mk.class, mkVar);
    }

    private mk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRoute() {
        this.currentRoute_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static mk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentRoute(me meVar) {
        Objects.requireNonNull(meVar);
        me meVar2 = this.currentRoute_;
        if (meVar2 != null && meVar2 != me.getDefaultInstance()) {
            mc mcVarNewBuilder = me.newBuilder(meVar2);
            mcVarNewBuilder.mergeFrom((mc) meVar);
            meVar = mcVarNewBuilder.buildPartial();
        }
        this.currentRoute_ = meVar;
        this.bitField0_ |= 2;
    }

    public static mj newBuilder() {
        return (mj) DEFAULT_INSTANCE.createBuilder();
    }

    public static mk parseDelimitedFrom(InputStream inputStream) {
        return (mk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mk parseFrom(com.google.v.v vVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRoute(me meVar) {
        Objects.requireNonNull(meVar);
        this.currentRoute_ = meVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "name_", "currentRoute_"});
        }
        if (iOrdinal == 3) {
            return new mk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public me getCurrentRoute() {
        me meVar = this.currentRoute_;
        return meVar == null ? me.getDefaultInstance() : meVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasCurrentRoute() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mj newBuilder(mk mkVar) {
        return (mj) DEFAULT_INSTANCE.createBuilder(mkVar);
    }

    public static mk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mk parseFrom(com.google.v.z zVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mk parseFrom(InputStream inputStream) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mk parseFrom(ByteBuffer byteBuffer) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mk parseFrom(byte[] bArr) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
