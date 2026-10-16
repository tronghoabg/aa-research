package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ere implements fbd, fbg, eru {
    public Bundle a;
    private final /* synthetic */ fbg b;
    private final /* synthetic */ eru c;
    private erd d;
    private boolean e;

    public ere(fbg fbgVar, eru eruVar) {
        this.b = fbgVar;
        this.c = eruVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [fbd, java.lang.Object] */
    @Override // defpackage.fbd
    public final Bundle a() {
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleZ.putAll(bundle);
        }
        for (Map.Entry entry : b().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((ajdr) ((erb) entry.getValue()).a).b.a();
            if (!bundleA.isEmpty()) {
                fbh.a(bundleZ, str, bundleA);
            }
        }
        this.e = false;
        return bundleZ;
    }

    public final erd b() {
        erd erdVar = this.d;
        if (erdVar != null && erdVar.b) {
            this.d = null;
        }
        erd erdVar2 = this.d;
        if (erdVar2 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ebc.e(affw.b(erd.class), new dmw(10), linkedHashMap);
            erdVar2 = (erd) ebj.h(this, ebc.d(linkedHashMap), ecw.g(this)).b(affw.b(erd.class));
            this.d = erdVar2;
        }
        erdVar2.getClass();
        return erdVar2;
    }

    public final void c() {
        if (this.e) {
            return;
        }
        Bundle bundleA = getSavedStateRegistry().a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleZ.putAll(bundle);
        }
        if (bundleA != null) {
            bundleZ.putAll(bundleA);
        }
        this.a = bundleZ;
        this.e = true;
        b();
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.b.getLifecycle();
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }

    @Override // defpackage.eru
    public final ert getViewModelStore() {
        return this.c.getViewModelStore();
    }
}
