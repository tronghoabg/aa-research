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
public final class NavigationExitSign extends du<NavigationExitSign, Builder> implements NavigationExitSignOrBuilder {
    private static final NavigationExitSign DEFAULT_INSTANCE;
    private static volatile fo<NavigationExitSign> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    private String text_ = "";
    private String resourceName_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationExitSign$1, reason: invalid class name */
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
    public final class Builder extends dm<NavigationExitSign, Builder> implements NavigationExitSignOrBuilder {
        private Builder() {
            super(NavigationExitSign.DEFAULT_INSTANCE);
        }

        public Builder clearResourceName() {
            copyOnWrite();
            ((NavigationExitSign) this.instance).clearResourceName();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((NavigationExitSign) this.instance).clearText();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((NavigationExitSign) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
        public String getResourceName() {
            return ((NavigationExitSign) this.instance).getResourceName();
        }

        @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
        public v getResourceNameBytes() {
            return ((NavigationExitSign) this.instance).getResourceNameBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
        public String getText() {
            return ((NavigationExitSign) this.instance).getText();
        }

        @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
        public v getTextBytes() {
            return ((NavigationExitSign) this.instance).getTextBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
        public int getType() {
            return ((NavigationExitSign) this.instance).getType();
        }

        public Builder setResourceName(String str) {
            copyOnWrite();
            ((NavigationExitSign) this.instance).setResourceName(str);
            return this;
        }

        public Builder setResourceNameBytes(v vVar) {
            copyOnWrite();
            ((NavigationExitSign) this.instance).setResourceNameBytes(vVar);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((NavigationExitSign) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(v vVar) {
            copyOnWrite();
            ((NavigationExitSign) this.instance).setTextBytes(vVar);
            return this;
        }

        public Builder setType(int i2) {
            copyOnWrite();
            ((NavigationExitSign) this.instance).setType(i2);
            return this;
        }
    }

    static {
        NavigationExitSign navigationExitSign = new NavigationExitSign();
        DEFAULT_INSTANCE = navigationExitSign;
        du.registerDefaultInstance(NavigationExitSign.class, navigationExitSign);
    }

    private NavigationExitSign() {
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

    public static NavigationExitSign getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationExitSign parseDelimitedFrom(InputStream inputStream) {
        return (NavigationExitSign) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationExitSign parseFrom(v vVar) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationExitSign> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "text_", "resourceName_"});
        }
        if (iOrdinal == 3) {
            return new NavigationExitSign();
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
        fo<NavigationExitSign> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationExitSign.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
    public String getResourceName() {
        return this.resourceName_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
    public v getResourceNameBytes() {
        return v.s(this.resourceName_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
    public v getTextBytes() {
        return v.s(this.text_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationExitSignOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(NavigationExitSign navigationExitSign) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationExitSign);
    }

    public static NavigationExitSign parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationExitSign) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationExitSign parseFrom(v vVar, de deVar) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationExitSign parseFrom(z zVar) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationExitSign parseFrom(z zVar, de deVar) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavigationExitSign parseFrom(InputStream inputStream) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationExitSign parseFrom(InputStream inputStream, de deVar) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationExitSign parseFrom(ByteBuffer byteBuffer) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationExitSign parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NavigationExitSign parseFrom(byte[] bArr) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationExitSign parseFrom(byte[] bArr, de deVar) {
        return (NavigationExitSign) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
