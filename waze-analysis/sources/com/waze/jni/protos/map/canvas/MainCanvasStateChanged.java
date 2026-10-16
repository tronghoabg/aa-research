package com.waze.jni.protos.map.canvas;

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
public final class MainCanvasStateChanged extends du<MainCanvasStateChanged, Builder> implements MainCanvasStateChangedOrBuilder {
    public static final int CAMERA_STATE_FIELD_NUMBER = 2;
    public static final int CANVAS_ID_FIELD_NUMBER = 1;
    private static final MainCanvasStateChanged DEFAULT_INSTANCE;
    private static volatile fo<MainCanvasStateChanged> PARSER;
    private int cameraState_;
    private String canvasId_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.canvas.MainCanvasStateChanged$1, reason: invalid class name */
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
    public final class Builder extends dm<MainCanvasStateChanged, Builder> implements MainCanvasStateChangedOrBuilder {
        private Builder() {
            super(MainCanvasStateChanged.DEFAULT_INSTANCE);
        }

        public Builder clearCameraState() {
            copyOnWrite();
            ((MainCanvasStateChanged) this.instance).clearCameraState();
            return this;
        }

        public Builder clearCanvasId() {
            copyOnWrite();
            ((MainCanvasStateChanged) this.instance).clearCanvasId();
            return this;
        }

        @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
        public MainCanvasCameraStateProto getCameraState() {
            return ((MainCanvasStateChanged) this.instance).getCameraState();
        }

        @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
        public int getCameraStateValue() {
            return ((MainCanvasStateChanged) this.instance).getCameraStateValue();
        }

        @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
        public String getCanvasId() {
            return ((MainCanvasStateChanged) this.instance).getCanvasId();
        }

        @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
        public v getCanvasIdBytes() {
            return ((MainCanvasStateChanged) this.instance).getCanvasIdBytes();
        }

        public Builder setCameraState(MainCanvasCameraStateProto mainCanvasCameraStateProto) {
            copyOnWrite();
            ((MainCanvasStateChanged) this.instance).setCameraState(mainCanvasCameraStateProto);
            return this;
        }

        public Builder setCameraStateValue(int i2) {
            copyOnWrite();
            ((MainCanvasStateChanged) this.instance).setCameraStateValue(i2);
            return this;
        }

        public Builder setCanvasId(String str) {
            copyOnWrite();
            ((MainCanvasStateChanged) this.instance).setCanvasId(str);
            return this;
        }

        public Builder setCanvasIdBytes(v vVar) {
            copyOnWrite();
            ((MainCanvasStateChanged) this.instance).setCanvasIdBytes(vVar);
            return this;
        }
    }

    static {
        MainCanvasStateChanged mainCanvasStateChanged = new MainCanvasStateChanged();
        DEFAULT_INSTANCE = mainCanvasStateChanged;
        du.registerDefaultInstance(MainCanvasStateChanged.class, mainCanvasStateChanged);
    }

    private MainCanvasStateChanged() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCameraState() {
        this.cameraState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanvasId() {
        this.canvasId_ = getDefaultInstance().getCanvasId();
    }

    public static MainCanvasStateChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MainCanvasStateChanged parseDelimitedFrom(InputStream inputStream) {
        return (MainCanvasStateChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainCanvasStateChanged parseFrom(v vVar) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MainCanvasStateChanged> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCameraState(MainCanvasCameraStateProto mainCanvasCameraStateProto) {
        this.cameraState_ = mainCanvasCameraStateProto.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCameraStateValue(int i2) {
        this.cameraState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanvasId(String str) {
        Objects.requireNonNull(str);
        this.canvasId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanvasIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.canvasId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"canvasId_", "cameraState_"});
        }
        if (iOrdinal == 3) {
            return new MainCanvasStateChanged();
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
        fo<MainCanvasStateChanged> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MainCanvasStateChanged.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
    public MainCanvasCameraStateProto getCameraState() {
        MainCanvasCameraStateProto mainCanvasCameraStateProtoForNumber = MainCanvasCameraStateProto.forNumber(this.cameraState_);
        return mainCanvasCameraStateProtoForNumber == null ? MainCanvasCameraStateProto.UNRECOGNIZED : mainCanvasCameraStateProtoForNumber;
    }

    @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
    public int getCameraStateValue() {
        return this.cameraState_;
    }

    @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
    public String getCanvasId() {
        return this.canvasId_;
    }

    @Override // com.waze.jni.protos.map.canvas.MainCanvasStateChangedOrBuilder
    public v getCanvasIdBytes() {
        return v.s(this.canvasId_);
    }

    public static Builder newBuilder(MainCanvasStateChanged mainCanvasStateChanged) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mainCanvasStateChanged);
    }

    public static MainCanvasStateChanged parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MainCanvasStateChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MainCanvasStateChanged parseFrom(v vVar, de deVar) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MainCanvasStateChanged parseFrom(z zVar) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MainCanvasStateChanged parseFrom(z zVar, de deVar) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MainCanvasStateChanged parseFrom(InputStream inputStream) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainCanvasStateChanged parseFrom(InputStream inputStream, de deVar) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MainCanvasStateChanged parseFrom(ByteBuffer byteBuffer) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MainCanvasStateChanged parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static MainCanvasStateChanged parseFrom(byte[] bArr) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MainCanvasStateChanged parseFrom(byte[] bArr, de deVar) {
        return (MainCanvasStateChanged) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
