package com.google.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s extends dq<s, r> implements t {
    private static final s DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 17018692;
    private static volatile fo<s> PARSER = null;
    public static final int PROPERTY_VALUE_FIELD_NUMBER = 2;
    public static final ds<com.google.w.n.a.b, s> messageSetExtension;
    private int bitField0_;
    private d id_;
    private byte memoizedIsInitialized = 2;
    private eo<p> propertyValue_ = emptyProtobufList();

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, s.class);
    }

    private s() {
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
    public void clearId() {
        this.id_ = null;
        this.bitField0_ &= -2;
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

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeId(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.id_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.id_ = dVar;
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
    public void removePropertyValue(int i2) {
        ensurePropertyValueIsMutable();
        this.propertyValue_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(d dVar) {
        Objects.requireNonNull(dVar);
        this.id_ = dVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"bitField0_", "id_", "propertyValue_", p.class});
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

    public d getId() {
        d dVar = this.id_;
        return dVar == null ? d.getDefaultInstance() : dVar;
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

    public boolean hasId() {
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

    public static s parseFrom(z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPropertyValue(p pVar) {
        Objects.requireNonNull(pVar);
        ensurePropertyValueIsMutable();
        this.propertyValue_.add(pVar);
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
