package com.waze.jni.protos;

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
import com.waze.jni.protos.VenueCategoryGroup;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueCategoryGroups extends du<VenueCategoryGroups, Builder> implements VenueCategoryGroupsOrBuilder {
    private static final VenueCategoryGroups DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    private static volatile fo<VenueCategoryGroups> PARSER;
    private eo<VenueCategoryGroup> groups_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.VenueCategoryGroups$1, reason: invalid class name */
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
        VenueCategoryGroups venueCategoryGroups = new VenueCategoryGroups();
        DEFAULT_INSTANCE = venueCategoryGroups;
        du.registerDefaultInstance(VenueCategoryGroups.class, venueCategoryGroups);
    }

    private VenueCategoryGroups() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGroups(Iterable<? extends VenueCategoryGroup> iterable) {
        ensureGroupsIsMutable();
        c.addAll(iterable, this.groups_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroups(int i2, VenueCategoryGroup venueCategoryGroup) {
        Objects.requireNonNull(venueCategoryGroup);
        ensureGroupsIsMutable();
        this.groups_.add(i2, venueCategoryGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroups() {
        this.groups_ = emptyProtobufList();
    }

    private void ensureGroupsIsMutable() {
        eo<VenueCategoryGroup> eoVar = this.groups_;
        if (eoVar.c()) {
            return;
        }
        this.groups_ = du.mutableCopy(eoVar);
    }

    public static VenueCategoryGroups getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VenueCategoryGroups parseDelimitedFrom(InputStream inputStream) {
        return (VenueCategoryGroups) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueCategoryGroups parseFrom(v vVar) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VenueCategoryGroups> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGroups(int i2) {
        ensureGroupsIsMutable();
        this.groups_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroups(int i2, VenueCategoryGroup venueCategoryGroup) {
        Objects.requireNonNull(venueCategoryGroup);
        ensureGroupsIsMutable();
        this.groups_.set(i2, venueCategoryGroup);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"groups_", VenueCategoryGroup.class});
        }
        if (iOrdinal == 3) {
            return new VenueCategoryGroups();
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
        fo<VenueCategoryGroups> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VenueCategoryGroups.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.VenueCategoryGroupsOrBuilder
    public VenueCategoryGroup getGroups(int i2) {
        return this.groups_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueCategoryGroupsOrBuilder
    public int getGroupsCount() {
        return this.groups_.size();
    }

    @Override // com.waze.jni.protos.VenueCategoryGroupsOrBuilder
    public List<VenueCategoryGroup> getGroupsList() {
        return this.groups_;
    }

    public VenueCategoryGroupOrBuilder getGroupsOrBuilder(int i2) {
        return this.groups_.get(i2);
    }

    public List<? extends VenueCategoryGroupOrBuilder> getGroupsOrBuilderList() {
        return this.groups_;
    }

    public static Builder newBuilder(VenueCategoryGroups venueCategoryGroups) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(venueCategoryGroups);
    }

    public static VenueCategoryGroups parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VenueCategoryGroups) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueCategoryGroups parseFrom(v vVar, de deVar) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VenueCategoryGroups parseFrom(z zVar) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VenueCategoryGroups parseFrom(z zVar, de deVar) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroups(VenueCategoryGroup venueCategoryGroup) {
        Objects.requireNonNull(venueCategoryGroup);
        ensureGroupsIsMutable();
        this.groups_.add(venueCategoryGroup);
    }

    public static VenueCategoryGroups parseFrom(InputStream inputStream) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueCategoryGroups parseFrom(InputStream inputStream, de deVar) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueCategoryGroups parseFrom(ByteBuffer byteBuffer) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VenueCategoryGroups parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<VenueCategoryGroups, Builder> implements VenueCategoryGroupsOrBuilder {
        private Builder() {
            super(VenueCategoryGroups.DEFAULT_INSTANCE);
        }

        public Builder addAllGroups(Iterable<? extends VenueCategoryGroup> iterable) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).addAllGroups(iterable);
            return this;
        }

        public Builder addGroups(int i2, VenueCategoryGroup.Builder builder) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).addGroups(i2, builder.build());
            return this;
        }

        public Builder clearGroups() {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).clearGroups();
            return this;
        }

        @Override // com.waze.jni.protos.VenueCategoryGroupsOrBuilder
        public VenueCategoryGroup getGroups(int i2) {
            return ((VenueCategoryGroups) this.instance).getGroups(i2);
        }

        @Override // com.waze.jni.protos.VenueCategoryGroupsOrBuilder
        public int getGroupsCount() {
            return ((VenueCategoryGroups) this.instance).getGroupsCount();
        }

        @Override // com.waze.jni.protos.VenueCategoryGroupsOrBuilder
        public List<VenueCategoryGroup> getGroupsList() {
            return DesugarCollections.unmodifiableList(((VenueCategoryGroups) this.instance).getGroupsList());
        }

        public Builder removeGroups(int i2) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).removeGroups(i2);
            return this;
        }

        public Builder setGroups(int i2, VenueCategoryGroup.Builder builder) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).setGroups(i2, builder.build());
            return this;
        }

        public Builder addGroups(int i2, VenueCategoryGroup venueCategoryGroup) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).addGroups(i2, venueCategoryGroup);
            return this;
        }

        public Builder setGroups(int i2, VenueCategoryGroup venueCategoryGroup) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).setGroups(i2, venueCategoryGroup);
            return this;
        }

        public Builder addGroups(VenueCategoryGroup.Builder builder) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).addGroups(builder.build());
            return this;
        }

        public Builder addGroups(VenueCategoryGroup venueCategoryGroup) {
            copyOnWrite();
            ((VenueCategoryGroups) this.instance).addGroups(venueCategoryGroup);
            return this;
        }
    }

    public static VenueCategoryGroups parseFrom(byte[] bArr) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VenueCategoryGroups parseFrom(byte[] bArr, de deVar) {
        return (VenueCategoryGroups) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
