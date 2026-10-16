package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class auc extends com.google.v.du<auc, aub> implements com.google.v.fj {
    public static final int AADC_ON_FIELD_NUMBER = 1;
    private static final auc DEFAULT_INSTANCE;
    public static final int GDPR_ON_FIELD_NUMBER = 2;
    public static final int ND4C_ON_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<auc> PARSER = null;
    public static final int U18_ON_FIELD_NUMBER = 4;
    private boolean aadcOn_;
    private int bitField0_;
    private boolean gdprOn_;
    private boolean nd4COn_;
    private boolean u18On_;

    static {
        auc aucVar = new auc();
        DEFAULT_INSTANCE = aucVar;
        com.google.v.du.registerDefaultInstance(auc.class, aucVar);
    }

    private auc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAadcOn() {
        this.bitField0_ &= -2;
        this.aadcOn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprOn() {
        this.bitField0_ &= -3;
        this.gdprOn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNd4COn() {
        this.bitField0_ &= -5;
        this.nd4COn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearU18On() {
        this.bitField0_ &= -9;
        this.u18On_ = false;
    }

    public static auc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aub newBuilder() {
        return (aub) DEFAULT_INSTANCE.createBuilder();
    }

    public static auc parseDelimitedFrom(InputStream inputStream) {
        return (auc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auc parseFrom(com.google.v.v vVar) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<auc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAadcOn(boolean z) {
        this.bitField0_ |= 1;
        this.aadcOn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprOn(boolean z) {
        this.bitField0_ |= 2;
        this.gdprOn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNd4COn(boolean z) {
        this.bitField0_ |= 4;
        this.nd4COn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setU18On(boolean z) {
        this.bitField0_ |= 8;
        this.u18On_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "aadcOn_", "gdprOn_", "nd4COn_", "u18On_"});
        }
        if (iOrdinal == 3) {
            return new auc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aub(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<auc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (auc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAadcOn() {
        return this.aadcOn_;
    }

    public boolean getGdprOn() {
        return this.gdprOn_;
    }

    public boolean getNd4COn() {
        return this.nd4COn_;
    }

    public boolean getU18On() {
        return this.u18On_;
    }

    public boolean hasAadcOn() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGdprOn() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNd4COn() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasU18On() {
        return (this.bitField0_ & 8) != 0;
    }

    public static aub newBuilder(auc aucVar) {
        return (aub) DEFAULT_INSTANCE.createBuilder(aucVar);
    }

    public static auc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static auc parseFrom(com.google.v.z zVar) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static auc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static auc parseFrom(InputStream inputStream) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auc parseFrom(ByteBuffer byteBuffer) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static auc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static auc parseFrom(byte[] bArr) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static auc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (auc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
