package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apw extends com.google.v.du<apw, apv> implements com.google.v.fj {
    public static final int AD_SHOWN_AT_TOP_FIELD_NUMBER = 2;
    private static final apw DEFAULT_INSTANCE;
    public static final int NUM_RESULTS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<apw> PARSER = null;
    public static final int POPULAR_SHOWN_AT_TOP_FIELD_NUMBER = 3;
    private boolean adShownAtTop_;
    private int bitField0_;
    private long numResults_;
    private boolean popularShownAtTop_;

    static {
        apw apwVar = new apw();
        DEFAULT_INSTANCE = apwVar;
        com.google.v.du.registerDefaultInstance(apw.class, apwVar);
    }

    private apw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdShownAtTop() {
        this.bitField0_ &= -3;
        this.adShownAtTop_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumResults() {
        this.bitField0_ &= -2;
        this.numResults_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularShownAtTop() {
        this.bitField0_ &= -5;
        this.popularShownAtTop_ = false;
    }

    public static apw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static apv newBuilder() {
        return (apv) DEFAULT_INSTANCE.createBuilder();
    }

    public static apw parseDelimitedFrom(InputStream inputStream) {
        return (apw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apw parseFrom(com.google.v.v vVar) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdShownAtTop(boolean z) {
        this.bitField0_ |= 2;
        this.adShownAtTop_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumResults(long j2) {
        this.bitField0_ |= 1;
        this.numResults_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularShownAtTop(boolean z) {
        this.bitField0_ |= 4;
        this.popularShownAtTop_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "numResults_", "adShownAtTop_", "popularShownAtTop_"});
        }
        if (iOrdinal == 3) {
            return new apw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new apv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAdShownAtTop() {
        return this.adShownAtTop_;
    }

    public long getNumResults() {
        return this.numResults_;
    }

    public boolean getPopularShownAtTop() {
        return this.popularShownAtTop_;
    }

    public boolean hasAdShownAtTop() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNumResults() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPopularShownAtTop() {
        return (this.bitField0_ & 4) != 0;
    }

    public static apv newBuilder(apw apwVar) {
        return (apv) DEFAULT_INSTANCE.createBuilder(apwVar);
    }

    public static apw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apw parseFrom(com.google.v.z zVar) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apw parseFrom(InputStream inputStream) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apw parseFrom(ByteBuffer byteBuffer) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apw parseFrom(byte[] bArr) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
