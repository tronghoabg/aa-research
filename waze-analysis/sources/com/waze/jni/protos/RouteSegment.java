package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.NavigationInstruction;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteSegment extends du<RouteSegment, Builder> implements RouteSegmentOrBuilder {
    private static final RouteSegment DEFAULT_INSTANCE;
    public static final int INSTRUCTION_FIELD_NUMBER = 1;
    public static final int LENGTHMETERS_FIELD_NUMBER = 2;
    private static volatile fo<RouteSegment> PARSER;
    private int bitField0_;
    private NavigationInstruction instruction_;
    private int lengthMeters_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.RouteSegment$1, reason: invalid class name */
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
        RouteSegment routeSegment = new RouteSegment();
        DEFAULT_INSTANCE = routeSegment;
        du.registerDefaultInstance(RouteSegment.class, routeSegment);
    }

    private RouteSegment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.instruction_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthMeters() {
        this.bitField0_ &= -3;
        this.lengthMeters_ = 0;
    }

    public static RouteSegment getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstruction(NavigationInstruction navigationInstruction) {
        Objects.requireNonNull(navigationInstruction);
        NavigationInstruction navigationInstruction2 = this.instruction_;
        if (navigationInstruction2 != null && navigationInstruction2 != NavigationInstruction.getDefaultInstance()) {
            NavigationInstruction.Builder builderNewBuilder = NavigationInstruction.newBuilder(navigationInstruction2);
            builderNewBuilder.mergeFrom((NavigationInstruction.Builder) navigationInstruction);
            navigationInstruction = builderNewBuilder.buildPartial();
        }
        this.instruction_ = navigationInstruction;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RouteSegment parseDelimitedFrom(InputStream inputStream) {
        return (RouteSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteSegment parseFrom(v vVar) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RouteSegment> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstruction(NavigationInstruction navigationInstruction) {
        Objects.requireNonNull(navigationInstruction);
        this.instruction_ = navigationInstruction;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthMeters(int i2) {
        this.bitField0_ |= 2;
        this.lengthMeters_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"bitField0_", "instruction_", "lengthMeters_"});
        }
        if (iOrdinal == 3) {
            return new RouteSegment();
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
        fo<RouteSegment> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RouteSegment.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.RouteSegmentOrBuilder
    public NavigationInstruction getInstruction() {
        NavigationInstruction navigationInstruction = this.instruction_;
        return navigationInstruction == null ? NavigationInstruction.getDefaultInstance() : navigationInstruction;
    }

    @Override // com.waze.jni.protos.RouteSegmentOrBuilder
    public int getLengthMeters() {
        return this.lengthMeters_;
    }

    @Override // com.waze.jni.protos.RouteSegmentOrBuilder
    public boolean hasInstruction() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.RouteSegmentOrBuilder
    public boolean hasLengthMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(RouteSegment routeSegment) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routeSegment);
    }

    public static RouteSegment parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RouteSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteSegment parseFrom(v vVar, de deVar) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RouteSegment parseFrom(z zVar) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RouteSegment parseFrom(z zVar, de deVar) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RouteSegment parseFrom(InputStream inputStream) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteSegment parseFrom(InputStream inputStream, de deVar) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteSegment parseFrom(ByteBuffer byteBuffer) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RouteSegment parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RouteSegment, Builder> implements RouteSegmentOrBuilder {
        private Builder() {
            super(RouteSegment.DEFAULT_INSTANCE);
        }

        public Builder clearInstruction() {
            copyOnWrite();
            ((RouteSegment) this.instance).clearInstruction();
            return this;
        }

        public Builder clearLengthMeters() {
            copyOnWrite();
            ((RouteSegment) this.instance).clearLengthMeters();
            return this;
        }

        @Override // com.waze.jni.protos.RouteSegmentOrBuilder
        public NavigationInstruction getInstruction() {
            return ((RouteSegment) this.instance).getInstruction();
        }

        @Override // com.waze.jni.protos.RouteSegmentOrBuilder
        public int getLengthMeters() {
            return ((RouteSegment) this.instance).getLengthMeters();
        }

        @Override // com.waze.jni.protos.RouteSegmentOrBuilder
        public boolean hasInstruction() {
            return ((RouteSegment) this.instance).hasInstruction();
        }

        @Override // com.waze.jni.protos.RouteSegmentOrBuilder
        public boolean hasLengthMeters() {
            return ((RouteSegment) this.instance).hasLengthMeters();
        }

        public Builder mergeInstruction(NavigationInstruction navigationInstruction) {
            copyOnWrite();
            ((RouteSegment) this.instance).mergeInstruction(navigationInstruction);
            return this;
        }

        public Builder setInstruction(NavigationInstruction.Builder builder) {
            copyOnWrite();
            ((RouteSegment) this.instance).setInstruction(builder.build());
            return this;
        }

        public Builder setLengthMeters(int i2) {
            copyOnWrite();
            ((RouteSegment) this.instance).setLengthMeters(i2);
            return this;
        }

        public Builder setInstruction(NavigationInstruction navigationInstruction) {
            copyOnWrite();
            ((RouteSegment) this.instance).setInstruction(navigationInstruction);
            return this;
        }
    }

    public static RouteSegment parseFrom(byte[] bArr) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RouteSegment parseFrom(byte[] bArr, de deVar) {
        return (RouteSegment) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
