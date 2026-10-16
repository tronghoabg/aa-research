package defpackage;

import android.app.Notification;
import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes2.dex */
public final class dth {
    static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable b(Drawable drawable) {
        return drawable instanceof dvs ? ((dvs) drawable).a() : drawable;
    }

    public static final Object c(Object obj, Object obj2) {
        ejz ejzVarA = (ejz) obj;
        ejz ejzVar = (ejz) obj2;
        if (!ejzVar.isEmpty()) {
            if (!ejzVarA.b) {
                ejzVarA = ejzVarA.a();
            }
            ejzVarA.b();
            if (!ejzVar.isEmpty()) {
                ejzVarA.putAll(ejzVar);
            }
        }
        return ejzVarA;
    }

    public static final Object d() {
        return ejz.a.a();
    }

    public static ejm e(Object obj, long j) {
        return (ejm) elf.f(obj, j);
    }

    public static final List f(Object obj, long j) {
        ejm ejmVarE = e(obj, j);
        if (ejmVarE.c()) {
            return ejmVarE;
        }
        int size = ejmVarE.size();
        ejm ejmVarD = ejmVarE.d(size == 0 ? 10 : size + size);
        elf.r(obj, j, ejmVarD);
        return ejmVarD;
    }

    public static final fgp g(Object obj) {
        return (fgp) ((erb) obj).a;
    }
}
