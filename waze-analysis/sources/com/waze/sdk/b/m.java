package com.waze.sdk.b;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.a.x;
import android.support.v4.media.a.z;
import android.support.v4.media.n;
import android.support.v4.media.o;
import com.b.b.d.p;
import com.b.b.d.r;
import com.b.b.d.s;
import com.b.b.d.u;
import com.waze.ConfigManager;
import com.waze.lm;
import com.waze.mg;
import com.waze.sdk.ah;
import com.waze.sdk.bb;
import com.waze.sdk.bd;
import com.waze.sdk.bi;
import com.waze.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements ah {

    /* renamed from: a, reason: collision with root package name */
    private static m f35295a;

    /* renamed from: d, reason: collision with root package name */
    private com.b.a.a.a.k f35298d;

    /* renamed from: h, reason: collision with root package name */
    private com.b.b.d.l[] f35302h;
    private Bitmap m;
    private MediaMetadataCompat q;
    private z r;
    private Boolean t;
    private long u;
    private long v;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35296b = false;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f35297c = new ArrayList(11);

    /* renamed from: e, reason: collision with root package name */
    private u f35299e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35300f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35301g = false;

    /* renamed from: i, reason: collision with root package name */
    private int f35303i = 0;

    /* renamed from: j, reason: collision with root package name */
    private p f35304j = null;

    /* renamed from: k, reason: collision with root package name */
    private int f35305k = -1;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35306l = false;
    private com.b.b.d.i n = null;
    private boolean o = false;
    private boolean p = false;
    private final List s = new ArrayList();
    private final Handler w = new Handler();
    private final Runnable x = new h(this, 1, null);

    private m() {
        ConfigManager.getInstance();
    }

    static /* bridge */ /* synthetic */ void G(m mVar) {
        ArrayList arrayList = new ArrayList();
        mVar.f35303i = 0;
        ArrayList arrayList2 = mVar.f35297c;
        arrayList2.clear();
        mVar.U(mVar.f35303i);
        for (com.b.b.d.l lVar : mVar.f35302h) {
            aj("Added Playlist ".concat(String.valueOf(lVar.f2661d)));
            arrayList.add(lVar.f2661d);
            arrayList2.add(null);
        }
        arrayList.add("Open Spotify");
    }

    static /* bridge */ /* synthetic */ void I(m mVar, u uVar) {
        com.b.b.a.b bVarU = mVar.f35298d.i().u(uVar.f2696d);
        bVarU.c(new d(mVar, uVar, 2, (char[]) null));
        bVarU.g(new a(mVar, 10, (short[][]) null));
    }

    static /* bridge */ /* synthetic */ void J(m mVar) {
        String str;
        p pVar = mVar.f35304j;
        if (pVar == null || mVar.f35302h == null || (str = pVar.f2669a) == null || str.length() == 0) {
            return;
        }
        mVar.f35305k = -1;
        aj("highlightPlayList CurrentContext = ".concat(pVar.toString()));
        int i2 = 0;
        for (com.b.b.d.l lVar : mVar.f35302h) {
            String str2 = lVar.f2659b;
            String str3 = mVar.f35304j.f2669a;
            if (str2.substring(str2.lastIndexOf(":")).equals(str3.substring(str3.lastIndexOf(":")))) {
                aj("highlightPlayList found playlist  = ".concat(String.valueOf(String.valueOf(lVar))));
                mVar.f35305k = i2;
                u uVar = mVar.f35299e;
                if (uVar != null) {
                    mVar.am(uVar);
                    return;
                }
                return;
            }
            i2++;
        }
    }

    static /* bridge */ /* synthetic */ void L(m mVar, boolean z) {
        mVar.t = Boolean.valueOf(z);
        Bundle bundle = new Bundle();
        bundle.putBoolean("waze.state.isSaved", z);
        x xVar = new x(mVar.r);
        xVar.d(bundle);
        mVar.r = xVar.a();
        bd.d().N("com.spotify.music", mVar.r);
    }

    static /* bridge */ /* synthetic */ void O(m mVar, s sVar) {
        Handler handler = mVar.w;
        Runnable runnable = mVar.x;
        handler.removeCallbacks(runnable);
        if (!sVar.f2684b) {
            mVar.v = System.currentTimeMillis();
            mVar.u = sVar.f2686d;
            handler.postDelayed(runnable, 100L);
        }
        r rVar = sVar.f2688f;
        long j2 = true != rVar.f2678c ? 512L : 528L;
        if (rVar.f2677b) {
            j2 |= 32;
        }
        x xVar = new x();
        xVar.e(true != sVar.f2684b ? 3 : 2, sVar.f2686d, sVar.f2685c);
        xVar.c(j2);
        u uVar = mVar.f35299e;
        String str = uVar.f2696d;
        if (str != null) {
            if (str.contains("spotify:episode")) {
                aj("Track " + String.valueOf(uVar) + " is podcast");
            } else {
                xVar.b("waze.save");
            }
        }
        if (mVar.t != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("waze.state.isSaved", mVar.t.booleanValue());
            xVar.d(bundle);
        }
        mVar.r = xVar.a();
        bd.d().N("com.spotify.music", mVar.r);
    }

    static /* bridge */ /* synthetic */ void P(m mVar, com.b.b.d.l[] lVarArr) {
        int iMin = Math.min(lVarArr.length, 11);
        bb bbVar = new bb();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iMin; i2++) {
            com.b.b.d.l lVar = lVarArr[i2];
            if (lVar.f2662e) {
                n nVar = new n();
                nVar.i(lVar.f2661d);
                nVar.f(Integer.toString(i2));
                nVar.d((Bitmap) mVar.f35297c.get(i2));
                arrayList.add(new MediaBrowserCompat$MediaItem(nVar.a(), 2));
            }
        }
        bbVar.f35308b = arrayList;
        List list = mVar.s;
        list.clear();
        list.add(bbVar);
        bd.d().O("com.spotify.music", list);
    }

    public static final boolean af() {
        return ao();
    }

    public static final void ag() {
        aj("openApp ");
        if (lm.d().c() != null) {
            bd.d();
            if (bi.d().r()) {
                return;
            }
            Intent launchIntentForPackage = lm.d().c().getPackageManager().getLaunchIntentForPackage("com.spotify.music");
            if (launchIntentForPackage != null) {
                lm.d().c().startActivity(launchIntentForPackage);
                return;
            }
            Intent launchIntentForPackage2 = lm.d().c().getPackageManager().getLaunchIntentForPackage("com.spotify.music.debug");
            if (launchIntentForPackage2 != null) {
                lm.d().c().startActivity(launchIntentForPackage2);
                return;
            }
            Intent launchIntentForPackage3 = lm.d().c().getPackageManager().getLaunchIntentForPackage("com.spotify.music.canary");
            if (launchIntentForPackage3 != null) {
                lm.d().c().startActivity(launchIntentForPackage3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ai(com.b.b.d.i iVar, int i2) {
        com.b.b.d.i iVar2 = this.n;
        if ((iVar2 != null && iVar2.equals(iVar)) || iVar == null) {
            an(this.m);
            return;
        }
        if (this.f35298d != null) {
            aj("getTrackImage getImagesApi " + iVar.toString() + "  (retryCount=" + i2 + ")");
            com.b.b.a.b bVarB = this.f35298d.g().b(iVar);
            bVarB.c(new k(this, i2, iVar, 0));
            bVarB.g(new j(this, i2, iVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void aj(String str) {
        com.waze.shared_infra.i.h.a("SpotifyManager: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ak(String str) {
        com.waze.shared_infra.i.h.c("SpotifyManager: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void al() {
        aj("onDisconnected ");
        this.f35306l = true;
        this.f35300f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void am(u uVar) {
        o oVar = new o();
        oVar.d(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, Integer.toString(this.f35305k));
        oVar.c(uVar.f2694b);
        oVar.d(MediaMetadataCompat.METADATA_KEY_TITLE, uVar.f2695c);
        oVar.d(MediaMetadataCompat.METADATA_KEY_ARTIST, uVar.f2693a.f2627a);
        this.q = oVar.a();
        ai(uVar.f2697e, 2);
        bd.d().M("com.spotify.music", this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void an(Bitmap bitmap) {
        o oVar = new o(this.q);
        oVar.b(bitmap);
        this.q = oVar.a();
        bd.d().M("com.spotify.music", this.q);
    }

    private static boolean ao() {
        try {
            Context contextA = mg.a();
            int i2 = com.b.a.a.a.k.f2538a;
            return com.b.a.a.b.j.b(contextA);
        } catch (Exception e2) {
            ak("appInstalled".concat(String.valueOf(e2.getLocalizedMessage())));
            return false;
        }
    }

    private final void ap(boolean z) {
        if (!z) {
            this.f35301g = false;
        }
        aj("connect ");
        com.b.a.a.a.k kVar = this.f35298d;
        if (kVar != null && kVar.d()) {
            com.b.a.a.a.k.b(this.f35298d);
            this.f35298d = null;
        }
        this.o = true;
        Context contextA = mg.a();
        com.b.a.a.a.a aVar = new com.b.a.a.a.a();
        aVar.b();
        aVar.c(z);
        com.b.a.a.a.k.a(contextA, aVar.a(), new c(this));
    }

    public static m v() {
        m mVar = f35295a;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        f35295a = mVar2;
        return mVar2;
    }

    public final void S() {
        if (this.f35300f) {
            return;
        }
        ap(true);
    }

    public final void T() {
        if (this.f35306l) {
            return;
        }
        this.f35306l = true;
        aj("disconnect ");
        com.b.a.a.a.k.b(this.f35298d);
        al();
    }

    public final void U(int i2) {
        com.b.a.a.a.k kVar;
        com.b.b.d.l lVar;
        com.b.b.d.i iVar;
        com.b.b.d.l[] lVarArr = this.f35302h;
        if (i2 >= lVarArr.length || (kVar = this.f35298d) == null || (iVar = (lVar = lVarArr[i2]).f2660c) == null) {
            return;
        }
        com.b.b.a.b bVarB = kVar.g().b(iVar);
        bVarB.c(new k(this, i2, lVar, 1));
        bVarB.g(new g(this));
    }

    public final void V() {
        aj("fetchSugegstedContent ");
        com.b.a.a.a.k kVar = this.f35298d;
        if (kVar != null) {
            com.b.b.a.b bVarF = kVar.f().f(com.b.a.a.a.e.NAVIGATION);
            bVarF.c(new f(this));
            bVarF.g(new a(this, 6, (float[]) null));
        }
    }

    public final void W(String str) {
        ak("Connection authrization declined: ".concat(String.valueOf(str)));
        this.f35301g = false;
        T();
    }

    public final void X() {
        this.f35300f = true;
        this.f35306l = false;
        aj("onConnectedSuccess");
        if (this.f35301g) {
            this.f35301g = false;
            S();
        }
        this.f35298d.h().h().c(new l(this, 0));
        com.b.b.a.x xVarG = this.f35298d.h().g();
        xVarG.c(new l(this, 1, null));
        xVarG.g(new a(this, 9, (char[][]) null));
        t.m(new h(this, 0), 200L);
    }

    @Override // com.waze.sdk.ah
    public final MediaMetadataCompat a() {
        return this.q;
    }

    public final boolean aa() {
        return this.f35300f;
    }

    public final void ah() {
        aj("setAuthorizeOnConnect = true");
        this.p = true;
    }

    @Override // com.waze.sdk.ah
    public final z b() {
        return this.r;
    }

    @Override // com.waze.sdk.ah
    public final List c() {
        return this.s;
    }

    @Override // com.waze.sdk.ah
    public final void d(String str, Bundle bundle) throws NumberFormatException {
        com.b.b.d.l[] lVarArr;
        com.b.b.d.l lVar;
        int i2 = Integer.parseInt(str);
        if (i2 < 0 || (lVarArr = this.f35302h) == null || i2 > lVarArr.length || (lVar = lVarArr[i2]) == null) {
            return;
        }
        if (!lVar.f2662e) {
            aj("playPlayList - Content item is not playable!");
            return;
        }
        com.b.b.a.b bVarG = this.f35298d.f().g(lVar);
        bVarG.c(new b(this, 4, (int[]) null));
        bVarG.g(new a(this, 8, (byte[][]) null));
    }

    @Override // com.waze.sdk.ah
    public final void e() {
        aj("init");
        if (ao()) {
            ap(this.p);
            this.f35296b = true;
        } else {
            aj("init - appInstalled() = " + ao());
        }
    }

    @Override // com.waze.sdk.ah
    public final void f(String str) {
        com.b.a.a.a.k kVar;
        com.b.a.a.a.k kVar2;
        Boolean bool = this.t;
        if (bool == null || !bool.booleanValue()) {
            aj("save ");
            u uVar = this.f35299e;
            if (uVar == null || (kVar = this.f35298d) == null) {
                return;
            }
            com.b.b.a.b bVarT = kVar.i().t(uVar.f2696d);
            bVarT.c(new d(this, uVar, 1, (byte[]) null));
            bVarT.g(new a(this, 4, (int[]) null));
            return;
        }
        aj("unsave ");
        u uVar2 = this.f35299e;
        if (uVar2 == null || (kVar2 = this.f35298d) == null) {
            return;
        }
        com.b.b.a.b bVarV = kVar2.i().v(uVar2.f2696d);
        bVarV.c(new d(this, uVar2, 0));
        bVarV.g(new a(this, 5, (boolean[]) null));
    }

    @Override // com.waze.sdk.ah
    public final void g() {
        aj("pause ");
        com.b.a.a.a.k kVar = this.f35298d;
        if (kVar == null) {
            ak("pause getPlayerApi is null");
            return;
        }
        com.b.b.a.b bVarC = kVar.h().c();
        bVarC.c(new b(this, 2, (char[]) null));
        bVarC.g(new a(this, 2, (char[]) null));
    }

    @Override // com.waze.sdk.ah
    public final void h() {
        aj("play ");
        com.b.a.a.a.k kVar = this.f35298d;
        if (kVar == null) {
            ak("play getPlayerApi is null");
            return;
        }
        com.b.b.a.b bVarD = kVar.h().d();
        bVarD.c(new b(this, 3, (short[]) null));
        bVarD.g(new a(this, 3, (short[]) null));
    }

    @Override // com.waze.sdk.ah
    public final void i() {
        T();
    }

    @Override // com.waze.sdk.ah
    public final void j() {
        aj("playNext ");
        com.b.a.a.a.k kVar = this.f35298d;
        if (kVar == null) {
            ak("play playNext is null");
            return;
        }
        com.b.b.a.b bVarE = kVar.h().e();
        bVarE.c(new b(this, 1, (byte[]) null));
        bVarE.g(new a(this, 1, (byte[]) null));
    }

    @Override // com.waze.sdk.ah
    public final void k() {
        aj("playPrevious ");
        com.b.a.a.a.k kVar = this.f35298d;
        if (kVar == null) {
            ak("playPrevious getPlayerApi is null");
            return;
        }
        com.b.b.a.b bVarF = kVar.h().f();
        bVarF.c(new b(this, 0));
        bVarF.g(new a(this, 0));
    }

    @Override // com.waze.sdk.ah
    public final boolean l() {
        return this.f35296b;
    }

    @Override // com.waze.sdk.ah
    public final void m() {
    }

    @Override // com.waze.sdk.ah
    public final void n() {
    }
}
