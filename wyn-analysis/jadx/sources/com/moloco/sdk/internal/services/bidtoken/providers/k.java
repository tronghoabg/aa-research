package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29486a;

    /* renamed from: b, reason: collision with root package name */
    public final MolocoPrivacy.PrivacySettings f29487b;

    /* renamed from: c, reason: collision with root package name */
    public final q f29488c;

    /* renamed from: d, reason: collision with root package name */
    public final d f29489d;

    /* renamed from: e, reason: collision with root package name */
    public final s f29490e;

    /* renamed from: f, reason: collision with root package name */
    public final h f29491f;

    /* renamed from: g, reason: collision with root package name */
    public final Fe.c f29492g;

    /* renamed from: h, reason: collision with root package name */
    public final m f29493h;

    /* renamed from: i, reason: collision with root package name */
    public final f f29494i;

    /* renamed from: j, reason: collision with root package name */
    public final a f29495j;
    public final o k;

    /* renamed from: l, reason: collision with root package name */
    public final w f29496l;

    public k(boolean z2, MolocoPrivacy.PrivacySettings privacySettings, q qVar, d dVar, s networkInfoSignal, h batteryInfoSignal, Fe.c cVar, m deviceSignal, f audioSignal, a accessibilitySignal, o ilrdSignal, w wVar) {
        AbstractC3340k.e(privacySettings, "privacySettings");
        AbstractC3340k.e(networkInfoSignal, "networkInfoSignal");
        AbstractC3340k.e(batteryInfoSignal, "batteryInfoSignal");
        AbstractC3340k.e(deviceSignal, "deviceSignal");
        AbstractC3340k.e(audioSignal, "audioSignal");
        AbstractC3340k.e(accessibilitySignal, "accessibilitySignal");
        AbstractC3340k.e(ilrdSignal, "ilrdSignal");
        this.f29486a = z2;
        this.f29487b = privacySettings;
        this.f29488c = qVar;
        this.f29489d = dVar;
        this.f29490e = networkInfoSignal;
        this.f29491f = batteryInfoSignal;
        this.f29492g = cVar;
        this.f29493h = deviceSignal;
        this.f29494i = audioSignal;
        this.f29495j = accessibilitySignal;
        this.k = ilrdSignal;
        this.f29496l = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f29486a == kVar.f29486a && AbstractC3340k.a(this.f29487b, kVar.f29487b) && AbstractC3340k.a(this.f29488c, kVar.f29488c) && AbstractC3340k.a(this.f29489d, kVar.f29489d) && AbstractC3340k.a(this.f29490e, kVar.f29490e) && AbstractC3340k.a(this.f29491f, kVar.f29491f) && AbstractC3340k.a(this.f29492g, kVar.f29492g) && AbstractC3340k.a(this.f29493h, kVar.f29493h) && AbstractC3340k.a(this.f29494i, kVar.f29494i) && AbstractC3340k.a(this.f29495j, kVar.f29495j) && AbstractC3340k.a(this.k, kVar.k) && AbstractC3340k.a(this.f29496l, kVar.f29496l);
    }

    public final int hashCode() {
        return this.f29496l.hashCode() + ((this.k.hashCode() + ((this.f29495j.hashCode() + ((this.f29494i.hashCode() + ((this.f29493h.hashCode() + ((this.f29492g.hashCode() + ((this.f29491f.hashCode() + ((this.f29490e.hashCode() + ((this.f29489d.hashCode() + ((this.f29488c.hashCode() + ((this.f29487b.hashCode() + ((this.f29486a ? 1231 : 1237) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSignals(sdkInitialized=" + this.f29486a + ", privacySettings=" + this.f29487b + ", memoryInfo=" + this.f29488c + ", appDirInfo=" + this.f29489d + ", networkInfoSignal=" + this.f29490e + ", batteryInfoSignal=" + this.f29491f + ", adDataSignal=" + this.f29492g + ", deviceSignal=" + this.f29493h + ", audioSignal=" + this.f29494i + ", accessibilitySignal=" + this.f29495j + ", ilrdSignal=" + this.k + ", testConfigSignal=" + this.f29496l + ')';
    }
}
