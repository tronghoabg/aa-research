package com.waze.jni.protos.location;

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
public final class Quaternion extends du<Quaternion, Builder> implements QuaternionOrBuilder {
    private static final Quaternion DEFAULT_INSTANCE;
    private static volatile fo<Quaternion> PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private int bitField0_;
    private float w_;
    private float x_;
    private float y_;
    private float z_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.location.Quaternion$1, reason: invalid class name */
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
    public final class Builder extends dm<Quaternion, Builder> implements QuaternionOrBuilder {
        private Builder() {
            super(Quaternion.DEFAULT_INSTANCE);
        }

        public Builder clearW() {
            copyOnWrite();
            ((Quaternion) this.instance).clearW();
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            ((Quaternion) this.instance).clearX();
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((Quaternion) this.instance).clearY();
            return this;
        }

        public Builder clearZ() {
            copyOnWrite();
            ((Quaternion) this.instance).clearZ();
            return this;
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public float getW() {
            return ((Quaternion) this.instance).getW();
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public float getX() {
            return ((Quaternion) this.instance).getX();
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public float getY() {
            return ((Quaternion) this.instance).getY();
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public float getZ() {
            return ((Quaternion) this.instance).getZ();
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public boolean hasW() {
            return ((Quaternion) this.instance).hasW();
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public boolean hasX() {
            return ((Quaternion) this.instance).hasX();
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public boolean hasY() {
            return ((Quaternion) this.instance).hasY();
        }

        @Override // com.waze.jni.protos.location.QuaternionOrBuilder
        public boolean hasZ() {
            return ((Quaternion) this.instance).hasZ();
        }

        public Builder setW(float f2) {
            copyOnWrite();
            ((Quaternion) this.instance).setW(f2);
            return this;
        }

        public Builder setX(float f2) {
            copyOnWrite();
            ((Quaternion) this.instance).setX(f2);
            return this;
        }

        public Builder setY(float f2) {
            copyOnWrite();
            ((Quaternion) this.instance).setY(f2);
            return this;
        }

        public Builder setZ(float f2) {
            copyOnWrite();
            ((Quaternion) this.instance).setZ(f2);
            return this;
        }
    }

    static {
        Quaternion quaternion = new Quaternion();
        DEFAULT_INSTANCE = quaternion;
        du.registerDefaultInstance(Quaternion.class, quaternion);
    }

    private Quaternion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearW() {
        this.bitField0_ &= -9;
        this.w_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.bitField0_ &= -2;
        this.x_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.bitField0_ &= -3;
        this.y_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZ() {
        this.bitField0_ &= -5;
        this.z_ = 0.0f;
    }

    public static Quaternion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream) {
        return (Quaternion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseFrom(v vVar) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Quaternion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setW(float f2) {
        this.bitField0_ |= 8;
        this.w_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(float f2) {
        this.bitField0_ |= 1;
        this.x_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(float f2) {
        this.bitField0_ |= 2;
        this.y_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZ(float f2) {
        this.bitField0_ |= 4;
        this.z_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "x_", "y_", "z_", "w_"});
        }
        if (iOrdinal == 3) {
            return new Quaternion();
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
        fo<Quaternion> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Quaternion.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public float getW() {
        return this.w_;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public float getX() {
        return this.x_;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public float getY() {
        return this.y_;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public float getZ() {
        return this.z_;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public boolean hasW() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public boolean hasX() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public boolean hasY() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.location.QuaternionOrBuilder
    public boolean hasZ() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(Quaternion quaternion) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(quaternion);
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Quaternion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Quaternion parseFrom(v vVar, de deVar) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Quaternion parseFrom(z zVar) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Quaternion parseFrom(z zVar, de deVar) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Quaternion parseFrom(InputStream inputStream) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseFrom(InputStream inputStream, de deVar) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Quaternion parseFrom(byte[] bArr) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quaternion parseFrom(byte[] bArr, de deVar) {
        return (Quaternion) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
