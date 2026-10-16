package com.waze.bs;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import i.b.n.a.an;
import i.b.n.a.aw;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends du<z, v> implements aa {
    private static final z DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_NAME_FIELD_NUMBER = 4;
    public static final int FAVORITE_FIELD_NUMBER = 3;
    private static volatile fo<z> PARSER = null;
    public static final int SEARCH_RESULT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object place_;
    private int placeCase_ = 0;
    private byte memoizedIsInitialized = 2;
    private int type_ = 1;
    private String entryPointName_ = "";

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointName() {
        this.bitField0_ &= -3;
        this.entryPointName_ = getDefaultInstance().getEntryPointName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavorite() {
        if (this.placeCase_ == 3) {
            this.placeCase_ = 0;
            this.place_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlace() {
        this.placeCase_ = 0;
        this.place_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchResult() {
        if (this.placeCase_ == 2) {
            this.placeCase_ = 0;
            this.place_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 1;
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavorite(i.b.e.l lVar) {
        Objects.requireNonNull(lVar);
        if (this.placeCase_ == 3 && this.place_ != i.b.e.l.getDefaultInstance()) {
            i.b.e.i iVarNewBuilder = i.b.e.l.newBuilder((i.b.e.l) this.place_);
            iVarNewBuilder.mergeFrom((i.b.e.i) lVar);
            lVar = iVarNewBuilder.buildPartial();
        }
        this.place_ = lVar;
        this.placeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchResult(aw awVar) {
        Objects.requireNonNull(awVar);
        if (this.placeCase_ == 2 && this.place_ != aw.getDefaultInstance()) {
            an anVarNewBuilder = aw.newBuilder((aw) this.place_);
            anVarNewBuilder.mergeFrom((an) awVar);
            awVar = anVarNewBuilder.buildPartial();
        }
        this.place_ = awVar;
        this.placeCase_ = 2;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.entryPointName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointNameBytes(com.google.v.v vVar) {
        this.entryPointName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavorite(i.b.e.l lVar) {
        Objects.requireNonNull(lVar);
        this.place_ = lVar;
        this.placeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResult(aw awVar) {
        Objects.requireNonNull(awVar);
        this.place_ = awVar;
        this.placeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(y yVar) {
        this.type_ = yVar.getNumber();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001᠌\u0000\u0002м\u0000\u0003<\u0000\u0004ဈ\u0001", new Object[]{"place_", "placeCase_", "bitField0_", "type_", x.f17451a, aw.class, i.b.e.l.class, "entryPointName_"});
            case 3:
                return new z();
            case 4:
                return new v(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<z> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (z.class) {
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

    public String getEntryPointName() {
        return this.entryPointName_;
    }

    public com.google.v.v getEntryPointNameBytes() {
        return com.google.v.v.s(this.entryPointName_);
    }

    @Override // com.waze.bs.aa
    public i.b.e.l getFavorite() {
        return this.placeCase_ == 3 ? (i.b.e.l) this.place_ : i.b.e.l.getDefaultInstance();
    }

    public w getPlaceCase() {
        int i2 = this.placeCase_;
        if (i2 == 0) {
            return w.f17449c;
        }
        if (i2 == 2) {
            return w.f17447a;
        }
        if (i2 != 3) {
            return null;
        }
        return w.f17448b;
    }

    public aw getSearchResult() {
        return this.placeCase_ == 2 ? (aw) this.place_ : aw.getDefaultInstance();
    }

    public y getType() {
        y yVarA = y.a(this.type_);
        return yVarA == null ? y.DESTINATION : yVarA;
    }

    public boolean hasEntryPointName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.bs.aa
    public boolean hasFavorite() {
        return this.placeCase_ == 3;
    }

    public boolean hasSearchResult() {
        return this.placeCase_ == 2;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static v newBuilder(z zVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static z parseFrom(com.google.v.z zVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
