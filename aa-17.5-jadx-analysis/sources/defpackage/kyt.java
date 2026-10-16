package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class kyt implements zge {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ osv f;
    final /* synthetic */ kyw g;

    public kyt(kyw kywVar, String str, String str2, String str3, String str4, String str5, osv osvVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = osvVar;
        this.g = kywVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        ((ype) ((ype) ((ype) kyw.a.g()).p(th)).ai((char) 3564)).u("Locale retrieval failed");
        lah.a();
        lah.e(ywj.LOCALE_RETRIEVAL_FAILED, null);
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
        kyw kywVar = this.g;
        Resources resourcesQ = kywVar.Q((String) obj);
        String str = this.a;
        String string = resourcesQ.getString(R.string.messaging_compose_via_app, str);
        if (kywVar.J()) {
            String str2 = this.b;
            if (!TextUtils.isEmpty(str2)) {
                string = resourcesQ.getString(R.string.messaging_compose_via_app_with_contact_name, str2, str);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_SEND_A_MESSAGE_TO_CONTACT_QUERY", true);
        bundle.putString("SEND_A_MESSAGE_APP_NAME", str);
        bundle.putString("SEND_A_MESSAGE_RECIPIENT_APP_UNIQUE_ID", this.c);
        bundle.putString("SEND_A_MESSAGE_RECIPIENT_NAME", this.b);
        bundle.putString("SEND_A_MESSAGE_APP_PACKAGE_NAME", this.d);
        bundle.putString("SEND_A_MESSAGE_APP_MIMETYPE", this.e);
        bundle.putInt("DIRECT_QUERY_TRIGGER_ID", this.f.C);
        kywVar.Y(string, bundle);
    }
}
