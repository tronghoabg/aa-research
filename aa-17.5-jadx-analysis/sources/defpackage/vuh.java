package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vuh extends vuf implements vqa, vsa {
    public final Context a;
    public final vuw b;
    public final ArrayMap c;
    public final vry d;
    public final aezk e;
    public final vuo i;
    public final xxh j;
    private final vqk k;
    private final vud l;
    private final vug m;

    /* JADX WARN: Type inference failed for: r4v1, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aezk, java.lang.Object] */
    public vuh(wci wciVar, Context context, vqk vqkVar, ackk ackkVar, vud vudVar, aezk aezkVar, aezk aezkVar2, Executor executor, aacq aacqVar, aezk aezkVar3, vuo vuoVar, xxh xxhVar) {
        super(null, null);
        ArrayMap arrayMap = new ArrayMap();
        this.c = arrayMap;
        this.d = wciVar.d(executor, ackkVar, aezkVar2);
        this.a = context;
        this.k = vqkVar;
        this.e = aezkVar;
        this.l = vudVar;
        vug vugVar = new vug(context, arrayMap, aezkVar3);
        this.m = vugVar;
        ?? A = aacqVar.a.a();
        A.getClass();
        ((zgt) aacqVar.b.a()).getClass();
        this.b = new vuw(A, vugVar);
        this.i = vuoVar;
        this.j = Build.VERSION.SDK_INT < 31 ? xvy.a : xxhVar;
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        ArrayMap arrayMap = this.c;
        synchronized (arrayMap) {
            arrayMap.clear();
        }
    }

    @Override // defpackage.vsa
    public final void k() {
        vqk vqkVar = this.k;
        vqkVar.a(this.b);
        vqkVar.a(this.l);
    }

    @Override // defpackage.vqa
    public final /* synthetic */ void j(vky vkyVar) {
    }
}
