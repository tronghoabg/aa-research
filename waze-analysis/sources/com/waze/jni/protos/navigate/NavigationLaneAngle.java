package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneAngle extends du<NavigationLaneAngle, Builder> implements NavigationLaneAngleOrBuilder {
    public static final int ANGLE_FIELD_NUMBER = 1;
    private static final NavigationLaneAngle DEFAULT_INSTANCE;
    public static final int ISSELECTED_FIELD_NUMBER = 2;
    private static volatile fo<NavigationLaneAngle> PARSER;
    private int angle_;
    private boolean isSelected_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationLaneAngle$1, reason: invalid class name */
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
    public final class Builder extends dm<NavigationLaneAngle, Builder> implements NavigationLaneAngleOrBuilder {
        private Builder() {
            super(NavigationLaneAngle.DEFAULT_INSTANCE);
        }

        public Builder clearAngle() {
            copyOnWrite();
            ((NavigationLaneAngle) this.instance).clearAngle();
            return this;
        }

        public Builder clearIsSelected() {
            copyOnWrite();
            ((NavigationLaneAngle) this.instance).clearIsSelected();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneAngleOrBuilder
        public int getAngle() {
            return ((NavigationLaneAngle) this.instance).getAngle();
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneAngleOrBuilder
        public boolean getIsSelected() {
            return ((NavigationLaneAngle) this.instance).getIsSelected();
        }

        public Builder setAngle(int i2) {
            copyOnWrite();
            ((NavigationLaneAngle) this.instance).setAngle(i2);
            return this;
        }

        public Builder setIsSelected(boolean z) {
            copyOnWrite();
            ((NavigationLaneAngle) this.instance).setIsSelected(z);
            return this;
        }
    }

    static {
        NavigationLaneAngle navigationLaneAngle = new NavigationLaneAngle();
        DEFAULT_INSTANCE = navigationLaneAngle;
        du.registerDefaultInstance(NavigationLaneAngle.class, navigationLaneAngle);
    }

    private NavigationLaneAngle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAngle() {
        this.angle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSelected() {
        this.isSelected_ = false;
    }

    public static NavigationLaneAngle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationLaneAngle parseDelimitedFrom(InputStream inputStream) {
        return (NavigationLaneAngle) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationLaneAngle parseFrom(v vVar) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationLaneAngle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngle(int i2) {
        this.angle_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSelected(boolean z) {
        this.isSelected_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"angle_", "isSelected_"});
        }
        if (iOrdinal == 3) {
            return new NavigationLaneAngle();
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
        fo<NavigationLaneAngle> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationLaneAngle.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneAngleOrBuilder
    public int getAngle() {
        return this.angle_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneAngleOrBuilder
    public boolean getIsSelected() {
        return this.isSelected_;
    }

    public static Builder newBuilder(NavigationLaneAngle navigationLaneAngle) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationLaneAngle);
    }

    public static NavigationLaneAngle parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationLaneAngle) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationLaneAngle parseFrom(v vVar, de deVar) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationLaneAngle parseFrom(z zVar) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationLaneAngle parseFrom(z zVar, de deVar) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavigationLaneAngle parseFrom(InputStream inputStream) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationLaneAngle parseFrom(InputStream inputStream, de deVar) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationLaneAngle parseFrom(ByteBuffer byteBuffer) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationLaneAngle parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NavigationLaneAngle parseFrom(byte[] bArr) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationLaneAngle parseFrom(byte[] bArr, de deVar) {
        return (NavigationLaneAngle) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
