package com.waze.jni.protos.sound;

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
public final class TtsVoice extends du<TtsVoice, Builder> implements TtsVoiceOrBuilder {
    private static final TtsVoice DEFAULT_INSTANCE;
    public static final int LANG_FIELD_NUMBER = 3;
    public static final int LOCALE_FIELD_NUMBER = 4;
    private static volatile fo<TtsVoice> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int VOICE_ID_FIELD_NUMBER = 1;
    private int version_;
    private String voiceId_ = "";
    private String lang_ = "";
    private String locale_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.sound.TtsVoice$1, reason: invalid class name */
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
    public final class Builder extends dm<TtsVoice, Builder> implements TtsVoiceOrBuilder {
        private Builder() {
            super(TtsVoice.DEFAULT_INSTANCE);
        }

        public Builder clearLang() {
            copyOnWrite();
            ((TtsVoice) this.instance).clearLang();
            return this;
        }

        public Builder clearLocale() {
            copyOnWrite();
            ((TtsVoice) this.instance).clearLocale();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((TtsVoice) this.instance).clearVersion();
            return this;
        }

        public Builder clearVoiceId() {
            copyOnWrite();
            ((TtsVoice) this.instance).clearVoiceId();
            return this;
        }

        @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
        public String getLang() {
            return ((TtsVoice) this.instance).getLang();
        }

        @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
        public v getLangBytes() {
            return ((TtsVoice) this.instance).getLangBytes();
        }

        @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
        public String getLocale() {
            return ((TtsVoice) this.instance).getLocale();
        }

        @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
        public v getLocaleBytes() {
            return ((TtsVoice) this.instance).getLocaleBytes();
        }

        @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
        public int getVersion() {
            return ((TtsVoice) this.instance).getVersion();
        }

        @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
        public String getVoiceId() {
            return ((TtsVoice) this.instance).getVoiceId();
        }

        @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
        public v getVoiceIdBytes() {
            return ((TtsVoice) this.instance).getVoiceIdBytes();
        }

        public Builder setLang(String str) {
            copyOnWrite();
            ((TtsVoice) this.instance).setLang(str);
            return this;
        }

        public Builder setLangBytes(v vVar) {
            copyOnWrite();
            ((TtsVoice) this.instance).setLangBytes(vVar);
            return this;
        }

        public Builder setLocale(String str) {
            copyOnWrite();
            ((TtsVoice) this.instance).setLocale(str);
            return this;
        }

        public Builder setLocaleBytes(v vVar) {
            copyOnWrite();
            ((TtsVoice) this.instance).setLocaleBytes(vVar);
            return this;
        }

        public Builder setVersion(int i2) {
            copyOnWrite();
            ((TtsVoice) this.instance).setVersion(i2);
            return this;
        }

        public Builder setVoiceId(String str) {
            copyOnWrite();
            ((TtsVoice) this.instance).setVoiceId(str);
            return this;
        }

        public Builder setVoiceIdBytes(v vVar) {
            copyOnWrite();
            ((TtsVoice) this.instance).setVoiceIdBytes(vVar);
            return this;
        }
    }

    static {
        TtsVoice ttsVoice = new TtsVoice();
        DEFAULT_INSTANCE = ttsVoice;
        du.registerDefaultInstance(TtsVoice.class, ttsVoice);
    }

    private TtsVoice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLang() {
        this.lang_ = getDefaultInstance().getLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        this.voiceId_ = getDefaultInstance().getVoiceId();
    }

    public static TtsVoice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TtsVoice parseDelimitedFrom(InputStream inputStream) {
        return (TtsVoice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TtsVoice parseFrom(v vVar) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<TtsVoice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setVersion(int i2) {
        this.version_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceId(String str) {
        Objects.requireNonNull(str);
        this.voiceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.voiceId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"voiceId_", "version_", "lang_", "locale_"});
        }
        if (iOrdinal == 3) {
            return new TtsVoice();
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
        fo<TtsVoice> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (TtsVoice.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
    public String getLang() {
        return this.lang_;
    }

    @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
    public v getLangBytes() {
        return v.s(this.lang_);
    }

    @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
    public String getLocale() {
        return this.locale_;
    }

    @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
    public v getLocaleBytes() {
        return v.s(this.locale_);
    }

    @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
    public String getVoiceId() {
        return this.voiceId_;
    }

    @Override // com.waze.jni.protos.sound.TtsVoiceOrBuilder
    public v getVoiceIdBytes() {
        return v.s(this.voiceId_);
    }

    public static Builder newBuilder(TtsVoice ttsVoice) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ttsVoice);
    }

    public static TtsVoice parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (TtsVoice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TtsVoice parseFrom(v vVar, de deVar) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static TtsVoice parseFrom(z zVar) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static TtsVoice parseFrom(z zVar, de deVar) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static TtsVoice parseFrom(InputStream inputStream) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TtsVoice parseFrom(InputStream inputStream, de deVar) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TtsVoice parseFrom(ByteBuffer byteBuffer) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TtsVoice parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static TtsVoice parseFrom(byte[] bArr) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TtsVoice parseFrom(byte[] bArr, de deVar) {
        return (TtsVoice) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
