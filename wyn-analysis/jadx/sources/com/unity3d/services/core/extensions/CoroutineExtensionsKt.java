package com.unity3d.services.core.extensions;

import Ef.E;
import Ef.H;
import Ef.K;
import Nf.a;
import Nf.e;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tf.p;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aB\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aB\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001aA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00032\u001e\b\u0004\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\";\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000ej\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Lkotlin/Function1;", "Ljf/c;", "", "block", "Lef/n;", "runSuspendCatching", "(Ltf/l;Ljf/c;)Ljava/lang/Object;", "runReturnSuspendCatching", "T", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, HandleInvocationsFromAdViewer.KEY_ACTION, "memoize", "(Ljava/lang/Object;Ltf/l;Ljf/c;)Ljava/lang/Object;", "Ljava/util/LinkedHashMap;", "LEf/K;", "Lkotlin/collections/LinkedHashMap;", "deferreds", "Ljava/util/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "LNf/a;", "mutex", "LNf/a;", "getMutex", "()LNf/a;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CoroutineExtensionsKt {

    @NotNull
    private static final LinkedHashMap<Object, K> deferreds = new CoroutineExtensionsKt$deferreds$1();

    @NotNull
    private static final a mutex = e.a();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ l $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, l lVar, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$key = obj;
            this.$action = lVar;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, interfaceC3103c);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super T> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            E e7;
            a mutex;
            l lVar;
            Object obj2;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            try {
                if (i5 == 0) {
                    Fe.e.U(obj);
                    e7 = (E) this.L$0;
                    mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    lVar = this.$action;
                    this.L$0 = e7;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = lVar;
                    this.label = 1;
                    if (mutex.b(this) != aVar) {
                        obj2 = obj3;
                    }
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return obj;
                }
                lVar = (l) this.L$3;
                obj2 = this.L$2;
                mutex = (a) this.L$1;
                e7 = (E) this.L$0;
                Fe.e.U(obj);
                LinkedHashMap<Object, K> deferreds = CoroutineExtensionsKt.getDeferreds();
                K kH = deferreds.get(obj2);
                if (kH == null) {
                    kH = H.h(e7, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3);
                    deferreds.put(obj2, kH);
                }
                K k = kH;
                mutex.a(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objAwait = k.await(this);
                return objAwait == aVar ? aVar : objAwait;
            } catch (Throwable th) {
                mutex.a(null);
                throw th;
            }
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            E e7 = (E) this.L$0;
            a mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            l lVar = this.$action;
            mutex.b(this);
            try {
                LinkedHashMap<Object, K> deferreds = CoroutineExtensionsKt.getDeferreds();
                K kH = deferreds.get(obj2);
                if (kH == null) {
                    kH = H.h(e7, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3);
                    deferreds.put(obj2, kH);
                }
                K k = kH;
                mutex.a(null);
                return k.await(this);
            } catch (Throwable th) {
                mutex.a(null);
                throw th;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @InterfaceC3466e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {49}, m = "runReturnSuspendCatching")
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1, reason: invalid class name */
    public static final class AnonymousClass1<R> extends AbstractC3464c {
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
            Object objRunReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
            return objRunReturnSuspendCatching == kf.a.f39711a ? objRunReturnSuspendCatching : new C2530n(objRunReturnSuspendCatching);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @InterfaceC3466e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {15}, m = "runSuspendCatching")
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23731<R> extends AbstractC3464c {
        int label;
        /* synthetic */ Object result;

        public C23731(InterfaceC3103c<? super C23731> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objRunSuspendCatching = CoroutineExtensionsKt.runSuspendCatching(null, this);
            return objRunSuspendCatching == kf.a.f39711a ? objRunSuspendCatching : new C2530n(objRunSuspendCatching);
        }
    }

    @NotNull
    public static final LinkedHashMap<Object, K> getDeferreds() {
        return deferreds;
    }

    @NotNull
    public static final a getMutex() {
        return mutex;
    }

    @Nullable
    public static final <T> Object memoize(@NotNull Object obj, @NotNull l lVar, @NotNull InterfaceC3103c<? super T> interfaceC3103c) {
        return H.l(new AnonymousClass2(obj, lVar, null), interfaceC3103c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object runReturnSuspendCatching(@org.jetbrains.annotations.NotNull tf.l r4, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2530n> r5) {
        /*
            boolean r0 = r5 instanceof com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1 r0 = (com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1 r0 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L51
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            Fe.e.U(r5)
            r0.label = r3     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L51
            java.lang.Object r5 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L51
            if (r5 != r1) goto L40
            return r1
        L3b:
            r4 = move-exception
            ef.m r5 = Fe.e.z(r4)
        L40:
            boolean r4 = r5 instanceof ef.C2529m
            if (r4 != 0) goto L45
            goto L50
        L45:
            java.lang.Throwable r4 = ef.C2530n.a(r5)
            if (r4 == 0) goto L50
            ef.m r4 = Fe.e.z(r4)
            return r4
        L50:
            return r5
        L51:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.CoroutineExtensionsKt.runReturnSuspendCatching(tf.l, jf.c):java.lang.Object");
    }

    private static final <R> Object runReturnSuspendCatching$$forInline(l lVar, InterfaceC3103c<? super C2530n> interfaceC3103c) {
        Object objZ;
        Throwable thA;
        try {
            objZ = lVar.invoke(interfaceC3103c);
        } catch (CancellationException e7) {
            throw e7;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        return ((objZ instanceof C2529m) && (thA = C2530n.a(objZ)) != null) ? Fe.e.z(thA) : objZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object runSuspendCatching(@org.jetbrains.annotations.NotNull tf.l r4, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2530n> r5) {
        /*
            boolean r0 = r5 instanceof com.unity3d.services.core.extensions.CoroutineExtensionsKt.C23731
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1 r0 = (com.unity3d.services.core.extensions.CoroutineExtensionsKt.C23731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1 r0 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L42
            return r5
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            Fe.e.U(r5)
            r0.label = r3     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L42
            java.lang.Object r4 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L42
            if (r4 != r1) goto L3b
            return r1
        L3b:
            return r4
        L3c:
            r4 = move-exception
            ef.m r4 = Fe.e.z(r4)
            return r4
        L42:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.CoroutineExtensionsKt.runSuspendCatching(tf.l, jf.c):java.lang.Object");
    }

    private static final <R> Object runSuspendCatching$$forInline(l lVar, InterfaceC3103c<? super C2530n> interfaceC3103c) {
        try {
            return lVar.invoke(interfaceC3103c);
        } catch (CancellationException e7) {
            throw e7;
        } catch (Throwable th) {
            return Fe.e.z(th);
        }
    }
}
