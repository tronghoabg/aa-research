package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class ajih implements Closeable {
    public static final ajih c;

    static {
        ajnb ajnbVar = ajnb.a;
        ajmy ajmyVar = new ajmy();
        ajmyVar.K(ajnbVar);
        c = new ajig(ajnbVar.c(), ajmyVar);
    }

    public abstract long a();

    public abstract ajhz b();

    public abstract ajna c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ajna ajnaVarC = c();
        int i = ajiq.a;
        a.e(ajnaVarC);
    }
}
