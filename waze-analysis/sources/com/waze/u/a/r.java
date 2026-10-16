package com.waze.u.a;

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
/* loaded from: classes5.dex */
public final class r extends du<r, p> implements fj {
    public static final int AUDIO_FIELD_NUMBER = 1;
    private static final r DEFAULT_INSTANCE;
    private static volatile fo<r> PARSER = null;
    public static final int RECOGNIZER_FIELD_NUMBER = 2;
    private b audio_;
    private int bitField0_;
    private int recognizer_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        this.audio_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecognizer() {
        this.bitField0_ &= -3;
        this.recognizer_ = 0;
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.audio_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.audio_ = bVar;
        this.bitField0_ |= 1;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(b bVar) {
        Objects.requireNonNull(bVar);
        this.audio_ = bVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecognizer(q qVar) {
        this.recognizer_ = qVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "audio_", "recognizer_", e.f41618c});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getAudio() {
        b bVar = this.audio_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public q getRecognizer() {
        q qVarA = q.a(this.recognizer_);
        return qVarA == null ? q.RECOGNIZER_UNSPECIFIED : qVarA;
    }

    public boolean hasAudio() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRecognizer() {
        return (this.bitField0_ & 2) != 0;
    }

    public static p newBuilder(r rVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(v vVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(z zVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
