package defpackage;

import android.util.Log;
import java.io.FileFilter;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class aaha {
    public static final long a;
    public static final FileFilter b;
    public static final FileFilter c;
    public static final FileFilter d;
    private static final String e = "aaha";
    private final aahl f;
    private final aahl g;
    private final aahl h;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 7200000L;
        b = new aagz(1);
        c = new aagz(0);
        d = new aagz(2);
    }

    public aaha(aahl aahlVar, aahl aahlVar2, aahl aahlVar3) {
        synchronized (this) {
            this.f = aahlVar;
            this.g = aahlVar2;
            this.h = aahlVar3;
        }
    }

    private static String e(String str) {
        zkt.n(str, "panoId");
        return String.format("%s_%s", "config", str);
    }

    private static String f(aagj aagjVar) {
        zkt.n(aagjVar, "StreetViewPanoramaTileKey");
        return String.format("%s_%s_%s_%s_%s", "tile", aagjVar.a, Integer.valueOf(aagjVar.d), Integer.valueOf(aagjVar.b), Integer.valueOf(aagjVar.c));
    }

    public final synchronized acih a(String str) {
        aahl aahlVar = this.f;
        acih acihVar = null;
        if (aahlVar == null) {
            return null;
        }
        String strE = e(str);
        byte[] bArrE = aahlVar.e(strE);
        if (bArrE != null) {
            try {
                acihVar = (acih) abnv.x(acih.a, bArrE);
            } catch (abon e2) {
                String str2 = e;
                if (zrn.e(str2, 6)) {
                    Log.e(str2, "Corrupt cache file for ".concat(str), e2);
                }
                this.f.d(strE);
                return null;
            }
        }
        return acihVar;
    }

    public final synchronized void b(aagj aagjVar, byte[] bArr) {
        zkt.n(aagjVar, "key");
        zkt.n(bArr, "tileBytes");
        aahl aahlVar = aagjVar.a() ? this.g : this.h;
        if (aahlVar == null) {
            return;
        }
        aahlVar.c(f(aagjVar), bArr);
    }

    public final synchronized void c(String str, acih acihVar) {
        zkt.n(str, "panoId");
        aahl aahlVar = this.f;
        if (aahlVar == null) {
            return;
        }
        aahlVar.c(e(str), acihVar.h());
    }

    public final synchronized byte[] d(aagj aagjVar) {
        zkt.n(aagjVar, "key");
        aahl aahlVar = aagjVar.a() ? this.g : this.h;
        if (aahlVar == null) {
            return null;
        }
        return aahlVar.e(f(aagjVar));
    }
}
