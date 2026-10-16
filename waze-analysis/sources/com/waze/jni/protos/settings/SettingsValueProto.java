package com.waze.jni.protos.settings;

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
public final class SettingsValueProto extends du<SettingsValueProto, Builder> implements SettingsValueProtoOrBuilder {
    private static final SettingsValueProto DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 2;
    public static final int IS_SELECTED_FIELD_NUMBER = 3;
    private static volatile fo<SettingsValueProto> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isSelected_;
    private String value_ = "";
    private String display_ = "";
    private String type_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.SettingsValueProto$1, reason: invalid class name */
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
    public final class Builder extends dm<SettingsValueProto, Builder> implements SettingsValueProtoOrBuilder {
        private Builder() {
            super(SettingsValueProto.DEFAULT_INSTANCE);
        }

        public Builder clearDisplay() {
            copyOnWrite();
            ((SettingsValueProto) this.instance).clearDisplay();
            return this;
        }

        public Builder clearIsSelected() {
            copyOnWrite();
            ((SettingsValueProto) this.instance).clearIsSelected();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SettingsValueProto) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((SettingsValueProto) this.instance).clearValue();
            return this;
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public String getDisplay() {
            return ((SettingsValueProto) this.instance).getDisplay();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public v getDisplayBytes() {
            return ((SettingsValueProto) this.instance).getDisplayBytes();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public boolean getIsSelected() {
            return ((SettingsValueProto) this.instance).getIsSelected();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public String getType() {
            return ((SettingsValueProto) this.instance).getType();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public v getTypeBytes() {
            return ((SettingsValueProto) this.instance).getTypeBytes();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public String getValue() {
            return ((SettingsValueProto) this.instance).getValue();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public v getValueBytes() {
            return ((SettingsValueProto) this.instance).getValueBytes();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
        public boolean hasType() {
            return ((SettingsValueProto) this.instance).hasType();
        }

        public Builder setDisplay(String str) {
            copyOnWrite();
            ((SettingsValueProto) this.instance).setDisplay(str);
            return this;
        }

        public Builder setDisplayBytes(v vVar) {
            copyOnWrite();
            ((SettingsValueProto) this.instance).setDisplayBytes(vVar);
            return this;
        }

        public Builder setIsSelected(boolean z) {
            copyOnWrite();
            ((SettingsValueProto) this.instance).setIsSelected(z);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((SettingsValueProto) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(v vVar) {
            copyOnWrite();
            ((SettingsValueProto) this.instance).setTypeBytes(vVar);
            return this;
        }

        public Builder setValue(String str) {
            copyOnWrite();
            ((SettingsValueProto) this.instance).setValue(str);
            return this;
        }

        public Builder setValueBytes(v vVar) {
            copyOnWrite();
            ((SettingsValueProto) this.instance).setValueBytes(vVar);
            return this;
        }
    }

    static {
        SettingsValueProto settingsValueProto = new SettingsValueProto();
        DEFAULT_INSTANCE = settingsValueProto;
        du.registerDefaultInstance(SettingsValueProto.class, settingsValueProto);
    }

    private SettingsValueProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplay() {
        this.display_ = getDefaultInstance().getDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSelected() {
        this.isSelected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static SettingsValueProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsValueProto parseDelimitedFrom(InputStream inputStream) {
        return (SettingsValueProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsValueProto parseFrom(v vVar) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SettingsValueProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplay(String str) {
        Objects.requireNonNull(str);
        this.display_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.display_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSelected(boolean z) {
        this.isSelected_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.type_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.value_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004ለ\u0000", new Object[]{"bitField0_", "value_", "display_", "isSelected_", "type_"});
        }
        if (iOrdinal == 3) {
            return new SettingsValueProto();
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
        fo<SettingsValueProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SettingsValueProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public String getDisplay() {
        return this.display_;
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public v getDisplayBytes() {
        return v.s(this.display_);
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public boolean getIsSelected() {
        return this.isSelected_;
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public v getTypeBytes() {
        return v.s(this.type_);
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public String getValue() {
        return this.value_;
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public v getValueBytes() {
        return v.s(this.value_);
    }

    @Override // com.waze.jni.protos.settings.SettingsValueProtoOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(SettingsValueProto settingsValueProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(settingsValueProto);
    }

    public static SettingsValueProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SettingsValueProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SettingsValueProto parseFrom(v vVar, de deVar) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SettingsValueProto parseFrom(z zVar) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SettingsValueProto parseFrom(z zVar, de deVar) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static SettingsValueProto parseFrom(InputStream inputStream) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsValueProto parseFrom(InputStream inputStream, de deVar) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SettingsValueProto parseFrom(ByteBuffer byteBuffer) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SettingsValueProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static SettingsValueProto parseFrom(byte[] bArr) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsValueProto parseFrom(byte[] bArr, de deVar) {
        return (SettingsValueProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
