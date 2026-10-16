package com.google.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends dq<m, l> implements fj {
    private static final m DEFAULT_INSTANCE;
    private static volatile fo<m> PARSER = null;
    public static final int PROPERTY_VALUE_FIELD_NUMBER = 1;
    private byte memoizedIsInitialized = 2;
    private eo<p> propertyValue_ = emptyProtobufList();

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPropertyValue(Iterable<? extends p> iterable) {
        ensurePropertyValueIsMutable();
        com.google.v.c.addAll(iterable, this.propertyValue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPropertyValue(int i2, p pVar) {
        Objects.requireNonNull(pVar);
        ensurePropertyValueIsMutable();
        this.propertyValue_.add(i2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPropertyValue() {
        this.propertyValue_ = emptyProtobufList();
    }

    private void ensurePropertyValueIsMutable() {
        eo<p> eoVar = this.propertyValue_;
        if (eoVar.c()) {
            return;
        }
        this.propertyValue_ = du.mutableCopy(eoVar);
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePropertyValue(int i2) {
        ensurePropertyValueIsMutable();
        this.propertyValue_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPropertyValue(int i2, p pVar) {
        Objects.requireNonNull(pVar);
        ensurePropertyValueIsMutable();
        this.propertyValue_.set(i2, pVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"propertyValue_", p.class});
            case 3:
                return new m();
            case 4:
                return new l(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<m> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (m.class) {
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

    public p getPropertyValue(int i2) {
        return this.propertyValue_.get(i2);
    }

    public int getPropertyValueCount() {
        return this.propertyValue_.size();
    }

    public List<p> getPropertyValueList() {
        return this.propertyValue_;
    }

    public q getPropertyValueOrBuilder(int i2) {
        return this.propertyValue_.get(i2);
    }

    public List<? extends q> getPropertyValueOrBuilderList() {
        return this.propertyValue_;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPropertyValue(p pVar) {
        Objects.requireNonNull(pVar);
        ensurePropertyValueIsMutable();
        this.propertyValue_.add(pVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
