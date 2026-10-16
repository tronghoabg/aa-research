package android.support.v4.app;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f103d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f104e;

    public /* synthetic */ ad(ar arVar, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i2) {
        this.f104e = i2;
        this.f100a = arVar;
        this.f101b = layoutInflater;
        this.f102c = viewGroup;
        this.f103d = bundle;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.datatransport.i, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f104e;
        if (i2 == 0) {
            Object obj = this.f103d;
            Object obj2 = this.f102c;
            ((ar) this.f100a).m40lambda$performCreateView$6$androidsupportv4appFragment((LayoutInflater) this.f101b, (ViewGroup) obj2, (Bundle) obj);
            return;
        }
        if (i2 != 1) {
            Object obj3 = this.f101b;
            Object obj4 = this.f103d;
            ((com.waze.sdk.bi) this.f102c).y((Resources) this.f100a, (PackageManager) obj4, (com.waze.search.h.ay) obj3);
            return;
        }
        Object obj5 = this.f100a;
        com.google.android.datatransport.runtime.scheduling.a.a((com.google.android.datatransport.runtime.scheduling.a) this.f102c, (com.google.android.datatransport.runtime.x) this.f101b, this.f103d, (com.google.android.datatransport.runtime.n) obj5);
    }

    public /* synthetic */ ad(com.google.android.datatransport.runtime.scheduling.a aVar, com.google.android.datatransport.runtime.x xVar, com.google.android.datatransport.i iVar, com.google.android.datatransport.runtime.n nVar, int i2) {
        this.f104e = i2;
        this.f102c = aVar;
        this.f101b = xVar;
        this.f103d = iVar;
        this.f100a = nVar;
    }

    public /* synthetic */ ad(com.waze.sdk.bi biVar, Resources resources, PackageManager packageManager, com.waze.search.h.ay ayVar, int i2) {
        this.f104e = i2;
        this.f102c = biVar;
        this.f100a = resources;
        this.f103d = packageManager;
        this.f101b = ayVar;
    }
}
