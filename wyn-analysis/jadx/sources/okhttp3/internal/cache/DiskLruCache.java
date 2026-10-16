package okhttp3.internal.cache;

import Ba.c;
import Bf.i;
import Bf.k;
import Bf.r;
import cg.AbstractC1613b;
import cg.C1609A;
import cg.C1610B;
import cg.C1614c;
import cg.C1615d;
import cg.C1617f;
import cg.F;
import cg.H;
import cg.o;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: A, reason: collision with root package name */
    public static final String f42465A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f42466B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f42467C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f42468D;

    /* renamed from: t, reason: collision with root package name */
    public static final String f42469t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f42470u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f42471v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f42472w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f42473x;

    /* renamed from: y, reason: collision with root package name */
    public static final long f42474y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f42475z;

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f42476a;

    /* renamed from: b, reason: collision with root package name */
    public final File f42477b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42478c;

    /* renamed from: d, reason: collision with root package name */
    public final File f42479d;

    /* renamed from: e, reason: collision with root package name */
    public final File f42480e;

    /* renamed from: f, reason: collision with root package name */
    public final File f42481f;

    /* renamed from: g, reason: collision with root package name */
    public long f42482g;

    /* renamed from: h, reason: collision with root package name */
    public C1609A f42483h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f42484i;

    /* renamed from: j, reason: collision with root package name */
    public int f42485j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42486l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42487m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f42488n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f42489o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f42490p;

    /* renamed from: q, reason: collision with root package name */
    public long f42491q;

    /* renamed from: r, reason: collision with root package name */
    public final TaskQueue f42492r;

    /* renamed from: s, reason: collision with root package name */
    public final DiskLruCache$cleanupTask$1 f42493s;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "<init>", "()V", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LBf/i;", "LEGAL_KEY_PATTERN", "LBf/i;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        public final Entry f42494a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f42495b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f42496c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f42497d;

        public Editor(DiskLruCache this$0, Entry entry) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42497d = this$0;
            this.f42494a = entry;
            this.f42495b = entry.f42504e ? null : new boolean[2];
        }

        public final void a() {
            DiskLruCache diskLruCache = this.f42497d;
            synchronized (diskLruCache) {
                try {
                    if (this.f42496c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC3340k.a(this.f42494a.f42506g, this)) {
                        diskLruCache.b(this, false);
                    }
                    this.f42496c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.f42497d;
            synchronized (diskLruCache) {
                try {
                    if (this.f42496c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC3340k.a(this.f42494a.f42506g, this)) {
                        diskLruCache.b(this, true);
                    }
                    this.f42496c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            Entry entry = this.f42494a;
            if (AbstractC3340k.a(entry.f42506g, this)) {
                DiskLruCache diskLruCache = this.f42497d;
                if (diskLruCache.f42486l) {
                    diskLruCache.b(this, false);
                } else {
                    entry.f42505f = true;
                }
            }
        }

        public final F d(int i5) {
            DiskLruCache diskLruCache = this.f42497d;
            synchronized (diskLruCache) {
                try {
                    if (this.f42496c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!AbstractC3340k.a(this.f42494a.f42506g, this)) {
                        return new C1617f();
                    }
                    if (!this.f42494a.f42504e) {
                        boolean[] zArr = this.f42495b;
                        AbstractC3340k.b(zArr);
                        zArr[i5] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.f42476a.sink((File) this.f42494a.f42503d.get(i5)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return new C1617f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public final String f42500a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f42501b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f42502c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f42503d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f42504e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f42505f;

        /* renamed from: g, reason: collision with root package name */
        public Editor f42506g;

        /* renamed from: h, reason: collision with root package name */
        public int f42507h;

        /* renamed from: i, reason: collision with root package name */
        public long f42508i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f42509j;

        public Entry(DiskLruCache this$0, String key) {
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(key, "key");
            this.f42509j = this$0;
            this.f42500a = key;
            this.f42501b = new long[2];
            this.f42502c = new ArrayList();
            this.f42503d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            for (int i5 = 0; i5 < 2; i5++) {
                sb2.append(i5);
                this.f42502c.add(new File(this.f42509j.f42477b, sb2.toString()));
                sb2.append(".tmp");
                this.f42503d.add(new File(this.f42509j.f42477b, sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.cache.DiskLruCache$Entry$newSource$1] */
        public final Snapshot a() throws IOException {
            byte[] bArr = Util.f42438a;
            if (!this.f42504e) {
                return null;
            }
            final DiskLruCache diskLruCache = this.f42509j;
            if (!diskLruCache.f42486l && (this.f42506g != null || this.f42505f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f42501b.clone();
            int i5 = 0;
            while (i5 < 2) {
                int i10 = i5 + 1;
                try {
                    final C1615d c1615dSource = diskLruCache.f42476a.source((File) this.f42502c.get(i5));
                    if (!diskLruCache.f42486l) {
                        this.f42507h++;
                        c1615dSource = new o(c1615dSource) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1

                            /* renamed from: b, reason: collision with root package name */
                            public boolean f42510b;

                            @Override // cg.o, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() throws IOException {
                                super.close();
                                if (this.f42510b) {
                                    return;
                                }
                                this.f42510b = true;
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Entry entry = this;
                                synchronized (diskLruCache2) {
                                    int i11 = entry.f42507h - 1;
                                    entry.f42507h = i11;
                                    if (i11 == 0 && entry.f42505f) {
                                        diskLruCache2.D(entry);
                                    }
                                }
                            }
                        };
                    }
                    arrayList.add(c1615dSource);
                    i5 = i10;
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Util.c((H) it.next());
                    }
                    try {
                        diskLruCache.D(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new Snapshot(this.f42509j, this.f42500a, this.f42508i, arrayList, jArr);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Snapshot implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final String f42513a;

        /* renamed from: b, reason: collision with root package name */
        public final long f42514b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f42515c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f42516d;

        public Snapshot(DiskLruCache this$0, String key, long j8, ArrayList arrayList, long[] lengths) {
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(key, "key");
            AbstractC3340k.e(lengths, "lengths");
            this.f42516d = this$0;
            this.f42513a = key;
            this.f42514b = j8;
            this.f42515c = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Iterator it = this.f42515c.iterator();
            while (it.hasNext()) {
                Util.c((H) it.next());
            }
        }
    }

    static {
        new Companion(0);
        f42469t = "journal";
        f42470u = "journal.tmp";
        f42471v = "journal.bkp";
        f42472w = "libcore.io.DiskLruCache";
        f42473x = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        f42474y = -1L;
        f42475z = new i("[a-z0-9_-]{1,120}");
        f42465A = "CLEAN";
        f42466B = "DIRTY";
        f42467C = "REMOVE";
        f42468D = "READ";
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File directory, long j8, TaskRunner taskRunner) {
        AbstractC3340k.e(fileSystem, "fileSystem");
        AbstractC3340k.e(directory, "directory");
        AbstractC3340k.e(taskRunner, "taskRunner");
        this.f42476a = fileSystem;
        this.f42477b = directory;
        this.f42478c = j8;
        this.f42484i = new LinkedHashMap(0, 0.75f, true);
        this.f42492r = taskRunner.e();
        final String strK = AbstractC3340k.k(" Cache", Util.f42444g);
        this.f42493s = new Task(strK) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                DiskLruCache diskLruCache = this.f42517e;
                synchronized (diskLruCache) {
                    if (!diskLruCache.f42487m || diskLruCache.f42488n) {
                        return -1L;
                    }
                    try {
                        diskLruCache.J();
                    } catch (IOException unused) {
                        diskLruCache.f42489o = true;
                    }
                    try {
                        if (diskLruCache.o()) {
                            diskLruCache.B();
                            diskLruCache.f42485j = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.f42490p = true;
                        diskLruCache.f42483h = AbstractC1613b.c(new C1617f());
                    }
                    return -1L;
                }
            }
        };
        if (j8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f42479d = new File(directory, f42469t);
        this.f42480e = new File(directory, f42470u);
        this.f42481f = new File(directory, f42471v);
    }

    public static void P(String str) {
        if (!f42475z.b(str)) {
            throw new IllegalArgumentException(AbstractC3256n.f('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final synchronized void B() {
        try {
            C1609A c1609a = this.f42483h;
            if (c1609a != null) {
                c1609a.close();
            }
            C1609A c1609aC = AbstractC1613b.c(this.f42476a.sink(this.f42480e));
            try {
                c1609aC.writeUtf8(f42472w);
                c1609aC.writeByte(10);
                c1609aC.writeUtf8(f42473x);
                c1609aC.writeByte(10);
                c1609aC.writeDecimalLong(201105);
                c1609aC.writeByte(10);
                c1609aC.writeDecimalLong(2);
                c1609aC.writeByte(10);
                c1609aC.writeByte(10);
                Iterator it = this.f42484i.values().iterator();
                while (true) {
                    int i5 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    if (entry.f42506g != null) {
                        c1609aC.writeUtf8(f42466B);
                        c1609aC.writeByte(32);
                        c1609aC.writeUtf8(entry.f42500a);
                        c1609aC.writeByte(10);
                    } else {
                        c1609aC.writeUtf8(f42465A);
                        c1609aC.writeByte(32);
                        c1609aC.writeUtf8(entry.f42500a);
                        long[] jArr = entry.f42501b;
                        int length = jArr.length;
                        while (i5 < length) {
                            long j8 = jArr[i5];
                            i5++;
                            c1609aC.writeByte(32);
                            c1609aC.writeDecimalLong(j8);
                        }
                        c1609aC.writeByte(10);
                    }
                }
                c1609aC.close();
                if (this.f42476a.exists(this.f42479d)) {
                    this.f42476a.rename(this.f42479d, this.f42481f);
                }
                this.f42476a.rename(this.f42480e, this.f42479d);
                this.f42476a.delete(this.f42481f);
                this.f42483h = AbstractC1613b.c(new FaultHidingSink(this.f42476a.appendingSink(this.f42479d), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                this.k = false;
                this.f42490p = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void D(Entry entry) {
        C1609A c1609a;
        AbstractC3340k.e(entry, "entry");
        boolean z2 = this.f42486l;
        String str = entry.f42500a;
        if (!z2) {
            if (entry.f42507h > 0 && (c1609a = this.f42483h) != null) {
                c1609a.writeUtf8(f42466B);
                c1609a.writeByte(32);
                c1609a.writeUtf8(str);
                c1609a.writeByte(10);
                c1609a.flush();
            }
            if (entry.f42507h > 0 || entry.f42506g != null) {
                entry.f42505f = true;
                return;
            }
        }
        Editor editor = entry.f42506g;
        if (editor != null) {
            editor.c();
        }
        for (int i5 = 0; i5 < 2; i5++) {
            this.f42476a.delete((File) entry.f42502c.get(i5));
            long j8 = this.f42482g;
            long[] jArr = entry.f42501b;
            this.f42482g = j8 - jArr[i5];
            jArr[i5] = 0;
        }
        this.f42485j++;
        C1609A c1609a2 = this.f42483h;
        if (c1609a2 != null) {
            c1609a2.writeUtf8(f42467C);
            c1609a2.writeByte(32);
            c1609a2.writeUtf8(str);
            c1609a2.writeByte(10);
        }
        this.f42484i.remove(str);
        if (o()) {
            this.f42492r.c(this.f42493s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        D(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f42482g
            long r2 = r4.f42478c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f42484i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.f42505f
            if (r2 != 0) goto L12
            r4.D(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f42489o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.J():void");
    }

    public final synchronized void a() {
        if (this.f42488n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void b(Editor editor, boolean z2) {
        AbstractC3340k.e(editor, "editor");
        Entry entry = editor.f42494a;
        if (!AbstractC3340k.a(entry.f42506g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        int i5 = 0;
        if (z2 && !entry.f42504e) {
            int i10 = 0;
            while (i10 < 2) {
                int i11 = i10 + 1;
                boolean[] zArr = editor.f42495b;
                AbstractC3340k.b(zArr);
                if (!zArr[i10]) {
                    editor.a();
                    throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i10), "Newly created entry didn't create value for index "));
                }
                if (!this.f42476a.exists((File) entry.f42503d.get(i10))) {
                    editor.a();
                    return;
                }
                i10 = i11;
            }
        }
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 + 1;
            File file = (File) entry.f42503d.get(i12);
            if (!z2 || entry.f42505f) {
                this.f42476a.delete(file);
            } else if (this.f42476a.exists(file)) {
                File file2 = (File) entry.f42502c.get(i12);
                this.f42476a.rename(file, file2);
                long j8 = entry.f42501b[i12];
                long size = this.f42476a.size(file2);
                entry.f42501b[i12] = size;
                this.f42482g = (this.f42482g - j8) + size;
            }
            i12 = i13;
        }
        entry.f42506g = null;
        if (entry.f42505f) {
            D(entry);
            return;
        }
        this.f42485j++;
        C1609A c1609a = this.f42483h;
        AbstractC3340k.b(c1609a);
        if (entry.f42504e || z2) {
            entry.f42504e = true;
            c1609a.writeUtf8(f42465A);
            c1609a.writeByte(32);
            c1609a.writeUtf8(entry.f42500a);
            long[] jArr = entry.f42501b;
            int length = jArr.length;
            while (i5 < length) {
                long j10 = jArr[i5];
                i5++;
                c1609a.writeByte(32);
                c1609a.writeDecimalLong(j10);
            }
            c1609a.writeByte(10);
            if (z2) {
                long j11 = this.f42491q;
                this.f42491q = 1 + j11;
                entry.f42508i = j11;
            }
        } else {
            this.f42484i.remove(entry.f42500a);
            c1609a.writeUtf8(f42467C);
            c1609a.writeByte(32);
            c1609a.writeUtf8(entry.f42500a);
            c1609a.writeByte(10);
        }
        c1609a.flush();
        if (this.f42482g > this.f42478c || o()) {
            this.f42492r.c(this.f42493s, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f42487m && !this.f42488n) {
                Collection collectionValues = this.f42484i.values();
                AbstractC3340k.d(collectionValues, "lruEntries.values");
                int i5 = 0;
                Object[] array = collectionValues.toArray(new Entry[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                Entry[] entryArr = (Entry[]) array;
                int length = entryArr.length;
                while (i5 < length) {
                    Entry entry = entryArr[i5];
                    i5++;
                    Editor editor = entry.f42506g;
                    if (editor != null) {
                        editor.c();
                    }
                }
                J();
                C1609A c1609a = this.f42483h;
                AbstractC3340k.b(c1609a);
                c1609a.close();
                this.f42483h = null;
                this.f42488n = true;
                return;
            }
            this.f42488n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Editor d(long j8, String key) {
        try {
            AbstractC3340k.e(key, "key");
            i();
            a();
            P(key);
            Entry entry = (Entry) this.f42484i.get(key);
            if (j8 != f42474y && (entry == null || entry.f42508i != j8)) {
                return null;
            }
            if ((entry == null ? null : entry.f42506g) != null) {
                return null;
            }
            if (entry != null && entry.f42507h != 0) {
                return null;
            }
            if (!this.f42489o && !this.f42490p) {
                C1609A c1609a = this.f42483h;
                AbstractC3340k.b(c1609a);
                c1609a.writeUtf8(f42466B);
                c1609a.writeByte(32);
                c1609a.writeUtf8(key);
                c1609a.writeByte(10);
                c1609a.flush();
                if (this.k) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(this, key);
                    this.f42484i.put(key, entry);
                }
                Editor editor = new Editor(this, entry);
                entry.f42506g = editor;
                return editor;
            }
            this.f42492r.c(this.f42493s, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f42487m) {
            a();
            J();
            C1609A c1609a = this.f42483h;
            AbstractC3340k.b(c1609a);
            c1609a.flush();
        }
    }

    public final synchronized Snapshot h(String key) {
        AbstractC3340k.e(key, "key");
        i();
        a();
        P(key);
        Entry entry = (Entry) this.f42484i.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotA = entry.a();
        if (snapshotA == null) {
            return null;
        }
        this.f42485j++;
        C1609A c1609a = this.f42483h;
        AbstractC3340k.b(c1609a);
        c1609a.writeUtf8(f42468D);
        c1609a.writeByte(32);
        c1609a.writeUtf8(key);
        c1609a.writeByte(10);
        if (o()) {
            this.f42492r.c(this.f42493s, 0L);
        }
        return snapshotA;
    }

    public final synchronized void i() {
        boolean z2;
        try {
            byte[] bArr = Util.f42438a;
            if (this.f42487m) {
                return;
            }
            if (this.f42476a.exists(this.f42481f)) {
                if (this.f42476a.exists(this.f42479d)) {
                    this.f42476a.delete(this.f42481f);
                } else {
                    this.f42476a.rename(this.f42481f, this.f42479d);
                }
            }
            FileSystem fileSystem = this.f42476a;
            File file = this.f42481f;
            AbstractC3340k.e(fileSystem, "<this>");
            AbstractC3340k.e(file, "file");
            C1614c c1614cSink = fileSystem.sink(file);
            try {
                fileSystem.delete(file);
                c1614cSink.close();
                z2 = true;
            } catch (IOException unused) {
                c1614cSink.close();
                fileSystem.delete(file);
                z2 = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.n(c1614cSink, th);
                    throw th2;
                }
            }
            this.f42486l = z2;
            if (this.f42476a.exists(this.f42479d)) {
                try {
                    y();
                    w();
                    this.f42487m = true;
                    return;
                } catch (IOException e7) {
                    Platform.f42887a.getClass();
                    Platform platform = Platform.f42888b;
                    String str = "DiskLruCache " + this.f42477b + " is corrupt: " + ((Object) e7.getMessage()) + ", removing";
                    platform.getClass();
                    Platform.i(str, 5, e7);
                    try {
                        close();
                        this.f42476a.deleteContents(this.f42477b);
                        this.f42488n = false;
                    } catch (Throwable th3) {
                        this.f42488n = false;
                        throw th3;
                    }
                }
            }
            B();
            this.f42487m = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean o() {
        int i5 = this.f42485j;
        return i5 >= 2000 && i5 >= this.f42484i.size();
    }

    public final void w() {
        File file = this.f42480e;
        FileSystem fileSystem = this.f42476a;
        fileSystem.delete(file);
        Iterator it = this.f42484i.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3340k.d(next, "i.next()");
            Entry entry = (Entry) next;
            int i5 = 0;
            if (entry.f42506g == null) {
                while (i5 < 2) {
                    this.f42482g += entry.f42501b[i5];
                    i5++;
                }
            } else {
                entry.f42506g = null;
                while (i5 < 2) {
                    fileSystem.delete((File) entry.f42502c.get(i5));
                    fileSystem.delete((File) entry.f42503d.get(i5));
                    i5++;
                }
                it.remove();
            }
        }
    }

    public final void y() throws IOException {
        File file = this.f42479d;
        FileSystem fileSystem = this.f42476a;
        C1610B c1610bD = AbstractC1613b.d(fileSystem.source(file));
        try {
            String utf8LineStrict = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict2 = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict3 = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict4 = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict5 = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
            if (!AbstractC3340k.a(f42472w, utf8LineStrict) || !AbstractC3340k.a(f42473x, utf8LineStrict2) || !AbstractC3340k.a(String.valueOf(201105), utf8LineStrict3) || !AbstractC3340k.a(String.valueOf(2), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
            }
            int i5 = 0;
            while (true) {
                try {
                    z(c1610bD.readUtf8LineStrict(Long.MAX_VALUE));
                    i5++;
                } catch (EOFException unused) {
                    this.f42485j = i5 - this.f42484i.size();
                    if (c1610bD.exhausted()) {
                        this.f42483h = AbstractC1613b.c(new FaultHidingSink(fileSystem.appendingSink(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                    } else {
                        B();
                    }
                    c1610bD.close();
                    return;
                }
            }
        } finally {
        }
    }

    public final void z(String str) throws IOException {
        String strSubstring;
        int i5 = 0;
        int iV0 = k.v0(str, ' ', 0, 6);
        if (iV0 == -1) {
            throw new IOException(AbstractC3340k.k(str, "unexpected journal line: "));
        }
        int i10 = iV0 + 1;
        int iV02 = k.v0(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.f42484i;
        if (iV02 == -1) {
            strSubstring = str.substring(i10);
            AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f42467C;
            if (iV0 == str2.length() && r.k0(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iV02);
            AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = (Entry) linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iV02 != -1) {
            String str3 = f42465A;
            if (iV0 == str3.length() && r.k0(str, str3, false)) {
                String strSubstring2 = str.substring(iV02 + 1);
                AbstractC3340k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listH0 = k.H0(strSubstring2, new char[]{' '});
                entry.f42504e = true;
                entry.f42506g = null;
                int size = listH0.size();
                entry.f42509j.getClass();
                if (size != 2) {
                    throw new IOException(AbstractC3340k.k(listH0, "unexpected journal line: "));
                }
                try {
                    int size2 = listH0.size();
                    while (i5 < size2) {
                        int i11 = i5 + 1;
                        entry.f42501b[i5] = Long.parseLong((String) listH0.get(i5));
                        i5 = i11;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException(AbstractC3340k.k(listH0, "unexpected journal line: "));
                }
            }
        }
        if (iV02 == -1) {
            String str4 = f42466B;
            if (iV0 == str4.length() && r.k0(str, str4, false)) {
                entry.f42506g = new Editor(this, entry);
                return;
            }
        }
        if (iV02 == -1) {
            String str5 = f42468D;
            if (iV0 == str5.length() && r.k0(str, str5, false)) {
                return;
            }
        }
        throw new IOException(AbstractC3340k.k(str, "unexpected journal line: "));
    }
}
