package com.waze.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends du<c, b> implements d {
    public static final int BANNER_ID_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MAP_BANNER_FIELD_NUMBER = 11;
    public static final int MENU_BANNER_FIELD_NUMBER = 10;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<c> PARSER;
    private Object additionalInfo_;
    private int bitField0_;
    private int additionalInfoCase_ = 0;
    private String id_ = "";
    private String name_ = "";
    private String bannerId_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalInfo() {
        this.additionalInfoCase_ = 0;
        this.additionalInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerId() {
        this.bitField0_ &= -5;
        this.bannerId_ = getDefaultInstance().getBannerId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapBanner() {
        if (this.additionalInfoCase_ == 11) {
            this.additionalInfoCase_ = 0;
            this.additionalInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMenuBanner() {
        if (this.additionalInfoCase_ == 10) {
            this.additionalInfoCase_ = 0;
            this.additionalInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapBanner(k kVar) {
        Objects.requireNonNull(kVar);
        if (this.additionalInfoCase_ == 11 && this.additionalInfo_ != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder((k) this.additionalInfo_);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.additionalInfo_ = kVar;
        this.additionalInfoCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMenuBanner(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.additionalInfoCase_ == 10 && this.additionalInfo_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.additionalInfo_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.additionalInfo_ = mVar;
        this.additionalInfoCase_ = 10;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.bannerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerIdBytes(v vVar) {
        this.bannerId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapBanner(k kVar) {
        Objects.requireNonNull(kVar);
        this.additionalInfo_ = kVar;
        this.additionalInfoCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMenuBanner(m mVar) {
        Objects.requireNonNull(mVar);
        this.additionalInfo_ = mVar;
        this.additionalInfoCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u000b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\n<\u0000\u000b<\u0000", new Object[]{"additionalInfo_", "additionalInfoCase_", "bitField0_", "id_", "name_", "bannerId_", m.class, k.class});
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

    public a getAdditionalInfoCase() {
        int i2 = this.additionalInfoCase_;
        if (i2 == 0) {
            return a.f25005c;
        }
        if (i2 == 10) {
            return a.f25003a;
        }
        if (i2 != 11) {
            return null;
        }
        return a.f25004b;
    }

    public String getBannerId() {
        return this.bannerId_;
    }

    public v getBannerIdBytes() {
        return v.s(this.bannerId_);
    }

    @Deprecated
    public String getId() {
        return this.id_;
    }

    @Deprecated
    public v getIdBytes() {
        return v.s(this.id_);
    }

    public k getMapBanner() {
        return this.additionalInfoCase_ == 11 ? (k) this.additionalInfo_ : k.getDefaultInstance();
    }

    public m getMenuBanner() {
        return this.additionalInfoCase_ == 10 ? (m) this.additionalInfo_ : m.getDefaultInstance();
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public boolean hasBannerId() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMapBanner() {
        return this.additionalInfoCase_ == 11;
    }

    public boolean hasMenuBanner() {
        return this.additionalInfoCase_ == 10;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
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
