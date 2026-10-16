package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class weu {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, xyc] */
    public final wae a() {
        this.f.getClass();
        if (this.a == null) {
            this.a = wae.b;
        }
        if (this.e == null) {
            Object obj = this.f;
            AtomicReference atomicReference = wae.a;
            this.e = wub.L(new vks(obj, 10));
        }
        if (this.d == null) {
            this.d = new vdv(this, 12);
        }
        if (this.c == null) {
            Object obj2 = this.f;
            AtomicReference atomicReference2 = wae.a;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new wex(new rju((Context) obj2)), new wfa(new wfg()));
            this.c = wub.L(new vks(arrayList, 11));
        }
        if (this.b == null) {
            this.b = new vks(this, 13);
        }
        return new wae((Context) this.f, this.a, this.e, this.d, this.c, this.b);
    }
}
