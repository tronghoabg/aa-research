package com.waze.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ar;
import android.view.View;
import com.waze.NativeManager;
import com.waze.config.cv;
import com.waze.iu;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.reports.SosProvider;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.navigate.AddressItem;
import com.waze.planned_drive.ay;
import com.waze.reports.SosProvidersListActivity;
import com.waze.reports.di;
import com.waze.settings.ds;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.web.at;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13655b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13656c;

    public /* synthetic */ y(Object obj, Object obj2, int i2) {
        this.f13656c = i2;
        this.f13654a = obj;
        this.f13655b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.waze.parking.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [com.waze.reports_v2.d.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [h.g.a.l, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13656c) {
            case 0:
                this.f13654a.invoke(o.f13646a);
                this.f13655b.invoke();
                break;
            case 1:
                this.f13654a.invoke(n.f13645a);
                this.f13655b.invoke();
                break;
            case 2:
                com.waze.ab.l.h((com.waze.ab.l) this.f13655b, (OvalButton) this.f13654a);
                break;
            case 3:
                com.waze.ab.l.f((com.waze.ab.l) this.f13655b, (OvalButton) this.f13654a);
                break;
            case 4:
                com.waze.ab.l.e((com.waze.ab.l) this.f13655b, (OvalButton) this.f13654a);
                break;
            case 5:
                com.waze.ab.s.g((com.waze.ab.s) this.f13655b, this.f13654a);
                break;
            case 6:
                com.waze.ab.s.f((com.waze.ab.s) this.f13655b, this.f13654a);
                break;
            case 7:
                com.waze.main.navigate.i.b((com.waze.main.navigate.i) this.f13654a, (NavigationItem) this.f13655b);
                break;
            case 8:
                com.waze.main.navigate.j.b((com.waze.main.navigate.j) this.f13654a, (RtAlertItem) this.f13655b);
                break;
            case 9:
                com.waze.navbar.p.F((com.waze.navbar.p) this.f13655b, this.f13654a);
                break;
            case 10:
                ay.u((ay) this.f13654a, (AddressItem) this.f13655b);
                break;
            case 11:
                Object obj = this.f13654a;
                com.waze.menus.g.a(((ar) obj).requireContext(), (AddressItem) this.f13655b, (com.waze.menus.d) obj);
                break;
            case 12:
                di.Q((di) this.f13655b, this.f13654a);
                break;
            case 13:
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:".concat(String.valueOf(((SosProvider) this.f13655b).getPhoneCall()))));
                intent.setFlags(268435456);
                ((SosProvidersListActivity) this.f13654a).startActivity(intent);
                break;
            case 14:
                at.f((Context) this.f13654a, ((SosProvider) this.f13655b).getUrl());
                break;
            case 15:
                SosProvidersListActivity.n((SosProvidersListActivity) this.f13654a, (SosProvider) this.f13655b);
                break;
            case 16:
                SosProvidersListActivity.m((SosProvidersListActivity) this.f13654a, (SosProvider) this.f13655b);
                break;
            case 17:
                com.waze.search.v2.o.g((com.waze.settings.tree.f) this.f13654a, this.f13655b);
                NativeManager nativeManager = NativeManager.getInstance();
                h.g.b.x.e(nativeManager, "getInstance(...)");
                iu.DeleteAccount$default(nativeManager, null, 1, null);
                break;
            case 18:
                ((ds) this.f13655b).aa(new cv(this.f13654a, 17));
                break;
            case 19:
                Object obj2 = this.f13654a;
                Object obj3 = this.f13655b;
                ((Activity) obj3).startActivityForResult(new Intent((Context) obj3, (Class<?>) obj2), 1000);
                break;
            default:
                com.waze.settings.tree.f fVar = (com.waze.settings.tree.f) this.f13654a;
                ?? r2 = this.f13655b;
                com.waze.search.v2.o.g(fVar, r2);
                r2.a().c(fVar.q(), fVar.r());
                break;
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f13656c = i2;
        this.f13655b = obj;
        this.f13654a = obj2;
    }
}
