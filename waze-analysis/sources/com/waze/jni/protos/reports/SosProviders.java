package com.waze.jni.protos.reports;

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
import com.waze.jni.protos.reports.SosProvider;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SosProviders extends du<SosProviders, Builder> implements SosProvidersOrBuilder {
    private static final SosProviders DEFAULT_INSTANCE;
    private static volatile fo<SosProviders> PARSER = null;
    public static final int SOS_PROVIDERS_FIELD_NUMBER = 1;
    private eo<SosProvider> sosProviders_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.reports.SosProviders$1, reason: invalid class name */
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
        SosProviders sosProviders = new SosProviders();
        DEFAULT_INSTANCE = sosProviders;
        du.registerDefaultInstance(SosProviders.class, sosProviders);
    }

    private SosProviders() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSosProviders(Iterable<? extends SosProvider> iterable) {
        ensureSosProvidersIsMutable();
        c.addAll(iterable, this.sosProviders_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSosProviders(int i2, SosProvider sosProvider) {
        Objects.requireNonNull(sosProvider);
        ensureSosProvidersIsMutable();
        this.sosProviders_.add(i2, sosProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSosProviders() {
        this.sosProviders_ = emptyProtobufList();
    }

    private void ensureSosProvidersIsMutable() {
        eo<SosProvider> eoVar = this.sosProviders_;
        if (eoVar.c()) {
            return;
        }
        this.sosProviders_ = du.mutableCopy(eoVar);
    }

    public static SosProviders getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SosProviders parseDelimitedFrom(InputStream inputStream) {
        return (SosProviders) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SosProviders parseFrom(v vVar) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SosProviders> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSosProviders(int i2) {
        ensureSosProvidersIsMutable();
        this.sosProviders_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSosProviders(int i2, SosProvider sosProvider) {
        Objects.requireNonNull(sosProvider);
        ensureSosProvidersIsMutable();
        this.sosProviders_.set(i2, sosProvider);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sosProviders_", SosProvider.class});
        }
        if (iOrdinal == 3) {
            return new SosProviders();
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
        fo<SosProviders> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SosProviders.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.reports.SosProvidersOrBuilder
    public SosProvider getSosProviders(int i2) {
        return this.sosProviders_.get(i2);
    }

    @Override // com.waze.jni.protos.reports.SosProvidersOrBuilder
    public int getSosProvidersCount() {
        return this.sosProviders_.size();
    }

    @Override // com.waze.jni.protos.reports.SosProvidersOrBuilder
    public List<SosProvider> getSosProvidersList() {
        return this.sosProviders_;
    }

    public SosProviderOrBuilder getSosProvidersOrBuilder(int i2) {
        return this.sosProviders_.get(i2);
    }

    public List<? extends SosProviderOrBuilder> getSosProvidersOrBuilderList() {
        return this.sosProviders_;
    }

    public static Builder newBuilder(SosProviders sosProviders) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sosProviders);
    }

    public static SosProviders parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SosProviders) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SosProviders parseFrom(v vVar, de deVar) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SosProviders parseFrom(z zVar) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SosProviders parseFrom(z zVar, de deVar) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSosProviders(SosProvider sosProvider) {
        Objects.requireNonNull(sosProvider);
        ensureSosProvidersIsMutable();
        this.sosProviders_.add(sosProvider);
    }

    public static SosProviders parseFrom(InputStream inputStream) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SosProviders parseFrom(InputStream inputStream, de deVar) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SosProviders parseFrom(ByteBuffer byteBuffer) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SosProviders parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<SosProviders, Builder> implements SosProvidersOrBuilder {
        private Builder() {
            super(SosProviders.DEFAULT_INSTANCE);
        }

        public Builder addAllSosProviders(Iterable<? extends SosProvider> iterable) {
            copyOnWrite();
            ((SosProviders) this.instance).addAllSosProviders(iterable);
            return this;
        }

        public Builder addSosProviders(int i2, SosProvider.Builder builder) {
            copyOnWrite();
            ((SosProviders) this.instance).addSosProviders(i2, builder.build());
            return this;
        }

        public Builder clearSosProviders() {
            copyOnWrite();
            ((SosProviders) this.instance).clearSosProviders();
            return this;
        }

        @Override // com.waze.jni.protos.reports.SosProvidersOrBuilder
        public SosProvider getSosProviders(int i2) {
            return ((SosProviders) this.instance).getSosProviders(i2);
        }

        @Override // com.waze.jni.protos.reports.SosProvidersOrBuilder
        public int getSosProvidersCount() {
            return ((SosProviders) this.instance).getSosProvidersCount();
        }

        @Override // com.waze.jni.protos.reports.SosProvidersOrBuilder
        public List<SosProvider> getSosProvidersList() {
            return DesugarCollections.unmodifiableList(((SosProviders) this.instance).getSosProvidersList());
        }

        public Builder removeSosProviders(int i2) {
            copyOnWrite();
            ((SosProviders) this.instance).removeSosProviders(i2);
            return this;
        }

        public Builder setSosProviders(int i2, SosProvider.Builder builder) {
            copyOnWrite();
            ((SosProviders) this.instance).setSosProviders(i2, builder.build());
            return this;
        }

        public Builder addSosProviders(int i2, SosProvider sosProvider) {
            copyOnWrite();
            ((SosProviders) this.instance).addSosProviders(i2, sosProvider);
            return this;
        }

        public Builder setSosProviders(int i2, SosProvider sosProvider) {
            copyOnWrite();
            ((SosProviders) this.instance).setSosProviders(i2, sosProvider);
            return this;
        }

        public Builder addSosProviders(SosProvider.Builder builder) {
            copyOnWrite();
            ((SosProviders) this.instance).addSosProviders(builder.build());
            return this;
        }

        public Builder addSosProviders(SosProvider sosProvider) {
            copyOnWrite();
            ((SosProviders) this.instance).addSosProviders(sosProvider);
            return this;
        }
    }

    public static SosProviders parseFrom(byte[] bArr) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SosProviders parseFrom(byte[] bArr, de deVar) {
        return (SosProviders) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
