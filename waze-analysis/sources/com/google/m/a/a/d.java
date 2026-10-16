package com.google.m.a.a;

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
/* loaded from: classes5.dex */
public final class d extends du<d, a> implements fj {
    public static final int COUNTRY_CODE_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_SOURCE_FIELD_NUMBER = 6;
    private static final d DEFAULT_INSTANCE;
    public static final int EXTENSION_FIELD_NUMBER = 3;
    public static final int ITALIAN_LEADING_ZERO_FIELD_NUMBER = 4;
    public static final int NATIONAL_NUMBER_FIELD_NUMBER = 2;
    public static final int NUMBER_OF_LEADING_ZEROS_FIELD_NUMBER = 8;
    private static volatile fo<d> PARSER = null;
    public static final int PREFERRED_DOMESTIC_CARRIER_CODE_FIELD_NUMBER = 7;
    public static final int RAW_INPUT_FIELD_NUMBER = 5;
    private int bitField0_;
    private int countryCodeSource_;
    private int countryCode_;
    private boolean italianLeadingZero_;
    private long nationalNumber_;
    private byte memoizedIsInitialized = 2;
    private String extension_ = "";
    private int numberOfLeadingZeros_ = 1;
    private String rawInput_ = "";
    private String preferredDomesticCarrierCode_ = "";

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.bitField0_ &= -2;
        this.countryCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCodeSource() {
        this.bitField0_ &= -65;
        this.countryCodeSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.bitField0_ &= -5;
        this.extension_ = getDefaultInstance().getExtension();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItalianLeadingZero() {
        this.bitField0_ &= -9;
        this.italianLeadingZero_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNationalNumber() {
        this.bitField0_ &= -3;
        this.nationalNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberOfLeadingZeros() {
        this.bitField0_ &= -17;
        this.numberOfLeadingZeros_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferredDomesticCarrierCode() {
        this.bitField0_ &= -129;
        this.preferredDomesticCarrierCode_ = getDefaultInstance().getPreferredDomesticCarrierCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawInput() {
        this.bitField0_ &= -33;
        this.rawInput_ = getDefaultInstance().getRawInput();
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
    public void setCountryCode(int i2) {
        this.bitField0_ |= 1;
        this.countryCode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodeSource(c cVar) {
        this.countryCodeSource_ = cVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.extension_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionBytes(v vVar) {
        this.extension_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItalianLeadingZero(boolean z) {
        this.bitField0_ |= 8;
        this.italianLeadingZero_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNationalNumber(long j2) {
        this.bitField0_ |= 2;
        this.nationalNumber_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberOfLeadingZeros(int i2) {
        this.bitField0_ |= 16;
        this.numberOfLeadingZeros_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferredDomesticCarrierCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.preferredDomesticCarrierCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferredDomesticCarrierCodeBytes(v vVar) {
        this.preferredDomesticCarrierCode_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawInput(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.rawInput_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawInputBytes(v vVar) {
        this.rawInput_ = vVar.u();
        this.bitField0_ |= 32;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\u0006᠌\u0006\u0007ဈ\u0007\bင\u0004", new Object[]{"bitField0_", "countryCode_", "nationalNumber_", "extension_", "italianLeadingZero_", "rawInput_", "countryCodeSource_", b.f12467a, "preferredDomesticCarrierCode_", "numberOfLeadingZeros_"});
            case 3:
                return new d();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
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
            default:
                throw null;
        }
    }

    public int getCountryCode() {
        return this.countryCode_;
    }

    public c getCountryCodeSource() {
        c cVarA = c.a(this.countryCodeSource_);
        return cVarA == null ? c.UNSPECIFIED : cVarA;
    }

    public String getExtension() {
        return this.extension_;
    }

    public v getExtensionBytes() {
        return v.s(this.extension_);
    }

    public boolean getItalianLeadingZero() {
        return this.italianLeadingZero_;
    }

    public long getNationalNumber() {
        return this.nationalNumber_;
    }

    public int getNumberOfLeadingZeros() {
        return this.numberOfLeadingZeros_;
    }

    public String getPreferredDomesticCarrierCode() {
        return this.preferredDomesticCarrierCode_;
    }

    public v getPreferredDomesticCarrierCodeBytes() {
        return v.s(this.preferredDomesticCarrierCode_);
    }

    public String getRawInput() {
        return this.rawInput_;
    }

    public v getRawInputBytes() {
        return v.s(this.rawInput_);
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCountryCodeSource() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasExtension() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasItalianLeadingZero() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNationalNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNumberOfLeadingZeros() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPreferredDomesticCarrierCode() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRawInput() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(d dVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(dVar);
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
