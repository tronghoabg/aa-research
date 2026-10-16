package androidx.activity;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final o f17741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f17742b;

    public v(w wVar, o onBackPressedCallback) {
        AbstractC3340k.e(onBackPressedCallback, "onBackPressedCallback");
        this.f17742b = wVar;
        this.f17741a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.i, tf.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        w wVar = this.f17742b;
        ff.l lVar = wVar.f17744b;
        o oVar = this.f17741a;
        lVar.remove(oVar);
        if (AbstractC3340k.a(wVar.f17745c, oVar)) {
            oVar.a();
            wVar.f17745c = null;
        }
        oVar.f17725b.remove(this);
        ?? r02 = oVar.f17726c;
        if (r02 != 0) {
            r02.invoke();
        }
        oVar.f17726c = null;
    }
}
