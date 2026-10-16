package K8;

import J8.AbstractC0640o;
import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: K8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0693e extends AbstractC0640o {
    public static final Parcelable.Creator<C0693e> CREATOR = new C0691c(2);

    /* renamed from: a, reason: collision with root package name */
    public zzagl f6627a;

    /* renamed from: b, reason: collision with root package name */
    public U f6628b;

    /* renamed from: c, reason: collision with root package name */
    public String f6629c;

    /* renamed from: d, reason: collision with root package name */
    public String f6630d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f6631e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f6632f;

    /* renamed from: g, reason: collision with root package name */
    public String f6633g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f6634h;

    /* renamed from: i, reason: collision with root package name */
    public C0695g f6635i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6636j;
    public J8.I k;

    /* renamed from: l, reason: collision with root package name */
    public w f6637l;

    /* renamed from: m, reason: collision with root package name */
    public List f6638m;

    public C0693e(s8.g gVar, ArrayList arrayList) {
        gVar.a();
        this.f6629c = gVar.f45329b;
        this.f6630d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f6633g = CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
        Y(arrayList);
    }

    @Override // J8.E
    public final String J() {
        return this.f6628b.f6615b;
    }

    @Override // J8.E
    public final String Q() {
        return this.f6628b.f6619f;
    }

    @Override // J8.AbstractC0640o
    public final String V() {
        Map map;
        zzagl zzaglVar = this.f6627a;
        if (zzaglVar == null || zzaglVar.zzc() == null || (map = (Map) AbstractC0707t.a(this.f6627a.zzc()).f5813b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // J8.AbstractC0640o
    public final boolean W() {
        String str;
        Boolean bool = this.f6634h;
        if (bool == null || bool.booleanValue()) {
            zzagl zzaglVar = this.f6627a;
            if (zzaglVar != null) {
                Map map = (Map) AbstractC0707t.a(zzaglVar.zzc()).f5813b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z2 = true;
            if (this.f6631e.size() > 1 || (str != null && str.equals("custom"))) {
                z2 = false;
            }
            this.f6634h = Boolean.valueOf(z2);
        }
        return this.f6634h.booleanValue();
    }

    @Override // J8.AbstractC0640o
    public final synchronized C0693e Y(ArrayList arrayList) {
        try {
            AbstractC1732v.i(arrayList);
            this.f6631e = new ArrayList(arrayList.size());
            this.f6632f = new ArrayList(arrayList.size());
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                J8.E e7 = (J8.E) arrayList.get(i5);
                if (e7.J().equals("firebase")) {
                    this.f6628b = (U) e7;
                } else {
                    this.f6632f.add(e7.J());
                }
                this.f6631e.add((U) e7);
            }
            if (this.f6628b == null) {
                this.f6628b = (U) this.f6631e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // J8.AbstractC0640o
    public final void Z(ArrayList arrayList) {
        w wVar;
        if (arrayList.isEmpty()) {
            wVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                J8.t tVar = (J8.t) it.next();
                if (tVar instanceof J8.z) {
                    arrayList2.add((J8.z) tVar);
                } else if (tVar instanceof J8.C) {
                    arrayList3.add((J8.C) tVar);
                }
            }
            wVar = new w(arrayList2, arrayList3);
        }
        this.f6637l = wVar;
    }

    @Override // J8.E
    public final String getUid() {
        return this.f6628b.f6614a;
    }

    @Override // J8.E
    public final String h() {
        return this.f6628b.f6620g;
    }

    @Override // J8.E
    public final String o() {
        return this.f6628b.f6616c;
    }

    @Override // J8.E
    public final Uri w() {
        return this.f6628b.w();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f6627a, i5, false);
        AbstractC1304a.Z(parcel, 2, this.f6628b, i5, false);
        AbstractC1304a.a0(parcel, 3, this.f6629c, false);
        AbstractC1304a.a0(parcel, 4, this.f6630d, false);
        AbstractC1304a.e0(parcel, 5, this.f6631e, false);
        AbstractC1304a.c0(parcel, 6, this.f6632f);
        AbstractC1304a.a0(parcel, 7, this.f6633g, false);
        AbstractC1304a.R(parcel, 8, Boolean.valueOf(W()));
        AbstractC1304a.Z(parcel, 9, this.f6635i, i5, false);
        boolean z2 = this.f6636j;
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.Z(parcel, 11, this.k, i5, false);
        AbstractC1304a.Z(parcel, 12, this.f6637l, i5, false);
        AbstractC1304a.e0(parcel, 13, this.f6638m, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // J8.E
    public final boolean z() {
        return this.f6628b.f6621h;
    }
}
