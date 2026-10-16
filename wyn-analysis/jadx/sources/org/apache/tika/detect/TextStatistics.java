package org.apache.tika.detect;

import com.vungle.ads.internal.protos.Sdk;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public class TextStatistics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int[] counts = new int[256];
    private int total = 0;

    private int countSafeControl() {
        return count(27) + count(12) + count(13) + count(10) + count(9);
    }

    public void addData(byte[] bArr, int i5, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int[] iArr = this.counts;
            int i12 = bArr[i5 + i11] & ForkServer.ERROR;
            iArr[i12] = iArr[i12] + 1;
            this.total++;
        }
    }

    public int count() {
        return this.total;
    }

    public int countControl() {
        return count(0, 32) - countSafeControl();
    }

    public int countEightBit() {
        return count(128, 256);
    }

    public int countSafeAscii() {
        return count(32, 128) + countSafeControl();
    }

    public boolean isMostlyAscii() {
        int iCount = count(0, 32);
        int iCount2 = count(32, 128);
        int iCountSafeControl = countSafeControl();
        int i5 = this.total;
        return i5 > 0 && (iCount - iCountSafeControl) * 100 < i5 * 2 && (iCount2 + iCountSafeControl) * 100 > i5 * 90;
    }

    public boolean looksLikeUTF8() {
        int iCount = count(0, 32);
        int iCount2 = count(32, 128);
        int iCountSafeControl = countSafeControl();
        int[] iArr = {count(192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE), count(Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 240), count(240, 248)};
        int i5 = 0;
        int i10 = 0;
        while (i5 < 3) {
            int i11 = iArr[i5];
            iCount2 += i11;
            i5++;
            i10 += i11 * i5;
        }
        int iCount3 = count(128, 192);
        return iCount2 > 0 && iCount3 <= i10 && iCount3 >= i10 - 3 && count(248, 256) == 0 && (iCount - iCountSafeControl) * 100 < iCount2 * 2;
    }

    public int count(int i5) {
        return this.counts[i5 & 255];
    }

    private int count(int i5, int i10) {
        int i11 = 0;
        while (i5 < i10) {
            i11 += this.counts[i5];
            i5++;
        }
        return i11;
    }
}
