package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al extends du<al, ak> implements fj {
    public static final int ATTRIBUTION_URL_FIELD_NUMBER = 1;
    private static final al DEFAULT_INSTANCE;
    public static final int LAST_VERIFIED_DATE_FIELD_NUMBER = 2;
    private static volatile fo<al> PARSER;
    private eo<String> attributionUrl_ = emptyProtobufList();
    private int bitField0_;
    private long lastVerifiedDate_;

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        du.registerDefaultInstance(al.class, alVar);
    }

    private al() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributionUrl(Iterable<String> iterable) {
        ensureAttributionUrlIsMutable();
        com.google.v.c.addAll(iterable, this.attributionUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributionUrl(String str) {
        Objects.requireNonNull(str);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributionUrlBytes(com.google.v.v vVar) {
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributionUrl() {
        this.attributionUrl_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastVerifiedDate() {
        this.bitField0_ &= -2;
        this.lastVerifiedDate_ = 0L;
    }

    private void ensureAttributionUrlIsMutable() {
        eo<String> eoVar = this.attributionUrl_;
        if (eoVar.c()) {
            return;
        }
        this.attributionUrl_ = du.mutableCopy(eoVar);
    }

    public static al getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ak newBuilder() {
        return (ak) DEFAULT_INSTANCE.createBuilder();
    }

    public static al parseDelimitedFrom(InputStream inputStream) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(com.google.v.v vVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<al> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributionUrl(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastVerifiedDate(long j2) {
        this.bitField0_ |= 1;
        this.lastVerifiedDate_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"bitField0_", "attributionUrl_", "lastVerifiedDate_"});
        }
        if (iOrdinal == 3) {
            return new al();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ak(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<al> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (al.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAttributionUrl(int i2) {
        return this.attributionUrl_.get(i2);
    }

    public com.google.v.v getAttributionUrlBytes(int i2) {
        return com.google.v.v.s(this.attributionUrl_.get(i2));
    }

    public int getAttributionUrlCount() {
        return this.attributionUrl_.size();
    }

    public List<String> getAttributionUrlList() {
        return this.attributionUrl_;
    }

    public long getLastVerifiedDate() {
        return this.lastVerifiedDate_;
    }

    public boolean hasLastVerifiedDate() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ak newBuilder(al alVar) {
        return (ak) DEFAULT_INSTANCE.createBuilder(alVar);
    }

    public static al parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(com.google.v.v vVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static al parseFrom(com.google.v.z zVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static al parseFrom(com.google.v.z zVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static al parseFrom(InputStream inputStream) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(InputStream inputStream, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(ByteBuffer byteBuffer) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static al parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static al parseFrom(byte[] bArr) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static al parseFrom(byte[] bArr, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
