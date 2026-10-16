package com.waze.jni.protos.modules.navigation;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
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
/* loaded from: classes6.dex */
public final class AlternativeHovRouteInfo extends du<AlternativeHovRouteInfo, Builder> implements AlternativeHovRouteInfoOrBuilder {
    private static final AlternativeHovRouteInfo DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 1;
    public static final int HOV_INFO_FIELD_NUMBER = 2;
    private static volatile fo<AlternativeHovRouteInfo> PARSER;
    private int bitField0_;
    private int durationSeconds_;
    private HovInfo hovInfo_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo$1, reason: invalid class name */
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
    public interface HovInfoOrBuilder extends fj {
        int getMinPassengers();

        String getRequiredPermits(int i2);

        v getRequiredPermitsBytes(int i2);

        int getRequiredPermitsCount();

        List<String> getRequiredPermitsList();
    }

    static {
        AlternativeHovRouteInfo alternativeHovRouteInfo = new AlternativeHovRouteInfo();
        DEFAULT_INSTANCE = alternativeHovRouteInfo;
        du.registerDefaultInstance(AlternativeHovRouteInfo.class, alternativeHovRouteInfo);
    }

    private AlternativeHovRouteInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationSeconds() {
        this.durationSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovInfo() {
        this.hovInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static AlternativeHovRouteInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovInfo(HovInfo hovInfo) {
        Objects.requireNonNull(hovInfo);
        HovInfo hovInfo2 = this.hovInfo_;
        if (hovInfo2 != null && hovInfo2 != HovInfo.getDefaultInstance()) {
            HovInfo.Builder builderNewBuilder = HovInfo.newBuilder(hovInfo2);
            builderNewBuilder.mergeFrom((HovInfo.Builder) hovInfo);
            hovInfo = builderNewBuilder.buildPartial();
        }
        this.hovInfo_ = hovInfo;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlternativeHovRouteInfo parseDelimitedFrom(InputStream inputStream) {
        return (AlternativeHovRouteInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlternativeHovRouteInfo parseFrom(v vVar) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AlternativeHovRouteInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationSeconds(int i2) {
        this.durationSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovInfo(HovInfo hovInfo) {
        Objects.requireNonNull(hovInfo);
        this.hovInfo_ = hovInfo;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"bitField0_", "durationSeconds_", "hovInfo_"});
        }
        if (iOrdinal == 3) {
            return new AlternativeHovRouteInfo();
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
        fo<AlternativeHovRouteInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AlternativeHovRouteInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfoOrBuilder
    public int getDurationSeconds() {
        return this.durationSeconds_;
    }

    @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfoOrBuilder
    public HovInfo getHovInfo() {
        HovInfo hovInfo = this.hovInfo_;
        return hovInfo == null ? HovInfo.getDefaultInstance() : hovInfo;
    }

    @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfoOrBuilder
    public boolean hasHovInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    /* compiled from: WazeSource */
    public final class HovInfo extends du<HovInfo, Builder> implements HovInfoOrBuilder {
        private static final HovInfo DEFAULT_INSTANCE;
        public static final int MIN_PASSENGERS_FIELD_NUMBER = 1;
        private static volatile fo<HovInfo> PARSER = null;
        public static final int REQUIRED_PERMITS_FIELD_NUMBER = 2;
        private int minPassengers_;
        private eo<String> requiredPermits_ = emptyProtobufList();

        /* compiled from: WazeSource */
        public final class Builder extends dm<HovInfo, Builder> implements HovInfoOrBuilder {
            private Builder() {
                super(HovInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllRequiredPermits(Iterable<String> iterable) {
                copyOnWrite();
                ((HovInfo) this.instance).addAllRequiredPermits(iterable);
                return this;
            }

            public Builder addRequiredPermits(String str) {
                copyOnWrite();
                ((HovInfo) this.instance).addRequiredPermits(str);
                return this;
            }

            public Builder addRequiredPermitsBytes(v vVar) {
                copyOnWrite();
                ((HovInfo) this.instance).addRequiredPermitsBytes(vVar);
                return this;
            }

            public Builder clearMinPassengers() {
                copyOnWrite();
                ((HovInfo) this.instance).clearMinPassengers();
                return this;
            }

            public Builder clearRequiredPermits() {
                copyOnWrite();
                ((HovInfo) this.instance).clearRequiredPermits();
                return this;
            }

            @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
            public int getMinPassengers() {
                return ((HovInfo) this.instance).getMinPassengers();
            }

            @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
            public String getRequiredPermits(int i2) {
                return ((HovInfo) this.instance).getRequiredPermits(i2);
            }

            @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
            public v getRequiredPermitsBytes(int i2) {
                return ((HovInfo) this.instance).getRequiredPermitsBytes(i2);
            }

            @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
            public int getRequiredPermitsCount() {
                return ((HovInfo) this.instance).getRequiredPermitsCount();
            }

            @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
            public List<String> getRequiredPermitsList() {
                return DesugarCollections.unmodifiableList(((HovInfo) this.instance).getRequiredPermitsList());
            }

            public Builder setMinPassengers(int i2) {
                copyOnWrite();
                ((HovInfo) this.instance).setMinPassengers(i2);
                return this;
            }

            public Builder setRequiredPermits(int i2, String str) {
                copyOnWrite();
                ((HovInfo) this.instance).setRequiredPermits(i2, str);
                return this;
            }
        }

        static {
            HovInfo hovInfo = new HovInfo();
            DEFAULT_INSTANCE = hovInfo;
            du.registerDefaultInstance(HovInfo.class, hovInfo);
        }

        private HovInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRequiredPermits(Iterable<String> iterable) {
            ensureRequiredPermitsIsMutable();
            c.addAll(iterable, this.requiredPermits_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequiredPermits(String str) {
            Objects.requireNonNull(str);
            ensureRequiredPermitsIsMutable();
            this.requiredPermits_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequiredPermitsBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            ensureRequiredPermitsIsMutable();
            this.requiredPermits_.add(vVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinPassengers() {
            this.minPassengers_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequiredPermits() {
            this.requiredPermits_ = emptyProtobufList();
        }

        private void ensureRequiredPermitsIsMutable() {
            eo<String> eoVar = this.requiredPermits_;
            if (eoVar.c()) {
                return;
            }
            this.requiredPermits_ = du.mutableCopy(eoVar);
        }

        public static HovInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HovInfo parseDelimitedFrom(InputStream inputStream) {
            return (HovInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HovInfo parseFrom(v vVar) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<HovInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinPassengers(int i2) {
            this.minPassengers_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequiredPermits(int i2, String str) {
            Objects.requireNonNull(str);
            ensureRequiredPermitsIsMutable();
            this.requiredPermits_.set(i2, str);
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002Ț", new Object[]{"minPassengers_", "requiredPermits_"});
            }
            if (iOrdinal == 3) {
                return new HovInfo();
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
            fo<HovInfo> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (HovInfo.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
        public int getMinPassengers() {
            return this.minPassengers_;
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
        public String getRequiredPermits(int i2) {
            return this.requiredPermits_.get(i2);
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
        public v getRequiredPermitsBytes(int i2) {
            return v.s(this.requiredPermits_.get(i2));
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
        public int getRequiredPermitsCount() {
            return this.requiredPermits_.size();
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo.HovInfoOrBuilder
        public List<String> getRequiredPermitsList() {
            return this.requiredPermits_;
        }

        public static Builder newBuilder(HovInfo hovInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(hovInfo);
        }

        public static HovInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (HovInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static HovInfo parseFrom(v vVar, de deVar) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static HovInfo parseFrom(z zVar) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static HovInfo parseFrom(z zVar, de deVar) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static HovInfo parseFrom(InputStream inputStream) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HovInfo parseFrom(InputStream inputStream, de deVar) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static HovInfo parseFrom(ByteBuffer byteBuffer) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HovInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static HovInfo parseFrom(byte[] bArr) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HovInfo parseFrom(byte[] bArr, de deVar) {
            return (HovInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(AlternativeHovRouteInfo alternativeHovRouteInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(alternativeHovRouteInfo);
    }

    public static AlternativeHovRouteInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AlternativeHovRouteInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlternativeHovRouteInfo parseFrom(v vVar, de deVar) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AlternativeHovRouteInfo parseFrom(z zVar) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AlternativeHovRouteInfo parseFrom(z zVar, de deVar) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AlternativeHovRouteInfo parseFrom(InputStream inputStream) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlternativeHovRouteInfo parseFrom(InputStream inputStream, de deVar) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlternativeHovRouteInfo parseFrom(ByteBuffer byteBuffer) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AlternativeHovRouteInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<AlternativeHovRouteInfo, Builder> implements AlternativeHovRouteInfoOrBuilder {
        private Builder() {
            super(AlternativeHovRouteInfo.DEFAULT_INSTANCE);
        }

        public Builder clearDurationSeconds() {
            copyOnWrite();
            ((AlternativeHovRouteInfo) this.instance).clearDurationSeconds();
            return this;
        }

        public Builder clearHovInfo() {
            copyOnWrite();
            ((AlternativeHovRouteInfo) this.instance).clearHovInfo();
            return this;
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfoOrBuilder
        public int getDurationSeconds() {
            return ((AlternativeHovRouteInfo) this.instance).getDurationSeconds();
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfoOrBuilder
        public HovInfo getHovInfo() {
            return ((AlternativeHovRouteInfo) this.instance).getHovInfo();
        }

        @Override // com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfoOrBuilder
        public boolean hasHovInfo() {
            return ((AlternativeHovRouteInfo) this.instance).hasHovInfo();
        }

        public Builder mergeHovInfo(HovInfo hovInfo) {
            copyOnWrite();
            ((AlternativeHovRouteInfo) this.instance).mergeHovInfo(hovInfo);
            return this;
        }

        public Builder setDurationSeconds(int i2) {
            copyOnWrite();
            ((AlternativeHovRouteInfo) this.instance).setDurationSeconds(i2);
            return this;
        }

        public Builder setHovInfo(HovInfo.Builder builder) {
            copyOnWrite();
            ((AlternativeHovRouteInfo) this.instance).setHovInfo(builder.build());
            return this;
        }

        public Builder setHovInfo(HovInfo hovInfo) {
            copyOnWrite();
            ((AlternativeHovRouteInfo) this.instance).setHovInfo(hovInfo);
            return this;
        }
    }

    public static AlternativeHovRouteInfo parseFrom(byte[] bArr) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlternativeHovRouteInfo parseFrom(byte[] bArr, de deVar) {
        return (AlternativeHovRouteInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
