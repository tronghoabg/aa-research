package com.google.firebase;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import com.waze.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f9910a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9911b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9912c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9913d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9914e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9915f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9916g;

    private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        av.j(!com.google.android.gms.common.util.h.b(str), "ApplicationId must be set.");
        this.f9911b = str;
        this.f9910a = str2;
        this.f9912c = str3;
        this.f9913d = str4;
        this.f9914e = str5;
        this.f9915f = str6;
        this.f9916g = str7;
    }

    public static i a(Context context) throws Resources.NotFoundException {
        av.m(context);
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String strB = av.b("google_app_id", resources, resourcePackageName);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return new i(strB, av.b("google_api_key", resources, resourcePackageName), av.b("firebase_database_url", resources, resourcePackageName), av.b("ga_trackingId", resources, resourcePackageName), av.b("gcm_defaultSenderId", resources, resourcePackageName), av.b("google_storage_bucket", resources, resourcePackageName), av.b("project_id", resources, resourcePackageName));
    }

    public final String b() {
        return this.f9910a;
    }

    public final String c() {
        return this.f9911b;
    }

    public final String d() {
        return this.f9914e;
    }

    public final String e() {
        return this.f9916g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f9911b, iVar.f9911b) && Objects.equals(this.f9910a, iVar.f9910a) && Objects.equals(this.f9912c, iVar.f9912c) && Objects.equals(this.f9913d, iVar.f9913d) && Objects.equals(this.f9914e, iVar.f9914e) && Objects.equals(this.f9915f, iVar.f9915f) && Objects.equals(this.f9916g, iVar.f9916g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9911b, this.f9910a, this.f9912c, this.f9913d, this.f9914e, this.f9915f, this.f9916g});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        bb.c("applicationId", this.f9911b, arrayList);
        bb.c("apiKey", this.f9910a, arrayList);
        bb.c("databaseUrl", this.f9912c, arrayList);
        bb.c("gcmSenderId", this.f9914e, arrayList);
        bb.c("storageBucket", this.f9915f, arrayList);
        bb.c("projectId", this.f9916g, arrayList);
        return bb.b(arrayList, this);
    }
}
