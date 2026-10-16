package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq extends du<aq, ap> implements fj {
    private static final aq DEFAULT_INSTANCE;
    private static volatile fo<aq> PARSER = null;
    public static final int SEARCH_RESULTS_FIELD_NUMBER = 1;
    private byte memoizedIsInitialized = 2;
    private eo<i.b.n.ab> searchResults_ = emptyProtobufList();

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        du.registerDefaultInstance(aq.class, aqVar);
    }

    private aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSearchResults(Iterable<? extends i.b.n.ab> iterable) {
        ensureSearchResultsIsMutable();
        com.google.v.c.addAll(iterable, this.searchResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSearchResults(int i2, i.b.n.ab abVar) {
        Objects.requireNonNull(abVar);
        ensureSearchResultsIsMutable();
        this.searchResults_.add(i2, abVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchResults() {
        this.searchResults_ = emptyProtobufList();
    }

    private void ensureSearchResultsIsMutable() {
        eo<i.b.n.ab> eoVar = this.searchResults_;
        if (eoVar.c()) {
            return;
        }
        this.searchResults_ = du.mutableCopy(eoVar);
    }

    public static aq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aq parseDelimitedFrom(InputStream inputStream) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(com.google.v.v vVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSearchResults(int i2) {
        ensureSearchResultsIsMutable();
        this.searchResults_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResults(int i2, i.b.n.ab abVar) {
        Objects.requireNonNull(abVar);
        ensureSearchResultsIsMutable();
        this.searchResults_.set(i2, abVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"searchResults_", i.b.n.ab.class});
            case 3:
                return new aq();
            case 4:
                return new ap(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<aq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (aq.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public i.b.n.ab getSearchResults(int i2) {
        return this.searchResults_.get(i2);
    }

    public int getSearchResultsCount() {
        return this.searchResults_.size();
    }

    public List<i.b.n.ab> getSearchResultsList() {
        return this.searchResults_;
    }

    public i.b.n.ac getSearchResultsOrBuilder(int i2) {
        return this.searchResults_.get(i2);
    }

    public List<? extends i.b.n.ac> getSearchResultsOrBuilderList() {
        return this.searchResults_;
    }

    public static ap newBuilder(aq aqVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(aqVar);
    }

    public static aq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(com.google.v.v vVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aq parseFrom(com.google.v.z zVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aq parseFrom(com.google.v.z zVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSearchResults(i.b.n.ab abVar) {
        Objects.requireNonNull(abVar);
        ensureSearchResultsIsMutable();
        this.searchResults_.add(abVar);
    }

    public static aq parseFrom(InputStream inputStream) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(InputStream inputStream, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(ByteBuffer byteBuffer) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aq parseFrom(byte[] bArr) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aq parseFrom(byte[] bArr, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
