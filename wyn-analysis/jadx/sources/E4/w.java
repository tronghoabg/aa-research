package E4;

import A7.AbstractC0279p0;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f2994f = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    public final List f2995a;

    /* renamed from: b, reason: collision with root package name */
    public B4.d f2996b;

    /* renamed from: c, reason: collision with root package name */
    public int f2997c;

    /* renamed from: d, reason: collision with root package name */
    public Class f2998d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2999e;

    public w(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof w)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((w) th).f2995a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, v vVar) throws IOException {
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            vVar.append("Cause (");
            int i10 = i5 + 1;
            vVar.append(String.valueOf(i10));
            vVar.append(" of ");
            vVar.append(String.valueOf(size));
            vVar.append("): ");
            Throwable th = (Throwable) list.get(i5);
            if (th instanceof w) {
                ((w) th).e(vVar);
            } else {
                c(th, vVar);
            }
            i5 = i10;
        }
    }

    public static void c(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i10 = i5 + 1;
            sb2.append(i10);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i5));
            i5 = i10;
        }
    }

    public final void e(Appendable appendable) throws IOException {
        c(this, appendable);
        try {
            b(this.f2995a, new v(appendable));
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f2999e);
        String str2 = "";
        if (this.f2998d != null) {
            str = ", " + this.f2998d;
        } else {
            str = "";
        }
        sb2.append(str);
        int i5 = this.f2997c;
        sb2.append(i5 != 0 ? ", ".concat(AbstractC0279p0.y(i5)) : "");
        if (this.f2996b != null) {
            str2 = ", " + this.f2996b;
        }
        sb2.append(str2);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        e(System.err);
    }

    public w(String str, List list) {
        this.f2999e = str;
        setStackTrace(f2994f);
        this.f2995a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
