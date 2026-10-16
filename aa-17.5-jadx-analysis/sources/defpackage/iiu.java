package defpackage;

/* loaded from: classes2.dex */
class iiu extends iiy {
    public float b;
    public float c;
    final /* synthetic */ ija d;

    public iiu(ija ijaVar, float f, float f2) {
        this.d = ijaVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.iiy
    public void a(String str) {
        ija ijaVar = this.d;
        if (ijaVar.i()) {
            iiw iiwVar = ijaVar.d;
            if (iiwVar.b) {
                ijaVar.a.drawText(str, this.b, this.c, iiwVar.d);
            }
            iiw iiwVar2 = ijaVar.d;
            if (iiwVar2.c) {
                ijaVar.a.drawText(str, this.b, this.c, iiwVar2.e);
            }
        }
        this.b += ijaVar.d.d.measureText(str);
    }
}
