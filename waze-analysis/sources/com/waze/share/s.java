package com.waze.share;

import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.View;
import com.waze.NativeManager;
import com.waze.mywaze.MyWazeNativeManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ResolveInfo f37728a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f37729b;

    s(t tVar, ResolveInfo resolveInfo) {
        this.f37728a = resolveInfo;
        Objects.requireNonNull(tVar);
        this.f37729b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ResolveInfo resolveInfo = this.f37728a;
        NativeManager.Post(new r(this, resolveInfo));
        v vVar = this.f37729b.f37733c.f37735b;
        String string = resolveInfo.activityInfo.loadLabel(vVar.f37741f).toString();
        if (vVar.x()) {
            com.waze.settings.h.c.c().c(h.f37712c, string);
        }
        if (!vVar.w()) {
            vVar.f37740e.addFlags(268435456);
            vVar.f37740e.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            vVar.f37737b.startActivity(vVar.f37740e);
            vVar.dismiss();
            return;
        }
        com.waze.settings.h.c.c().a(h.f37712c, string);
        vVar.f37742g = resolveInfo;
        String strGetLastShareURL = MyWazeNativeManager.getInstance().GetLastShareURL();
        if (TextUtils.isEmpty(strGetLastShareURL)) {
            v.p(vVar);
        } else {
            vVar.v(strGetLastShareURL);
        }
    }
}
