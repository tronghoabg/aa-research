package com.waze.jni.protos.ev;

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
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EVNetworkData extends du<EVNetworkData, Builder> implements EVNetworkDataOrBuilder {
    private static final EVNetworkData DEFAULT_INSTANCE;
    public static final int EV_NETWORKS_FIELD_NUMBER = 1;
    private static volatile fo<EVNetworkData> PARSER;
    private eo<String> evNetworks_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.ev.EVNetworkData$1, reason: invalid class name */
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
    public final class Builder extends dm<EVNetworkData, Builder> implements EVNetworkDataOrBuilder {
        private Builder() {
            super(EVNetworkData.DEFAULT_INSTANCE);
        }

        public Builder addAllEvNetworks(Iterable<String> iterable) {
            copyOnWrite();
            ((EVNetworkData) this.instance).addAllEvNetworks(iterable);
            return this;
        }

        public Builder addEvNetworks(String str) {
            copyOnWrite();
            ((EVNetworkData) this.instance).addEvNetworks(str);
            return this;
        }

        public Builder addEvNetworksBytes(v vVar) {
            copyOnWrite();
            ((EVNetworkData) this.instance).addEvNetworksBytes(vVar);
            return this;
        }

        public Builder clearEvNetworks() {
            copyOnWrite();
            ((EVNetworkData) this.instance).clearEvNetworks();
            return this;
        }

        @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
        public String getEvNetworks(int i2) {
            return ((EVNetworkData) this.instance).getEvNetworks(i2);
        }

        @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
        public v getEvNetworksBytes(int i2) {
            return ((EVNetworkData) this.instance).getEvNetworksBytes(i2);
        }

        @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
        public int getEvNetworksCount() {
            return ((EVNetworkData) this.instance).getEvNetworksCount();
        }

        @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
        public List<String> getEvNetworksList() {
            return DesugarCollections.unmodifiableList(((EVNetworkData) this.instance).getEvNetworksList());
        }

        public Builder setEvNetworks(int i2, String str) {
            copyOnWrite();
            ((EVNetworkData) this.instance).setEvNetworks(i2, str);
            return this;
        }
    }

    static {
        EVNetworkData eVNetworkData = new EVNetworkData();
        DEFAULT_INSTANCE = eVNetworkData;
        du.registerDefaultInstance(EVNetworkData.class, eVNetworkData);
    }

    private EVNetworkData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvNetworks(Iterable<String> iterable) {
        ensureEvNetworksIsMutable();
        c.addAll(iterable, this.evNetworks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvNetworks(String str) {
        Objects.requireNonNull(str);
        ensureEvNetworksIsMutable();
        this.evNetworks_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvNetworksBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureEvNetworksIsMutable();
        this.evNetworks_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvNetworks() {
        this.evNetworks_ = emptyProtobufList();
    }

    private void ensureEvNetworksIsMutable() {
        eo<String> eoVar = this.evNetworks_;
        if (eoVar.c()) {
            return;
        }
        this.evNetworks_ = du.mutableCopy(eoVar);
    }

    public static EVNetworkData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EVNetworkData parseDelimitedFrom(InputStream inputStream) {
        return (EVNetworkData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EVNetworkData parseFrom(v vVar) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EVNetworkData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvNetworks(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEvNetworksIsMutable();
        this.evNetworks_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"evNetworks_"});
        }
        if (iOrdinal == 3) {
            return new EVNetworkData();
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
        fo<EVNetworkData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EVNetworkData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
    public String getEvNetworks(int i2) {
        return this.evNetworks_.get(i2);
    }

    @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
    public v getEvNetworksBytes(int i2) {
        return v.s(this.evNetworks_.get(i2));
    }

    @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
    public int getEvNetworksCount() {
        return this.evNetworks_.size();
    }

    @Override // com.waze.jni.protos.ev.EVNetworkDataOrBuilder
    public List<String> getEvNetworksList() {
        return this.evNetworks_;
    }

    public static Builder newBuilder(EVNetworkData eVNetworkData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eVNetworkData);
    }

    public static EVNetworkData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EVNetworkData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EVNetworkData parseFrom(v vVar, de deVar) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EVNetworkData parseFrom(z zVar) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EVNetworkData parseFrom(z zVar, de deVar) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static EVNetworkData parseFrom(InputStream inputStream) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EVNetworkData parseFrom(InputStream inputStream, de deVar) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EVNetworkData parseFrom(ByteBuffer byteBuffer) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EVNetworkData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static EVNetworkData parseFrom(byte[] bArr) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EVNetworkData parseFrom(byte[] bArr, de deVar) {
        return (EVNetworkData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
