package y1;

import android.os.Handler;
import android.os.Looper;
import j1.AbstractC3076d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x.C4413f;

/* renamed from: y1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4526g {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f47921i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile C4526g f47922j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f47923a;

    /* renamed from: b, reason: collision with root package name */
    public final C4413f f47924b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f47925c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f47926d;

    /* renamed from: e, reason: collision with root package name */
    public final N8.b f47927e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4525f f47928f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47929g;

    /* renamed from: h, reason: collision with root package name */
    public final C4522c f47930h;

    public C4526g(C4530k c4530k) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f47923a = reentrantReadWriteLock;
        this.f47925c = 3;
        InterfaceC4525f interfaceC4525f = c4530k.f47946a;
        this.f47928f = interfaceC4525f;
        int i5 = c4530k.f47947b;
        this.f47929g = i5;
        this.f47930h = c4530k.f47948c;
        this.f47926d = new Handler(Looper.getMainLooper());
        this.f47924b = new C4413f(0);
        N8.b bVar = new N8.b(this);
        this.f47927e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i5 == 0) {
            try {
                this.f47925c = 0;
            } catch (Throwable th) {
                this.f47923a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC4525f.a(new C4523d(bVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C4526g a() {
        C4526g c4526g;
        synchronized (f47921i) {
            try {
                c4526g = f47922j;
                if (!(c4526g != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c4526g;
    }

    public final int b() {
        this.f47923a.readLock().lock();
        try {
            return this.f47925c;
        } finally {
            this.f47923a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f47929g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f47923a.writeLock().lock();
        try {
            if (this.f47925c == 0) {
                return;
            }
            this.f47925c = 0;
            this.f47923a.writeLock().unlock();
            N8.b bVar = this.f47927e;
            C4526g c4526g = (C4526g) bVar.f8597a;
            try {
                c4526g.f47928f.a(new C4523d(bVar));
            } catch (Throwable th) {
                c4526g.d(th);
            }
        } finally {
            this.f47923a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f47923a.writeLock().lock();
        try {
            this.f47925c = 2;
            arrayList.addAll(this.f47924b);
            this.f47924b.clear();
            this.f47923a.writeLock().unlock();
            this.f47926d.post(new R3.c(arrayList, this.f47925c, th));
        } catch (Throwable th2) {
            this.f47923a.writeLock().unlock();
            throw th2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x00d9
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:32:0x005c, B:35:0x0061, B:37:0x0065, B:39:0x0072, B:44:0x0085, B:46:0x008f, B:48:0x0092, B:50:0x0096, B:52:0x00a6, B:53:0x00a9, B:55:0x00b6, B:58:0x00be, B:63:0x00dd, B:69:0x00e9, B:72:0x00f7, B:73:0x0101, B:74:0x0112, B:76:0x0119, B:77:0x011e, B:79:0x0129, B:81:0x0130, B:83:0x0134, B:85:0x013c, B:87:0x0140, B:90:0x0148, B:93:0x0156, B:94:0x015b, B:96:0x016b, B:42:0x007b), top: B:115:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C4526g.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(AbstractC4524e abstractC4524e) {
        AbstractC3076d.d(abstractC4524e, "initCallback cannot be null");
        this.f47923a.writeLock().lock();
        try {
            if (this.f47925c == 1 || this.f47925c == 2) {
                this.f47926d.post(new R3.c(Arrays.asList(abstractC4524e), this.f47925c, (Throwable) null));
            } else {
                this.f47924b.add(abstractC4524e);
            }
            this.f47923a.writeLock().unlock();
        } catch (Throwable th) {
            this.f47923a.writeLock().unlock();
            throw th;
        }
    }
}
