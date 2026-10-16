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
import com.waze.jni.protos.navigate.NavigationItem;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationItemList extends du<NavigationItemList, Builder> implements NavigationItemListOrBuilder {
    private static final NavigationItemList DEFAULT_INSTANCE;
    public static final int NAVIGATIONITEM_FIELD_NUMBER = 1;
    private static volatile fo<NavigationItemList> PARSER;
    private eo<NavigationItem> navigationItem_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationItemList$1, reason: invalid class name */
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
        NavigationItemList navigationItemList = new NavigationItemList();
        DEFAULT_INSTANCE = navigationItemList;
        du.registerDefaultInstance(NavigationItemList.class, navigationItemList);
    }

    private NavigationItemList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNavigationItem(Iterable<? extends NavigationItem> iterable) {
        ensureNavigationItemIsMutable();
        c.addAll(iterable, this.navigationItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNavigationItem(int i2, NavigationItem navigationItem) {
        Objects.requireNonNull(navigationItem);
        ensureNavigationItemIsMutable();
        this.navigationItem_.add(i2, navigationItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationItem() {
        this.navigationItem_ = emptyProtobufList();
    }

    private void ensureNavigationItemIsMutable() {
        eo<NavigationItem> eoVar = this.navigationItem_;
        if (eoVar.c()) {
            return;
        }
        this.navigationItem_ = du.mutableCopy(eoVar);
    }

    public static NavigationItemList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationItemList parseDelimitedFrom(InputStream inputStream) {
        return (NavigationItemList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationItemList parseFrom(v vVar) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationItemList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNavigationItem(int i2) {
        ensureNavigationItemIsMutable();
        this.navigationItem_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationItem(int i2, NavigationItem navigationItem) {
        Objects.requireNonNull(navigationItem);
        ensureNavigationItemIsMutable();
        this.navigationItem_.set(i2, navigationItem);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"navigationItem_", NavigationItem.class});
        }
        if (iOrdinal == 3) {
            return new NavigationItemList();
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
        fo<NavigationItemList> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationItemList.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemListOrBuilder
    public NavigationItem getNavigationItem(int i2) {
        return this.navigationItem_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemListOrBuilder
    public int getNavigationItemCount() {
        return this.navigationItem_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemListOrBuilder
    public List<NavigationItem> getNavigationItemList() {
        return this.navigationItem_;
    }

    public NavigationItemOrBuilder getNavigationItemOrBuilder(int i2) {
        return this.navigationItem_.get(i2);
    }

    public List<? extends NavigationItemOrBuilder> getNavigationItemOrBuilderList() {
        return this.navigationItem_;
    }

    public static Builder newBuilder(NavigationItemList navigationItemList) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationItemList);
    }

    public static NavigationItemList parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationItemList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationItemList parseFrom(v vVar, de deVar) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationItemList parseFrom(z zVar) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationItemList parseFrom(z zVar, de deVar) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNavigationItem(NavigationItem navigationItem) {
        Objects.requireNonNull(navigationItem);
        ensureNavigationItemIsMutable();
        this.navigationItem_.add(navigationItem);
    }

    public static NavigationItemList parseFrom(InputStream inputStream) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationItemList parseFrom(InputStream inputStream, de deVar) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationItemList parseFrom(ByteBuffer byteBuffer) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationItemList parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationItemList, Builder> implements NavigationItemListOrBuilder {
        private Builder() {
            super(NavigationItemList.DEFAULT_INSTANCE);
        }

        public Builder addAllNavigationItem(Iterable<? extends NavigationItem> iterable) {
            copyOnWrite();
            ((NavigationItemList) this.instance).addAllNavigationItem(iterable);
            return this;
        }

        public Builder addNavigationItem(int i2, NavigationItem.Builder builder) {
            copyOnWrite();
            ((NavigationItemList) this.instance).addNavigationItem(i2, builder.build());
            return this;
        }

        public Builder clearNavigationItem() {
            copyOnWrite();
            ((NavigationItemList) this.instance).clearNavigationItem();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemListOrBuilder
        public NavigationItem getNavigationItem(int i2) {
            return ((NavigationItemList) this.instance).getNavigationItem(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemListOrBuilder
        public int getNavigationItemCount() {
            return ((NavigationItemList) this.instance).getNavigationItemCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemListOrBuilder
        public List<NavigationItem> getNavigationItemList() {
            return DesugarCollections.unmodifiableList(((NavigationItemList) this.instance).getNavigationItemList());
        }

        public Builder removeNavigationItem(int i2) {
            copyOnWrite();
            ((NavigationItemList) this.instance).removeNavigationItem(i2);
            return this;
        }

        public Builder setNavigationItem(int i2, NavigationItem.Builder builder) {
            copyOnWrite();
            ((NavigationItemList) this.instance).setNavigationItem(i2, builder.build());
            return this;
        }

        public Builder addNavigationItem(int i2, NavigationItem navigationItem) {
            copyOnWrite();
            ((NavigationItemList) this.instance).addNavigationItem(i2, navigationItem);
            return this;
        }

        public Builder setNavigationItem(int i2, NavigationItem navigationItem) {
            copyOnWrite();
            ((NavigationItemList) this.instance).setNavigationItem(i2, navigationItem);
            return this;
        }

        public Builder addNavigationItem(NavigationItem.Builder builder) {
            copyOnWrite();
            ((NavigationItemList) this.instance).addNavigationItem(builder.build());
            return this;
        }

        public Builder addNavigationItem(NavigationItem navigationItem) {
            copyOnWrite();
            ((NavigationItemList) this.instance).addNavigationItem(navigationItem);
            return this;
        }
    }

    public static NavigationItemList parseFrom(byte[] bArr) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationItemList parseFrom(byte[] bArr, de deVar) {
        return (NavigationItemList) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
