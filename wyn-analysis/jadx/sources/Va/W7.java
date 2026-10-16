package Va;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* loaded from: classes4.dex */
public final class W7 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1126r8 f13815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1203x8 f13816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1214y7 f13817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f13818e;

    public W7(C1214y7 c1214y7, C1126r8 c1126r8, C1203x8 c1203x8, List list, boolean z2) {
        this.f13814a = z2;
        this.f13815b = c1126r8;
        this.f13816c = c1203x8;
        this.f13817d = c1214y7;
        this.f13818e = list;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f13814a) {
            this.f13815b.c(this.f13816c, this.f13817d, E7.N1(this.f13818e, new Object[]{this, context, intent}));
            return;
        }
        Da da2 = new Da(17);
        da2.f13291f = this;
        da2.f13290e = context;
        da2.f13289d = intent;
        Cb.j(da2);
    }
}
