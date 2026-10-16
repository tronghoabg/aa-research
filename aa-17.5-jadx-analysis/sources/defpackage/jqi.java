package defpackage;

import android.os.ParcelFileDescriptor;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class jqi implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ List b;
    final /* synthetic */ Map c;
    final /* synthetic */ ParcelFileDescriptor d;
    final /* synthetic */ rwm e;
    final /* synthetic */ jqj f;

    public jqi(jqj jqjVar, long j, List list, Map map, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) {
        this.a = j;
        this.b = list;
        this.c = map;
        this.d = parcelFileDescriptor;
        this.e = rwmVar;
        this.f = jqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.e.a(this.a, this.b, this.c, this.d, this.e);
    }
}
