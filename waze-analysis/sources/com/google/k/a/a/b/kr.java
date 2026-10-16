package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kr extends com.google.v.du<kr, kn> implements com.google.v.fj {
    public static final int AGENCY_ASSOCIATIONS_FIELD_NUMBER = 9;
    private static final kr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kr> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<kp> agencyAssociations_ = emptyProtobufList();

    static {
        kr krVar = new kr();
        DEFAULT_INSTANCE = krVar;
        com.google.v.du.registerDefaultInstance(kr.class, krVar);
    }

    private kr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgencyAssociations(int i2, kp kpVar) {
        Objects.requireNonNull(kpVar);
        ensureAgencyAssociationsIsMutable();
        this.agencyAssociations_.add(i2, kpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAgencyAssociations(Iterable<? extends kp> iterable) {
        ensureAgencyAssociationsIsMutable();
        com.google.v.c.addAll(iterable, this.agencyAssociations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgencyAssociations() {
        this.agencyAssociations_ = emptyProtobufList();
    }

    private void ensureAgencyAssociationsIsMutable() {
        com.google.v.eo<kp> eoVar = this.agencyAssociations_;
        if (eoVar.c()) {
            return;
        }
        this.agencyAssociations_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static kr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kn newBuilder() {
        return (kn) DEFAULT_INSTANCE.createBuilder();
    }

    public static kr parseDelimitedFrom(InputStream inputStream) {
        return (kr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kr parseFrom(com.google.v.v vVar) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAgencyAssociations(int i2) {
        ensureAgencyAssociationsIsMutable();
        this.agencyAssociations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgencyAssociations(int i2, kp kpVar) {
        Objects.requireNonNull(kpVar);
        ensureAgencyAssociationsIsMutable();
        this.agencyAssociations_.set(i2, kpVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\t\t\u0001\u0000\u0001\u0001\tЛ", new Object[]{"agencyAssociations_", kp.class});
            case 3:
                return new kr();
            case 4:
                return new kn(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<kr> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (kr.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public kp getAgencyAssociations(int i2) {
        return this.agencyAssociations_.get(i2);
    }

    public int getAgencyAssociationsCount() {
        return this.agencyAssociations_.size();
    }

    public List<kp> getAgencyAssociationsList() {
        return this.agencyAssociations_;
    }

    public kq getAgencyAssociationsOrBuilder(int i2) {
        return this.agencyAssociations_.get(i2);
    }

    public List<? extends kq> getAgencyAssociationsOrBuilderList() {
        return this.agencyAssociations_;
    }

    public static kn newBuilder(kr krVar) {
        return (kn) DEFAULT_INSTANCE.createBuilder(krVar);
    }

    public static kr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kr parseFrom(com.google.v.z zVar) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgencyAssociations(kp kpVar) {
        Objects.requireNonNull(kpVar);
        ensureAgencyAssociationsIsMutable();
        this.agencyAssociations_.add(kpVar);
    }

    public static kr parseFrom(InputStream inputStream) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kr parseFrom(ByteBuffer byteBuffer) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kr parseFrom(byte[] bArr) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
