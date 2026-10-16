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
import com.waze.jni.protos.settings.NotificationCategoryProto;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationCategoryListProto extends du<NotificationCategoryListProto, Builder> implements NotificationCategoryListProtoOrBuilder {
    public static final int CATEGORIES_FIELD_NUMBER = 1;
    private static final NotificationCategoryListProto DEFAULT_INSTANCE;
    private static volatile fo<NotificationCategoryListProto> PARSER;
    private eo<NotificationCategoryProto> categories_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.NotificationCategoryListProto$1, reason: invalid class name */
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
        NotificationCategoryListProto notificationCategoryListProto = new NotificationCategoryListProto();
        DEFAULT_INSTANCE = notificationCategoryListProto;
        du.registerDefaultInstance(NotificationCategoryListProto.class, notificationCategoryListProto);
    }

    private NotificationCategoryListProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategories(Iterable<? extends NotificationCategoryProto> iterable) {
        ensureCategoriesIsMutable();
        c.addAll(iterable, this.categories_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategories(int i2, NotificationCategoryProto notificationCategoryProto) {
        Objects.requireNonNull(notificationCategoryProto);
        ensureCategoriesIsMutable();
        this.categories_.add(i2, notificationCategoryProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategories() {
        this.categories_ = emptyProtobufList();
    }

    private void ensureCategoriesIsMutable() {
        eo<NotificationCategoryProto> eoVar = this.categories_;
        if (eoVar.c()) {
            return;
        }
        this.categories_ = du.mutableCopy(eoVar);
    }

    public static NotificationCategoryListProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationCategoryListProto parseDelimitedFrom(InputStream inputStream) {
        return (NotificationCategoryListProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationCategoryListProto parseFrom(v vVar) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NotificationCategoryListProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCategories(int i2) {
        ensureCategoriesIsMutable();
        this.categories_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategories(int i2, NotificationCategoryProto notificationCategoryProto) {
        Objects.requireNonNull(notificationCategoryProto);
        ensureCategoriesIsMutable();
        this.categories_.set(i2, notificationCategoryProto);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"categories_", NotificationCategoryProto.class});
        }
        if (iOrdinal == 3) {
            return new NotificationCategoryListProto();
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
        fo<NotificationCategoryListProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NotificationCategoryListProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryListProtoOrBuilder
    public NotificationCategoryProto getCategories(int i2) {
        return this.categories_.get(i2);
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryListProtoOrBuilder
    public int getCategoriesCount() {
        return this.categories_.size();
    }

    @Override // com.waze.jni.protos.settings.NotificationCategoryListProtoOrBuilder
    public List<NotificationCategoryProto> getCategoriesList() {
        return this.categories_;
    }

    public NotificationCategoryProtoOrBuilder getCategoriesOrBuilder(int i2) {
        return this.categories_.get(i2);
    }

    public List<? extends NotificationCategoryProtoOrBuilder> getCategoriesOrBuilderList() {
        return this.categories_;
    }

    public static Builder newBuilder(NotificationCategoryListProto notificationCategoryListProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(notificationCategoryListProto);
    }

    public static NotificationCategoryListProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NotificationCategoryListProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationCategoryListProto parseFrom(v vVar, de deVar) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NotificationCategoryListProto parseFrom(z zVar) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NotificationCategoryListProto parseFrom(z zVar, de deVar) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategories(NotificationCategoryProto notificationCategoryProto) {
        Objects.requireNonNull(notificationCategoryProto);
        ensureCategoriesIsMutable();
        this.categories_.add(notificationCategoryProto);
    }

    public static NotificationCategoryListProto parseFrom(InputStream inputStream) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationCategoryListProto parseFrom(InputStream inputStream, de deVar) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationCategoryListProto parseFrom(ByteBuffer byteBuffer) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NotificationCategoryListProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NotificationCategoryListProto, Builder> implements NotificationCategoryListProtoOrBuilder {
        private Builder() {
            super(NotificationCategoryListProto.DEFAULT_INSTANCE);
        }

        public Builder addAllCategories(Iterable<? extends NotificationCategoryProto> iterable) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).addAllCategories(iterable);
            return this;
        }

        public Builder addCategories(int i2, NotificationCategoryProto.Builder builder) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).addCategories(i2, builder.build());
            return this;
        }

        public Builder clearCategories() {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).clearCategories();
            return this;
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryListProtoOrBuilder
        public NotificationCategoryProto getCategories(int i2) {
            return ((NotificationCategoryListProto) this.instance).getCategories(i2);
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryListProtoOrBuilder
        public int getCategoriesCount() {
            return ((NotificationCategoryListProto) this.instance).getCategoriesCount();
        }

        @Override // com.waze.jni.protos.settings.NotificationCategoryListProtoOrBuilder
        public List<NotificationCategoryProto> getCategoriesList() {
            return DesugarCollections.unmodifiableList(((NotificationCategoryListProto) this.instance).getCategoriesList());
        }

        public Builder removeCategories(int i2) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).removeCategories(i2);
            return this;
        }

        public Builder setCategories(int i2, NotificationCategoryProto.Builder builder) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).setCategories(i2, builder.build());
            return this;
        }

        public Builder addCategories(int i2, NotificationCategoryProto notificationCategoryProto) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).addCategories(i2, notificationCategoryProto);
            return this;
        }

        public Builder setCategories(int i2, NotificationCategoryProto notificationCategoryProto) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).setCategories(i2, notificationCategoryProto);
            return this;
        }

        public Builder addCategories(NotificationCategoryProto.Builder builder) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).addCategories(builder.build());
            return this;
        }

        public Builder addCategories(NotificationCategoryProto notificationCategoryProto) {
            copyOnWrite();
            ((NotificationCategoryListProto) this.instance).addCategories(notificationCategoryProto);
            return this;
        }
    }

    public static NotificationCategoryListProto parseFrom(byte[] bArr) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationCategoryListProto parseFrom(byte[] bArr, de deVar) {
        return (NotificationCategoryListProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
