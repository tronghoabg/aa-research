package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jhu extends defpackage.emu {
    @Override // defpackage.emu
    public final /* bridge */ /* synthetic */ float a(java.lang.Object obj) {
        defpackage.jhw jhwVar = (defpackage.jhw) obj;
        jhwVar.getClass();
        return jhwVar.o;
    }

    @Override // defpackage.emu
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, float f) {
        defpackage.jhw jhwVar = (defpackage.jhw) obj;
        jhwVar.getClass();
        int i = (int) f;
        int i2 = i - jhwVar.o;
        jhwVar.o = i;
        if (i2 != 0) {
            int i3 = jhwVar.h() == 2 ? i2 : 0;
            if (jhwVar.h() != 1) {
                i2 = 0;
            }
            jhwVar.e.bl(i3, i2);
            jhwVar.f();
        }
    }
}
