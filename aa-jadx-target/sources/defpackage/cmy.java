package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmy extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        if (view instanceof defpackage.cmz) {
            defpackage.cmz cmzVar = (defpackage.cmz) view;
            int i = defpackage.cmz.j;
            android.graphics.Outline outline2 = cmzVar.b;
            if (outline2 != null) {
                outline.set(outline2);
                float f = cmzVar.h;
                if (f == 0.0f && cmzVar.i == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) cmzVar.i);
            }
        }
    }
}
