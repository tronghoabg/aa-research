package com.waze.jni.protos.settings;

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
import com.waze.jni.protos.settings.VoiceData;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceDataList extends du<VoiceDataList, Builder> implements VoiceDataListOrBuilder {
    private static final VoiceDataList DEFAULT_INSTANCE;
    private static volatile fo<VoiceDataList> PARSER = null;
    public static final int VOICES_FIELD_NUMBER = 1;
    private eo<VoiceData> voices_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.VoiceDataList$1, reason: invalid class name */
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
        VoiceDataList voiceDataList = new VoiceDataList();
        DEFAULT_INSTANCE = voiceDataList;
        du.registerDefaultInstance(VoiceDataList.class, voiceDataList);
    }

    private VoiceDataList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVoices(Iterable<? extends VoiceData> iterable) {
        ensureVoicesIsMutable();
        c.addAll(iterable, this.voices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoices(int i2, VoiceData voiceData) {
        Objects.requireNonNull(voiceData);
        ensureVoicesIsMutable();
        this.voices_.add(i2, voiceData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoices() {
        this.voices_ = emptyProtobufList();
    }

    private void ensureVoicesIsMutable() {
        eo<VoiceData> eoVar = this.voices_;
        if (eoVar.c()) {
            return;
        }
        this.voices_ = du.mutableCopy(eoVar);
    }

    public static VoiceDataList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VoiceDataList parseDelimitedFrom(InputStream inputStream) {
        return (VoiceDataList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceDataList parseFrom(v vVar) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VoiceDataList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVoices(int i2) {
        ensureVoicesIsMutable();
        this.voices_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoices(int i2, VoiceData voiceData) {
        Objects.requireNonNull(voiceData);
        ensureVoicesIsMutable();
        this.voices_.set(i2, voiceData);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"voices_", VoiceData.class});
        }
        if (iOrdinal == 3) {
            return new VoiceDataList();
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
        fo<VoiceDataList> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VoiceDataList.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.VoiceDataListOrBuilder
    public VoiceData getVoices(int i2) {
        return this.voices_.get(i2);
    }

    @Override // com.waze.jni.protos.settings.VoiceDataListOrBuilder
    public int getVoicesCount() {
        return this.voices_.size();
    }

    @Override // com.waze.jni.protos.settings.VoiceDataListOrBuilder
    public List<VoiceData> getVoicesList() {
        return this.voices_;
    }

    public VoiceDataOrBuilder getVoicesOrBuilder(int i2) {
        return this.voices_.get(i2);
    }

    public List<? extends VoiceDataOrBuilder> getVoicesOrBuilderList() {
        return this.voices_;
    }

    public static Builder newBuilder(VoiceDataList voiceDataList) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(voiceDataList);
    }

    public static VoiceDataList parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VoiceDataList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceDataList parseFrom(v vVar, de deVar) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VoiceDataList parseFrom(z zVar) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VoiceDataList parseFrom(z zVar, de deVar) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoices(VoiceData voiceData) {
        Objects.requireNonNull(voiceData);
        ensureVoicesIsMutable();
        this.voices_.add(voiceData);
    }

    public static VoiceDataList parseFrom(InputStream inputStream) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceDataList parseFrom(InputStream inputStream, de deVar) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceDataList parseFrom(ByteBuffer byteBuffer) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VoiceDataList parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<VoiceDataList, Builder> implements VoiceDataListOrBuilder {
        private Builder() {
            super(VoiceDataList.DEFAULT_INSTANCE);
        }

        public Builder addAllVoices(Iterable<? extends VoiceData> iterable) {
            copyOnWrite();
            ((VoiceDataList) this.instance).addAllVoices(iterable);
            return this;
        }

        public Builder addVoices(int i2, VoiceData.Builder builder) {
            copyOnWrite();
            ((VoiceDataList) this.instance).addVoices(i2, builder.build());
            return this;
        }

        public Builder clearVoices() {
            copyOnWrite();
            ((VoiceDataList) this.instance).clearVoices();
            return this;
        }

        @Override // com.waze.jni.protos.settings.VoiceDataListOrBuilder
        public VoiceData getVoices(int i2) {
            return ((VoiceDataList) this.instance).getVoices(i2);
        }

        @Override // com.waze.jni.protos.settings.VoiceDataListOrBuilder
        public int getVoicesCount() {
            return ((VoiceDataList) this.instance).getVoicesCount();
        }

        @Override // com.waze.jni.protos.settings.VoiceDataListOrBuilder
        public List<VoiceData> getVoicesList() {
            return DesugarCollections.unmodifiableList(((VoiceDataList) this.instance).getVoicesList());
        }

        public Builder removeVoices(int i2) {
            copyOnWrite();
            ((VoiceDataList) this.instance).removeVoices(i2);
            return this;
        }

        public Builder setVoices(int i2, VoiceData.Builder builder) {
            copyOnWrite();
            ((VoiceDataList) this.instance).setVoices(i2, builder.build());
            return this;
        }

        public Builder addVoices(int i2, VoiceData voiceData) {
            copyOnWrite();
            ((VoiceDataList) this.instance).addVoices(i2, voiceData);
            return this;
        }

        public Builder setVoices(int i2, VoiceData voiceData) {
            copyOnWrite();
            ((VoiceDataList) this.instance).setVoices(i2, voiceData);
            return this;
        }

        public Builder addVoices(VoiceData.Builder builder) {
            copyOnWrite();
            ((VoiceDataList) this.instance).addVoices(builder.build());
            return this;
        }

        public Builder addVoices(VoiceData voiceData) {
            copyOnWrite();
            ((VoiceDataList) this.instance).addVoices(voiceData);
            return this;
        }
    }

    public static VoiceDataList parseFrom(byte[] bArr) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VoiceDataList parseFrom(byte[] bArr, de deVar) {
        return (VoiceDataList) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
