package com.waze.jni.protos.navigate;

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
public final class Hov extends du<Hov, Builder> implements HovOrBuilder {
    private static final Hov DEFAULT_INSTANCE;
    public static final int HOVLESSVARIANTALTID_FIELD_NUMBER = 2;
    public static final int MINPASSENGERS_FIELD_NUMBER = 1;
    private static volatile fo<Hov> PARSER;
    private int bitField0_;
    private long hovLessVariantAltId_;
    private int minPassengers_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.Hov$1, reason: invalid class name */
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
    public final class Builder extends dm<Hov, Builder> implements HovOrBuilder {
        private Builder() {
            super(Hov.DEFAULT_INSTANCE);
        }

        public Builder clearHovLessVariantAltId() {
            copyOnWrite();
            ((Hov) this.instance).clearHovLessVariantAltId();
            return this;
        }

        public Builder clearMinPassengers() {
            copyOnWrite();
            ((Hov) this.instance).clearMinPassengers();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.HovOrBuilder
        public long getHovLessVariantAltId() {
            return ((Hov) this.instance).getHovLessVariantAltId();
        }

        @Override // com.waze.jni.protos.navigate.HovOrBuilder
        public int getMinPassengers() {
            return ((Hov) this.instance).getMinPassengers();
        }

        @Override // com.waze.jni.protos.navigate.HovOrBuilder
        public boolean hasHovLessVariantAltId() {
            return ((Hov) this.instance).hasHovLessVariantAltId();
        }

        public Builder setHovLessVariantAltId(long j2) {
            copyOnWrite();
            ((Hov) this.instance).setHovLessVariantAltId(j2);
            return this;
        }

        public Builder setMinPassengers(int i2) {
            copyOnWrite();
            ((Hov) this.instance).setMinPassengers(i2);
            return this;
        }
    }

    static {
        Hov hov = new Hov();
        DEFAULT_INSTANCE = hov;
        du.registerDefaultInstance(Hov.class, hov);
    }

    private Hov() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovLessVariantAltId() {
        this.bitField0_ &= -2;
        this.hovLessVariantAltId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinPassengers() {
        this.minPassengers_ = 0;
    }

    public static Hov getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Hov parseDelimitedFrom(InputStream inputStream) {
        return (Hov) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Hov parseFrom(v vVar) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Hov> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovLessVariantAltId(long j2) {
        this.bitField0_ |= 1;
        this.hovLessVariantAltId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinPassengers(int i2) {
        this.minPassengers_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဂ\u0000", new Object[]{"bitField0_", "minPassengers_", "hovLessVariantAltId_"});
        }
        if (iOrdinal == 3) {
            return new Hov();
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
        fo<Hov> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Hov.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.HovOrBuilder
    public long getHovLessVariantAltId() {
        return this.hovLessVariantAltId_;
    }

    @Override // com.waze.jni.protos.navigate.HovOrBuilder
    public int getMinPassengers() {
        return this.minPassengers_;
    }

    @Override // com.waze.jni.protos.navigate.HovOrBuilder
    public boolean hasHovLessVariantAltId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Hov hov) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hov);
    }

    public static Hov parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Hov) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Hov parseFrom(v vVar, de deVar) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Hov parseFrom(z zVar) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Hov parseFrom(z zVar, de deVar) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Hov parseFrom(InputStream inputStream) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Hov parseFrom(InputStream inputStream, de deVar) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Hov parseFrom(ByteBuffer byteBuffer) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Hov parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Hov parseFrom(byte[] bArr) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Hov parseFrom(byte[] bArr, de deVar) {
        return (Hov) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
