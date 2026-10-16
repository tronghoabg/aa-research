package com.waze.jni.protos.insights_infra;

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
import com.waze.jni.protos.insights_infra.SegmentInsightInfo;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SegmentInsightUpdate extends du<SegmentInsightUpdate, Builder> implements SegmentInsightUpdateOrBuilder {
    private static final SegmentInsightUpdate DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile fo<SegmentInsightUpdate> PARSER;
    private eo<SegmentInsightInfo> info_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.insights_infra.SegmentInsightUpdate$1, reason: invalid class name */
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
        SegmentInsightUpdate segmentInsightUpdate = new SegmentInsightUpdate();
        DEFAULT_INSTANCE = segmentInsightUpdate;
        du.registerDefaultInstance(SegmentInsightUpdate.class, segmentInsightUpdate);
    }

    private SegmentInsightUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInfo(Iterable<? extends SegmentInsightInfo> iterable) {
        ensureInfoIsMutable();
        c.addAll(iterable, this.info_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfo(int i2, SegmentInsightInfo segmentInsightInfo) {
        Objects.requireNonNull(segmentInsightInfo);
        ensureInfoIsMutable();
        this.info_.add(i2, segmentInsightInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = emptyProtobufList();
    }

    private void ensureInfoIsMutable() {
        eo<SegmentInsightInfo> eoVar = this.info_;
        if (eoVar.c()) {
            return;
        }
        this.info_ = du.mutableCopy(eoVar);
    }

    public static SegmentInsightUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SegmentInsightUpdate parseDelimitedFrom(InputStream inputStream) {
        return (SegmentInsightUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SegmentInsightUpdate parseFrom(v vVar) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SegmentInsightUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInfo(int i2) {
        ensureInfoIsMutable();
        this.info_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(int i2, SegmentInsightInfo segmentInsightInfo) {
        Objects.requireNonNull(segmentInsightInfo);
        ensureInfoIsMutable();
        this.info_.set(i2, segmentInsightInfo);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"info_", SegmentInsightInfo.class});
        }
        if (iOrdinal == 3) {
            return new SegmentInsightUpdate();
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
        fo<SegmentInsightUpdate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SegmentInsightUpdate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightUpdateOrBuilder
    public SegmentInsightInfo getInfo(int i2) {
        return this.info_.get(i2);
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightUpdateOrBuilder
    public int getInfoCount() {
        return this.info_.size();
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightUpdateOrBuilder
    public List<SegmentInsightInfo> getInfoList() {
        return this.info_;
    }

    public SegmentInsightInfoOrBuilder getInfoOrBuilder(int i2) {
        return this.info_.get(i2);
    }

    public List<? extends SegmentInsightInfoOrBuilder> getInfoOrBuilderList() {
        return this.info_;
    }

    public static Builder newBuilder(SegmentInsightUpdate segmentInsightUpdate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(segmentInsightUpdate);
    }

    public static SegmentInsightUpdate parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SegmentInsightUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SegmentInsightUpdate parseFrom(v vVar, de deVar) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SegmentInsightUpdate parseFrom(z zVar) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SegmentInsightUpdate parseFrom(z zVar, de deVar) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfo(SegmentInsightInfo segmentInsightInfo) {
        Objects.requireNonNull(segmentInsightInfo);
        ensureInfoIsMutable();
        this.info_.add(segmentInsightInfo);
    }

    public static SegmentInsightUpdate parseFrom(InputStream inputStream) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SegmentInsightUpdate parseFrom(InputStream inputStream, de deVar) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SegmentInsightUpdate parseFrom(ByteBuffer byteBuffer) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SegmentInsightUpdate parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<SegmentInsightUpdate, Builder> implements SegmentInsightUpdateOrBuilder {
        private Builder() {
            super(SegmentInsightUpdate.DEFAULT_INSTANCE);
        }

        public Builder addAllInfo(Iterable<? extends SegmentInsightInfo> iterable) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).addAllInfo(iterable);
            return this;
        }

        public Builder addInfo(int i2, SegmentInsightInfo.Builder builder) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).addInfo(i2, builder.build());
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).clearInfo();
            return this;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightUpdateOrBuilder
        public SegmentInsightInfo getInfo(int i2) {
            return ((SegmentInsightUpdate) this.instance).getInfo(i2);
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightUpdateOrBuilder
        public int getInfoCount() {
            return ((SegmentInsightUpdate) this.instance).getInfoCount();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightUpdateOrBuilder
        public List<SegmentInsightInfo> getInfoList() {
            return DesugarCollections.unmodifiableList(((SegmentInsightUpdate) this.instance).getInfoList());
        }

        public Builder removeInfo(int i2) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).removeInfo(i2);
            return this;
        }

        public Builder setInfo(int i2, SegmentInsightInfo.Builder builder) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).setInfo(i2, builder.build());
            return this;
        }

        public Builder addInfo(int i2, SegmentInsightInfo segmentInsightInfo) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).addInfo(i2, segmentInsightInfo);
            return this;
        }

        public Builder setInfo(int i2, SegmentInsightInfo segmentInsightInfo) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).setInfo(i2, segmentInsightInfo);
            return this;
        }

        public Builder addInfo(SegmentInsightInfo.Builder builder) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).addInfo(builder.build());
            return this;
        }

        public Builder addInfo(SegmentInsightInfo segmentInsightInfo) {
            copyOnWrite();
            ((SegmentInsightUpdate) this.instance).addInfo(segmentInsightInfo);
            return this;
        }
    }

    public static SegmentInsightUpdate parseFrom(byte[] bArr) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SegmentInsightUpdate parseFrom(byte[] bArr, de deVar) {
        return (SegmentInsightUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
