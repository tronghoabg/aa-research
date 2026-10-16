package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class cql {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public final xa f;

    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cql(java.util.List r9, defpackage.xa r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.a = r9
            r8.f = r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L19
            android.view.MotionEvent r0 = r8.a()
            if (r0 == 0) goto L19
            int r0 = defpackage.alc$$ExternalSyntheticApiModelOutline0.m(r0)
            goto L1a
        L19:
            r0 = r2
        L1a:
            r8.b = r0
            android.view.MotionEvent r0 = r8.a()
            if (r0 == 0) goto L27
            int r0 = r0.getButtonState()
            goto L28
        L27:
            r0 = r2
        L28:
            r8.c = r0
            android.view.MotionEvent r0 = r8.a()
            if (r0 == 0) goto L35
            int r0 = r0.getMetaState()
            goto L36
        L35:
            r0 = r2
        L36:
            r8.d = r0
            android.view.MotionEvent r0 = r8.a()
            r1 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L95
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r9 < r5) goto L4f
            int r9 = defpackage.alc$$ExternalSyntheticApiModelOutline0.m(r0)
            if (r9 != r1) goto L4f
            r9 = r4
            goto L50
        L4f:
            r9 = r2
        L50:
            r5 = 4
            if (r10 == 0) goto L5b
            int r10 = r10.c()
            if (r10 != r5) goto L5b
            r10 = r4
            goto L5c
        L5b:
            r10 = r2
        L5c:
            int r0 = r0.getActionMasked()
            r6 = 10
            if (r0 == 0) goto L91
            r7 = 12
            if (r0 == r4) goto L8d
            if (r0 == r3) goto L83
            switch(r0) {
                case 5: goto L7c;
                case 6: goto L74;
                case 7: goto L83;
                case 8: goto L72;
                case 9: goto L70;
                case 10: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto Lb5
        L6e:
            r2 = 5
            goto Lb5
        L70:
            r2 = r5
            goto Lb5
        L72:
            r2 = 6
            goto Lb5
        L74:
            if (r9 == 0) goto L77
            goto L8f
        L77:
            if (r10 == 0) goto La7
            r2 = 9
            goto Lb5
        L7c:
            if (r9 == 0) goto L7f
            goto L93
        L7f:
            if (r10 == 0) goto Laf
            r2 = 7
            goto Lb5
        L83:
            if (r9 == 0) goto L88
            r2 = 11
            goto Lb5
        L88:
            if (r10 == 0) goto Lb4
            r2 = 8
            goto Lb5
        L8d:
            if (r9 == 0) goto La7
        L8f:
            r2 = r7
            goto Lb5
        L91:
            if (r9 == 0) goto Laf
        L93:
            r2 = r6
            goto Lb5
        L95:
            int r10 = r9.size()
        L99:
            if (r2 >= r10) goto Lb4
            java.lang.Object r0 = r9.get(r2)
            cqu r0 = (defpackage.cqu) r0
            boolean r5 = defpackage.tl.m(r0)
            if (r5 == 0) goto La9
        La7:
            r2 = r3
            goto Lb5
        La9:
            boolean r0 = defpackage.tl.k(r0)
            if (r0 == 0) goto Lb1
        Laf:
            r2 = r4
            goto Lb5
        Lb1:
            int r2 = r2 + 1
            goto L99
        Lb4:
            r2 = r1
        Lb5:
            r8.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cql.<init>(java.util.List, xa):void");
    }

    public final MotionEvent a() {
        xa xaVar = this.f;
        if (xaVar != null) {
            return xaVar.a();
        }
        return null;
    }
}
