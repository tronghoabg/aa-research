package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.util.InternCache;
import com.waze.strings.DisplayStrings;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ByteQuadsCanonicalizer {
    protected int _count;
    protected final boolean _failOnDoS;
    protected int[] _hashArea;
    protected boolean _hashShared;
    protected int _hashSize;
    protected final InternCache _interner;
    protected int _longNameOffset;
    protected String[] _names;
    protected final ByteQuadsCanonicalizer _parent;
    protected int _secondaryStart;
    protected final int _seed;
    protected int _spilloverEnd;
    protected final AtomicReference<TableInfo> _tableInfo;
    protected int _tertiaryShift;
    protected int _tertiaryStart;

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i2, TableInfo tableInfo, boolean z, boolean z2) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i2;
        this._interner = z ? InternCache.instance : null;
        this._failOnDoS = z2;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i3 = tableInfo.size;
        this._hashSize = i3;
        int i4 = i3 << 2;
        this._secondaryStart = i4;
        this._tertiaryStart = i4 + (i4 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._hashShared = true;
    }

    private int _appendLongName(int[] iArr, int i2) {
        int i3 = this._longNameOffset;
        int i4 = i3 + i2;
        if (i4 < 0) {
            throw new IllegalStateException(String.format("Internal error: long name offset overflow; start=%s, qlen=%s", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
        int[] iArrCopyOf = this._hashArea;
        int length = iArrCopyOf.length;
        if (i4 > length) {
            iArrCopyOf = Arrays.copyOf(this._hashArea, this._hashArea.length + Math.max(i4 - length, Math.min(4096, this._hashSize)));
            this._hashArea = iArrCopyOf;
        }
        System.arraycopy(iArr, 0, iArrCopyOf, i3, i2);
        this._longNameOffset = i4;
        return i3;
    }

    private final int _calcOffset(int i2) {
        return ((this._hashSize - 1) & i2) << 2;
    }

    static int _calcTertiaryShift(int i2) {
        int i3 = i2 >> 2;
        if (i3 < 64) {
            return 4;
        }
        if (i3 <= 256) {
            return 5;
        }
        return i3 <= 1024 ? 6 : 7;
    }

    private boolean _checkNeedForRehash() {
        int i2 = this._count;
        int i3 = this._hashSize;
        if (i2 > (i3 >> 1)) {
            return ((this._spilloverEnd - _spilloverStart()) >> 2) > ((i2 + 1) >> 7) || i2 > multiplyByFourFifths(i3);
        }
        return false;
    }

    private int _findOffsetForAdd(int i2) throws StreamConstraintsException {
        int i_calcOffset = _calcOffset(i2);
        int[] iArr = this._hashArea;
        if (iArr[i_calcOffset + 3] == 0) {
            return i_calcOffset;
        }
        if (_checkNeedForRehash()) {
            return _resizeAndFindOffsetForAdd(i2);
        }
        int i3 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((i_calcOffset >> (i5 + 2)) << i5);
        int i7 = 1 << i5;
        for (int i8 = i6; i8 < i6 + i7; i8 += 4) {
            if (iArr[i8 + 3] == 0) {
                return i8;
            }
        }
        int i9 = this._spilloverEnd;
        int i10 = i9 + 4;
        this._spilloverEnd = i10;
        if (i10 < (this._hashSize << 3)) {
            return i9;
        }
        if (this._failOnDoS) {
            _reportTooManyCollisions();
        }
        return _resizeAndFindOffsetForAdd(i2);
    }

    private String _findSecondary(int i2, int i3, int i4, int i5) {
        int i6 = this._tertiaryStart;
        int i7 = this._tertiaryShift;
        int i8 = i6 + ((i2 >> (i7 + 2)) << i7);
        int i9 = 1 << i7;
        int[] iArr = this._hashArea;
        for (int i10 = i8; i10 < i8 + i9; i10 += 4) {
            int i11 = iArr[i10 + 3];
            if (i3 == iArr[i10] && i4 == iArr[i10 + 1] && i5 == iArr[i10 + 2] && i11 == 3) {
                return this._names[i10 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr[i_spilloverStart] && i4 == iArr[i_spilloverStart + 1] && i5 == iArr[i_spilloverStart + 2] && iArr[i_spilloverStart + 3] == 3) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    private int _resizeAndFindOffsetForAdd(int i2) throws StreamConstraintsException {
        rehash();
        int i_calcOffset = _calcOffset(i2);
        int[] iArr = this._hashArea;
        if (iArr[i_calcOffset + 3] == 0) {
            return i_calcOffset;
        }
        int i3 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((i_calcOffset >> (i5 + 2)) << i5);
        int i7 = 1 << i5;
        for (int i8 = i6; i8 < i6 + i7; i8 += 4) {
            if (iArr[i8 + 3] == 0) {
                return i8;
            }
        }
        int i9 = this._spilloverEnd;
        this._spilloverEnd = i9 + 4;
        return i9;
    }

    private final int _spilloverStart() {
        int i2 = this._hashSize;
        return (i2 << 3) - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean _verifyLongName(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int[] r0 = r6._hashArea
            r1 = 1
            r2 = 0
            switch(r8) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r6 = r6._verifyLongName2(r7, r8, r9)
            return r6
        Lc:
            r6 = r7[r2]
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r6 != r9) goto L17
            r9 = r8
            r6 = r1
            goto L19
        L17:
            return r2
        L18:
            r6 = r2
        L19:
            int r8 = r6 + 1
            r6 = r7[r6]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r6 != r9) goto L25
            r9 = r3
            goto L27
        L25:
            return r2
        L26:
            r8 = r2
        L27:
            int r6 = r8 + 1
            r8 = r7[r8]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 != r9) goto L33
            r9 = r3
            goto L35
        L33:
            return r2
        L34:
            r6 = r2
        L35:
            int r8 = r6 + 1
            r6 = r7[r6]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r6 != r9) goto L41
            r9 = r3
            goto L43
        L41:
            return r2
        L42:
            r8 = r2
        L43:
            int r6 = r8 + 1
            r3 = r7[r8]
            int r4 = r9 + 1
            r5 = r0[r9]
            if (r3 == r5) goto L4e
            return r2
        L4e:
            int r3 = r8 + 2
            r6 = r7[r6]
            int r5 = r9 + 2
            r4 = r0[r4]
            if (r6 == r4) goto L59
            return r2
        L59:
            int r8 = r8 + 3
            r6 = r7[r3]
            int r9 = r9 + 3
            r3 = r0[r5]
            if (r6 == r3) goto L64
            return r2
        L64:
            r6 = r7[r8]
            r7 = r0[r9]
            if (r6 == r7) goto L6b
            return r2
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private boolean _verifyLongName2(int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (iArr[i4] == this._hashArea[i3]) {
            i4++;
            if (i4 >= i2) {
                return true;
            }
            i3++;
        }
        return false;
    }

    private void _verifySharing() {
        if (this._hashShared) {
            if (this._parent == null) {
                if (this._count != 0) {
                    throw new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
                }
                throw new IllegalStateException("Internal error: Cannot add names to Root symbol table");
            }
            int[] iArr = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        TableInfo tableInfo2 = this._tableInfo.get();
        int i2 = tableInfo2.count;
        int i3 = tableInfo.count;
        if (i3 == i2) {
            return;
        }
        if (i3 > 6000) {
            tableInfo = TableInfo.createInitial(64);
        }
        ByteQuadsCanonicalizer$$ExternalSyntheticBackportWithForwarding0.m(this._tableInfo, tableInfo2, tableInfo);
    }

    static int multiplyByFourFifths(int i2) {
        return (int) ((i2 * 3435973837L) >>> 32);
    }

    private void nukeSymbols(boolean z) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    private void rehash() throws StreamConstraintsException {
        this._hashShared = false;
        int[] iArr = this._hashArea;
        String[] strArr = this._names;
        int i2 = this._hashSize;
        int i3 = i2 + i2;
        int i4 = this._count;
        int i5 = this._spilloverEnd;
        if (i3 > 65536) {
            nukeSymbols(true);
            return;
        }
        this._hashArea = new int[iArr.length + (i2 << 3)];
        this._hashSize = i3;
        int i6 = i3 << 2;
        this._secondaryStart = i6;
        this._tertiaryStart = i6 + (i6 >> 1);
        this._tertiaryShift = _calcTertiaryShift(i3);
        int length = strArr.length;
        this._names = new String[length + length];
        nukeSymbols(false);
        int[] iArr2 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i9 != 0) {
                i7++;
                String str = strArr[i8 >> 2];
                if (i9 == 1) {
                    iArr2[0] = iArr[i8];
                    addName(str, iArr2, 1);
                } else if (i9 == 2) {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    addName(str, iArr2, 2);
                } else if (i9 != 3) {
                    int i10 = i8 + 1;
                    if (i9 > iArr2.length) {
                        iArr2 = new int[i9];
                    }
                    System.arraycopy(iArr, iArr[i10], iArr2, 0, i9);
                    addName(str, iArr2, i9);
                } else {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    iArr2[2] = iArr[i8 + 2];
                    addName(str, iArr2, 3);
                }
            }
        }
        if (i7 == i4) {
            return;
        }
        throw new IllegalStateException("Internal error: Failed rehash(), old count=" + i4 + ", copyCount=" + i7);
    }

    protected void _reportTooManyCollisions() throws StreamConstraintsException {
        int i2 = this._hashSize;
        if (i2 <= 1024) {
            return;
        }
        throw new StreamConstraintsException("Spill-over slots in symbol table with " + this._count + " entries, hash area of " + i2 + " slots is now full (all " + (i2 >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public String addName(String str, int[] iArr, int i2) throws StreamConstraintsException {
        int i_findOffsetForAdd;
        _verifySharing();
        InternCache internCache = this._interner;
        if (internCache != null) {
            str = internCache.intern(str);
        }
        if (i2 == 1) {
            i_findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0]));
            int[] iArr2 = this._hashArea;
            iArr2[i_findOffsetForAdd] = iArr[0];
            iArr2[i_findOffsetForAdd + 3] = 1;
        } else if (i2 == 2) {
            i_findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this._hashArea;
            iArr3[i_findOffsetForAdd] = iArr[0];
            iArr3[i_findOffsetForAdd + 1] = iArr[1];
            iArr3[i_findOffsetForAdd + 3] = 2;
        } else if (i2 != 3) {
            int iCalcHash = calcHash(iArr, i2);
            i_findOffsetForAdd = _findOffsetForAdd(iCalcHash);
            this._hashArea[i_findOffsetForAdd] = iCalcHash;
            int i_appendLongName = _appendLongName(iArr, i2);
            int[] iArr4 = this._hashArea;
            iArr4[i_findOffsetForAdd + 1] = i_appendLongName;
            iArr4[i_findOffsetForAdd + 3] = i2;
        } else {
            int i_findOffsetForAdd2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this._hashArea;
            iArr5[i_findOffsetForAdd2] = iArr[0];
            iArr5[i_findOffsetForAdd2 + 1] = iArr[1];
            iArr5[i_findOffsetForAdd2 + 2] = iArr[2];
            iArr5[i_findOffsetForAdd2 + 3] = 3;
            i_findOffsetForAdd = i_findOffsetForAdd2;
        }
        this._names[i_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public int calcHash(int[] iArr, int i2) {
        if (i2 < 4) {
            throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
        }
        int i3 = this._seed ^ iArr[0];
        int i4 = i3 + (i3 >>> 9) + iArr[1];
        int i5 = ((i4 + (i4 >>> 15)) * 33) ^ iArr[2];
        int i6 = i5 + (i5 >>> 4);
        for (int i7 = 3; i7 < i2; i7++) {
            int i8 = iArr[i7];
            i6 += i8 ^ (i8 >> 21);
        }
        int i9 = i6 * 65599;
        int i10 = i9 + (i9 >>> 19);
        return i10 ^ (i10 << 5);
    }

    public String findName(int[] iArr, int i2) {
        if (i2 < 4) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : findName(iArr[0], iArr[1], iArr[2]) : findName(iArr[0], iArr[1]) : findName(iArr[0]);
        }
        int iCalcHash = calcHash(iArr, i2);
        int i_calcOffset = _calcOffset(iCalcHash);
        int[] iArr2 = this._hashArea;
        int i3 = iArr2[i_calcOffset + 3];
        if (iCalcHash == iArr2[i_calcOffset] && i3 == i2 && _verifyLongName(iArr, i2, iArr2[i_calcOffset + 1])) {
            return this._names[i_calcOffset >> 2];
        }
        if (i3 == 0) {
            return null;
        }
        int i4 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        return (iCalcHash == iArr2[i4] && iArr2[i4 + 3] == i2 && _verifyLongName(iArr, i2, iArr2[i4 + 1])) ? this._names[i4 >> 2] : _findSecondary(i_calcOffset, iCalcHash, iArr, i2);
    }

    public boolean isCanonicalizing() {
        return this._parent != null;
    }

    public ByteQuadsCanonicalizer makeChild(int i2) {
        return new ByteQuadsCanonicalizer(this, this._seed, this._tableInfo.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i2), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i2));
    }

    public ByteQuadsCanonicalizer makeChildOrPlaceholder(int i2) {
        return JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2) ? new ByteQuadsCanonicalizer(this, this._seed, this._tableInfo.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i2), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i2)) : new ByteQuadsCanonicalizer(this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int primaryCount() {
        int i2 = this._secondaryStart;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public void release() {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._parent;
        if (byteQuadsCanonicalizer == null || !maybeDirty()) {
            return;
        }
        byteQuadsCanonicalizer.mergeChild(new TableInfo(this));
        this._hashShared = true;
    }

    public int secondaryCount() {
        int i2 = this._tertiaryStart;
        int i3 = 0;
        for (int i4 = this._secondaryStart + 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i2 = this._tertiaryStart + 3;
        int i3 = this._hashSize + i2;
        int i4 = 0;
        while (i2 < i3) {
            if (this._hashArea[i2] != 0) {
                i4++;
            }
            i2 += 4;
        }
        return i4;
    }

    public String toString() {
        int iPrimaryCount = primaryCount();
        int iSecondaryCount = secondaryCount();
        int iTertiaryCount = tertiaryCount();
        int iSpilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", getClass().getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(iPrimaryCount), Integer.valueOf(iSecondaryCount), Integer.valueOf(iTertiaryCount), Integer.valueOf(iSpilloverCount), Integer.valueOf(iPrimaryCount + iSecondaryCount + iTertiaryCount + iSpilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i2 = this._hashSize << 3;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    protected static ByteQuadsCanonicalizer createRoot(int i2) {
        return new ByteQuadsCanonicalizer(64, i2);
    }

    /* compiled from: WazeSource */
    final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }

        public static TableInfo createInitial(int i2) {
            return new TableInfo(64, 0, ByteQuadsCanonicalizer._calcTertiaryShift(64), new int[512], new String[128], DisplayStrings.DS_ACCIDENT, 512);
        }

        public TableInfo(int i2, int i3, int i4, int[] iArr, String[] strArr, int i5, int i6) {
            this.size = 64;
            this.count = 0;
            this.tertiaryShift = i4;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = DisplayStrings.DS_ACCIDENT;
            this.longNameOffset = 512;
        }
    }

    public int calcHash(int i2, int i3) {
        int i4 = i2 + (i2 >>> 15);
        int i5 = this._seed ^ ((i4 ^ (i4 >>> 9)) + (i3 * 33));
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        return i7 + (i7 << 3);
    }

    public int calcHash(int i2, int i3, int i4) {
        int i5 = this._seed ^ i2;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i3) * 33;
        int i7 = (i6 + (i6 >>> 15)) ^ i4;
        int i8 = i7 + (i7 >>> 4);
        int i9 = i8 + (i8 >>> 15);
        return i9 ^ (i9 << 9);
    }

    private ByteQuadsCanonicalizer(TableInfo tableInfo) {
        this._parent = null;
        this._seed = 0;
        this._interner = null;
        this._failOnDoS = true;
        this._tableInfo = null;
        this._count = -1;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._hashSize = tableInfo.size;
        int length = this._hashArea.length;
        this._secondaryStart = length;
        this._tertiaryStart = length;
        this._tertiaryShift = 1;
        this._spilloverEnd = length;
        this._longNameOffset = length;
        this._hashShared = true;
    }

    public int calcHash(int i2) {
        int i3 = this._seed ^ i2;
        int i4 = i3 + (i3 >>> 16);
        int i5 = i4 ^ (i4 << 3);
        return i5 + (i5 >>> 12);
    }

    private ByteQuadsCanonicalizer(int i2, int i3) {
        this._parent = null;
        this._count = 0;
        this._hashShared = true;
        this._seed = i3;
        this._interner = null;
        this._failOnDoS = true;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(64));
    }

    private String _findSecondary(int i2, int i3, int i4) {
        int i5 = this._tertiaryStart;
        int i6 = this._tertiaryShift;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int i8 = 1 << i6;
        int[] iArr = this._hashArea;
        for (int i9 = i7; i9 < i7 + i8; i9 += 4) {
            int i10 = iArr[i9 + 3];
            if (i3 == iArr[i9] && i4 == iArr[i9 + 1] && i10 == 2) {
                return this._names[i9 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr[i_spilloverStart] && i4 == iArr[i_spilloverStart + 1] && iArr[i_spilloverStart + 3] == 2) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    private String _findSecondary(int i2, int i3) {
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((i2 >> (i5 + 2)) << i5);
        int i7 = 1 << i5;
        int[] iArr = this._hashArea;
        for (int i8 = i6; i8 < i6 + i7; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i3 == iArr[i8] && i9 == 1) {
                return this._names[i8 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr[i_spilloverStart] && iArr[i_spilloverStart + 3] == 1) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    private String _findSecondary(int i2, int i3, int[] iArr, int i4) {
        int i5 = this._tertiaryStart;
        int i6 = this._tertiaryShift;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int i8 = 1 << i6;
        int[] iArr2 = this._hashArea;
        for (int i9 = i7; i9 < i7 + i8; i9 += 4) {
            int i10 = iArr2[i9 + 3];
            if (i3 == iArr2[i9] && i4 == i10 && _verifyLongName(iArr, i4, iArr2[i9 + 1])) {
                return this._names[i9 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr2[i_spilloverStart] && i4 == iArr2[i_spilloverStart + 3] && _verifyLongName(iArr, i4, iArr2[i_spilloverStart + 1])) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String findName(int i2, int i3) {
        int i_calcOffset = _calcOffset(calcHash(i2, i3));
        int[] iArr = this._hashArea;
        int i4 = iArr[i_calcOffset + 3];
        if (i4 == 2) {
            if (i2 == iArr[i_calcOffset] && i3 == iArr[i_calcOffset + 1]) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 2) {
            if (i2 == iArr[i5] && i3 == iArr[i5 + 1]) {
                return this._names[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i2, i3);
    }

    public String findName(int i2, int i3, int i4) {
        int i_calcOffset = _calcOffset(calcHash(i2, i3, i4));
        int[] iArr = this._hashArea;
        int i5 = iArr[i_calcOffset + 3];
        if (i5 == 3) {
            if (i2 == iArr[i_calcOffset] && iArr[i_calcOffset + 1] == i3 && iArr[i_calcOffset + 2] == i4) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 3) {
            if (i2 == iArr[i6] && iArr[i6 + 1] == i3 && iArr[i6 + 2] == i4) {
                return this._names[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i2, i3, i4);
    }

    public String findName(int i2) {
        int i_calcOffset = _calcOffset(calcHash(i2));
        int[] iArr = this._hashArea;
        int i3 = iArr[i_calcOffset + 3];
        if (i3 == 1) {
            if (iArr[i_calcOffset] == i2) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 1) {
            if (iArr[i4] == i2) {
                return this._names[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i2);
    }
}
