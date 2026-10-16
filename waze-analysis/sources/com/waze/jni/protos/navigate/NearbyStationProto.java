package com.waze.jni.protos.navigate;

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
public final class NearbyStationProto extends du<NearbyStationProto, Builder> implements NearbyStationProtoOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 4;
    private static final NearbyStationProto DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int INDEX_FIELD_NUMBER = 5;
    private static volatile fo<NearbyStationProto> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int index_;
    private String result_ = "";
    private String value_ = "";
    private String icon_ = "";
    private String address_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NearbyStationProto$1, reason: invalid class name */
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
    public final class Builder extends dm<NearbyStationProto, Builder> implements NearbyStationProtoOrBuilder {
        private Builder() {
            super(NearbyStationProto.DEFAULT_INSTANCE);
        }

        public Builder clearAddress() {
            copyOnWrite();
            ((NearbyStationProto) this.instance).clearAddress();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((NearbyStationProto) this.instance).clearIcon();
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((NearbyStationProto) this.instance).clearIndex();
            return this;
        }

        public Builder clearResult() {
            copyOnWrite();
            ((NearbyStationProto) this.instance).clearResult();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((NearbyStationProto) this.instance).clearValue();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public String getAddress() {
            return ((NearbyStationProto) this.instance).getAddress();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public v getAddressBytes() {
            return ((NearbyStationProto) this.instance).getAddressBytes();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public String getIcon() {
            return ((NearbyStationProto) this.instance).getIcon();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public v getIconBytes() {
            return ((NearbyStationProto) this.instance).getIconBytes();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public int getIndex() {
            return ((NearbyStationProto) this.instance).getIndex();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public String getResult() {
            return ((NearbyStationProto) this.instance).getResult();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public v getResultBytes() {
            return ((NearbyStationProto) this.instance).getResultBytes();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public String getValue() {
            return ((NearbyStationProto) this.instance).getValue();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public v getValueBytes() {
            return ((NearbyStationProto) this.instance).getValueBytes();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public boolean hasAddress() {
            return ((NearbyStationProto) this.instance).hasAddress();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public boolean hasIcon() {
            return ((NearbyStationProto) this.instance).hasIcon();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public boolean hasIndex() {
            return ((NearbyStationProto) this.instance).hasIndex();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public boolean hasResult() {
            return ((NearbyStationProto) this.instance).hasResult();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
        public boolean hasValue() {
            return ((NearbyStationProto) this.instance).hasValue();
        }

        public Builder setAddress(String str) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setAddress(str);
            return this;
        }

        public Builder setAddressBytes(v vVar) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setAddressBytes(vVar);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(v vVar) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setIconBytes(vVar);
            return this;
        }

        public Builder setIndex(int i2) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setIndex(i2);
            return this;
        }

        public Builder setResult(String str) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setResult(str);
            return this;
        }

        public Builder setResultBytes(v vVar) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setResultBytes(vVar);
            return this;
        }

        public Builder setValue(String str) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setValue(str);
            return this;
        }

        public Builder setValueBytes(v vVar) {
            copyOnWrite();
            ((NearbyStationProto) this.instance).setValueBytes(vVar);
            return this;
        }
    }

    static {
        NearbyStationProto nearbyStationProto = new NearbyStationProto();
        DEFAULT_INSTANCE = nearbyStationProto;
        du.registerDefaultInstance(NearbyStationProto.class, nearbyStationProto);
    }

    private NearbyStationProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.bitField0_ &= -9;
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.bitField0_ &= -5;
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -17;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.bitField0_ &= -2;
        this.result_ = getDefaultInstance().getResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = getDefaultInstance().getValue();
    }

    public static NearbyStationProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NearbyStationProto parseDelimitedFrom(InputStream inputStream) {
        return (NearbyStationProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NearbyStationProto parseFrom(v vVar) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NearbyStationProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.address_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.icon_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 16;
        this.index_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.result_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.result_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.value_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005င\u0004", new Object[]{"bitField0_", "result_", "value_", "icon_", "address_", "index_"});
        }
        if (iOrdinal == 3) {
            return new NearbyStationProto();
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
        fo<NearbyStationProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NearbyStationProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public String getAddress() {
        return this.address_;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public v getAddressBytes() {
        return v.s(this.address_);
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public v getIconBytes() {
        return v.s(this.icon_);
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public String getResult() {
        return this.result_;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public v getResultBytes() {
        return v.s(this.result_);
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public String getValue() {
        return this.value_;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public v getValueBytes() {
        return v.s(this.value_);
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public boolean hasAddress() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public boolean hasIcon() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public boolean hasIndex() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public boolean hasResult() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationProtoOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(NearbyStationProto nearbyStationProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nearbyStationProto);
    }

    public static NearbyStationProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NearbyStationProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NearbyStationProto parseFrom(v vVar, de deVar) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NearbyStationProto parseFrom(z zVar) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NearbyStationProto parseFrom(z zVar, de deVar) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NearbyStationProto parseFrom(InputStream inputStream) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NearbyStationProto parseFrom(InputStream inputStream, de deVar) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NearbyStationProto parseFrom(ByteBuffer byteBuffer) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NearbyStationProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NearbyStationProto parseFrom(byte[] bArr) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NearbyStationProto parseFrom(byte[] bArr, de deVar) {
        return (NearbyStationProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
