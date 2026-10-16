package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper;
import com.google.android.projection.gearhead.R;
import java.util.Date;

/* loaded from: classes2.dex */
final class qid extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ Bundle d;

    public qid(Context context, String str, String str2, Bundle bundle) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:148|73|(5:(1:75)(2:76|(1:78)(11:160|80|(1:82)|86|(8:155|88|133|89|138|90|91|92)|132|108|142|109|110|121))|142|109|110|121)|79|(0)|132|108) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ba, code lost:
    
        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) defpackage.qie.a.g()).p(r0)).ai(7316)).u("IO error copying streams");
        r7.a("IO error copying streams");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3 A[Catch: all -> 0x02d0, TryCatch #11 {all -> 0x02d0, blocks: (B:73:0x019f, B:75:0x01a5, B:88:0x0212, B:92:0x0268, B:106:0x029f, B:107:0x02a2, B:108:0x02a3, B:110:0x02aa, B:120:0x02ba, B:118:0x02b8, B:117:0x02b5, B:76:0x01b3, B:78:0x01b7, B:80:0x01c0, B:82:0x01e4, B:84:0x01e9, B:85:0x01fc, B:89:0x0224, B:91:0x024e, B:100:0x0276, B:99:0x0273, B:104:0x027a), top: B:148:0x019f, inners: #0, #16, #20 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qid.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Context context = this.a;
        dsx dsxVarA = FeedbackNotificationHelper.a(context, qie.b(), R.string.feedback_notification_title, R.string.feedback_notification_text);
        dsxVarA.i(context.getString(R.string.feedback_notification_title, DateFormat.getTimeFormat(context).format(new Date())));
        dsxVarA.n(2131233246);
        new dug(context).b(null, R.id.user_feedback_notification_id, dsxVarA.a());
    }
}
