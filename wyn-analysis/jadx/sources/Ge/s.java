package Ge;

import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class s implements QEntitlementsUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f4772a;

    public s(t tVar) {
        this.f4772a = tVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener
    public final void onEntitlementsUpdated(Map entitlements) {
        AbstractC3340k.e(entitlements, "entitlements");
        t tVar = this.f4772a;
        tVar.f4775c.onEntitlementsUpdated(c.a(entitlements));
    }
}
