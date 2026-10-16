package com.google.t.a.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends du<d, b> implements fj {
    private static final d DEFAULT_INSTANCE;
    private static volatile fo<d> PARSER = null;
    public static final int USER_GAIA_ID_FIELD_FIELD_NUMBER = 1;
    public static final int USER_GAIA_ID_FIELD_NUMBER_IN_HEADER_COLUMN_FIELD_NUMBER = 2;
    private int gaiaIdFieldTagCase_ = 0;
    private Object gaiaIdFieldTag_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaiaIdFieldTag() {
        this.gaiaIdFieldTagCase_ = 0;
        this.gaiaIdFieldTag_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserGaiaIdField() {
        if (this.gaiaIdFieldTagCase_ == 1) {
            this.gaiaIdFieldTagCase_ = 0;
            this.gaiaIdFieldTag_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserGaiaIdFieldNumberInHeaderColumn() {
        if (this.gaiaIdFieldTagCase_ == 2) {
            this.gaiaIdFieldTagCase_ = 0;
            this.gaiaIdFieldTag_ = null;
        }
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGaiaIdField(int i2) {
        this.gaiaIdFieldTagCase_ = 1;
        this.gaiaIdFieldTag_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGaiaIdFieldNumberInHeaderColumn(int i2) {
        this.gaiaIdFieldTagCase_ = 2;
        this.gaiaIdFieldTag_ = Integer.valueOf(i2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00017\u0000\u00027\u0000", new Object[]{"gaiaIdFieldTag_", "gaiaIdFieldTagCase_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getGaiaIdFieldTagCase() {
        int i2 = this.gaiaIdFieldTagCase_;
        if (i2 == 0) {
            return c.f12548c;
        }
        if (i2 == 1) {
            return c.f12546a;
        }
        if (i2 != 2) {
            return null;
        }
        return c.f12547b;
    }

    public int getUserGaiaIdField() {
        if (this.gaiaIdFieldTagCase_ == 1) {
            return ((Integer) this.gaiaIdFieldTag_).intValue();
        }
        return 0;
    }

    public int getUserGaiaIdFieldNumberInHeaderColumn() {
        if (this.gaiaIdFieldTagCase_ == 2) {
            return ((Integer) this.gaiaIdFieldTag_).intValue();
        }
        return 0;
    }

    public boolean hasUserGaiaIdField() {
        return this.gaiaIdFieldTagCase_ == 1;
    }

    public boolean hasUserGaiaIdFieldNumberInHeaderColumn() {
        return this.gaiaIdFieldTagCase_ == 2;
    }

    public static b newBuilder(d dVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
