package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class qnh extends qmf {
    public SharedPreferences a;
    public final qng c;
    private long d;
    private long e;

    protected qnh(qmh qmhVar) {
        super(qmhVar);
        this.e = -1L;
        j();
        this.c = new qng(this, ((Long) qmy.D.f()).longValue());
    }

    @ResultIgnorabilityUnspecified
    public final long a() {
        qnh qnhVar;
        qlk.b();
        s();
        long j = this.d;
        if (j != 0) {
            return j;
        }
        long j2 = this.a.getLong("first_run", 0L);
        if (j2 != 0) {
            this.d = j2;
            return j2;
        }
        q();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong("first_run", jCurrentTimeMillis);
        if (editorEdit.commit()) {
            qnhVar = this;
        } else {
            qnhVar = this;
            super.p(5, "Failed to commit first run time", null, null, null);
        }
        qnhVar.d = jCurrentTimeMillis;
        return jCurrentTimeMillis;
    }

    @Override // defpackage.qmf
    protected final void b() {
        this.a = f().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long c() {
        qlk.b();
        s();
        long j = this.e;
        if (j != -1) {
            return j;
        }
        long j2 = this.a.getLong("last_dispatch", 0L);
        this.e = j2;
        return j2;
    }

    public final String d() {
        qlk.b();
        s();
        String string = this.a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void e(String str) {
        qlk.b();
        s();
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (TextUtils.isEmpty(str)) {
            editorEdit.remove("installation_campaign");
        } else {
            editorEdit.putString("installation_campaign", str);
        }
        if (editorEdit.commit()) {
            return;
        }
        super.p(5, "Failed to commit campaign data", null, null, null);
    }

    public final void v() {
        qlk.b();
        s();
        q();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong("last_dispatch", jCurrentTimeMillis);
        editorEdit.apply();
        this.e = jCurrentTimeMillis;
    }

    public final ajzn w() {
        q();
        return new ajzn(a());
    }
}
