package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar extends com.google.v.du<ar, t> implements as {
    public static final int ATTRIBUTES_FIELD_NUMBER = 5;
    private static final ar DEFAULT_INSTANCE;
    public static final int GEOMETRIES_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ar> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private bj attributes_;
    private int bitField0_;
    private int type_;
    private String id_ = "";
    private com.google.v.eo<ao> geometries_ = emptyProtobufList();

    static {
        ar arVar = new ar();
        DEFAULT_INSTANCE = arVar;
        com.google.v.du.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGeometries(Iterable<? extends ao> iterable) {
        ensureGeometriesIsMutable();
        com.google.v.c.addAll(iterable, this.geometries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeometries(int i2, ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureGeometriesIsMutable();
        this.geometries_.add(i2, aoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometries() {
        this.geometries_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    private void ensureGeometriesIsMutable() {
        com.google.v.eo<ao> eoVar = this.geometries_;
        if (eoVar.c()) {
            return;
        }
        this.geometries_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAttributes(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.attributes_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            ba baVarNewBuilder = bj.newBuilder(bjVar2);
            baVarNewBuilder.mergeFrom((ba) bjVar);
            bjVar = baVarNewBuilder.buildPartial();
        }
        this.attributes_ = bjVar;
        this.bitField0_ |= 4;
    }

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static ar parseDelimitedFrom(InputStream inputStream) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(com.google.v.v vVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGeometries(int i2) {
        ensureGeometriesIsMutable();
        this.geometries_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.attributes_ = bjVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometries(int i2, ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureGeometriesIsMutable();
        this.geometries_.set(i2, aoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(aq aqVar) {
        this.type_ = aqVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001᠌\u0001\u0002\u001b\u0003ဈ\u0000\u0005ဉ\u0002", new Object[]{"bitField0_", "type_", h.f11875d, "geometries_", ao.class, "id_", "attributes_"});
        }
        if (iOrdinal == 3) {
            return new ar();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new t(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ar> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ar.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bj getAttributes() {
        bj bjVar = this.attributes_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public ao getGeometries(int i2) {
        return this.geometries_.get(i2);
    }

    public int getGeometriesCount() {
        return this.geometries_.size();
    }

    public List<ao> getGeometriesList() {
        return this.geometries_;
    }

    public ap getGeometriesOrBuilder(int i2) {
        return this.geometries_.get(i2);
    }

    public List<? extends ap> getGeometriesOrBuilderList() {
        return this.geometries_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public aq getType() {
        aq aqVarA = aq.a(this.type_);
        return aqVarA == null ? aq.TYPE_UNSPECIFIED : aqVarA;
    }

    public boolean hasAttributes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static t newBuilder(ar arVar) {
        return (t) DEFAULT_INSTANCE.createBuilder(arVar);
    }

    public static ar parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ar parseFrom(com.google.v.z zVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ar parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeometries(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureGeometriesIsMutable();
        this.geometries_.add(aoVar);
    }

    public static ar parseFrom(InputStream inputStream) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(ByteBuffer byteBuffer) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ar parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ar parseFrom(byte[] bArr) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ar parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
