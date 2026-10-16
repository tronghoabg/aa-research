package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.map.AnimationParams;
import com.waze.jni.protos.map.RouteOption;
import i.b.l.sk;
import i.b.l.sl;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedRouteData extends du<ExtendedRouteData, Builder> implements ExtendedRouteDataOrBuilder {
    public static final int ANIMATIONPARAMS_FIELD_NUMBER = 4;
    private static final ExtendedRouteData DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile fo<ExtendedRouteData> PARSER = null;
    public static final int ROUTE_PROTO_FIELD_NUMBER = 1;
    public static final int STYLE_FIELD_NUMBER = 3;
    private AnimationParams animationParams_;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private RouteOption options_;
    private sl routeProto_;
    private RouteStyle style_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.ExtendedRouteData$1, reason: invalid class name */
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
    public interface RouteStyleOrBuilder extends fj {
        RouteStyle.Type getType();

        int getTypeValue();
    }

    static {
        ExtendedRouteData extendedRouteData = new ExtendedRouteData();
        DEFAULT_INSTANCE = extendedRouteData;
        du.registerDefaultInstance(ExtendedRouteData.class, extendedRouteData);
    }

    private ExtendedRouteData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimationParams() {
        this.animationParams_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteProto() {
        this.routeProto_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = null;
        this.bitField0_ &= -5;
    }

    public static ExtendedRouteData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnimationParams(AnimationParams animationParams) {
        Objects.requireNonNull(animationParams);
        AnimationParams animationParams2 = this.animationParams_;
        if (animationParams2 != null && animationParams2 != AnimationParams.getDefaultInstance()) {
            AnimationParams.Builder builderNewBuilder = AnimationParams.newBuilder(animationParams2);
            builderNewBuilder.mergeFrom((AnimationParams.Builder) animationParams);
            animationParams = builderNewBuilder.buildPartial();
        }
        this.animationParams_ = animationParams;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(RouteOption routeOption) {
        Objects.requireNonNull(routeOption);
        RouteOption routeOption2 = this.options_;
        if (routeOption2 != null && routeOption2 != RouteOption.getDefaultInstance()) {
            RouteOption.Builder builderNewBuilder = RouteOption.newBuilder(routeOption2);
            builderNewBuilder.mergeFrom((RouteOption.Builder) routeOption);
            routeOption = builderNewBuilder.buildPartial();
        }
        this.options_ = routeOption;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteProto(sl slVar) {
        Objects.requireNonNull(slVar);
        sl slVar2 = this.routeProto_;
        if (slVar2 != null && slVar2 != sl.getDefaultInstance()) {
            sk skVarNewBuilder = sl.newBuilder(slVar2);
            skVarNewBuilder.mergeFrom((sk) slVar);
            slVar = skVarNewBuilder.buildPartial();
        }
        this.routeProto_ = slVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStyle(RouteStyle routeStyle) {
        Objects.requireNonNull(routeStyle);
        RouteStyle routeStyle2 = this.style_;
        if (routeStyle2 != null && routeStyle2 != RouteStyle.getDefaultInstance()) {
            RouteStyle.Builder builderNewBuilder = RouteStyle.newBuilder(routeStyle2);
            builderNewBuilder.mergeFrom((RouteStyle.Builder) routeStyle);
            routeStyle = builderNewBuilder.buildPartial();
        }
        this.style_ = routeStyle;
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendedRouteData parseDelimitedFrom(InputStream inputStream) {
        return (ExtendedRouteData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendedRouteData parseFrom(v vVar) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ExtendedRouteData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationParams(AnimationParams animationParams) {
        Objects.requireNonNull(animationParams);
        this.animationParams_ = animationParams;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(RouteOption routeOption) {
        Objects.requireNonNull(routeOption);
        this.options_ = routeOption;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteProto(sl slVar) {
        Objects.requireNonNull(slVar);
        this.routeProto_ = slVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(RouteStyle routeStyle) {
        Objects.requireNonNull(routeStyle);
        this.style_ = routeStyle;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "routeProto_", "options_", "style_", "animationParams_"});
            case 3:
                return new ExtendedRouteData();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<ExtendedRouteData> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ExtendedRouteData.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public AnimationParams getAnimationParams() {
        AnimationParams animationParams = this.animationParams_;
        return animationParams == null ? AnimationParams.getDefaultInstance() : animationParams;
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public RouteOption getOptions() {
        RouteOption routeOption = this.options_;
        return routeOption == null ? RouteOption.getDefaultInstance() : routeOption;
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public sl getRouteProto() {
        sl slVar = this.routeProto_;
        return slVar == null ? sl.getDefaultInstance() : slVar;
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public RouteStyle getStyle() {
        RouteStyle routeStyle = this.style_;
        return routeStyle == null ? RouteStyle.getDefaultInstance() : routeStyle;
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public boolean hasAnimationParams() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public boolean hasRouteProto() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
    public boolean hasStyle() {
        return (this.bitField0_ & 4) != 0;
    }

    /* compiled from: WazeSource */
    public final class RouteStyle extends du<RouteStyle, Builder> implements RouteStyleOrBuilder {
        private static final RouteStyle DEFAULT_INSTANCE;
        private static volatile fo<RouteStyle> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RouteStyle, Builder> implements RouteStyleOrBuilder {
            private Builder() {
                super(RouteStyle.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((RouteStyle) this.instance).clearType();
                return this;
            }

            @Override // com.waze.jni.protos.map.ExtendedRouteData.RouteStyleOrBuilder
            public Type getType() {
                return ((RouteStyle) this.instance).getType();
            }

            @Override // com.waze.jni.protos.map.ExtendedRouteData.RouteStyleOrBuilder
            public int getTypeValue() {
                return ((RouteStyle) this.instance).getTypeValue();
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((RouteStyle) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i2) {
                copyOnWrite();
                ((RouteStyle) this.instance).setTypeValue(i2);
                return this;
            }
        }

        /* compiled from: WazeSource */
        public enum Type implements eg {
            UNKNOWN_STYLE(0),
            SELECTED(1),
            CARPOOL(2),
            NOT_SELECTED(3),
            UNRECOGNIZED(-1);

            public static final int CARPOOL_VALUE = 2;
            public static final int NOT_SELECTED_VALUE = 3;
            public static final int SELECTED_VALUE = 1;
            public static final int UNKNOWN_STYLE_VALUE = 0;
            private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.map.ExtendedRouteData.RouteStyle.Type.1
                @Override // com.google.v.eh
                public Type findValueByNumber(int i2) {
                    return Type.forNumber(i2);
                }
            };
            private final int value;

            /* compiled from: WazeSource */
            final class TypeVerifier implements ei {
                static final ei INSTANCE = new TypeVerifier();

                private TypeVerifier() {
                }

                @Override // com.google.v.ei
                public boolean isInRange(int i2) {
                    return Type.forNumber(i2) != null;
                }
            }

            Type(int i2) {
                this.value = i2;
            }

            public static Type forNumber(int i2) {
                if (i2 == 0) {
                    return UNKNOWN_STYLE;
                }
                if (i2 == 1) {
                    return SELECTED;
                }
                if (i2 == 2) {
                    return CARPOOL;
                }
                if (i2 != 3) {
                    return null;
                }
                return NOT_SELECTED;
            }

            public static eh<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static ei internalGetVerifier() {
                return TypeVerifier.INSTANCE;
            }

            @Override // com.google.v.eg
            public final int getNumber() {
                return this == UNRECOGNIZED ? ep.b() : this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.value);
            }
        }

        static {
            RouteStyle routeStyle = new RouteStyle();
            DEFAULT_INSTANCE = routeStyle;
            du.registerDefaultInstance(RouteStyle.class, routeStyle);
        }

        private RouteStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static RouteStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RouteStyle parseDelimitedFrom(InputStream inputStream) {
            return (RouteStyle) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RouteStyle parseFrom(v vVar) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RouteStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i2) {
            this.type_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
            }
            if (iOrdinal == 3) {
                return new RouteStyle();
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
            fo<RouteStyle> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RouteStyle.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteData.RouteStyleOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteData.RouteStyleOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        public static Builder newBuilder(RouteStyle routeStyle) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(routeStyle);
        }

        public static RouteStyle parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RouteStyle) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RouteStyle parseFrom(v vVar, de deVar) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RouteStyle parseFrom(z zVar) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RouteStyle parseFrom(z zVar, de deVar) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RouteStyle parseFrom(InputStream inputStream) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RouteStyle parseFrom(InputStream inputStream, de deVar) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RouteStyle parseFrom(ByteBuffer byteBuffer) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RouteStyle parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RouteStyle parseFrom(byte[] bArr) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RouteStyle parseFrom(byte[] bArr, de deVar) {
            return (RouteStyle) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(ExtendedRouteData extendedRouteData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(extendedRouteData);
    }

    public static ExtendedRouteData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ExtendedRouteData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ExtendedRouteData parseFrom(v vVar, de deVar) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ExtendedRouteData parseFrom(z zVar) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ExtendedRouteData parseFrom(z zVar, de deVar) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ExtendedRouteData parseFrom(InputStream inputStream) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendedRouteData parseFrom(InputStream inputStream, de deVar) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ExtendedRouteData parseFrom(ByteBuffer byteBuffer) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ExtendedRouteData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<ExtendedRouteData, Builder> implements ExtendedRouteDataOrBuilder {
        private Builder() {
            super(ExtendedRouteData.DEFAULT_INSTANCE);
        }

        public Builder clearAnimationParams() {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).clearAnimationParams();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).clearOptions();
            return this;
        }

        public Builder clearRouteProto() {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).clearRouteProto();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).clearStyle();
            return this;
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public AnimationParams getAnimationParams() {
            return ((ExtendedRouteData) this.instance).getAnimationParams();
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public RouteOption getOptions() {
            return ((ExtendedRouteData) this.instance).getOptions();
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public sl getRouteProto() {
            return ((ExtendedRouteData) this.instance).getRouteProto();
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public RouteStyle getStyle() {
            return ((ExtendedRouteData) this.instance).getStyle();
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public boolean hasAnimationParams() {
            return ((ExtendedRouteData) this.instance).hasAnimationParams();
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public boolean hasOptions() {
            return ((ExtendedRouteData) this.instance).hasOptions();
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public boolean hasRouteProto() {
            return ((ExtendedRouteData) this.instance).hasRouteProto();
        }

        @Override // com.waze.jni.protos.map.ExtendedRouteDataOrBuilder
        public boolean hasStyle() {
            return ((ExtendedRouteData) this.instance).hasStyle();
        }

        public Builder mergeAnimationParams(AnimationParams animationParams) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).mergeAnimationParams(animationParams);
            return this;
        }

        public Builder mergeOptions(RouteOption routeOption) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).mergeOptions(routeOption);
            return this;
        }

        public Builder mergeRouteProto(sl slVar) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).mergeRouteProto(slVar);
            return this;
        }

        public Builder mergeStyle(RouteStyle routeStyle) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).mergeStyle(routeStyle);
            return this;
        }

        public Builder setAnimationParams(AnimationParams.Builder builder) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setAnimationParams(builder.build());
            return this;
        }

        public Builder setOptions(RouteOption.Builder builder) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setOptions(builder.build());
            return this;
        }

        public Builder setRouteProto(sk skVar) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setRouteProto(skVar.build());
            return this;
        }

        public Builder setStyle(RouteStyle.Builder builder) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setStyle(builder.build());
            return this;
        }

        public Builder setAnimationParams(AnimationParams animationParams) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setAnimationParams(animationParams);
            return this;
        }

        public Builder setOptions(RouteOption routeOption) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setOptions(routeOption);
            return this;
        }

        public Builder setRouteProto(sl slVar) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setRouteProto(slVar);
            return this;
        }

        public Builder setStyle(RouteStyle routeStyle) {
            copyOnWrite();
            ((ExtendedRouteData) this.instance).setStyle(routeStyle);
            return this;
        }
    }

    public static ExtendedRouteData parseFrom(byte[] bArr) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendedRouteData parseFrom(byte[] bArr, de deVar) {
        return (ExtendedRouteData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
