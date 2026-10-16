package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueCategoryGroup extends du<VenueCategoryGroup, Builder> implements VenueCategoryGroupOrBuilder {
    private static final VenueCategoryGroup DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile fo<VenueCategoryGroup> PARSER;
    private String id_ = "";
    private String label_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.VenueCategoryGroup$1, reason: invalid class name */
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
    public final class Builder extends dm<VenueCategoryGroup, Builder> implements VenueCategoryGroupOrBuilder {
        private Builder() {
            super(VenueCategoryGroup.DEFAULT_INSTANCE);
        }

        public Builder clearId() {
            copyOnWrite();
            ((VenueCategoryGroup) this.instance).clearId();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((VenueCategoryGroup) this.instance).clearLabel();
            return this;
        }

        @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
        public String getId() {
            return ((VenueCategoryGroup) this.instance).getId();
        }

        @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
        public v getIdBytes() {
            return ((VenueCategoryGroup) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
        public String getLabel() {
            return ((VenueCategoryGroup) this.instance).getLabel();
        }

        @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
        public v getLabelBytes() {
            return ((VenueCategoryGroup) this.instance).getLabelBytes();
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((VenueCategoryGroup) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((VenueCategoryGroup) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((VenueCategoryGroup) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(v vVar) {
            copyOnWrite();
            ((VenueCategoryGroup) this.instance).setLabelBytes(vVar);
            return this;
        }
    }

    static {
        VenueCategoryGroup venueCategoryGroup = new VenueCategoryGroup();
        DEFAULT_INSTANCE = venueCategoryGroup;
        du.registerDefaultInstance(VenueCategoryGroup.class, venueCategoryGroup);
    }

    private VenueCategoryGroup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    public static VenueCategoryGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VenueCategoryGroup parseDelimitedFrom(InputStream inputStream) {
        return (VenueCategoryGroup) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueCategoryGroup parseFrom(v vVar) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VenueCategoryGroup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        Objects.requireNonNull(str);
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.label_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "label_"});
        }
        if (iOrdinal == 3) {
            return new VenueCategoryGroup();
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
        fo<VenueCategoryGroup> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VenueCategoryGroup.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
    public String getLabel() {
        return this.label_;
    }

    @Override // com.waze.jni.protos.VenueCategoryGroupOrBuilder
    public v getLabelBytes() {
        return v.s(this.label_);
    }

    public static Builder newBuilder(VenueCategoryGroup venueCategoryGroup) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(venueCategoryGroup);
    }

    public static VenueCategoryGroup parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VenueCategoryGroup) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueCategoryGroup parseFrom(v vVar, de deVar) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VenueCategoryGroup parseFrom(z zVar) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VenueCategoryGroup parseFrom(z zVar, de deVar) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VenueCategoryGroup parseFrom(InputStream inputStream) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueCategoryGroup parseFrom(InputStream inputStream, de deVar) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueCategoryGroup parseFrom(ByteBuffer byteBuffer) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VenueCategoryGroup parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static VenueCategoryGroup parseFrom(byte[] bArr) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VenueCategoryGroup parseFrom(byte[] bArr, de deVar) {
        return (VenueCategoryGroup) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
