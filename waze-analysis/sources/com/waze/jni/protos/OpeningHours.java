package com.waze.jni.protos;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class OpeningHours extends du<OpeningHours, Builder> implements OpeningHoursOrBuilder {
    public static final int DAYS_FIELD_NUMBER = 1;
    private static final OpeningHours DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 2;
    private static volatile fo<OpeningHours> PARSER = null;
    public static final int TO_FIELD_NUMBER = 3;
    private int bitField0_;
    private int daysMemoizedSerializedSize = -1;
    private ek days_ = emptyIntList();
    private String from_ = "";
    private String to_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.OpeningHours$1, reason: invalid class name */
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
    public final class Builder extends dm<OpeningHours, Builder> implements OpeningHoursOrBuilder {
        private Builder() {
            super(OpeningHours.DEFAULT_INSTANCE);
        }

        public Builder addAllDays(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((OpeningHours) this.instance).addAllDays(iterable);
            return this;
        }

        public Builder addDays(int i2) {
            copyOnWrite();
            ((OpeningHours) this.instance).addDays(i2);
            return this;
        }

        public Builder clearDays() {
            copyOnWrite();
            ((OpeningHours) this.instance).clearDays();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((OpeningHours) this.instance).clearFrom();
            return this;
        }

        public Builder clearTo() {
            copyOnWrite();
            ((OpeningHours) this.instance).clearTo();
            return this;
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public int getDays(int i2) {
            return ((OpeningHours) this.instance).getDays(i2);
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public int getDaysCount() {
            return ((OpeningHours) this.instance).getDaysCount();
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public List<Integer> getDaysList() {
            return DesugarCollections.unmodifiableList(((OpeningHours) this.instance).getDaysList());
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public String getFrom() {
            return ((OpeningHours) this.instance).getFrom();
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public v getFromBytes() {
            return ((OpeningHours) this.instance).getFromBytes();
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public String getTo() {
            return ((OpeningHours) this.instance).getTo();
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public v getToBytes() {
            return ((OpeningHours) this.instance).getToBytes();
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public boolean hasFrom() {
            return ((OpeningHours) this.instance).hasFrom();
        }

        @Override // com.waze.jni.protos.OpeningHoursOrBuilder
        public boolean hasTo() {
            return ((OpeningHours) this.instance).hasTo();
        }

        public Builder setDays(int i2, int i3) {
            copyOnWrite();
            ((OpeningHours) this.instance).setDays(i2, i3);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((OpeningHours) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(v vVar) {
            copyOnWrite();
            ((OpeningHours) this.instance).setFromBytes(vVar);
            return this;
        }

        public Builder setTo(String str) {
            copyOnWrite();
            ((OpeningHours) this.instance).setTo(str);
            return this;
        }

        public Builder setToBytes(v vVar) {
            copyOnWrite();
            ((OpeningHours) this.instance).setToBytes(vVar);
            return this;
        }
    }

    static {
        OpeningHours openingHours = new OpeningHours();
        DEFAULT_INSTANCE = openingHours;
        du.registerDefaultInstance(OpeningHours.class, openingHours);
    }

    private OpeningHours() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDays(Iterable<? extends Integer> iterable) {
        ensureDaysIsMutable();
        c.addAll(iterable, this.days_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDays(int i2) {
        ensureDaysIsMutable();
        this.days_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDays() {
        this.days_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.bitField0_ &= -2;
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTo() {
        this.bitField0_ &= -3;
        this.to_ = getDefaultInstance().getTo();
    }

    private void ensureDaysIsMutable() {
        ek ekVar = this.days_;
        if (ekVar.c()) {
            return;
        }
        this.days_ = du.mutableCopy(ekVar);
    }

    public static OpeningHours getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static OpeningHours parseDelimitedFrom(InputStream inputStream) {
        return (OpeningHours) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OpeningHours parseFrom(v vVar) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<OpeningHours> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDays(int i2, int i3) {
        ensureDaysIsMutable();
        this.days_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.from_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.to_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.to_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001'\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "days_", "from_", "to_"});
        }
        if (iOrdinal == 3) {
            return new OpeningHours();
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
        fo<OpeningHours> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (OpeningHours.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public int getDays(int i2) {
        return this.days_.d(i2);
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public int getDaysCount() {
        return this.days_.size();
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public List<Integer> getDaysList() {
        return this.days_;
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public String getFrom() {
        return this.from_;
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public v getFromBytes() {
        return v.s(this.from_);
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public String getTo() {
        return this.to_;
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public v getToBytes() {
        return v.s(this.to_);
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public boolean hasFrom() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.OpeningHoursOrBuilder
    public boolean hasTo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(OpeningHours openingHours) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(openingHours);
    }

    public static OpeningHours parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (OpeningHours) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static OpeningHours parseFrom(v vVar, de deVar) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static OpeningHours parseFrom(z zVar) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static OpeningHours parseFrom(z zVar, de deVar) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static OpeningHours parseFrom(InputStream inputStream) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OpeningHours parseFrom(InputStream inputStream, de deVar) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static OpeningHours parseFrom(ByteBuffer byteBuffer) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static OpeningHours parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static OpeningHours parseFrom(byte[] bArr) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OpeningHours parseFrom(byte[] bArr, de deVar) {
        return (OpeningHours) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
