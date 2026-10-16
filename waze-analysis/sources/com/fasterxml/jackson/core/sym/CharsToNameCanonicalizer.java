package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CharsToNameCanonicalizer {
    protected Bucket[] _buckets;
    protected boolean _canonicalize;
    protected final int _factoryFeatures;
    protected boolean _hashShared;
    protected int _indexMask;
    protected int _longestCollisionList;
    protected BitSet _overflows;
    protected final CharsToNameCanonicalizer _parent;
    protected final int _seed;
    protected int _size;
    protected int _sizeThreshold;
    protected final StreamReadConstraints _streamReadConstraints;
    protected String[] _symbols;
    protected final AtomicReference<TableInfo> _tableInfo;

    /* compiled from: WazeSource */
    final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i2, int i3) {
            if (this.symbol.length() != i3) {
                return null;
            }
            int i4 = 0;
            while (this.symbol.charAt(i4) == cArr[i2 + i4]) {
                i4++;
                if (i4 >= i3) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, StreamReadConstraints streamReadConstraints, int i2, int i3, TableInfo tableInfo) {
        this._parent = charsToNameCanonicalizer;
        this._streamReadConstraints = streamReadConstraints;
        this._seed = i3;
        this._tableInfo = null;
        this._factoryFeatures = i2;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2);
        this._symbols = tableInfo.symbols;
        this._buckets = tableInfo.buckets;
        this._size = tableInfo.size;
        this._longestCollisionList = tableInfo.longestCollisionList;
        int length = this._symbols.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._hashShared = true;
    }

    private String _addSymbol(char[] cArr, int i2, int i3, int i4, int i5) throws StreamConstraintsException {
        if (this._hashShared) {
            copyArrays();
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i5 = _hashToIndex(calcHash(cArr, i2, i3));
        }
        String str = new String(cArr, i2, i3);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._factoryFeatures)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i5] == null) {
            strArr[i5] = str;
            return str;
        }
        int i6 = i5 >> 1;
        Bucket[] bucketArr = this._buckets;
        Bucket bucket = new Bucket(str, bucketArr[i6]);
        int i7 = bucket.length;
        if (i7 > 150) {
            _handleSpillOverflow(i6, bucket, i5);
            return str;
        }
        bucketArr[i6] = bucket;
        this._longestCollisionList = Math.max(i7, this._longestCollisionList);
        return str;
    }

    private String _findSymbol2(char[] cArr, int i2, int i3, Bucket bucket) {
        while (bucket != null) {
            String strHas = bucket.has(cArr, i2, i3);
            if (strHas != null) {
                return strHas;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private void _handleSpillOverflow(int i2, Bucket bucket, int i3) throws StreamConstraintsException {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i2);
        } else if (bitSet.get(i2)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._factoryFeatures)) {
                _reportTooManyCollisions(150);
            }
            this._canonicalize = false;
        } else {
            this._overflows.set(i2);
        }
        this._symbols[i3] = bucket.symbol;
        this._buckets[i2] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i2) {
        return i2 - (i2 >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    public static CharsToNameCanonicalizer createRoot(TokenStreamFactory tokenStreamFactory, int i2) {
        return new CharsToNameCanonicalizer(tokenStreamFactory.streamReadConstraints(), tokenStreamFactory.getFactoryFeatures(), System.identityHashCode(tokenStreamFactory));
    }

    private void mergeChild(TableInfo tableInfo) {
        TableInfo tableInfo2 = this._tableInfo.get();
        int i2 = tableInfo2.size;
        int i3 = tableInfo.size;
        if (i3 == i2) {
            return;
        }
        if (i3 > 12000) {
            tableInfo = TableInfo.createInitial(64);
        }
        CharsToNameCanonicalizer$$ExternalSyntheticBackportWithForwarding0.m(this._tableInfo, tableInfo2, tableInfo);
    }

    private void rehash() {
        String[] strArr = this._symbols;
        int length = strArr.length;
        int i2 = length + length;
        if (i2 > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._hashShared = false;
            return;
        }
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i2];
        this._buckets = new Bucket[i2 >> 1];
        this._indexMask = i2 - 1;
        this._sizeThreshold = _thresholdSize(i2);
        int i3 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i3++;
                int i_hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr2 = this._symbols;
                if (strArr2[i_hashToIndex] == null) {
                    strArr2[i_hashToIndex] = str;
                } else {
                    int i4 = i_hashToIndex >> 1;
                    Bucket[] bucketArr2 = this._buckets;
                    Bucket bucket = new Bucket(str, bucketArr2[i4]);
                    bucketArr2[i4] = bucket;
                    iMax = Math.max(iMax, bucket.length);
                }
            }
        }
        int i5 = length >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (Bucket bucket2 = bucketArr[i6]; bucket2 != null; bucket2 = bucket2.next) {
                i3++;
                String str2 = bucket2.symbol;
                int i_hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr3 = this._symbols;
                if (strArr3[i_hashToIndex2] == null) {
                    strArr3[i_hashToIndex2] = str2;
                } else {
                    int i7 = i_hashToIndex2 >> 1;
                    Bucket[] bucketArr3 = this._buckets;
                    Bucket bucket3 = new Bucket(str2, bucketArr3[i7]);
                    bucketArr3[i7] = bucket3;
                    iMax = Math.max(iMax, bucket3.length);
                }
            }
        }
        this._longestCollisionList = iMax;
        this._overflows = null;
        int i8 = this._size;
        if (i3 != i8) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(i8), Integer.valueOf(i3)));
        }
    }

    public int _hashToIndex(int i2) {
        int i3 = i2 + (i2 >>> 15);
        int i4 = i3 ^ (i3 << 7);
        return this._indexMask & (i4 + (i4 >>> 3));
    }

    protected void _reportTooManyCollisions(int i2) throws StreamConstraintsException {
        throw new StreamConstraintsException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, 150 -- suspect a DoS attack based on hash collisions");
    }

    public int calcHash(String str) {
        int iCharAt = this._seed;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt * 33) + str.charAt(i2);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public String findSymbol(char[] cArr, int i2, int i3, int i4) throws StreamConstraintsException {
        if (i3 <= 0) {
            return "";
        }
        if (!this._canonicalize) {
            this._streamReadConstraints.validateNameLength(i3);
            return new String(cArr, i2, i3);
        }
        int i_hashToIndex = _hashToIndex(i4);
        String str = this._symbols[i_hashToIndex];
        if (str != null) {
            if (str.length() == i3) {
                int i5 = 0;
                while (str.charAt(i5) == cArr[i2 + i5]) {
                    i5++;
                    if (i5 == i3) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[i_hashToIndex >> 1];
            if (bucket != null) {
                String strHas = bucket.has(cArr, i2, i3);
                if (strHas != null) {
                    return strHas;
                }
                String str_findSymbol2 = _findSymbol2(cArr, i2, i3, bucket.next);
                if (str_findSymbol2 != null) {
                    return str_findSymbol2;
                }
            }
        }
        this._streamReadConstraints.validateNameLength(i3);
        return _addSymbol(cArr, i2, i3, i4, i_hashToIndex);
    }

    public int hashSeed() {
        return this._seed;
    }

    public CharsToNameCanonicalizer makeChild() {
        return new CharsToNameCanonicalizer(this, this._streamReadConstraints, this._factoryFeatures, this._seed, this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(new TableInfo(this));
            this._hashShared = true;
        }
    }

    public static CharsToNameCanonicalizer createRoot(TokenStreamFactory tokenStreamFactory) {
        return createRoot(tokenStreamFactory, 0);
    }

    /* compiled from: WazeSource */
    final class TableInfo {
        final Bucket[] buckets;
        final int longestCollisionList;
        final int size;
        final String[] symbols;

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.size = charsToNameCanonicalizer._size;
            this.longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
            this.symbols = charsToNameCanonicalizer._symbols;
            this.buckets = charsToNameCanonicalizer._buckets;
        }

        public static TableInfo createInitial(int i2) {
            return new TableInfo(0, 0, new String[64], new Bucket[32]);
        }

        public TableInfo(int i2, int i3, String[] strArr, Bucket[] bucketArr) {
            this.size = 0;
            this.longestCollisionList = 0;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }
    }

    public int calcHash(char[] cArr, int i2, int i3) {
        int i4 = this._seed;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 33) + cArr[i5];
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    private CharsToNameCanonicalizer(StreamReadConstraints streamReadConstraints, int i2, int i3) {
        this._parent = null;
        this._seed = i3;
        this._streamReadConstraints = streamReadConstraints;
        this._canonicalize = true;
        this._factoryFeatures = i2;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(64));
    }
}
