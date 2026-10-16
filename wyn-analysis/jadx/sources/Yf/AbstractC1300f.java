package Yf;

import ba.C1521a;
import java.util.List;
import k1.g0;
import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Yf.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1300f {

    /* renamed from: a, reason: collision with root package name */
    public Object f16855a;

    /* renamed from: b, reason: collision with root package name */
    public int f16856b;

    public AbstractC1300f(int i5, boolean z2) {
        switch (i5) {
            case 1:
                this.f16855a = new ff.l();
                break;
            default:
                this.f16855a = new ff.l();
                break;
        }
    }

    public abstract void a(g0 g0Var);

    public abstract void b(g0 g0Var);

    public abstract v0 c(v0 v0Var, List list);

    public abstract C1521a d(g0 g0Var, C1521a c1521a);

    public void e(char[] array) {
        AbstractC3340k.e(array, "array");
        synchronized (this) {
            int i5 = this.f16856b;
            if (array.length + i5 < AbstractC1298d.f16853a) {
                this.f16856b = i5 + array.length;
                ((ff.l) this.f16855a).addLast(array);
            }
        }
    }

    public char[] f(int i5) {
        char[] cArr;
        synchronized (this) {
            ff.l lVar = (ff.l) this.f16855a;
            cArr = null;
            char[] cArr2 = (char[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (cArr2 != null) {
                this.f16856b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i5] : cArr;
    }

    public AbstractC1300f(int i5) {
        this.f16856b = i5;
    }
}
