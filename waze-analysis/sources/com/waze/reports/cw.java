package com.waze.reports;

import android.content.DialogInterface;
import android.widget.TextView;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cw implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33816b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33817c;

    public /* synthetic */ cw(di diVar, TextView textView, int i2) {
        this.f33817c = i2;
        this.f33815a = diVar;
        this.f33816b = textView;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [h.g.a.a, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = this.f33817c;
        if (i3 == 0) {
            di.z((di) this.f33815a, (TextView) this.f33816b, dialogInterface, i2);
            return;
        }
        if (i3 == 1) {
            EditPlaceFlowActivity.J((EditPlaceFlowActivity) this.f33816b, (int[]) this.f33815a, i2);
            return;
        }
        if (i3 == 2) {
            ((com.waze.uid.activities.b) this.f33816b).g(com.waze.uid.stats.h.f44748d);
            this.f33815a.invoke(InstallParameters.Community.GOOGLE);
            return;
        }
        Object obj = this.f33816b;
        if (i3 != 3) {
            ((com.waze.uid.activities.b) obj).g(com.waze.uid.stats.h.f44747c);
            this.f33815a.invoke();
        } else {
            ((com.waze.uid.activities.b) obj).g(com.waze.uid.stats.h.f44746b);
            this.f33815a.invoke(InstallParameters.Community.EMAIL);
        }
    }

    public /* synthetic */ cw(Object obj, Object obj2, int i2) {
        this.f33817c = i2;
        this.f33816b = obj;
        this.f33815a = obj2;
    }
}
