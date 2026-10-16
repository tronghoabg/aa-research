package com.bytedance.sdk.component.oa.uef.oa;

import A7.AbstractC0279p0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public class moa implements Serializable, Comparable<moa> {
    transient String ivm;
    transient int lw;
    final byte[] moa;
    static final char[] uef = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: oa, reason: collision with root package name */
    public static final Charset f25063oa = Charset.forName("UTF-8");
    public static final moa yo = uef(new byte[0]);

    public moa(byte[] bArr) {
        this.moa = bArr;
    }

    public static moa uef(byte... bArr) {
        if (bArr != null) {
            return new moa((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof moa) {
            moa moaVar = (moa) obj;
            int iYo = moaVar.yo();
            byte[] bArr = this.moa;
            if (iYo == bArr.length && moaVar.uef(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i5 = this.lw;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = Arrays.hashCode(this.moa);
        this.lw = iHashCode;
        return iHashCode;
    }

    public byte[] moa() {
        return (byte[]) this.moa.clone();
    }

    public String oa() {
        byte[] bArr = this.moa;
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        for (byte b5 : bArr) {
            int i10 = i5 + 1;
            char[] cArr2 = uef;
            cArr[i5] = cArr2[(b5 >> 4) & 15];
            i5 += 2;
            cArr[i10] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        if (this.moa.length == 0) {
            return "[size=0]";
        }
        String strUef = uef();
        int iUef = uef(strUef, 64);
        if (iUef != -1) {
            String strReplace = strUef.substring(0, iUef).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iUef >= strUef.length()) {
                return AbstractC0279p0.l("[text=", strReplace, "]");
            }
            return "[size=" + this.moa.length + " text=" + strReplace + "…]";
        }
        if (this.moa.length <= 64) {
            return "[hex=" + oa() + "]";
        }
        return "[size=" + this.moa.length + " hex=" + uef(0, 64).oa() + "…]";
    }

    public int yo() {
        return this.moa.length;
    }

    public String uef() {
        String str = this.ivm;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.moa, f25063oa);
        this.ivm = str2;
        return str2;
    }

    public moa uef(int i5, int i10) {
        if (i5 >= 0) {
            byte[] bArr = this.moa;
            if (i10 > bArr.length) {
                throw new IllegalArgumentException(AbstractC0279p0.j(this.moa.length, ")", new StringBuilder("endIndex > length(")));
            }
            int i11 = i10 - i5;
            if (i11 >= 0) {
                if (i5 == 0 && i10 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i5, bArr2, 0, i11);
                return new moa(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte uef(int i5) {
        return this.moa[i5];
    }

    public boolean uef(int i5, moa moaVar, int i10, int i11) {
        return moaVar.uef(i10, this.moa, i5, i11);
    }

    public boolean uef(int i5, byte[] bArr, int i10, int i11) {
        if (i5 < 0) {
            return false;
        }
        byte[] bArr2 = this.moa;
        return i5 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && cz.uef(bArr2, i5, bArr, i10, i11);
    }

    @Override // java.lang.Comparable
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public int compareTo(moa moaVar) {
        int iYo = yo();
        int iYo2 = moaVar.yo();
        int iMin = Math.min(iYo, iYo2);
        for (int i5 = 0; i5 < iMin; i5++) {
            int iUef = uef(i5) & ForkServer.ERROR;
            int iUef2 = moaVar.uef(i5) & ForkServer.ERROR;
            if (iUef != iUef2) {
                return iUef < iUef2 ? -1 : 1;
            }
        }
        if (iYo == iYo2) {
            return 0;
        }
        return iYo < iYo2 ? -1 : 1;
    }

    public static int uef(String str, int i5) {
        int length = str.length();
        int iCharCount = 0;
        int i10 = 0;
        while (iCharCount < length) {
            if (i10 == i5) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i10++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
