package com.waze.jni.protos.navigate;

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
import com.waze.jni.protos.navigate.NavigationLane;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneList extends du<NavigationLaneList, Builder> implements NavigationLaneListOrBuilder {
    private static final NavigationLaneList DEFAULT_INSTANCE;
    public static final int NAVIGATIONLANE_FIELD_NUMBER = 1;
    private static volatile fo<NavigationLaneList> PARSER;
    private eo<NavigationLane> navigationLane_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationLaneList$1, reason: invalid class name */
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
        NavigationLaneList navigationLaneList = new NavigationLaneList();
        DEFAULT_INSTANCE = navigationLaneList;
        du.registerDefaultInstance(NavigationLaneList.class, navigationLaneList);
    }

    private NavigationLaneList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNavigationLane(Iterable<? extends NavigationLane> iterable) {
        ensureNavigationLaneIsMutable();
        c.addAll(iterable, this.navigationLane_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNavigationLane(int i2, NavigationLane navigationLane) {
        Objects.requireNonNull(navigationLane);
        ensureNavigationLaneIsMutable();
        this.navigationLane_.add(i2, navigationLane);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationLane() {
        this.navigationLane_ = emptyProtobufList();
    }

    private void ensureNavigationLaneIsMutable() {
        eo<NavigationLane> eoVar = this.navigationLane_;
        if (eoVar.c()) {
            return;
        }
        this.navigationLane_ = du.mutableCopy(eoVar);
    }

    public static NavigationLaneList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationLaneList parseDelimitedFrom(InputStream inputStream) {
        return (NavigationLaneList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationLaneList parseFrom(v vVar) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationLaneList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNavigationLane(int i2) {
        ensureNavigationLaneIsMutable();
        this.navigationLane_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationLane(int i2, NavigationLane navigationLane) {
        Objects.requireNonNull(navigationLane);
        ensureNavigationLaneIsMutable();
        this.navigationLane_.set(i2, navigationLane);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"navigationLane_", NavigationLane.class});
        }
        if (iOrdinal == 3) {
            return new NavigationLaneList();
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
        fo<NavigationLaneList> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationLaneList.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneListOrBuilder
    public NavigationLane getNavigationLane(int i2) {
        return this.navigationLane_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneListOrBuilder
    public int getNavigationLaneCount() {
        return this.navigationLane_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneListOrBuilder
    public List<NavigationLane> getNavigationLaneList() {
        return this.navigationLane_;
    }

    public NavigationLaneOrBuilder getNavigationLaneOrBuilder(int i2) {
        return this.navigationLane_.get(i2);
    }

    public List<? extends NavigationLaneOrBuilder> getNavigationLaneOrBuilderList() {
        return this.navigationLane_;
    }

    public static Builder newBuilder(NavigationLaneList navigationLaneList) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationLaneList);
    }

    public static NavigationLaneList parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationLaneList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationLaneList parseFrom(v vVar, de deVar) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationLaneList parseFrom(z zVar) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationLaneList parseFrom(z zVar, de deVar) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNavigationLane(NavigationLane navigationLane) {
        Objects.requireNonNull(navigationLane);
        ensureNavigationLaneIsMutable();
        this.navigationLane_.add(navigationLane);
    }

    public static NavigationLaneList parseFrom(InputStream inputStream) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationLaneList parseFrom(InputStream inputStream, de deVar) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationLaneList parseFrom(ByteBuffer byteBuffer) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationLaneList parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationLaneList, Builder> implements NavigationLaneListOrBuilder {
        private Builder() {
            super(NavigationLaneList.DEFAULT_INSTANCE);
        }

        public Builder addAllNavigationLane(Iterable<? extends NavigationLane> iterable) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).addAllNavigationLane(iterable);
            return this;
        }

        public Builder addNavigationLane(int i2, NavigationLane.Builder builder) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).addNavigationLane(i2, builder.build());
            return this;
        }

        public Builder clearNavigationLane() {
            copyOnWrite();
            ((NavigationLaneList) this.instance).clearNavigationLane();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneListOrBuilder
        public NavigationLane getNavigationLane(int i2) {
            return ((NavigationLaneList) this.instance).getNavigationLane(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneListOrBuilder
        public int getNavigationLaneCount() {
            return ((NavigationLaneList) this.instance).getNavigationLaneCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneListOrBuilder
        public List<NavigationLane> getNavigationLaneList() {
            return DesugarCollections.unmodifiableList(((NavigationLaneList) this.instance).getNavigationLaneList());
        }

        public Builder removeNavigationLane(int i2) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).removeNavigationLane(i2);
            return this;
        }

        public Builder setNavigationLane(int i2, NavigationLane.Builder builder) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).setNavigationLane(i2, builder.build());
            return this;
        }

        public Builder addNavigationLane(int i2, NavigationLane navigationLane) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).addNavigationLane(i2, navigationLane);
            return this;
        }

        public Builder setNavigationLane(int i2, NavigationLane navigationLane) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).setNavigationLane(i2, navigationLane);
            return this;
        }

        public Builder addNavigationLane(NavigationLane.Builder builder) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).addNavigationLane(builder.build());
            return this;
        }

        public Builder addNavigationLane(NavigationLane navigationLane) {
            copyOnWrite();
            ((NavigationLaneList) this.instance).addNavigationLane(navigationLane);
            return this;
        }
    }

    public static NavigationLaneList parseFrom(byte[] bArr) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationLaneList parseFrom(byte[] bArr, de deVar) {
        return (NavigationLaneList) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
