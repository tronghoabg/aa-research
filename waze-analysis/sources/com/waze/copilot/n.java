package com.waze.copilot;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends du<n, l> implements o {
    public static final int CAR_ID_FIELD_NUMBER = 3;
    public static final int CAR_NAME_FIELD_NUMBER = 4;
    private static final n DEFAULT_INSTANCE;
    public static final int MOOD_ID_FIELD_NUMBER = 1;
    public static final int MOOD_NAME_FIELD_NUMBER = 2;
    private static volatile fo<n> PARSER = null;
    public static final int VOICE_ID_FIELD_NUMBER = 5;
    private int idCase_ = 0;
    private Object id_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarId() {
        if (this.idCase_ == 3) {
            this.idCase_ = 0;
            this.id_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarName() {
        if (this.idCase_ == 4) {
            this.idCase_ = 0;
            this.id_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.idCase_ = 0;
        this.id_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodId() {
        if (this.idCase_ == 1) {
            this.idCase_ = 0;
            this.id_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodName() {
        if (this.idCase_ == 2) {
            this.idCase_ = 0;
            this.id_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        if (this.idCase_ == 5) {
            this.idCase_ = 0;
            this.id_ = null;
        }
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(com.google.v.v vVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarId(long j2) {
        this.idCase_ = 3;
        this.id_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarName(String str) {
        Objects.requireNonNull(str);
        this.idCase_ = 4;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarNameBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.idCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodId(int i2) {
        this.idCase_ = 1;
        this.id_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodName(String str) {
        Objects.requireNonNull(str);
        this.idCase_ = 2;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodNameBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.idCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceId(String str) {
        Objects.requireNonNull(str);
        this.idCase_ = 5;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.idCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u00017\u0000\u0002;\u0000\u00035\u0000\u0004;\u0000\u0005;\u0000", new Object[]{"id_", "idCase_"});
        }
        if (iOrdinal == 3) {
            return new n();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<n> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (n.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCarId() {
        if (this.idCase_ == 3) {
            return ((Long) this.id_).longValue();
        }
        return 0L;
    }

    public String getCarName() {
        return this.idCase_ == 4 ? (String) this.id_ : "";
    }

    public com.google.v.v getCarNameBytes() {
        return com.google.v.v.s(this.idCase_ == 4 ? (String) this.id_ : "");
    }

    public m getIdCase() {
        int i2 = this.idCase_;
        if (i2 == 0) {
            return m.f23091f;
        }
        if (i2 == 1) {
            return m.f23086a;
        }
        if (i2 == 2) {
            return m.f23087b;
        }
        if (i2 == 3) {
            return m.f23088c;
        }
        if (i2 == 4) {
            return m.f23089d;
        }
        if (i2 != 5) {
            return null;
        }
        return m.f23090e;
    }

    public int getMoodId() {
        if (this.idCase_ == 1) {
            return ((Integer) this.id_).intValue();
        }
        return 0;
    }

    public String getMoodName() {
        return this.idCase_ == 2 ? (String) this.id_ : "";
    }

    public com.google.v.v getMoodNameBytes() {
        return com.google.v.v.s(this.idCase_ == 2 ? (String) this.id_ : "");
    }

    public String getVoiceId() {
        return this.idCase_ == 5 ? (String) this.id_ : "";
    }

    public com.google.v.v getVoiceIdBytes() {
        return com.google.v.v.s(this.idCase_ == 5 ? (String) this.id_ : "");
    }

    public boolean hasCarId() {
        return this.idCase_ == 3;
    }

    public boolean hasCarName() {
        return this.idCase_ == 4;
    }

    public boolean hasMoodId() {
        return this.idCase_ == 1;
    }

    public boolean hasMoodName() {
        return this.idCase_ == 2;
    }

    public boolean hasVoiceId() {
        return this.idCase_ == 5;
    }

    public static l newBuilder(n nVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(com.google.v.v vVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(com.google.v.z zVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(com.google.v.z zVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
