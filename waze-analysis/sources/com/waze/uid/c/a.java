package com.waze.uid.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be f44187a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44188b;

    public /* synthetic */ a(be beVar, int i2) {
        this.f44188b = i2;
        this.f44187a = beVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        android.support.v4.app.av activity;
        PackageManager packageManager;
        switch (this.f44188b) {
            case 0:
                be beVar = this.f44187a;
                Context contextRequireContext = beVar.requireContext();
                h.g.b.x.e(contextRequireContext, "requireContext(...)");
                beVar.j(new com.waze.uid.state_impl.add_id.y(contextRequireContext));
                break;
            case 1:
                be beVar2 = this.f44187a;
                Context contextRequireContext2 = beVar2.requireContext();
                h.g.b.x.e(contextRequireContext2, "requireContext(...)");
                beVar2.j(new com.waze.uid.state_impl.add_id.l(contextRequireContext2));
                break;
            case 2:
                this.f44187a.j(new com.waze.uid.b.c());
                break;
            case 3:
                this.f44187a.j(new com.waze.uid.b.p());
                break;
            case 4:
                com.waze.uid.state_impl.email.u uVar = new com.waze.uid.state_impl.email.u();
                be beVar3 = this.f44187a;
                beVar3.j(uVar);
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.APP_EMAIL");
                intent.addFlags(268435456);
                Context context = beVar3.getContext();
                if (((context == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.resolveActivity(intent, 0)) == null) {
                    intent = null;
                }
                if (intent != null && (activity = beVar3.getActivity()) != null) {
                    activity.startActivity(intent);
                }
                break;
            case 5:
                this.f44187a.j(new com.waze.uid.b.p());
                break;
            case 6:
                this.f44187a.j(new com.waze.uid.b.c());
                break;
            case 7:
                this.f44187a.j(new com.waze.uid.state_impl.email.v());
                break;
            case 8:
                be beVar4 = this.f44187a;
                android.support.v4.app.av activity2 = beVar4.getActivity();
                if (activity2 != null) {
                    com.waze.ad.a.j.k(activity2, com.waze.feedback.f.f23861a, com.waze.feedback.g.f23865a, beVar4.i());
                }
                break;
            case 9:
                this.f44187a.j(new com.waze.uid.state_impl.username_login.a());
                break;
            case 10:
                be beVar5 = this.f44187a;
                android.support.v4.app.av activity3 = beVar5.getActivity();
                if (activity3 != null) {
                    com.waze.ad.a.j.k(activity3, com.waze.feedback.f.f23861a, com.waze.feedback.g.f23865a, beVar5.i());
                }
                break;
            case 11:
                this.f44187a.j(new com.waze.uid.state_impl.a.b());
                break;
            default:
                this.f44187a.j(new com.waze.uid.state_impl.a.c());
                break;
        }
        return h.ab.f48028a;
    }
}
