package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;
import u.AbstractC4159a;

/* loaded from: classes3.dex */
public final class zzbjz extends AbstractC4159a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) C0395s.f2489e.f2492c.zzd(zzbix.zzlz)).split(","));
    private final zzbkc zzc;
    private final AbstractC4159a zzd;
    private final zzdzy zze;

    public zzbjz(zzbkc zzbkcVar, AbstractC4159a abstractC4159a, zzdzy zzdzyVar) {
        this.zzd = abstractC4159a;
        this.zzc = zzbkcVar;
        this.zze = zzdzyVar;
    }

    private final void zzb(String str) {
        AbstractC3772b.a0(this.zze, "pact_action", new Pair("pe", str));
    }

    @Override // u.AbstractC4159a
    public final void extraCallback(String str, Bundle bundle) {
        AbstractC4159a abstractC4159a = this.zzd;
        if (abstractC4159a != null) {
            abstractC4159a.extraCallback(str, bundle);
        }
    }

    @Override // u.AbstractC4159a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        AbstractC4159a abstractC4159a = this.zzd;
        if (abstractC4159a != null) {
            return abstractC4159a.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // u.AbstractC4159a
    public final void onActivityResized(int i5, int i10, Bundle bundle) {
        AbstractC4159a abstractC4159a = this.zzd;
        if (abstractC4159a != null) {
            abstractC4159a.onActivityResized(i5, i10, bundle);
        }
    }

    @Override // u.AbstractC4159a
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        AbstractC4159a abstractC4159a = this.zzd;
        if (abstractC4159a != null) {
            abstractC4159a.onMessageChannelReady(bundle);
        }
    }

    @Override // u.AbstractC4159a
    public final void onNavigationEvent(int i5, Bundle bundle) {
        this.zza.set(false);
        AbstractC4159a abstractC4159a = this.zzd;
        if (abstractC4159a != null) {
            abstractC4159a.onNavigationEvent(i5, bundle);
        }
        zzbkc zzbkcVar = this.zzc;
        C6.n.f1857D.k.getClass();
        zzbkcVar.zzg(System.currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i5))) {
            return;
        }
        zzbkcVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // u.AbstractC4159a
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e7) {
            G6.L.l("Message is not in JSON format: ", e7);
        }
        AbstractC4159a abstractC4159a = this.zzd;
        if (abstractC4159a != null) {
            abstractC4159a.onPostMessage(str, bundle);
        }
    }

    @Override // u.AbstractC4159a
    public final void onRelationshipValidationResult(int i5, Uri uri, boolean z2, Bundle bundle) {
        AbstractC4159a abstractC4159a = this.zzd;
        if (abstractC4159a != null) {
            abstractC4159a.onRelationshipValidationResult(i5, uri, z2, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
