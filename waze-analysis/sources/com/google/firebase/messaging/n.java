package com.google.firebase.messaging;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.waze.location.LocationPermissionActivity;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements com.google.android.gms.o.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10216a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f10217b;

    public /* synthetic */ n(Object obj, int i2) {
        this.f10217b = i2;
        this.f10216a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [h.g.a.l, java.lang.Object] */
    @Override // com.google.android.gms.o.o
    public final void onSuccess(Object obj) {
        switch (this.f10217b) {
            case 0:
                FirebaseMessaging.i((FirebaseMessaging) this.f10216a, (com.google.android.gms.f.a) obj);
                break;
            case 1:
                an anVar = (an) obj;
                if (((FirebaseMessaging) this.f10216a).p()) {
                    anVar.d();
                    break;
                }
                break;
            case 2:
                ((RemoteConfigManager) this.f10216a).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
                break;
            case 3:
                this.f10216a.invoke(obj);
                break;
            case 4:
                this.f10216a.invoke(obj);
                break;
            case 5:
                this.f10216a.invoke(obj);
                break;
            case 6:
                this.f10216a.invoke(obj);
                break;
            case 7:
                this.f10216a.invoke(obj);
                break;
            case 8:
                int i2 = LocationPermissionActivity.f25168f;
                this.f10216a.invoke(obj);
                break;
            default:
                this.f10216a.invoke(obj);
                break;
        }
    }
}
