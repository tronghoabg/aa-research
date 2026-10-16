package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import ef.C2527k;
import ff.AbstractC2640A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f31038a = new LinkedHashMap();

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d button) {
        AbstractC3340k.e(button, "button");
        this.f31038a.put(button.f32413a, button);
    }

    public final ArrayList b() {
        List listW = AbstractC2640A.W(this.f31038a);
        ArrayList arrayList = new ArrayList(ff.p.a0(listW, 10));
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) ((C2527k) it.next()).f34672b);
        }
        return arrayList;
    }
}
