package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxc extends java.lang.Exception {
    private static final java.lang.StackTraceElement[] a = new java.lang.StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final java.util.List b;
    private defpackage.hus c;
    private java.lang.Class d;
    private java.lang.String e;
    private int f;

    public hxc(java.lang.String str, java.util.List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    private final void d(java.lang.Throwable th, java.util.List list) {
        if (th instanceof defpackage.hxc) {
            java.util.Iterator it = ((defpackage.hxc) th).b.iterator();
            while (it.hasNext()) {
                d((java.lang.Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    private static void e(java.lang.Throwable th, java.lang.Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException(th);
        }
    }

    private final void f(java.lang.Appendable appendable) {
        e(this, appendable);
        defpackage.hxb hxbVar = new defpackage.hxb(appendable);
        java.util.List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                hxbVar.append("Cause (");
                int i2 = i + 1;
                hxbVar.append(java.lang.String.valueOf(i2));
                hxbVar.append(" of ");
                hxbVar.append(java.lang.String.valueOf(size));
                hxbVar.append("): ");
                java.lang.Throwable th = (java.lang.Throwable) list.get(i);
                if (th instanceof defpackage.hxc) {
                    ((defpackage.hxc) th).f(hxbVar);
                } else {
                    e(th, hxbVar);
                }
                i = i2;
            }
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        d(this, arrayList);
        return arrayList;
    }

    public final void b(java.lang.String str) {
        java.util.List listA = a();
        int size = listA.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            android.util.Log.i(str, defpackage.a.bz(size, i2, "Root cause (", " of ", ")"), (java.lang.Throwable) listA.get(i));
            i = i2;
        }
    }

    final void c(defpackage.hus husVar, int i, java.lang.Class cls) {
        this.c = husVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(71);
        sb.append(this.e);
        java.lang.Class cls = this.d;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        int i = this.f;
        sb.append(i != 0 ? ", ".concat(defpackage.hed.k(i)) : "");
        defpackage.hus husVar = this.c;
        sb.append(husVar != null ? ", ".concat(husVar.toString()) : "");
        java.util.List<java.lang.Throwable> listA = a();
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
        for (java.lang.Throwable th : listA) {
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
    public final void printStackTrace() {
        f(java.lang.System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintWriter printWriter) {
        f(printWriter);
    }

    public hxc(java.lang.String str) {
        this(str, java.util.Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
