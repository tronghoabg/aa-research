package com.google.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends du<b, a> implements fj {
    public static final int DATASET_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    public static final int IS_ATTRIBUTION_REQUIRED_FIELD_NUMBER = 6;
    private static volatile fo<b> PARSER = null;
    public static final int PROJECT_FIELD_NUMBER = 2;
    public static final int PROVIDER_FIELD_NUMBER = 3;
    public static final int STATEMENT_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isAttributionRequired_;
    private String dataset_ = "";
    private String project_ = "";
    private String provider_ = "";
    private String statement_ = "";
    private String uri_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataset() {
        this.bitField0_ &= -2;
        this.dataset_ = getDefaultInstance().getDataset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAttributionRequired() {
        this.bitField0_ &= -33;
        this.isAttributionRequired_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProject() {
        this.bitField0_ &= -3;
        this.project_ = getDefaultInstance().getProject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -5;
        this.provider_ = getDefaultInstance().getProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatement() {
        this.bitField0_ &= -9;
        this.statement_ = getDefaultInstance().getStatement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.bitField0_ &= -17;
        this.uri_ = getDefaultInstance().getUri();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataset(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.dataset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatasetBytes(com.google.v.v vVar) {
        this.dataset_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAttributionRequired(boolean z) {
        this.bitField0_ |= 32;
        this.isAttributionRequired_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProject(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.project_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectBytes(com.google.v.v vVar) {
        this.project_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.provider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderBytes(com.google.v.v vVar) {
        this.provider_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatement(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.statement_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatementBytes(com.google.v.v vVar) {
        this.statement_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(com.google.v.v vVar) {
        this.uri_ = vVar.u();
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "dataset_", "project_", "provider_", "statement_", "uri_", "isAttributionRequired_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDataset() {
        return this.dataset_;
    }

    public com.google.v.v getDatasetBytes() {
        return com.google.v.v.s(this.dataset_);
    }

    public boolean getIsAttributionRequired() {
        return this.isAttributionRequired_;
    }

    public String getProject() {
        return this.project_;
    }

    public com.google.v.v getProjectBytes() {
        return com.google.v.v.s(this.project_);
    }

    public String getProvider() {
        return this.provider_;
    }

    public com.google.v.v getProviderBytes() {
        return com.google.v.v.s(this.provider_);
    }

    public String getStatement() {
        return this.statement_;
    }

    public com.google.v.v getStatementBytes() {
        return com.google.v.v.s(this.statement_);
    }

    public String getUri() {
        return this.uri_;
    }

    public com.google.v.v getUriBytes() {
        return com.google.v.v.s(this.uri_);
    }

    public boolean hasDataset() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsAttributionRequired() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasProject() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasStatement() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUri() {
        return (this.bitField0_ & 16) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
