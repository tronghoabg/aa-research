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
public final class ScreenPoint extends du<ScreenPoint, Builder> implements ScreenPointOrBuilder {
    private static final ScreenPoint DEFAULT_INSTANCE;
    private static volatile fo<ScreenPoint> PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private int x_;
    private int y_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.ScreenPoint$1, reason: invalid class name */
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
    public final class Builder extends dm<ScreenPoint, Builder> implements ScreenPointOrBuilder {
        private Builder() {
            super(ScreenPoint.DEFAULT_INSTANCE);
        }

        public Builder clearX() {
            copyOnWrite();
            ((ScreenPoint) this.instance).clearX();
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((ScreenPoint) this.instance).clearY();
            return this;
        }

        @Override // com.waze.jni.protos.map.ScreenPointOrBuilder
        public int getX() {
            return ((ScreenPoint) this.instance).getX();
        }

        @Override // com.waze.jni.protos.map.ScreenPointOrBuilder
        public int getY() {
            return ((ScreenPoint) this.instance).getY();
        }

        public Builder setX(int i2) {
            copyOnWrite();
            ((ScreenPoint) this.instance).setX(i2);
            return this;
        }

        public Builder setY(int i2) {
            copyOnWrite();
            ((ScreenPoint) this.instance).setY(i2);
            return this;
        }
    }

    static {
        ScreenPoint screenPoint = new ScreenPoint();
        DEFAULT_INSTANCE = screenPoint;
        du.registerDefaultInstance(ScreenPoint.class, screenPoint);
    }

    private ScreenPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.x_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.y_ = 0;
    }

    public static ScreenPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ScreenPoint parseDelimitedFrom(InputStream inputStream) {
        return (ScreenPoint) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScreenPoint parseFrom(v vVar) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ScreenPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(int i2) {
        this.x_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(int i2) {
        this.y_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"x_", "y_"});
        }
        if (iOrdinal == 3) {
            return new ScreenPoint();
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
        fo<ScreenPoint> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ScreenPoint.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.ScreenPointOrBuilder
    public int getX() {
        return this.x_;
    }

    @Override // com.waze.jni.protos.map.ScreenPointOrBuilder
    public int getY() {
        return this.y_;
    }

    public static Builder newBuilder(ScreenPoint screenPoint) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(screenPoint);
    }

    public static ScreenPoint parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ScreenPoint) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ScreenPoint parseFrom(v vVar, de deVar) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ScreenPoint parseFrom(z zVar) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ScreenPoint parseFrom(z zVar, de deVar) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ScreenPoint parseFrom(InputStream inputStream) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScreenPoint parseFrom(InputStream inputStream, de deVar) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ScreenPoint parseFrom(ByteBuffer byteBuffer) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ScreenPoint parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ScreenPoint parseFrom(byte[] bArr) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScreenPoint parseFrom(byte[] bArr, de deVar) {
        return (ScreenPoint) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
