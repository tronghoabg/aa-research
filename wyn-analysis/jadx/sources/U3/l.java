package u3;

import b1.C1496e;
import p7.AbstractC3772b;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C1496e[] f46607a;

    /* renamed from: b, reason: collision with root package name */
    public String f46608b;

    /* renamed from: c, reason: collision with root package name */
    public int f46609c;

    public l() {
        this.f46607a = null;
        this.f46609c = 0;
    }

    public C1496e[] getPathData() {
        return this.f46607a;
    }

    public String getPathName() {
        return this.f46608b;
    }

    public void setPathData(C1496e[] c1496eArr) {
        if (!AbstractC3772b.h(this.f46607a, c1496eArr)) {
            this.f46607a = AbstractC3772b.p(c1496eArr);
            return;
        }
        C1496e[] c1496eArr2 = this.f46607a;
        for (int i5 = 0; i5 < c1496eArr.length; i5++) {
            c1496eArr2[i5].f19126a = c1496eArr[i5].f19126a;
            int i10 = 0;
            while (true) {
                float[] fArr = c1496eArr[i5].f19127b;
                if (i10 < fArr.length) {
                    c1496eArr2[i5].f19127b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f46607a = null;
        this.f46609c = 0;
        this.f46608b = lVar.f46608b;
        this.f46607a = AbstractC3772b.p(lVar.f46607a);
    }
}
