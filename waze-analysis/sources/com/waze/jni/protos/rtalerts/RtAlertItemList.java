package com.waze.jni.protos.rtalerts;

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
import com.waze.jni.protos.rtalerts.RtAlertItem;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertItemList extends du<RtAlertItemList, Builder> implements RtAlertItemListOrBuilder {
    private static final RtAlertItemList DEFAULT_INSTANCE;
    private static volatile fo<RtAlertItemList> PARSER = null;
    public static final int RTALERTITEM_FIELD_NUMBER = 1;
    private eo<RtAlertItem> rtAlertItem_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.rtalerts.RtAlertItemList$1, reason: invalid class name */
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
        RtAlertItemList rtAlertItemList = new RtAlertItemList();
        DEFAULT_INSTANCE = rtAlertItemList;
        du.registerDefaultInstance(RtAlertItemList.class, rtAlertItemList);
    }

    private RtAlertItemList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRtAlertItem(Iterable<? extends RtAlertItem> iterable) {
        ensureRtAlertItemIsMutable();
        c.addAll(iterable, this.rtAlertItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRtAlertItem(int i2, RtAlertItem rtAlertItem) {
        Objects.requireNonNull(rtAlertItem);
        ensureRtAlertItemIsMutable();
        this.rtAlertItem_.add(i2, rtAlertItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtAlertItem() {
        this.rtAlertItem_ = emptyProtobufList();
    }

    private void ensureRtAlertItemIsMutable() {
        eo<RtAlertItem> eoVar = this.rtAlertItem_;
        if (eoVar.c()) {
            return;
        }
        this.rtAlertItem_ = du.mutableCopy(eoVar);
    }

    public static RtAlertItemList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RtAlertItemList parseDelimitedFrom(InputStream inputStream) {
        return (RtAlertItemList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RtAlertItemList parseFrom(v vVar) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RtAlertItemList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRtAlertItem(int i2) {
        ensureRtAlertItemIsMutable();
        this.rtAlertItem_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtAlertItem(int i2, RtAlertItem rtAlertItem) {
        Objects.requireNonNull(rtAlertItem);
        ensureRtAlertItemIsMutable();
        this.rtAlertItem_.set(i2, rtAlertItem);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rtAlertItem_", RtAlertItem.class});
        }
        if (iOrdinal == 3) {
            return new RtAlertItemList();
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
        fo<RtAlertItemList> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RtAlertItemList.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemListOrBuilder
    public RtAlertItem getRtAlertItem(int i2) {
        return this.rtAlertItem_.get(i2);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemListOrBuilder
    public int getRtAlertItemCount() {
        return this.rtAlertItem_.size();
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemListOrBuilder
    public List<RtAlertItem> getRtAlertItemList() {
        return this.rtAlertItem_;
    }

    public RtAlertItemOrBuilder getRtAlertItemOrBuilder(int i2) {
        return this.rtAlertItem_.get(i2);
    }

    public List<? extends RtAlertItemOrBuilder> getRtAlertItemOrBuilderList() {
        return this.rtAlertItem_;
    }

    public static Builder newBuilder(RtAlertItemList rtAlertItemList) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rtAlertItemList);
    }

    public static RtAlertItemList parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RtAlertItemList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RtAlertItemList parseFrom(v vVar, de deVar) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RtAlertItemList parseFrom(z zVar) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RtAlertItemList parseFrom(z zVar, de deVar) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRtAlertItem(RtAlertItem rtAlertItem) {
        Objects.requireNonNull(rtAlertItem);
        ensureRtAlertItemIsMutable();
        this.rtAlertItem_.add(rtAlertItem);
    }

    public static RtAlertItemList parseFrom(InputStream inputStream) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RtAlertItemList parseFrom(InputStream inputStream, de deVar) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RtAlertItemList parseFrom(ByteBuffer byteBuffer) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RtAlertItemList parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RtAlertItemList, Builder> implements RtAlertItemListOrBuilder {
        private Builder() {
            super(RtAlertItemList.DEFAULT_INSTANCE);
        }

        public Builder addAllRtAlertItem(Iterable<? extends RtAlertItem> iterable) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).addAllRtAlertItem(iterable);
            return this;
        }

        public Builder addRtAlertItem(int i2, RtAlertItem.Builder builder) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).addRtAlertItem(i2, builder.build());
            return this;
        }

        public Builder clearRtAlertItem() {
            copyOnWrite();
            ((RtAlertItemList) this.instance).clearRtAlertItem();
            return this;
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemListOrBuilder
        public RtAlertItem getRtAlertItem(int i2) {
            return ((RtAlertItemList) this.instance).getRtAlertItem(i2);
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemListOrBuilder
        public int getRtAlertItemCount() {
            return ((RtAlertItemList) this.instance).getRtAlertItemCount();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemListOrBuilder
        public List<RtAlertItem> getRtAlertItemList() {
            return DesugarCollections.unmodifiableList(((RtAlertItemList) this.instance).getRtAlertItemList());
        }

        public Builder removeRtAlertItem(int i2) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).removeRtAlertItem(i2);
            return this;
        }

        public Builder setRtAlertItem(int i2, RtAlertItem.Builder builder) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).setRtAlertItem(i2, builder.build());
            return this;
        }

        public Builder addRtAlertItem(int i2, RtAlertItem rtAlertItem) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).addRtAlertItem(i2, rtAlertItem);
            return this;
        }

        public Builder setRtAlertItem(int i2, RtAlertItem rtAlertItem) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).setRtAlertItem(i2, rtAlertItem);
            return this;
        }

        public Builder addRtAlertItem(RtAlertItem.Builder builder) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).addRtAlertItem(builder.build());
            return this;
        }

        public Builder addRtAlertItem(RtAlertItem rtAlertItem) {
            copyOnWrite();
            ((RtAlertItemList) this.instance).addRtAlertItem(rtAlertItem);
            return this;
        }
    }

    public static RtAlertItemList parseFrom(byte[] bArr) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RtAlertItemList parseFrom(byte[] bArr, de deVar) {
        return (RtAlertItemList) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
