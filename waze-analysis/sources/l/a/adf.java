package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class adf extends com.google.v.du<adf, add> implements com.google.v.fj {
    private static final adf DEFAULT_INSTANCE;
    public static final int INBOX_CLICKED_FIELD_NUMBER = 2;
    public static final int INBOX_OPEN_FROM_PUSH_FIELD_NUMBER = 3;
    public static final int INBOX_SHOWN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<adf> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        adf adfVar = new adf();
        DEFAULT_INSTANCE = adfVar;
        com.google.v.du.registerDefaultInstance(adf.class, adfVar);
    }

    private adf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboxClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboxOpenFromPush() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboxShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static adf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInboxClicked(acy acyVar) {
        Objects.requireNonNull(acyVar);
        if (this.statCase_ == 2 && this.stat_ != acy.getDefaultInstance()) {
            acx acxVarNewBuilder = acy.newBuilder((acy) this.stat_);
            acxVarNewBuilder.mergeFrom((acx) acyVar);
            acyVar = acxVarNewBuilder.buildPartial();
        }
        this.stat_ = acyVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInboxOpenFromPush(ada adaVar) {
        Objects.requireNonNull(adaVar);
        if (this.statCase_ == 3 && this.stat_ != ada.getDefaultInstance()) {
            acz aczVarNewBuilder = ada.newBuilder((ada) this.stat_);
            aczVarNewBuilder.mergeFrom((acz) adaVar);
            adaVar = aczVarNewBuilder.buildPartial();
        }
        this.stat_ = adaVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInboxShown(adc adcVar) {
        Objects.requireNonNull(adcVar);
        if (this.statCase_ == 1 && this.stat_ != adc.getDefaultInstance()) {
            adb adbVarNewBuilder = adc.newBuilder((adc) this.stat_);
            adbVarNewBuilder.mergeFrom((adb) adcVar);
            adcVar = adbVarNewBuilder.buildPartial();
        }
        this.stat_ = adcVar;
        this.statCase_ = 1;
    }

    public static add newBuilder() {
        return (add) DEFAULT_INSTANCE.createBuilder();
    }

    public static adf parseDelimitedFrom(InputStream inputStream) {
        return (adf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adf parseFrom(com.google.v.v vVar) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<adf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboxClicked(acy acyVar) {
        Objects.requireNonNull(acyVar);
        this.stat_ = acyVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboxOpenFromPush(ada adaVar) {
        Objects.requireNonNull(adaVar);
        this.stat_ = adaVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboxShown(adc adcVar) {
        Objects.requireNonNull(adcVar);
        this.stat_ = adcVar;
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"stat_", "statCase_", adc.class, acy.class, ada.class});
        }
        if (iOrdinal == 3) {
            return new adf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new add(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<adf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (adf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public acy getInboxClicked() {
        return this.statCase_ == 2 ? (acy) this.stat_ : acy.getDefaultInstance();
    }

    public ada getInboxOpenFromPush() {
        return this.statCase_ == 3 ? (ada) this.stat_ : ada.getDefaultInstance();
    }

    public adc getInboxShown() {
        return this.statCase_ == 1 ? (adc) this.stat_ : adc.getDefaultInstance();
    }

    public ade getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return ade.f52236d;
        }
        if (i2 == 1) {
            return ade.f52233a;
        }
        if (i2 == 2) {
            return ade.f52234b;
        }
        if (i2 != 3) {
            return null;
        }
        return ade.f52235c;
    }

    public boolean hasInboxClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasInboxOpenFromPush() {
        return this.statCase_ == 3;
    }

    public boolean hasInboxShown() {
        return this.statCase_ == 1;
    }

    public static add newBuilder(adf adfVar) {
        return (add) DEFAULT_INSTANCE.createBuilder(adfVar);
    }

    public static adf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static adf parseFrom(com.google.v.z zVar) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static adf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static adf parseFrom(InputStream inputStream) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adf parseFrom(ByteBuffer byteBuffer) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static adf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static adf parseFrom(byte[] bArr) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static adf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (adf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
