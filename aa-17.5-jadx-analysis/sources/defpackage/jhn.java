package defpackage;

/* loaded from: classes2.dex */
public final class jhn extends emn {
    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        ((jhp) obj).getClass();
        return r1.o;
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        jhp jhpVar = (jhp) obj;
        jhpVar.getClass();
        int i = (int) f;
        int i2 = i - jhpVar.o;
        jhpVar.o = i;
        if (i2 != 0) {
            int i3 = jhpVar.h() == 2 ? i2 : 0;
            if (jhpVar.h() != 1) {
                i2 = 0;
            }
            jhpVar.e.bk(i3, i2);
            jhpVar.f();
        }
    }
}
