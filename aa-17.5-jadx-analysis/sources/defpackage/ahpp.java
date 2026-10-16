package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class ahpp extends ahoa {
    private static final int[] minLengthByDepth;
    private int hash;
    private final ahoa left;
    private final int leftLength;
    private final ahoa right;
    private final int totalLength;
    private final int treeDepth;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
        minLengthByDepth = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = minLengthByDepth;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    private ahpp(ahoa ahoaVar, ahoa ahoaVar2) {
        this.hash = 0;
        this.left = ahoaVar;
        this.right = ahoaVar2;
        int size = ahoaVar.size();
        this.leftLength = size;
        this.totalLength = size + ahoaVar2.size();
        this.treeDepth = Math.max(ahoaVar.getTreeDepth(), ahoaVar2.getTreeDepth()) + 1;
    }

    static ahoa concatenate(ahoa ahoaVar, ahoa ahoaVar2) {
        ahpp ahppVar = ahoaVar instanceof ahpp ? (ahpp) ahoaVar : null;
        if (ahoaVar2.size() == 0) {
            return ahoaVar;
        }
        if (ahoaVar.size() == 0) {
            return ahoaVar2;
        }
        int size = ahoaVar.size() + ahoaVar2.size();
        if (size < 128) {
            return concatenateBytes(ahoaVar, ahoaVar2);
        }
        if (ahppVar != null && ahppVar.right.size() + ahoaVar2.size() < 128) {
            return new ahpp(ahppVar.left, concatenateBytes(ahppVar.right, ahoaVar2));
        }
        if (ahppVar != null) {
            if (ahppVar.left.getTreeDepth() > ahppVar.right.getTreeDepth() && ahppVar.getTreeDepth() > ahoaVar2.getTreeDepth()) {
                return new ahpp(ahppVar.left, new ahpp(ahppVar.right, ahoaVar2));
            }
        }
        return size >= minLengthByDepth[Math.max(ahoaVar.getTreeDepth(), ahoaVar2.getTreeDepth()) + 1] ? new ahpp(ahoaVar, ahoaVar2) : new ahpl().balance(ahoaVar, ahoaVar2);
    }

    private static ahpe concatenateBytes(ahoa ahoaVar, ahoa ahoaVar2) {
        int size = ahoaVar.size();
        int size2 = ahoaVar2.size();
        byte[] bArr = new byte[size + size2];
        ahoaVar.copyTo(bArr, 0, 0, size);
        ahoaVar2.copyTo(bArr, 0, size, size2);
        return new ahpe(bArr);
    }

    private boolean equalsFragments(ahoa ahoaVar) {
        ahpk ahpkVar = null;
        ahpm ahpmVar = new ahpm(this);
        ahpe ahpeVar = (ahpe) ahpmVar.next();
        ahpm ahpmVar2 = new ahpm(ahoaVar);
        ahpe ahpeVar2 = (ahpe) ahpmVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = ahpeVar.size() - i;
            int size2 = ahpeVar2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? ahpeVar.equalsRange(ahpeVar2, i2, iMin) : ahpeVar2.equalsRange(ahpeVar, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                ahpeVar = (ahpe) ahpmVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                ahpeVar2 = (ahpe) ahpmVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // defpackage.ahoa
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        int iPeekCachedHashCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahoa)) {
            return false;
        }
        ahoa ahoaVar = (ahoa) obj;
        if (this.totalLength != ahoaVar.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        if (this.hash == 0 || (iPeekCachedHashCode = ahoaVar.peekCachedHashCode()) == 0 || this.hash == iPeekCachedHashCode) {
            return equalsFragments(ahoaVar);
        }
        return false;
    }

    @Override // defpackage.ahoa
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    public int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int i = this.totalLength;
            iPartialHash = partialHash(i, 0, i);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // defpackage.ahoa
    protected boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    @Override // defpackage.ahoa
    public boolean isValidUtf8() {
        ahoa ahoaVar = this.left;
        ahoa ahoaVar2 = this.right;
        return ahoaVar2.partialIsValidUtf8(ahoaVar.partialIsValidUtf8(0, 0, this.leftLength), 0, ahoaVar2.size()) == 0;
    }

    @Override // defpackage.ahoa, java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator() {
        return new ahpn(this);
    }

    @Override // defpackage.ahoa
    public ahoc newCodedInput() {
        return ahoc.newInstance(new ahpo(this));
    }

    @Override // defpackage.ahoa
    protected int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.ahoa
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.ahoa
    protected int peekCachedHashCode() {
        return this.hash;
    }

    @Override // defpackage.ahoa
    public int size() {
        return this.totalLength;
    }

    @Override // defpackage.ahoa
    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    @Override // defpackage.ahoa
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }
}
