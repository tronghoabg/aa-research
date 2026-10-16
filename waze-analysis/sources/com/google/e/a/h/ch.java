package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ch extends du<ch, cg> implements fj {
    private static final ch DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile fo<ch> PARSER;
    private int bitField0_;
    private bm dekTemplate_;
    private String kekUri_ = "";

    static {
        ch chVar = new ch();
        DEFAULT_INSTANCE = chVar;
        du.registerDefaultInstance(ch.class, chVar);
    }

    private ch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDekTemplate() {
        this.dekTemplate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKekUri() {
        this.kekUri_ = getDefaultInstance().getKekUri();
    }

    public static ch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDekTemplate(bm bmVar) {
        Objects.requireNonNull(bmVar);
        bm bmVar2 = this.dekTemplate_;
        if (bmVar2 != null && bmVar2 != bm.getDefaultInstance()) {
            bl blVarNewBuilder = bm.newBuilder(bmVar2);
            blVarNewBuilder.mergeFrom((bl) bmVar);
            bmVar = blVarNewBuilder.buildPartial();
        }
        this.dekTemplate_ = bmVar;
        this.bitField0_ |= 1;
    }

    public static cg newBuilder() {
        return (cg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ch parseDelimitedFrom(InputStream inputStream) {
        return (ch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ch parseFrom(com.google.v.v vVar) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDekTemplate(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.dekTemplate_ = bmVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKekUri(String str) {
        Objects.requireNonNull(str);
        this.kekUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKekUriBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.kekUri_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
        }
        if (iOrdinal == 3) {
            return new ch();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ch> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ch.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bm getDekTemplate() {
        bm bmVar = this.dekTemplate_;
        return bmVar == null ? bm.getDefaultInstance() : bmVar;
    }

    public String getKekUri() {
        return this.kekUri_;
    }

    public com.google.v.v getKekUriBytes() {
        return com.google.v.v.s(this.kekUri_);
    }

    public boolean hasDekTemplate() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cg newBuilder(ch chVar) {
        return (cg) DEFAULT_INSTANCE.createBuilder(chVar);
    }

    public static ch parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ch parseFrom(com.google.v.v vVar, de deVar) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ch parseFrom(com.google.v.z zVar) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ch parseFrom(com.google.v.z zVar, de deVar) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ch parseFrom(InputStream inputStream) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ch parseFrom(InputStream inputStream, de deVar) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ch parseFrom(ByteBuffer byteBuffer) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ch parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ch parseFrom(byte[] bArr) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ch parseFrom(byte[] bArr, de deVar) {
        return (ch) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
