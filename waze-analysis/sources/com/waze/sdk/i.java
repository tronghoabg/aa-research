package com.waze.sdk;

import android.view.View;
import android.widget.LinearLayout;
import com.waze.R;
import com.waze.settings.de;
import com.waze.settings.fu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35387c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f35388d;

    public /* synthetic */ i(com.waze.reports.ax axVar, String str, LinearLayout linearLayout, int i2) {
        this.f35388d = i2;
        this.f35386b = axVar;
        this.f35387c = str;
        this.f35385a = linearLayout;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NoSuchMethodException, SecurityException {
        int i2 = this.f35388d;
        if (i2 == 0) {
            Object obj = this.f35387c;
            ae.U((ae) this.f35385a, (bl) this.f35386b, (String) obj);
            return;
        }
        if (i2 == 1) {
            Object obj2 = this.f35385a;
            com.waze.reports.ax.J((com.waze.reports.ax) this.f35386b, (String) this.f35387c, (LinearLayout) obj2);
        } else {
            if (i2 == 2) {
                Object obj3 = this.f35387c;
                ae.ad((ae) this.f35385a, (bl) this.f35386b, (String) obj3);
                return;
            }
            com.waze.search.v2.o.g((com.waze.settings.tree.f) this.f35386b, this.f35385a);
            com.waze.ab.o oVar = new com.waze.ab.o();
            ?? r4 = this.f35387c;
            oVar.Q(r4.c(R.string.CALENDAR_SETTINGS_CLEAR, new Object[0]));
            oVar.P(r4.c(R.string.ARE_YOU_SURE_Q, new Object[0]));
            oVar.f13808a = new com.waze.navigate.f(r4, view, 5);
            oVar.M(r4.c(R.string.CALENDAR_SETTINGS_CLEAR_CONFIRM, new Object[0]));
            oVar.N(r4.c(R.string.CANCEL, new Object[0]));
            com.waze.z.a.d.ai.q(oVar);
        }
    }

    public /* synthetic */ i(ae aeVar, bl blVar, String str, int i2) {
        this.f35388d = i2;
        this.f35385a = aeVar;
        this.f35386b = blVar;
        this.f35387c = str;
    }

    public /* synthetic */ i(fu fuVar, de deVar, com.waze.shared_infra.o.a aVar, int i2) {
        this.f35388d = i2;
        this.f35386b = fuVar;
        this.f35385a = deVar;
        this.f35387c = aVar;
    }
}
