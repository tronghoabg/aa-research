package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class fgm extends fgc {
    boolean A;
    private boolean B;
    private int C;
    private fgc[] D;
    ArrayList a;
    int z;

    public fgm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.B = true;
        this.A = false;
        this.C = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.h);
        W(dlz.m(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void X(fgc fgcVar) {
        this.a.add(fgcVar);
        fgcVar.k = this;
    }

    private final void Y(fgc[] fgcVarArr) {
        Arrays.fill(fgcVarArr, (Object) null);
        this.D = fgcVarArr;
    }

    private final fgc[] Z() {
        fgc[] fgcVarArr = this.D;
        this.D = null;
        if (fgcVarArr == null) {
            fgcVarArr = new fgc[this.a.size()];
        }
        return (fgc[]) this.a.toArray(fgcVarArr);
    }

    private final void aa() {
        W(1);
        U(new feo(2));
        U(new fdw());
        U(new feo(1));
    }

    @Override // defpackage.fgc
    public final void A(ffx ffxVar) {
        this.u = ffxVar;
        this.C |= 8;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((fgc) this.a.get(i)).A(ffxVar);
        }
    }

    @Override // defpackage.fgc
    public final void B(ffe ffeVar) {
        super.B(ffeVar);
        this.C |= 4;
        if (this.a != null) {
            for (int i = 0; i < this.a.size(); i++) {
                ((fgc) this.a.get(i)).B(ffeVar);
            }
        }
    }

    @Override // defpackage.fgc
    public final void C(fgi fgiVar) {
        this.t = fgiVar;
        this.C |= 2;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((fgc) this.a.get(i)).C(fgiVar);
        }
    }

    @Override // defpackage.fgc
    public final boolean E() {
        for (int i = 0; i < this.a.size(); i++) {
            if (((fgc) this.a.get(i)).E()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgc
    public final /* bridge */ /* synthetic */ void I(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((fgc) this.a.get(i2)).I(i);
        }
        super.I(i);
    }

    @Override // defpackage.fgc
    public final /* bridge */ /* synthetic */ void J(View view) {
        for (int i = 0; i < this.a.size(); i++) {
            ((fgc) this.a.get(i)).J(view);
        }
        super.J(view);
    }

    @Override // defpackage.fgc
    public final /* bridge */ /* synthetic */ void K(Class cls) {
        for (int i = 0; i < this.a.size(); i++) {
            ((fgc) this.a.get(i)).K(cls);
        }
        super.K(cls);
    }

    @Override // defpackage.fgc
    public final /* bridge */ /* synthetic */ void L(String str) {
        for (int i = 0; i < this.a.size(); i++) {
            ((fgc) this.a.get(i)).L(str);
        }
        super.L(str);
    }

    @Override // defpackage.fgc
    public final void M(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((fgc) this.a.get(i2)).M(i);
        }
        super.M(i);
    }

    @Override // defpackage.fgc
    public final void N(Class cls) {
        for (int i = 0; i < this.a.size(); i++) {
            ((fgc) this.a.get(i)).N(cls);
        }
        super.N(cls);
    }

    @Override // defpackage.fgc
    public final void O(String str) {
        for (int i = 0; i < this.a.size(); i++) {
            ((fgc) this.a.get(i)).O(str);
        }
        super.O(str);
    }

    @Override // defpackage.fgc
    public final /* bridge */ /* synthetic */ void Q(View view) {
        for (int i = 0; i < this.a.size(); i++) {
            ((fgc) this.a.get(i)).Q(view);
        }
        super.Q(view);
    }

    @Override // defpackage.fgc
    public final /* bridge */ /* synthetic */ void S(TimeInterpolator timeInterpolator) {
        this.C |= 1;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fgc) this.a.get(i)).S(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.fgc
    public final /* synthetic */ void T(long j) {
        this.b = j;
    }

    public final void U(fgc fgcVar) {
        X(fgcVar);
        long j = this.c;
        if (j >= 0) {
            fgcVar.R(j);
        }
        if ((this.C & 1) != 0) {
            fgcVar.S(this.d);
        }
        if ((this.C & 2) != 0) {
            fgcVar.C(this.t);
        }
        if ((this.C & 4) != 0) {
            fgcVar.B(this.v);
        }
        if ((this.C & 8) != 0) {
            fgcVar.A(this.u);
        }
    }

    @Override // defpackage.fgc
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void R(long j) {
        ArrayList arrayList;
        this.c = j;
        if (this.c < 0 || (arrayList = this.a) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fgc) this.a.get(i)).R(j);
        }
    }

    public final void W(int i) {
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                throw new AndroidRuntimeException(a.bp(i, "Invalid parameter for TransitionSet ordering: "));
            }
            z = false;
        }
        this.B = z;
    }

    @Override // defpackage.fgc
    public final void b(fgo fgoVar) {
        if (G(fgoVar.b)) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fgc fgcVar = (fgc) arrayList.get(i);
                if (fgcVar.G(fgoVar.b)) {
                    fgcVar.b(fgoVar);
                    fgoVar.c.add(fgcVar);
                }
            }
        }
    }

    @Override // defpackage.fgc
    public final void c(fgo fgoVar) {
        if (G(fgoVar.b)) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fgc fgcVar = (fgc) arrayList.get(i);
                if (fgcVar.G(fgoVar.b)) {
                    fgcVar.c(fgoVar);
                    fgoVar.c.add(fgcVar);
                }
            }
        }
    }

    @Override // defpackage.fgc
    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // defpackage.fgc
    public final boolean d() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((fgc) this.a.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.a.size();
    }

    public final fgc g(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (fgc) this.a.get(i);
    }

    @Override // defpackage.fgc
    /* renamed from: j */
    public final fgc clone() {
        fgm fgmVar = (fgm) super.clone();
        fgmVar.a = new ArrayList();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            fgmVar.X(((fgc) this.a.get(i)).clone());
        }
        return fgmVar;
    }

    @Override // defpackage.fgc
    public final String n(String str) {
        String strN = super.n(str);
        for (int i = 0; i < this.a.size(); i++) {
            strN = strN + "\n" + ((fgc) this.a.get(i)).n(str.concat("  "));
        }
        return strN;
    }

    @Override // defpackage.fgc
    public final void o() {
        super.o();
        fgc[] fgcVarArrZ = Z();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            fgcVarArrZ[i].o();
        }
        Y(fgcVarArrZ);
    }

    @Override // defpackage.fgc
    public final void p(fgo fgoVar) {
        super.p(fgoVar);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((fgc) this.a.get(i)).p(fgoVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.fgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(android.view.ViewGroup r13, defpackage.fgp r14, defpackage.fgp r15, java.util.ArrayList r16, java.util.ArrayList r17) {
        /*
            r12 = this;
            long r0 = r12.b
            java.util.ArrayList r2 = r12.a
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L3d
            java.util.ArrayList r5 = r12.a
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            fgc r6 = (defpackage.fgc) r6
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            boolean r5 = r12.B
            if (r5 != 0) goto L22
            if (r4 != 0) goto L30
            r4 = r3
        L22:
            long r9 = r6.b
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2d
            long r9 = r9 + r0
            r6.T(r9)
            goto L30
        L2d:
            r6.T(r0)
        L30:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.s(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto La
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgm.s(android.view.ViewGroup, fgp, fgp, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // defpackage.fgc
    public final void v(View view) {
        super.v(view);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((fgc) this.a.get(i)).v(view);
        }
    }

    @Override // defpackage.fgc
    public final void w() {
        this.w = 0L;
        fgk fgkVar = new fgk(this);
        for (int i = 0; i < this.a.size(); i++) {
            fgc fgcVar = (fgc) this.a.get(i);
            fgcVar.H(fgkVar);
            fgcVar.w();
            long j = fgcVar.w;
            if (this.B) {
                this.w = Math.max(this.w, j);
            } else {
                long j2 = this.w;
                fgcVar.y = j2;
                this.w = j2 + j;
            }
        }
    }

    @Override // defpackage.fgc
    public final void x(View view) {
        super.x(view);
        fgc[] fgcVarArrZ = Z();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            fgcVarArrZ[i].x(view);
        }
        Y(fgcVarArrZ);
    }

    @Override // defpackage.fgc
    protected final void y() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            D();
            t();
            return;
        }
        fgl fglVar = new fgl(this);
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((fgc) arrayList2.get(i)).H(fglVar);
        }
        this.z = this.a.size();
        if (this.B) {
            ArrayList arrayList3 = this.a;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((fgc) arrayList3.get(i2)).y();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.a.size();
            arrayList = this.a;
            if (i3 >= size3) {
                break;
            }
            ((fgc) arrayList.get(i3 - 1)).H(new fgj((fgc) this.a.get(i3)));
            i3++;
        }
        fgc fgcVar = (fgc) arrayList.get(0);
        if (fgcVar != null) {
            fgcVar.y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgm.z(long, long):void");
    }

    public fgm(Context context, AttributeSet attributeSet, byte[] bArr) {
        this(context, attributeSet);
        aa();
    }

    public fgm() {
        this.a = new ArrayList();
        this.B = true;
        this.A = false;
        this.C = 0;
    }

    public fgm(byte[] bArr) {
        this();
        aa();
    }
}
