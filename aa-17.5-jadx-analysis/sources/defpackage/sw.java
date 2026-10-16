package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.OnClickDelegateImpl;

/* loaded from: classes2.dex */
public final class sw {
    public boolean a;
    public CarText b;
    public CarIcon c;
    public uq d;
    public CarColor e;
    public int f;
    public int g;

    public sw(Action action) {
        this.a = true;
        CarColor carColor = CarColor.DEFAULT;
        this.e = carColor;
        this.f = 1;
        this.g = 0;
        action.getClass();
        this.f = action.getType();
        this.c = action.getIcon();
        this.b = action.getTitle();
        this.d = action.getOnClickDelegate();
        CarColor backgroundColor = action.getBackgroundColor();
        this.e = backgroundColor != null ? backgroundColor : carColor;
        this.g = action.getFlags();
        this.a = action.isEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.car.app.model.Action a() {
        /*
            r3 = this;
            int r0 = r3.f
            boolean r0 = androidx.car.app.model.Action.isStandardActionType(r0)
            if (r0 != 0) goto L23
            androidx.car.app.model.CarIcon r0 = r3.c
            if (r0 != 0) goto L23
            androidx.car.app.model.CarText r0 = r3.b
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            goto L23
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "An action must have either an icon or a title"
            r3.<init>(r0)
            throw r3
        L23:
            int r0 = r3.f
            r1 = 65538(0x10002, float:9.1838E-41)
            if (r0 == r1) goto L30
            r1 = 65539(0x10003, float:9.184E-41)
            if (r0 != r1) goto L46
            r0 = r1
        L30:
            uq r1 = r3.d
            if (r1 != 0) goto Lb2
            androidx.car.app.model.CarIcon r0 = r3.c
            if (r0 != 0) goto Laa
            androidx.car.app.model.CarText r0 = r3.b
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Laa
        L46:
            int r0 = r3.f
            r1 = 65540(0x10004, float:9.1841E-41)
            if (r0 != r1) goto L5a
            uq r0 = r3.d
            if (r0 != 0) goto L52
            goto L82
        L52:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "An on-click listener can't be set on the pan mode action"
            r3.<init>(r0)
            throw r3
        L5a:
            r1 = 65541(0x10005, float:9.1843E-41)
            if (r0 != r1) goto L82
            uq r0 = r3.d
            if (r0 != 0) goto L7a
            androidx.car.app.model.CarText r0 = r3.b
            if (r0 == 0) goto L82
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L72
            goto L82
        L72:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "A title can't be set on the standard compose action"
            r3.<init>(r0)
            throw r3
        L7a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "An on-click listener can't be set on the compose action"
            r3.<init>(r0)
            throw r3
        L82:
            int r0 = r3.f
            r1 = 65542(0x10006, float:9.1844E-41)
            if (r0 != r1) goto La4
            androidx.car.app.model.CarIcon r0 = r3.c
            if (r0 != 0) goto L9c
            androidx.car.app.model.CarText r0 = r3.b
            if (r0 == 0) goto La4
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9c
            goto La4
        L9c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "MEDIA_PLAYBACK actions cannot have icons or titles"
            r3.<init>(r0)
            throw r3
        La4:
            androidx.car.app.model.Action r0 = new androidx.car.app.model.Action
            r0.<init>(r3)
            return r0
        Laa:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "An icon or title can't be set on the standard back or app-icon action"
            r3.<init>(r0)
            throw r3
        Lb2:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "An on-click listener can't be set on an action of type %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw.a():androidx.car.app.model.Action");
    }

    public final void b(CarColor carColor) {
        wg wgVar = wg.a;
        carColor.getClass();
        wgVar.a(carColor);
        this.e = carColor;
    }

    public final void c(CarIcon carIcon) {
        wh whVar = wh.b;
        carIcon.getClass();
        whVar.a(carIcon);
        this.c = carIcon;
    }

    public final void d(us usVar) {
        this.d = OnClickDelegateImpl.create(usVar);
    }

    public final void e(CharSequence charSequence) {
        charSequence.getClass();
        this.b = CarText.create(charSequence);
    }

    public sw() {
        this.a = true;
        this.e = CarColor.DEFAULT;
        this.f = 1;
        this.g = 0;
    }
}
