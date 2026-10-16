package com.waze.jni.protos.places;

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
public final class PlaceFormatTitleSubtitle extends du<PlaceFormatTitleSubtitle, Builder> implements PlaceFormatTitleSubtitleOrBuilder {
    private static final PlaceFormatTitleSubtitle DEFAULT_INSTANCE;
    private static volatile fo<PlaceFormatTitleSubtitle> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String subtitle_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.PlaceFormatTitleSubtitle$1, reason: invalid class name */
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
    public final class Builder extends dm<PlaceFormatTitleSubtitle, Builder> implements PlaceFormatTitleSubtitleOrBuilder {
        private Builder() {
            super(PlaceFormatTitleSubtitle.DEFAULT_INSTANCE);
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((PlaceFormatTitleSubtitle) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((PlaceFormatTitleSubtitle) this.instance).clearTitle();
            return this;
        }

        @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
        public String getSubtitle() {
            return ((PlaceFormatTitleSubtitle) this.instance).getSubtitle();
        }

        @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
        public v getSubtitleBytes() {
            return ((PlaceFormatTitleSubtitle) this.instance).getSubtitleBytes();
        }

        @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
        public String getTitle() {
            return ((PlaceFormatTitleSubtitle) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
        public v getTitleBytes() {
            return ((PlaceFormatTitleSubtitle) this.instance).getTitleBytes();
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((PlaceFormatTitleSubtitle) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(v vVar) {
            copyOnWrite();
            ((PlaceFormatTitleSubtitle) this.instance).setSubtitleBytes(vVar);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((PlaceFormatTitleSubtitle) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((PlaceFormatTitleSubtitle) this.instance).setTitleBytes(vVar);
            return this;
        }
    }

    static {
        PlaceFormatTitleSubtitle placeFormatTitleSubtitle = new PlaceFormatTitleSubtitle();
        DEFAULT_INSTANCE = placeFormatTitleSubtitle;
        du.registerDefaultInstance(PlaceFormatTitleSubtitle.class, placeFormatTitleSubtitle);
    }

    private PlaceFormatTitleSubtitle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static PlaceFormatTitleSubtitle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlaceFormatTitleSubtitle parseDelimitedFrom(InputStream inputStream) {
        return (PlaceFormatTitleSubtitle) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaceFormatTitleSubtitle parseFrom(v vVar) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PlaceFormatTitleSubtitle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        Objects.requireNonNull(str);
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.subtitle_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"title_", "subtitle_"});
        }
        if (iOrdinal == 3) {
            return new PlaceFormatTitleSubtitle();
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
        fo<PlaceFormatTitleSubtitle> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PlaceFormatTitleSubtitle.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
    public String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
    public v getSubtitleBytes() {
        return v.s(this.subtitle_);
    }

    @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.places.PlaceFormatTitleSubtitleOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    public static Builder newBuilder(PlaceFormatTitleSubtitle placeFormatTitleSubtitle) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(placeFormatTitleSubtitle);
    }

    public static PlaceFormatTitleSubtitle parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PlaceFormatTitleSubtitle) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PlaceFormatTitleSubtitle parseFrom(v vVar, de deVar) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PlaceFormatTitleSubtitle parseFrom(z zVar) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PlaceFormatTitleSubtitle parseFrom(z zVar, de deVar) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static PlaceFormatTitleSubtitle parseFrom(InputStream inputStream) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaceFormatTitleSubtitle parseFrom(InputStream inputStream, de deVar) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PlaceFormatTitleSubtitle parseFrom(ByteBuffer byteBuffer) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PlaceFormatTitleSubtitle parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static PlaceFormatTitleSubtitle parseFrom(byte[] bArr) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaceFormatTitleSubtitle parseFrom(byte[] bArr, de deVar) {
        return (PlaceFormatTitleSubtitle) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
