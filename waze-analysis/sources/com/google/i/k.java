package com.google.i;

import com.google.v.de;
import com.google.v.dn;
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
public final class k extends du<k, g> implements fj {
    private static final k DEFAULT_INSTANCE;
    public static final int MAGNITUDE_FIELD_NUMBER = 1;
    private static volatile fo<k> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 2;
    private int bitField0_;
    private float magnitude_;
    private byte memoizedIsInitialized = 2;
    private eo<i> unit_ = emptyProtobufList();

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnit(Iterable<? extends i> iterable) {
        ensureUnitIsMutable();
        com.google.v.c.addAll(iterable, this.unit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnit(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureUnitIsMutable();
        this.unit_.add(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMagnitude() {
        this.bitField0_ &= -2;
        this.magnitude_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = emptyProtobufList();
    }

    private void ensureUnitIsMutable() {
        eo<i> eoVar = this.unit_;
        if (eoVar.c()) {
            return;
        }
        this.unit_ = du.mutableCopy(eoVar);
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUnit(int i2) {
        ensureUnitIsMutable();
        this.unit_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMagnitude(float f2) {
        this.bitField0_ |= 1;
        this.magnitude_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureUnitIsMutable();
        this.unit_.set(i2, iVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ခ\u0000\u0002Л", new Object[]{"bitField0_", "magnitude_", "unit_", i.class});
            case 3:
                return new k();
            case 4:
                return new g(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<k> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (k.class) {
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

    public float getMagnitude() {
        return this.magnitude_;
    }

    public i getUnit(int i2) {
        return this.unit_.get(i2);
    }

    public int getUnitCount() {
        return this.unit_.size();
    }

    public List<i> getUnitList() {
        return this.unit_;
    }

    public j getUnitOrBuilder(int i2) {
        return this.unit_.get(i2);
    }

    public List<? extends j> getUnitOrBuilderList() {
        return this.unit_;
    }

    public boolean hasMagnitude() {
        return (this.bitField0_ & 1) != 0;
    }

    public static g newBuilder(k kVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnit(i iVar) {
        Objects.requireNonNull(iVar);
        ensureUnitIsMutable();
        this.unit_.add(iVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
