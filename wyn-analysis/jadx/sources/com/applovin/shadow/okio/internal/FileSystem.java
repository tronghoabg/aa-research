package com.applovin.shadow.okio.internal;

import Af.k;
import Af.m;
import Af.o;
import Fe.e;
import S3.f;
import cb.AbstractC1593a;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Path;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ff.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.AbstractC3470i;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aK\u0010 \u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/applovin/shadow/okio/FileSystem;", "Lcom/applovin/shadow/okio/Path;", "path", "Lcom/applovin/shadow/okio/FileMetadata;", "commonMetadata", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "", "commonExists", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Z", "dir", "mustCreate", "Lef/C;", "commonCreateDirectories", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;Z)V", "source", "target", "commonCopy", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", "fileOrDirectory", "mustExist", "commonDeleteRecursively", "followSymlinks", "LAf/k;", "commonListRecursively", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;Z)LAf/k;", "symlinkTarget", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "LAf/m;", "fileSystem", "Lff/l;", "stack", "postorder", "collectRecursively", "(LAf/m;Lcg/m;Lff/l;Lcg/y;ZZLjf/c;)Ljava/lang/Object;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes.dex */
public final class FileSystem {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @InterfaceC3466e(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE, 145}, m = "collectRecursively")
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
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
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAf/m;", "Lcom/applovin/shadow/okio/Path;", "Lef/C;", "<anonymous>", "(LAf/m;)V"}, k = 3, mv = {1, 9, 0})
    @InterfaceC3466e(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16831 extends AbstractC3470i implements p {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16831(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z2, InterfaceC3103c<? super C16831> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z2;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            C16831 c16831 = new C16831(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, interfaceC3103c);
            c16831.L$0 = obj;
            return c16831;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull m mVar, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C16831) create(mVar, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            m mVar;
            l lVar;
            Iterator<Path> it;
            a aVar = a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                m mVar2 = (m) this.L$0;
                l lVar2 = new l();
                lVar2.addLast(this.$dir);
                mVar = mVar2;
                lVar = lVar2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                l lVar3 = (l) this.L$1;
                mVar = (m) this.L$0;
                e.U(obj);
                lVar = lVar3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                com.applovin.shadow.okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z2 = this.$followSymlinks;
                this.L$0 = mVar;
                this.L$1 = lVar;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(mVar, fileSystem, lVar, next, z2, false, this) == aVar) {
                    return aVar;
                }
            }
            return C2515C.f34653a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ff.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull Af.m r17, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.FileSystem r18, @org.jetbrains.annotations.NotNull ff.l r19, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Path r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.collectRecursively(Af.m, com.applovin.shadow.okio.FileSystem, ff.l, com.applovin.shadow.okio.Path, boolean, boolean, jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.FileSystem r4, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Path r5, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Path r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r0)
            com.applovin.shadow.okio.Source r5 = r4.source(r5)
            r0 = 0
            com.applovin.shadow.okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L3a
            com.applovin.shadow.okio.BufferedSink r4 = com.applovin.shadow.okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L3a
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3e
        L2c:
            r4 = r0
            goto L3e
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L3c
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r4 = move-exception
            Fe.b.d(r6, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r4 = move-exception
            goto L54
        L3c:
            r4 = r6
            r6 = r0
        L3e:
            if (r4 != 0) goto L53
            kotlin.jvm.internal.AbstractC3340k.b(r6)     // Catch: java.lang.Throwable -> L3a
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r0 = move-exception
            goto L61
        L53:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L54:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            Fe.b.d(r4, r5)
        L5e:
            r3 = r0
            r0 = r4
            r4 = r3
        L61:
            if (r0 != 0) goto L67
            kotlin.jvm.internal.AbstractC3340k.b(r4)
            return
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.commonCopy(com.applovin.shadow.okio.FileSystem, com.applovin.shadow.okio.Path, com.applovin.shadow.okio.Path):void");
    }

    public static final void commonCreateDirectories(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path dir, boolean z2) throws IOException {
        AbstractC3340k.e(fileSystem, "<this>");
        AbstractC3340k.e(dir, "dir");
        l lVar = new l();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            lVar.addFirst(pathParent);
        }
        if (z2 && lVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = lVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path fileOrDirectory, boolean z2) throws IOException {
        AbstractC3340k.e(fileSystem, "<this>");
        AbstractC3340k.e(fileOrDirectory, "fileOrDirectory");
        Af.l lVarX = f.x(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null));
        while (lVarX.hasNext()) {
            fileSystem.delete((Path) lVarX.next(), z2 && !lVarX.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        AbstractC3340k.e(fileSystem, "<this>");
        AbstractC3340k.e(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final k commonListRecursively(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path dir, boolean z2) throws IOException {
        AbstractC3340k.e(fileSystem, "<this>");
        AbstractC3340k.e(dir, "dir");
        return new o(new C16831(dir, fileSystem, z2, null));
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        AbstractC3340k.e(fileSystem, "<this>");
        AbstractC3340k.e(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(AbstractC1593a.i(path, "no such file: "));
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        AbstractC3340k.e(fileSystem, "<this>");
        AbstractC3340k.e(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        AbstractC3340k.b(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
