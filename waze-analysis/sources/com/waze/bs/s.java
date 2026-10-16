package com.waze.bs;

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
/* loaded from: classes7.dex */
public final class s extends du<s, r> implements fj {
    private static final s DEFAULT_INSTANCE;
    private static volatile fo<s> PARSER = null;
    public static final int SEARCH_QUERY_FIELD_NUMBER = 2;
    public static final int SEARCH_RESPONSE_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String searchQuery_ = "";
    private i.b.n.a.am searchResponse_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchQuery() {
        this.bitField0_ &= -3;
        this.searchQuery_ = getDefaultInstance().getSearchQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchResponse() {
        this.searchResponse_ = null;
        this.bitField0_ &= -2;
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchResponse(i.b.n.a.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.n.a.am amVar2 = this.searchResponse_;
        if (amVar2 != null && amVar2 != i.b.n.a.am.getDefaultInstance()) {
            i.b.n.a.ai aiVarNewBuilder = i.b.n.a.am.newBuilder(amVar2);
            aiVarNewBuilder.mergeFrom((i.b.n.a.ai) amVar);
            amVar = aiVarNewBuilder.buildPartial();
        }
        this.searchResponse_ = amVar;
        this.bitField0_ |= 1;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchQuery(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.searchQuery_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchQueryBytes(com.google.v.v vVar) {
        this.searchQuery_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResponse(i.b.n.a.am amVar) {
        Objects.requireNonNull(amVar);
        this.searchResponse_ = amVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "searchResponse_", "searchQuery_"});
            case 3:
                return new s();
            case 4:
                return new r(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<s> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (s.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getSearchQuery() {
        return this.searchQuery_;
    }

    public com.google.v.v getSearchQueryBytes() {
        return com.google.v.v.s(this.searchQuery_);
    }

    public i.b.n.a.am getSearchResponse() {
        i.b.n.a.am amVar = this.searchResponse_;
        return amVar == null ? i.b.n.a.am.getDefaultInstance() : amVar;
    }

    public boolean hasSearchQuery() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSearchResponse() {
        return (this.bitField0_ & 1) != 0;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
