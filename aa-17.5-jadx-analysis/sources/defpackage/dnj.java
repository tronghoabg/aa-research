package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class dnj extends czd implements eaj {
    public final Window a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final bwq e;
    private boolean f;

    public dnj(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.e = new ParcelableSnapshotMutableState(dnf.a, bxp.c);
        int[] iArr = ebm.a;
        ebe.e(this, this);
        lds.V(this, new dni(this));
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        if (!this.c) {
            int i = 0;
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0) {
                i = iMax;
            } else if (iMax2 == 0) {
                if (iMax3 != 0) {
                    iMax2 = 0;
                } else if (iMax4 != 0) {
                    iMax2 = 0;
                    iMax3 = 0;
                }
            }
            return ecyVar.o(i, iMax2, iMax3, iMax4);
        }
        return ecyVar;
    }

    @Override // defpackage.czd
    public final void b(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1735448596);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ((afeg) this.e.a()).invoke(buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(this, i, 3);
        }
    }

    @Override // defpackage.czd
    public final void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i5 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i6 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // defpackage.czd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            android.view.View r1 = r11.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.g(r12, r13)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r12)
            int r3 = android.view.View.MeasureSpec.getSize(r13)
            int r4 = android.view.View.MeasureSpec.getMode(r13)
            r5 = -2
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r6) goto L4b
            boolean r7 = r11.b
            if (r7 != 0) goto L4b
            android.view.Window r7 = r11.a
            android.view.WindowManager$LayoutParams r8 = r7.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L4b
            boolean r8 = r11.c
            if (r8 == 0) goto L48
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            dnc r8 = defpackage.dnc.a
            int r7 = r8.a(r7)
            goto L4c
        L3b:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 32
            if (r8 >= r9) goto L4b
            dnd r8 = defpackage.dnd.a
            int r7 = r8.a(r7)
            goto L4c
        L48:
            int r7 = r3 + 1
            goto L4c
        L4b:
            r7 = r3
        L4c:
            int r8 = r11.getPaddingLeft()
            int r9 = r11.getPaddingRight()
            int r8 = r8 + r9
            int r9 = r11.getPaddingTop()
            int r10 = r11.getPaddingBottom()
            int r9 = r9 + r10
            int r10 = r2 - r8
            if (r10 >= 0) goto L63
            r10 = r0
        L63:
            int r7 = r7 - r9
            if (r7 >= 0) goto L67
            goto L68
        L67:
            r0 = r7
        L68:
            int r7 = android.view.View.MeasureSpec.getMode(r12)
            if (r7 == 0) goto L72
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
        L72:
            if (r4 == 0) goto L78
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
        L78:
            r1.measure(r12, r13)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L88
            if (r7 == r12) goto L91
            int r13 = r1.getMeasuredWidth()
            int r2 = r13 + r8
            goto L91
        L88:
            int r13 = r1.getMeasuredWidth()
            int r13 = r13 + r8
            int r2 = java.lang.Math.min(r2, r13)
        L91:
            if (r4 == r6) goto L9d
            if (r4 == r12) goto L9b
            int r12 = r1.getMeasuredHeight()
            int r12 = r12 + r9
            goto La6
        L9b:
            r12 = r3
            goto La6
        L9d:
            int r12 = r1.getMeasuredHeight()
            int r12 = r12 + r9
            int r12 = java.lang.Math.min(r3, r12)
        La6:
            r11.setMeasuredDimension(r2, r12)
            boolean r12 = r11.c
            if (r12 != 0) goto Lc9
            int r12 = r1.getMeasuredHeight()
            int r12 = r12 + r9
            if (r12 <= r3) goto Lc9
            android.view.Window r12 = r11.a
            android.view.WindowManager$LayoutParams r13 = r12.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc9
            r12.addFlags(r6)
            boolean r11 = r11.b
            if (r11 != 0) goto Lc9
            r11 = -1
            r12.setLayout(r11, r11)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnj.g(int, int):void");
    }

    @Override // defpackage.czd
    protected final boolean i() {
        return this.f;
    }

    public final void k(bvb bvbVar, afeg afegVar) {
        super.fq(bvbVar);
        this.e.b(afegVar);
        this.f = true;
        d();
    }
}
