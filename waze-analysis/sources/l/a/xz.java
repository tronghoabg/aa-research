package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xz extends com.google.v.du<xz, xy> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AVAILABILITY_CHANGED_FIELD_NUMBER = 2;
    private static final xz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<xz> PARSER = null;
    public static final int PRICES_CHANGED_FIELD_NUMBER = 3;
    private int action_;
    private boolean availabilityChanged_;
    private int bitField0_;
    private boolean pricesChanged_;

    static {
        xz xzVar = new xz();
        DEFAULT_INSTANCE = xzVar;
        com.google.v.du.registerDefaultInstance(xz.class, xzVar);
    }

    private xz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityChanged() {
        this.bitField0_ &= -2;
        this.availabilityChanged_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPricesChanged() {
        this.bitField0_ &= -3;
        this.pricesChanged_ = false;
    }

    public static xz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xy newBuilder() {
        return (xy) DEFAULT_INSTANCE.createBuilder();
    }

    public static xz parseDelimitedFrom(InputStream inputStream) {
        return (xz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xz parseFrom(com.google.v.v vVar) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(xx xxVar) {
        this.action_ = xxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityChanged(boolean z) {
        this.bitField0_ |= 1;
        this.availabilityChanged_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPricesChanged(boolean z) {
        this.bitField0_ |= 2;
        this.pricesChanged_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"bitField0_", "action_", "availabilityChanged_", "pricesChanged_"});
        }
        if (iOrdinal == 3) {
            return new xz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public xx getAction() {
        int i2 = this.action_;
        xx xxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : xx.CONFIRM : xx.CLOSE : xx.BACK : xx.ACTION_UNSPECIFIED;
        return xxVar == null ? xx.UNRECOGNIZED : xxVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getAvailabilityChanged() {
        return this.availabilityChanged_;
    }

    public boolean getPricesChanged() {
        return this.pricesChanged_;
    }

    public boolean hasAvailabilityChanged() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPricesChanged() {
        return (this.bitField0_ & 2) != 0;
    }

    public static xy newBuilder(xz xzVar) {
        return (xy) DEFAULT_INSTANCE.createBuilder(xzVar);
    }

    public static xz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xz parseFrom(com.google.v.z zVar) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xz parseFrom(InputStream inputStream) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xz parseFrom(ByteBuffer byteBuffer) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xz parseFrom(byte[] bArr) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
