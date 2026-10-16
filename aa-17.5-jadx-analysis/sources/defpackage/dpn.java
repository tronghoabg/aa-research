package defpackage;

/* loaded from: classes2.dex */
public final class dpn extends dph {
    public static dpn a(String str) {
        dpn dpnVar = new dpn(str.toCharArray());
        dpnVar.B();
        dpnVar.z(str.length() - 1);
        return dpnVar;
    }

    @Override // defpackage.dph
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dpn) && x().equals(((dpn) obj).x())) {
            return true;
        }
        return super.equals(obj);
    }
}
