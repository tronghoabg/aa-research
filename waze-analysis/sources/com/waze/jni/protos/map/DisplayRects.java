package com.waze.jni.protos.map;

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
import com.waze.jni.protos.map.DisplayRect;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DisplayRects extends du<DisplayRects, Builder> implements DisplayRectsOrBuilder {
    private static final DisplayRects DEFAULT_INSTANCE;
    public static final int DISPLAY_RECTS_FIELD_NUMBER = 1;
    private static volatile fo<DisplayRects> PARSER;
    private eo<DisplayRect> displayRects_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.DisplayRects$1, reason: invalid class name */
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
        DisplayRects displayRects = new DisplayRects();
        DEFAULT_INSTANCE = displayRects;
        du.registerDefaultInstance(DisplayRects.class, displayRects);
    }

    private DisplayRects() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayRects(Iterable<? extends DisplayRect> iterable) {
        ensureDisplayRectsIsMutable();
        c.addAll(iterable, this.displayRects_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayRects(int i2, DisplayRect displayRect) {
        Objects.requireNonNull(displayRect);
        ensureDisplayRectsIsMutable();
        this.displayRects_.add(i2, displayRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayRects() {
        this.displayRects_ = emptyProtobufList();
    }

    private void ensureDisplayRectsIsMutable() {
        eo<DisplayRect> eoVar = this.displayRects_;
        if (eoVar.c()) {
            return;
        }
        this.displayRects_ = du.mutableCopy(eoVar);
    }

    public static DisplayRects getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DisplayRects parseDelimitedFrom(InputStream inputStream) {
        return (DisplayRects) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DisplayRects parseFrom(v vVar) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<DisplayRects> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDisplayRects(int i2) {
        ensureDisplayRectsIsMutable();
        this.displayRects_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayRects(int i2, DisplayRect displayRect) {
        Objects.requireNonNull(displayRect);
        ensureDisplayRectsIsMutable();
        this.displayRects_.set(i2, displayRect);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"displayRects_", DisplayRect.class});
        }
        if (iOrdinal == 3) {
            return new DisplayRects();
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
        fo<DisplayRects> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (DisplayRects.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.DisplayRectsOrBuilder
    public DisplayRect getDisplayRects(int i2) {
        return this.displayRects_.get(i2);
    }

    @Override // com.waze.jni.protos.map.DisplayRectsOrBuilder
    public int getDisplayRectsCount() {
        return this.displayRects_.size();
    }

    @Override // com.waze.jni.protos.map.DisplayRectsOrBuilder
    public List<DisplayRect> getDisplayRectsList() {
        return this.displayRects_;
    }

    public DisplayRectOrBuilder getDisplayRectsOrBuilder(int i2) {
        return this.displayRects_.get(i2);
    }

    public List<? extends DisplayRectOrBuilder> getDisplayRectsOrBuilderList() {
        return this.displayRects_;
    }

    public static Builder newBuilder(DisplayRects displayRects) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(displayRects);
    }

    public static DisplayRects parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (DisplayRects) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DisplayRects parseFrom(v vVar, de deVar) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static DisplayRects parseFrom(z zVar) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static DisplayRects parseFrom(z zVar, de deVar) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayRects(DisplayRect displayRect) {
        Objects.requireNonNull(displayRect);
        ensureDisplayRectsIsMutable();
        this.displayRects_.add(displayRect);
    }

    public static DisplayRects parseFrom(InputStream inputStream) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DisplayRects parseFrom(InputStream inputStream, de deVar) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DisplayRects parseFrom(ByteBuffer byteBuffer) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DisplayRects parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<DisplayRects, Builder> implements DisplayRectsOrBuilder {
        private Builder() {
            super(DisplayRects.DEFAULT_INSTANCE);
        }

        public Builder addAllDisplayRects(Iterable<? extends DisplayRect> iterable) {
            copyOnWrite();
            ((DisplayRects) this.instance).addAllDisplayRects(iterable);
            return this;
        }

        public Builder addDisplayRects(int i2, DisplayRect.Builder builder) {
            copyOnWrite();
            ((DisplayRects) this.instance).addDisplayRects(i2, builder.build());
            return this;
        }

        public Builder clearDisplayRects() {
            copyOnWrite();
            ((DisplayRects) this.instance).clearDisplayRects();
            return this;
        }

        @Override // com.waze.jni.protos.map.DisplayRectsOrBuilder
        public DisplayRect getDisplayRects(int i2) {
            return ((DisplayRects) this.instance).getDisplayRects(i2);
        }

        @Override // com.waze.jni.protos.map.DisplayRectsOrBuilder
        public int getDisplayRectsCount() {
            return ((DisplayRects) this.instance).getDisplayRectsCount();
        }

        @Override // com.waze.jni.protos.map.DisplayRectsOrBuilder
        public List<DisplayRect> getDisplayRectsList() {
            return DesugarCollections.unmodifiableList(((DisplayRects) this.instance).getDisplayRectsList());
        }

        public Builder removeDisplayRects(int i2) {
            copyOnWrite();
            ((DisplayRects) this.instance).removeDisplayRects(i2);
            return this;
        }

        public Builder setDisplayRects(int i2, DisplayRect.Builder builder) {
            copyOnWrite();
            ((DisplayRects) this.instance).setDisplayRects(i2, builder.build());
            return this;
        }

        public Builder addDisplayRects(int i2, DisplayRect displayRect) {
            copyOnWrite();
            ((DisplayRects) this.instance).addDisplayRects(i2, displayRect);
            return this;
        }

        public Builder setDisplayRects(int i2, DisplayRect displayRect) {
            copyOnWrite();
            ((DisplayRects) this.instance).setDisplayRects(i2, displayRect);
            return this;
        }

        public Builder addDisplayRects(DisplayRect.Builder builder) {
            copyOnWrite();
            ((DisplayRects) this.instance).addDisplayRects(builder.build());
            return this;
        }

        public Builder addDisplayRects(DisplayRect displayRect) {
            copyOnWrite();
            ((DisplayRects) this.instance).addDisplayRects(displayRect);
            return this;
        }
    }

    public static DisplayRects parseFrom(byte[] bArr) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DisplayRects parseFrom(byte[] bArr, de deVar) {
        return (DisplayRects) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
