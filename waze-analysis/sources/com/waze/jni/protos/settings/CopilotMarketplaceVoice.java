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
public final class CopilotMarketplaceVoice extends du<CopilotMarketplaceVoice, Builder> implements CopilotMarketplaceVoiceOrBuilder {
    private static final CopilotMarketplaceVoice DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LANG_FIELD_NUMBER = 3;
    public static final int LOCALE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<CopilotMarketplaceVoice> PARSER;
    private String id_ = "";
    private String name_ = "";
    private String lang_ = "";
    private String locale_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.CopilotMarketplaceVoice$1, reason: invalid class name */
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
    public final class Builder extends dm<CopilotMarketplaceVoice, Builder> implements CopilotMarketplaceVoiceOrBuilder {
        private Builder() {
            super(CopilotMarketplaceVoice.DEFAULT_INSTANCE);
        }

        public Builder clearId() {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).clearId();
            return this;
        }

        public Builder clearLang() {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).clearLang();
            return this;
        }

        public Builder clearLocale() {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).clearLocale();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).clearName();
            return this;
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public String getId() {
            return ((CopilotMarketplaceVoice) this.instance).getId();
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public v getIdBytes() {
            return ((CopilotMarketplaceVoice) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public String getLang() {
            return ((CopilotMarketplaceVoice) this.instance).getLang();
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public v getLangBytes() {
            return ((CopilotMarketplaceVoice) this.instance).getLangBytes();
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public String getLocale() {
            return ((CopilotMarketplaceVoice) this.instance).getLocale();
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public v getLocaleBytes() {
            return ((CopilotMarketplaceVoice) this.instance).getLocaleBytes();
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public String getName() {
            return ((CopilotMarketplaceVoice) this.instance).getName();
        }

        @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
        public v getNameBytes() {
            return ((CopilotMarketplaceVoice) this.instance).getNameBytes();
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setLang(String str) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setLang(str);
            return this;
        }

        public Builder setLangBytes(v vVar) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setLangBytes(vVar);
            return this;
        }

        public Builder setLocale(String str) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setLocale(str);
            return this;
        }

        public Builder setLocaleBytes(v vVar) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setLocaleBytes(vVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((CopilotMarketplaceVoice) this.instance).setNameBytes(vVar);
            return this;
        }
    }

    static {
        CopilotMarketplaceVoice copilotMarketplaceVoice = new CopilotMarketplaceVoice();
        DEFAULT_INSTANCE = copilotMarketplaceVoice;
        du.registerDefaultInstance(CopilotMarketplaceVoice.class, copilotMarketplaceVoice);
    }

    private CopilotMarketplaceVoice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
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
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static CopilotMarketplaceVoice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CopilotMarketplaceVoice parseDelimitedFrom(InputStream inputStream) {
        return (CopilotMarketplaceVoice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CopilotMarketplaceVoice parseFrom(v vVar) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CopilotMarketplaceVoice> parser() {
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
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"id_", "name_", "lang_", "locale_"});
        }
        if (iOrdinal == 3) {
            return new CopilotMarketplaceVoice();
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
        fo<CopilotMarketplaceVoice> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CopilotMarketplaceVoice.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public String getLang() {
        return this.lang_;
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public v getLangBytes() {
        return v.s(this.lang_);
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public String getLocale() {
        return this.locale_;
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public v getLocaleBytes() {
        return v.s(this.locale_);
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.settings.CopilotMarketplaceVoiceOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    public static Builder newBuilder(CopilotMarketplaceVoice copilotMarketplaceVoice) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(copilotMarketplaceVoice);
    }

    public static CopilotMarketplaceVoice parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CopilotMarketplaceVoice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CopilotMarketplaceVoice parseFrom(v vVar, de deVar) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CopilotMarketplaceVoice parseFrom(z zVar) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CopilotMarketplaceVoice parseFrom(z zVar, de deVar) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CopilotMarketplaceVoice parseFrom(InputStream inputStream) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CopilotMarketplaceVoice parseFrom(InputStream inputStream, de deVar) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CopilotMarketplaceVoice parseFrom(ByteBuffer byteBuffer) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CopilotMarketplaceVoice parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static CopilotMarketplaceVoice parseFrom(byte[] bArr) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CopilotMarketplaceVoice parseFrom(byte[] bArr, de deVar) {
        return (CopilotMarketplaceVoice) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
