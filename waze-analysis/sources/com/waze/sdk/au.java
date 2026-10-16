package com.waze.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.waze.ConfigManager;
import com.waze.mg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    public final String f35258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35259b;

    /* renamed from: c, reason: collision with root package name */
    final int f35260c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35261d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f35262e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f35263f;

    /* renamed from: g, reason: collision with root package name */
    private final List f35264g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35265h;

    private au(String str, String str2, int i2, String str3) {
        this.f35264g = new ArrayList();
        this.f35258a = str;
        this.f35259b = str2;
        this.f35260c = i2;
        this.f35261d = str3;
        if (SdkConfiguration.isAudioSupported(i2, str) && !SdkConfiguration.isTestApp(i2) && ConfigManager.getInstance().isConfigSynced()) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new com.waze.g.f(this, 19));
            } else {
                h(mg.a());
            }
        }
    }

    static /* bridge */ /* synthetic */ void c(au auVar, Drawable drawable) {
        auVar.f35263f = drawable;
        List list = auVar.f35264g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auVar.d(null, (as) it.next());
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context) {
        if (context == null || this.f35265h) {
            return;
        }
        this.f35265h = true;
        com.waze.utils.i.a().c(SdkConfiguration.getCustomizedAppIconUrl(context.getResources(), this.f35258a), new at(this, context, 0));
    }

    public final void d(Context context, as asVar) {
        Drawable drawable = this.f35263f;
        if (drawable != null) {
            asVar.a(drawable.mutate().getConstantState().newDrawable());
            return;
        }
        if (!this.f35265h) {
            h(context);
        }
        this.f35264g.add(asVar);
    }

    public final void e() {
        String str = this.f35258a;
        SdkConfiguration.setLastAppAuthorizedTimestamp(str, 0L);
        if (TextUtils.equals(str, SdkConfiguration.getLastConnectedAudioApp())) {
            SdkConfiguration.setLastConnectedAudioApp(null);
        }
        bd.d().z(str, false);
    }

    public final boolean f() {
        return SdkConfiguration.hasValidUserAgreement(this.f35258a);
    }

    public final boolean g(Context context) {
        Boolean bool = this.f35262e;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.f35262e = false;
        String str = this.f35258a;
        if ("com.spotify.music".equals(str)) {
            try {
                if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                    this.f35262e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } else {
            this.f35262e = Boolean.valueOf(ap.f35250a.d(this.f35258a));
        }
        return this.f35262e.booleanValue();
    }

    /* synthetic */ au(String str, String str2, int i2) {
        this(str, str2, i2, null);
    }

    /* synthetic */ au(String str, String str2, int i2, String str3, byte[] bArr) {
        this(str, str2, i2, str3);
    }
}
