package b7;

import Va.H;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1723l;
import com.google.android.gms.common.internal.C1720i;
import com.google.android.gms.internal.p000authapi.zbat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e extends AbstractC1723l {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f19386a;

    public e(Context context, Looper looper, C1720i c1720i, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.m mVar, com.google.android.gms.common.api.n nVar) {
        super(context, looper, 91, c1720i, mVar, nVar);
        H h10 = googleSignInOptions != null ? new H(googleSignInOptions) : new H(1);
        h10.f13397f = zbat.zba();
        Set<Scope> set = c1720i.f26646b;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = (HashSet) h10.f13398g;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f19386a = h10.a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final Intent getSignInIntent() {
        return j.a(getContext(), this.f19386a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final boolean providesSignIn() {
        return true;
    }
}
