package com.waze.ap.b.a.a;

import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab extends com.google.v.du<ab, aa> implements fj {
    private static final ab DEFAULT_INSTANCE;
    private static volatile fo<ab> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private eo<af> rules_ = emptyProtobufList();

    static {
        ab abVar = new ab();
        DEFAULT_INSTANCE = abVar;
        com.google.v.du.registerDefaultInstance(ab.class, abVar);
    }

    private ab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends af> iterable) {
        ensureRulesIsMutable();
        com.google.v.c.addAll(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i2, af afVar) {
        Objects.requireNonNull(afVar);
        ensureRulesIsMutable();
        this.rules_.add(i2, afVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        eo<af> eoVar = this.rules_;
        if (eoVar.c()) {
            return;
        }
        this.rules_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aa newBuilder() {
        return (aa) DEFAULT_INSTANCE.createBuilder();
    }

    public static ab parseDelimitedFrom(InputStream inputStream) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(com.google.v.v vVar) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i2) {
        ensureRulesIsMutable();
        this.rules_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i2, af afVar) {
        Objects.requireNonNull(afVar);
        ensureRulesIsMutable();
        this.rules_.set(i2, afVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", af.class});
        }
        if (iOrdinal == 3) {
            return new ab();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ab> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ab.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public af getRules(int i2) {
        return this.rules_.get(i2);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<af> getRulesList() {
        return this.rules_;
    }

    public ag getRulesOrBuilder(int i2) {
        return this.rules_.get(i2);
    }

    public List<? extends ag> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static aa newBuilder(ab abVar) {
        return (aa) DEFAULT_INSTANCE.createBuilder(abVar);
    }

    public static ab parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ab parseFrom(com.google.v.z zVar) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ab parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(af afVar) {
        Objects.requireNonNull(afVar);
        ensureRulesIsMutable();
        this.rules_.add(afVar);
    }

    public static ab parseFrom(InputStream inputStream) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(ByteBuffer byteBuffer) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ab parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ab parseFrom(byte[] bArr) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ab parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
