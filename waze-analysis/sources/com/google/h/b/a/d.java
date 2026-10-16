package com.google.h.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends du<d, c> implements fj {
    private static final d DEFAULT_INSTANCE;
    public static final int DISPLAYED_NAME_FIELD_NUMBER = 1;
    public static final int LONG_DESCRIPTION_FIELD_NUMBER = 3;
    private static volatile fo<d> PARSER = null;
    public static final int REPLACE_FIELD_NUMBER = 4;
    public static final int SHORT_DESCRIPTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private k replace_;
    private String displayedName_ = "";
    private String shortDescription_ = "";
    private String longDescription_ = "";

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayedName() {
        this.bitField0_ &= -2;
        this.displayedName_ = getDefaultInstance().getDisplayedName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongDescription() {
        this.bitField0_ &= -5;
        this.longDescription_ = getDefaultInstance().getLongDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplace() {
        this.replace_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortDescription() {
        this.bitField0_ &= -3;
        this.shortDescription_ = getDefaultInstance().getShortDescription();
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReplace(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.replace_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            h hVarNewBuilder = k.newBuilder(kVar2);
            hVarNewBuilder.mergeFrom((h) kVar);
            kVar = hVarNewBuilder.buildPartial();
        }
        this.replace_ = kVar;
        this.bitField0_ |= 8;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.displayedName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedNameBytes(v vVar) {
        this.displayedName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.longDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongDescriptionBytes(v vVar) {
        this.longDescription_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplace(k kVar) {
        Objects.requireNonNull(kVar);
        this.replace_ = kVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.shortDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortDescriptionBytes(v vVar) {
        this.shortDescription_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "displayedName_", "shortDescription_", "longDescription_", "replace_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDisplayedName() {
        return this.displayedName_;
    }

    public v getDisplayedNameBytes() {
        return v.s(this.displayedName_);
    }

    public String getLongDescription() {
        return this.longDescription_;
    }

    public v getLongDescriptionBytes() {
        return v.s(this.longDescription_);
    }

    public k getReplace() {
        k kVar = this.replace_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public String getShortDescription() {
        return this.shortDescription_;
    }

    public v getShortDescriptionBytes() {
        return v.s(this.shortDescription_);
    }

    public boolean hasDisplayedName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLongDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasReplace() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasShortDescription() {
        return (this.bitField0_ & 2) != 0;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
