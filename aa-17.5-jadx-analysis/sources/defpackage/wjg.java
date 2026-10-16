package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final /* synthetic */ class wjg implements View.OnTouchListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    private final /* synthetic */ int d;

    public /* synthetic */ wjg(CheckBox checkBox, View view, EditText editText, int i) {
        this.d = i;
        this.c = checkBox;
        this.b = view;
        this.a = editText;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r6.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4d
            int r7 = r8.getAction()
            if (r7 != r2) goto L4c
            float r7 = r8.getX()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 < 0) goto L41
            android.view.View r7 = r6.c
            float r2 = r8.getX()
            android.widget.CheckBox r7 = (android.widget.CheckBox) r7
            int r3 = r7.getWidth()
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L41
            float r2 = r8.getY()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L41
            android.view.View r0 = r6.b
            float r8 = r8.getY()
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L41
            r7.performClick()
            goto L4c
        L41:
            android.view.View r6 = r6.a
            r7 = r6
            android.widget.EditText r7 = (android.widget.EditText) r7
            r7.requestFocus()
            defpackage.wid.i(r6)
        L4c:
            return r1
        L4d:
            int r0 = r8.getAction()
            android.view.View r3 = r6.c
            android.view.View r4 = r6.b
            android.view.View r6 = r6.a
            if (r0 == 0) goto L89
            if (r0 == r2) goto L7d
            r5 = 2
            if (r0 == r5) goto L5f
            return r1
        L5f:
            boolean r7 = defpackage.wjk.e(r8, r7)
            if (r7 != 0) goto L7c
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.setPressed(r1)
            wjk r6 = (defpackage.wjk) r6
            android.content.Context r7 = r6.getContext()
            r8 = 2131104410(0x7f06129a, float:1.7821314E38)
            int r6 = r6.a(r8)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            defpackage.vuf.J(r3, r7, r6)
        L7c:
            return r2
        L7d:
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            boolean r6 = r4.isPressed()
            if (r6 == 0) goto L88
            r4.performClick()
        L88:
            return r2
        L89:
            boolean r7 = defpackage.wjk.e(r8, r7)
            if (r7 == 0) goto La6
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.setPressed(r2)
            wjk r6 = (defpackage.wjk) r6
            android.content.Context r7 = r6.getContext()
            r8 = 2131104394(0x7f06128a, float:1.7821281E38)
            int r6 = r6.a(r8)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            defpackage.vuf.J(r3, r7, r6)
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjg.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public /* synthetic */ wjg(wjk wjkVar, FrameLayout frameLayout, ImageView imageView, int i) {
        this.d = i;
        this.a = wjkVar;
        this.b = frameLayout;
        this.c = imageView;
    }
}
