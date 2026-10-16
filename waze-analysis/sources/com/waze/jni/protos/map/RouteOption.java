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
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteOption extends du<RouteOption, Builder> implements RouteOptionOrBuilder {
    private static final RouteOption DEFAULT_INSTANCE;
    private static volatile fo<RouteOption> PARSER = null;
    public static final int SHOWTRAFFIC_FIELD_NUMBER = 1;
    public static final int SNAILTRAILBEHAVIOR_FIELD_NUMBER = 2;
    private boolean showTraffic_;
    private int snailTrailBehavior_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.RouteOption$1, reason: invalid class name */
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
    public final class Builder extends dm<RouteOption, Builder> implements RouteOptionOrBuilder {
        private Builder() {
            super(RouteOption.DEFAULT_INSTANCE);
        }

        public Builder clearShowTraffic() {
            copyOnWrite();
            ((RouteOption) this.instance).clearShowTraffic();
            return this;
        }

        public Builder clearSnailTrailBehavior() {
            copyOnWrite();
            ((RouteOption) this.instance).clearSnailTrailBehavior();
            return this;
        }

        @Override // com.waze.jni.protos.map.RouteOptionOrBuilder
        public boolean getShowTraffic() {
            return ((RouteOption) this.instance).getShowTraffic();
        }

        @Override // com.waze.jni.protos.map.RouteOptionOrBuilder
        public SnailTrailBehavior getSnailTrailBehavior() {
            return ((RouteOption) this.instance).getSnailTrailBehavior();
        }

        @Override // com.waze.jni.protos.map.RouteOptionOrBuilder
        public int getSnailTrailBehaviorValue() {
            return ((RouteOption) this.instance).getSnailTrailBehaviorValue();
        }

        public Builder setShowTraffic(boolean z) {
            copyOnWrite();
            ((RouteOption) this.instance).setShowTraffic(z);
            return this;
        }

        public Builder setSnailTrailBehavior(SnailTrailBehavior snailTrailBehavior) {
            copyOnWrite();
            ((RouteOption) this.instance).setSnailTrailBehavior(snailTrailBehavior);
            return this;
        }

        public Builder setSnailTrailBehaviorValue(int i2) {
            copyOnWrite();
            ((RouteOption) this.instance).setSnailTrailBehaviorValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum SnailTrailBehavior implements eg {
        KEEP(0),
        REMOVE(1),
        UNRECOGNIZED(-1);

        public static final int KEEP_VALUE = 0;
        public static final int REMOVE_VALUE = 1;
        private static final eh<SnailTrailBehavior> internalValueMap = new eh<SnailTrailBehavior>() { // from class: com.waze.jni.protos.map.RouteOption.SnailTrailBehavior.1
            @Override // com.google.v.eh
            public SnailTrailBehavior findValueByNumber(int i2) {
                return SnailTrailBehavior.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class SnailTrailBehaviorVerifier implements ei {
            static final ei INSTANCE = new SnailTrailBehaviorVerifier();

            private SnailTrailBehaviorVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return SnailTrailBehavior.forNumber(i2) != null;
            }
        }

        SnailTrailBehavior(int i2) {
            this.value = i2;
        }

        public static SnailTrailBehavior forNumber(int i2) {
            if (i2 == 0) {
                return KEEP;
            }
            if (i2 != 1) {
                return null;
            }
            return REMOVE;
        }

        public static eh<SnailTrailBehavior> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return SnailTrailBehaviorVerifier.INSTANCE;
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
        RouteOption routeOption = new RouteOption();
        DEFAULT_INSTANCE = routeOption;
        du.registerDefaultInstance(RouteOption.class, routeOption);
    }

    private RouteOption() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTraffic() {
        this.showTraffic_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnailTrailBehavior() {
        this.snailTrailBehavior_ = 0;
    }

    public static RouteOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RouteOption parseDelimitedFrom(InputStream inputStream) {
        return (RouteOption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteOption parseFrom(v vVar) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RouteOption> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTraffic(boolean z) {
        this.showTraffic_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnailTrailBehavior(SnailTrailBehavior snailTrailBehavior) {
        this.snailTrailBehavior_ = snailTrailBehavior.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnailTrailBehaviorValue(int i2) {
        this.snailTrailBehavior_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"showTraffic_", "snailTrailBehavior_"});
        }
        if (iOrdinal == 3) {
            return new RouteOption();
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
        fo<RouteOption> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RouteOption.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.RouteOptionOrBuilder
    public boolean getShowTraffic() {
        return this.showTraffic_;
    }

    @Override // com.waze.jni.protos.map.RouteOptionOrBuilder
    public SnailTrailBehavior getSnailTrailBehavior() {
        SnailTrailBehavior snailTrailBehaviorForNumber = SnailTrailBehavior.forNumber(this.snailTrailBehavior_);
        return snailTrailBehaviorForNumber == null ? SnailTrailBehavior.UNRECOGNIZED : snailTrailBehaviorForNumber;
    }

    @Override // com.waze.jni.protos.map.RouteOptionOrBuilder
    public int getSnailTrailBehaviorValue() {
        return this.snailTrailBehavior_;
    }

    public static Builder newBuilder(RouteOption routeOption) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routeOption);
    }

    public static RouteOption parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RouteOption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteOption parseFrom(v vVar, de deVar) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RouteOption parseFrom(z zVar) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RouteOption parseFrom(z zVar, de deVar) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RouteOption parseFrom(InputStream inputStream) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteOption parseFrom(InputStream inputStream, de deVar) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteOption parseFrom(ByteBuffer byteBuffer) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RouteOption parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RouteOption parseFrom(byte[] bArr) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RouteOption parseFrom(byte[] bArr, de deVar) {
        return (RouteOption) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
