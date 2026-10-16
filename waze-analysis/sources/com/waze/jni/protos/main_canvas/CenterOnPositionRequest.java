package com.waze.jni.protos.main_canvas;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CenterOnPositionRequest extends du<CenterOnPositionRequest, Builder> implements CenterOnPositionRequestOrBuilder {
    public static final int ANIMATED_FIELD_NUMBER = 3;
    private static final CenterOnPositionRequest DEFAULT_INSTANCE;
    public static final int ORIENTATION_DEGREES_FIELD_NUMBER = 4;
    private static volatile fo<CenterOnPositionRequest> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int ZOOM_FIELD_NUMBER = 2;
    private boolean animated_;
    private int bitField0_;
    private float orientationDegrees_;
    private Position.IntPosition position_;
    private float zoom_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.main_canvas.CenterOnPositionRequest$1, reason: invalid class name */
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

    static {
        CenterOnPositionRequest centerOnPositionRequest = new CenterOnPositionRequest();
        DEFAULT_INSTANCE = centerOnPositionRequest;
        du.registerDefaultInstance(CenterOnPositionRequest.class, centerOnPositionRequest);
    }

    private CenterOnPositionRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimated() {
        this.animated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrientationDegrees() {
        this.bitField0_ &= -3;
        this.orientationDegrees_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZoom() {
        this.zoom_ = 0.0f;
    }

    public static CenterOnPositionRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.position_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CenterOnPositionRequest parseDelimitedFrom(InputStream inputStream) {
        return (CenterOnPositionRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CenterOnPositionRequest parseFrom(v vVar) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CenterOnPositionRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimated(boolean z) {
        this.animated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientationDegrees(float f2) {
        this.bitField0_ |= 2;
        this.orientationDegrees_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoom(float f2) {
        this.zoom_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0001\u0003\u0007\u0004ခ\u0001", new Object[]{"bitField0_", "position_", "zoom_", "animated_", "orientationDegrees_"});
        }
        if (iOrdinal == 3) {
            return new CenterOnPositionRequest();
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
        fo<CenterOnPositionRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CenterOnPositionRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
    public boolean getAnimated() {
        return this.animated_;
    }

    @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
    public float getOrientationDegrees() {
        return this.orientationDegrees_;
    }

    @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
    public float getZoom() {
        return this.zoom_;
    }

    @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
    public boolean hasOrientationDegrees() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(CenterOnPositionRequest centerOnPositionRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(centerOnPositionRequest);
    }

    public static CenterOnPositionRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CenterOnPositionRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CenterOnPositionRequest parseFrom(v vVar, de deVar) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CenterOnPositionRequest parseFrom(z zVar) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CenterOnPositionRequest parseFrom(z zVar, de deVar) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CenterOnPositionRequest parseFrom(InputStream inputStream) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CenterOnPositionRequest parseFrom(InputStream inputStream, de deVar) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CenterOnPositionRequest parseFrom(ByteBuffer byteBuffer) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CenterOnPositionRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<CenterOnPositionRequest, Builder> implements CenterOnPositionRequestOrBuilder {
        private Builder() {
            super(CenterOnPositionRequest.DEFAULT_INSTANCE);
        }

        public Builder clearAnimated() {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).clearAnimated();
            return this;
        }

        public Builder clearOrientationDegrees() {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).clearOrientationDegrees();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).clearPosition();
            return this;
        }

        public Builder clearZoom() {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).clearZoom();
            return this;
        }

        @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
        public boolean getAnimated() {
            return ((CenterOnPositionRequest) this.instance).getAnimated();
        }

        @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
        public float getOrientationDegrees() {
            return ((CenterOnPositionRequest) this.instance).getOrientationDegrees();
        }

        @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
        public Position.IntPosition getPosition() {
            return ((CenterOnPositionRequest) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
        public float getZoom() {
            return ((CenterOnPositionRequest) this.instance).getZoom();
        }

        @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
        public boolean hasOrientationDegrees() {
            return ((CenterOnPositionRequest) this.instance).hasOrientationDegrees();
        }

        @Override // com.waze.jni.protos.main_canvas.CenterOnPositionRequestOrBuilder
        public boolean hasPosition() {
            return ((CenterOnPositionRequest) this.instance).hasPosition();
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setAnimated(boolean z) {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).setAnimated(z);
            return this;
        }

        public Builder setOrientationDegrees(float f2) {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).setOrientationDegrees(f2);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setZoom(float f2) {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).setZoom(f2);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((CenterOnPositionRequest) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static CenterOnPositionRequest parseFrom(byte[] bArr) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CenterOnPositionRequest parseFrom(byte[] bArr, de deVar) {
        return (CenterOnPositionRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
