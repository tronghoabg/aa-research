package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.libraries.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aaal implements zxe, aaap {
    private final zxi a;
    private final aaah b;
    private final aaak c;
    private List d;
    private List e;
    private final List f;
    private final List g;

    public aaal(zxi zxiVar, aaah aaahVar) {
        aaak aaakVar = aaak.a;
        this.a = zxiVar;
        this.b = aaahVar;
        aaahVar.j(this);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        zkt.n(aaakVar, "polyUtils");
        this.c = aaakVar;
    }

    @Override // defpackage.zxe
    public final void a(Set set) {
        this.b.m();
    }

    @Override // defpackage.aaap
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.zxe
    public final void c(int i) {
        this.b.m();
    }

    @Override // defpackage.zxe
    public final void d() {
        this.b.n(this);
    }

    @Override // defpackage.aaap
    public final void e(Canvas canvas, aaao aaaoVar) {
        zxi zxiVar = this.a;
        if (zxiVar.m()) {
            Path path = new Path();
            this.d = new ArrayList();
            this.e = new ArrayList();
            List list = this.f;
            zxiVar.h(list);
            aaak aaakVar = this.c;
            aaakVar.a(list, aaaoVar, this.d, path);
            List list2 = this.g;
            zxiVar.g(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                aaakVar.a((List) it.next(), aaaoVar, this.e, path);
            }
            int iC = zxiVar.c();
            Paint paint = (Paint) aaak.b.get();
            zkt.n(canvas, "canvas");
            zkt.n(paint, "paint");
            if (!path.isEmpty() && Color.alpha(iC) != 0) {
                path.setFillType(Path.FillType.EVEN_ODD);
                paint.reset();
                paint.setAntiAlias(true);
                paint.setColor(iC);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawPath(path, paint);
            }
            int iD = zxiVar.d();
            float fA = zxiVar.a();
            int iF = zxiVar.f();
            PatternItem[] patternItemArrN = zxiVar.n();
            if (patternItemArrN == null) {
                aaakVar.c(canvas, path, iD, fA, iF);
            } else {
                aaakVar.b(canvas, path, patternItemArrN, iD, iF, fA);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r6.c.f(r7, r8, r6.d) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return false;
     */
    @Override // defpackage.aaap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(float r7, float r8) {
        /*
            r6 = this;
            zxi r0 = r6.a
            boolean r1 = r0.k()
            if (r1 != 0) goto L9
            goto L59
        L9:
            java.util.List r1 = r6.d
            java.util.List r2 = r6.e
            java.lang.String r3 = "outlinesCanvasXY"
            defpackage.zkt.n(r1, r3)
            java.lang.String r3 = "holesCanvasXY"
            defpackage.zkt.n(r2, r3)
            int r3 = (int) r7
            int r4 = (int) r8
            zzq r5 = new zzq
            r5.<init>(r3, r4)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()
            zzr r3 = (defpackage.zzr) r3
            boolean r3 = r3.j(r5)
            if (r3 == 0) goto L22
            java.util.Iterator r1 = r2.iterator()
        L38:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            zzr r2 = (defpackage.zzr) r2
            boolean r2 = r2.j(r5)
            if (r2 == 0) goto L38
        L4a:
            aaak r1 = r6.c
            java.util.List r6 = r6.d
            boolean r6 = r1.f(r7, r8, r6)
            if (r6 == 0) goto L59
        L54:
            r0.i()
            r6 = 1
            return r6
        L59:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaal.f(float, float):boolean");
    }
}
