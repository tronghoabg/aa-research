package com.waze.jni.protos.map;

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
public final class DisplayRect extends du<DisplayRect, Builder> implements DisplayRectOrBuilder {
    public static final int BOTTOM_RIGHT_X_FIELD_NUMBER = 4;
    public static final int BOTTOM_RIGHT_Y_FIELD_NUMBER = 5;
    private static final DisplayRect DEFAULT_INSTANCE;
    private static volatile fo<DisplayRect> PARSER = null;
    public static final int TAG_FIELD_NUMBER = 1;
    public static final int TOP_LEFT_X_FIELD_NUMBER = 2;
    public static final int TOP_LEFT_Y_FIELD_NUMBER = 3;
    private int bottomRightX_;
    private int bottomRightY_;
    private String tag_ = "";
    private int topLeftX_;
    private int topLeftY_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.DisplayRect$1, reason: invalid class name */
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
    public final class Builder extends dm<DisplayRect, Builder> implements DisplayRectOrBuilder {
        private Builder() {
            super(DisplayRect.DEFAULT_INSTANCE);
        }

        public Builder clearBottomRightX() {
            copyOnWrite();
            ((DisplayRect) this.instance).clearBottomRightX();
            return this;
        }

        public Builder clearBottomRightY() {
            copyOnWrite();
            ((DisplayRect) this.instance).clearBottomRightY();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((DisplayRect) this.instance).clearTag();
            return this;
        }

        public Builder clearTopLeftX() {
            copyOnWrite();
            ((DisplayRect) this.instance).clearTopLeftX();
            return this;
        }

        public Builder clearTopLeftY() {
            copyOnWrite();
            ((DisplayRect) this.instance).clearTopLeftY();
            return this;
        }

        @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
        public int getBottomRightX() {
            return ((DisplayRect) this.instance).getBottomRightX();
        }

        @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
        public int getBottomRightY() {
            return ((DisplayRect) this.instance).getBottomRightY();
        }

        @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
        public String getTag() {
            return ((DisplayRect) this.instance).getTag();
        }

        @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
        public v getTagBytes() {
            return ((DisplayRect) this.instance).getTagBytes();
        }

        @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
        public int getTopLeftX() {
            return ((DisplayRect) this.instance).getTopLeftX();
        }

        @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
        public int getTopLeftY() {
            return ((DisplayRect) this.instance).getTopLeftY();
        }

        public Builder setBottomRightX(int i2) {
            copyOnWrite();
            ((DisplayRect) this.instance).setBottomRightX(i2);
            return this;
        }

        public Builder setBottomRightY(int i2) {
            copyOnWrite();
            ((DisplayRect) this.instance).setBottomRightY(i2);
            return this;
        }

        public Builder setTag(String str) {
            copyOnWrite();
            ((DisplayRect) this.instance).setTag(str);
            return this;
        }

        public Builder setTagBytes(v vVar) {
            copyOnWrite();
            ((DisplayRect) this.instance).setTagBytes(vVar);
            return this;
        }

        public Builder setTopLeftX(int i2) {
            copyOnWrite();
            ((DisplayRect) this.instance).setTopLeftX(i2);
            return this;
        }

        public Builder setTopLeftY(int i2) {
            copyOnWrite();
            ((DisplayRect) this.instance).setTopLeftY(i2);
            return this;
        }
    }

    static {
        DisplayRect displayRect = new DisplayRect();
        DEFAULT_INSTANCE = displayRect;
        du.registerDefaultInstance(DisplayRect.class, displayRect);
    }

    private DisplayRect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomRightX() {
        this.bottomRightX_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomRightY() {
        this.bottomRightY_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopLeftX() {
        this.topLeftX_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopLeftY() {
        this.topLeftY_ = 0;
    }

    public static DisplayRect getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DisplayRect parseDelimitedFrom(InputStream inputStream) {
        return (DisplayRect) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DisplayRect parseFrom(v vVar) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<DisplayRect> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomRightX(int i2) {
        this.bottomRightX_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomRightY(int i2) {
        this.bottomRightY_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        Objects.requireNonNull(str);
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tag_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopLeftX(int i2) {
        this.topLeftX_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopLeftY(int i2) {
        this.topLeftY_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"tag_", "topLeftX_", "topLeftY_", "bottomRightX_", "bottomRightY_"});
        }
        if (iOrdinal == 3) {
            return new DisplayRect();
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
        fo<DisplayRect> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (DisplayRect.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
    public int getBottomRightX() {
        return this.bottomRightX_;
    }

    @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
    public int getBottomRightY() {
        return this.bottomRightY_;
    }

    @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
    public String getTag() {
        return this.tag_;
    }

    @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
    public v getTagBytes() {
        return v.s(this.tag_);
    }

    @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
    public int getTopLeftX() {
        return this.topLeftX_;
    }

    @Override // com.waze.jni.protos.map.DisplayRectOrBuilder
    public int getTopLeftY() {
        return this.topLeftY_;
    }

    public static Builder newBuilder(DisplayRect displayRect) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(displayRect);
    }

    public static DisplayRect parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (DisplayRect) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DisplayRect parseFrom(v vVar, de deVar) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static DisplayRect parseFrom(z zVar) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static DisplayRect parseFrom(z zVar, de deVar) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static DisplayRect parseFrom(InputStream inputStream) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DisplayRect parseFrom(InputStream inputStream, de deVar) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DisplayRect parseFrom(ByteBuffer byteBuffer) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DisplayRect parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static DisplayRect parseFrom(byte[] bArr) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DisplayRect parseFrom(byte[] bArr, de deVar) {
        return (DisplayRect) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
