package defpackage;

/* loaded from: classes.dex */
public final class cxe {
    public static final dlg a = new dlh(1.0f, 1.0f);

    public static final cym a(cxb cxbVar) {
        cym cymVar = cxbVar.k;
        if (cymVar != null) {
            return cymVar;
        }
        crt.a("LayoutNode should be attached to an owner");
        throw new aezp();
    }
}
