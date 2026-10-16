package com.waze.nav_connect.b;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.State;
import com.waze.profile.TempUserProfileActivity;
import com.waze.search.v2.be;
import com.waze.search.v2.cu;
import com.waze.sharedui.web.at;
import com.waze.ui.af.ap;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ab implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30766c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f30767d;

    public /* synthetic */ ab(Context context, String str, h.g.a.l lVar, int i2) {
        this.f30767d = i2;
        this.f30766c = context;
        this.f30764a = str;
        this.f30765b = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f30767d) {
            case 0:
                Object obj = this.f30766c;
                break;
            case 1:
                Object obj2 = this.f30766c;
                break;
            case 2:
                Object obj3 = this.f30766c;
                break;
            case 3:
                ((com.waze.network.y) this.f30764a).a().unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f30766c);
                ((aq) this.f30765b).f48105a = null;
                break;
            case 4:
                Object obj4 = this.f30764a;
                Object obj5 = this.f30766c;
                int i2 = cu.f36302a;
                at.f((Context) obj5, (String) obj4);
                this.f30765b.invoke(new be(false));
                break;
            case 5:
                boolean zD = ((com.waze.sharedrive.g.k) this.f30765b).d();
                Object obj6 = this.f30766c;
                if (zD) {
                    com.waze.bs.a.e((Context) obj6, "settings_main.account.account_and_login", null);
                } else {
                    ((ActivityResultLauncher) this.f30764a).launch(new Intent((Context) obj6, (Class<?>) TempUserProfileActivity.class));
                }
                break;
            case 6:
                break;
            case 7:
                this.f30764a.invoke();
                this.f30766c.setValue(Boolean.valueOf(false));
                this.f30765b.invoke();
                break;
            case 8:
                int i3 = ap.f41852a;
                com.waze.ui.af.y yVar = (com.waze.ui.af.y) ((State) this.f30766c).getValue();
                if (yVar != null) {
                    this.f30765b.invoke(new com.waze.ui.af.o(yVar));
                }
                this.f30764a.invoke();
                break;
            default:
                this.f30765b.invoke(a.a.i(this.f30766c), a.a.i(this.f30764a));
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ ab(af afVar, y yVar, Context context, int i2) {
        this.f30767d = i2;
        this.f30765b = afVar;
        this.f30764a = yVar;
        this.f30766c = context;
    }

    public /* synthetic */ ab(Object obj, Object obj2, Object obj3, int i2) {
        this.f30767d = i2;
        this.f30764a = obj;
        this.f30765b = obj2;
        this.f30766c = obj3;
    }

    public /* synthetic */ ab(Object obj, Object obj2, Object obj3, int i2, byte[] bArr) {
        this.f30767d = i2;
        this.f30764a = obj;
        this.f30766c = obj2;
        this.f30765b = obj3;
    }

    public /* synthetic */ ab(Object obj, Object obj2, Object obj3, int i2, char[] cArr) {
        this.f30767d = i2;
        this.f30765b = obj;
        this.f30766c = obj2;
        this.f30764a = obj3;
    }
}
