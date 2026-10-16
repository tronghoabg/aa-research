package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.feedback.FeedbackEditorActivity;
import com.google.android.projection.gearhead.companion.feedback.FeedbackListActivity;
import com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment;
import java.io.File;

/* loaded from: classes3.dex */
public final /* synthetic */ class xae implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xae(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, xcj] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                ((xaf) this.a).E();
                ((fg) this.b).dismiss();
                break;
            case 1:
                File file = ((lbk) this.b).k;
                FeedbackListActivity feedbackListActivity = ((wzt) this.a).c;
                feedbackListActivity.startActivity(new Intent(feedbackListActivity.getApplicationContext(), (Class<?>) FeedbackEditorActivity.class).setData(Uri.fromFile(file)));
                break;
            case 2:
                ((xaf) this.a).s.u(null);
                ((fg) this.b).dismiss();
                break;
            case 3:
                Object obj = ((xam) this.a).e.a;
                xap xapVar = new xap();
                Bundle bundle = new Bundle();
                xal xalVar = (xal) this.b;
                bundle.putString("vehicleID", xalVar.s.d);
                bundle.putBoolean("isRejected", ((Material3ManageCarsFragment) obj).j.contains(xalVar.s));
                bundle.putInt("vehicleIconResId", xalVar.w);
                xapVar.setArguments(bundle);
                w wVar = new w(((Fragment) obj).getActivity().a());
                wVar.q(R.id.container_settings_display, xapVar, null);
                wVar.n("Material3ManageCarsFragment");
                wVar.i(false, true);
                break;
            case 4:
                boolean zP = this.a.p();
                Object obj2 = this.b;
                if (zP) {
                    ((sei) obj2).b().f("EVENT_ALL_SENSITIVE_PERMISSIONS_GRANTED", null);
                } else {
                    ((sei) obj2).c(yzy.bV);
                    ((xch) obj2).a = true;
                }
                ((sei) this.b).c(yzy.bH);
                break;
            case 5:
                roc.bp((Context) this.b).edit().putBoolean("pref_vanagon_intro_acknowledged", true).apply();
                sei seiVar = (sei) this.a;
                seiVar.b().f("EVENT_VANAGON_MODE_INTRO_TOS_ACCEPTED", null);
                seiVar.c(yzy.bH);
                break;
            case 6:
                Object obj3 = ((adkf) ((xeh) this.a).a.get(((mo) this.b).b())).b;
                if (obj3 != null) {
                    try {
                        mpe.a().i((Intent) obj3);
                        break;
                    } catch (IllegalStateException unused) {
                        ((ype) ((ype) xei.a.g()).ai((char) 10161)).y("Car no longer connected, unable to start %s.", obj3);
                        return;
                    }
                }
                break;
            default:
                ((zwz) this.a).f((zwv) this.b);
                break;
        }
    }

    public xae(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public xae(xch xchVar, xcj xcjVar, int i) {
        this.c = i;
        this.a = xcjVar;
        this.b = xchVar;
    }
}
