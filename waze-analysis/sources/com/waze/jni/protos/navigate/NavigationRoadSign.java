package com.waze.jni.protos.navigate;

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
import com.waze.jni.protos.navigate.NavigationExitSign;
import com.waze.jni.protos.navigate.NavigationRoadShield;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRoadSign extends du<NavigationRoadSign, Builder> implements NavigationRoadSignOrBuilder {
    private static final NavigationRoadSign DEFAULT_INSTANCE;
    public static final int EXIT_SIGN_FIELD_NUMBER = 1;
    private static volatile fo<NavigationRoadSign> PARSER = null;
    public static final int PRIMARY_MARKUP_FIELD_NUMBER = 3;
    public static final int ROAD_SHIELD_FIELD_NUMBER = 2;
    public static final int SECONDARY_MARKUP_FIELD_NUMBER = 4;
    public static final int TEXT_REPRESENTATION_FIELD_NUMBER = 5;
    private eo<NavigationExitSign> exitSign_ = emptyProtobufList();
    private eo<NavigationRoadShield> roadShield_ = emptyProtobufList();
    private String primaryMarkup_ = "";
    private String secondaryMarkup_ = "";
    private String textRepresentation_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationRoadSign$1, reason: invalid class name */
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
        NavigationRoadSign navigationRoadSign = new NavigationRoadSign();
        DEFAULT_INSTANCE = navigationRoadSign;
        du.registerDefaultInstance(NavigationRoadSign.class, navigationRoadSign);
    }

    private NavigationRoadSign() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExitSign(Iterable<? extends NavigationExitSign> iterable) {
        ensureExitSignIsMutable();
        c.addAll(iterable, this.exitSign_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoadShield(Iterable<? extends NavigationRoadShield> iterable) {
        ensureRoadShieldIsMutable();
        c.addAll(iterable, this.roadShield_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExitSign(int i2, NavigationExitSign navigationExitSign) {
        Objects.requireNonNull(navigationExitSign);
        ensureExitSignIsMutable();
        this.exitSign_.add(i2, navigationExitSign);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoadShield(int i2, NavigationRoadShield navigationRoadShield) {
        Objects.requireNonNull(navigationRoadShield);
        ensureRoadShieldIsMutable();
        this.roadShield_.add(i2, navigationRoadShield);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitSign() {
        this.exitSign_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryMarkup() {
        this.primaryMarkup_ = getDefaultInstance().getPrimaryMarkup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadShield() {
        this.roadShield_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryMarkup() {
        this.secondaryMarkup_ = getDefaultInstance().getSecondaryMarkup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextRepresentation() {
        this.textRepresentation_ = getDefaultInstance().getTextRepresentation();
    }

    private void ensureExitSignIsMutable() {
        eo<NavigationExitSign> eoVar = this.exitSign_;
        if (eoVar.c()) {
            return;
        }
        this.exitSign_ = du.mutableCopy(eoVar);
    }

    private void ensureRoadShieldIsMutable() {
        eo<NavigationRoadShield> eoVar = this.roadShield_;
        if (eoVar.c()) {
            return;
        }
        this.roadShield_ = du.mutableCopy(eoVar);
    }

    public static NavigationRoadSign getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationRoadSign parseDelimitedFrom(InputStream inputStream) {
        return (NavigationRoadSign) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationRoadSign parseFrom(v vVar) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationRoadSign> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExitSign(int i2) {
        ensureExitSignIsMutable();
        this.exitSign_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoadShield(int i2) {
        ensureRoadShieldIsMutable();
        this.roadShield_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitSign(int i2, NavigationExitSign navigationExitSign) {
        Objects.requireNonNull(navigationExitSign);
        ensureExitSignIsMutable();
        this.exitSign_.set(i2, navigationExitSign);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryMarkup(String str) {
        Objects.requireNonNull(str);
        this.primaryMarkup_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryMarkupBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.primaryMarkup_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadShield(int i2, NavigationRoadShield navigationRoadShield) {
        Objects.requireNonNull(navigationRoadShield);
        ensureRoadShieldIsMutable();
        this.roadShield_.set(i2, navigationRoadShield);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryMarkup(String str) {
        Objects.requireNonNull(str);
        this.secondaryMarkup_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryMarkupBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.secondaryMarkup_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextRepresentation(String str) {
        Objects.requireNonNull(str);
        this.textRepresentation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextRepresentationBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.textRepresentation_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"exitSign_", NavigationExitSign.class, "roadShield_", NavigationRoadShield.class, "primaryMarkup_", "secondaryMarkup_", "textRepresentation_"});
        }
        if (iOrdinal == 3) {
            return new NavigationRoadSign();
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
        fo<NavigationRoadSign> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationRoadSign.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public NavigationExitSign getExitSign(int i2) {
        return this.exitSign_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public int getExitSignCount() {
        return this.exitSign_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public List<NavigationExitSign> getExitSignList() {
        return this.exitSign_;
    }

    public NavigationExitSignOrBuilder getExitSignOrBuilder(int i2) {
        return this.exitSign_.get(i2);
    }

    public List<? extends NavigationExitSignOrBuilder> getExitSignOrBuilderList() {
        return this.exitSign_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public String getPrimaryMarkup() {
        return this.primaryMarkup_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public v getPrimaryMarkupBytes() {
        return v.s(this.primaryMarkup_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public NavigationRoadShield getRoadShield(int i2) {
        return this.roadShield_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public int getRoadShieldCount() {
        return this.roadShield_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public List<NavigationRoadShield> getRoadShieldList() {
        return this.roadShield_;
    }

    public NavigationRoadShieldOrBuilder getRoadShieldOrBuilder(int i2) {
        return this.roadShield_.get(i2);
    }

    public List<? extends NavigationRoadShieldOrBuilder> getRoadShieldOrBuilderList() {
        return this.roadShield_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public String getSecondaryMarkup() {
        return this.secondaryMarkup_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public v getSecondaryMarkupBytes() {
        return v.s(this.secondaryMarkup_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public String getTextRepresentation() {
        return this.textRepresentation_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
    public v getTextRepresentationBytes() {
        return v.s(this.textRepresentation_);
    }

    public static Builder newBuilder(NavigationRoadSign navigationRoadSign) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationRoadSign);
    }

    public static NavigationRoadSign parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationRoadSign) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationRoadSign parseFrom(v vVar, de deVar) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationRoadSign parseFrom(z zVar) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationRoadSign parseFrom(z zVar, de deVar) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExitSign(NavigationExitSign navigationExitSign) {
        Objects.requireNonNull(navigationExitSign);
        ensureExitSignIsMutable();
        this.exitSign_.add(navigationExitSign);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoadShield(NavigationRoadShield navigationRoadShield) {
        Objects.requireNonNull(navigationRoadShield);
        ensureRoadShieldIsMutable();
        this.roadShield_.add(navigationRoadShield);
    }

    public static NavigationRoadSign parseFrom(InputStream inputStream) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationRoadSign parseFrom(InputStream inputStream, de deVar) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationRoadSign parseFrom(ByteBuffer byteBuffer) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationRoadSign parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationRoadSign, Builder> implements NavigationRoadSignOrBuilder {
        private Builder() {
            super(NavigationRoadSign.DEFAULT_INSTANCE);
        }

        public Builder addAllExitSign(Iterable<? extends NavigationExitSign> iterable) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addAllExitSign(iterable);
            return this;
        }

        public Builder addAllRoadShield(Iterable<? extends NavigationRoadShield> iterable) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addAllRoadShield(iterable);
            return this;
        }

        public Builder addExitSign(int i2, NavigationExitSign.Builder builder) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addExitSign(i2, builder.build());
            return this;
        }

        public Builder addRoadShield(int i2, NavigationRoadShield.Builder builder) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addRoadShield(i2, builder.build());
            return this;
        }

        public Builder clearExitSign() {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).clearExitSign();
            return this;
        }

        public Builder clearPrimaryMarkup() {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).clearPrimaryMarkup();
            return this;
        }

        public Builder clearRoadShield() {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).clearRoadShield();
            return this;
        }

        public Builder clearSecondaryMarkup() {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).clearSecondaryMarkup();
            return this;
        }

        public Builder clearTextRepresentation() {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).clearTextRepresentation();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public NavigationExitSign getExitSign(int i2) {
            return ((NavigationRoadSign) this.instance).getExitSign(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public int getExitSignCount() {
            return ((NavigationRoadSign) this.instance).getExitSignCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public List<NavigationExitSign> getExitSignList() {
            return DesugarCollections.unmodifiableList(((NavigationRoadSign) this.instance).getExitSignList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public String getPrimaryMarkup() {
            return ((NavigationRoadSign) this.instance).getPrimaryMarkup();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public v getPrimaryMarkupBytes() {
            return ((NavigationRoadSign) this.instance).getPrimaryMarkupBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public NavigationRoadShield getRoadShield(int i2) {
            return ((NavigationRoadSign) this.instance).getRoadShield(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public int getRoadShieldCount() {
            return ((NavigationRoadSign) this.instance).getRoadShieldCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public List<NavigationRoadShield> getRoadShieldList() {
            return DesugarCollections.unmodifiableList(((NavigationRoadSign) this.instance).getRoadShieldList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public String getSecondaryMarkup() {
            return ((NavigationRoadSign) this.instance).getSecondaryMarkup();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public v getSecondaryMarkupBytes() {
            return ((NavigationRoadSign) this.instance).getSecondaryMarkupBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public String getTextRepresentation() {
            return ((NavigationRoadSign) this.instance).getTextRepresentation();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRoadSignOrBuilder
        public v getTextRepresentationBytes() {
            return ((NavigationRoadSign) this.instance).getTextRepresentationBytes();
        }

        public Builder removeExitSign(int i2) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).removeExitSign(i2);
            return this;
        }

        public Builder removeRoadShield(int i2) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).removeRoadShield(i2);
            return this;
        }

        public Builder setExitSign(int i2, NavigationExitSign.Builder builder) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setExitSign(i2, builder.build());
            return this;
        }

        public Builder setPrimaryMarkup(String str) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setPrimaryMarkup(str);
            return this;
        }

        public Builder setPrimaryMarkupBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setPrimaryMarkupBytes(vVar);
            return this;
        }

        public Builder setRoadShield(int i2, NavigationRoadShield.Builder builder) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setRoadShield(i2, builder.build());
            return this;
        }

        public Builder setSecondaryMarkup(String str) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setSecondaryMarkup(str);
            return this;
        }

        public Builder setSecondaryMarkupBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setSecondaryMarkupBytes(vVar);
            return this;
        }

        public Builder setTextRepresentation(String str) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setTextRepresentation(str);
            return this;
        }

        public Builder setTextRepresentationBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setTextRepresentationBytes(vVar);
            return this;
        }

        public Builder addExitSign(int i2, NavigationExitSign navigationExitSign) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addExitSign(i2, navigationExitSign);
            return this;
        }

        public Builder addRoadShield(int i2, NavigationRoadShield navigationRoadShield) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addRoadShield(i2, navigationRoadShield);
            return this;
        }

        public Builder setExitSign(int i2, NavigationExitSign navigationExitSign) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setExitSign(i2, navigationExitSign);
            return this;
        }

        public Builder setRoadShield(int i2, NavigationRoadShield navigationRoadShield) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).setRoadShield(i2, navigationRoadShield);
            return this;
        }

        public Builder addExitSign(NavigationExitSign.Builder builder) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addExitSign(builder.build());
            return this;
        }

        public Builder addRoadShield(NavigationRoadShield.Builder builder) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addRoadShield(builder.build());
            return this;
        }

        public Builder addExitSign(NavigationExitSign navigationExitSign) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addExitSign(navigationExitSign);
            return this;
        }

        public Builder addRoadShield(NavigationRoadShield navigationRoadShield) {
            copyOnWrite();
            ((NavigationRoadSign) this.instance).addRoadShield(navigationRoadShield);
            return this;
        }
    }

    public static NavigationRoadSign parseFrom(byte[] bArr) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationRoadSign parseFrom(byte[] bArr, de deVar) {
        return (NavigationRoadSign) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
