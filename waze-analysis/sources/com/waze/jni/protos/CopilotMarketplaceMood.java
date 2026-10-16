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
public final class CopilotMarketplaceMood extends du<CopilotMarketplaceMood, Builder> implements CopilotMarketplaceMoodOrBuilder {
    private static final CopilotMarketplaceMood DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ADS_FIELD_NUMBER = 3;
    public static final int IS_HIDDEN_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<CopilotMarketplaceMood> PARSER;
    private int id_;
    private boolean isAds_;
    private boolean isHidden_;
    private String name_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.CopilotMarketplaceMood$1, reason: invalid class name */
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
    public final class Builder extends dm<CopilotMarketplaceMood, Builder> implements CopilotMarketplaceMoodOrBuilder {
        private Builder() {
            super(CopilotMarketplaceMood.DEFAULT_INSTANCE);
        }

        public Builder clearId() {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).clearId();
            return this;
        }

        public Builder clearIsAds() {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).clearIsAds();
            return this;
        }

        public Builder clearIsHidden() {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).clearIsHidden();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).clearName();
            return this;
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
        public int getId() {
            return ((CopilotMarketplaceMood) this.instance).getId();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
        public boolean getIsAds() {
            return ((CopilotMarketplaceMood) this.instance).getIsAds();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
        public boolean getIsHidden() {
            return ((CopilotMarketplaceMood) this.instance).getIsHidden();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
        public String getName() {
            return ((CopilotMarketplaceMood) this.instance).getName();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
        public v getNameBytes() {
            return ((CopilotMarketplaceMood) this.instance).getNameBytes();
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).setId(i2);
            return this;
        }

        public Builder setIsAds(boolean z) {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).setIsAds(z);
            return this;
        }

        public Builder setIsHidden(boolean z) {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).setIsHidden(z);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((CopilotMarketplaceMood) this.instance).setNameBytes(vVar);
            return this;
        }
    }

    static {
        CopilotMarketplaceMood copilotMarketplaceMood = new CopilotMarketplaceMood();
        DEFAULT_INSTANCE = copilotMarketplaceMood;
        du.registerDefaultInstance(CopilotMarketplaceMood.class, copilotMarketplaceMood);
    }

    private CopilotMarketplaceMood() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAds() {
        this.isAds_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHidden() {
        this.isHidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static CopilotMarketplaceMood getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CopilotMarketplaceMood parseDelimitedFrom(InputStream inputStream) {
        return (CopilotMarketplaceMood) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CopilotMarketplaceMood parseFrom(v vVar) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CopilotMarketplaceMood> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAds(boolean z) {
        this.isAds_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHidden(boolean z) {
        this.isHidden_ = z;
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0007\u0004\u0007", new Object[]{"id_", "name_", "isAds_", "isHidden_"});
        }
        if (iOrdinal == 3) {
            return new CopilotMarketplaceMood();
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
        fo<CopilotMarketplaceMood> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CopilotMarketplaceMood.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
    public boolean getIsAds() {
        return this.isAds_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
    public boolean getIsHidden() {
        return this.isHidden_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceMoodOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    public static Builder newBuilder(CopilotMarketplaceMood copilotMarketplaceMood) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(copilotMarketplaceMood);
    }

    public static CopilotMarketplaceMood parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CopilotMarketplaceMood) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CopilotMarketplaceMood parseFrom(v vVar, de deVar) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CopilotMarketplaceMood parseFrom(z zVar) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CopilotMarketplaceMood parseFrom(z zVar, de deVar) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CopilotMarketplaceMood parseFrom(InputStream inputStream) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CopilotMarketplaceMood parseFrom(InputStream inputStream, de deVar) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CopilotMarketplaceMood parseFrom(ByteBuffer byteBuffer) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CopilotMarketplaceMood parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static CopilotMarketplaceMood parseFrom(byte[] bArr) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CopilotMarketplaceMood parseFrom(byte[] bArr, de deVar) {
        return (CopilotMarketplaceMood) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
