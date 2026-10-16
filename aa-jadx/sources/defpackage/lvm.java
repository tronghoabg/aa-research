package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class lvm {
    public boolean a;
    public java.lang.String b;
    public android.os.Bundle c = new android.os.Bundle();
    public long d;
    public defpackage.moe e;
    public long f;
    public java.lang.String g;
    public int h;
    public int i;
    public android.graphics.Bitmap j;
    public android.net.Uri k;

    public lvm() {
        defpackage.ojm.a();
        j$.time.Instant.now().toEpochMilli();
        this.e = defpackage.moe.d;
    }

    public void a(java.lang.String str) {
        this.g = str;
    }

    public final void b(defpackage.lvn lvnVar) {
        this.i = lvnVar.h;
        this.j = lvnVar.i;
        this.k = lvnVar.j;
        this.f = lvnVar.e;
        this.h = lvnVar.g;
        a(lvnVar.f());
        this.d = lvnVar.c;
        this.e = lvnVar.d;
        this.c = lvnVar.b;
        this.a = lvnVar.a;
        this.b = lvnVar.k;
    }
}
