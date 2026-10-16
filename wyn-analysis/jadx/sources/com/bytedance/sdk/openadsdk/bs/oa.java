package com.bytedance.sdk.openadsdk.bs;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class oa {
    public static int lw = 3;
    public static int moa = 2;

    /* renamed from: oa, reason: collision with root package name */
    public static int f25292oa = 0;
    public static int uef = -1;
    public static int yo = 1;
    private int ivm = uef;
    private long xs = 0;
    private long bcc = 0;
    private final List<yo> cz = new ArrayList();
    private long zjm = 0;

    public void moa(long j8) {
        int i5 = this.ivm;
        if (i5 == uef || i5 != moa) {
            return;
        }
        this.ivm = yo;
        this.cz.add(new yo(this.zjm, j8));
        this.zjm = 0L;
    }

    public void oa(long j8) {
        int i5;
        int i10 = this.ivm;
        if (i10 == uef || i10 == (i5 = lw)) {
            return;
        }
        this.ivm = i5;
        this.bcc = j8;
    }

    public void uef(long j8) {
        this.ivm = f25292oa;
        this.xs = j8;
    }

    public void yo(long j8) {
        int i5;
        int i10 = this.ivm;
        if (i10 == uef || i10 == (i5 = moa) || i10 == lw) {
            return;
        }
        this.ivm = i5;
        this.zjm = j8;
    }

    public long uef(long j8, long j10) {
        long j11;
        long j12;
        long jOa;
        long j13 = this.bcc;
        if (j13 != 0 && j8 > j13) {
            return 0L;
        }
        int i5 = 0;
        for (yo yoVar : this.cz) {
            if (yoVar.oa() > j8) {
                if (j8 < yoVar.uef()) {
                    j12 = i5;
                    jOa = yoVar.oa() - yoVar.uef();
                } else {
                    j12 = i5;
                    jOa = yoVar.oa() - j8;
                }
                i5 = (int) (jOa + j12);
            }
        }
        long j14 = this.xs;
        if (j14 < j8) {
            long j15 = this.zjm;
            if (j15 == 0) {
                j15 = this.bcc;
                if (j15 == 0) {
                    j11 = j10 - j8;
                }
            } else if (j15 <= j8) {
                return 0L;
            }
            return (j15 - j8) - i5;
        }
        long j16 = this.zjm;
        if (j16 == 0) {
            j16 = this.bcc;
            if (j16 == 0) {
                j11 = j10 - j14;
            }
        } else if (j16 <= j14) {
            return 0L;
        }
        return (j16 - j14) - i5;
        return j11 - i5;
    }

    public int uef() {
        return this.ivm;
    }
}
