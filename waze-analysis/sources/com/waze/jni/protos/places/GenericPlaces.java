package com.waze.jni.protos.places;

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
import com.waze.jni.protos.places.GenericPlace;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlaces extends du<GenericPlaces, Builder> implements GenericPlacesOrBuilder {
    private static final GenericPlaces DEFAULT_INSTANCE;
    public static final int GENERICPLACES_FIELD_NUMBER = 1;
    private static volatile fo<GenericPlaces> PARSER;
    private eo<GenericPlace> genericPlaces_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.GenericPlaces$1, reason: invalid class name */
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
        GenericPlaces genericPlaces = new GenericPlaces();
        DEFAULT_INSTANCE = genericPlaces;
        du.registerDefaultInstance(GenericPlaces.class, genericPlaces);
    }

    private GenericPlaces() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGenericPlaces(Iterable<? extends GenericPlace> iterable) {
        ensureGenericPlacesIsMutable();
        c.addAll(iterable, this.genericPlaces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGenericPlaces(int i2, GenericPlace genericPlace) {
        Objects.requireNonNull(genericPlace);
        ensureGenericPlacesIsMutable();
        this.genericPlaces_.add(i2, genericPlace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenericPlaces() {
        this.genericPlaces_ = emptyProtobufList();
    }

    private void ensureGenericPlacesIsMutable() {
        eo<GenericPlace> eoVar = this.genericPlaces_;
        if (eoVar.c()) {
            return;
        }
        this.genericPlaces_ = du.mutableCopy(eoVar);
    }

    public static GenericPlaces getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenericPlaces parseDelimitedFrom(InputStream inputStream) {
        return (GenericPlaces) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenericPlaces parseFrom(v vVar) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GenericPlaces> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGenericPlaces(int i2) {
        ensureGenericPlacesIsMutable();
        this.genericPlaces_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenericPlaces(int i2, GenericPlace genericPlace) {
        Objects.requireNonNull(genericPlace);
        ensureGenericPlacesIsMutable();
        this.genericPlaces_.set(i2, genericPlace);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"genericPlaces_", GenericPlace.class});
        }
        if (iOrdinal == 3) {
            return new GenericPlaces();
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
        fo<GenericPlaces> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GenericPlaces.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.GenericPlacesOrBuilder
    public GenericPlace getGenericPlaces(int i2) {
        return this.genericPlaces_.get(i2);
    }

    @Override // com.waze.jni.protos.places.GenericPlacesOrBuilder
    public int getGenericPlacesCount() {
        return this.genericPlaces_.size();
    }

    @Override // com.waze.jni.protos.places.GenericPlacesOrBuilder
    public List<GenericPlace> getGenericPlacesList() {
        return this.genericPlaces_;
    }

    public GenericPlaceOrBuilder getGenericPlacesOrBuilder(int i2) {
        return this.genericPlaces_.get(i2);
    }

    public List<? extends GenericPlaceOrBuilder> getGenericPlacesOrBuilderList() {
        return this.genericPlaces_;
    }

    public static Builder newBuilder(GenericPlaces genericPlaces) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(genericPlaces);
    }

    public static GenericPlaces parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GenericPlaces) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenericPlaces parseFrom(v vVar, de deVar) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GenericPlaces parseFrom(z zVar) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GenericPlaces parseFrom(z zVar, de deVar) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGenericPlaces(GenericPlace genericPlace) {
        Objects.requireNonNull(genericPlace);
        ensureGenericPlacesIsMutable();
        this.genericPlaces_.add(genericPlace);
    }

    public static GenericPlaces parseFrom(InputStream inputStream) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenericPlaces parseFrom(InputStream inputStream, de deVar) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenericPlaces parseFrom(ByteBuffer byteBuffer) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GenericPlaces parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<GenericPlaces, Builder> implements GenericPlacesOrBuilder {
        private Builder() {
            super(GenericPlaces.DEFAULT_INSTANCE);
        }

        public Builder addAllGenericPlaces(Iterable<? extends GenericPlace> iterable) {
            copyOnWrite();
            ((GenericPlaces) this.instance).addAllGenericPlaces(iterable);
            return this;
        }

        public Builder addGenericPlaces(int i2, GenericPlace.Builder builder) {
            copyOnWrite();
            ((GenericPlaces) this.instance).addGenericPlaces(i2, builder.build());
            return this;
        }

        public Builder clearGenericPlaces() {
            copyOnWrite();
            ((GenericPlaces) this.instance).clearGenericPlaces();
            return this;
        }

        @Override // com.waze.jni.protos.places.GenericPlacesOrBuilder
        public GenericPlace getGenericPlaces(int i2) {
            return ((GenericPlaces) this.instance).getGenericPlaces(i2);
        }

        @Override // com.waze.jni.protos.places.GenericPlacesOrBuilder
        public int getGenericPlacesCount() {
            return ((GenericPlaces) this.instance).getGenericPlacesCount();
        }

        @Override // com.waze.jni.protos.places.GenericPlacesOrBuilder
        public List<GenericPlace> getGenericPlacesList() {
            return DesugarCollections.unmodifiableList(((GenericPlaces) this.instance).getGenericPlacesList());
        }

        public Builder removeGenericPlaces(int i2) {
            copyOnWrite();
            ((GenericPlaces) this.instance).removeGenericPlaces(i2);
            return this;
        }

        public Builder setGenericPlaces(int i2, GenericPlace.Builder builder) {
            copyOnWrite();
            ((GenericPlaces) this.instance).setGenericPlaces(i2, builder.build());
            return this;
        }

        public Builder addGenericPlaces(int i2, GenericPlace genericPlace) {
            copyOnWrite();
            ((GenericPlaces) this.instance).addGenericPlaces(i2, genericPlace);
            return this;
        }

        public Builder setGenericPlaces(int i2, GenericPlace genericPlace) {
            copyOnWrite();
            ((GenericPlaces) this.instance).setGenericPlaces(i2, genericPlace);
            return this;
        }

        public Builder addGenericPlaces(GenericPlace.Builder builder) {
            copyOnWrite();
            ((GenericPlaces) this.instance).addGenericPlaces(builder.build());
            return this;
        }

        public Builder addGenericPlaces(GenericPlace genericPlace) {
            copyOnWrite();
            ((GenericPlaces) this.instance).addGenericPlaces(genericPlace);
            return this;
        }
    }

    public static GenericPlaces parseFrom(byte[] bArr) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenericPlaces parseFrom(byte[] bArr, de deVar) {
        return (GenericPlaces) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
