package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ZoomLevelDisplayRange extends du<ZoomLevelDisplayRange, Builder> implements ZoomLevelDisplayRangeOrBuilder {
    private static final ZoomLevelDisplayRange DEFAULT_INSTANCE;
    public static final int MAX_ZOOM_LEVEL_FIELD_NUMBER = 2;
    public static final int MIN_ZOOM_LEVEL_FIELD_NUMBER = 1;
    private static volatile fo<ZoomLevelDisplayRange> PARSER;
    private float maxZoomLevel_;
    private float minZoomLevel_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.ZoomLevelDisplayRange$1, reason: invalid class name */
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
    public final class Builder extends dm<ZoomLevelDisplayRange, Builder> implements ZoomLevelDisplayRangeOrBuilder {
        private Builder() {
            super(ZoomLevelDisplayRange.DEFAULT_INSTANCE);
        }

        public Builder clearMaxZoomLevel() {
            copyOnWrite();
            ((ZoomLevelDisplayRange) this.instance).clearMaxZoomLevel();
            return this;
        }

        public Builder clearMinZoomLevel() {
            copyOnWrite();
            ((ZoomLevelDisplayRange) this.instance).clearMinZoomLevel();
            return this;
        }

        @Override // com.waze.jni.protos.map.ZoomLevelDisplayRangeOrBuilder
        public float getMaxZoomLevel() {
            return ((ZoomLevelDisplayRange) this.instance).getMaxZoomLevel();
        }

        @Override // com.waze.jni.protos.map.ZoomLevelDisplayRangeOrBuilder
        public float getMinZoomLevel() {
            return ((ZoomLevelDisplayRange) this.instance).getMinZoomLevel();
        }

        public Builder setMaxZoomLevel(float f2) {
            copyOnWrite();
            ((ZoomLevelDisplayRange) this.instance).setMaxZoomLevel(f2);
            return this;
        }

        public Builder setMinZoomLevel(float f2) {
            copyOnWrite();
            ((ZoomLevelDisplayRange) this.instance).setMinZoomLevel(f2);
            return this;
        }
    }

    static {
        ZoomLevelDisplayRange zoomLevelDisplayRange = new ZoomLevelDisplayRange();
        DEFAULT_INSTANCE = zoomLevelDisplayRange;
        du.registerDefaultInstance(ZoomLevelDisplayRange.class, zoomLevelDisplayRange);
    }

    private ZoomLevelDisplayRange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxZoomLevel() {
        this.maxZoomLevel_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinZoomLevel() {
        this.minZoomLevel_ = 0.0f;
    }

    public static ZoomLevelDisplayRange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ZoomLevelDisplayRange parseDelimitedFrom(InputStream inputStream) {
        return (ZoomLevelDisplayRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ZoomLevelDisplayRange parseFrom(v vVar) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ZoomLevelDisplayRange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxZoomLevel(float f2) {
        this.maxZoomLevel_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinZoomLevel(float f2) {
        this.minZoomLevel_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"minZoomLevel_", "maxZoomLevel_"});
        }
        if (iOrdinal == 3) {
            return new ZoomLevelDisplayRange();
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
        fo<ZoomLevelDisplayRange> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ZoomLevelDisplayRange.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.ZoomLevelDisplayRangeOrBuilder
    public float getMaxZoomLevel() {
        return this.maxZoomLevel_;
    }

    @Override // com.waze.jni.protos.map.ZoomLevelDisplayRangeOrBuilder
    public float getMinZoomLevel() {
        return this.minZoomLevel_;
    }

    public static Builder newBuilder(ZoomLevelDisplayRange zoomLevelDisplayRange) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(zoomLevelDisplayRange);
    }

    public static ZoomLevelDisplayRange parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ZoomLevelDisplayRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ZoomLevelDisplayRange parseFrom(v vVar, de deVar) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ZoomLevelDisplayRange parseFrom(z zVar) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ZoomLevelDisplayRange parseFrom(z zVar, de deVar) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ZoomLevelDisplayRange parseFrom(InputStream inputStream) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ZoomLevelDisplayRange parseFrom(InputStream inputStream, de deVar) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ZoomLevelDisplayRange parseFrom(ByteBuffer byteBuffer) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ZoomLevelDisplayRange parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ZoomLevelDisplayRange parseFrom(byte[] bArr) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ZoomLevelDisplayRange parseFrom(byte[] bArr, de deVar) {
        return (ZoomLevelDisplayRange) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
