package com.waze.jni.protos;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
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
public final class FirebaseEvent extends du<FirebaseEvent, Builder> implements FirebaseEventOrBuilder {
    private static final FirebaseEvent DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fo<FirebaseEvent> PARSER;
    private String name_ = "";
    private eo<Param> params_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.FirebaseEvent$1, reason: invalid class name */
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
    public interface ParamOrBuilder extends fj {
        String getName();

        v getNameBytes();

        String getValue();

        v getValueBytes();
    }

    static {
        FirebaseEvent firebaseEvent = new FirebaseEvent();
        DEFAULT_INSTANCE = firebaseEvent;
        du.registerDefaultInstance(FirebaseEvent.class, firebaseEvent);
    }

    private FirebaseEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParams(Iterable<? extends Param> iterable) {
        ensureParamsIsMutable();
        c.addAll(iterable, this.params_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParams(int i2, Param param) {
        Objects.requireNonNull(param);
        ensureParamsIsMutable();
        this.params_.add(i2, param);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = emptyProtobufList();
    }

    private void ensureParamsIsMutable() {
        eo<Param> eoVar = this.params_;
        if (eoVar.c()) {
            return;
        }
        this.params_ = du.mutableCopy(eoVar);
    }

    public static FirebaseEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FirebaseEvent parseDelimitedFrom(InputStream inputStream) {
        return (FirebaseEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FirebaseEvent parseFrom(v vVar) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<FirebaseEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParams(int i2) {
        ensureParamsIsMutable();
        this.params_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(int i2, Param param) {
        Objects.requireNonNull(param);
        ensureParamsIsMutable();
        this.params_.set(i2, param);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"name_", "params_", Param.class});
        }
        if (iOrdinal == 3) {
            return new FirebaseEvent();
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
        fo<FirebaseEvent> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (FirebaseEvent.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.FirebaseEventOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.FirebaseEventOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.FirebaseEventOrBuilder
    public Param getParams(int i2) {
        return this.params_.get(i2);
    }

    @Override // com.waze.jni.protos.FirebaseEventOrBuilder
    public int getParamsCount() {
        return this.params_.size();
    }

    @Override // com.waze.jni.protos.FirebaseEventOrBuilder
    public List<Param> getParamsList() {
        return this.params_;
    }

    public ParamOrBuilder getParamsOrBuilder(int i2) {
        return this.params_.get(i2);
    }

    public List<? extends ParamOrBuilder> getParamsOrBuilderList() {
        return this.params_;
    }

    /* compiled from: WazeSource */
    public final class Param extends du<Param, Builder> implements ParamOrBuilder {
        private static final Param DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile fo<Param> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String name_ = "";
        private String value_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<Param, Builder> implements ParamOrBuilder {
            private Builder() {
                super(Param.DEFAULT_INSTANCE);
            }

            public Builder clearName() {
                copyOnWrite();
                ((Param) this.instance).clearName();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Param) this.instance).clearValue();
                return this;
            }

            @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
            public String getName() {
                return ((Param) this.instance).getName();
            }

            @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
            public v getNameBytes() {
                return ((Param) this.instance).getNameBytes();
            }

            @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
            public String getValue() {
                return ((Param) this.instance).getValue();
            }

            @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
            public v getValueBytes() {
                return ((Param) this.instance).getValueBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Param) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(v vVar) {
                copyOnWrite();
                ((Param) this.instance).setNameBytes(vVar);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((Param) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(v vVar) {
                copyOnWrite();
                ((Param) this.instance).setValueBytes(vVar);
                return this;
            }
        }

        static {
            Param param = new Param();
            DEFAULT_INSTANCE = param;
            du.registerDefaultInstance(Param.class, param);
        }

        private Param() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static Param getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Param parseDelimitedFrom(InputStream inputStream) {
            return (Param) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Param parseFrom(v vVar) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Param> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            Objects.requireNonNull(str);
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.name_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            Objects.requireNonNull(str);
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.value_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "value_"});
            }
            if (iOrdinal == 3) {
                return new Param();
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
            fo<Param> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Param.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
        public v getNameBytes() {
            return v.s(this.name_);
        }

        @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.waze.jni.protos.FirebaseEvent.ParamOrBuilder
        public v getValueBytes() {
            return v.s(this.value_);
        }

        public static Builder newBuilder(Param param) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(param);
        }

        public static Param parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Param) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Param parseFrom(v vVar, de deVar) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Param parseFrom(z zVar) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Param parseFrom(z zVar, de deVar) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Param parseFrom(InputStream inputStream) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Param parseFrom(InputStream inputStream, de deVar) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Param parseFrom(ByteBuffer byteBuffer) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Param parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Param parseFrom(byte[] bArr) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Param parseFrom(byte[] bArr, de deVar) {
            return (Param) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(FirebaseEvent firebaseEvent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(firebaseEvent);
    }

    public static FirebaseEvent parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (FirebaseEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FirebaseEvent parseFrom(v vVar, de deVar) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static FirebaseEvent parseFrom(z zVar) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static FirebaseEvent parseFrom(z zVar, de deVar) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParams(Param param) {
        Objects.requireNonNull(param);
        ensureParamsIsMutable();
        this.params_.add(param);
    }

    public static FirebaseEvent parseFrom(InputStream inputStream) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FirebaseEvent parseFrom(InputStream inputStream, de deVar) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FirebaseEvent parseFrom(ByteBuffer byteBuffer) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FirebaseEvent parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<FirebaseEvent, Builder> implements FirebaseEventOrBuilder {
        private Builder() {
            super(FirebaseEvent.DEFAULT_INSTANCE);
        }

        public Builder addAllParams(Iterable<? extends Param> iterable) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).addAllParams(iterable);
            return this;
        }

        public Builder addParams(int i2, Param.Builder builder) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).addParams(i2, builder.build());
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((FirebaseEvent) this.instance).clearName();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((FirebaseEvent) this.instance).clearParams();
            return this;
        }

        @Override // com.waze.jni.protos.FirebaseEventOrBuilder
        public String getName() {
            return ((FirebaseEvent) this.instance).getName();
        }

        @Override // com.waze.jni.protos.FirebaseEventOrBuilder
        public v getNameBytes() {
            return ((FirebaseEvent) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.FirebaseEventOrBuilder
        public Param getParams(int i2) {
            return ((FirebaseEvent) this.instance).getParams(i2);
        }

        @Override // com.waze.jni.protos.FirebaseEventOrBuilder
        public int getParamsCount() {
            return ((FirebaseEvent) this.instance).getParamsCount();
        }

        @Override // com.waze.jni.protos.FirebaseEventOrBuilder
        public List<Param> getParamsList() {
            return DesugarCollections.unmodifiableList(((FirebaseEvent) this.instance).getParamsList());
        }

        public Builder removeParams(int i2) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).removeParams(i2);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setParams(int i2, Param.Builder builder) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).setParams(i2, builder.build());
            return this;
        }

        public Builder addParams(int i2, Param param) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).addParams(i2, param);
            return this;
        }

        public Builder setParams(int i2, Param param) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).setParams(i2, param);
            return this;
        }

        public Builder addParams(Param.Builder builder) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).addParams(builder.build());
            return this;
        }

        public Builder addParams(Param param) {
            copyOnWrite();
            ((FirebaseEvent) this.instance).addParams(param);
            return this;
        }
    }

    public static FirebaseEvent parseFrom(byte[] bArr) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FirebaseEvent parseFrom(byte[] bArr, de deVar) {
        return (FirebaseEvent) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
