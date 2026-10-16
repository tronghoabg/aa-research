package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: classes.dex */
public final class vsb {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final tna e;
    public final xyc f;
    public final aezk g;
    public final xxh h;
    public final xxh i;
    public final xxh j;
    public final aezk k;
    public final int l;
    public final oit m;

    public vsb(Context context, xxh xxhVar, String str, aezk aezkVar, oit oitVar, xxh xxhVar2, xxh xxhVar3, xxh xxhVar4, aezk aezkVar2) {
        this.a = context;
        this.g = aezkVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = vqs.a;
        this.c = vqs.b(context.getPackageName(), vqs.a());
        if (xxhVar.f()) {
        }
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.l = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.e = new tna(context);
        this.f = wub.L(new vks(this, 6));
        this.m = oitVar;
        this.h = xxhVar2;
        this.i = xxhVar3;
        this.j = xxhVar4;
        this.k = aezkVar2;
    }

    public static List a(List list, int i) {
        return list.size() > i ? list.subList(0, i) : list;
    }
}
