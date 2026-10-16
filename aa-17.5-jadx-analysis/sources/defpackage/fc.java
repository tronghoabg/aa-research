package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class fc {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public hg h;
    hc i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public fc(int i) {
        this.a = i;
    }

    final void a(hg hgVar) {
        hc hcVar;
        hg hgVar2 = this.h;
        if (hgVar == hgVar2) {
            return;
        }
        if (hgVar2 != null) {
            hgVar2.m(this.i);
        }
        this.h = hgVar;
        if (hgVar == null || (hcVar = this.i) == null) {
            return;
        }
        hgVar.g(hcVar);
    }
}
