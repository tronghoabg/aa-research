package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao extends du<ao, am> implements fj {
    public static final int AUTHORITY_FEEDBACK_FIELD_NUMBER = 1;
    private static final ao DEFAULT_INSTANCE;
    public static final int LEGAL_REQUEST_FIELD_NUMBER = 2;
    private static volatile fo<ao> PARSER = null;
    public static final int PUBLIC_INFORMATION_FIELD_NUMBER = 3;
    private int categoryCase_ = 0;
    private Object category_;

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorityFeedback() {
        if (this.categoryCase_ == 1) {
            this.categoryCase_ = 0;
            this.category_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.categoryCase_ = 0;
        this.category_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegalRequest() {
        if (this.categoryCase_ == 2) {
            this.categoryCase_ = 0;
            this.category_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicInformation() {
        if (this.categoryCase_ == 3) {
            this.categoryCase_ = 0;
            this.category_ = null;
        }
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthorityFeedback(ah ahVar) {
        Objects.requireNonNull(ahVar);
        if (this.categoryCase_ == 1 && this.category_ != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder((ah) this.category_);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.category_ = ahVar;
        this.categoryCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLegalRequest(aj ajVar) {
        Objects.requireNonNull(ajVar);
        if (this.categoryCase_ == 2 && this.category_ != aj.getDefaultInstance()) {
            ai aiVarNewBuilder = aj.newBuilder((aj) this.category_);
            aiVarNewBuilder.mergeFrom((ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.category_ = ajVar;
        this.categoryCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicInformation(al alVar) {
        Objects.requireNonNull(alVar);
        if (this.categoryCase_ == 3 && this.category_ != al.getDefaultInstance()) {
            ak akVarNewBuilder = al.newBuilder((al) this.category_);
            akVarNewBuilder.mergeFrom((ak) alVar);
            alVar = akVarNewBuilder.buildPartial();
        }
        this.category_ = alVar;
        this.categoryCase_ = 3;
    }

    public static am newBuilder() {
        return (am) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorityFeedback(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.category_ = ahVar;
        this.categoryCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegalRequest(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.category_ = ajVar;
        this.categoryCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicInformation(al alVar) {
        Objects.requireNonNull(alVar);
        this.category_ = alVar;
        this.categoryCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"category_", "categoryCase_", ah.class, aj.class, al.class});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new am(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ah getAuthorityFeedback() {
        return this.categoryCase_ == 1 ? (ah) this.category_ : ah.getDefaultInstance();
    }

    public an getCategoryCase() {
        int i2 = this.categoryCase_;
        if (i2 == 0) {
            return an.f13476d;
        }
        if (i2 == 1) {
            return an.f13473a;
        }
        if (i2 == 2) {
            return an.f13474b;
        }
        if (i2 != 3) {
            return null;
        }
        return an.f13475c;
    }

    public aj getLegalRequest() {
        return this.categoryCase_ == 2 ? (aj) this.category_ : aj.getDefaultInstance();
    }

    public al getPublicInformation() {
        return this.categoryCase_ == 3 ? (al) this.category_ : al.getDefaultInstance();
    }

    public boolean hasAuthorityFeedback() {
        return this.categoryCase_ == 1;
    }

    public boolean hasLegalRequest() {
        return this.categoryCase_ == 2;
    }

    public boolean hasPublicInformation() {
        return this.categoryCase_ == 3;
    }

    public static am newBuilder(ao aoVar) {
        return (am) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
