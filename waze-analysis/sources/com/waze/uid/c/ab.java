package com.waze.uid.c;

import android.view.View;
import com.waze.uid.activities.UidFragmentActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be f44193a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44194b;

    public /* synthetic */ ab(be beVar, int i2) {
        this.f44194b = i2;
        this.f44193a = beVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44194b) {
            case 0:
                ac.a((ac) this.f44193a);
                break;
            case 1:
                i.c((i) this.f44193a);
                break;
            case 2:
                ac.b((ac) this.f44193a);
                break;
            case 3:
                this.f44193a.j(new com.waze.uid.state_impl.email.v());
                break;
            case 4:
                be beVar = this.f44193a;
                android.support.v4.app.av activity = beVar.getActivity();
                if (activity != null) {
                    com.waze.ad.a.j.k(activity, com.waze.feedback.f.f23861a, com.waze.feedback.g.f23865a, beVar.i());
                    break;
                }
                break;
            case 5:
                ah.c((ah) this.f44193a);
                break;
            case 6:
                aj.a((aj) this.f44193a);
                break;
            case 7:
                this.f44193a.j(new com.waze.uid.state_impl.username_login.a());
                break;
            case 8:
                be beVar2 = this.f44193a;
                android.support.v4.app.av activity2 = beVar2.getActivity();
                if (activity2 != null) {
                    com.waze.ad.a.j.k(activity2, com.waze.feedback.f.f23861a, com.waze.feedback.g.f23865a, beVar2.i());
                    break;
                }
                break;
            case 9:
                aq.e((aq) this.f44193a);
                break;
            case 10:
                aw.b((aw) this.f44193a);
                break;
            default:
                UidFragmentActivity uidFragmentActivity = ((bf) this.f44193a).f44264c;
                if (uidFragmentActivity != null) {
                    uidFragmentActivity.onBackPressed();
                    break;
                }
                break;
        }
    }
}
