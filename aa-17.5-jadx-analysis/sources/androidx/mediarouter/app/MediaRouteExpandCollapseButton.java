package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.je;

/* loaded from: classes2.dex */
public class MediaRouteExpandCollapseButton extends je {
    public final AnimatedVectorDrawable a;
    public final AnimatedVectorDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public View.OnClickListener f;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaRouteExpandCollapseButton(android.content.Context r7, android.util.AttributeSet r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            r8 = 2131232892(0x7f08087c, float:1.8081906E38)
            android.graphics.drawable.Drawable r8 = r7.getDrawable(r8)
            android.graphics.drawable.AnimatedVectorDrawable r8 = (android.graphics.drawable.AnimatedVectorDrawable) r8
            r6.a = r8
            r0 = 2131232891(0x7f08087b, float:1.8081904E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r6.b = r0
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r2 = 2130968990(0x7f04019e, float:1.754665E38)
            if (r9 == 0) goto L32
            int[] r3 = new int[]{r2}
            android.content.res.TypedArray r9 = r7.obtainStyledAttributes(r9, r3)
            r3 = 0
            int r3 = r9.getColor(r3, r3)
            r9.recycle()
            if (r3 != 0) goto L50
        L32:
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.res.Resources$Theme r3 = r7.getTheme()
            r4 = 1
            r3.resolveAttribute(r2, r9, r4)
            int r2 = r9.resourceId
            if (r2 == 0) goto L4e
            android.content.res.Resources r2 = r7.getResources()
            int r9 = r9.resourceId
            int r3 = r2.getColor(r9)
            goto L50
        L4e:
            int r3 = r9.data
        L50:
            r9 = -1
            double r2 = defpackage.dvd.a(r9, r3)
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L5c
            goto L5e
        L5c:
            r9 = -570425344(0xffffffffde000000, float:-2.305843E18)
        L5e:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r9, r2)
            r8.setColorFilter(r1)
            r0.setColorFilter(r1)
            r9 = 2132084448(0x7f1506e0, float:1.9809067E38)
            java.lang.String r9 = r7.getString(r9)
            r6.c = r9
            r0 = 2132084446(0x7f1506de, float:1.9809063E38)
            java.lang.String r7 = r7.getString(r0)
            r6.d = r7
            r6.setImageDrawable(r8)
            r6.setContentDescription(r9)
            etw r7 = new etw
            r7.<init>()
            super.setOnClickListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteExpandCollapseButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }
}
