package com.google.p.a.a;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements fj {
    public static final int AREA_CODE_FIELD_NUMBER = 3;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    public static final int EXTENSION_FIELD_NUMBER = 5;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 3546500;
    public static final int NATIONAL_PREFIX_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 4;
    private static volatile fo<b> PARSER;
    public static final ds<com.google.w.n.a.b, b> messageSetExtension;
    private int bitField0_;
    private int countryCode_;
    private String nationalPrefix_ = "";
    private String areaCode_ = "";
    private eo<String> number_ = emptyProtobufList();
    private String extension_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, b.class);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNumber(Iterable<String> iterable) {
        ensureNumberIsMutable();
        c.addAll(iterable, this.number_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNumber(String str) {
        Objects.requireNonNull(str);
        ensureNumberIsMutable();
        this.number_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNumberBytes(v vVar) {
        ensureNumberIsMutable();
        this.number_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreaCode() {
        this.bitField0_ &= -5;
        this.areaCode_ = getDefaultInstance().getAreaCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.bitField0_ &= -2;
        this.countryCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.bitField0_ &= -9;
        this.extension_ = getDefaultInstance().getExtension();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNationalPrefix() {
        this.bitField0_ &= -3;
        this.nationalPrefix_ = getDefaultInstance().getNationalPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = emptyProtobufList();
    }

    private void ensureNumberIsMutable() {
        eo<String> eoVar = this.number_;
        if (eoVar.c()) {
            return;
        }
        this.number_ = du.mutableCopy(eoVar);
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
    public void setAreaCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.areaCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaCodeBytes(v vVar) {
        this.areaCode_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(int i2) {
        this.bitField0_ |= 1;
        this.countryCode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.extension_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionBytes(v vVar) {
        this.extension_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNationalPrefix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.nationalPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNationalPrefixBytes(v vVar) {
        this.nationalPrefix_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i2, String str) {
        Objects.requireNonNull(str);
        ensureNumberIsMutable();
        this.number_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003", new Object[]{"bitField0_", "countryCode_", "nationalPrefix_", "areaCode_", "number_", "extension_"});
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

    public String getAreaCode() {
        return this.areaCode_;
    }

    public v getAreaCodeBytes() {
        return v.s(this.areaCode_);
    }

    public int getCountryCode() {
        return this.countryCode_;
    }

    public String getExtension() {
        return this.extension_;
    }

    public v getExtensionBytes() {
        return v.s(this.extension_);
    }

    public String getNationalPrefix() {
        return this.nationalPrefix_;
    }

    public v getNationalPrefixBytes() {
        return v.s(this.nationalPrefix_);
    }

    public String getNumber(int i2) {
        return this.number_.get(i2);
    }

    public v getNumberBytes(int i2) {
        return v.s(this.number_.get(i2));
    }

    public int getNumberCount() {
        return this.number_.size();
    }

    public List<String> getNumberList() {
        return this.number_;
    }

    public boolean hasAreaCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasExtension() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNationalPrefix() {
        return (this.bitField0_ & 2) != 0;
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
