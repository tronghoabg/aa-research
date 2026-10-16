package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.storage.protostore.MappedCounterCacheVersion;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class vtb implements zfj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vtb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.zfj
    public final zgp a() throws IOException {
        int i = this.b;
        int i2 = 6;
        int i3 = 1;
        if (i == 0) {
            vtd vtdVar = (vtd) this.a;
            return (!vtdVar.p() || vtdVar.c.getAndSet(true)) ? zgl.a : vtdVar.r(6, (vso) vtdVar.b.a(), ((vsr) vtdVar.e.a()).f);
        }
        if (i == 1) {
            int i4 = tmz.a;
            zhk zhkVar = new zhk((Callable) this.a);
            zhkVar.run();
            return zhkVar;
        }
        int i5 = 0;
        if (i == 2) {
            vtd vtdVar2 = (vtd) this.a;
            if (vtdVar2.p()) {
                vsq vsqVar = vtdVar2.f;
                if (((AtomicBoolean) vsqVar.g).getAndSet(false)) {
                    vsqVar.e.execute(new zhk(new vvx(vsqVar, i3)));
                } else {
                    zgp zgpVar = zgl.a;
                }
            }
            return zgl.a;
        }
        if (i == 3) {
            Object obj = this.a;
            teg tegVar = new teg(obj, i2);
            Context context = ((vtt) obj).b;
            int i6 = tmz.a;
            return tmz.b(context, new vtb(Executors.callable(tegVar, null), i3), zfq.a);
        }
        if (i == 4) {
            Object obj2 = this.a;
            vve vveVar = (vve) obj2;
            ScheduledFuture scheduledFuture = vveVar.j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                vveVar.j = null;
            }
            ackk ackkVar = vveVar.a;
            if (((vuz) ackkVar.a()).e) {
                vveVar.j = vveVar.c.scheduleWithFixedDelay(new teg(obj2, 7), ((vuz) ackkVar.a()).f ? Math.round(vveVar.e.nextDouble() * ((Long) vveVar.d.a()).longValue()) : 0L, ((Long) vveVar.d.a()).longValue(), TimeUnit.MILLISECONDS);
            }
            return zgl.a;
        }
        if (i == 5) {
            Object obj3 = this.a;
            wgm wgmVar = new wgm(obj3, i5);
            zfq zfqVar = zfq.a;
            int i7 = zfb.c;
            zgp zgpVar2 = ((wgp) obj3).a;
            zez zezVar = new zez(zgpVar2, wgmVar);
            zgpVar2.c(zezVar, yrm.aK(zfqVar, zezVar));
            zfa zfaVar = new zfa(zezVar, new xwy());
            zezVar.c(zfaVar, yrm.aK(zfqVar, zfaVar));
            return zfaVar;
        }
        wgp wgpVar = (wgp) this.a;
        zgp zgpVar3 = wgpVar.a;
        woy.ad(zgpVar3.isDone(), "Future was expected to be done: %s", zgpVar3);
        Uri uriBuild = woy.t((Uri) a.L(zgpVar3), ".version").buildUpon().fragment("").build();
        new rhy(13).gu();
        wfs wfsVar = new wfs();
        wfsVar.b();
        File file = (File) wgpVar.i.d(uriBuild, wfsVar);
        yrm.g(file);
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 939524096);
        try {
            int fd = parcelFileDescriptorOpen.getFd();
            if (MappedCounterCacheVersion.nativeFileTruncate(fd) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeMmap = MappedCounterCacheVersion.nativeMmap(fd, true);
            if (jNativeMmap < 0) {
                throw new IOException("Failed to mmap counter file");
            }
            MappedCounterCacheVersion mappedCounterCacheVersion = new MappedCounterCacheVersion(jNativeMmap);
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return new zgl(mappedCounterCacheVersion);
        } finally {
        }
    }
}
