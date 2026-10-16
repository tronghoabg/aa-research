package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hiu {
    public final java.lang.Object a;
    public final int b;
    public final androidx.car.app.model.Metadata c;
    public final androidx.car.app.model.CarText d;
    public final int e;
    public final int f;
    public final defpackage.gie g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final androidx.car.app.messaging.model.ConversationItem k;
    public final defpackage.hiv l;
    public boolean m;

    public hiu(defpackage.hit hitVar) {
        this.a = hitVar.a;
        this.b = hitVar.b;
        androidx.car.app.model.Metadata metadata = hitVar.c;
        metadata.getClass();
        this.c = metadata;
        this.d = hitVar.h;
        this.e = hitVar.e;
        this.f = hitVar.d;
        this.l = hitVar.f;
        this.m = hitVar.g;
        defpackage.gie gieVar = hitVar.i;
        gieVar.getClass();
        this.g = gieVar;
        this.h = hitVar.j;
        this.k = hitVar.m;
        this.i = hitVar.k;
        this.j = hitVar.l;
    }

    public final boolean a() {
        return (this.e & 4) != 0;
    }

    public final java.lang.String toString() {
        return "[" + this.a + ", group: " + this.l + "]";
    }
}
