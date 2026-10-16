package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class num {
    public ComponentName B;
    public boolean C;
    public nuq F;
    public GhIcon b;
    public PendingIntent c;
    public GhIcon d;
    public CarIcon e;
    public String f;
    public String g;
    public boolean k;
    public boolean l;
    public nul p;
    public nul q;
    public nul r;
    public nul s;
    public nud t;
    public nub u;
    public nuk v;
    public Uri w;
    public boolean z;
    public nup a = nup.DEFAULT;
    public int h = 0;
    public long i = System.currentTimeMillis();
    public boolean j = true;
    public CharSequence m = "";
    public CharSequence n = "";
    public CharSequence o = "";
    public nuo x = nuo.a;
    public final List y = new ArrayList();
    public nun A = nun.a;
    public Bundle D = Bundle.EMPTY;
    public int E = 0;

    public static num a(nur nurVar) {
        num numVar = new num();
        numVar.a = nurVar.a;
        numVar.b = nurVar.b;
        numVar.c = nurVar.c;
        numVar.d = nurVar.d;
        numVar.e = nurVar.e;
        numVar.f = nurVar.f;
        numVar.h = nurVar.h;
        numVar.i = nurVar.i;
        numVar.j = nurVar.j;
        numVar.k = nurVar.k;
        numVar.l = nurVar.l;
        numVar.m = nurVar.m;
        numVar.n = nurVar.n;
        numVar.o = nurVar.o;
        numVar.p = nurVar.p;
        numVar.q = nurVar.q;
        numVar.r = nurVar.r;
        numVar.s = nurVar.s;
        numVar.u = nurVar.u;
        numVar.t = nurVar.t;
        numVar.v = nurVar.v;
        numVar.x = nurVar.x;
        numVar.y.addAll(yfq.o(nurVar.y));
        numVar.w = nurVar.w;
        numVar.g = nurVar.g;
        numVar.z = nurVar.z;
        numVar.A = nurVar.A;
        numVar.B = nurVar.B;
        numVar.C = nurVar.C;
        numVar.E = nurVar.E;
        numVar.D = nurVar.F;
        numVar.F = nurVar.D;
        return numVar;
    }

    public final nur b() {
        this.f.getClass();
        return new nur(this);
    }

    public final void c(PendingIntent pendingIntent) {
        aaew aaewVar = new aaew(null);
        aaewVar.b = pendingIntent;
        this.s = new nul(aaewVar);
    }
}
