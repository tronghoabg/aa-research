package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ah;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends com.google.android.a.b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4630a;

    public m(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f4630a = context;
    }

    private final void a() throws PackageManager.NameNotFoundException {
        int callingUid = Binder.getCallingUid();
        Context context = this.f4630a;
        if (com.google.android.gms.common.d.c.b(context).e(callingUid)) {
            try {
                if (ah.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64))) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws PackageManager.NameNotFoundException {
        if (i2 == 1) {
            a();
            Context context = this.f4630a;
            q qVarC = q.c(context);
            GoogleSignInAccount googleSignInAccountA = qVarC.a();
            GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.f4586e;
            if (googleSignInAccountA != null) {
                googleSignInOptionsB = qVarC.b();
            }
            com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptionsB);
            if (googleSignInAccountA != null) {
                bVarA.a();
            } else {
                bVarA.b();
            }
        } else {
            if (i2 != 2) {
                return false;
            }
            a();
            l.a(this.f4630a).b();
        }
        return true;
    }
}
