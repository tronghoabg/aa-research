package com.google.r.b;

import com.google.u.b.a.h;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends du<f, d> implements fj {
    public static final int COLLECTION_BASIS_AND_FIELD_NUMBER = 5174;
    public static final int COLLECTION_BASIS_FIELD_NUMBER = 5175;
    private static final f DEFAULT_INSTANCE;
    public static final int EXTERNAL_TRANSPARENCY_DESCRIPTION_FIELD_NUMBER = 5173;
    private static volatile fo<f> PARSER = null;
    public static final int PURPOSES_FIELD_NUMBER = 5176;
    private static final el<com.google.u.a.a.b> purposes_converter_ = new c();
    private int bitField0_;
    private Object collectionBasisOneof_;
    private int collectionBasisOneofCase_ = 0;
    private String externalTransparencyDescription_ = "";
    private ek purposes_ = emptyIntList();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPurposes(Iterable<? extends com.google.u.a.a.b> iterable) {
        ensurePurposesIsMutable();
        Iterator<? extends com.google.u.a.a.b> it = iterable.iterator();
        while (it.hasNext()) {
            this.purposes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPurposes(com.google.u.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensurePurposesIsMutable();
        this.purposes_.i(bVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionBasis() {
        if (this.collectionBasisOneofCase_ == 5175) {
            this.collectionBasisOneofCase_ = 0;
            this.collectionBasisOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionBasisAnd() {
        if (this.collectionBasisOneofCase_ == 5174) {
            this.collectionBasisOneofCase_ = 0;
            this.collectionBasisOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionBasisOneof() {
        this.collectionBasisOneofCase_ = 0;
        this.collectionBasisOneof_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalTransparencyDescription() {
        this.bitField0_ &= -2;
        this.externalTransparencyDescription_ = getDefaultInstance().getExternalTransparencyDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPurposes() {
        this.purposes_ = emptyIntList();
    }

    private void ensurePurposesIsMutable() {
        ek ekVar = this.purposes_;
        if (ekVar.c()) {
            return;
        }
        this.purposes_ = du.mutableCopy(ekVar);
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCollectionBasisAnd(h hVar) {
        Objects.requireNonNull(hVar);
        if (this.collectionBasisOneofCase_ == 5174 && this.collectionBasisOneof_ != h.getDefaultInstance()) {
            com.google.u.b.a.c cVarNewBuilder = h.newBuilder((h) this.collectionBasisOneof_);
            cVarNewBuilder.mergeFrom((com.google.u.b.a.c) hVar);
            hVar = cVarNewBuilder.buildPartial();
        }
        this.collectionBasisOneof_ = hVar;
        this.collectionBasisOneofCase_ = COLLECTION_BASIS_AND_FIELD_NUMBER;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionBasis(com.google.u.b.a.b bVar) {
        this.collectionBasisOneof_ = Integer.valueOf(bVar.getNumber());
        this.collectionBasisOneofCase_ = COLLECTION_BASIS_FIELD_NUMBER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionBasisAnd(h hVar) {
        Objects.requireNonNull(hVar);
        this.collectionBasisOneof_ = hVar;
        this.collectionBasisOneofCase_ = COLLECTION_BASIS_AND_FIELD_NUMBER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalTransparencyDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.externalTransparencyDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalTransparencyDescriptionBytes(v vVar) {
        this.externalTransparencyDescription_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurposes(int i2, com.google.u.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensurePurposesIsMutable();
        this.purposes_.e(i2, bVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001ᐵᐸ\u0004\u0000\u0001\u0000ᐵဈ\u0000ᐶ<\u0000ᐷ\u083f\u0000ᐸࠞ", new Object[]{"collectionBasisOneof_", "collectionBasisOneofCase_", "bitField0_", "externalTransparencyDescription_", h.class, com.google.u.b.a.b.b(), "purposes_", com.google.u.a.a.b.b()});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.u.b.a.b getCollectionBasis() {
        com.google.u.b.a.b bVarA;
        return (this.collectionBasisOneofCase_ != 5175 || (bVarA = com.google.u.b.a.b.a(((Integer) this.collectionBasisOneof_).intValue())) == null) ? com.google.u.b.a.b.CB_NONE : bVarA;
    }

    public h getCollectionBasisAnd() {
        return this.collectionBasisOneofCase_ == 5174 ? (h) this.collectionBasisOneof_ : h.getDefaultInstance();
    }

    public e getCollectionBasisOneofCase() {
        int i2 = this.collectionBasisOneofCase_;
        if (i2 == 0) {
            return e.f12527c;
        }
        if (i2 == 5174) {
            return e.f12525a;
        }
        if (i2 != 5175) {
            return null;
        }
        return e.f12526b;
    }

    public String getExternalTransparencyDescription() {
        return this.externalTransparencyDescription_;
    }

    public v getExternalTransparencyDescriptionBytes() {
        return v.s(this.externalTransparencyDescription_);
    }

    public com.google.u.a.a.b getPurposes(int i2) {
        com.google.u.a.a.b bVarA = com.google.u.a.a.b.a(this.purposes_.d(i2));
        return bVarA == null ? com.google.u.a.a.b.PROCESSING_PURPOSE_UNSPECIFIED : bVarA;
    }

    public int getPurposesCount() {
        return this.purposes_.size();
    }

    public List<com.google.u.a.a.b> getPurposesList() {
        return new em(this.purposes_, purposes_converter_);
    }

    public boolean hasCollectionBasis() {
        return this.collectionBasisOneofCase_ == 5175;
    }

    public boolean hasCollectionBasisAnd() {
        return this.collectionBasisOneofCase_ == 5174;
    }

    public boolean hasExternalTransparencyDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public static d newBuilder(f fVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
