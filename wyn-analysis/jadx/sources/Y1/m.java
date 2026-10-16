package Y1;

import N1.C0765n;
import Q1.x;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final C0765n f16358a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3409K f16359b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16360c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16361d;

    /* renamed from: e, reason: collision with root package name */
    public final j f16362e;

    public m(C0765n c0765n, AbstractC3409K abstractC3409K, s sVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        Q1.k.c(!abstractC3409K.isEmpty());
        this.f16358a = c0765n;
        this.f16359b = AbstractC3409K.j(abstractC3409K);
        this.f16361d = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.f16362e = sVar.a(this);
        int i5 = x.f9724a;
        this.f16360c = x.S(sVar.f16378c, 1000000L, sVar.f16377b, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract X1.g c();

    public abstract j d();
}
