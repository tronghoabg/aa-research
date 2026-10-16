package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class ivj implements Function {
    public final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivj(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return this.b != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.b
            if (r0 == 0) goto L6b
            xkv r5 = (defpackage.xkv) r5
            ygr r0 = defpackage.ivk.a
            int r0 = r5.b
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L55
            xnl r0 = r5.c
            if (r0 != 0) goto L14
            xnl r0 = defpackage.xnl.a
        L14:
            float r4 = r4.a
            android.graphics.Rect r4 = defpackage.ivk.b(r0, r4)
            int r0 = r5.b
            r2 = 2
            r0 = r0 & r2
            r3 = 0
            if (r0 == 0) goto L36
            int r5 = r5.d
            int r5 = defpackage.a.ay(r5)
            if (r5 != 0) goto L2a
            r5 = r1
        L2a:
            int r5 = r5 + (-1)
            if (r5 == r1) goto L37
            if (r5 == r2) goto L34
            r1 = 3
            if (r5 == r1) goto L37
            goto L36
        L34:
            r1 = r2
            goto L37
        L36:
            r1 = r3
        L37:
            if (r1 != 0) goto L4b
            yph r4 = defpackage.ivk.c
            yop r4 = r4.h()
            java.lang.String r5 = "Element type is unknown, invalid NativeUiElement."
            r0 = 1414(0x586, float:1.981E-42)
            defpackage.a.bs(r4, r5, r0)
            j$.util.Optional r4 = j$.util.Optional.empty()
            goto L66
        L4b:
            com.google.android.gms.car.display.CarDisplayNativeUiElement r5 = new com.google.android.gms.car.display.CarDisplayNativeUiElement
            r5.<init>(r4, r1)
            j$.util.Optional r4 = j$.util.Optional.of(r5)
            goto L66
        L55:
            yph r4 = defpackage.ivk.c
            yop r4 = r4.h()
            java.lang.String r5 = "Position is missing, invalid NativeUiElement"
            r0 = 1415(0x587, float:1.983E-42)
            defpackage.a.bs(r4, r5, r0)
            j$.util.Optional r4 = j$.util.Optional.empty()
        L66:
            j$.util.stream.Stream r4 = r4.stream()
            return r4
        L6b:
            xiz r5 = (defpackage.xiz) r5
            ygr r0 = defpackage.ivk.a
            xnl r5 = r5.b
            if (r5 != 0) goto L75
            xnl r5 = defpackage.xnl.a
        L75:
            float r4 = r4.a
            android.graphics.Rect r4 = defpackage.ivk.b(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivj.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
