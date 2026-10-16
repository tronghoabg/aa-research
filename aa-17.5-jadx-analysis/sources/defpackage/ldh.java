package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ldh extends mdd {
    public static final /* synthetic */ int e = 0;
    private static final yph f = yph.c("GH.CsatTriggerRcvr");
    public boolean b;
    final /* synthetic */ afec d;
    final /* synthetic */ String c = "CsatPostdriveManager.TriggerReceiver";
    public final Object a = new Object();

    public ldh(afec afecVar) {
        this.d = afecVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky(this.c);
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ConcurrentHashMap concurrentHashMap = lbt.a;
        lbt lbtVarP = lnm.P(intent.getIntExtra("com.google.android.apps.auto.components.feedback.csat.SURVEY_CONTEXT_ID", -1));
        if (lbtVarP == null) {
            throw new IllegalArgumentException("Survey context not provided or invalid");
        }
        ((ype) f.f()).y("Received trigger broadcast for survey %s", lbtVarP.name());
        this.d.invoke(lbtVarP);
    }
}
