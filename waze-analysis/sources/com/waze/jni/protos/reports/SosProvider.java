package com.waze.jni.protos.reports;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SosProvider extends du<SosProvider, Builder> implements SosProviderOrBuilder {
    private static final SosProvider DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<SosProvider> PARSER = null;
    public static final int PHONE_CALL_FIELD_NUMBER = 4;
    public static final int PHONE_SEND_FIELD_NUMBER = 5;
    public static final int SUBTYPE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 7;
    private int bitField0_;
    private int subtype_;
    private int type_;
    private String name_ = "";
    private String phoneCall_ = "";
    private String phoneSend_ = "";
    private String email_ = "";
    private String url_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.reports.SosProvider$1, reason: invalid class name */
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
    public final class Builder extends dm<SosProvider, Builder> implements SosProviderOrBuilder {
        private Builder() {
            super(SosProvider.DEFAULT_INSTANCE);
        }

        public Builder clearEmail() {
            copyOnWrite();
            ((SosProvider) this.instance).clearEmail();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((SosProvider) this.instance).clearName();
            return this;
        }

        public Builder clearPhoneCall() {
            copyOnWrite();
            ((SosProvider) this.instance).clearPhoneCall();
            return this;
        }

        public Builder clearPhoneSend() {
            copyOnWrite();
            ((SosProvider) this.instance).clearPhoneSend();
            return this;
        }

        public Builder clearSubtype() {
            copyOnWrite();
            ((SosProvider) this.instance).clearSubtype();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SosProvider) this.instance).clearType();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((SosProvider) this.instance).clearUrl();
            return this;
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public String getEmail() {
            return ((SosProvider) this.instance).getEmail();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public v getEmailBytes() {
            return ((SosProvider) this.instance).getEmailBytes();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public String getName() {
            return ((SosProvider) this.instance).getName();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public v getNameBytes() {
            return ((SosProvider) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public String getPhoneCall() {
            return ((SosProvider) this.instance).getPhoneCall();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public v getPhoneCallBytes() {
            return ((SosProvider) this.instance).getPhoneCallBytes();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public String getPhoneSend() {
            return ((SosProvider) this.instance).getPhoneSend();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public v getPhoneSendBytes() {
            return ((SosProvider) this.instance).getPhoneSendBytes();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public ProviderSubType getSubtype() {
            return ((SosProvider) this.instance).getSubtype();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public int getSubtypeValue() {
            return ((SosProvider) this.instance).getSubtypeValue();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public ProviderType getType() {
            return ((SosProvider) this.instance).getType();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public int getTypeValue() {
            return ((SosProvider) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public String getUrl() {
            return ((SosProvider) this.instance).getUrl();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public v getUrlBytes() {
            return ((SosProvider) this.instance).getUrlBytes();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public boolean hasEmail() {
            return ((SosProvider) this.instance).hasEmail();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public boolean hasName() {
            return ((SosProvider) this.instance).hasName();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public boolean hasPhoneCall() {
            return ((SosProvider) this.instance).hasPhoneCall();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public boolean hasPhoneSend() {
            return ((SosProvider) this.instance).hasPhoneSend();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public boolean hasSubtype() {
            return ((SosProvider) this.instance).hasSubtype();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public boolean hasType() {
            return ((SosProvider) this.instance).hasType();
        }

        @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
        public boolean hasUrl() {
            return ((SosProvider) this.instance).hasUrl();
        }

        public Builder setEmail(String str) {
            copyOnWrite();
            ((SosProvider) this.instance).setEmail(str);
            return this;
        }

        public Builder setEmailBytes(v vVar) {
            copyOnWrite();
            ((SosProvider) this.instance).setEmailBytes(vVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((SosProvider) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((SosProvider) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setPhoneCall(String str) {
            copyOnWrite();
            ((SosProvider) this.instance).setPhoneCall(str);
            return this;
        }

        public Builder setPhoneCallBytes(v vVar) {
            copyOnWrite();
            ((SosProvider) this.instance).setPhoneCallBytes(vVar);
            return this;
        }

        public Builder setPhoneSend(String str) {
            copyOnWrite();
            ((SosProvider) this.instance).setPhoneSend(str);
            return this;
        }

        public Builder setPhoneSendBytes(v vVar) {
            copyOnWrite();
            ((SosProvider) this.instance).setPhoneSendBytes(vVar);
            return this;
        }

        public Builder setSubtype(ProviderSubType providerSubType) {
            copyOnWrite();
            ((SosProvider) this.instance).setSubtype(providerSubType);
            return this;
        }

        public Builder setSubtypeValue(int i2) {
            copyOnWrite();
            ((SosProvider) this.instance).setSubtypeValue(i2);
            return this;
        }

        public Builder setType(ProviderType providerType) {
            copyOnWrite();
            ((SosProvider) this.instance).setType(providerType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((SosProvider) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((SosProvider) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(v vVar) {
            copyOnWrite();
            ((SosProvider) this.instance).setUrlBytes(vVar);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum ProviderSubType implements eg {
        POLICE(0),
        AMBULANCE(1),
        FIRE(2),
        ROADSIDE_ASSISTANCE(3),
        UNRECOGNIZED(-1);

        public static final int AMBULANCE_VALUE = 1;
        public static final int FIRE_VALUE = 2;
        public static final int POLICE_VALUE = 0;
        public static final int ROADSIDE_ASSISTANCE_VALUE = 3;
        private static final eh<ProviderSubType> internalValueMap = new eh<ProviderSubType>() { // from class: com.waze.jni.protos.reports.SosProvider.ProviderSubType.1
            @Override // com.google.v.eh
            public ProviderSubType findValueByNumber(int i2) {
                return ProviderSubType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ProviderSubTypeVerifier implements ei {
            static final ei INSTANCE = new ProviderSubTypeVerifier();

            private ProviderSubTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return ProviderSubType.forNumber(i2) != null;
            }
        }

        ProviderSubType(int i2) {
            this.value = i2;
        }

        public static ProviderSubType forNumber(int i2) {
            if (i2 == 0) {
                return POLICE;
            }
            if (i2 == 1) {
                return AMBULANCE;
            }
            if (i2 == 2) {
                return FIRE;
            }
            if (i2 != 3) {
                return null;
            }
            return ROADSIDE_ASSISTANCE;
        }

        public static eh<ProviderSubType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ProviderSubTypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public enum ProviderType implements eg {
        EMERGENCY(0),
        ASSISTANCE(1),
        OTHER(2),
        UNRECOGNIZED(-1);

        public static final int ASSISTANCE_VALUE = 1;
        public static final int EMERGENCY_VALUE = 0;
        public static final int OTHER_VALUE = 2;
        private static final eh<ProviderType> internalValueMap = new eh<ProviderType>() { // from class: com.waze.jni.protos.reports.SosProvider.ProviderType.1
            @Override // com.google.v.eh
            public ProviderType findValueByNumber(int i2) {
                return ProviderType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ProviderTypeVerifier implements ei {
            static final ei INSTANCE = new ProviderTypeVerifier();

            private ProviderTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return ProviderType.forNumber(i2) != null;
            }
        }

        ProviderType(int i2) {
            this.value = i2;
        }

        public static ProviderType forNumber(int i2) {
            if (i2 == 0) {
                return EMERGENCY;
            }
            if (i2 == 1) {
                return ASSISTANCE;
            }
            if (i2 != 2) {
                return null;
            }
            return OTHER;
        }

        public static eh<ProviderType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ProviderTypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        SosProvider sosProvider = new SosProvider();
        DEFAULT_INSTANCE = sosProvider;
        du.registerDefaultInstance(SosProvider.class, sosProvider);
    }

    private SosProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -33;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneCall() {
        this.bitField0_ &= -9;
        this.phoneCall_ = getDefaultInstance().getPhoneCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneSend() {
        this.bitField0_ &= -17;
        this.phoneSend_ = getDefaultInstance().getPhoneSend();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtype() {
        this.bitField0_ &= -5;
        this.subtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -65;
        this.url_ = getDefaultInstance().getUrl();
    }

    public static SosProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SosProvider parseDelimitedFrom(InputStream inputStream) {
        return (SosProvider) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SosProvider parseFrom(v vVar) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SosProvider> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.email_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneCall(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.phoneCall_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneCallBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.phoneCall_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneSend(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.phoneSend_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneSendBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.phoneSend_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtype(ProviderSubType providerSubType) {
        this.subtype_ = providerSubType.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtypeValue(int i2) {
        this.bitField0_ |= 4;
        this.subtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ProviderType providerType) {
        this.type_ = providerType.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.bitField0_ |= 2;
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006", new Object[]{"bitField0_", "name_", "type_", "subtype_", "phoneCall_", "phoneSend_", "email_", "url_"});
        }
        if (iOrdinal == 3) {
            return new SosProvider();
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
        fo<SosProvider> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SosProvider.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public String getEmail() {
        return this.email_;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public v getEmailBytes() {
        return v.s(this.email_);
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public String getPhoneCall() {
        return this.phoneCall_;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public v getPhoneCallBytes() {
        return v.s(this.phoneCall_);
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public String getPhoneSend() {
        return this.phoneSend_;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public v getPhoneSendBytes() {
        return v.s(this.phoneSend_);
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public ProviderSubType getSubtype() {
        ProviderSubType providerSubTypeForNumber = ProviderSubType.forNumber(this.subtype_);
        return providerSubTypeForNumber == null ? ProviderSubType.UNRECOGNIZED : providerSubTypeForNumber;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public int getSubtypeValue() {
        return this.subtype_;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public ProviderType getType() {
        ProviderType providerTypeForNumber = ProviderType.forNumber(this.type_);
        return providerTypeForNumber == null ? ProviderType.UNRECOGNIZED : providerTypeForNumber;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public v getUrlBytes() {
        return v.s(this.url_);
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public boolean hasEmail() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public boolean hasPhoneCall() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public boolean hasPhoneSend() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public boolean hasSubtype() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.reports.SosProviderOrBuilder
    public boolean hasUrl() {
        return (this.bitField0_ & 64) != 0;
    }

    public static Builder newBuilder(SosProvider sosProvider) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sosProvider);
    }

    public static SosProvider parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SosProvider) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SosProvider parseFrom(v vVar, de deVar) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SosProvider parseFrom(z zVar) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SosProvider parseFrom(z zVar, de deVar) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static SosProvider parseFrom(InputStream inputStream) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SosProvider parseFrom(InputStream inputStream, de deVar) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SosProvider parseFrom(ByteBuffer byteBuffer) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SosProvider parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static SosProvider parseFrom(byte[] bArr) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SosProvider parseFrom(byte[] bArr, de deVar) {
        return (SosProvider) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
