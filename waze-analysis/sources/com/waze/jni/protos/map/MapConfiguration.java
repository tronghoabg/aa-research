package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapConfiguration extends du<MapConfiguration, Builder> implements MapConfigurationOrBuilder {
    public static final int CAMERA_FIELD_NUMBER = 1;
    private static final MapConfiguration DEFAULT_INSTANCE;
    private static volatile fo<MapConfiguration> PARSER;
    private int bitField0_;
    private CameraConfiguration camera_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapConfiguration$1, reason: invalid class name */
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
    public interface CameraConfigurationOrBuilder extends fj {
        boolean getHandleTouches();
    }

    static {
        MapConfiguration mapConfiguration = new MapConfiguration();
        DEFAULT_INSTANCE = mapConfiguration;
        du.registerDefaultInstance(MapConfiguration.class, mapConfiguration);
    }

    private MapConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCamera() {
        this.camera_ = null;
        this.bitField0_ &= -2;
    }

    public static MapConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCamera(CameraConfiguration cameraConfiguration) {
        Objects.requireNonNull(cameraConfiguration);
        CameraConfiguration cameraConfiguration2 = this.camera_;
        if (cameraConfiguration2 != null && cameraConfiguration2 != CameraConfiguration.getDefaultInstance()) {
            CameraConfiguration.Builder builderNewBuilder = CameraConfiguration.newBuilder(cameraConfiguration2);
            builderNewBuilder.mergeFrom((CameraConfiguration.Builder) cameraConfiguration);
            cameraConfiguration = builderNewBuilder.buildPartial();
        }
        this.camera_ = cameraConfiguration;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (MapConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapConfiguration parseFrom(v vVar) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCamera(CameraConfiguration cameraConfiguration) {
        Objects.requireNonNull(cameraConfiguration);
        this.camera_ = cameraConfiguration;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "camera_"});
        }
        if (iOrdinal == 3) {
            return new MapConfiguration();
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
        fo<MapConfiguration> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapConfiguration.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapConfigurationOrBuilder
    public CameraConfiguration getCamera() {
        CameraConfiguration cameraConfiguration = this.camera_;
        return cameraConfiguration == null ? CameraConfiguration.getDefaultInstance() : cameraConfiguration;
    }

    @Override // com.waze.jni.protos.map.MapConfigurationOrBuilder
    public boolean hasCamera() {
        return (this.bitField0_ & 1) != 0;
    }

    /* compiled from: WazeSource */
    public final class CameraConfiguration extends du<CameraConfiguration, Builder> implements CameraConfigurationOrBuilder {
        private static final CameraConfiguration DEFAULT_INSTANCE;
        public static final int HANDLE_TOUCHES_FIELD_NUMBER = 1;
        private static volatile fo<CameraConfiguration> PARSER;
        private boolean handleTouches_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<CameraConfiguration, Builder> implements CameraConfigurationOrBuilder {
            private Builder() {
                super(CameraConfiguration.DEFAULT_INSTANCE);
            }

            public Builder clearHandleTouches() {
                copyOnWrite();
                ((CameraConfiguration) this.instance).clearHandleTouches();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapConfiguration.CameraConfigurationOrBuilder
            public boolean getHandleTouches() {
                return ((CameraConfiguration) this.instance).getHandleTouches();
            }

            public Builder setHandleTouches(boolean z) {
                copyOnWrite();
                ((CameraConfiguration) this.instance).setHandleTouches(z);
                return this;
            }
        }

        static {
            CameraConfiguration cameraConfiguration = new CameraConfiguration();
            DEFAULT_INSTANCE = cameraConfiguration;
            du.registerDefaultInstance(CameraConfiguration.class, cameraConfiguration);
        }

        private CameraConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHandleTouches() {
            this.handleTouches_ = false;
        }

        public static CameraConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CameraConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (CameraConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraConfiguration parseFrom(v vVar) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<CameraConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHandleTouches(boolean z) {
            this.handleTouches_ = z;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"handleTouches_"});
            }
            if (iOrdinal == 3) {
                return new CameraConfiguration();
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
            fo<CameraConfiguration> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (CameraConfiguration.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapConfiguration.CameraConfigurationOrBuilder
        public boolean getHandleTouches() {
            return this.handleTouches_;
        }

        public static Builder newBuilder(CameraConfiguration cameraConfiguration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cameraConfiguration);
        }

        public static CameraConfiguration parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (CameraConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static CameraConfiguration parseFrom(v vVar, de deVar) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static CameraConfiguration parseFrom(z zVar) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static CameraConfiguration parseFrom(z zVar, de deVar) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static CameraConfiguration parseFrom(InputStream inputStream) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CameraConfiguration parseFrom(InputStream inputStream, de deVar) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static CameraConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CameraConfiguration parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static CameraConfiguration parseFrom(byte[] bArr) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CameraConfiguration parseFrom(byte[] bArr, de deVar) {
            return (CameraConfiguration) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(MapConfiguration mapConfiguration) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapConfiguration);
    }

    public static MapConfiguration parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapConfiguration parseFrom(v vVar, de deVar) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapConfiguration parseFrom(z zVar) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapConfiguration parseFrom(z zVar, de deVar) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapConfiguration parseFrom(InputStream inputStream) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapConfiguration parseFrom(InputStream inputStream, de deVar) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapConfiguration parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapConfiguration, Builder> implements MapConfigurationOrBuilder {
        private Builder() {
            super(MapConfiguration.DEFAULT_INSTANCE);
        }

        public Builder clearCamera() {
            copyOnWrite();
            ((MapConfiguration) this.instance).clearCamera();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapConfigurationOrBuilder
        public CameraConfiguration getCamera() {
            return ((MapConfiguration) this.instance).getCamera();
        }

        @Override // com.waze.jni.protos.map.MapConfigurationOrBuilder
        public boolean hasCamera() {
            return ((MapConfiguration) this.instance).hasCamera();
        }

        public Builder mergeCamera(CameraConfiguration cameraConfiguration) {
            copyOnWrite();
            ((MapConfiguration) this.instance).mergeCamera(cameraConfiguration);
            return this;
        }

        public Builder setCamera(CameraConfiguration.Builder builder) {
            copyOnWrite();
            ((MapConfiguration) this.instance).setCamera(builder.build());
            return this;
        }

        public Builder setCamera(CameraConfiguration cameraConfiguration) {
            copyOnWrite();
            ((MapConfiguration) this.instance).setCamera(cameraConfiguration);
            return this;
        }
    }

    public static MapConfiguration parseFrom(byte[] bArr) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapConfiguration parseFrom(byte[] bArr, de deVar) {
        return (MapConfiguration) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
