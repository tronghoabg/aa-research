package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class ija {
    private static HashSet h;
    public final Canvas a;
    public final igo b;
    public iip c;
    public iiw d;
    public Stack e;
    public Stack f;
    public Stack g;

    protected ija(Canvas canvas, igo igoVar) {
        this.a = canvas;
        this.b = igoVar;
    }

    private final void A(igv igvVar, String str) {
        ihy ihyVarC = igvVar.t.c(str);
        if (ihyVarC == null) {
            h("Gradient reference '%s' not found", str);
            return;
        }
        if (!(ihyVarC instanceof igv)) {
            e("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (ihyVarC == igvVar) {
            e("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        igv igvVar2 = (igv) ihyVarC;
        if (igvVar.b == null) {
            igvVar.b = igvVar2.b;
        }
        if (igvVar.c == null) {
            igvVar.c = igvVar2.c;
        }
        if (igvVar.e == 0) {
            igvVar.e = igvVar2.e;
        }
        if (igvVar.a.isEmpty()) {
            igvVar.a = igvVar2.a;
        }
        try {
            if (igvVar instanceof ihx) {
                ihx ihxVar = (ihx) igvVar;
                ihx ihxVar2 = (ihx) ihyVarC;
                if (ihxVar.f == null) {
                    ihxVar.f = ihxVar2.f;
                }
                if (ihxVar.g == null) {
                    ihxVar.g = ihxVar2.g;
                }
                if (ihxVar.h == null) {
                    ihxVar.h = ihxVar2.h;
                }
                if (ihxVar.i == null) {
                    ihxVar.i = ihxVar2.i;
                }
            } else {
                iib iibVar = (iib) igvVar;
                iib iibVar2 = (iib) ihyVarC;
                if (iibVar.f == null) {
                    iibVar.f = iibVar2.f;
                }
                if (iibVar.g == null) {
                    iibVar.g = iibVar2.g;
                }
                if (iibVar.h == null) {
                    iibVar.h = iibVar2.h;
                }
                if (iibVar.i == null) {
                    iibVar.i = iibVar2.i;
                }
                if (iibVar.j == null) {
                    iibVar.j = iibVar2.j;
                }
            }
        } catch (ClassCastException unused) {
        }
        String str2 = igvVar2.d;
        if (str2 != null) {
            A(igvVar, str2);
        }
    }

    private final void B(ihj ihjVar, String str) {
        ihy ihyVarC = ihjVar.t.c(str);
        if (ihyVarC == null) {
            h("Pattern reference '%s' not found", str);
            return;
        }
        if (!(ihyVarC instanceof ihj)) {
            e("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (ihyVarC == ihjVar) {
            e("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        ihj ihjVar2 = (ihj) ihyVarC;
        if (ihjVar.a == null) {
            ihjVar.a = ihjVar2.a;
        }
        if (ihjVar.b == null) {
            ihjVar.b = ihjVar2.b;
        }
        if (ihjVar.c == null) {
            ihjVar.c = ihjVar2.c;
        }
        if (ihjVar.d == null) {
            ihjVar.d = ihjVar2.d;
        }
        if (ihjVar.e == null) {
            ihjVar.e = ihjVar2.e;
        }
        if (ihjVar.f == null) {
            ihjVar.f = ihjVar2.f;
        }
        if (ihjVar.g == null) {
            ihjVar.g = ihjVar2.g;
        }
        if (ihjVar.i.isEmpty()) {
            ihjVar.i = ihjVar2.i;
        }
        if (ihjVar.w == null) {
            ihjVar.w = ihjVar2.w;
        }
        if (ihjVar.v == null) {
            ihjVar.v = ihjVar2.v;
        }
        String str2 = ihjVar2.h;
        if (str2 != null) {
            B(ihjVar, str2);
        }
    }

    private static synchronized void C() {
        HashSet hashSet = new HashSet();
        h = hashSet;
        hashSet.add("Structure");
        h.add("BasicStructure");
        h.add("ConditionalProcessing");
        h.add("Image");
        h.add("Style");
        h.add("ViewportAttribute");
        h.add("Shape");
        h.add("BasicText");
        h.add("PaintAttribute");
        h.add("BasicPaintAttribute");
        h.add("OpacityAttribute");
        h.add("BasicGraphicsAttribute");
        h.add("Marker");
        h.add("Gradient");
        h.add("Pattern");
        h.add("Clip");
        h.add("BasicClip");
        h.add("Mask");
        h.add("View");
    }

    private final void D() {
        this.f.pop();
        this.g.pop();
    }

    private final void E(ihu ihuVar) {
        this.f.push(ihuVar);
        this.g.push(this.a.getMatrix());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(ihy ihyVar) {
        iha ihaVar;
        iha ihaVar2;
        iha ihaVar3;
        String str;
        int iIndexOf;
        Set setG;
        iha ihaVar4;
        if (ihyVar instanceof ihe) {
            return;
        }
        M();
        d(ihyVar);
        if (ihyVar instanceof ihq) {
            ihq ihqVar = (ihq) ihyVar;
            G(ihqVar, ihqVar.c, ihqVar.d);
        } else {
            boolean z = ihyVar instanceof iin;
            float fD = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                iin iinVar = (iin) ihyVar;
                iha ihaVar5 = iinVar.e;
                if ((ihaVar5 == null || !ihaVar5.f()) && ((ihaVar4 = iinVar.f) == null || !ihaVar4.f())) {
                    O(this.d, iinVar);
                    if (Q()) {
                        ihy ihyVarC = iinVar.t.c(iinVar.a);
                        if (ihyVarC == null) {
                            e("Use reference '%s' not found", iinVar.a);
                        } else {
                            Matrix matrix = iinVar.b;
                            if (matrix != null) {
                                this.a.concat(matrix);
                            }
                            Matrix matrix2 = new Matrix();
                            iha ihaVar6 = iinVar.c;
                            float fC = ihaVar6 != null ? ihaVar6.c(this) : 0.0f;
                            iha ihaVar7 = iinVar.d;
                            matrix2.preTranslate(fC, ihaVar7 != null ? ihaVar7.d(this) : 0.0f);
                            Canvas canvas = this.a;
                            canvas.concat(matrix2);
                            s(iinVar);
                            boolean zR = R();
                            E(iinVar);
                            if (ihyVarC instanceof ihq) {
                                M();
                                ihq ihqVar2 = (ihq) ihyVarC;
                                iha ihaVar8 = iinVar.e;
                                if (ihaVar8 == null) {
                                    ihaVar8 = ihqVar2.c;
                                }
                                iha ihaVar9 = iinVar.f;
                                if (ihaVar9 == null) {
                                    ihaVar9 = ihqVar2.d;
                                }
                                G(ihqVar2, ihaVar8, ihaVar9);
                                L();
                            } else if (ihyVarC instanceof iie) {
                                iha ihaVar10 = iinVar.e;
                                if (ihaVar10 == null) {
                                    ihaVar10 = new iha(100.0f, 9);
                                }
                                iha ihaVar11 = iinVar.f;
                                if (ihaVar11 == null) {
                                    ihaVar11 = new iha(100.0f, 9);
                                }
                                M();
                                iie iieVar = (iie) ihyVarC;
                                if (!ihaVar10.f() && !ihaVar11.f()) {
                                    ign ignVar = iieVar.v;
                                    if (ignVar == null) {
                                        ignVar = ign.b;
                                    }
                                    O(this.d, iieVar);
                                    float fC2 = ihaVar10.c(this);
                                    float fC3 = ihaVar11.c(this);
                                    iiw iiwVar = this.d;
                                    iiwVar.f = new igo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fC2, fC3);
                                    if (!iiwVar.a.o.booleanValue()) {
                                        igo igoVar = this.d.f;
                                        K(igoVar.a, igoVar.b, igoVar.c, igoVar.d);
                                    }
                                    igo igoVar2 = iieVar.w;
                                    if (igoVar2 != null) {
                                        canvas.concat(U(this.d.f, igoVar2, ignVar));
                                        this.d.g = iieVar.w;
                                    }
                                    boolean zR2 = R();
                                    H(iieVar, true);
                                    if (zR2) {
                                        Z();
                                    }
                                    N(iieVar);
                                }
                                L();
                            } else {
                                F(ihyVarC);
                            }
                            D();
                            if (zR) {
                                Z();
                            }
                            N(iinVar);
                        }
                    }
                }
            } else if (ihyVar instanceof iid) {
                iid iidVar = (iid) ihyVar;
                O(this.d, iidVar);
                if (Q()) {
                    Matrix matrix3 = iidVar.b;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    s(iidVar);
                    boolean zR3 = R();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = iidVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ihy ihyVar2 = (ihy) it.next();
                        if (ihyVar2 instanceof ihr) {
                            ihr ihrVar = (ihr) ihyVar2;
                            if (ihrVar.c() == null && ((setG = ihrVar.g()) == null || (!setG.isEmpty() && setG.contains(language)))) {
                                Set setD = ihrVar.d();
                                if (setD != null) {
                                    if (h == null) {
                                        C();
                                    }
                                    if (setD.isEmpty() || !h.containsAll(setD)) {
                                    }
                                }
                                Set setF = ihrVar.f();
                                if (setF == null) {
                                    Set setE = ihrVar.e();
                                    if (setE == null) {
                                        F(ihyVar2);
                                        break;
                                    }
                                    setE.isEmpty();
                                } else {
                                    setF.isEmpty();
                                }
                            }
                        }
                    }
                    if (zR3) {
                        Z();
                    }
                    N(iidVar);
                }
            } else if (ihyVar instanceof igx) {
                igx igxVar = (igx) ihyVar;
                O(this.d, igxVar);
                if (Q()) {
                    Matrix matrix4 = igxVar.b;
                    if (matrix4 != null) {
                        this.a.concat(matrix4);
                    }
                    s(igxVar);
                    boolean zR4 = R();
                    H(igxVar, true);
                    if (zR4) {
                        Z();
                    }
                    N(igxVar);
                }
            } else if (ihyVar instanceof igz) {
                igz igzVar = (igz) ihyVar;
                iha ihaVar12 = igzVar.d;
                if (ihaVar12 != null && !ihaVar12.f() && (ihaVar3 = igzVar.e) != null && !ihaVar3.f() && (str = igzVar.a) != null) {
                    ign ignVar2 = igzVar.v;
                    if (ignVar2 == null) {
                        ignVar2 = ign.b;
                    }
                    Bitmap bitmapDecodeByteArray = null;
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) != -1 && iIndexOf >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    }
                    if (bitmapDecodeByteArray != null) {
                        O(this.d, igzVar);
                        if (Q() && i()) {
                            Matrix matrix5 = igzVar.f;
                            if (matrix5 != null) {
                                this.a.concat(matrix5);
                            }
                            iha ihaVar13 = igzVar.b;
                            float fC4 = ihaVar13 != null ? ihaVar13.c(this) : 0.0f;
                            iha ihaVar14 = igzVar.c;
                            float fD2 = ihaVar14 != null ? ihaVar14.d(this) : 0.0f;
                            float fC5 = igzVar.d.c(this);
                            float fC6 = igzVar.e.c(this);
                            iiw iiwVar2 = this.d;
                            iiwVar2.f = new igo(fC4, fD2, fC5, fC6);
                            if (!iiwVar2.a.o.booleanValue()) {
                                igo igoVar3 = this.d.f;
                                K(igoVar3.a, igoVar3.b, igoVar3.c, igoVar3.d);
                            }
                            igzVar.n = new igo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            Canvas canvas2 = this.a;
                            canvas2.concat(U(this.d.f, igzVar.n, ignVar2));
                            N(igzVar);
                            s(igzVar);
                            boolean zR5 = R();
                            P();
                            canvas2.drawBitmap(bitmapDecodeByteArray, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint());
                            if (zR5) {
                                Z();
                            }
                        }
                    }
                }
            } else if (ihyVar instanceof ihg) {
                ihg ihgVar = (ihg) ihyVar;
                if (ihgVar.a != null) {
                    O(this.d, ihgVar);
                    if (Q() && i()) {
                        iiw iiwVar3 = this.d;
                        if (iiwVar3.c || iiwVar3.b) {
                            Matrix matrix6 = ihgVar.e;
                            if (matrix6 != null) {
                                this.a.concat(matrix6);
                            }
                            Path path = new iis(ihgVar.a).a;
                            if (ihgVar.n == null) {
                                ihgVar.n = T(path);
                            }
                            N(ihgVar);
                            u(ihgVar);
                            s(ihgVar);
                            boolean zR6 = R();
                            iiw iiwVar4 = this.d;
                            if (iiwVar4.b) {
                                int i = iiwVar4.a.C;
                                Path.FillType fillType = (i != 0 && i + (-1) == 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
                                path.setFillType(fillType);
                                w(ihgVar, path);
                            }
                            if (this.d.c) {
                                x(path);
                            }
                            J(ihgVar);
                            if (zR6) {
                                Z();
                            }
                        }
                    }
                }
            } else if (ihyVar instanceof ihm) {
                ihm ihmVar = (ihm) ihyVar;
                iha ihaVar15 = ihmVar.c;
                if (ihaVar15 != null && (ihaVar2 = ihmVar.d) != null && !ihaVar15.f() && !ihaVar2.f()) {
                    O(this.d, ihmVar);
                    if (Q() && i()) {
                        Matrix matrix7 = ihmVar.e;
                        if (matrix7 != null) {
                            this.a.concat(matrix7);
                        }
                        Path pathO = o(ihmVar);
                        N(ihmVar);
                        u(ihmVar);
                        s(ihmVar);
                        boolean zR7 = R();
                        if (this.d.b) {
                            w(ihmVar, pathO);
                        }
                        if (this.d.c) {
                            x(pathO);
                        }
                        if (zR7) {
                            Z();
                        }
                    }
                }
            } else if (ihyVar instanceof igp) {
                igp igpVar = (igp) ihyVar;
                iha ihaVar16 = igpVar.c;
                if (ihaVar16 != null && !ihaVar16.f()) {
                    O(this.d, igpVar);
                    if (Q() && i()) {
                        Matrix matrix8 = igpVar.e;
                        if (matrix8 != null) {
                            this.a.concat(matrix8);
                        }
                        Path pathL = l(igpVar);
                        N(igpVar);
                        u(igpVar);
                        s(igpVar);
                        boolean zR8 = R();
                        if (this.d.b) {
                            w(igpVar, pathL);
                        }
                        if (this.d.c) {
                            x(pathL);
                        }
                        if (zR8) {
                            Z();
                        }
                    }
                }
            } else if (ihyVar instanceof igu) {
                igu iguVar = (igu) ihyVar;
                iha ihaVar17 = iguVar.c;
                if (ihaVar17 != null && (ihaVar = iguVar.d) != null && !ihaVar17.f() && !ihaVar.f()) {
                    O(this.d, iguVar);
                    if (Q() && i()) {
                        Matrix matrix9 = iguVar.e;
                        if (matrix9 != null) {
                            this.a.concat(matrix9);
                        }
                        Path pathM = m(iguVar);
                        N(iguVar);
                        u(iguVar);
                        s(iguVar);
                        boolean zR9 = R();
                        if (this.d.b) {
                            w(iguVar, pathM);
                        }
                        if (this.d.c) {
                            x(pathM);
                        }
                        if (zR9) {
                            Z();
                        }
                    }
                }
            } else if (ihyVar instanceof ihb) {
                ihb ihbVar = (ihb) ihyVar;
                O(this.d, ihbVar);
                if (Q() && i() && this.d.c) {
                    Matrix matrix10 = ihbVar.e;
                    if (matrix10 != null) {
                        this.a.concat(matrix10);
                    }
                    iha ihaVar18 = ihbVar.a;
                    float fC7 = ihaVar18 == null ? 0.0f : ihaVar18.c(this);
                    iha ihaVar19 = ihbVar.b;
                    float fD3 = ihaVar19 == null ? 0.0f : ihaVar19.d(this);
                    iha ihaVar20 = ihbVar.c;
                    float fC8 = ihaVar20 == null ? 0.0f : ihaVar20.c(this);
                    iha ihaVar21 = ihbVar.d;
                    if (ihaVar21 != null) {
                        fD = ihaVar21.d(this);
                    }
                    if (ihbVar.n == null) {
                        ihbVar.n = new igo(Math.min(fC7, fD3), Math.min(fD3, fD), Math.abs(fC8 - fC7), Math.abs(fD - fD3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fC7, fD3);
                    path2.lineTo(fC8, fD);
                    N(ihbVar);
                    u(ihbVar);
                    s(ihbVar);
                    boolean zR10 = R();
                    x(path2);
                    J(ihbVar);
                    if (zR10) {
                        Z();
                    }
                }
            } else if (ihyVar instanceof ihl) {
                ihl ihlVar = (ihl) ihyVar;
                O(this.d, ihlVar);
                if (Q() && i()) {
                    iiw iiwVar5 = this.d;
                    if (iiwVar5.c || iiwVar5.b) {
                        Matrix matrix11 = ihlVar.e;
                        if (matrix11 != null) {
                            this.a.concat(matrix11);
                        }
                        if (ihlVar.a.length >= 2) {
                            Path pathN = n(ihlVar);
                            N(ihlVar);
                            u(ihlVar);
                            s(ihlVar);
                            boolean zR11 = R();
                            if (this.d.b) {
                                w(ihlVar, pathN);
                            }
                            if (this.d.c) {
                                x(pathN);
                            }
                            J(ihlVar);
                            if (zR11) {
                                Z();
                            }
                        }
                    }
                }
            } else if (ihyVar instanceof ihk) {
                ihk ihkVar = (ihk) ihyVar;
                O(this.d, ihkVar);
                if (Q() && i()) {
                    iiw iiwVar6 = this.d;
                    if (iiwVar6.c || iiwVar6.b) {
                        Matrix matrix12 = ihkVar.e;
                        if (matrix12 != null) {
                            this.a.concat(matrix12);
                        }
                        if (ihkVar.a.length >= 2) {
                            Path pathN2 = n(ihkVar);
                            N(ihkVar);
                            u(ihkVar);
                            s(ihkVar);
                            boolean zR12 = R();
                            if (this.d.b) {
                                w(ihkVar, pathN2);
                            }
                            if (this.d.c) {
                                x(pathN2);
                            }
                            J(ihkVar);
                            if (zR12) {
                                Z();
                            }
                        }
                    }
                }
            } else if (ihyVar instanceof iih) {
                iih iihVar = (iih) ihyVar;
                O(this.d, iihVar);
                if (Q()) {
                    Matrix matrix13 = iihVar.a;
                    if (matrix13 != null) {
                        this.a.concat(matrix13);
                    }
                    List list = iihVar.b;
                    float fC9 = (list == null || list.size() == 0) ? 0.0f : ((iha) iihVar.b.get(0)).c(this);
                    List list2 = iihVar.c;
                    float fD4 = (list2 == null || list2.size() == 0) ? 0.0f : ((iha) iihVar.c.get(0)).d(this);
                    List list3 = iihVar.d;
                    float fC10 = (list3 == null || list3.size() == 0) ? 0.0f : ((iha) iihVar.d.get(0)).c(this);
                    List list4 = iihVar.e;
                    if (list4 != null && list4.size() != 0) {
                        fD = ((iha) iihVar.e.get(0)).d(this);
                    }
                    int iS = S();
                    if (iS != 1) {
                        float fJ = j(iihVar);
                        if (iS == 2) {
                            fJ /= 2.0f;
                        }
                        fC9 -= fJ;
                    }
                    if (iihVar.n == null) {
                        iix iixVar = new iix(this, fC9, fD4);
                        y(iihVar, iixVar);
                        RectF rectF = iixVar.c;
                        iihVar.n = new igo(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    N(iihVar);
                    u(iihVar);
                    s(iihVar);
                    boolean zR13 = R();
                    y(iihVar, new iiu(this, fC9 + fC10, fD4 + fD));
                    if (zR13) {
                        Z();
                    }
                }
            }
        }
        L();
    }

    private final void G(ihq ihqVar, iha ihaVar, iha ihaVar2) {
        f(ihqVar, ihaVar, ihaVar2, ihqVar.w, ihqVar.v);
    }

    private final void H(ihu ihuVar, boolean z) {
        if (z) {
            E(ihuVar);
        }
        Iterator it = ihuVar.n().iterator();
        while (it.hasNext()) {
            F((ihy) it.next());
        }
        if (z) {
            D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6 A[PHI: r1
  0x00f6: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:61:0x00eb, B:65:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(defpackage.ihc r13, defpackage.iir r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ija.I(ihc, iir):void");
    }

    private final void J(igw igwVar) {
        ihc ihcVar;
        ihc ihcVar2;
        ihc ihcVar3;
        List arrayList;
        int size;
        ihp ihpVar = this.d.a;
        String str = ihpVar.p;
        if (str == null && ihpVar.q == null && ihpVar.r == null) {
            return;
        }
        if (str == null) {
            ihcVar = null;
        } else {
            ihy ihyVarC = igwVar.t.c(str);
            if (ihyVarC != null) {
                ihcVar = (ihc) ihyVarC;
            } else {
                e("Marker reference '%s' not found", this.d.a.p);
                ihcVar = null;
            }
        }
        String str2 = this.d.a.q;
        if (str2 == null) {
            ihcVar2 = null;
        } else {
            ihy ihyVarC2 = igwVar.t.c(str2);
            if (ihyVarC2 != null) {
                ihcVar2 = (ihc) ihyVarC2;
            } else {
                e("Marker reference '%s' not found", this.d.a.q);
                ihcVar2 = null;
            }
        }
        String str3 = this.d.a.r;
        if (str3 == null) {
            ihcVar3 = null;
        } else {
            ihy ihyVarC3 = igwVar.t.c(str3);
            if (ihyVarC3 != null) {
                ihcVar3 = (ihc) ihyVarC3;
            } else {
                e("Marker reference '%s' not found", this.d.a.r);
                ihcVar3 = null;
            }
        }
        if (igwVar instanceof ihg) {
            arrayList = new iiq(((ihg) igwVar).a).a;
        } else {
            boolean z = igwVar instanceof ihb;
            int i = 2;
            float fD = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                ihb ihbVar = (ihb) igwVar;
                iha ihaVar = ihbVar.a;
                float fC = ihaVar != null ? ihaVar.c(this) : 0.0f;
                iha ihaVar2 = ihbVar.b;
                float fD2 = ihaVar2 != null ? ihaVar2.d(this) : 0.0f;
                iha ihaVar3 = ihbVar.c;
                float fC2 = ihaVar3 != null ? ihaVar3.c(this) : 0.0f;
                iha ihaVar4 = ihbVar.d;
                if (ihaVar4 != null) {
                    fD = ihaVar4.d(this);
                }
                arrayList = new ArrayList(2);
                float f = fC2 - fC;
                float f2 = fD - fD2;
                arrayList.add(new iir(fC, fD2, f, f2));
                arrayList.add(new iir(fC2, fD, f, f2));
            } else {
                ihk ihkVar = (ihk) igwVar;
                int length = ihkVar.a.length;
                if (length < 2) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    float[] fArr = ihkVar.a;
                    iir iirVar = new iir(fArr[0], fArr[1], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    float f3 = 0.0f;
                    while (i < length) {
                        float[] fArr2 = ihkVar.a;
                        float f4 = fArr2[i];
                        float f5 = fArr2[i + 1];
                        iirVar.b(f4, f5);
                        arrayList2.add(iirVar);
                        iir iirVar2 = new iir(f4, f5, f4 - iirVar.a, f5 - iirVar.b);
                        i += 2;
                        f3 = f5;
                        fD = f4;
                        iirVar = iirVar2;
                    }
                    if (ihkVar instanceof ihl) {
                        float[] fArr3 = ihkVar.a;
                        float f6 = fArr3[0];
                        if (fD != f6) {
                            float f7 = fArr3[1];
                            if (f3 != f7) {
                                iirVar.b(f6, f7);
                                arrayList2.add(iirVar);
                                iir iirVar3 = new iir(f6, f7, f6 - iirVar.a, f7 - iirVar.b);
                                iirVar3.a((iir) arrayList2.get(0));
                                arrayList2.add(iirVar3);
                                arrayList2.set(0, iirVar3);
                            }
                        }
                    } else {
                        arrayList2.add(iirVar);
                    }
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ihp ihpVar2 = this.d.a;
        ihpVar2.r = null;
        ihpVar2.q = null;
        ihpVar2.p = null;
        if (ihcVar != null) {
            I(ihcVar, (iir) arrayList.get(0));
        }
        if (ihcVar2 != null) {
            int i2 = size - 1;
            for (int i3 = 1; i3 < i2; i3++) {
                I(ihcVar2, (iir) arrayList.get(i3));
            }
        }
        if (ihcVar3 != null) {
            I(ihcVar3, (iir) arrayList.get(size - 1));
        }
    }

    private final void K(float f, float f2, float f3, float f4) {
        kzt kztVar = this.d.a.L;
        float fD = f4 + f2;
        float fC = f3 + f;
        if (kztVar != null) {
            f += ((iha) kztVar.d).c(this);
            f2 += ((iha) this.d.a.L.c).d(this);
            fC -= ((iha) this.d.a.L.a).c(this);
            fD -= ((iha) this.d.a.L.b).d(this);
        }
        this.a.clipRect(f, f2, fC, fD);
    }

    private final void L() {
        this.a.restore();
        this.d = (iiw) this.e.pop();
    }

    private final void M() {
        this.a.save();
        this.e.push(this.d);
        this.d = (iiw) this.d.clone();
    }

    private final void N(ihv ihvVar) {
        if (ihvVar.u == null || ihvVar.n == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.g.peek()).invert(matrix)) {
            igo igoVar = ihvVar.n;
            float f = igoVar.a;
            float f2 = igoVar.b;
            float fA = igoVar.a();
            igo igoVar2 = ihvVar.n;
            float f3 = igoVar2.b;
            float fA2 = igoVar2.a();
            float fB = ihvVar.n.b();
            igo igoVar3 = ihvVar.n;
            float[] fArr = {f, f2, fA, f3, fA2, fB, igoVar3.a, igoVar3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                int i2 = i + 1;
                if (fArr[i2] < rectF.top) {
                    rectF.top = fArr[i2];
                }
                if (fArr[i2] > rectF.bottom) {
                    rectF.bottom = fArr[i2];
                }
            }
            ihv ihvVar2 = (ihv) this.f.peek();
            igo igoVar4 = ihvVar2.n;
            if (igoVar4 == null) {
                ihvVar2.n = igo.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            igo igoVarC = igo.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
            float f6 = igoVarC.a;
            float f7 = igoVar4.a;
            if (f6 < f7) {
                igoVar4.a = f6;
            } else {
                f6 = f7;
            }
            float f8 = igoVarC.b;
            float f9 = igoVar4.b;
            if (f8 < f9) {
                igoVar4.b = f8;
            } else {
                f8 = f9;
            }
            if (igoVarC.a() > igoVar4.a()) {
                igoVar4.c = igoVarC.a() - f6;
            }
            if (igoVarC.b() > igoVar4.b()) {
                igoVar4.d = igoVarC.b() - f8;
            }
        }
    }

    private final void O(iiw iiwVar, ihw ihwVar) {
        ihu ihuVar = ihwVar.u;
        ihp ihpVar = iiwVar.a;
        ihpVar.s = Boolean.TRUE;
        ihpVar.o = ihuVar == null ? Boolean.TRUE : Boolean.FALSE;
        ihpVar.L = null;
        ihpVar.w = null;
        Float fValueOf = Float.valueOf(1.0f);
        ihpVar.j = fValueOf;
        ihpVar.u = igr.a;
        ihpVar.v = fValueOf;
        ihpVar.x = null;
        ihpVar.y = null;
        ihpVar.z = fValueOf;
        ihpVar.A = null;
        ihpVar.B = fValueOf;
        ihpVar.K = 1;
        ihp ihpVar2 = ihwVar.q;
        if (ihpVar2 != null) {
            g(iiwVar, ihpVar2);
        }
        List list = this.c.c.a;
        if (list != null && !list.isEmpty()) {
            for (igh ighVar : this.c.c.a) {
                igj igjVar = ighVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj = ihwVar.u; obj != null; obj = ((ihy) obj).u) {
                    arrayList.add(0, obj);
                }
                int size = arrayList.size() - 1;
                if (igjVar.a() == 1 ? aaem.r(igjVar.b(0), arrayList, size, ihwVar) : aaem.q(igjVar, igjVar.a() - 1, arrayList, size, ihwVar)) {
                    g(iiwVar, ighVar.b);
                }
            }
        }
        ihp ihpVar3 = ihwVar.r;
        if (ihpVar3 != null) {
            g(iiwVar, ihpVar3);
        }
    }

    private final void P() {
        int iW;
        ihp ihpVar = this.d.a;
        ihz ihzVar = ihpVar.A;
        if (ihzVar instanceof igr) {
            iW = ((igr) ihzVar).b;
        } else if (!(ihzVar instanceof igs)) {
            return;
        } else {
            iW = ihpVar.k.b;
        }
        Float f = ihpVar.B;
        if (f != null) {
            iW |= W(f.floatValue()) << 24;
        }
        this.a.drawColor(iW);
    }

    private final boolean Q() {
        Boolean bool = this.d.a.s;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean R() {
        iiw iiwVar = this.d;
        if (iiwVar.a.x != null) {
            boolean z = iiwVar.i;
            h("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.d.a.j.floatValue() >= 1.0f) {
            iiw iiwVar2 = this.d;
            if (iiwVar2.a.x != null) {
                boolean z2 = iiwVar2.i;
            }
            return false;
        }
        this.a.saveLayerAlpha(null, W(this.d.a.j.floatValue()), 31);
        this.e.push(this.d);
        iiw iiwVar3 = (iiw) this.d.clone();
        this.d = iiwVar3;
        if (iiwVar3.a.x == null) {
            return true;
        }
        boolean z3 = iiwVar3.i;
        return true;
    }

    private final int S() {
        int i;
        ihp ihpVar = this.d.a;
        return (ihpVar.H == 1 || (i = ihpVar.I) == 2) ? ihpVar.I : i == 1 ? 3 : 1;
    }

    private static final igo T(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new igo(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r7 != 9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.graphics.Matrix U(defpackage.igo r9, defpackage.igo r10, defpackage.ign r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            igm r1 = r11.c
            if (r1 != 0) goto La
            return r0
        La:
            float r2 = r9.c
            float r3 = r10.c
            float r2 = r2 / r3
            float r3 = r9.d
            float r4 = r10.d
            float r3 = r3 / r4
            float r4 = r10.a
            float r4 = -r4
            float r5 = r10.b
            float r5 = -r5
            ign r6 = defpackage.ign.a
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L78
            int r11 = r11.d
            r6 = 2
            if (r11 != r6) goto L2c
            float r11 = java.lang.Math.max(r2, r3)
            goto L30
        L2c:
            float r11 = java.lang.Math.min(r2, r3)
        L30:
            float r2 = r9.c
            float r2 = r2 / r11
            float r3 = r9.d
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L54
            r6 = 3
            if (r7 == r6) goto L50
            r6 = 5
            if (r7 == r6) goto L54
            r6 = 6
            if (r7 == r6) goto L50
            r6 = 8
            if (r7 == r6) goto L54
            r6 = 9
            if (r7 == r6) goto L50
            goto L59
        L50:
            float r6 = r10.c
            float r6 = r6 - r2
            goto L58
        L54:
            float r6 = r10.c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L58:
            float r4 = r4 - r6
        L59:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L65;
                case 5: goto L65;
                case 6: goto L65;
                case 7: goto L61;
                case 8: goto L61;
                case 9: goto L61;
                default: goto L60;
            }
        L60:
            goto L6a
        L61:
            float r10 = r10.d
            float r10 = r10 - r3
            goto L69
        L65:
            float r10 = r10.d
            float r10 = r10 - r3
            float r10 = r10 / r8
        L69:
            float r5 = r5 - r10
        L6a:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
            return r0
        L78:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ija.U(igo, igo, ign):android.graphics.Matrix");
    }

    private static final Typeface V(String str, Integer num, int i) {
        int i2 = 2;
        if (num.intValue() > 500) {
            i2 = i == 2 ? 3 : 1;
        } else if (i != 2) {
            i2 = 0;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i2);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i2);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("fantasy")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        return null;
    }

    private static final int W(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private final void X(ihy ihyVar, iiw iiwVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (ihyVar instanceof ihw) {
                arrayList.add(0, (ihw) ihyVar);
            }
            Object obj = ihyVar.u;
            if (obj == null) {
                break;
            } else {
                ihyVar = (ihy) obj;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O(iiwVar, (ihw) arrayList.get(i));
        }
        iiwVar.g = this.c.a.w;
        if (iiwVar.g == null) {
            iiwVar.g = this.b;
        }
        iiwVar.f = this.b;
        boolean z = this.d.i;
        iiwVar.i = false;
    }

    private static final boolean Y(ihp ihpVar, long j) {
        return (j & ihpVar.a) != 0;
    }

    private final void Z() {
        iiw iiwVar = this.d;
        if (iiwVar.a.x != null) {
            boolean z = iiwVar.i;
        }
        L();
    }

    private static final void aa(iiw iiwVar, boolean z, ihz ihzVar) {
        int i;
        ihp ihpVar = iiwVar.a;
        boolean z2 = ihzVar instanceof igr;
        float fFloatValue = (z ? ihpVar.c : ihpVar.e).floatValue();
        if (z2) {
            i = ((igr) ihzVar).b;
        } else if (!(ihzVar instanceof igs)) {
            return;
        } else {
            i = iiwVar.a.k.b;
        }
        int iW = i | (W(fFloatValue) << 24);
        if (z) {
            iiwVar.d.setColor(iW);
        } else {
            iiwVar.e.setColor(iW);
        }
    }

    public static void c(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, ihi ihiVar) {
        float f8;
        float f9;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == BitmapDescriptorFactory.HUE_RED || f4 == BitmapDescriptorFactory.HUE_RED) {
            ihiVar.f(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = (float) Math.toRadians(f5 % 360.0d);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f10 = fAbs * fAbs;
        float f11 = fAbs2 * fAbs2;
        float f12 = (f - f6) / 2.0f;
        float f13 = (f2 - f7) / 2.0f;
        float f14 = ((-fSin) * f12) + (fCos * f13);
        float f15 = f14 * f14;
        float f16 = (f12 * fCos) + (f13 * fSin);
        float f17 = f16 * f16;
        float f18 = (f17 / f10) + (f15 / f11);
        if (f18 > 1.0f) {
            double d = f18;
            f8 = 2.0f;
            f9 = f15;
            fAbs *= (float) Math.sqrt(d);
            fAbs2 *= (float) Math.sqrt(d);
            f11 = fAbs2 * fAbs2;
            f10 = fAbs * fAbs;
        } else {
            f8 = 2.0f;
            f9 = f15;
        }
        float f19 = z == z2 ? -1.0f : 1.0f;
        float f20 = f10 * f9;
        float f21 = f17 * f11;
        float f22 = (((f10 * f11) - f20) - f21) / (f20 + f21);
        if (f22 < BitmapDescriptorFactory.HUE_RED) {
            f22 = 0.0f;
        }
        float f23 = (f + f6) / f8;
        float f24 = (f2 + f7) / f8;
        float fSqrt = (float) (f19 * Math.sqrt(f22));
        float f25 = ((fAbs * f14) / fAbs2) * fSqrt;
        float f26 = fCos * f25;
        float f27 = fSqrt * (-((fAbs2 * f16) / fAbs));
        float f28 = fSin * f27;
        float f29 = fSin * f25;
        float f30 = fCos * f27;
        float f31 = f16 - f25;
        float f32 = f14 - f27;
        float f33 = -f16;
        float f34 = -f14;
        float f35 = f31 / fAbs;
        float f36 = f32 / fAbs2;
        float f37 = (f35 * f35) + (f36 * f36);
        float degrees = (float) Math.toDegrees((f36 < BitmapDescriptorFactory.HUE_RED ? -1.0f : 1.0f) * Math.acos(f35 / ((float) Math.sqrt(f37))));
        float f38 = (f33 - f25) / fAbs;
        float f39 = (f34 - f27) / fAbs2;
        float fSqrt2 = (float) Math.sqrt(f37 * ((f38 * f38) + (f39 * f39)));
        float degrees2 = (float) Math.toDegrees(((f35 * f39) - (f36 * f38) < BitmapDescriptorFactory.HUE_RED ? -1.0f : 1.0f) * Math.acos(((f35 * f38) + (f36 * f39)) / fSqrt2));
        if (z2) {
            if (degrees2 < BitmapDescriptorFactory.HUE_RED) {
                degrees2 += 360.0f;
            }
        } else if (degrees2 > BitmapDescriptorFactory.HUE_RED) {
            degrees2 -= 360.0f;
        }
        double d2 = degrees2 % 360.0f;
        int iCeil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double radians2 = Math.toRadians(degrees % 360.0f);
        double radians3 = (float) (Math.toRadians(d2) / iCeil);
        double d3 = radians3 / 2.0d;
        double dSin = Math.sin(d3) * 1.3333333333333333d;
        double dCos = Math.cos(d3) + 1.0d;
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d4 = dSin / dCos;
            int i4 = iCeil;
            int i5 = i2;
            double d5 = (i2 * r4) + radians2;
            double dCos2 = Math.cos(d5);
            double dSin2 = Math.sin(d5);
            fArr[i3] = (float) (dCos2 - (d4 * dSin2));
            fArr[i3 + 1] = (float) (dSin2 + (dCos2 * d4));
            double d6 = d5 + radians3;
            double dCos3 = Math.cos(d6);
            double dSin3 = Math.sin(d6);
            fArr[i3 + 2] = (float) (dCos3 + (d4 * dSin3));
            fArr[i3 + 3] = (float) (dSin3 - (d4 * dCos3));
            int i6 = i3 + 5;
            fArr[i3 + 4] = (float) dCos3;
            i3 += 6;
            fArr[i6] = (float) dSin3;
            i2 = i5 + 1;
            iCeil = i4;
            dCos = dCos;
            f28 = f28;
            f23 = f23;
            radians2 = radians2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate(f23 + (f26 - f28), f24 + f29 + f30);
        matrix.mapPoints(fArr);
        if (i >= 2) {
            fArr[i - 2] = f6;
            fArr[i - 1] = f7;
        }
        for (int i7 = 0; i7 < i; i7 += 6) {
            ihiVar.d(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    public static void e(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private final float j(iij iijVar) {
        iiz iizVar = new iiz(this);
        y(iijVar, iizVar);
        return iizVar.a;
    }

    private final Path.FillType k() {
        int i = this.d.a.J;
        return (i != 0 && i + (-1) == 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
    }

    private final Path l(igp igpVar) {
        iha ihaVar = igpVar.a;
        float fD = BitmapDescriptorFactory.HUE_RED;
        float fC = ihaVar != null ? ihaVar.c(this) : 0.0f;
        iha ihaVar2 = igpVar.b;
        if (ihaVar2 != null) {
            fD = ihaVar2.d(this);
        }
        float f = fD;
        float fA = igpVar.c.a(this);
        float f2 = fC - fA;
        float f3 = f - fA;
        float f4 = fC + fA;
        float f5 = f + fA;
        if (igpVar.n == null) {
            float f6 = fA + fA;
            igpVar.n = new igo(f2, f3, f6, f6);
        }
        float f7 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fC, f3);
        float f8 = fC + f7;
        float f9 = f - f7;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path.cubicTo(f4, f10, f8, f5, fC, f5);
        float f11 = fC - f7;
        path.cubicTo(f11, f5, f2, f10, f2, f);
        path.cubicTo(f2, f9, f11, f3, fC, f3);
        path.close();
        return path;
    }

    private final Path m(igu iguVar) {
        iha ihaVar = iguVar.a;
        float fD = BitmapDescriptorFactory.HUE_RED;
        float fC = ihaVar != null ? ihaVar.c(this) : 0.0f;
        iha ihaVar2 = iguVar.b;
        if (ihaVar2 != null) {
            fD = ihaVar2.d(this);
        }
        float f = fD;
        float fC2 = iguVar.c.c(this);
        float fD2 = iguVar.d.d(this);
        float f2 = fC - fC2;
        float f3 = f - fD2;
        float f4 = fC + fC2;
        float f5 = f + fD2;
        if (iguVar.n == null) {
            iguVar.n = new igo(f2, f3, fC2 + fC2, fD2 + fD2);
        }
        float f6 = fC2 * 0.5522848f;
        float f7 = fD2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fC, f3);
        float f8 = fC + f6;
        float f9 = f - f7;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path.cubicTo(f4, f10, f8, f5, fC, f5);
        float f11 = fC - f6;
        path.cubicTo(f11, f5, f2, f10, f2, f);
        path.cubicTo(f2, f9, f11, f3, fC, f3);
        path.close();
        return path;
    }

    private final Path n(ihk ihkVar) {
        Path path = new Path();
        float[] fArr = ihkVar.a;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = ihkVar.a;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (ihkVar instanceof ihl) {
            path.close();
        }
        if (ihkVar.n == null) {
            ihkVar.n = T(path);
        }
        path.setFillType(k());
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Path o(defpackage.ihm r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ija.o(ihm):android.graphics.Path");
    }

    private final iiw p(ihy ihyVar) {
        iiw iiwVar = new iiw();
        g(iiwVar, ihp.a());
        X(ihyVar, iiwVar);
        return iiwVar;
    }

    private final String q(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private final void r(ihy ihyVar, boolean z, Path path, Matrix matrix) {
        Path pathN;
        if (Q()) {
            Canvas canvas = this.a;
            canvas.save();
            this.e.push(this.d);
            iiw iiwVar = (iiw) this.d.clone();
            this.d = iiwVar;
            if (ihyVar instanceof iin) {
                if (z) {
                    iin iinVar = (iin) ihyVar;
                    O(iiwVar, iinVar);
                    if (Q() && i()) {
                        Matrix matrix2 = iinVar.b;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        ihy ihyVarC = iinVar.t.c(iinVar.a);
                        if (ihyVarC == null) {
                            e("Use reference '%s' not found", iinVar.a);
                        } else {
                            s(iinVar);
                            r(ihyVarC, false, path, matrix);
                        }
                    }
                } else {
                    e("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (ihyVar instanceof ihg) {
                ihg ihgVar = (ihg) ihyVar;
                O(iiwVar, ihgVar);
                if (Q() && i()) {
                    Matrix matrix3 = ihgVar.e;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path2 = new iis(ihgVar.a).a;
                    if (ihgVar.n == null) {
                        ihgVar.n = T(path2);
                    }
                    s(ihgVar);
                    path.setFillType(k());
                    path.addPath(path2, matrix);
                }
            } else if (ihyVar instanceof iih) {
                iih iihVar = (iih) ihyVar;
                O(iiwVar, iihVar);
                if (Q()) {
                    Matrix matrix4 = iihVar.a;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = iihVar.b;
                    float fD = BitmapDescriptorFactory.HUE_RED;
                    float fC = (list == null || list.size() == 0) ? 0.0f : ((iha) iihVar.b.get(0)).c(this);
                    List list2 = iihVar.c;
                    float fD2 = (list2 == null || list2.size() == 0) ? 0.0f : ((iha) iihVar.c.get(0)).d(this);
                    List list3 = iihVar.d;
                    float fC2 = (list3 == null || list3.size() == 0) ? 0.0f : ((iha) iihVar.d.get(0)).c(this);
                    List list4 = iihVar.e;
                    if (list4 != null && list4.size() != 0) {
                        fD = ((iha) iihVar.e.get(0)).d(this);
                    }
                    if (this.d.a.I != 1) {
                        float fJ = j(iihVar);
                        if (this.d.a.I == 2) {
                            fJ /= 2.0f;
                        }
                        fC -= fJ;
                    }
                    if (iihVar.n == null) {
                        iix iixVar = new iix(this, fC, fD2);
                        y(iihVar, iixVar);
                        RectF rectF = iixVar.c;
                        iihVar.n = new igo(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    s(iihVar);
                    Path path3 = new Path();
                    y(iihVar, new iiv(this, fC + fC2, fD2 + fD, path3));
                    path.setFillType(k());
                    path.addPath(path3, matrix);
                }
            } else if (ihyVar instanceof igw) {
                igw igwVar = (igw) ihyVar;
                O(iiwVar, igwVar);
                if (Q() && i()) {
                    Matrix matrix5 = igwVar.e;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (igwVar instanceof ihm) {
                        pathN = o((ihm) igwVar);
                    } else if (igwVar instanceof igp) {
                        pathN = l((igp) igwVar);
                    } else if (igwVar instanceof igu) {
                        pathN = m((igu) igwVar);
                    } else if (igwVar instanceof ihk) {
                        pathN = n((ihk) igwVar);
                    }
                    s(igwVar);
                    path.setFillType(pathN.getFillType());
                    path.addPath(pathN, matrix);
                }
            } else {
                e("Invalid %s element found in clipPath definition", ihyVar.getClass().getSimpleName());
            }
            canvas.restore();
            this.d = (iiw) this.e.pop();
        }
    }

    private final void s(ihv ihvVar) {
        t(ihvVar, ihvVar.n);
    }

    private final void t(ihv ihvVar, igo igoVar) {
        String str = this.d.a.w;
        if (str == null) {
            return;
        }
        ihy ihyVarC = ihvVar.t.c(str);
        if (ihyVarC == null) {
            e("ClipPath reference '%s' not found", this.d.a.w);
            return;
        }
        igq igqVar = (igq) ihyVarC;
        if (igqVar.i.isEmpty()) {
            this.a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = igqVar.a;
        boolean z = bool == null || bool.booleanValue();
        if ((ihvVar instanceof igx) && !z) {
            h("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", ihvVar.getClass().getSimpleName());
            return;
        }
        this.e.push(this.d);
        this.d = (iiw) this.d.clone();
        Matrix matrix = new Matrix();
        if (!z) {
            Matrix matrix2 = new Matrix();
            matrix2.preTranslate(igoVar.a, igoVar.b);
            matrix2.preScale(igoVar.c, igoVar.d);
            this.a.concat(matrix2);
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
        Matrix matrix4 = igqVar.b;
        if (matrix4 != null) {
            this.a.concat(matrix4);
            Matrix matrix5 = new Matrix();
            if (matrix4.invert(matrix5)) {
                matrix.postConcat(matrix5);
            }
        }
        this.d = p(igqVar);
        s(igqVar);
        Path path = new Path();
        Iterator it = igqVar.i.iterator();
        while (it.hasNext()) {
            r((ihy) it.next(), true, path, new Matrix());
        }
        Canvas canvas = this.a;
        canvas.clipPath(path);
        this.d = (iiw) this.e.pop();
        canvas.concat(matrix);
    }

    private final void u(ihv ihvVar) {
        ihz ihzVar = this.d.a.b;
        if (ihzVar instanceof ihf) {
            v(true, ihvVar.n, (ihf) ihzVar);
        }
        ihz ihzVar2 = this.d.a.d;
        if (ihzVar2 instanceof ihf) {
            v(false, ihvVar.n, (ihf) ihzVar2);
        }
    }

    private final void v(boolean z, igo igoVar, ihf ihfVar) {
        float f;
        Paint paint;
        boolean z2;
        float f2;
        float fB;
        float f3;
        float fB2;
        float f4;
        Paint paint2;
        float fB3;
        float fB4;
        float fB5;
        float fB6;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z3 = z;
        iip iipVar = this.c;
        String str = ihfVar.a;
        ihy ihyVarC = iipVar.c(str);
        if (ihyVarC == null) {
            e("%s reference '%s' not found", true != z3 ? "Stroke" : "Fill", str);
            ihz ihzVar = ihfVar.b;
            if (ihzVar != null) {
                aa(this.d, z3, ihzVar);
                return;
            }
            iiw iiwVar = this.d;
            if (z3) {
                iiwVar.b = false;
                return;
            } else {
                iiwVar.c = false;
                return;
            }
        }
        if (ihyVarC instanceof ihx) {
            ihx ihxVar = (ihx) ihyVarC;
            String str2 = ihxVar.d;
            if (str2 != null) {
                A(ihxVar, str2);
            }
            Boolean bool = ihxVar.b;
            boolean z4 = bool != null && bool.booleanValue();
            iiw iiwVar2 = this.d;
            if (z3) {
                paint2 = iiwVar2.d;
                z3 = true;
            } else {
                paint2 = iiwVar2.e;
                z3 = false;
            }
            boolean z5 = z3;
            if (z4) {
                igo igoVarB = b();
                iha ihaVar = ihxVar.f;
                fB3 = ihaVar != null ? ihaVar.c(this) : BitmapDescriptorFactory.HUE_RED;
                f = BitmapDescriptorFactory.HUE_RED;
                iha ihaVar2 = ihxVar.g;
                fB4 = ihaVar2 != null ? ihaVar2.d(this) : 0.0f;
                iha ihaVar3 = ihxVar.h;
                fB5 = ihaVar3 != null ? ihaVar3.c(this) : igoVarB.c;
                iha ihaVar4 = ihxVar.i;
                if (ihaVar4 != null) {
                    fB6 = ihaVar4.d(this);
                    f5 = fB5;
                    f6 = fB3;
                    f7 = fB4;
                    f8 = fB6;
                }
                f5 = fB5;
                f6 = fB3;
                f7 = fB4;
                f8 = f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
                iha ihaVar5 = ihxVar.f;
                fB3 = ihaVar5 != null ? ihaVar5.b(this, 1.0f) : 0.0f;
                iha ihaVar6 = ihxVar.g;
                fB4 = ihaVar6 != null ? ihaVar6.b(this, 1.0f) : 0.0f;
                iha ihaVar7 = ihxVar.h;
                fB5 = ihaVar7 != null ? ihaVar7.b(this, 1.0f) : 1.0f;
                iha ihaVar8 = ihxVar.i;
                if (ihaVar8 != null) {
                    fB6 = ihaVar8.b(this, 1.0f);
                    f5 = fB5;
                    f6 = fB3;
                    f7 = fB4;
                    f8 = fB6;
                }
                f5 = fB5;
                f6 = fB3;
                f7 = fB4;
                f8 = f;
            }
            M();
            this.d = p(ihxVar);
            Matrix matrix = new Matrix();
            if (!z4) {
                matrix.preTranslate(igoVar.a, igoVar.b);
                matrix.preScale(igoVar.c, igoVar.d);
            }
            Matrix matrix2 = ihxVar.c;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = ihxVar.a.size();
            if (size == 0) {
                L();
                iiw iiwVar3 = this.d;
                if (z5) {
                    iiwVar3.b = false;
                } else {
                    iiwVar3.c = false;
                }
            } else {
                int[] iArr = new int[size];
                float[] fArr = new float[size];
                Iterator it = ihxVar.a.iterator();
                int i = 0;
                float f9 = -1.0f;
                while (it.hasNext()) {
                    iho ihoVar = (iho) ((ihy) it.next());
                    Float f10 = ihoVar.a;
                    float fFloatValue = f10 != null ? f10.floatValue() : f;
                    if (i == 0 || fFloatValue >= f9) {
                        fArr[i] = fFloatValue;
                        f9 = fFloatValue;
                    } else {
                        fArr[i] = f9;
                    }
                    M();
                    O(this.d, ihoVar);
                    ihp ihpVar = this.d.a;
                    igr igrVar = (igr) ihpVar.u;
                    if (igrVar == null) {
                        igrVar = igr.a;
                    }
                    iArr[i] = (W(ihpVar.v.floatValue()) << 24) | igrVar.b;
                    L();
                    i++;
                }
                if ((f6 == f5 && f7 == f8) || size == 1) {
                    L();
                    paint2.setColor(iArr[size - 1]);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    int i2 = ihxVar.e;
                    if (i2 != 0) {
                        if (i2 == 2) {
                            tileMode = Shader.TileMode.MIRROR;
                        } else if (i2 == 3) {
                            tileMode = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    LinearGradient linearGradient = new LinearGradient(f6, f7, f5, f8, iArr, fArr, tileMode);
                    linearGradient.setLocalMatrix(matrix);
                    paint2.setShader(linearGradient);
                }
            }
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (ihyVarC instanceof iib) {
            iib iibVar = (iib) ihyVarC;
            String str3 = iibVar.d;
            if (str3 != null) {
                A(iibVar, str3);
            }
            Boolean bool2 = iibVar.b;
            boolean z6 = bool2 != null && bool2.booleanValue();
            iiw iiwVar4 = this.d;
            if (z3) {
                paint = iiwVar4.d;
                z2 = true;
            } else {
                paint = iiwVar4.e;
                z2 = false;
            }
            if (z6) {
                iha ihaVar9 = new iha(50.0f, 9);
                iha ihaVar10 = iibVar.f;
                float fC = ihaVar10 != null ? ihaVar10.c(this) : ihaVar9.c(this);
                iha ihaVar11 = iibVar.g;
                float fD = ihaVar11 != null ? ihaVar11.d(this) : ihaVar9.d(this);
                iha ihaVar12 = iibVar.h;
                fB2 = ihaVar12 != null ? ihaVar12.a(this) : ihaVar9.a(this);
                f3 = fC;
                f4 = fD;
            } else {
                iha ihaVar13 = iibVar.f;
                if (ihaVar13 != null) {
                    f2 = 1.0f;
                    fB = ihaVar13.b(this, 1.0f);
                } else {
                    f2 = 1.0f;
                    fB = 0.5f;
                }
                iha ihaVar14 = iibVar.g;
                float fB7 = ihaVar14 != null ? ihaVar14.b(this, f2) : 0.5f;
                iha ihaVar15 = iibVar.h;
                f3 = fB;
                fB2 = ihaVar15 != null ? ihaVar15.b(this, f2) : 0.5f;
                f4 = fB7;
            }
            M();
            this.d = p(iibVar);
            Matrix matrix3 = new Matrix();
            if (!z6) {
                matrix3.preTranslate(igoVar.a, igoVar.b);
                matrix3.preScale(igoVar.c, igoVar.d);
            }
            Matrix matrix4 = iibVar.c;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = iibVar.a.size();
            if (size2 == 0) {
                L();
                iiw iiwVar5 = this.d;
                if (z2) {
                    iiwVar5.b = false;
                } else {
                    iiwVar5.c = false;
                }
            } else {
                int[] iArr2 = new int[size2];
                float[] fArr2 = new float[size2];
                Iterator it2 = iibVar.a.iterator();
                int i3 = 0;
                float f11 = -1.0f;
                while (it2.hasNext()) {
                    iho ihoVar2 = (iho) ((ihy) it2.next());
                    Float f12 = ihoVar2.a;
                    float fFloatValue2 = f12 != null ? f12.floatValue() : f;
                    if (i3 == 0 || fFloatValue2 >= f11) {
                        fArr2[i3] = fFloatValue2;
                        f11 = fFloatValue2;
                    } else {
                        fArr2[i3] = f11;
                    }
                    M();
                    O(this.d, ihoVar2);
                    ihp ihpVar2 = this.d.a;
                    igr igrVar2 = (igr) ihpVar2.u;
                    if (igrVar2 == null) {
                        igrVar2 = igr.a;
                    }
                    iArr2[i3] = (W(ihpVar2.v.floatValue()) << 24) | igrVar2.b;
                    L();
                    i3++;
                }
                if (fB2 == f || size2 == 1) {
                    L();
                    paint.setColor(iArr2[size2 - 1]);
                } else {
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    int i4 = iibVar.e;
                    if (i4 != 0) {
                        if (i4 == 2) {
                            tileMode2 = Shader.TileMode.MIRROR;
                        } else if (i4 == 3) {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    RadialGradient radialGradient = new RadialGradient(f3, f4, fB2, iArr2, fArr2, tileMode2);
                    radialGradient.setLocalMatrix(matrix3);
                    paint.setShader(radialGradient);
                }
            }
        }
        if (ihyVarC instanceof ihn) {
            ihn ihnVar = (ihn) ihyVarC;
            if (z3) {
                if (Y(ihnVar.q, 2147483648L)) {
                    iiw iiwVar6 = this.d;
                    ihp ihpVar3 = iiwVar6.a;
                    ihz ihzVar2 = ihnVar.q.y;
                    ihpVar3.b = ihzVar2;
                    iiwVar6.b = ihzVar2 != null;
                }
                if (Y(ihnVar.q, 4294967296L)) {
                    this.d.a.c = ihnVar.q.z;
                }
                if (Y(ihnVar.q, 6442450944L)) {
                    iiw iiwVar7 = this.d;
                    aa(iiwVar7, true, iiwVar7.a.b);
                    return;
                }
                return;
            }
            if (Y(ihnVar.q, 2147483648L)) {
                iiw iiwVar8 = this.d;
                ihp ihpVar4 = iiwVar8.a;
                ihz ihzVar3 = ihnVar.q.y;
                ihpVar4.d = ihzVar3;
                iiwVar8.c = ihzVar3 != null;
            }
            if (Y(ihnVar.q, 4294967296L)) {
                this.d.a.e = ihnVar.q.z;
            }
            if (Y(ihnVar.q, 6442450944L)) {
                iiw iiwVar9 = this.d;
                aa(iiwVar9, false, iiwVar9.a.d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(defpackage.ihv r22, android.graphics.Path r23) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ija.w(ihv, android.graphics.Path):void");
    }

    private final void x(Path path) {
        iiw iiwVar = this.d;
        int i = iiwVar.a.K;
        Canvas canvas = this.a;
        if (i != 2) {
            canvas.drawPath(path, iiwVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.d.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private final void y(iij iijVar, iiy iiyVar) {
        float f;
        float fD;
        float fC;
        if (Q()) {
            Iterator it = iijVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                ihy ihyVar = (ihy) it.next();
                if (ihyVar instanceof iim) {
                    iiyVar.a(q(((iim) ihyVar).a, z, !it.hasNext()));
                } else if (iiyVar.b((iij) ihyVar)) {
                    boolean z2 = ihyVar instanceof iik;
                    float fD2 = BitmapDescriptorFactory.HUE_RED;
                    if (z2) {
                        M();
                        iik iikVar = (iik) ihyVar;
                        O(this.d, iikVar);
                        if (Q() && i()) {
                            ihy ihyVarC = iikVar.t.c(iikVar.a);
                            if (ihyVarC == null) {
                                e("TextPath reference '%s' not found", iikVar.a);
                            } else {
                                ihg ihgVar = (ihg) ihyVarC;
                                Path path = new iis(ihgVar.a).a;
                                Matrix matrix = ihgVar.e;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                iha ihaVar = iikVar.b;
                                if (ihaVar != null) {
                                    fD2 = ihaVar.b(this, pathMeasure.getLength());
                                }
                                int iS = S();
                                if (iS != 1) {
                                    float fJ = j(iikVar);
                                    if (iS == 2) {
                                        fJ /= 2.0f;
                                    }
                                    fD2 -= fJ;
                                }
                                u(iikVar.c);
                                boolean zR = R();
                                y(iikVar, new iit(this, path, fD2));
                                if (zR) {
                                    Z();
                                }
                            }
                        }
                        L();
                    } else if (ihyVar instanceof iig) {
                        M();
                        iig iigVar = (iig) ihyVar;
                        O(this.d, iigVar);
                        if (Q()) {
                            boolean z3 = iiyVar instanceof iiu;
                            if (z3) {
                                List list = iigVar.b;
                                float fC2 = (list == null || list.size() == 0) ? ((iiu) iiyVar).b : ((iha) iigVar.b.get(0)).c(this);
                                List list2 = iigVar.c;
                                fD = (list2 == null || list2.size() == 0) ? ((iiu) iiyVar).c : ((iha) iigVar.c.get(0)).d(this);
                                List list3 = iigVar.d;
                                fC = (list3 == null || list3.size() == 0) ? 0.0f : ((iha) iigVar.d.get(0)).c(this);
                                List list4 = iigVar.e;
                                if (list4 != null && list4.size() != 0) {
                                    fD2 = ((iha) iigVar.e.get(0)).d(this);
                                }
                                float f2 = fC2;
                                f = fD2;
                                fD2 = f2;
                            } else {
                                f = 0.0f;
                                fD = 0.0f;
                                fC = 0.0f;
                            }
                            u(iigVar.a);
                            if (z3) {
                                iiu iiuVar = (iiu) iiyVar;
                                iiuVar.b = fD2 + fC;
                                iiuVar.c = fD + f;
                            }
                            boolean zR2 = R();
                            y(iigVar, iiyVar);
                            if (zR2) {
                                Z();
                            }
                        }
                        L();
                    } else if (ihyVar instanceof iif) {
                        M();
                        iif iifVar = (iif) ihyVar;
                        O(this.d, iifVar);
                        if (Q()) {
                            u(iifVar.b);
                            ihy ihyVarC2 = ihyVar.t.c(iifVar.a);
                            if (ihyVarC2 == null || !(ihyVarC2 instanceof iij)) {
                                e("Tref reference '%s' not found", iifVar.a);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                z((iij) ihyVarC2, sb);
                                if (sb.length() > 0) {
                                    iiyVar.a(sb.toString());
                                }
                            }
                        }
                        L();
                    }
                }
                z = false;
            }
        }
    }

    private final void z(iij iijVar, StringBuilder sb) {
        Iterator it = iijVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            ihy ihyVar = (ihy) it.next();
            if (ihyVar instanceof iij) {
                z((iij) ihyVar, sb);
            } else if (ihyVar instanceof iim) {
                sb.append(q(((iim) ihyVar).a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    protected final float a() {
        return this.d.d.getTextSize();
    }

    protected final igo b() {
        iiw iiwVar = this.d;
        igo igoVar = iiwVar.g;
        return igoVar != null ? igoVar : iiwVar.f;
    }

    public final void d(ihy ihyVar) {
        Boolean bool;
        if ((ihyVar instanceof ihw) && (bool = ((ihw) ihyVar).p) != null) {
            this.d.h = bool.booleanValue();
        }
    }

    public final void f(ihq ihqVar, iha ihaVar, iha ihaVar2, igo igoVar, ign ignVar) {
        float f;
        if (ihaVar == null || !ihaVar.f()) {
            if (ihaVar2 == null || !ihaVar2.f()) {
                if (ignVar == null && (ignVar = ihqVar.v) == null) {
                    ignVar = ign.b;
                }
                O(this.d, ihqVar);
                if (Q()) {
                    ihu ihuVar = ihqVar.u;
                    float fD = BitmapDescriptorFactory.HUE_RED;
                    if (ihuVar != null) {
                        iha ihaVar3 = ihqVar.a;
                        float fC = ihaVar3 != null ? ihaVar3.c(this) : 0.0f;
                        iha ihaVar4 = ihqVar.b;
                        if (ihaVar4 != null) {
                            fD = ihaVar4.d(this);
                        }
                        float f2 = fD;
                        fD = fC;
                        f = f2;
                    } else {
                        f = 0.0f;
                    }
                    igo igoVarB = b();
                    float fC2 = ihaVar != null ? ihaVar.c(this) : igoVarB.c;
                    float fD2 = ihaVar2 != null ? ihaVar2.d(this) : igoVarB.d;
                    iiw iiwVar = this.d;
                    iiwVar.f = new igo(fD, f, fC2, fD2);
                    if (!iiwVar.a.o.booleanValue()) {
                        igo igoVar2 = this.d.f;
                        K(igoVar2.a, igoVar2.b, igoVar2.c, igoVar2.d);
                    }
                    t(ihqVar, this.d.f);
                    Canvas canvas = this.a;
                    if (igoVar != null) {
                        canvas.concat(U(this.d.f, igoVar, ignVar));
                        this.d.g = ihqVar.w;
                    } else {
                        canvas.translate(fD, f);
                    }
                    boolean zR = R();
                    P();
                    H(ihqVar, true);
                    if (zR) {
                        Z();
                    }
                    N(ihqVar);
                }
            }
        }
    }

    public final void g(iiw iiwVar, ihp ihpVar) {
        if (Y(ihpVar, 4096L)) {
            iiwVar.a.k = ihpVar.k;
        }
        if (Y(ihpVar, 2048L)) {
            iiwVar.a.j = ihpVar.j;
        }
        if (Y(ihpVar, 1L)) {
            iiwVar.a.b = ihpVar.b;
            iiwVar.b = ihpVar.b != null;
        }
        if (Y(ihpVar, 4L)) {
            iiwVar.a.c = ihpVar.c;
        }
        if (Y(ihpVar, 6149L)) {
            aa(iiwVar, true, iiwVar.a.b);
        }
        if (Y(ihpVar, 2L)) {
            iiwVar.a.C = ihpVar.C;
        }
        if (Y(ihpVar, 8L)) {
            iiwVar.a.d = ihpVar.d;
            iiwVar.c = ihpVar.d != null;
        }
        if (Y(ihpVar, 16L)) {
            iiwVar.a.e = ihpVar.e;
        }
        if (Y(ihpVar, 6168L)) {
            aa(iiwVar, false, iiwVar.a.d);
        }
        if (Y(ihpVar, 34359738368L)) {
            iiwVar.a.K = ihpVar.K;
        }
        if (Y(ihpVar, 32L)) {
            ihp ihpVar2 = iiwVar.a;
            ihpVar2.f = ihpVar.f;
            iiwVar.e.setStrokeWidth(ihpVar2.f.a(this));
        }
        Typeface typefaceV = null;
        if (Y(ihpVar, 64L)) {
            iiwVar.a.D = ihpVar.D;
            int i = ihpVar.D;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                iiwVar.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 1) {
                iiwVar.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 2) {
                iiwVar.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Y(ihpVar, 128L)) {
            iiwVar.a.E = ihpVar.E;
            int i3 = ihpVar.E;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                iiwVar.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i4 == 1) {
                iiwVar.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i4 == 2) {
                iiwVar.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Y(ihpVar, 256L)) {
            iiwVar.a.g = ihpVar.g;
            iiwVar.e.setStrokeMiter(ihpVar.g.floatValue());
        }
        if (Y(ihpVar, 512L)) {
            iiwVar.a.h = ihpVar.h;
        }
        if (Y(ihpVar, 1024L)) {
            iiwVar.a.i = ihpVar.i;
        }
        if (Y(ihpVar, 1536L)) {
            iha[] ihaVarArr = iiwVar.a.h;
            if (ihaVarArr == null) {
                iiwVar.e.setPathEffect(null);
            } else {
                int length = ihaVarArr.length;
                int i5 = (length & 1) == 0 ? length : length + length;
                float[] fArr = new float[i5];
                float f = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    float fA = iiwVar.a.h[i6 % length].a(this);
                    fArr[i6] = fA;
                    f += fA;
                }
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    iiwVar.e.setPathEffect(null);
                } else {
                    float fA2 = iiwVar.a.i.a(this);
                    if (fA2 < BitmapDescriptorFactory.HUE_RED) {
                        fA2 = (fA2 % f) + f;
                    }
                    iiwVar.e.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (Y(ihpVar, 16384L)) {
            float fA3 = a();
            iiwVar.a.m = ihpVar.m;
            iiwVar.d.setTextSize(ihpVar.m.b(this, fA3));
            iiwVar.e.setTextSize(ihpVar.m.b(this, fA3));
        }
        if (Y(ihpVar, 8192L)) {
            iiwVar.a.l = ihpVar.l;
        }
        if (Y(ihpVar, 32768L)) {
            if (ihpVar.n.intValue() == -1 && iiwVar.a.n.intValue() > 100) {
                iiwVar.a.n = Integer.valueOf(r0.n.intValue() - 100);
            } else if (ihpVar.n.intValue() != 1 || iiwVar.a.n.intValue() >= 900) {
                iiwVar.a.n = ihpVar.n;
            } else {
                ihp ihpVar3 = iiwVar.a;
                ihpVar3.n = Integer.valueOf(ihpVar3.n.intValue() + 100);
            }
        }
        if (Y(ihpVar, 65536L)) {
            iiwVar.a.F = ihpVar.F;
        }
        if (Y(ihpVar, 106496L)) {
            List<String> list = iiwVar.a.l;
            if (list != null && this.c != null) {
                for (String str : list) {
                    ihp ihpVar4 = iiwVar.a;
                    typefaceV = V(str, ihpVar4.n, ihpVar4.F);
                    if (typefaceV != null) {
                        break;
                    }
                }
            }
            if (typefaceV == null) {
                ihp ihpVar5 = iiwVar.a;
                typefaceV = V("sans-serif", ihpVar5.n, ihpVar5.F);
            }
            iiwVar.d.setTypeface(typefaceV);
            iiwVar.e.setTypeface(typefaceV);
        }
        if (Y(ihpVar, 131072L)) {
            iiwVar.a.G = ihpVar.G;
            iiwVar.d.setStrikeThruText(ihpVar.G == 4);
            iiwVar.d.setUnderlineText(ihpVar.G == 2);
            iiwVar.e.setStrikeThruText(ihpVar.G == 4);
            iiwVar.e.setUnderlineText(ihpVar.G == 2);
        }
        if (Y(ihpVar, 68719476736L)) {
            iiwVar.a.H = ihpVar.H;
        }
        if (Y(ihpVar, 262144L)) {
            iiwVar.a.I = ihpVar.I;
        }
        if (Y(ihpVar, 524288L)) {
            iiwVar.a.o = ihpVar.o;
        }
        if (Y(ihpVar, 2097152L)) {
            iiwVar.a.p = ihpVar.p;
        }
        if (Y(ihpVar, 4194304L)) {
            iiwVar.a.q = ihpVar.q;
        }
        if (Y(ihpVar, 8388608L)) {
            iiwVar.a.r = ihpVar.r;
        }
        if (Y(ihpVar, 16777216L)) {
            iiwVar.a.s = ihpVar.s;
        }
        if (Y(ihpVar, 33554432L)) {
            iiwVar.a.t = ihpVar.t;
        }
        if (Y(ihpVar, 1048576L)) {
            iiwVar.a.L = ihpVar.L;
        }
        if (Y(ihpVar, 268435456L)) {
            iiwVar.a.w = ihpVar.w;
        }
        if (Y(ihpVar, 536870912L)) {
            iiwVar.a.J = ihpVar.J;
        }
        if (Y(ihpVar, 1073741824L)) {
            iiwVar.a.x = ihpVar.x;
        }
        if (Y(ihpVar, 67108864L)) {
            iiwVar.a.u = ihpVar.u;
        }
        if (Y(ihpVar, 134217728L)) {
            iiwVar.a.v = ihpVar.v;
        }
        if (Y(ihpVar, 8589934592L)) {
            iiwVar.a.A = ihpVar.A;
        }
        if (Y(ihpVar, 17179869184L)) {
            iiwVar.a.B = ihpVar.B;
        }
    }

    public final boolean i() {
        Boolean bool = this.d.a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
