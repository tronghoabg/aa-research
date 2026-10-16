package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class noa extends FrameLayout {
    final /* synthetic */ noc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noa(noc nocVar, Context context) {
        super(context);
        this.a = nocVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        noc nocVar = this.a;
        if (nocVar.e) {
            ((ype) noc.a.l().ai(5302)).y("dispatchConfigurationChanged(): %s dropped as Fragment was already finished", nocVar.h);
        } else {
            ((ype) noc.a.l().ai(5301)).y("dispatchConfigurationChanged(): %s", nocVar.h);
            ((bg) nocVar.j.a).e.t(configuration, true);
        }
    }
}
