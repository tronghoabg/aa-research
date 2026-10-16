package defpackage;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;

/* loaded from: classes.dex */
public final class lwg {
    private final mbp a;
    private final ohs b;
    private final Context c;

    static {
        yph.c("GH.MsgPiMgr");
    }

    public lwg(Context context, ohs ohsVar, mbp mbpVar) {
        this.b = ohsVar;
        this.a = mbpVar;
        this.c = context;
    }

    public static lwg a() {
        return (lwg) mki.a.i(lwg.class);
    }

    private static final void d(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        try {
            pendingIntent.send();
            Log.v("GH.MsgPiMgr", "#send called on mark-as-read PendingIntent");
        } catch (PendingIntent.CanceledException e) {
            Log.w("GH.MsgPiMgr", "Failed to send mark-as-read PendingIntent", e);
        }
    }

    private final void e(PendingIntent pendingIntent, dum dumVar, String str) throws PendingIntent.CanceledException {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(dumVar.a, str);
        Intent intent = new Intent();
        RemoteInput.addResultsToIntent(dum.a(new dum[]{dumVar}), intent, bundle);
        try {
            pendingIntent.send(this.c, 0, intent);
            Log.d("GH.MsgPiMgr", "#send called on reply PendingIntent");
        } catch (PendingIntent.CanceledException e) {
            Log.w("GH.MsgPiMgr", "Failed to send reply to SBN", e);
        }
    }

    @ResultIgnorabilityUnspecified
    public final void b(String str) {
        mbn mbnVarA = this.a.a(str);
        if (mbnVarA == null) {
            lxr.e();
            lxr.j(yzz.MESSAGING, yzy.nD, yyv.MESSAGING_MARK_AS_READ_SBN_NOT_FOUND_RACE_CONDITION, null);
            return;
        }
        mbo mboVarA = mbnVarA.a(Optional.empty(), Optional.of(true), Optional.empty(), Optional.of(true), Optional.empty());
        StatusBarNotification statusBarNotification = mboVarA.a;
        String packageName = statusBarNotification.getPackageName();
        ComponentName componentName = new ComponentName(packageName, "");
        if (mboVarA.b) {
            ohs ohsVar = this.b;
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MESSAGING, yzy.mB);
            rrbVarH.p(componentName);
            ohsVar.F(rrbVarH.l());
        }
        if (mboVarA.d) {
            ohs ohsVar2 = this.b;
            rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.MESSAGING, yzy.mD);
            rrbVarH2.p(componentName);
            ohsVar2.F(rrbVarH2.l());
        }
        lwd lwdVar = new lwd(statusBarNotification, false);
        if (lwdVar.k()) {
            lxr.e();
            lxr.j(yzz.MESSAGING, yzy.nC, yyv.MESSAGING_MARK_AS_READ_USING_NOTIFICATION_ACTION, packageName);
        } else if (lwdVar.e != null) {
            lxr.e();
            lxr.j(yzz.MESSAGING, yzy.nB, yyv.MESSAGING_MARK_AS_READ_USING_CAR_EXTENDER, packageName);
        }
        dst dstVarC = lwdVar.c();
        dstVarC.getClass();
        PendingIntent pendingIntent = dstVarC.k;
        pendingIntent.getClass();
        d(pendingIntent);
    }

    @ResultIgnorabilityUnspecified
    public final void c(String str, String str2) {
        mbn mbnVarA = this.a.a(str);
        if (mbnVarA == null) {
            lxr.e();
            lxr.j(yzz.MESSAGING, yzy.nA, yyv.MESSAGING_REPLY_SBN_NOT_FOUND_RACE_CONDITION, null);
            return;
        }
        mbo mboVarA = mbnVarA.a(Optional.empty(), Optional.empty(), Optional.of(true), Optional.empty(), Optional.of(true));
        StatusBarNotification statusBarNotification = mboVarA.a;
        String packageName = statusBarNotification.getPackageName();
        ComponentName componentName = new ComponentName(packageName, "");
        if (mboVarA.c) {
            ohs ohsVar = this.b;
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MESSAGING, yzy.mC);
            rrbVarH.p(componentName);
            ohsVar.F(rrbVarH.l());
        }
        if (mboVarA.e) {
            ohs ohsVar2 = this.b;
            rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.MESSAGING, yzy.mE);
            rrbVarH2.p(componentName);
            ohsVar2.F(rrbVarH2.l());
        }
        lwd lwdVar = new lwd(statusBarNotification, false);
        if (lwdVar.l()) {
            lxr.e();
            lxr.j(yzz.MESSAGING, yzy.nz, yyv.MESSAGING_REPLY_USING_NOTIFICATION_ACTION, packageName);
        } else if (lwdVar.e != null) {
            lxr.e();
            lxr.j(yzz.MESSAGING, yzy.ny, yyv.MESSAGING_REPLY_USING_CAR_EXTENDER, packageName);
        }
        dst dstVarD = lwdVar.d();
        dstVarD.getClass();
        PendingIntent pendingIntent = dstVarD.k;
        pendingIntent.getClass();
        dum[] dumVarArr = dstVarD.b;
        dumVarArr.getClass();
        e(pendingIntent, dumVarArr[0], str2);
    }
}
