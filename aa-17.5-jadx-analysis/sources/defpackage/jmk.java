package defpackage;

/* loaded from: classes.dex */
public final class jmk {
    private final afdr a;
    private final afec b;
    private int c;
    private Object d;

    public jmk(afdr afdrVar, afec afecVar) {
        this.a = afdrVar;
        this.b = afecVar;
    }

    public final synchronized Object a() {
        this.c++;
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.a.invoke();
        this.d = objInvoke;
        return objInvoke;
    }

    public final synchronized void b() {
        Object obj;
        int i = this.c;
        if (i <= 0) {
            throw new IllegalStateException("Trying to decrement reference count below zero!");
        }
        int i2 = i - 1;
        this.c = i2;
        if (i2 != 0 || (obj = this.d) == null) {
            return;
        }
        this.b.invoke(obj);
        this.d = null;
    }
}
