package com.bumptech.glide.load.a;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aq extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement[] f3037a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private final List f3038b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.o f3039c;

    /* renamed from: d, reason: collision with root package name */
    private Class f3040d;

    /* renamed from: e, reason: collision with root package name */
    private String f3041e;

    /* renamed from: f, reason: collision with root package name */
    private int f3042f;

    public aq(String str, List list) {
        this.f3041e = str;
        setStackTrace(f3037a);
        this.f3038b = list;
    }

    private final void c(Throwable th, List list) {
        if (th instanceof aq) {
            Iterator it = ((aq) th).f3038b.iterator();
            while (it.hasNext()) {
                c((Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    private static void d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) throws IOException {
        d(this, appendable);
        ap apVar = new ap(appendable);
        List list = this.f3038b;
        try {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                apVar.append("Cause (");
                int i3 = i2 + 1;
                apVar.append(String.valueOf(i3));
                apVar.append(" of ");
                apVar.append(String.valueOf(size));
                apVar.append("): ");
                Throwable th = (Throwable) list.get(i2);
                if (th instanceof aq) {
                    ((aq) th).e(apVar);
                } else {
                    d(th, apVar);
                }
                i2 = i3;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(com.bumptech.glide.load.o oVar, int i2, Class cls) {
        this.f3039c = oVar;
        this.f3042f = i2;
        this.f3040d = cls;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3041e);
        Class cls = this.f3040d;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        int i2 = this.f3042f;
        sb.append(i2 != 0 ? ", ".concat(com.bumptech.glide.load.n.p(i2)) : "");
        com.bumptech.glide.load.o oVar = this.f3039c;
        sb.append(oVar != null ? ", ".concat(oVar.toString()) : "");
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
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        e(printWriter);
    }

    public aq(String str) {
        this(str, Collections.EMPTY_LIST);
    }
}
