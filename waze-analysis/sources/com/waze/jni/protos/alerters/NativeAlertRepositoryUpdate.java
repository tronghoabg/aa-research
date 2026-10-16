package com.waze.jni.protos.alerters;

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
import com.waze.jni.protos.alerters.NativeAlertDescriptor;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeAlertRepositoryUpdate extends du<NativeAlertRepositoryUpdate, Builder> implements NativeAlertRepositoryUpdateOrBuilder {
    private static final NativeAlertRepositoryUpdate DEFAULT_INSTANCE;
    public static final int DESCRIPTORS_FIELD_NUMBER = 1;
    private static volatile fo<NativeAlertRepositoryUpdate> PARSER;
    private eo<NativeAlertDescriptor> descriptors_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.NativeAlertRepositoryUpdate$1, reason: invalid class name */
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
        NativeAlertRepositoryUpdate nativeAlertRepositoryUpdate = new NativeAlertRepositoryUpdate();
        DEFAULT_INSTANCE = nativeAlertRepositoryUpdate;
        du.registerDefaultInstance(NativeAlertRepositoryUpdate.class, nativeAlertRepositoryUpdate);
    }

    private NativeAlertRepositoryUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDescriptors(Iterable<? extends NativeAlertDescriptor> iterable) {
        ensureDescriptorsIsMutable();
        c.addAll(iterable, this.descriptors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescriptors(int i2, NativeAlertDescriptor nativeAlertDescriptor) {
        Objects.requireNonNull(nativeAlertDescriptor);
        ensureDescriptorsIsMutable();
        this.descriptors_.add(i2, nativeAlertDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescriptors() {
        this.descriptors_ = emptyProtobufList();
    }

    private void ensureDescriptorsIsMutable() {
        eo<NativeAlertDescriptor> eoVar = this.descriptors_;
        if (eoVar.c()) {
            return;
        }
        this.descriptors_ = du.mutableCopy(eoVar);
    }

    public static NativeAlertRepositoryUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeAlertRepositoryUpdate parseDelimitedFrom(InputStream inputStream) {
        return (NativeAlertRepositoryUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeAlertRepositoryUpdate parseFrom(v vVar) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NativeAlertRepositoryUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDescriptors(int i2) {
        ensureDescriptorsIsMutable();
        this.descriptors_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptors(int i2, NativeAlertDescriptor nativeAlertDescriptor) {
        Objects.requireNonNull(nativeAlertDescriptor);
        ensureDescriptorsIsMutable();
        this.descriptors_.set(i2, nativeAlertDescriptor);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"descriptors_", NativeAlertDescriptor.class});
        }
        if (iOrdinal == 3) {
            return new NativeAlertRepositoryUpdate();
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
        fo<NativeAlertRepositoryUpdate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NativeAlertRepositoryUpdate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertRepositoryUpdateOrBuilder
    public NativeAlertDescriptor getDescriptors(int i2) {
        return this.descriptors_.get(i2);
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertRepositoryUpdateOrBuilder
    public int getDescriptorsCount() {
        return this.descriptors_.size();
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertRepositoryUpdateOrBuilder
    public List<NativeAlertDescriptor> getDescriptorsList() {
        return this.descriptors_;
    }

    public NativeAlertDescriptorOrBuilder getDescriptorsOrBuilder(int i2) {
        return this.descriptors_.get(i2);
    }

    public List<? extends NativeAlertDescriptorOrBuilder> getDescriptorsOrBuilderList() {
        return this.descriptors_;
    }

    public static Builder newBuilder(NativeAlertRepositoryUpdate nativeAlertRepositoryUpdate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeAlertRepositoryUpdate);
    }

    public static NativeAlertRepositoryUpdate parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NativeAlertRepositoryUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeAlertRepositoryUpdate parseFrom(v vVar, de deVar) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NativeAlertRepositoryUpdate parseFrom(z zVar) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NativeAlertRepositoryUpdate parseFrom(z zVar, de deVar) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescriptors(NativeAlertDescriptor nativeAlertDescriptor) {
        Objects.requireNonNull(nativeAlertDescriptor);
        ensureDescriptorsIsMutable();
        this.descriptors_.add(nativeAlertDescriptor);
    }

    public static NativeAlertRepositoryUpdate parseFrom(InputStream inputStream) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeAlertRepositoryUpdate parseFrom(InputStream inputStream, de deVar) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeAlertRepositoryUpdate parseFrom(ByteBuffer byteBuffer) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeAlertRepositoryUpdate parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NativeAlertRepositoryUpdate, Builder> implements NativeAlertRepositoryUpdateOrBuilder {
        private Builder() {
            super(NativeAlertRepositoryUpdate.DEFAULT_INSTANCE);
        }

        public Builder addAllDescriptors(Iterable<? extends NativeAlertDescriptor> iterable) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).addAllDescriptors(iterable);
            return this;
        }

        public Builder addDescriptors(int i2, NativeAlertDescriptor.Builder builder) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).addDescriptors(i2, builder.build());
            return this;
        }

        public Builder clearDescriptors() {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).clearDescriptors();
            return this;
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertRepositoryUpdateOrBuilder
        public NativeAlertDescriptor getDescriptors(int i2) {
            return ((NativeAlertRepositoryUpdate) this.instance).getDescriptors(i2);
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertRepositoryUpdateOrBuilder
        public int getDescriptorsCount() {
            return ((NativeAlertRepositoryUpdate) this.instance).getDescriptorsCount();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertRepositoryUpdateOrBuilder
        public List<NativeAlertDescriptor> getDescriptorsList() {
            return DesugarCollections.unmodifiableList(((NativeAlertRepositoryUpdate) this.instance).getDescriptorsList());
        }

        public Builder removeDescriptors(int i2) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).removeDescriptors(i2);
            return this;
        }

        public Builder setDescriptors(int i2, NativeAlertDescriptor.Builder builder) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).setDescriptors(i2, builder.build());
            return this;
        }

        public Builder addDescriptors(int i2, NativeAlertDescriptor nativeAlertDescriptor) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).addDescriptors(i2, nativeAlertDescriptor);
            return this;
        }

        public Builder setDescriptors(int i2, NativeAlertDescriptor nativeAlertDescriptor) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).setDescriptors(i2, nativeAlertDescriptor);
            return this;
        }

        public Builder addDescriptors(NativeAlertDescriptor.Builder builder) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).addDescriptors(builder.build());
            return this;
        }

        public Builder addDescriptors(NativeAlertDescriptor nativeAlertDescriptor) {
            copyOnWrite();
            ((NativeAlertRepositoryUpdate) this.instance).addDescriptors(nativeAlertDescriptor);
            return this;
        }
    }

    public static NativeAlertRepositoryUpdate parseFrom(byte[] bArr) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeAlertRepositoryUpdate parseFrom(byte[] bArr, de deVar) {
        return (NativeAlertRepositoryUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
