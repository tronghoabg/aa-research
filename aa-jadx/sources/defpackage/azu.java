package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class azu {
    public final java.lang.Object a;
    public int c;
    public boolean d;
    public defpackage.azu f;
    private final defpackage.azv g;
    public int b = -1;
    public final defpackage.bwx e = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);

    public azu(java.lang.Object obj, defpackage.azv azvVar) {
        this.a = obj;
        this.g = azvVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.c <= 0) {
            defpackage.asq.d("Release should only be called once");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            b();
        }
    }

    public final void b() {
        this.g.a.remove(this);
        defpackage.azu azuVar = this.f;
        if (azuVar != null) {
            azuVar.a();
        }
        this.f = null;
    }

    public final defpackage.azu c() {
        return (defpackage.azu) this.e.a();
    }

    public final void d() {
        if (this.d) {
            defpackage.asq.d("Pin should not be called on an already disposed item ");
        }
        if (this.c == 0) {
            this.g.a.add(this);
            defpackage.azu azuVarC = c();
            if (azuVarC != null) {
                azuVarC.d();
            } else {
                azuVarC = null;
            }
            this.f = azuVarC;
        }
        this.c++;
    }
}
