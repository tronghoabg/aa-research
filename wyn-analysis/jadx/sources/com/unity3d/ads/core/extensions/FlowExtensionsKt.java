package com.unity3d.ads.core.extensions;

import Ef.E;
import Fe.e;
import Gf.s;
import Gf.t;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.k0;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3330a;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ab\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"T", "LHf/l;", "", "timeoutMillis", "", "active", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lef/C;", "Ljf/c;", "", "block", "timeoutAfter", "(LHf/l;JZLtf/p;)LHf/l;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlowExtensionsKt {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LGf/t;", "Lef/C;", "<anonymous>", "(LGf/t;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ boolean $active;
        final /* synthetic */ p $block;
        final /* synthetic */ InterfaceC0602l $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02011 extends AbstractC3471j implements p {
            final /* synthetic */ t $$this$channelFlow;
            final /* synthetic */ InterfaceC0602l $this_timeoutAfter;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02011(InterfaceC0602l interfaceC0602l, t tVar, InterfaceC3103c<? super C02011> interfaceC3103c) {
                super(2, interfaceC3103c);
                this.$this_timeoutAfter = interfaceC0602l;
                this.$$this$channelFlow = tVar;
            }

            @Override // lf.AbstractC3462a
            @NotNull
            public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
                return new C02011(this.$this_timeoutAfter, this.$$this$channelFlow, interfaceC3103c);
            }

            @Override // tf.p
            @Nullable
            public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return ((C02011) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
            }

            @Override // lf.AbstractC3462a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f39711a;
                int i5 = this.label;
                if (i5 == 0) {
                    e.U(obj);
                    InterfaceC0602l interfaceC0602l = this.$this_timeoutAfter;
                    final t tVar = this.$$this$channelFlow;
                    InterfaceC0603m interfaceC0603m = new InterfaceC0603m() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        @Override // Hf.InterfaceC0603m
                        @Nullable
                        public final Object emit(T t10, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
                            Object objI = ((s) tVar).f4839d.i(t10, interfaceC3103c);
                            return objI == a.f39711a ? objI : C2515C.f34653a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC0602l.collect(interfaceC0603m, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.U(obj);
                }
                ((s) this.$$this$channelFlow).b0(null);
                return C2515C.f34653a;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        public /* synthetic */ class AnonymousClass2 extends C3330a implements tf.a {
            public AnonymousClass2(Object obj) {
                super(0, obj, t.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // tf.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m278invoke();
                return C2515C.f34653a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m278invoke() {
                ((s) ((t) this.receiver)).b0(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j8, boolean z2, p pVar, InterfaceC0602l interfaceC0602l, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$timeoutMillis = j8;
            this.$active = z2;
            this.$block = pVar;
            this.$this_timeoutAfter = interfaceC0602l;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, interfaceC3103c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull t tVar, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(tVar, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            if (r8.invoke(r4, r7) == r0) goto L17;
         */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                kf.a r0 = kf.a.f39711a
                int r1 = r7.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                Fe.e.U(r8)
                goto L57
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                java.lang.Object r1 = r7.L$0
                Gf.t r1 = (Gf.t) r1
                Fe.e.U(r8)
                goto L41
            L21:
                Fe.e.U(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                Gf.t r1 = (Gf.t) r1
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
                Hf.l r5 = r7.$this_timeoutAfter
                r8.<init>(r5, r1, r2)
                r5 = 3
                Ef.H.D(r1, r2, r8, r5)
                long r5 = r7.$timeoutMillis
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = Ef.H.m(r5, r7)
                if (r8 != r0) goto L41
                goto L56
            L41:
                boolean r8 = r7.$active
                if (r8 == 0) goto L57
                tf.p r8 = r7.$block
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r4 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
                r4.<init>(r1)
                r7.L$0 = r2
                r7.label = r3
                java.lang.Object r8 = r8.invoke(r4, r7)
                if (r8 != r0) goto L57
            L56:
                return r0
            L57:
                ef.C r8 = ef.C2515C.f34653a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> InterfaceC0602l timeoutAfter(@NotNull InterfaceC0602l interfaceC0602l, long j8, boolean z2, @NotNull p block) {
        AbstractC3340k.e(interfaceC0602l, "<this>");
        AbstractC3340k.e(block, "block");
        return k0.j(new AnonymousClass1(j8, z2, block, interfaceC0602l, null));
    }

    public static /* synthetic */ InterfaceC0602l timeoutAfter$default(InterfaceC0602l interfaceC0602l, long j8, boolean z2, p pVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z2 = true;
        }
        return timeoutAfter(interfaceC0602l, j8, z2, pVar);
    }
}
