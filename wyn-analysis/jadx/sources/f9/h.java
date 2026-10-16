package f9;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e9.AbstractC2475a;
import e9.C2476b;

/* loaded from: classes4.dex */
public final class h extends AbstractC2475a {

    /* renamed from: a, reason: collision with root package name */
    public final b f35254a;

    /* renamed from: b, reason: collision with root package name */
    public final O9.b f35255b;

    /* renamed from: c, reason: collision with root package name */
    public final s8.g f35256c;

    public h(s8.g gVar, O9.b bVar) {
        gVar.a();
        com.google.android.gms.common.api.d dVar = com.google.android.gms.common.api.e.f26433X8;
        com.google.android.gms.common.api.k kVar = com.google.android.gms.common.api.k.f26561c;
        this.f35254a = new b(gVar.f45328a, null, b.f35248a, dVar, kVar);
        this.f35256c = gVar;
        this.f35255b = bVar;
        if (bVar.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public static void c(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    @Override // e9.AbstractC2475a
    public final Task a(Intent intent) {
        Task taskDoWrite = this.f35254a.doWrite(new g(this.f35255b, intent != null ? intent.getDataString() : null));
        if (intent != null) {
            Parcelable.Creator<C2618a> creator = C2618a.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
            C2618a c2618a = (C2618a) (byteArrayExtra == null ? null : android.support.v4.media.session.b.c0(byteArrayExtra, creator));
            C2476b c2476b = c2618a != null ? new C2476b(c2618a) : null;
            if (c2476b != null) {
                return Tasks.forResult(c2476b);
            }
        }
        return taskDoWrite;
    }
}
