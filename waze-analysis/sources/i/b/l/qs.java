package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qs extends com.google.v.du<qs, qr> implements com.google.v.fj {
    public static final int BRIEF_EXPLANATION_WITH_ARGUMENTS_FIELD_NUMBER = 3;
    private static final qs DEFAULT_INSTANCE;
    public static final int DISPLAY_BRIEF_EXPLANATION_FIELD_NUMBER = 1;
    public static final int DISPLAY_VERBOSE_EXPLANATION_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<qs> PARSER = null;
    public static final int VERBOSE_EXPLANATION_WITH_ARGUMENTS_FIELD_NUMBER = 4;
    private int bitField0_;
    private i.b.ao briefExplanationWithArguments_;
    private String displayBriefExplanation_ = "";
    private String displayVerboseExplanation_ = "";
    private i.b.ao verboseExplanationWithArguments_;

    static {
        qs qsVar = new qs();
        DEFAULT_INSTANCE = qsVar;
        com.google.v.du.registerDefaultInstance(qs.class, qsVar);
    }

    private qs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBriefExplanationWithArguments() {
        this.briefExplanationWithArguments_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayBriefExplanation() {
        this.bitField0_ &= -2;
        this.displayBriefExplanation_ = getDefaultInstance().getDisplayBriefExplanation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayVerboseExplanation() {
        this.bitField0_ &= -3;
        this.displayVerboseExplanation_ = getDefaultInstance().getDisplayVerboseExplanation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerboseExplanationWithArguments() {
        this.verboseExplanationWithArguments_ = null;
        this.bitField0_ &= -9;
    }

    public static qs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBriefExplanationWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        i.b.ao aoVar2 = this.briefExplanationWithArguments_;
        if (aoVar2 != null && aoVar2 != i.b.ao.getDefaultInstance()) {
            i.b.an anVarNewBuilder = i.b.ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((i.b.an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.briefExplanationWithArguments_ = aoVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVerboseExplanationWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        i.b.ao aoVar2 = this.verboseExplanationWithArguments_;
        if (aoVar2 != null && aoVar2 != i.b.ao.getDefaultInstance()) {
            i.b.an anVarNewBuilder = i.b.ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((i.b.an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.verboseExplanationWithArguments_ = aoVar;
        this.bitField0_ |= 8;
    }

    public static qr newBuilder() {
        return (qr) DEFAULT_INSTANCE.createBuilder();
    }

    public static qs parseDelimitedFrom(InputStream inputStream) {
        return (qs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qs parseFrom(com.google.v.v vVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBriefExplanationWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.briefExplanationWithArguments_ = aoVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayBriefExplanation(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.displayBriefExplanation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayBriefExplanationBytes(com.google.v.v vVar) {
        this.displayBriefExplanation_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayVerboseExplanation(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.displayVerboseExplanation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayVerboseExplanationBytes(com.google.v.v vVar) {
        this.displayVerboseExplanation_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerboseExplanationWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.verboseExplanationWithArguments_ = aoVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "displayBriefExplanation_", "displayVerboseExplanation_", "briefExplanationWithArguments_", "verboseExplanationWithArguments_"});
        }
        if (iOrdinal == 3) {
            return new qs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.ao getBriefExplanationWithArguments() {
        i.b.ao aoVar = this.briefExplanationWithArguments_;
        return aoVar == null ? i.b.ao.getDefaultInstance() : aoVar;
    }

    public String getDisplayBriefExplanation() {
        return this.displayBriefExplanation_;
    }

    public com.google.v.v getDisplayBriefExplanationBytes() {
        return com.google.v.v.s(this.displayBriefExplanation_);
    }

    public String getDisplayVerboseExplanation() {
        return this.displayVerboseExplanation_;
    }

    public com.google.v.v getDisplayVerboseExplanationBytes() {
        return com.google.v.v.s(this.displayVerboseExplanation_);
    }

    public i.b.ao getVerboseExplanationWithArguments() {
        i.b.ao aoVar = this.verboseExplanationWithArguments_;
        return aoVar == null ? i.b.ao.getDefaultInstance() : aoVar;
    }

    public boolean hasBriefExplanationWithArguments() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDisplayBriefExplanation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisplayVerboseExplanation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVerboseExplanationWithArguments() {
        return (this.bitField0_ & 8) != 0;
    }

    public static qr newBuilder(qs qsVar) {
        return (qr) DEFAULT_INSTANCE.createBuilder(qsVar);
    }

    public static qs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qs parseFrom(com.google.v.z zVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qs parseFrom(InputStream inputStream) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qs parseFrom(ByteBuffer byteBuffer) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qs parseFrom(byte[] bArr) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
