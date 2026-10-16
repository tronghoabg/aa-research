package com.waze.jni.protos.places;

import com.google.v.de;
import com.google.v.dm;
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
/* loaded from: classes6.dex */
public final class Address extends du<Address, Builder> implements AddressOrBuilder {
    public static final int CITY_FIELD_NUMBER = 3;
    public static final int COUNTRY_FIELD_NUMBER = 5;
    private static final Address DEFAULT_INSTANCE;
    public static final int HOUSE_NUMBER_FIELD_NUMBER = 1;
    private static volatile fo<Address> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int STREET_FIELD_NUMBER = 2;
    public static final int ZIP_FIELD_NUMBER = 6;
    private String houseNumber_ = "";
    private String street_ = "";
    private String city_ = "";
    private String state_ = "";
    private String country_ = "";
    private String zip_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.Address$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Address, Builder> implements AddressOrBuilder {
        private Builder() {
            super(Address.DEFAULT_INSTANCE);
        }

        public Builder clearCity() {
            copyOnWrite();
            ((Address) this.instance).clearCity();
            return this;
        }

        public Builder clearCountry() {
            copyOnWrite();
            ((Address) this.instance).clearCountry();
            return this;
        }

        public Builder clearHouseNumber() {
            copyOnWrite();
            ((Address) this.instance).clearHouseNumber();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((Address) this.instance).clearState();
            return this;
        }

        public Builder clearStreet() {
            copyOnWrite();
            ((Address) this.instance).clearStreet();
            return this;
        }

        public Builder clearZip() {
            copyOnWrite();
            ((Address) this.instance).clearZip();
            return this;
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public String getCity() {
            return ((Address) this.instance).getCity();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public v getCityBytes() {
            return ((Address) this.instance).getCityBytes();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public String getCountry() {
            return ((Address) this.instance).getCountry();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public v getCountryBytes() {
            return ((Address) this.instance).getCountryBytes();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public String getHouseNumber() {
            return ((Address) this.instance).getHouseNumber();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public v getHouseNumberBytes() {
            return ((Address) this.instance).getHouseNumberBytes();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public String getState() {
            return ((Address) this.instance).getState();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public v getStateBytes() {
            return ((Address) this.instance).getStateBytes();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public String getStreet() {
            return ((Address) this.instance).getStreet();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public v getStreetBytes() {
            return ((Address) this.instance).getStreetBytes();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public String getZip() {
            return ((Address) this.instance).getZip();
        }

        @Override // com.waze.jni.protos.places.AddressOrBuilder
        public v getZipBytes() {
            return ((Address) this.instance).getZipBytes();
        }

        public Builder setCity(String str) {
            copyOnWrite();
            ((Address) this.instance).setCity(str);
            return this;
        }

        public Builder setCityBytes(v vVar) {
            copyOnWrite();
            ((Address) this.instance).setCityBytes(vVar);
            return this;
        }

        public Builder setCountry(String str) {
            copyOnWrite();
            ((Address) this.instance).setCountry(str);
            return this;
        }

        public Builder setCountryBytes(v vVar) {
            copyOnWrite();
            ((Address) this.instance).setCountryBytes(vVar);
            return this;
        }

        public Builder setHouseNumber(String str) {
            copyOnWrite();
            ((Address) this.instance).setHouseNumber(str);
            return this;
        }

        public Builder setHouseNumberBytes(v vVar) {
            copyOnWrite();
            ((Address) this.instance).setHouseNumberBytes(vVar);
            return this;
        }

        public Builder setState(String str) {
            copyOnWrite();
            ((Address) this.instance).setState(str);
            return this;
        }

        public Builder setStateBytes(v vVar) {
            copyOnWrite();
            ((Address) this.instance).setStateBytes(vVar);
            return this;
        }

        public Builder setStreet(String str) {
            copyOnWrite();
            ((Address) this.instance).setStreet(str);
            return this;
        }

        public Builder setStreetBytes(v vVar) {
            copyOnWrite();
            ((Address) this.instance).setStreetBytes(vVar);
            return this;
        }

        public Builder setZip(String str) {
            copyOnWrite();
            ((Address) this.instance).setZip(str);
            return this;
        }

        public Builder setZipBytes(v vVar) {
            copyOnWrite();
            ((Address) this.instance).setZipBytes(vVar);
            return this;
        }
    }

    static {
        Address address = new Address();
        DEFAULT_INSTANCE = address;
        du.registerDefaultInstance(Address.class, address);
    }

    private Address() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHouseNumber() {
        this.houseNumber_ = getDefaultInstance().getHouseNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = getDefaultInstance().getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZip() {
        this.zip_ = getDefaultInstance().getZip();
    }

    public static Address getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Address parseDelimitedFrom(InputStream inputStream) {
        return (Address) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Address parseFrom(v vVar) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Address> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.city_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.country_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumber(String str) {
        Objects.requireNonNull(str);
        this.houseNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumberBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.houseNumber_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(String str) {
        Objects.requireNonNull(str);
        this.state_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.state_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.street_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZip(String str) {
        Objects.requireNonNull(str);
        this.zip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.zip_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"houseNumber_", "street_", "city_", "state_", "country_", "zip_"});
        }
        if (iOrdinal == 3) {
            return new Address();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<Address> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Address.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public String getCity() {
        return this.city_;
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public v getCityBytes() {
        return v.s(this.city_);
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public String getCountry() {
        return this.country_;
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public v getCountryBytes() {
        return v.s(this.country_);
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public String getHouseNumber() {
        return this.houseNumber_;
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public v getHouseNumberBytes() {
        return v.s(this.houseNumber_);
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public String getState() {
        return this.state_;
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public v getStateBytes() {
        return v.s(this.state_);
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public String getStreet() {
        return this.street_;
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public v getStreetBytes() {
        return v.s(this.street_);
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public String getZip() {
        return this.zip_;
    }

    @Override // com.waze.jni.protos.places.AddressOrBuilder
    public v getZipBytes() {
        return v.s(this.zip_);
    }

    public static Builder newBuilder(Address address) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(address);
    }

    public static Address parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Address) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Address parseFrom(v vVar, de deVar) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Address parseFrom(z zVar) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Address parseFrom(z zVar, de deVar) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Address parseFrom(InputStream inputStream) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Address parseFrom(InputStream inputStream, de deVar) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Address parseFrom(ByteBuffer byteBuffer) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Address parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Address parseFrom(byte[] bArr) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Address parseFrom(byte[] bArr, de deVar) {
        return (Address) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
