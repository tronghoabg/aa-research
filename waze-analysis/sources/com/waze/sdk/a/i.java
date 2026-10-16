package com.waze.sdk.a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.a.m;
import android.support.v4.media.a.r;
import android.support.v4.media.a.z;
import android.support.v4.media.l;
import com.waze.sdk.ah;
import com.waze.sdk.bd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class i implements ah {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35187a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35188b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f35189c;

    /* renamed from: d, reason: collision with root package name */
    private l f35190d;

    /* renamed from: e, reason: collision with root package name */
    private r f35191e;

    /* renamed from: f, reason: collision with root package name */
    private m f35192f;

    /* renamed from: g, reason: collision with root package name */
    private MediaMetadataCompat f35193g;

    /* renamed from: h, reason: collision with root package name */
    private z f35194h;

    /* renamed from: i, reason: collision with root package name */
    private List f35195i;

    /* renamed from: j, reason: collision with root package name */
    private long f35196j;

    /* renamed from: k, reason: collision with root package name */
    private final Handler f35197k = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    private final android.support.v4.media.d f35198l = new b(this);
    private final android.support.v4.media.k m = new d(this);
    private final android.support.v4.media.a.h n = new e(this);

    i(Context context, String str, ComponentName componentName) {
        this.f35187a = context.getApplicationContext();
        this.f35188b = str;
        this.f35189c = componentName;
        e();
    }

    public static /* synthetic */ void B(i iVar) {
        if (iVar.f35190d != null) {
            return;
        }
        l lVar = new l(iVar.f35187a, iVar.f35189c, iVar.f35198l, iVar.p());
        iVar.f35190d = lVar;
        lVar.c();
    }

    static /* bridge */ /* synthetic */ void I(i iVar) {
        List listC = iVar.c();
        if (listC != null) {
            bd.d().O(iVar.f35188b, listC);
        }
    }

    @Override // com.waze.sdk.ah
    public final MediaMetadataCompat a() {
        return this.f35193g;
    }

    @Override // com.waze.sdk.ah
    public final z b() {
        return this.f35194h;
    }

    @Override // com.waze.sdk.ah
    public final List c() {
        if (this.f35195i == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.f35195i) {
            if (hVar.f35184d) {
                arrayList.add(hVar);
            } else if (System.currentTimeMillis() - this.f35196j < 10000) {
                return null;
            }
        }
        return arrayList;
    }

    @Override // com.waze.sdk.ah
    public final void d(String str, Bundle bundle) {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.d(str, bundle);
        }
    }

    @Override // com.waze.sdk.ah
    public final void e() {
        this.f35197k.post(new Runnable() { // from class: com.waze.sdk.a.a
            @Override // java.lang.Runnable
            public final void run() {
                i.B(this.f35177a);
            }
        });
    }

    @Override // com.waze.sdk.ah
    public final void f(String str) {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.h(z(str));
        }
    }

    @Override // com.waze.sdk.ah
    public final void g() {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.waze.sdk.ah
    public final void h() {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.c();
        }
    }

    @Override // com.waze.sdk.ah
    public final void i() {
        l lVar = this.f35190d;
        if (lVar != null) {
            lVar.d();
            this.f35190d = null;
            r rVar = this.f35191e;
            if (rVar != null) {
                rVar.e(this.n);
                this.f35191e = null;
                this.f35192f = null;
            }
        }
        j.f35199a.b(this.f35188b);
    }

    @Override // com.waze.sdk.ah
    public final void j() {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.f();
        }
    }

    @Override // com.waze.sdk.ah
    public final void k() {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.g();
        }
    }

    @Override // com.waze.sdk.ah
    public final boolean l() {
        return this.f35190d != null;
    }

    @Override // com.waze.sdk.ah
    public void m() {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.waze.sdk.ah
    public void n() {
        m mVar = this.f35192f;
        if (mVar != null) {
            mVar.e();
        }
    }

    Bundle p() {
        return null;
    }

    z x(z zVar) {
        return zVar;
    }

    String z(String str) {
        return str;
    }
}
