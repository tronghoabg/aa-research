package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class rzj {
    private final PrintWriter a;
    private int b;
    private boolean c;

    protected rzj(PrintWriter printWriter) {
        this.b = 0;
        this.c = true;
        this.a = printWriter;
    }

    public final rzj a(Object obj, Object obj2) {
        return h("%s: %s,", obj, obj2);
    }

    public final rzj b(Object obj, Runnable runnable) {
        i((String) obj);
        i(": ");
        runnable.run();
        m(",");
        return this;
    }

    @ResultIgnorabilityUnspecified
    public final rzj c(Object obj, String str, Object... objArr) {
        return a(obj, String.format(str, objArr));
    }

    public final rzj d(Object obj, Collection collection, dzg dzgVar) {
        return b(obj, new rdz(this, collection, dzgVar, 3));
    }

    @ResultIgnorabilityUnspecified
    public final rzj e(Runnable runnable) {
        i("{");
        j(runnable);
        i("}");
        return this;
    }

    @ResultIgnorabilityUnspecified
    public final rzj f(Object obj, Runnable runnable) {
        i((String) obj);
        i(" ");
        return e(runnable);
    }

    public final rzj g(String str, Object... objArr) {
        i(String.format(str, objArr));
        return this;
    }

    public final rzj h(String str, Object... objArr) {
        m(String.format(str, objArr));
        return this;
    }

    public final void i(String str) {
        if (str.isEmpty()) {
            return;
        }
        woy.Z(this.b >= 0);
        if (this.c) {
            this.c = false;
            int i = this.b;
            if (i > 0) {
                this.a.print(wub.O(i));
            }
        }
        this.c = str.endsWith("\n");
        if (this.b > 0 && str.contains("\n")) {
            str = str.replaceAll("\\n(?!(\\n|$))", "\n".concat(wub.O(this.b)));
        }
        this.a.print(str);
    }

    public final void j(Runnable runnable) {
        int i = this.b;
        woy.ab(i >= 0, "Invalid indentCount %s", i);
        this.b++;
        runnable.run();
        this.b--;
    }

    public final void k(Collection collection, dzg dzgVar) {
        if (collection.isEmpty()) {
            i("[]");
            return;
        }
        m("[");
        this.b++;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dzgVar.a(it.next());
            m(",");
        }
        this.b--;
        i("]");
    }

    public final void l() {
        this.a.println();
        this.c = true;
    }

    public final void m(String str) {
        i(str);
        l();
    }

    public rzj(PrintWriter printWriter, byte[] bArr) {
        this(printWriter);
    }
}
