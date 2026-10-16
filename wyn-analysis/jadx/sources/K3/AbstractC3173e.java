package k3;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3173e extends E9.c {
    public abstract void w(o3.g gVar, Object obj);

    public final void x(Object obj) {
        o3.g gVarA = a();
        try {
            w(gVarA, obj);
            gVarA.v();
        } finally {
            q(gVarA);
        }
    }
}
