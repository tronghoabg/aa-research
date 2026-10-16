package defpackage;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
final class ydu extends ymc {
    public final yfy b;
    public final yfy c;
    public final int[] d;
    public final int[] e;
    public final Object[][] f;
    private final yfy g;
    private final yfy h;
    private final int[] i;
    private final int[] j;

    public ydu(yfq yfqVar, ygr ygrVar, ygr ygrVar2) {
        this.f = (Object[][]) Array.newInstance((Class<?>) Object.class, ygrVar.size(), ygrVar2.size());
        yfy yfyVarG = yrm.G(ygrVar);
        this.b = yfyVarG;
        yfy yfyVarG2 = yrm.G(ygrVar2);
        this.c = yfyVarG2;
        this.d = new int[((ylx) yfyVarG).d];
        this.e = new int[((ylx) yfyVarG2).d];
        int[] iArr = new int[yfqVar.size()];
        int[] iArr2 = new int[yfqVar.size()];
        for (int i = 0; i < yfqVar.size(); i++) {
            yni yniVar = (yni) yfqVar.get(i);
            Object objB = yniVar.b();
            Object objA = yniVar.a();
            Integer num = (Integer) this.b.get(objB);
            num.getClass();
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.c.get(objA);
            num2.getClass();
            int iIntValue2 = num2.intValue();
            Object obj = this.f[iIntValue][iIntValue2];
            woy.ah(obj == null, objB, objA, yniVar.c(), obj);
            this.f[iIntValue][iIntValue2] = yniVar.c();
            int[] iArr3 = this.d;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.e;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.i = iArr;
        this.j = iArr2;
        this.g = new ydt(this);
        this.h = new ydp(this);
    }

    @Override // defpackage.ybz
    public final Object a(Object obj, Object obj2) {
        Integer num = (Integer) this.b.get(obj);
        Integer num2 = (Integer) this.c.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f[num.intValue()][num2.intValue()];
    }

    @Override // defpackage.ynj
    public final int f() {
        return this.i.length;
    }

    @Override // defpackage.yhe
    public final yfy g() {
        return yfy.j(this.h);
    }

    @Override // defpackage.yhe, defpackage.ynj
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final yfy k() {
        return yfy.j(this.g);
    }

    @Override // defpackage.ymc
    public final yni i(int i) {
        int[] iArr = this.j;
        int i2 = this.i[i];
        int i3 = iArr[i];
        E e = n().d().get(i2);
        E e2 = m().d().get(i3);
        Object obj = this.f[i2][i3];
        obj.getClass();
        return o(e, e2, obj);
    }

    @Override // defpackage.ymc
    public final Object j(int i) {
        Object obj = this.f[this.i[i]][this.j[i]];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ymc, defpackage.yhe
    Object writeReplace() {
        return yhd.a(this, this.i, this.j);
    }
}
