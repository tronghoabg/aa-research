package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class tff implements defpackage.tfg {
    private final /* synthetic */ int a;

    public /* synthetic */ tff(int i) {
        this.a = i;
    }

    @Override // defpackage.tfg
    public final boolean a(java.lang.Enum r5, java.lang.Enum r6, defpackage.tfe tfeVar) {
        int i = this.a;
        if (i == 0) {
            r5.getClass();
            ((defpackage.yqj) tfeVar.c.h()).M("Illegal state transition from %s to %s! Allowing anyway.", r5, r6);
            return true;
        }
        if (i == 1) {
            defpackage.jmk jmkVar = (defpackage.jmk) r5;
            defpackage.jmk jmkVar2 = (defpackage.jmk) r6;
            defpackage.jmd jmdVar = defpackage.jml.a;
            jmkVar.getClass();
            return ((jmkVar == defpackage.jmk.b && jmkVar2 == defpackage.jmk.d) ? defpackage.jml.e : defpackage.jml.d).a(jmkVar, jmkVar2, tfeVar);
        }
        if (i != 2) {
            r5.getClass();
            ((defpackage.yqj) tfeVar.c.h()).M("Illegal state transition from %s to %s!", r5, r6);
            return false;
        }
        r5.getClass();
        java.lang.String str = java.lang.String.format("Illegal state transition from %s to %s!", java.util.Arrays.copyOf(new java.lang.Object[]{r5, r6}, 2));
        str.getClass();
        throw new java.lang.IllegalArgumentException(str);
    }
}
