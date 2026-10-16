package com.waze.av.b;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface v extends com.waze.places.a.c {
    void A(k kVar, h.g.a.a aVar, h.g.a.a aVar2);

    void B(Context context, k kVar, h.g.a.a aVar, h.g.a.a aVar2);

    com.waze.app_nav.p D(n nVar);

    void E(n nVar, boolean z, com.waze.modules.navigation.ah ahVar);

    void F(Context context, n nVar);

    Intent g(Context context, n nVar);

    Intent h(Context context, n nVar);

    Intent i(n nVar, Context context);

    Intent j(Context context, n nVar, com.waze.j.n nVar2, boolean z, com.waze.modules.navigation.ah ahVar);

    Intent k(Context context, n nVar, boolean z);

    Intent l(Context context, n nVar);

    com.waze.share.v m(com.waze.ifs.ui.a aVar, n nVar);

    void o(Context context, n nVar);

    void p(Context context, n nVar);

    void q(Context context, ActivityResultLauncher activityResultLauncher, n nVar);

    void r(n nVar);

    void s(n nVar, h.g.a.a aVar, h.g.a.a aVar2);

    void w();

    void x(Context context, n nVar);

    void y(n nVar);
}
