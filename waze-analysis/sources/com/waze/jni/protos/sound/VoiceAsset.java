package com.waze.jni.protos.sound;

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
public final class VoiceAsset extends du<VoiceAsset, Builder> implements VoiceAssetOrBuilder {
    private static final VoiceAsset DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 4;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 5;
    private static volatile fo<VoiceAsset> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int type_;
    private int version_;
    private String language_ = "";
    private String id_ = "";
    private String locale_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.sound.VoiceAsset$1, reason: invalid class name */
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
    public final class Builder extends dm<VoiceAsset, Builder> implements VoiceAssetOrBuilder {
        private Builder() {
            super(VoiceAsset.DEFAULT_INSTANCE);
        }

        public Builder clearId() {
            copyOnWrite();
            ((VoiceAsset) this.instance).clearId();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((VoiceAsset) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLocale() {
            copyOnWrite();
            ((VoiceAsset) this.instance).clearLocale();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((VoiceAsset) this.instance).clearType();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((VoiceAsset) this.instance).clearVersion();
            return this;
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public String getId() {
            return ((VoiceAsset) this.instance).getId();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public v getIdBytes() {
            return ((VoiceAsset) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public String getLanguage() {
            return ((VoiceAsset) this.instance).getLanguage();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public v getLanguageBytes() {
            return ((VoiceAsset) this.instance).getLanguageBytes();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public String getLocale() {
            return ((VoiceAsset) this.instance).getLocale();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public v getLocaleBytes() {
            return ((VoiceAsset) this.instance).getLocaleBytes();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public Type getType() {
            return ((VoiceAsset) this.instance).getType();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public int getTypeValue() {
            return ((VoiceAsset) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
        public int getVersion() {
            return ((VoiceAsset) this.instance).getVersion();
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setLanguage(String str) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setLanguage(str);
            return this;
        }

        public Builder setLanguageBytes(v vVar) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setLanguageBytes(vVar);
            return this;
        }

        public Builder setLocale(String str) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setLocale(str);
            return this;
        }

        public Builder setLocaleBytes(v vVar) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setLocaleBytes(vVar);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setVersion(int i2) {
            copyOnWrite();
            ((VoiceAsset) this.instance).setVersion(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        NOT_SET(0),
        PROMPT(1),
        TTS(2),
        UNRECOGNIZED(-1);

        public static final int NOT_SET_VALUE = 0;
        public static final int PROMPT_VALUE = 1;
        public static final int TTS_VALUE = 2;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.sound.VoiceAsset.Type.1
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
                return NOT_SET;
            }
            if (i2 == 1) {
                return PROMPT;
            }
            if (i2 != 2) {
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
        VoiceAsset voiceAsset = new VoiceAsset();
        DEFAULT_INSTANCE = voiceAsset;
        du.registerDefaultInstance(VoiceAsset.class, voiceAsset);
    }

    private VoiceAsset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static VoiceAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VoiceAsset parseDelimitedFrom(InputStream inputStream) {
        return (VoiceAsset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceAsset parseFrom(v vVar) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VoiceAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.language_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.locale_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i2) {
        this.version_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"type_", "language_", "version_", "id_", "locale_"});
        }
        if (iOrdinal == 3) {
            return new VoiceAsset();
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
        fo<VoiceAsset> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VoiceAsset.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public String getLanguage() {
        return this.language_;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public v getLanguageBytes() {
        return v.s(this.language_);
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public String getLocale() {
        return this.locale_;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public v getLocaleBytes() {
        return v.s(this.locale_);
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetOrBuilder
    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(VoiceAsset voiceAsset) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(voiceAsset);
    }

    public static VoiceAsset parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VoiceAsset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceAsset parseFrom(v vVar, de deVar) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VoiceAsset parseFrom(z zVar) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VoiceAsset parseFrom(z zVar, de deVar) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VoiceAsset parseFrom(InputStream inputStream) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceAsset parseFrom(InputStream inputStream, de deVar) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceAsset parseFrom(ByteBuffer byteBuffer) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VoiceAsset parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static VoiceAsset parseFrom(byte[] bArr) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VoiceAsset parseFrom(byte[] bArr, de deVar) {
        return (VoiceAsset) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
