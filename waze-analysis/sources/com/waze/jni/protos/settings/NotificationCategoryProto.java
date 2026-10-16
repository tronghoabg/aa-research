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
public final class NotificationCategoryProto extends du<NotificationCategoryProto, Builder> implements NotificationCategoryProtoOrBuilder {
    private static final NotificationCategoryProto DEFAULT_INSTANCE;
    public static final int IS_ENABLED_FIELD_NUMBER = 2;
    public static final int LANGUAGE_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int LANGUAGE_NAME_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<NotificationCategoryProto> PARSER;
    private boolean isEnabled_;
    private String name_ = "";
    private String languageName_ = "";
    private String languageDescription_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.NotificationCategoryProto$1, reason: invalid class name */
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
    public final class Builder extends dm<NotificationCategoryProto, Builder> implements NotificationCategoryProtoOrBuilder {
        private Builder() {
            super(NotificationCategoryProto.DEFAULT_INSTANCE);
        }

        public Builder clearIsEnabled() {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).clearIsEnabled();
            return this;
        }

        public Builder clearLanguageDescription() {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).clearLanguageDescription();
            return this;
        }

        public Builder clearLanguageName() {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).clearLanguageName();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).clearName();
            return this;
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
        public boolean getIsEnabled() {
            return ((NotificationCategoryProto) this.instance).getIsEnabled();
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
        public String getLanguageDescription() {
            return ((NotificationCategoryProto) this.instance).getLanguageDescription();
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
        public v getLanguageDescriptionBytes() {
            return ((NotificationCategoryProto) this.instance).getLanguageDescriptionBytes();
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
        public String getLanguageName() {
            return ((NotificationCategoryProto) this.instance).getLanguageName();
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
        public v getLanguageNameBytes() {
            return ((NotificationCategoryProto) this.instance).getLanguageNameBytes();
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
        public String getName() {
            return ((NotificationCategoryProto) this.instance).getName();
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
        public v getNameBytes() {
            return ((NotificationCategoryProto) this.instance).getNameBytes();
        }

        public Builder setIsEnabled(boolean z) {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).setIsEnabled(z);
            return this;
        }

        public Builder setLanguageDescription(String str) {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).setLanguageDescription(str);
            return this;
        }

        public Builder setLanguageDescriptionBytes(v vVar) {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).setLanguageDescriptionBytes(vVar);
            return this;
        }

        public Builder setLanguageName(String str) {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).setLanguageName(str);
            return this;
        }

        public Builder setLanguageNameBytes(v vVar) {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).setLanguageNameBytes(vVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((NotificationCategoryProto) this.instance).setNameBytes(vVar);
            return this;
        }
    }

    static {
        NotificationCategoryProto notificationCategoryProto = new NotificationCategoryProto();
        DEFAULT_INSTANCE = notificationCategoryProto;
        du.registerDefaultInstance(NotificationCategoryProto.class, notificationCategoryProto);
    }

    private NotificationCategoryProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEnabled() {
        this.isEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageDescription() {
        this.languageDescription_ = getDefaultInstance().getLanguageDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageName() {
        this.languageName_ = getDefaultInstance().getLanguageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static NotificationCategoryProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationCategoryProto parseDelimitedFrom(InputStream inputStream) {
        return (NotificationCategoryProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationCategoryProto parseFrom(v vVar) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NotificationCategoryProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEnabled(boolean z) {
        this.isEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageDescription(String str) {
        Objects.requireNonNull(str);
        this.languageDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageDescriptionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.languageDescription_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageName(String str) {
        Objects.requireNonNull(str);
        this.languageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.languageName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "isEnabled_", "languageName_", "languageDescription_"});
        }
        if (iOrdinal == 3) {
            return new NotificationCategoryProto();
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
        fo<NotificationCategoryProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NotificationCategoryProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
    public boolean getIsEnabled() {
        return this.isEnabled_;
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
    public String getLanguageDescription() {
        return this.languageDescription_;
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
    public v getLanguageDescriptionBytes() {
        return v.s(this.languageDescription_);
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
    public String getLanguageName() {
        return this.languageName_;
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
    public v getLanguageNameBytes() {
        return v.s(this.languageName_);
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryProtoOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    public static Builder newBuilder(NotificationCategoryProto notificationCategoryProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(notificationCategoryProto);
    }

    public static NotificationCategoryProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NotificationCategoryProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationCategoryProto parseFrom(v vVar, de deVar) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NotificationCategoryProto parseFrom(z zVar) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NotificationCategoryProto parseFrom(z zVar, de deVar) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NotificationCategoryProto parseFrom(InputStream inputStream) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationCategoryProto parseFrom(InputStream inputStream, de deVar) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationCategoryProto parseFrom(ByteBuffer byteBuffer) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NotificationCategoryProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NotificationCategoryProto parseFrom(byte[] bArr) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationCategoryProto parseFrom(byte[] bArr, de deVar) {
        return (NotificationCategoryProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
