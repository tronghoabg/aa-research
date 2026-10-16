package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.dqk;
import defpackage.drl;
import defpackage.dsb;

/* loaded from: classes.dex */
public class Barrier extends drl {
    public int a;
    public dqk b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.drl
    protected final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.b = new dqk();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dsb.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.a = typedArrayObtainStyledAttributes.getInt(26, 0);
                } else if (index == 25) {
                    this.b.b = typedArrayObtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.b.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.b;
        k();
    }

    public final void b(int i) {
        this.b.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // defpackage.drl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.dqn r5, boolean r6) {
        /*
            r4 = this;
            int r4 = r4.a
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            if (r6 == 0) goto Lf
            if (r4 != r3) goto Lc
        La:
            r4 = r0
            goto L16
        Lc:
            if (r4 != r2) goto L16
            goto L11
        Lf:
            if (r4 != r3) goto L13
        L11:
            r4 = r1
            goto L16
        L13:
            if (r4 != r2) goto L16
            goto La
        L16:
            boolean r6 = r5 instanceof defpackage.dqk
            if (r6 == 0) goto L1e
            dqk r5 = (defpackage.dqk) r5
            r5.a = r4
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.c(dqn, boolean):void");
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
