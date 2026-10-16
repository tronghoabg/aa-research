package defpackage;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qml extends qmf {
    public final qmk a;
    public qnb c;
    private final qmv d;
    private final ajzn e;

    protected qml(qmh qmhVar) {
        super(qmhVar);
        this.e = new ajzn((byte[]) null);
        this.a = new qmk(this);
        this.d = new qmj(this, qmhVar);
    }

    private final void x() {
        qmd qmdVarH = h();
        qmdVarH.s();
        qlk.b();
        qmdVarH.a.x();
    }

    public final void a() {
        qlk.b();
        s();
        try {
            spi.a().b(f(), this.a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.c != null) {
            this.c = null;
            x();
        }
    }

    public final void c() {
        qlk.b();
        if (v()) {
            super.p(2, "Inactivity, disconnecting from device AnalyticsService", null, null, null);
            a();
        }
    }

    public final void d(ComponentName componentName) {
        qlk.b();
        if (this.c != null) {
            this.c = null;
            super.p(2, "Disconnected from device AnalyticsService", componentName, null, null);
            x();
        }
    }

    public final void e() {
        this.e.d();
        j();
        this.d.d(((Long) qmy.A.f()).longValue());
    }

    public final boolean v() {
        qlk.b();
        s();
        return this.c != null;
    }

    public final boolean w(qna qnaVar) {
        String strJ;
        spu.aw(qnaVar);
        qlk.b();
        s();
        qnb qnbVar = this.c;
        if (qnbVar == null) {
            return false;
        }
        if (qnaVar.f) {
            j();
            strJ = qmu.h();
        } else {
            j();
            strJ = qmu.j();
        }
        List list = Collections.EMPTY_LIST;
        try {
            Map map = qnaVar.a;
            long j = qnaVar.d;
            Parcel parcelGh = qnbVar.gh();
            parcelGh.writeMap(map);
            parcelGh.writeLong(j);
            parcelGh.writeString(strJ);
            parcelGh.writeTypedList(list);
            qnbVar.gj(1, parcelGh);
            e();
            return true;
        } catch (RemoteException unused) {
            super.p(2, "Failed to send hits to AnalyticsService", null, null, null);
            return false;
        }
    }

    @Override // defpackage.qmf
    protected final void b() {
    }
}
