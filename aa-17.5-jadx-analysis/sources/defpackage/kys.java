package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import java.util.List;

/* loaded from: classes2.dex */
final class kys implements zge {
    final /* synthetic */ int a;
    final /* synthetic */ List b;
    final /* synthetic */ Optional c;
    final /* synthetic */ Optional d;
    final /* synthetic */ kyw e;

    public kys(kyw kywVar, int i, List list, Optional optional, Optional optional2) {
        this.a = i;
        this.b = list;
        this.c = optional;
        this.d = optional2;
        this.e = kywVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        ((ype) ((ype) ((ype) kyw.a.g()).p(th)).ai((char) 3562)).u("Locale retrieval failed");
        lah.a();
        lah.e(ywj.LOCALE_RETRIEVAL_FAILED, null);
    }

    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
        kyw kywVar = this.e;
        Resources resourcesQ = kywVar.Q((String) obj);
        List list = this.b;
        int i = this.a;
        String string = resourcesQ.getString(i, list.toArray());
        Bundle bundle = new Bundle();
        this.c.isPresent();
        jfz jfzVar = new jfz(bundle, 11);
        Optional optional = this.d;
        if (true == optional.isPresent()) {
            ((Bundle) jfzVar.a).putInt("DIRECT_QUERY_TRIGGER_ID", ((osv) optional.get()).C);
        }
        bundle.putBoolean("IS_SEND_FEEDBACK_QUERY", i == R.string.voice_assistant_save_feedback_query);
        bundle.putBoolean("IS_MAKE_A_CALL_QUERY", i == R.string.assistant_query_make_a_call);
        kywVar.Y(string, bundle);
    }
}
