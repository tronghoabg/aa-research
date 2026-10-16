package com.waze.jni.protos.navigate;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.RouteSegment;
import com.waze.jni.protos.RouteSegmentOrBuilder;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class OfflineNavigationRouteProto extends du<OfflineNavigationRouteProto, Builder> implements OfflineNavigationRouteProtoOrBuilder {
    private static final OfflineNavigationRouteProto DEFAULT_INSTANCE;
    public static final int IS_REROUTE_FIELD_NUMBER = 2;
    private static volatile fo<OfflineNavigationRouteProto> PARSER = null;
    public static final int ROUTEUUID_FIELD_NUMBER = 3;
    public static final int SEGMENTS_FIELD_NUMBER = 1;
    private boolean isReroute_;
    private eo<RouteSegment> segments_ = emptyProtobufList();
    private String routeUUID_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.OfflineNavigationRouteProto$1, reason: invalid class name */
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
        OfflineNavigationRouteProto offlineNavigationRouteProto = new OfflineNavigationRouteProto();
        DEFAULT_INSTANCE = offlineNavigationRouteProto;
        du.registerDefaultInstance(OfflineNavigationRouteProto.class, offlineNavigationRouteProto);
    }

    private OfflineNavigationRouteProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegments(Iterable<? extends RouteSegment> iterable) {
        ensureSegmentsIsMutable();
        c.addAll(iterable, this.segments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(int i2, RouteSegment routeSegment) {
        Objects.requireNonNull(routeSegment);
        ensureSegmentsIsMutable();
        this.segments_.add(i2, routeSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsReroute() {
        this.isReroute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUUID() {
        this.routeUUID_ = getDefaultInstance().getRouteUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        this.segments_ = emptyProtobufList();
    }

    private void ensureSegmentsIsMutable() {
        eo<RouteSegment> eoVar = this.segments_;
        if (eoVar.c()) {
            return;
        }
        this.segments_ = du.mutableCopy(eoVar);
    }

    public static OfflineNavigationRouteProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static OfflineNavigationRouteProto parseDelimitedFrom(InputStream inputStream) {
        return (OfflineNavigationRouteProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OfflineNavigationRouteProto parseFrom(v vVar) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<OfflineNavigationRouteProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegments(int i2) {
        ensureSegmentsIsMutable();
        this.segments_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsReroute(boolean z) {
        this.isReroute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUUID(String str) {
        Objects.requireNonNull(str);
        this.routeUUID_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUUIDBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routeUUID_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(int i2, RouteSegment routeSegment) {
        Objects.requireNonNull(routeSegment);
        ensureSegmentsIsMutable();
        this.segments_.set(i2, routeSegment);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003Ȉ", new Object[]{"segments_", RouteSegment.class, "isReroute_", "routeUUID_"});
        }
        if (iOrdinal == 3) {
            return new OfflineNavigationRouteProto();
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
        fo<OfflineNavigationRouteProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (OfflineNavigationRouteProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
    public boolean getIsReroute() {
        return this.isReroute_;
    }

    @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
    public String getRouteUUID() {
        return this.routeUUID_;
    }

    @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
    public v getRouteUUIDBytes() {
        return v.s(this.routeUUID_);
    }

    @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
    public RouteSegment getSegments(int i2) {
        return this.segments_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
    public int getSegmentsCount() {
        return this.segments_.size();
    }

    @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
    public List<RouteSegment> getSegmentsList() {
        return this.segments_;
    }

    public RouteSegmentOrBuilder getSegmentsOrBuilder(int i2) {
        return this.segments_.get(i2);
    }

    public List<? extends RouteSegmentOrBuilder> getSegmentsOrBuilderList() {
        return this.segments_;
    }

    public static Builder newBuilder(OfflineNavigationRouteProto offlineNavigationRouteProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(offlineNavigationRouteProto);
    }

    public static OfflineNavigationRouteProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (OfflineNavigationRouteProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static OfflineNavigationRouteProto parseFrom(v vVar, de deVar) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static OfflineNavigationRouteProto parseFrom(z zVar) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static OfflineNavigationRouteProto parseFrom(z zVar, de deVar) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(RouteSegment routeSegment) {
        Objects.requireNonNull(routeSegment);
        ensureSegmentsIsMutable();
        this.segments_.add(routeSegment);
    }

    public static OfflineNavigationRouteProto parseFrom(InputStream inputStream) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OfflineNavigationRouteProto parseFrom(InputStream inputStream, de deVar) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static OfflineNavigationRouteProto parseFrom(ByteBuffer byteBuffer) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static OfflineNavigationRouteProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<OfflineNavigationRouteProto, Builder> implements OfflineNavigationRouteProtoOrBuilder {
        private Builder() {
            super(OfflineNavigationRouteProto.DEFAULT_INSTANCE);
        }

        public Builder addAllSegments(Iterable<? extends RouteSegment> iterable) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).addAllSegments(iterable);
            return this;
        }

        public Builder addSegments(int i2, RouteSegment.Builder builder) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).addSegments(i2, builder.build());
            return this;
        }

        public Builder clearIsReroute() {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).clearIsReroute();
            return this;
        }

        public Builder clearRouteUUID() {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).clearRouteUUID();
            return this;
        }

        public Builder clearSegments() {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).clearSegments();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
        public boolean getIsReroute() {
            return ((OfflineNavigationRouteProto) this.instance).getIsReroute();
        }

        @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
        public String getRouteUUID() {
            return ((OfflineNavigationRouteProto) this.instance).getRouteUUID();
        }

        @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
        public v getRouteUUIDBytes() {
            return ((OfflineNavigationRouteProto) this.instance).getRouteUUIDBytes();
        }

        @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
        public RouteSegment getSegments(int i2) {
            return ((OfflineNavigationRouteProto) this.instance).getSegments(i2);
        }

        @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
        public int getSegmentsCount() {
            return ((OfflineNavigationRouteProto) this.instance).getSegmentsCount();
        }

        @Override // com.waze.jni.protos.navigate.OfflineNavigationRouteProtoOrBuilder
        public List<RouteSegment> getSegmentsList() {
            return DesugarCollections.unmodifiableList(((OfflineNavigationRouteProto) this.instance).getSegmentsList());
        }

        public Builder removeSegments(int i2) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).removeSegments(i2);
            return this;
        }

        public Builder setIsReroute(boolean z) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).setIsReroute(z);
            return this;
        }

        public Builder setRouteUUID(String str) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).setRouteUUID(str);
            return this;
        }

        public Builder setRouteUUIDBytes(v vVar) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).setRouteUUIDBytes(vVar);
            return this;
        }

        public Builder setSegments(int i2, RouteSegment.Builder builder) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).setSegments(i2, builder.build());
            return this;
        }

        public Builder addSegments(int i2, RouteSegment routeSegment) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).addSegments(i2, routeSegment);
            return this;
        }

        public Builder setSegments(int i2, RouteSegment routeSegment) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).setSegments(i2, routeSegment);
            return this;
        }

        public Builder addSegments(RouteSegment.Builder builder) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).addSegments(builder.build());
            return this;
        }

        public Builder addSegments(RouteSegment routeSegment) {
            copyOnWrite();
            ((OfflineNavigationRouteProto) this.instance).addSegments(routeSegment);
            return this;
        }
    }

    public static OfflineNavigationRouteProto parseFrom(byte[] bArr) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OfflineNavigationRouteProto parseFrom(byte[] bArr, de deVar) {
        return (OfflineNavigationRouteProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
