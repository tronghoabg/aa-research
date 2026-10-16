package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fe;
import com.google.v.ff;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenerateMapObjectsPositionResult extends du<GenerateMapObjectsPositionResult, Builder> implements GenerateMapObjectsPositionResultOrBuilder {
    private static final GenerateMapObjectsPositionResult DEFAULT_INSTANCE;
    private static volatile fo<GenerateMapObjectsPositionResult> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private ff<Long, RouteEtaLabelPositionAndAlignment> result_ = ff.a();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.GenerateMapObjectsPositionResult$1, reason: invalid class name */
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
    public final class Builder extends dm<GenerateMapObjectsPositionResult, Builder> implements GenerateMapObjectsPositionResultOrBuilder {
        private Builder() {
            super(GenerateMapObjectsPositionResult.DEFAULT_INSTANCE);
        }

        public Builder clearResult() {
            copyOnWrite();
            ((GenerateMapObjectsPositionResult) this.instance).getMutableResultMap().clear();
            return this;
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
        public boolean containsResult(long j2) {
            return ((GenerateMapObjectsPositionResult) this.instance).getResultMap().containsKey(Long.valueOf(j2));
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
        public int getResultCount() {
            return ((GenerateMapObjectsPositionResult) this.instance).getResultMap().size();
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
        public Map<Long, RouteEtaLabelPositionAndAlignment> getResultMap() {
            return DesugarCollections.unmodifiableMap(((GenerateMapObjectsPositionResult) this.instance).getResultMap());
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
        public RouteEtaLabelPositionAndAlignment getResultOrDefault(long j2, RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment) {
            Map<Long, RouteEtaLabelPositionAndAlignment> resultMap = ((GenerateMapObjectsPositionResult) this.instance).getResultMap();
            Long lValueOf = Long.valueOf(j2);
            return resultMap.containsKey(lValueOf) ? resultMap.get(lValueOf) : routeEtaLabelPositionAndAlignment;
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
        public RouteEtaLabelPositionAndAlignment getResultOrThrow(long j2) {
            Map<Long, RouteEtaLabelPositionAndAlignment> resultMap = ((GenerateMapObjectsPositionResult) this.instance).getResultMap();
            Long lValueOf = Long.valueOf(j2);
            if (resultMap.containsKey(lValueOf)) {
                return resultMap.get(lValueOf);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllResult(Map<Long, RouteEtaLabelPositionAndAlignment> map) {
            copyOnWrite();
            ((GenerateMapObjectsPositionResult) this.instance).getMutableResultMap().putAll(map);
            return this;
        }

        public Builder putResult(long j2, RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment) {
            Objects.requireNonNull(routeEtaLabelPositionAndAlignment);
            copyOnWrite();
            ((GenerateMapObjectsPositionResult) this.instance).getMutableResultMap().put(Long.valueOf(j2), routeEtaLabelPositionAndAlignment);
            return this;
        }

        public Builder removeResult(long j2) {
            copyOnWrite();
            ((GenerateMapObjectsPositionResult) this.instance).getMutableResultMap().remove(Long.valueOf(j2));
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class ResultDefaultEntryHolder {
        static final fe<Long, RouteEtaLabelPositionAndAlignment> defaultEntry = fe.d(gm.INT64, 0L, gm.MESSAGE, RouteEtaLabelPositionAndAlignment.getDefaultInstance());

        private ResultDefaultEntryHolder() {
        }
    }

    static {
        GenerateMapObjectsPositionResult generateMapObjectsPositionResult = new GenerateMapObjectsPositionResult();
        DEFAULT_INSTANCE = generateMapObjectsPositionResult;
        du.registerDefaultInstance(GenerateMapObjectsPositionResult.class, generateMapObjectsPositionResult);
    }

    private GenerateMapObjectsPositionResult() {
    }

    public static GenerateMapObjectsPositionResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, RouteEtaLabelPositionAndAlignment> getMutableResultMap() {
        return internalGetMutableResult();
    }

    private ff<Long, RouteEtaLabelPositionAndAlignment> internalGetMutableResult() {
        if (!this.result_.e()) {
            this.result_ = this.result_.b();
        }
        return this.result_;
    }

    private ff<Long, RouteEtaLabelPositionAndAlignment> internalGetResult() {
        return this.result_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenerateMapObjectsPositionResult parseDelimitedFrom(InputStream inputStream) {
        return (GenerateMapObjectsPositionResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateMapObjectsPositionResult parseFrom(v vVar) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GenerateMapObjectsPositionResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
    public boolean containsResult(long j2) {
        return internalGetResult().containsKey(Long.valueOf(j2));
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"result_", ResultDefaultEntryHolder.defaultEntry});
        }
        if (iOrdinal == 3) {
            return new GenerateMapObjectsPositionResult();
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
        fo<GenerateMapObjectsPositionResult> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GenerateMapObjectsPositionResult.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
    public int getResultCount() {
        return internalGetResult().size();
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
    public Map<Long, RouteEtaLabelPositionAndAlignment> getResultMap() {
        return DesugarCollections.unmodifiableMap(internalGetResult());
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
    public RouteEtaLabelPositionAndAlignment getResultOrDefault(long j2, RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment) {
        RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment2 = internalGetResult().get(Long.valueOf(j2));
        return routeEtaLabelPositionAndAlignment2 != null ? routeEtaLabelPositionAndAlignment2 : routeEtaLabelPositionAndAlignment;
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionResultOrBuilder
    public RouteEtaLabelPositionAndAlignment getResultOrThrow(long j2) {
        RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment = internalGetResult().get(Long.valueOf(j2));
        if (routeEtaLabelPositionAndAlignment != null) {
            return routeEtaLabelPositionAndAlignment;
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(GenerateMapObjectsPositionResult generateMapObjectsPositionResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(generateMapObjectsPositionResult);
    }

    public static GenerateMapObjectsPositionResult parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GenerateMapObjectsPositionResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenerateMapObjectsPositionResult parseFrom(v vVar, de deVar) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GenerateMapObjectsPositionResult parseFrom(z zVar) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GenerateMapObjectsPositionResult parseFrom(z zVar, de deVar) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static GenerateMapObjectsPositionResult parseFrom(InputStream inputStream) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateMapObjectsPositionResult parseFrom(InputStream inputStream, de deVar) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenerateMapObjectsPositionResult parseFrom(ByteBuffer byteBuffer) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GenerateMapObjectsPositionResult parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static GenerateMapObjectsPositionResult parseFrom(byte[] bArr) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenerateMapObjectsPositionResult parseFrom(byte[] bArr, de deVar) {
        return (GenerateMapObjectsPositionResult) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
