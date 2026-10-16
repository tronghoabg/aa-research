package com.unity3d.ads.core.data.repository;

import Af.f;
import Af.j;
import Af.n;
import Ef.A;
import Ef.D;
import Ef.D0;
import Ef.E;
import Ef.H;
import Fe.c;
import Fe.e;
import Hf.InterfaceC0592c0;
import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import ef.C2515C;
import ef.InterfaceC2525i;
import java.io.File;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import qf.h;
import tf.l;
import tf.p;
import tf.q;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018Jm\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2,\b\u0002\u0010'\u001a&\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\"H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001bH\u0002¢\u0006\u0004\b,\u0010-Ja\u0010.\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2*\u0010'\u001a&\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u00020(2\u0006\u00103\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b;\u00105J\u0015\u0010<\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020%H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0004\b@\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCacheRepository;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "LEf/A;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "getCacheDirectory", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "localCacheDataSource", "remoteCacheDataSource", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "cleanupDirectory", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "downloadPriorityQueue", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "getAssetFileName", "<init>", "(LEf/A;Lcom/unity3d/ads/core/domain/GetCacheDirectory;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/services/core/network/domain/CleanupDirectory;Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "Ljava/io/File;", "cacheDirectory", "", "url", "Lorg/json/JSONArray;", "headers", "", "priority", "intervalMs", "Lkotlin/Function3;", "", "Ljf/c;", "Lef/C;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFileInternal", "(Ljava/io/File;Ljava/lang/String;Lorg/json/JSONArray;IILtf/q;Ljf/c;)Ljava/lang/Object;", "dirName", "initCacheDir", "(Ljava/lang/String;)Ljava/io/File;", "getFile", "(Ljava/lang/String;Lorg/json/JSONArray;IILtf/q;Ljf/c;)Ljava/lang/Object;", "type", "getWebviewFile", "(Ljava/lang/String;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "fileName", "retrieveFile", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/CachedFile;", "cachedFile", "", "removeFile", "(Lcom/unity3d/ads/core/data/model/CachedFile;)Z", "doesFileExist", "getFilename", "(Ljava/lang/String;)Ljava/lang/String;", "clearCache", "(Ljf/c;)Ljava/lang/Object;", "getCacheSize", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "Lcom/unity3d/ads/core/domain/CreateFile;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "LEf/E;", "scope", "LEf/E;", "cacheDir$delegate", "Lef/i;", "getCacheDir", "()Ljava/io/File;", "cacheDir", "webviewCacheDir$delegate", "getWebviewCacheDir", "webviewCacheDir", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidCacheRepository implements CacheRepository {

    /* renamed from: cacheDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC2525i cacheDir;

    @NotNull
    private final CleanupDirectory cleanupDirectory;

    @NotNull
    private final Context context;

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final DownloadPriorityQueue downloadPriorityQueue;

    @NotNull
    private final GetAssetFileName getAssetFileName;

    @NotNull
    private final GetCacheDirectory getCacheDirectory;

    @NotNull
    private final CacheDataSource localCacheDataSource;

    @NotNull
    private final CacheDataSource remoteCacheDataSource;

    @NotNull
    private final E scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    /* renamed from: webviewCacheDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC2525i webviewCacheDir;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {124}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        long J$0;
        boolean Z$0;
        int label;

        public AnonymousClass2(InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidCacheRepository.this.new AnonymousClass2(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0199 A[Catch: Exception -> 0x0197, TryCatch #1 {Exception -> 0x0197, blocks: (B:40:0x0160, B:43:0x0171, B:51:0x01b2, B:46:0x0199, B:48:0x01a5, B:50:0x01aa), top: B:61:0x0160 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01a5 A[Catch: Exception -> 0x0197, TryCatch #1 {Exception -> 0x0197, blocks: (B:40:0x0160, B:43:0x0171, B:51:0x01b2, B:46:0x0199, B:48:0x01a5, B:50:0x01aa), top: B:61:0x0160 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r28) {
            /*
                Method dump skipped, instructions count: 556
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", l = {115}, m = "doesFileExist")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "", "<anonymous>", "(LEf/E;)J"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22922 extends AbstractC3471j implements p {
        int label;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
        public /* synthetic */ class AnonymousClass1 extends C3338i implements l {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @Override // tf.l
            @NotNull
            public final Boolean invoke(@NotNull File p02) {
                AbstractC3340k.e(p02, "p0");
                return Boolean.valueOf(p02.isFile());
            }
        }

        public C22922(InterfaceC3103c<? super C22922> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidCacheRepository.this.new C22922(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super Long> interfaceC3103c) {
            return ((C22922) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            File cacheDir = AndroidCacheRepository.this.getCacheDir();
            h hVar = h.f44276a;
            AbstractC3340k.e(cacheDir, "<this>");
            f fVar = new f(n.V(new j(cacheDir), AnonymousClass1.INSTANCE));
            long length = 0;
            while (fVar.hasNext()) {
                length += ((File) fVar.next()).length();
            }
            return new Long(length);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {85, 92, 104}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22932 extends AbstractC3471j implements p {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ q $onProgress;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {94, 100}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3471j implements l {
            final /* synthetic */ File $cacheDirectory;
            final /* synthetic */ InterfaceC0592c0 $fileResult;
            final /* synthetic */ String $filename;
            final /* synthetic */ int $intervalMs;
            final /* synthetic */ q $onProgress;
            final /* synthetic */ int $priority;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i5, InterfaceC0592c0 interfaceC0592c0, int i10, q qVar, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
                super(1, interfaceC3103c);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i5;
                this.$fileResult = interfaceC0592c0;
                this.$intervalMs = i10;
                this.$onProgress = qVar;
            }

            @Override // lf.AbstractC3462a
            @NotNull
            public final InterfaceC3103c<C2515C> create(@NotNull InterfaceC3103c<?> interfaceC3103c) {
                return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, this.$intervalMs, this.$onProgress, interfaceC3103c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
            
                if (r0 == r10) goto L21;
             */
            @Override // lf.AbstractC3462a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                /*
                    r13 = this;
                    kf.a r10 = kf.a.f39711a
                    int r0 = r13.label
                    ef.C r11 = ef.C2515C.f34653a
                    r12 = 2
                    r1 = 1
                    if (r0 == 0) goto L21
                    if (r0 == r1) goto L1c
                    if (r0 != r12) goto L14
                    Fe.e.U(r14)
                    r0 = r14
                    goto L85
                L14:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1c:
                    Fe.e.U(r14)
                    r0 = r14
                    goto L4a
                L21:
                    Fe.e.U(r14)
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r13.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                    java.io.File r2 = r13.$cacheDirectory
                    r3 = r2
                    java.lang.String r2 = r13.$filename
                    r4 = r3
                    java.lang.String r3 = r13.$url
                    int r5 = r13.$priority
                    r6 = r4
                    java.lang.Integer r4 = new java.lang.Integer
                    r4.<init>(r5)
                    r13.label = r1
                    r5 = 0
                    r1 = r6
                    r6 = 0
                    r8 = 48
                    r9 = 0
                    r7 = r13
                    java.lang.Object r0 = com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    if (r0 != r10) goto L4a
                    goto L84
                L4a:
                    com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                    boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                    if (r1 == 0) goto L63
                    Hf.c0 r1 = r13.$fileResult
                L52:
                    r2 = r1
                    Hf.x0 r2 = (Hf.x0) r2
                    java.lang.Object r3 = r2.getValue()
                    r4 = r3
                    com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                    boolean r2 = r2.i(r3, r0)
                    if (r2 == 0) goto L52
                    return r11
                L63:
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r13.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r0)
                    java.io.File r1 = r13.$cacheDirectory
                    java.lang.String r2 = r13.$filename
                    java.lang.String r3 = r13.$url
                    int r4 = r13.$priority
                    java.lang.Integer r5 = new java.lang.Integer
                    r5.<init>(r4)
                    r4 = r5
                    int r5 = r13.$intervalMs
                    tf.q r6 = r13.$onProgress
                    r13.label = r12
                    r7 = r13
                    java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5, r6, r7)
                    if (r0 != r10) goto L85
                L84:
                    return r10
                L85:
                    com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                    Hf.c0 r1 = r13.$fileResult
                L89:
                    r2 = r1
                    Hf.x0 r2 = (Hf.x0) r2
                    java.lang.Object r3 = r2.getValue()
                    r4 = r3
                    com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                    boolean r2 = r2.i(r3, r0)
                    if (r2 == 0) goto L89
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C22932.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // tf.l
            @Nullable
            public final Object invoke(@Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return ((AnonymousClass1) create(interfaceC3103c)).invokeSuspend(C2515C.f34653a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22932(String str, File file, int i5, int i10, q qVar, InterfaceC3103c<? super C22932> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i5;
            this.$intervalMs = i10;
            this.$onProgress = qVar;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidCacheRepository.this.new C22932(this.$url, this.$cacheDirectory, this.$priority, this.$intervalMs, this.$onProgress, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super CacheResult> interfaceC3103c) {
            return ((C22932) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
            /*
                r24 = this;
                r7 = r24
                kf.a r10 = kf.a.f39711a
                int r0 = r7.label
                r11 = 0
                r12 = 3
                r13 = 2
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 == r1) goto L27
                if (r0 == r13) goto L1e
                if (r0 != r12) goto L16
                Fe.e.U(r25)
                return r25
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r7.L$0
                Hf.c0 r0 = (Hf.InterfaceC0592c0) r0
                Fe.e.U(r25)
                goto La2
            L27:
                java.lang.Object r0 = r7.L$0
                java.lang.String r0 = (java.lang.String) r0
                Fe.e.U(r25)
                r17 = r0
                r0 = r25
                goto L64
            L33:
                Fe.e.U(r25)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.lang.String r2 = r7.$url
                java.lang.String r2 = r0.getFilename(r2)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                java.io.File r3 = r7.$cacheDirectory
                r4 = r3
                java.lang.String r3 = r7.$url
                int r5 = r7.$priority
                r6 = r4
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r5)
                r7.L$0 = r2
                r7.label = r1
                r8 = 48
                r9 = 0
                r5 = 0
                r1 = r6
                r6 = 0
                java.lang.Object r0 = com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r10) goto L62
                goto Lb2
            L62:
                r17 = r2
            L64:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L6b
                return r0
            L6b:
                Hf.x0 r20 = Hf.k0.c(r11)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.domain.work.DownloadPriorityQueue r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r0)
                int r1 = r7.$priority
                com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r14 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r15 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.io.File r2 = r7.$cacheDirectory
                java.lang.String r3 = r7.$url
                int r4 = r7.$intervalMs
                tf.q r5 = r7.$onProgress
                r23 = 0
                r19 = r1
                r16 = r2
                r18 = r3
                r21 = r4
                r22 = r5
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
                r2 = r19
                r1 = r20
                r7.L$0 = r1
                r7.label = r13
                java.lang.Object r0 = r0.invoke(r2, r14, r7)
                if (r0 != r10) goto La1
                goto Lb2
            La1:
                r0 = r1
            La2:
                Hf.A r1 = new Hf.A
                r2 = 1
                r1.<init>(r0, r2)
                r7.L$0 = r11
                r7.label = r12
                java.lang.Object r0 = Hf.k0.o(r1, r7)
                if (r0 != r10) goto Lb3
            Lb2:
                return r10
            Lb3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C22932.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidCacheRepository(@NotNull A ioDispatcher, @NotNull GetCacheDirectory getCacheDirectory, @NotNull CacheDataSource localCacheDataSource, @NotNull CacheDataSource remoteCacheDataSource, @NotNull Context context, @NotNull SessionRepository sessionRepository, @NotNull CleanupDirectory cleanupDirectory, @NotNull DownloadPriorityQueue downloadPriorityQueue, @NotNull CreateFile createFile, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetAssetFileName getAssetFileName) {
        AbstractC3340k.e(ioDispatcher, "ioDispatcher");
        AbstractC3340k.e(getCacheDirectory, "getCacheDirectory");
        AbstractC3340k.e(localCacheDataSource, "localCacheDataSource");
        AbstractC3340k.e(remoteCacheDataSource, "remoteCacheDataSource");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(cleanupDirectory, "cleanupDirectory");
        AbstractC3340k.e(downloadPriorityQueue, "downloadPriorityQueue");
        AbstractC3340k.e(createFile, "createFile");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC3340k.e(getAssetFileName, "getAssetFileName");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
        this.scope = H.F(H.F(H.c(ioDispatcher), new D("CacheRepository")), D0.f3661a);
        this.cacheDir = c.z(new AndroidCacheRepository$cacheDir$2(this));
        this.webviewCacheDir = c.z(new AndroidCacheRepository$webviewCacheDir$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i5, int i10, q qVar, InterfaceC3103c<? super CacheResult> interfaceC3103c) {
        return H.P(this.scope.getCoroutineContext(), new C22932(str, file, i5, i10, qVar, null), interfaceC3103c);
    }

    public static /* synthetic */ Object getFileInternal$default(AndroidCacheRepository androidCacheRepository, File file, String str, JSONArray jSONArray, int i5, int i10, q qVar, InterfaceC3103c interfaceC3103c, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            qVar = null;
        }
        return androidCacheRepository.getFileInternal(file, str, jSONArray, i5, i12, qVar, interfaceC3103c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getWebviewCacheDir() {
        return (File) this.webviewCacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File initCacheDir(String dirName) {
        File baseDir = this.sessionRepository.getFeatureFlags().getUseFilesDir() ? this.context.getFilesDir() : this.context.getCacheDir();
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        AbstractC3340k.d(baseDir, "baseDir");
        File fileInvoke = getCacheDirectory.invoke(baseDir, dirName);
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object clearCache(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) throws Throwable {
        Object objP = H.P(this.scope.getCoroutineContext(), new AnonymousClass2(null), interfaceC3103c);
        return objP == a.f39711a ? objP : C2515C.f34653a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doesFileExist(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r6)
            r0.label = r3
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            boolean r5 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getCacheSize(@NotNull InterfaceC3103c<? super Long> interfaceC3103c) {
        return H.P(this.scope.getCoroutineContext(), new C22922(null), interfaceC3103c);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i5, int i10, @Nullable q qVar, @NotNull InterfaceC3103c<? super CacheResult> interfaceC3103c) {
        return getFileInternal(getCacheDir(), str, jSONArray, i5, i10, qVar, interfaceC3103c);
    }

    @NotNull
    public final String getFilename(@NotNull String url) {
        AbstractC3340k.e(url, "url");
        return this.getAssetFileName.invoke(url);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getWebviewFile(@NotNull String str, @NotNull String str2, @NotNull InterfaceC3103c<? super CacheResult> interfaceC3103c) {
        File fileInvoke = this.createFile.invoke(getWebviewCacheDir(), str2);
        fileInvoke.mkdirs();
        return getFileInternal$default(this, fileInvoke, str, null, 0, 0, null, interfaceC3103c, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(@NotNull CachedFile cachedFile) {
        AbstractC3340k.e(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            return file.delete();
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object retrieveFile(@NotNull String str, @NotNull InterfaceC3103c<? super CacheResult> interfaceC3103c) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, getCacheDir(), str, null, null, 0, null, interfaceC3103c, 60, null);
    }
}
