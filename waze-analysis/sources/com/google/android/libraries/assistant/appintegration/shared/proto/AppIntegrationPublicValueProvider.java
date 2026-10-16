package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AppIntegrationPublicValueProvider {

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider$1, reason: invalid class name */
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
    public interface AppIntegrationDataOrBuilder extends fj {
        int getExperimentIds(int i2);

        int getExperimentIdsCount();

        List<Integer> getExperimentIdsList();

        boolean getIsGrpcSupported();

        boolean getIsTngMorris();

        String getOpaAccount();

        v getOpaAccountBytes();

        String getOpaLanguage();

        v getOpaLanguageBytes();

        boolean getShowAssistantDisclosure();

        String getSupportedFeatures(int i2);

        v getSupportedFeaturesBytes(int i2);

        int getSupportedFeaturesCount();

        List<String> getSupportedFeaturesList();

        int getSupportedVoicePlateModes(int i2);

        int getSupportedVoicePlateModesCount();

        List<Integer> getSupportedVoicePlateModesList();

        boolean hasIsGrpcSupported();

        boolean hasIsTngMorris();

        boolean hasOpaAccount();

        boolean hasOpaLanguage();

        boolean hasShowAssistantDisclosure();
    }

    private AppIntegrationPublicValueProvider() {
    }

    public static void registerAllExtensions(de deVar) {
    }

    /* compiled from: WazeSource */
    public final class AppIntegrationData extends du<AppIntegrationData, Builder> implements AppIntegrationDataOrBuilder {
        private static final AppIntegrationData DEFAULT_INSTANCE;
        public static final int EXPERIMENT_IDS_FIELD_NUMBER = 6;
        public static final int IS_GRPC_SUPPORTED_FIELD_NUMBER = 7;
        public static final int IS_TNG_MORRIS_FIELD_NUMBER = 8;
        public static final int OPA_ACCOUNT_FIELD_NUMBER = 3;
        public static final int OPA_LANGUAGE_FIELD_NUMBER = 2;
        private static volatile fo<AppIntegrationData> PARSER = null;
        public static final int SHOW_ASSISTANT_DISCLOSURE_FIELD_NUMBER = 4;
        public static final int SUPPORTED_FEATURES_FIELD_NUMBER = 5;
        public static final int SUPPORTED_VOICE_PLATE_MODES_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean isGrpcSupported_;
        private boolean isTngMorris_;
        private boolean showAssistantDisclosure_;
        private ek supportedVoicePlateModes_ = emptyIntList();
        private eo<String> supportedFeatures_ = emptyProtobufList();
        private String opaLanguage_ = "";
        private String opaAccount_ = "";
        private ek experimentIds_ = emptyIntList();

        /* compiled from: WazeSource */
        public final class Builder extends dm<AppIntegrationData, Builder> implements AppIntegrationDataOrBuilder {
            private Builder() {
                super(AppIntegrationData.DEFAULT_INSTANCE);
            }

            public Builder addAllExperimentIds(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).addAllExperimentIds(iterable);
                return this;
            }

            public Builder addAllSupportedFeatures(Iterable<String> iterable) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).addAllSupportedFeatures(iterable);
                return this;
            }

            public Builder addAllSupportedVoicePlateModes(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).addAllSupportedVoicePlateModes(iterable);
                return this;
            }

            public Builder addExperimentIds(int i2) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).addExperimentIds(i2);
                return this;
            }

            public Builder addSupportedFeatures(String str) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).addSupportedFeatures(str);
                return this;
            }

            public Builder addSupportedFeaturesBytes(v vVar) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).addSupportedFeaturesBytes(vVar);
                return this;
            }

            public Builder addSupportedVoicePlateModes(int i2) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).addSupportedVoicePlateModes(i2);
                return this;
            }

            public Builder clearExperimentIds() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearExperimentIds();
                return this;
            }

            public Builder clearIsGrpcSupported() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearIsGrpcSupported();
                return this;
            }

            public Builder clearIsTngMorris() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearIsTngMorris();
                return this;
            }

            public Builder clearOpaAccount() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearOpaAccount();
                return this;
            }

            public Builder clearOpaLanguage() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearOpaLanguage();
                return this;
            }

            public Builder clearShowAssistantDisclosure() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearShowAssistantDisclosure();
                return this;
            }

            public Builder clearSupportedFeatures() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearSupportedFeatures();
                return this;
            }

            public Builder clearSupportedVoicePlateModes() {
                copyOnWrite();
                ((AppIntegrationData) this.instance).clearSupportedVoicePlateModes();
                return this;
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public int getExperimentIds(int i2) {
                return ((AppIntegrationData) this.instance).getExperimentIds(i2);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public int getExperimentIdsCount() {
                return ((AppIntegrationData) this.instance).getExperimentIdsCount();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public List<Integer> getExperimentIdsList() {
                return DesugarCollections.unmodifiableList(((AppIntegrationData) this.instance).getExperimentIdsList());
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean getIsGrpcSupported() {
                return ((AppIntegrationData) this.instance).getIsGrpcSupported();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean getIsTngMorris() {
                return ((AppIntegrationData) this.instance).getIsTngMorris();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public String getOpaAccount() {
                return ((AppIntegrationData) this.instance).getOpaAccount();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public v getOpaAccountBytes() {
                return ((AppIntegrationData) this.instance).getOpaAccountBytes();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public String getOpaLanguage() {
                return ((AppIntegrationData) this.instance).getOpaLanguage();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public v getOpaLanguageBytes() {
                return ((AppIntegrationData) this.instance).getOpaLanguageBytes();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean getShowAssistantDisclosure() {
                return ((AppIntegrationData) this.instance).getShowAssistantDisclosure();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public String getSupportedFeatures(int i2) {
                return ((AppIntegrationData) this.instance).getSupportedFeatures(i2);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public v getSupportedFeaturesBytes(int i2) {
                return ((AppIntegrationData) this.instance).getSupportedFeaturesBytes(i2);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public int getSupportedFeaturesCount() {
                return ((AppIntegrationData) this.instance).getSupportedFeaturesCount();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public List<String> getSupportedFeaturesList() {
                return DesugarCollections.unmodifiableList(((AppIntegrationData) this.instance).getSupportedFeaturesList());
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public int getSupportedVoicePlateModes(int i2) {
                return ((AppIntegrationData) this.instance).getSupportedVoicePlateModes(i2);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public int getSupportedVoicePlateModesCount() {
                return ((AppIntegrationData) this.instance).getSupportedVoicePlateModesCount();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public List<Integer> getSupportedVoicePlateModesList() {
                return DesugarCollections.unmodifiableList(((AppIntegrationData) this.instance).getSupportedVoicePlateModesList());
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean hasIsGrpcSupported() {
                return ((AppIntegrationData) this.instance).hasIsGrpcSupported();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean hasIsTngMorris() {
                return ((AppIntegrationData) this.instance).hasIsTngMorris();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean hasOpaAccount() {
                return ((AppIntegrationData) this.instance).hasOpaAccount();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean hasOpaLanguage() {
                return ((AppIntegrationData) this.instance).hasOpaLanguage();
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
            public boolean hasShowAssistantDisclosure() {
                return ((AppIntegrationData) this.instance).hasShowAssistantDisclosure();
            }

            public Builder setExperimentIds(int i2, int i3) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setExperimentIds(i2, i3);
                return this;
            }

            public Builder setIsGrpcSupported(boolean z) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setIsGrpcSupported(z);
                return this;
            }

            public Builder setIsTngMorris(boolean z) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setIsTngMorris(z);
                return this;
            }

            public Builder setOpaAccount(String str) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setOpaAccount(str);
                return this;
            }

            public Builder setOpaAccountBytes(v vVar) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setOpaAccountBytes(vVar);
                return this;
            }

            public Builder setOpaLanguage(String str) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setOpaLanguage(str);
                return this;
            }

            public Builder setOpaLanguageBytes(v vVar) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setOpaLanguageBytes(vVar);
                return this;
            }

            public Builder setShowAssistantDisclosure(boolean z) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setShowAssistantDisclosure(z);
                return this;
            }

            public Builder setSupportedFeatures(int i2, String str) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setSupportedFeatures(i2, str);
                return this;
            }

            public Builder setSupportedVoicePlateModes(int i2, int i3) {
                copyOnWrite();
                ((AppIntegrationData) this.instance).setSupportedVoicePlateModes(i2, i3);
                return this;
            }
        }

        static {
            AppIntegrationData appIntegrationData = new AppIntegrationData();
            DEFAULT_INSTANCE = appIntegrationData;
            du.registerDefaultInstance(AppIntegrationData.class, appIntegrationData);
        }

        private AppIntegrationData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExperimentIds(Iterable<? extends Integer> iterable) {
            ensureExperimentIdsIsMutable();
            c.addAll(iterable, this.experimentIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedFeatures(Iterable<String> iterable) {
            ensureSupportedFeaturesIsMutable();
            c.addAll(iterable, this.supportedFeatures_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedVoicePlateModes(Iterable<? extends Integer> iterable) {
            ensureSupportedVoicePlateModesIsMutable();
            c.addAll(iterable, this.supportedVoicePlateModes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExperimentIds(int i2) {
            ensureExperimentIdsIsMutable();
            this.experimentIds_.i(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedFeatures(String str) {
            Objects.requireNonNull(str);
            ensureSupportedFeaturesIsMutable();
            this.supportedFeatures_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedFeaturesBytes(v vVar) {
            ensureSupportedFeaturesIsMutable();
            this.supportedFeatures_.add(vVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedVoicePlateModes(int i2) {
            ensureSupportedVoicePlateModesIsMutable();
            this.supportedVoicePlateModes_.i(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentIds() {
            this.experimentIds_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsGrpcSupported() {
            this.bitField0_ &= -9;
            this.isGrpcSupported_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsTngMorris() {
            this.bitField0_ &= -17;
            this.isTngMorris_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpaAccount() {
            this.bitField0_ &= -3;
            this.opaAccount_ = getDefaultInstance().getOpaAccount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpaLanguage() {
            this.bitField0_ &= -2;
            this.opaLanguage_ = getDefaultInstance().getOpaLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowAssistantDisclosure() {
            this.bitField0_ &= -5;
            this.showAssistantDisclosure_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportedFeatures() {
            this.supportedFeatures_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportedVoicePlateModes() {
            this.supportedVoicePlateModes_ = emptyIntList();
        }

        private void ensureExperimentIdsIsMutable() {
            ek ekVar = this.experimentIds_;
            if (ekVar.c()) {
                return;
            }
            this.experimentIds_ = du.mutableCopy(ekVar);
        }

        private void ensureSupportedFeaturesIsMutable() {
            eo<String> eoVar = this.supportedFeatures_;
            if (eoVar.c()) {
                return;
            }
            this.supportedFeatures_ = du.mutableCopy(eoVar);
        }

        private void ensureSupportedVoicePlateModesIsMutable() {
            ek ekVar = this.supportedVoicePlateModes_;
            if (ekVar.c()) {
                return;
            }
            this.supportedVoicePlateModes_ = du.mutableCopy(ekVar);
        }

        public static AppIntegrationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AppIntegrationData parseDelimitedFrom(InputStream inputStream) {
            return (AppIntegrationData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppIntegrationData parseFrom(v vVar) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<AppIntegrationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentIds(int i2, int i3) {
            ensureExperimentIdsIsMutable();
            this.experimentIds_.e(i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsGrpcSupported(boolean z) {
            this.bitField0_ |= 8;
            this.isGrpcSupported_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsTngMorris(boolean z) {
            this.bitField0_ |= 16;
            this.isTngMorris_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpaAccount(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 2;
            this.opaAccount_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpaAccountBytes(v vVar) {
            this.opaAccount_ = vVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpaLanguage(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.opaLanguage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpaLanguageBytes(v vVar) {
            this.opaLanguage_ = vVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowAssistantDisclosure(boolean z) {
            this.bitField0_ |= 4;
            this.showAssistantDisclosure_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedFeatures(int i2, String str) {
            Objects.requireNonNull(str);
            ensureSupportedFeaturesIsMutable();
            this.supportedFeatures_.set(i2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedVoicePlateModes(int i2, int i3) {
            ensureSupportedVoicePlateModesIsMutable();
            this.supportedVoicePlateModes_.e(i2, i3);
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0016\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002\u0005\u001a\u0006\u0016\u0007ဇ\u0003\bဇ\u0004", new Object[]{"bitField0_", "supportedVoicePlateModes_", "opaLanguage_", "opaAccount_", "showAssistantDisclosure_", "supportedFeatures_", "experimentIds_", "isGrpcSupported_", "isTngMorris_"});
            }
            if (iOrdinal == 3) {
                return new AppIntegrationData();
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
            fo<AppIntegrationData> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (AppIntegrationData.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public int getExperimentIds(int i2) {
            return this.experimentIds_.d(i2);
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public int getExperimentIdsCount() {
            return this.experimentIds_.size();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public List<Integer> getExperimentIdsList() {
            return this.experimentIds_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean getIsGrpcSupported() {
            return this.isGrpcSupported_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean getIsTngMorris() {
            return this.isTngMorris_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public String getOpaAccount() {
            return this.opaAccount_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public v getOpaAccountBytes() {
            return v.s(this.opaAccount_);
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public String getOpaLanguage() {
            return this.opaLanguage_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public v getOpaLanguageBytes() {
            return v.s(this.opaLanguage_);
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean getShowAssistantDisclosure() {
            return this.showAssistantDisclosure_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public String getSupportedFeatures(int i2) {
            return this.supportedFeatures_.get(i2);
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public v getSupportedFeaturesBytes(int i2) {
            return v.s(this.supportedFeatures_.get(i2));
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public int getSupportedFeaturesCount() {
            return this.supportedFeatures_.size();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public List<String> getSupportedFeaturesList() {
            return this.supportedFeatures_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public int getSupportedVoicePlateModes(int i2) {
            return this.supportedVoicePlateModes_.d(i2);
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public int getSupportedVoicePlateModesCount() {
            return this.supportedVoicePlateModes_.size();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public List<Integer> getSupportedVoicePlateModesList() {
            return this.supportedVoicePlateModes_;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean hasIsGrpcSupported() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean hasIsTngMorris() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean hasOpaAccount() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean hasOpaLanguage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider.AppIntegrationDataOrBuilder
        public boolean hasShowAssistantDisclosure() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(AppIntegrationData appIntegrationData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(appIntegrationData);
        }

        public static AppIntegrationData parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (AppIntegrationData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static AppIntegrationData parseFrom(v vVar, de deVar) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static AppIntegrationData parseFrom(z zVar) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static AppIntegrationData parseFrom(z zVar, de deVar) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static AppIntegrationData parseFrom(InputStream inputStream) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppIntegrationData parseFrom(InputStream inputStream, de deVar) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static AppIntegrationData parseFrom(ByteBuffer byteBuffer) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AppIntegrationData parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static AppIntegrationData parseFrom(byte[] bArr) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppIntegrationData parseFrom(byte[] bArr, de deVar) {
            return (AppIntegrationData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }
}
