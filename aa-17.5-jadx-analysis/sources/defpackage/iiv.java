package defpackage;

import android.graphics.Path;

/* loaded from: classes2.dex */
final class iiv extends iiy {
    public float a;
    public final float b;
    public final Path c;
    final /* synthetic */ ija d;

    public iiv(ija ijaVar, float f, float f2, Path path) {
        this.d = ijaVar;
        this.a = f;
        this.b = f2;
        this.c = path;
    }

    @Override // defpackage.iiy
    public final void a(String str) {
        String str2;
        ija ijaVar = this.d;
        if (ijaVar.i()) {
            Path path = new Path();
            str2 = str;
            ijaVar.d.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
            this.c.addPath(path);
        } else {
            str2 = str;
        }
        this.a += ijaVar.d.d.measureText(str2);
    }

    @Override // defpackage.iiy
    public final boolean b(iij iijVar) {
        if (!(iijVar instanceof iik)) {
            return true;
        }
        ija.h("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        return false;
    }
}
