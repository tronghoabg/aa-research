package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class azp {
    public final Object a;
    public int c;
    public boolean d;
    public azp f;
    private final azq g;
    public int b = -1;
    public final bwq e = new ParcelableSnapshotMutableState(null, bxp.c);

    public azp(Object obj, azq azqVar) {
        this.a = obj;
        this.g = azqVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.c <= 0) {
            asl.d("Release should only be called once");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            b();
        }
    }

    public final void b() {
        this.g.a.remove(this);
        azp azpVar = this.f;
        if (azpVar != null) {
            azpVar.a();
        }
        this.f = null;
    }

    public final azp c() {
        return (azp) this.e.a();
    }

    public final void d() {
        if (this.d) {
            asl.d("Pin should not be called on an already disposed item ");
        }
        if (this.c == 0) {
            this.g.a.add(this);
            azp azpVarC = c();
            if (azpVarC != null) {
                azpVarC.d();
            } else {
                azpVarC = null;
            }
            this.f = azpVarC;
        }
        this.c++;
    }
}
