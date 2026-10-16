package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mi extends com.google.v.du<mi, mh> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_FIELD_NUMBER = 3;
    public static final int CURRENT_ROUTE_FIELD_NUMBER = 2;
    private static final mi DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mi> PARSER;
    private me alternativeRoute_;
    private int bitField0_;
    private me currentRoute_;
    private String name_ = "typically_best_not_suggested";

    static {
        mi miVar = new mi();
        DEFAULT_INSTANCE = miVar;
        com.google.v.du.registerDefaultInstance(mi.class, miVar);
    }

    private mi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoute() {
        this.alternativeRoute_ = null;
        this.bitField0_ &= -5;
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

    public static mi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoute(me meVar) {
        Objects.requireNonNull(meVar);
        me meVar2 = this.alternativeRoute_;
        if (meVar2 != null && meVar2 != me.getDefaultInstance()) {
            mc mcVarNewBuilder = me.newBuilder(meVar2);
            mcVarNewBuilder.mergeFrom((mc) meVar);
            meVar = mcVarNewBuilder.buildPartial();
        }
        this.alternativeRoute_ = meVar;
        this.bitField0_ |= 4;
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

    public static mh newBuilder() {
        return (mh) DEFAULT_INSTANCE.createBuilder();
    }

    public static mi parseDelimitedFrom(InputStream inputStream) {
        return (mi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mi parseFrom(com.google.v.v vVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoute(me meVar) {
        Objects.requireNonNull(meVar);
        this.alternativeRoute_ = meVar;
        this.bitField0_ |= 4;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "name_", "currentRoute_", "alternativeRoute_"});
        }
        if (iOrdinal == 3) {
            return new mi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public me getAlternativeRoute() {
        me meVar = this.alternativeRoute_;
        return meVar == null ? me.getDefaultInstance() : meVar;
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

    public boolean hasAlternativeRoute() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCurrentRoute() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mh newBuilder(mi miVar) {
        return (mh) DEFAULT_INSTANCE.createBuilder(miVar);
    }

    public static mi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mi parseFrom(com.google.v.z zVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mi parseFrom(InputStream inputStream) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mi parseFrom(ByteBuffer byteBuffer) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mi parseFrom(byte[] bArr) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
