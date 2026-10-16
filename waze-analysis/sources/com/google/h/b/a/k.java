package com.google.h.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends du<k, h> implements fj {
    private static final k DEFAULT_INSTANCE;
    public static final int MATCH_FIELD_NUMBER = 1;
    private static volatile fo<k> PARSER = null;
    public static final int REPLACE_WITH_FIELD_NUMBER = 2;
    private int bitField0_;
    private String match_ = "";
    private int replaceWith_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatch() {
        this.bitField0_ &= -2;
        this.match_ = getDefaultInstance().getMatch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplaceWith() {
        this.bitField0_ &= -3;
        this.replaceWith_ = 0;
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatch(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.match_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchBytes(v vVar) {
        this.match_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplaceWith(j jVar) {
        this.replaceWith_ = jVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "match_", "replaceWith_", i.f11024a});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getMatch() {
        return this.match_;
    }

    public v getMatchBytes() {
        return v.s(this.match_);
    }

    public j getReplaceWith() {
        j jVarA = j.a(this.replaceWith_);
        return jVarA == null ? j.UNDEFINED : jVarA;
    }

    public boolean hasMatch() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReplaceWith() {
        return (this.bitField0_ & 2) != 0;
    }

    public static h newBuilder(k kVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
