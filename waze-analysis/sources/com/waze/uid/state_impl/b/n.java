package com.waze.uid.state_impl.b;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CustomCredential;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.sharedui.api.AuthParameters;
import com.waze.sharedui.api.AuthTokenType;
import com.waze.tide.s;
import com.waze.uid.UidModel;
import com.waze.uid.b.r;
import com.waze.uid.b.u;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import com.waze.uid.state_impl.util.InstallParameters;
import h.a.aj;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f44618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("GoogleAuthState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        this.f44618a = h.g.a(new com.waze.ui.r.a.e.c(12));
    }

    public static final /* synthetic */ CredentialManager a(n nVar) {
        return (CredentialManager) nVar.f44618a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        e eVar = new e();
        e eVar2 = new e();
        f fVar = new f();
        Integer numValueOf = Integer.valueOf(R.string.UID_GOOGLE_SIGNIN_ERROR_POPUP_NEXT);
        Integer numValueOf2 = Integer.valueOf(R.string.UID_GOOGLE_SIGNIN_ERROR_POPUP_CONTACT_SUPPORT);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        String strC = aVarA.c(R.string.UID_GOOGLE_SIGNIN_ERROR_POPUP_TITLE, new Object[0]);
        String strC2 = aVarA.c(R.string.UID_GOOGLE_SIGNIN_ERROR_POPUP_MESSAGE, new Object[0]);
        numValueOf.getClass();
        String strC3 = aVarA.c(R.string.UID_GOOGLE_SIGNIN_ERROR_POPUP_NEXT, new Object[0]);
        numValueOf2.getClass();
        this.f44485c.w(new u(strC, strC2, strC3, aVarA.c(R.string.UID_GOOGLE_SIGNIN_ERROR_POPUP_CONTACT_SUPPORT, new Object[0]), eVar, fVar, eVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(com.google.android.gms.auth.api.identity.d dVar) {
        if (dVar.c()) {
            PendingIntent pendingIntentA = dVar.a();
            if (pendingIntentA != null) {
                com.waze.shared_infra.i.h.k("UidEventsController", "Authorization has resolution, PendingIntent is not null.");
                this.f44485c.w(new k(pendingIntentA));
                return;
            } else {
                com.waze.shared_infra.i.h.k("UidEventsController", "Authorization has resolution but PendingIntent is null.");
                l();
                return;
            }
        }
        com.waze.shared_infra.i.h.i("UidEventsController", "Scopes access granted.");
        String strB = dVar.b();
        if (strB == null) {
            com.waze.shared_infra.i.h.k("UidEventsController", "Authorization error: serverAuthCode is empty");
            l();
            return;
        }
        UidModel uidModel = (UidModel) this.f44485c.b();
        String str = InstallParameters.Community.GOOGLE.apiName;
        x.e(str, "apiName");
        uidModel.setAuthParameters(new AuthParameters(str, strB, AuthTokenType.CODE, false, 8, null));
        k();
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        ArrayList arrayListAf;
        super.f(eVar);
        if (eVar == com.waze.uid.e.e.f44481a) {
            com.waze.uid.b.m mVar = this.f44485c;
            if (((UidModel) mVar.b()).getAuthParameters().getToken().length() > 0 && x.n(((UidModel) mVar.b()).getAuthParameters().getCommunity(), InstallParameters.Community.GOOGLE.apiName)) {
                k();
                return;
            }
        }
        com.waze.uid.b.m mVar2 = this.f44485c;
        mVar2.k(mVar2.a().e(new bb(bm.f44280a)));
        com.google.android.libraries.c.a.b bVar = new com.google.android.libraries.c.a.b(com.waze.uid.b.m.t().f44469g.a());
        Iterable bVar2 = new h.k.b('A', 'Z');
        h.k.b bVar3 = new h.k.b('a', 'z');
        x.f(bVar2, "<this>");
        x.f(bVar3, "elements");
        if (bVar2 instanceof Collection) {
            arrayListAf = h.a.i.af((Collection) bVar2, bVar3);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            h.a.i.aD(arrayList2, bVar2);
            h.a.i.aD(arrayList2, bVar3);
            arrayListAf = arrayList;
        }
        List listAf = h.a.i.af(arrayListAf, new h.k.b('0', '9'));
        h.k.j jVar = new h.k.j(1, 32);
        ArrayList arrayList3 = new ArrayList(h.a.i.q(jVar, 10));
        Iterator<Integer> it = jVar.iterator();
        while (it.hasNext()) {
            ((aj) it).nextInt();
            Character ch = (Character) h.a.i.V(listAf, h.j.f.f48136a);
            ch.charValue();
            arrayList3.add(ch);
        }
        bVar.b(h.a.i.aM(arrayList3, "", null, null, 0, null, 62));
        com.google.android.libraries.c.a.c cVarA = bVar.a();
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder();
        builder.addCredentialOption(cVarA);
        mVar2.w(new m(this, builder.build()));
    }

    public final void g(GetCredentialResponse getCredentialResponse) throws com.google.android.libraries.c.a.e {
        ArrayList arrayListH;
        List listAf;
        x.f(getCredentialResponse, "result");
        Credential credential = getCredentialResponse.getCredential();
        if (!(credential instanceof CustomCredential) || !x.n(credential.getType(), "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            Objects.toString(credential);
            com.waze.shared_infra.i.h.k("UidEventsController", "Problem signing in. Unexpected credential type or format. Credential: ".concat(String.valueOf(credential)));
            l();
            return;
        }
        try {
            Bundle data = credential.getData();
            x.f(data, "data");
            try {
                String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                x.c(string);
                x.c(string2);
                com.google.android.libraries.c.a.d dVar = new com.google.android.libraries.c.a.d(string, string2, string3, string4, string5, uri, string6);
                com.waze.shared_infra.i.h.b("UidEventsController", "Signed in with Google. User ID: " + dVar.b() + ", name=" + dVar.a() + ", token=" + dVar.c());
                com.google.android.gms.auth.api.identity.b bVar = new com.google.android.gms.auth.api.identity.b();
                String strB = ConfigValues.CONFIG_VALUE_SIGNUP_UID_GOOGLE_LOGIN_SCOPES.b();
                if (strB == null || (listAf = h.n.o.af(strB, new String[]{","}, 0, 6)) == null) {
                    arrayListH = h.a.i.h();
                } else {
                    List list = listAf;
                    ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Scope((String) it.next()));
                    }
                    arrayListH = arrayList;
                }
                bVar.i(arrayListH);
                com.waze.uid.b.m mVar = this.f44485c;
                bVar.e(com.waze.uid.b.m.t().f44469g.a(), true);
                mVar.w(new i(this, bVar.a()));
            } catch (Exception e2) {
                throw new com.google.android.libraries.c.a.e(e2);
            }
        } catch (com.google.android.libraries.c.a.e e3) {
            com.waze.shared_infra.i.h.l("UidEventsController", "Received an invalid Google ID token response", e3);
            l();
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof com.waze.uid.b.s) {
            m(((com.waze.uid.b.s) sVar).a());
            return;
        }
        if (sVar instanceof r) {
            if (new Status(((r) sVar).a().a()).e()) {
                j();
                return;
            } else {
                l();
                return;
            }
        }
        if (sVar instanceof e) {
            j();
        } else if (!(sVar instanceof f)) {
            super.o(sVar);
        } else {
            this.f44485c.w(new j());
            j();
        }
    }
}
