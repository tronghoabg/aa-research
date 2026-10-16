package defpackage;

import android.service.notification.StatusBarNotification;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class mbn {
    public StatusBarNotification a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public mbn(StatusBarNotification statusBarNotification) {
        this.a = statusBarNotification;
    }

    public final synchronized mbo a(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        mbo mboVarB;
        mboVarB = b();
        jfz jfzVar = new jfz(this, 12);
        if (true == optional.isPresent()) {
            ((mbn) jfzVar.a).a = (StatusBarNotification) optional.get();
        }
        jfz jfzVar2 = new jfz(this, 13);
        if (true == optional2.isPresent()) {
            ((mbn) jfzVar2.a).b = ((Boolean) optional2.get()).booleanValue();
        }
        jfz jfzVar3 = new jfz(this, 14);
        if (true == optional3.isPresent()) {
            ((mbn) jfzVar3.a).c = ((Boolean) optional3.get()).booleanValue();
        }
        jfz jfzVar4 = new jfz(this, 15);
        if (true == optional4.isPresent()) {
            Object obj = optional4.get();
            Object obj2 = jfzVar4.a;
            ((Boolean) obj).booleanValue();
            ((mbn) obj2).d = true;
        }
        jfz jfzVar5 = new jfz(this, 16);
        if (true == optional5.isPresent()) {
            Object obj3 = optional5.get();
            Object obj4 = jfzVar5.a;
            ((Boolean) obj3).booleanValue();
            ((mbn) obj4).e = true;
        }
        return mboVarB;
    }

    public final synchronized mbo b() {
        return new mbo(this.a, this.b, this.c, this.d, this.e);
    }
}
