package com.google.android.libraries.phenotype.client.stable;

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
/* loaded from: classes4.dex */
public final class c extends du<c, b> implements fj {
    private static final c DEFAULT_INSTANCE;
    public static final int LATEST_ACCOUNT_FIELD_NUMBER = 2;
    private static volatile fo<c> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private eo<String> values_ = emptyProtobufList();
    private String latestAccount_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<String> iterable) {
        ensureValuesIsMutable();
        com.google.v.c.addAll(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(String str) {
        Objects.requireNonNull(str);
        ensureValuesIsMutable();
        this.values_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValuesBytes(com.google.v.v vVar) {
        ensureValuesIsMutable();
        this.values_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestAccount() {
        this.bitField0_ &= -2;
        this.latestAccount_ = getDefaultInstance().getLatestAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        eo<String> eoVar = this.values_;
        if (eoVar.c()) {
            return;
        }
        this.values_ = du.mutableCopy(eoVar);
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestAccount(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.latestAccount_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestAccountBytes(com.google.v.v vVar) {
        this.latestAccount_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i2, String str) {
        Objects.requireNonNull(str);
        ensureValuesIsMutable();
        this.values_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"bitField0_", "values_", "latestAccount_"});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getLatestAccount() {
        return this.latestAccount_;
    }

    public com.google.v.v getLatestAccountBytes() {
        return com.google.v.v.s(this.latestAccount_);
    }

    public String getValues(int i2) {
        return this.values_.get(i2);
    }

    public com.google.v.v getValuesBytes(int i2) {
        return com.google.v.v.s(this.values_.get(i2));
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<String> getValuesList() {
        return this.values_;
    }

    public boolean hasLatestAccount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
