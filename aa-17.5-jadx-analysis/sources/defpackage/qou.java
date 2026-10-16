package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class qou extends sla implements sle {
    private static final rju a;
    private static final omc l;

    static {
        qor qorVar = new qor();
        l = qorVar;
        a = new rju("GoogleAuth.API", qorVar);
    }

    public qou(Context context) {
        super(context, null, a, sku.c, skz.a);
    }

    public static final void c(Status status, Object obj, nok nokVar) {
        if (status.c()) {
            nokVar.c(obj);
        } else if (e(status)) {
            nokVar.b(new IOException(status.a()));
        } else {
            nokVar.b(status.h == null ? new qok(status) : new qom(status));
        }
    }

    public static final void d(Status status, Object obj, nok nokVar) {
        if (status.c()) {
            nokVar.c(obj);
        } else if (e(status)) {
            nokVar.b(new IOException(status.a()));
        } else {
            PendingIntent pendingIntent = status.h;
            nokVar.b(pendingIntent == null ? new qoe(status.a()) : UserRecoverableAuthException.a(status.a(), roc.bc(pendingIntent)));
        }
    }

    private static final boolean e(Status status) {
        switch (status.f) {
            case 8:
            case 49500:
            case 49508:
            case 49528:
            case 49531:
                return true;
            default:
                return false;
        }
    }

    public final svz a(GetAccountsRequest getAccountsRequest) {
        snb snbVar = new snb();
        snbVar.b = new Feature[]{qoc.b};
        snbVar.a = new qoq(this, getAccountsRequest, 1);
        snbVar.c = 1676;
        return super.u(0, snbVar.a());
    }

    public final svz b(GetTokenRequest getTokenRequest) {
        snb snbVar = new snb();
        snbVar.b = new Feature[]{new Feature("google_auth_api", -1, 1L, false)};
        snbVar.a = new qoq(this, getTokenRequest, 0);
        snbVar.c = 1680;
        return super.u(0, snbVar.a());
    }
}
