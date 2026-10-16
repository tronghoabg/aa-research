package com.unity3d.ads.core.data.datasource;

import Ef.A;
import Ef.E;
import Ef.H;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import java.io.File;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;
import tf.q;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJk\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00132*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJk\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00132*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "LEf/A;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "getFileExtensionFromUrl", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(LEf/A;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Ljava/io/File;", "cachePath", "", "fileName", "url", "", "priority", "intervalMs", "Lkotlin/Function3;", "", "Ljf/c;", "Lef/C;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFileInternal", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILtf/q;Ljf/c;)Ljava/lang/Object;", "getFile", "LEf/A;", "Lcom/unity3d/ads/core/domain/CreateFile;", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final A ioDispatcher;

    @NotNull
    private final SessionRepository sessionRepository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2", f = "AndroidRemoteCacheDataSource.kt", l = {78, 79, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ File $cachePath;
        final /* synthetic */ String $fileName;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ q $onProgress;
        final /* synthetic */ Integer $priority;
        final /* synthetic */ String $url;
        int I$0;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ AndroidRemoteCacheDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, int i5, q qVar, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$url = str;
            this.this$0 = androidRemoteCacheDataSource;
            this.$cachePath = file;
            this.$fileName = str2;
            this.$priority = num;
            this.$intervalMs = i5;
            this.$onProgress = qVar;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, this.$intervalMs, this.$onProgress, interfaceC3103c);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super CacheResult> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x038d, code lost:
        
            r9 = new java.lang.Long(r24 + r5.f39738a);
            r14 = new java.lang.Long(r6);
            r42.L$0 = r8;
            r42.L$1 = r3;
            r42.L$2 = r13;
            r42.L$3 = r12;
            r42.L$4 = r5;
            r42.L$5 = r4;
            r42.L$6 = r2;
            r42.L$7 = r11;
            r42.L$8 = r28;
            r42.L$9 = r10;
            r42.L$10 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x03b6, code lost:
        
            r28 = r3;
            r3 = r27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x03ba, code lost:
        
            r42.L$11 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x03bc, code lost:
        
            r27 = r4;
            r4 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x03c0, code lost:
        
            r42.L$12 = r4;
            r26 = r0;
            r42.L$13 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x03c8, code lost:
        
            r29 = r12;
            r30 = r13;
            r12 = r24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x03ce, code lost:
        
            r42.J$0 = r12;
            r42.J$1 = r6;
            r0 = r22;
            r42.I$0 = r0;
            r42.label = 3;
            r9 = r2.invoke(r9, r14, r42);
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x03e1, code lost:
        
            r14 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x03e3, code lost:
        
            if (r9 != r14) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x03e6, code lost:
        
            r21 = r4;
            r24 = r12;
            r9 = r28;
            r0 = r0;
            r4 = r27;
            r22 = r28;
            r12 = r29;
            r13 = r30;
            r15 = r9;
            r43 = r2;
            r27 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x044a, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x0455, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x0456, code lost:
        
            r29 = r12;
            r30 = r13;
            r12 = r24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x045d, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x045e, code lost:
        
            r29 = r12;
            r30 = r13;
            r12 = r24;
            r4 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x04a8, code lost:
        
            r28 = r3;
            r29 = r12;
            r30 = r13;
            r12 = r24;
            r3 = r27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x04b5, code lost:
        
            Ba.c.n(r26, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x04b8, code lost:
        
            Ba.c.n(r3, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x04bb, code lost:
        
            Ba.c.n(r11, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x04be, code lost:
        
            r6 = r12;
            r0 = r23;
            r3 = r28;
            r12 = r29;
            r13 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x04c9, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x04ca, code lost:
        
            r6 = r12;
            r3 = r28;
            r12 = r29;
            r13 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x04d3, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x04d4, code lost:
        
            r2 = r0;
            r15 = r5;
            r6 = r12;
            r4 = r28;
            r10 = r29;
            r22 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x04de, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x04df, code lost:
        
            r2 = r0;
            r15 = r5;
            r6 = r12;
            r4 = r28;
            r10 = r29;
            r25 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x0531, code lost:
        
            return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:186:0x0538, code lost:
        
            if (r12.getStatusCode() != 206) goto L190;
         */
        /* JADX WARN: Code restructure failed: missing block: B:197:0x0567, code lost:
        
            r2 = new java.io.File(r42.$cachePath, r42.$fileName);
         */
        /* JADX WARN: Code restructure failed: missing block: B:199:0x0574, code lost:
        
            if (r2.exists() != false) goto L200;
         */
        /* JADX WARN: Code restructure failed: missing block: B:204:0x0584, code lost:
        
            throw new java.lang.IllegalStateException("Final file exists and could not be deleted before overwriting");
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x0585, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:208:0x058b, code lost:
        
            if (r3.renameTo(r2) != false) goto L209;
         */
        /* JADX WARN: Code restructure failed: missing block: B:210:0x0591, code lost:
        
            if (r13.exists() != false) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:215:0x05a1, code lost:
        
            throw new java.lang.IllegalStateException("Could not delete Etag file after successful download");
         */
        /* JADX WARN: Code restructure failed: missing block: B:216:0x05a2, code lost:
        
            r0 = r23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:218:0x05ac, code lost:
        
            throw new java.lang.IllegalStateException("Could not rename temporary file to final file");
         */
        /* JADX WARN: Code restructure failed: missing block: B:219:0x05ad, code lost:
        
            r0 = Fe.e.z(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:220:0x05b1, code lost:
        
            r0 = ef.C2530n.a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:221:0x05b5, code lost:
        
            if (r0 != null) goto L222;
         */
        /* JADX WARN: Code restructure failed: missing block: B:223:0x05c0, code lost:
        
            return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.FILE_STATE_WRONG, com.unity3d.ads.core.data.model.CacheSource.REMOTE, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:224:0x05c1, code lost:
        
            r0 = r42.$url;
            r3 = r42.$fileName;
            r4 = r42.this$0.getFileExtensionFromUrl.invoke(r42.$url);
         */
        /* JADX WARN: Code restructure failed: missing block: B:225:0x05d3, code lost:
        
            if (r4 == null) goto L226;
         */
        /* JADX WARN: Code restructure failed: missing block: B:226:0x05d5, code lost:
        
            r28 = r20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:227:0x05d8, code lost:
        
            r28 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:228:0x05da, code lost:
        
            r4 = r5.f39738a;
            r31 = r12.getProtocol();
            r6 = r42.$priority;
         */
        /* JADX WARN: Code restructure failed: missing block: B:229:0x05e3, code lost:
        
            if (r6 != null) goto L230;
         */
        /* JADX WARN: Code restructure failed: missing block: B:230:0x05e5, code lost:
        
            r32 = r6.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:232:0x05f4, code lost:
        
            r32 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
         */
        /* JADX WARN: Code restructure failed: missing block: B:234:0x0604, code lost:
        
            return new com.unity3d.ads.core.data.model.CacheResult.Success(new com.unity3d.ads.core.data.model.CachedFile(r0, r3, r2, r28, r4, r31, r32), com.unity3d.ads.core.data.model.CacheSource.REMOTE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:236:0x0611, code lost:
        
            return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, null, 4, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:281:?, code lost:
        
            return r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x025a, code lost:
        
            if (r0 == r3) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x036a A[Catch: all -> 0x0467, TryCatch #4 {all -> 0x0467, blocks: (B:102:0x035f, B:104:0x036a, B:106:0x037b, B:111:0x038d), top: B:246:0x035f }] */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0528  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0532  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x04a8 A[EDGE_INSN: B:278:0x04a8->B:146:0x04a8 BREAK  A[LOOP:0: B:246:0x035f->B:145:0x048f], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02d6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02da  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02dd  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02ee  */
        /* JADX WARN: Type inference failed for: r12v38, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r13v23, types: [cg.h] */
        /* JADX WARN: Type inference failed for: r15v22, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r9v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x03e6 -> B:242:0x03fb). Please report as a decompilation issue!!! */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r43) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 1567
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidRemoteCacheDataSource(@NotNull A ioDispatcher, @NotNull CreateFile createFile, @NotNull GetFileExtensionFromUrl getFileExtensionFromUrl, @NotNull HttpClientProvider httpClientProvider, @NotNull SessionRepository sessionRepository) {
        AbstractC3340k.e(ioDispatcher, "ioDispatcher");
        AbstractC3340k.e(createFile, "createFile");
        AbstractC3340k.e(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        AbstractC3340k.e(httpClientProvider, "httpClientProvider");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, String str2, Integer num, int i5, q qVar, InterfaceC3103c<? super CacheResult> interfaceC3103c) {
        return H.P(this.ioDispatcher, new AnonymousClass2(str2, this, file, str, num, i5, qVar, null), interfaceC3103c);
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    @Nullable
    public Object getFile(@NotNull File file, @NotNull String str, @Nullable String str2, @Nullable Integer num, int i5, @Nullable q qVar, @NotNull InterfaceC3103c<? super CacheResult> interfaceC3103c) {
        return getFileInternal(file, str, str2, num, i5, qVar, interfaceC3103c);
    }
}
