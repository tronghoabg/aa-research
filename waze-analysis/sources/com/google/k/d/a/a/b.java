package com.google.k.d.a.a;

import com.google.k.a.a.b.ar;
import com.google.v.de;
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
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements c {
    private static final b DEFAULT_INSTANCE;
    public static final int INSTANCE_FIELD_NUMBER = 1;
    public static final int IS_ADDED_BY_EDIT_FIELD_NUMBER = 5;
    public static final int IS_INFERRED_FIELD_NUMBER = 4;
    private static volatile fo<b> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int SOURCE_DATASET_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.k.e.a.d instance_;
    private boolean isAddedByEdit_;
    private boolean isInferred_;
    private int provider_;
    private String sourceDataset_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstance() {
        this.instance_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAddedByEdit() {
        this.bitField0_ &= -17;
        this.isAddedByEdit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInferred() {
        this.bitField0_ &= -9;
        this.isInferred_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -3;
        this.provider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceDataset() {
        this.bitField0_ &= -5;
        this.sourceDataset_ = getDefaultInstance().getSourceDataset();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstance(com.google.k.e.a.d dVar) {
        Objects.requireNonNull(dVar);
        com.google.k.e.a.d dVar2 = this.instance_;
        if (dVar2 != null && dVar2 != com.google.k.e.a.d.getDefaultInstance()) {
            com.google.k.e.a.a aVarNewBuilder = com.google.k.e.a.d.newBuilder(dVar2);
            aVarNewBuilder.mergeFrom((com.google.k.e.a.a) dVar);
            dVar = aVarNewBuilder.buildPartial();
        }
        this.instance_ = dVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstance(com.google.k.e.a.d dVar) {
        Objects.requireNonNull(dVar);
        this.instance_ = dVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAddedByEdit(boolean z) {
        this.bitField0_ |= 16;
        this.isAddedByEdit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInferred(boolean z) {
        this.bitField0_ |= 8;
        this.isInferred_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(ar arVar) {
        this.provider_ = arVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceDataset(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.sourceDataset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceDatasetBytes(v vVar) {
        this.sourceDataset_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "instance_", "provider_", ar.b(), "sourceDataset_", "isInferred_", "isAddedByEdit_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.e.a.d getInstance() {
        com.google.k.e.a.d dVar = this.instance_;
        return dVar == null ? com.google.k.e.a.d.getDefaultInstance() : dVar;
    }

    @Deprecated
    public boolean getIsAddedByEdit() {
        return this.isAddedByEdit_;
    }

    public boolean getIsInferred() {
        return this.isInferred_;
    }

    @Deprecated
    public ar getProvider() {
        ar arVarA = ar.a(this.provider_);
        return arVarA == null ? ar.PROVIDER_ANY : arVarA;
    }

    @Deprecated
    public String getSourceDataset() {
        return this.sourceDataset_;
    }

    @Deprecated
    public v getSourceDatasetBytes() {
        return v.s(this.sourceDataset_);
    }

    public boolean hasInstance() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasIsAddedByEdit() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsInferred() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasProvider() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasSourceDataset() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
