package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ajif implements Closeable {
    public final ajid a;
    public final ajib b;
    public final String c;
    public final int d;
    public final ajhu e;
    public final ajhv f;
    public final ajih g;
    public final ajob h;
    public final ajif i;
    public final ajif j;
    public final long k;
    public final long l;
    public final ajik m;
    public ajhg n;
    public final boolean o;
    public final scz p;

    public ajif(ajid ajidVar, ajib ajibVar, String str, int i, ajhu ajhuVar, ajhv ajhvVar, ajih ajihVar, ajob ajobVar, ajif ajifVar, ajif ajifVar2, long j, long j2, scz sczVar, ajik ajikVar) {
        ajihVar.getClass();
        ajikVar.getClass();
        this.a = ajidVar;
        this.b = ajibVar;
        this.c = str;
        this.d = i;
        this.e = ajhuVar;
        this.f = ajhvVar;
        this.g = ajihVar;
        this.h = ajobVar;
        this.i = ajifVar;
        this.j = ajifVar2;
        this.k = j;
        this.l = j2;
        this.p = sczVar;
        this.m = ajikVar;
        boolean z = false;
        if (i >= 200 && i < 300) {
            z = true;
        }
        this.o = z;
    }

    public final String a(String str) {
        String strB = this.f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}
