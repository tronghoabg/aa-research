package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class qng {
    public final long a;
    final /* synthetic */ qnh b;
    private final String c;

    public qng(qnh qnhVar, long j) {
        this.b = qnhVar;
        spu.at("monitoring");
        spu.am(j > 0);
        this.c = "monitoring";
        this.a = j;
    }

    private final String e() {
        return this.c.concat(":start");
    }

    public final long a() {
        return this.b.a.getLong(e(), 0L);
    }

    public final String b() {
        return this.c.concat(":count");
    }

    protected final String c() {
        return this.c.concat(":value");
    }

    public final void d() {
        qnh qnhVar = this.b;
        qnhVar.q();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = qnhVar.a.edit();
        editorEdit.remove(b());
        editorEdit.remove(c());
        editorEdit.putLong(e(), jCurrentTimeMillis);
        editorEdit.commit();
    }
}
