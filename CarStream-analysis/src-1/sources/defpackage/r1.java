package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.widget.FrameLayout;
import com.carstream.tech.launcher.Ui;
import java.util.Locale;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class r1 {
    public final s2 a;
    public FrameLayout b;
    public ValueAnimator c;
    public int d = 1;
    public final m1 e = new m1(this);

    public r1(s2 s2Var) {
        this.a = s2Var;
    }

    public static String b(int i, o5 o5Var) {
        if (i != 3) {
            return (o5Var.e ? "Cuộc gọi video" : "Cuộc gọi thoại") + " · " + o5Var.c;
        }
        String str = o5Var.d;
        Handler handler = u1.a;
        return "Đang gọi với " + str + " · " + String.format(Locale.US, "%d:%02d", Integer.valueOf(u1.f / 60), Integer.valueOf(u1.f % 60));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r7, android.widget.ImageButton r8) {
        /*
            int r0 = defpackage.xc.c(r7)
            java.util.ArrayList r7 = defpackage.xc.d(r7)
            int r1 = r7.size()
            r2 = 0
            r3 = r2
        Le:
            r4 = 1
            if (r3 >= r1) goto L22
            java.lang.Object r5 = r7.get(r3)
            int r3 = r3 + 1
            l1 r5 = (defpackage.l1) r5
            int r6 = r5.a
            if (r6 != r0) goto Le
            int r7 = r5.b
            java.lang.String r0 = r5.c
            goto L25
        L22:
            java.lang.String r0 = ""
            r7 = r4
        L25:
            r1 = 26
            r3 = 7
            if (r7 == r3) goto L2c
            if (r7 != r1) goto L2d
        L2c:
            r2 = r4
        L2d:
            r4 = 2
            if (r7 == r4) goto L4a
            r4 = 3
            if (r7 == r4) goto L46
            r4 = 4
            if (r7 == r4) goto L46
            if (r7 == r3) goto L42
            r3 = 22
            if (r7 == r3) goto L46
            if (r7 == r1) goto L42
            r7 = 2131034235(0x7f05007b, float:1.7678982E38)
            goto L4d
        L42:
            r7 = 2131034234(0x7f05007a, float:1.767898E38)
            goto L4d
        L46:
            r7 = 2131034237(0x7f05007d, float:1.7678986E38)
            goto L4d
        L4a:
            r7 = 2131034236(0x7f05007c, float:1.7678984E38)
        L4d:
            r8.setImageResource(r7)
            if (r2 == 0) goto L57
            int r7 = defpackage.d8.e()
            goto L5d
        L57:
            r7 = 600(0x258, float:8.41E-43)
            int r7 = defpackage.d8.c(r7)
        L5d:
            android.graphics.drawable.GradientDrawable r7 = e(r7)
            r8.setBackground(r7)
            if (r2 == 0) goto L6d
            r7 = 700(0x2bc, float:9.81E-43)
            int r7 = defpackage.d8.c(r7)
            goto L71
        L6d:
            int r7 = defpackage.d8.e()
        L71:
            r8.setColorFilter(r7)
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L7d
            java.lang.String r7 = "Chọn loa nghe"
            goto L83
        L7d:
            java.lang.String r7 = "Tiếng đang ra "
            java.lang.String r7 = r7.concat(r0)
        L83:
            r8.setContentDescription(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.d(android.content.Context, android.widget.ImageButton):void");
    }

    public static GradientDrawable e(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public final void a(int i) {
        FrameLayout frameLayout = this.b;
        if (frameLayout == null || !(frameLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i2 = i / 2;
        if (layoutParams.leftMargin != i2) {
            layoutParams.leftMargin = i2;
            this.b.setLayoutParams(layoutParams);
        }
    }

    public final int c(int i) {
        return d8.g(this.a.a, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0428  */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r3v35, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.f():void");
    }

    public final GradientDrawable g(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(c(Ui.R_PILL));
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
