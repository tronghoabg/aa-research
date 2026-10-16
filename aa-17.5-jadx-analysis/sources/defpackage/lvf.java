package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import j$.time.Instant;

/* loaded from: classes2.dex */
public class lvf {
    public boolean a;
    public String b;
    public Bundle c = new Bundle();
    public long d;
    public mny e;
    public long f;
    public String g;
    public int h;
    public int i;
    public Bitmap j;
    public Uri k;

    public lvf() {
        oit.a();
        Instant.now().toEpochMilli();
        this.e = mny.d;
    }

    public void a(String str) {
        this.g = str;
    }

    public final void b(lvg lvgVar) {
        this.i = lvgVar.h;
        this.j = lvgVar.i;
        this.k = lvgVar.j;
        this.f = lvgVar.e;
        this.h = lvgVar.g;
        a(lvgVar.f());
        this.d = lvgVar.c;
        this.e = lvgVar.d;
        this.c = lvgVar.b;
        this.a = lvgVar.a;
        this.b = lvgVar.k;
    }
}
