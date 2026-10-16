package defpackage;

/* loaded from: classes3.dex */
public final class uue {
    public static final uue a = new uue(0);
    final int d;
    uue b = null;
    uue c = null;
    int e = 0;
    int f = 0;
    boolean g = false;
    boolean h = false;

    public uue(int i) {
        this.d = i;
    }

    final void a(uue uueVar, uue uueVar2) {
        if (uueVar != null) {
            uueVar.c = this;
        }
        if (uueVar2 != null) {
            uueVar2.b = this;
        }
        this.b = uueVar;
        this.c = uueVar2;
        this.g = true;
    }

    public final boolean b() {
        return this.d != 0 && this.g;
    }
}
