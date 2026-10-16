package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kwh extends wue {
    private final int a;
    private final int b;
    private boolean c;

    public kwh(Context context, wuk wukVar, ColorStateList colorStateList, int i, int i2) {
        super(wukVar);
        this.a = i;
        this.b = i2;
        O(ColorStateList.valueOf(0));
        if (colorStateList == null && (colorStateList = spu.aM(context, R.attr.gearheadFocusAccentColor)) == null) {
            int i3 = kwi.c;
            colorStateList = context.getColorStateList(R.color.gearhead_focus_blue);
            colorStateList.getClass();
        }
        U(colorStateList);
    }

    public final void a(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        int[] state = getState();
        state.getClass();
        onStateChange(state);
        invalidateSelf();
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // defpackage.wue, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean onStateChange(int[] r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r2.c
            if (r0 == 0) goto La
            int r0 = r2.b
            goto L39
        La:
            r0 = -16842909(0xfffffffffefeff63, float:-1.6947498E38)
            int[] r0 = new int[]{r0}
            boolean r0 = android.util.StateSet.stateSetMatches(r0, r3)
            r1 = 0
            if (r0 == 0) goto L1a
        L18:
            r0 = r1
            goto L39
        L1a:
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0}
            boolean r0 = android.util.StateSet.stateSetMatches(r0, r3)
            if (r0 == 0) goto L2a
            int r0 = r2.b
            goto L39
        L2a:
            r0 = 16843623(0x1010367, float:2.3696E-38)
            int[] r0 = new int[]{r0}
            boolean r0 = android.util.StateSet.stateSetMatches(r0, r3)
            if (r0 == 0) goto L18
            int r0 = r2.a
        L39:
            float r0 = (float) r0
            r2.V(r0)
            boolean r2 = super.onStateChange(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwh.onStateChange(int[]):boolean");
    }
}
