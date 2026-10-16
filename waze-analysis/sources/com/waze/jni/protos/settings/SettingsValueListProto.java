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
import com.waze.jni.protos.settings.SettingsValueProto;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SettingsValueListProto extends du<SettingsValueListProto, Builder> implements SettingsValueListProtoOrBuilder {
    private static final SettingsValueListProto DEFAULT_INSTANCE;
    private static volatile fo<SettingsValueListProto> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private eo<SettingsValueProto> values_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.SettingsValueListProto$1, reason: invalid class name */
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
        SettingsValueListProto settingsValueListProto = new SettingsValueListProto();
        DEFAULT_INSTANCE = settingsValueListProto;
        du.registerDefaultInstance(SettingsValueListProto.class, settingsValueListProto);
    }

    private SettingsValueListProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends SettingsValueProto> iterable) {
        ensureValuesIsMutable();
        c.addAll(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i2, SettingsValueProto settingsValueProto) {
        Objects.requireNonNull(settingsValueProto);
        ensureValuesIsMutable();
        this.values_.add(i2, settingsValueProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        eo<SettingsValueProto> eoVar = this.values_;
        if (eoVar.c()) {
            return;
        }
        this.values_ = du.mutableCopy(eoVar);
    }

    public static SettingsValueListProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsValueListProto parseDelimitedFrom(InputStream inputStream) {
        return (SettingsValueListProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsValueListProto parseFrom(v vVar) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SettingsValueListProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i2) {
        ensureValuesIsMutable();
        this.values_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i2, SettingsValueProto settingsValueProto) {
        Objects.requireNonNull(settingsValueProto);
        ensureValuesIsMutable();
        this.values_.set(i2, settingsValueProto);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", SettingsValueProto.class});
        }
        if (iOrdinal == 3) {
            return new SettingsValueListProto();
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
        fo<SettingsValueListProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SettingsValueListProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.SettingsValueListProtoOrBuilder
    public SettingsValueProto getValues(int i2) {
        return this.values_.get(i2);
    }

    @Override // com.waze.jni.protos.settings.SettingsValueListProtoOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.waze.jni.protos.settings.SettingsValueListProtoOrBuilder
    public List<SettingsValueProto> getValuesList() {
        return this.values_;
    }

    public SettingsValueProtoOrBuilder getValuesOrBuilder(int i2) {
        return this.values_.get(i2);
    }

    public List<? extends SettingsValueProtoOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public static Builder newBuilder(SettingsValueListProto settingsValueListProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(settingsValueListProto);
    }

    public static SettingsValueListProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SettingsValueListProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SettingsValueListProto parseFrom(v vVar, de deVar) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SettingsValueListProto parseFrom(z zVar) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SettingsValueListProto parseFrom(z zVar, de deVar) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(SettingsValueProto settingsValueProto) {
        Objects.requireNonNull(settingsValueProto);
        ensureValuesIsMutable();
        this.values_.add(settingsValueProto);
    }

    public static SettingsValueListProto parseFrom(InputStream inputStream) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsValueListProto parseFrom(InputStream inputStream, de deVar) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SettingsValueListProto parseFrom(ByteBuffer byteBuffer) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SettingsValueListProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<SettingsValueListProto, Builder> implements SettingsValueListProtoOrBuilder {
        private Builder() {
            super(SettingsValueListProto.DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends SettingsValueProto> iterable) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).addAllValues(iterable);
            return this;
        }

        public Builder addValues(int i2, SettingsValueProto.Builder builder) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).addValues(i2, builder.build());
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).clearValues();
            return this;
        }

        @Override // com.waze.jni.protos.settings.SettingsValueListProtoOrBuilder
        public SettingsValueProto getValues(int i2) {
            return ((SettingsValueListProto) this.instance).getValues(i2);
        }

        @Override // com.waze.jni.protos.settings.SettingsValueListProtoOrBuilder
        public int getValuesCount() {
            return ((SettingsValueListProto) this.instance).getValuesCount();
        }

        @Override // com.waze.jni.protos.settings.SettingsValueListProtoOrBuilder
        public List<SettingsValueProto> getValuesList() {
            return DesugarCollections.unmodifiableList(((SettingsValueListProto) this.instance).getValuesList());
        }

        public Builder removeValues(int i2) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).removeValues(i2);
            return this;
        }

        public Builder setValues(int i2, SettingsValueProto.Builder builder) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).setValues(i2, builder.build());
            return this;
        }

        public Builder addValues(int i2, SettingsValueProto settingsValueProto) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).addValues(i2, settingsValueProto);
            return this;
        }

        public Builder setValues(int i2, SettingsValueProto settingsValueProto) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).setValues(i2, settingsValueProto);
            return this;
        }

        public Builder addValues(SettingsValueProto.Builder builder) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).addValues(builder.build());
            return this;
        }

        public Builder addValues(SettingsValueProto settingsValueProto) {
            copyOnWrite();
            ((SettingsValueListProto) this.instance).addValues(settingsValueProto);
            return this;
        }
    }

    public static SettingsValueListProto parseFrom(byte[] bArr) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsValueListProto parseFrom(byte[] bArr, de deVar) {
        return (SettingsValueListProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
