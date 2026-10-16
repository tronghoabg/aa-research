package com.waze.jni.protos.settings;

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
public final class VoiceData extends du<VoiceData, Builder> implements VoiceDataOrBuilder {
    private static final VoiceData DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_CURRENT_VOICE_FIELD_NUMBER = 6;
    public static final int LANG_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<VoiceData> PARSER = null;
    public static final int SHORT_NAME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 5;
    private boolean isCurrentVoice_;
    private int type_;
    private String id_ = "";
    private String name_ = "";
    private String shortName_ = "";
    private String description_ = "";
    private String lang_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.VoiceData$1, reason: invalid class name */
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
    public final class Builder extends dm<VoiceData, Builder> implements VoiceDataOrBuilder {
        private Builder() {
            super(VoiceData.DEFAULT_INSTANCE);
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((VoiceData) this.instance).clearDescription();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((VoiceData) this.instance).clearId();
            return this;
        }

        public Builder clearIsCurrentVoice() {
            copyOnWrite();
            ((VoiceData) this.instance).clearIsCurrentVoice();
            return this;
        }

        public Builder clearLang() {
            copyOnWrite();
            ((VoiceData) this.instance).clearLang();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((VoiceData) this.instance).clearName();
            return this;
        }

        public Builder clearShortName() {
            copyOnWrite();
            ((VoiceData) this.instance).clearShortName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((VoiceData) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public String getDescription() {
            return ((VoiceData) this.instance).getDescription();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public v getDescriptionBytes() {
            return ((VoiceData) this.instance).getDescriptionBytes();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public String getId() {
            return ((VoiceData) this.instance).getId();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public v getIdBytes() {
            return ((VoiceData) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public boolean getIsCurrentVoice() {
            return ((VoiceData) this.instance).getIsCurrentVoice();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public String getLang() {
            return ((VoiceData) this.instance).getLang();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public v getLangBytes() {
            return ((VoiceData) this.instance).getLangBytes();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public String getName() {
            return ((VoiceData) this.instance).getName();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public v getNameBytes() {
            return ((VoiceData) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public String getShortName() {
            return ((VoiceData) this.instance).getShortName();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public v getShortNameBytes() {
            return ((VoiceData) this.instance).getShortNameBytes();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public Type getType() {
            return ((VoiceData) this.instance).getType();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
        public int getTypeValue() {
            return ((VoiceData) this.instance).getTypeValue();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((VoiceData) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(v vVar) {
            copyOnWrite();
            ((VoiceData) this.instance).setDescriptionBytes(vVar);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((VoiceData) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((VoiceData) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setIsCurrentVoice(boolean z) {
            copyOnWrite();
            ((VoiceData) this.instance).setIsCurrentVoice(z);
            return this;
        }

        public Builder setLang(String str) {
            copyOnWrite();
            ((VoiceData) this.instance).setLang(str);
            return this;
        }

        public Builder setLangBytes(v vVar) {
            copyOnWrite();
            ((VoiceData) this.instance).setLangBytes(vVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((VoiceData) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((VoiceData) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setShortName(String str) {
            copyOnWrite();
            ((VoiceData) this.instance).setShortName(str);
            return this;
        }

        public Builder setShortNameBytes(v vVar) {
            copyOnWrite();
            ((VoiceData) this.instance).setShortNameBytes(vVar);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((VoiceData) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((VoiceData) this.instance).setTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        PROMPT(0),
        TTS(1),
        UNRECOGNIZED(-1);

        public static final int PROMPT_VALUE = 0;
        public static final int TTS_VALUE = 1;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.settings.VoiceData.Type.1
            @Override // com.google.v.eh
            public Type findValueByNumber(int i2) {
                return Type.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TypeVerifier implements ei {
            static final ei INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Type.forNumber(i2) != null;
            }
        }

        Type(int i2) {
            this.value = i2;
        }

        public static Type forNumber(int i2) {
            if (i2 == 0) {
                return PROMPT;
            }
            if (i2 != 1) {
                return null;
            }
            return TTS;
        }

        public static eh<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TypeVerifier.INSTANCE;
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
        VoiceData voiceData = new VoiceData();
        DEFAULT_INSTANCE = voiceData;
        du.registerDefaultInstance(VoiceData.class, voiceData);
    }

    private VoiceData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurrentVoice() {
        this.isCurrentVoice_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLang() {
        this.lang_ = getDefaultInstance().getLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortName() {
        this.shortName_ = getDefaultInstance().getShortName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static VoiceData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VoiceData parseDelimitedFrom(InputStream inputStream) {
        return (VoiceData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceData parseFrom(v vVar) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VoiceData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.description_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurrentVoice(boolean z) {
        this.isCurrentVoice_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLang(String str) {
        Objects.requireNonNull(str);
        this.lang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLangBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.lang_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortName(String str) {
        Objects.requireNonNull(str);
        this.shortName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.shortName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006\u0007\u0007Ȉ", new Object[]{"id_", "name_", "shortName_", "description_", "type_", "isCurrentVoice_", "lang_"});
        }
        if (iOrdinal == 3) {
            return new VoiceData();
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
        fo<VoiceData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VoiceData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public v getDescriptionBytes() {
        return v.s(this.description_);
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public boolean getIsCurrentVoice() {
        return this.isCurrentVoice_;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public String getLang() {
        return this.lang_;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public v getLangBytes() {
        return v.s(this.lang_);
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public String getShortName() {
        return this.shortName_;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public v getShortNameBytes() {
        return v.s(this.shortName_);
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(VoiceData voiceData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(voiceData);
    }

    public static VoiceData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VoiceData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceData parseFrom(v vVar, de deVar) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VoiceData parseFrom(z zVar) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VoiceData parseFrom(z zVar, de deVar) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VoiceData parseFrom(InputStream inputStream) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceData parseFrom(InputStream inputStream, de deVar) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceData parseFrom(ByteBuffer byteBuffer) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VoiceData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static VoiceData parseFrom(byte[] bArr) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VoiceData parseFrom(byte[] bArr, de deVar) {
        return (VoiceData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
