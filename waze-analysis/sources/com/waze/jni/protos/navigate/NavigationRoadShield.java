package com.waze.jni.protos.navigate;

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
public final class NavigationRoadShield extends du<NavigationRoadShield, Builder> implements NavigationRoadShieldOrBuilder {
    private static final NavigationRoadShield DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 3;
    private static volatile fo<NavigationRoadShield> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    private String text_ = "";
    private String direction_ = "";
    private String resourceName_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationRoadShield$1, reason: invalid class name */
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
    public final class Builder extends dm<NavigationRoadShield, Builder> implements NavigationRoadShieldOrBuilder {
        private Builder() {
            super(NavigationRoadShield.DEFAULT_INSTANCE);
        }

        public Builder clearDirection() {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).clearDirection();
            return this;
        }

        public Builder clearResourceName() {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).clearResourceName();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).clearText();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
        public String getDirection() {
            return ((NavigationRoadShield) this.instance).getDirection();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
        public v getDirectionBytes() {
            return ((NavigationRoadShield) this.instance).getDirectionBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
        public String getResourceName() {
            return ((NavigationRoadShield) this.instance).getResourceName();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
        public v getResourceNameBytes() {
            return ((NavigationRoadShield) this.instance).getResourceNameBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
        public String getText() {
            return ((NavigationRoadShield) this.instance).getText();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
        public v getTextBytes() {
            return ((NavigationRoadShield) this.instance).getTextBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
        public int getType() {
            return ((NavigationRoadShield) this.instance).getType();
        }

        public Builder setDirection(String str) {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).setDirection(str);
            return this;
        }

        public Builder setDirectionBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).setDirectionBytes(vVar);
            return this;
        }

        public Builder setResourceName(String str) {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).setResourceName(str);
            return this;
        }

        public Builder setResourceNameBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).setResourceNameBytes(vVar);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).setTextBytes(vVar);
            return this;
        }

        public Builder setType(int i2) {
            copyOnWrite();
            ((NavigationRoadShield) this.instance).setType(i2);
            return this;
        }
    }

    static {
        NavigationRoadShield navigationRoadShield = new NavigationRoadShield();
        DEFAULT_INSTANCE = navigationRoadShield;
        du.registerDefaultInstance(NavigationRoadShield.class, navigationRoadShield);
    }

    private NavigationRoadShield() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirection() {
        this.direction_ = getDefaultInstance().getDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static NavigationRoadShield getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationRoadShield parseDelimitedFrom(InputStream inputStream) {
        return (NavigationRoadShield) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationRoadShield parseFrom(v vVar) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationRoadShield> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirection(String str) {
        Objects.requireNonNull(str);
        this.direction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.direction_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceName(String str) {
        Objects.requireNonNull(str);
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.resourceName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.text_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"type_", "text_", "direction_", "resourceName_"});
        }
        if (iOrdinal == 3) {
            return new NavigationRoadShield();
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
        fo<NavigationRoadShield> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationRoadShield.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
    public String getDirection() {
        return this.direction_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
    public v getDirectionBytes() {
        return v.s(this.direction_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
    public String getResourceName() {
        return this.resourceName_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
    public v getResourceNameBytes() {
        return v.s(this.resourceName_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
    public v getTextBytes() {
        return v.s(this.text_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadShieldOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(NavigationRoadShield navigationRoadShield) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationRoadShield);
    }

    public static NavigationRoadShield parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationRoadShield) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationRoadShield parseFrom(v vVar, de deVar) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationRoadShield parseFrom(z zVar) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationRoadShield parseFrom(z zVar, de deVar) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavigationRoadShield parseFrom(InputStream inputStream) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationRoadShield parseFrom(InputStream inputStream, de deVar) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationRoadShield parseFrom(ByteBuffer byteBuffer) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationRoadShield parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NavigationRoadShield parseFrom(byte[] bArr) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationRoadShield parseFrom(byte[] bArr, de deVar) {
        return (NavigationRoadShield) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
