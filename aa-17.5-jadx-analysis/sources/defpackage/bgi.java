package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class bgi implements afej {
    private final /* synthetic */ int a;

    public /* synthetic */ bgi(int i) {
        this.a = i;
    }

    @Override // defpackage.afej
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        if (i == 0) {
            return bgj.a((bfy) obj, (bho) obj2, (afdr) obj3, (bux) obj4, ((Integer) obj5).intValue());
        }
        if (i != 1) {
            return bgj.a((bfy) obj, (bho) obj2, (afdr) obj3, (bux) obj4, ((Integer) obj5).intValue());
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        long j = ((dfv) obj5).b;
        String string = ((CharSequence) obj4).subSequence(dfv.d(j), dfv.c(j)).toString();
        Intent className = bfq.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        className.putExtra("android.intent.extra.PROCESS_TEXT", string);
        ((Context) obj).startActivity(className);
        return afak.a;
    }
}
