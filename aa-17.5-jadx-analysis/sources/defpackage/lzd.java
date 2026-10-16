package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class lzd extends lzc {
    private int f;
    private boolean g;
    private int h;
    private int e = 6;
    private final ArrayDeque i = new ArrayDeque();
    private final ArrayDeque j = new ArrayDeque();
    private boolean k = false;

    static {
        yph.c("GH.SixTap");
    }

    private final void p() {
        this.i.clear();
        this.j.clear();
        this.h = 0;
        this.f = 0;
        this.g = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    @Override // defpackage.lzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void h(defpackage.gsn r3, defpackage.yzz r4) {
        /*
            r2 = this;
            int r3 = r3.ordinal()
            r4 = 0
            r0 = 1
            switch(r3) {
                case 0: goto L6a;
                case 1: goto L64;
                case 2: goto L3f;
                case 3: goto L9;
                case 4: goto L38;
                case 5: goto L34;
                case 6: goto L15;
                case 7: goto L64;
                case 8: goto L11;
                case 9: goto Le;
                case 10: goto Lb;
                case 11: goto La;
                default: goto L9;
            }
        L9:
            goto L71
        La:
            return
        Lb:
            r2.k = r4
            goto L71
        Le:
            r2.k = r0
            goto L71
        L11:
            r2.p()
            goto L71
        L15:
            java.util.ArrayDeque r3 = r2.i
            java.lang.Object r3 = r3.pop()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.f = r3
            java.util.ArrayDeque r3 = r2.j
            java.lang.Object r3 = r3.pop()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.g = r3
            r2.h = r4
            goto L71
        L34:
            int r3 = r2.h
            int r3 = r3 + r0
            goto L3c
        L38:
            int r3 = r2.h
            int r3 = r3 + (-1)
        L3c:
            r2.h = r3
            goto L71
        L3f:
            java.util.ArrayDeque r3 = r2.i
            int r1 = r2.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.push(r1)
            java.util.ArrayDeque r3 = r2.j
            boolean r1 = r2.g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.push(r1)
            int r3 = r2.f
            int r1 = r2.h
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + r0
            int r3 = r3 + r1
            r2.f = r3
            r2.h = r4
            goto L71
        L64:
            int r3 = r2.f
            int r3 = r3 + r0
            r2.f = r3
            goto L71
        L6a:
            int r3 = r2.f
            int r3 = r3 + r0
            r2.f = r3
            r2.g = r0
        L71:
            boolean r3 = r2.g
            int r4 = r2.e
            if (r3 == 0) goto L79
            int r4 = r4 + 1
        L79:
            int r3 = r2.f
            int r1 = r2.h
            int r1 = java.lang.Math.abs(r1)
            int r3 = r3 + r1
            boolean r1 = r2.k
            if (r1 == 0) goto L92
            boolean r1 = defpackage.acow.g()
            if (r1 != 0) goto L92
            lzb r3 = defpackage.lzb.d
            r2.j(r3)
            return
        L92:
            int r4 = r4 - r3
            if (r4 <= r0) goto L9b
            lzb r3 = defpackage.lzb.c
            r2.j(r3)
            return
        L9b:
            if (r4 != r0) goto La3
            lzb r3 = defpackage.lzb.b
            r2.j(r3)
            return
        La3:
            lzb r3 = defpackage.lzb.a
            r2.j(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzd.h(gsn, yzz):void");
    }

    @Override // defpackage.lzc
    public final void l() {
        super.l();
        p();
    }

    @Override // defpackage.lzc
    public final void n(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.e = bundle.getInt("maximum_taps", 6);
    }
}
