package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hwt extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private hui c;
    private Class d;
    private String e;
    private int f;

    public hwt(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    private final void d(Throwable th, List list) {
        if (th instanceof hwt) {
            Iterator it = ((hwt) th).b.iterator();
            while (it.hasNext()) {
                d((Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    private static void e(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void f(Appendable appendable) throws IOException {
        e(this, appendable);
        hws hwsVar = new hws(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                hwsVar.append("Cause (");
                int i2 = i + 1;
                hwsVar.append(String.valueOf(i2));
                hwsVar.append(" of ");
                hwsVar.append(String.valueOf(size));
                hwsVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof hwt) {
                    ((hwt) th).f(hwsVar);
                } else {
                    e(th, hwsVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        d(this, arrayList);
        return arrayList;
    }

    public final void b(String str) {
        List listA = a();
        int size = listA.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Log.i(str, a.bB(size, i2, "Root cause (", " of ", ")"), (Throwable) listA.get(i));
            i = i2;
        }
    }

    final void c(hui huiVar, int i, Class cls) {
        this.c = huiVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        int i = this.f;
        sb.append(i != 0 ? ", ".concat(hdt.r(i)) : "");
        hui huiVar = this.c;
        sb.append(huiVar != null ? ", ".concat(huiVar.toString()) : "");
        List<Throwable> listA = a();
        if (listA.isEmpty()) {
            return sb.toString();
        }
        if (listA.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listA.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listA) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        f(printWriter);
    }

    public hwt(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
