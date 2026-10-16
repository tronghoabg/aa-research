package com.waze.bg.d;

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
/* loaded from: classes6.dex */
public final class b extends du<b, a> implements fj {
    public static final int ABBR_FIELD_NUMBER = 3;
    private static final b DEFAULT_INSTANCE;
    public static final int FALLBACK_LANG_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OFFICIAL_LANG_FIELD_NUMBER = 4;
    public static final int OTHER_LANG_FIELD_NUMBER = 5;
    private static volatile fo<b> PARSER;
    private int bitField0_;
    private int id_;
    private String name_ = "";
    private String abbr_ = "";
    private String officialLang_ = "";
    private String otherLang_ = "";
    private String fallbackLang_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbbr() {
        this.bitField0_ &= -5;
        this.abbr_ = getDefaultInstance().getAbbr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFallbackLang() {
        this.bitField0_ &= -33;
        this.fallbackLang_ = getDefaultInstance().getFallbackLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfficialLang() {
        this.bitField0_ &= -9;
        this.officialLang_ = getDefaultInstance().getOfficialLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherLang() {
        this.bitField0_ &= -17;
        this.otherLang_ = getDefaultInstance().getOtherLang();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbbr(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.abbr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbbrBytes(v vVar) {
        this.abbr_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallbackLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.fallbackLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallbackLangBytes(v vVar) {
        this.fallbackLang_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.bitField0_ |= 1;
        this.id_ = i2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfficialLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.officialLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfficialLangBytes(v vVar) {
        this.officialLang_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.otherLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherLangBytes(v vVar) {
        this.otherLang_ = vVar.u();
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "id_", "name_", "abbr_", "officialLang_", "otherLang_", "fallbackLang_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAbbr() {
        return this.abbr_;
    }

    public v getAbbrBytes() {
        return v.s(this.abbr_);
    }

    public String getFallbackLang() {
        return this.fallbackLang_;
    }

    public v getFallbackLangBytes() {
        return v.s(this.fallbackLang_);
    }

    public int getId() {
        return this.id_;
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public String getOfficialLang() {
        return this.officialLang_;
    }

    public v getOfficialLangBytes() {
        return v.s(this.officialLang_);
    }

    public String getOtherLang() {
        return this.otherLang_;
    }

    public v getOtherLangBytes() {
        return v.s(this.otherLang_);
    }

    public boolean hasAbbr() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFallbackLang() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOfficialLang() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOtherLang() {
        return (this.bitField0_ & 16) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
