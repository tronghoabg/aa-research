package com.google.f.a.a;

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
public final class h extends du<h, f> implements fj {
    private static final h DEFAULT_INSTANCE;
    private static volatile fo<h> PARSER = null;
    public static final int PATH_SELECTOR_FIELD_NUMBER = 2;
    public static final int SELF_FIELD_NUMBER = 1;
    private int selectorCase_ = 0;
    private Object selector_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPathSelector() {
        if (this.selectorCase_ == 2) {
            this.selectorCase_ = 0;
            this.selector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selectorCase_ = 0;
        this.selector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelf() {
        if (this.selectorCase_ == 1) {
            this.selectorCase_ = 0;
            this.selector_ = null;
        }
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathSelector(String str) {
        Objects.requireNonNull(str);
        this.selectorCase_ = 2;
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathSelectorBytes(v vVar) {
        this.selector_ = vVar.u();
        this.selectorCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelf(boolean z) {
        this.selectorCase_ = 1;
        this.selector_ = Boolean.valueOf(z);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002;\u0000", new Object[]{"selector_", "selectorCase_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPathSelector() {
        return this.selectorCase_ == 2 ? (String) this.selector_ : "";
    }

    public v getPathSelectorBytes() {
        return v.s(this.selectorCase_ == 2 ? (String) this.selector_ : "");
    }

    public g getSelectorCase() {
        int i2 = this.selectorCase_;
        if (i2 == 0) {
            return g.f8811c;
        }
        if (i2 == 1) {
            return g.f8809a;
        }
        if (i2 != 2) {
            return null;
        }
        return g.f8810b;
    }

    public boolean getSelf() {
        if (this.selectorCase_ == 1) {
            return ((Boolean) this.selector_).booleanValue();
        }
        return false;
    }

    public boolean hasPathSelector() {
        return this.selectorCase_ == 2;
    }

    public boolean hasSelf() {
        return this.selectorCase_ == 1;
    }

    public static f newBuilder(h hVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
