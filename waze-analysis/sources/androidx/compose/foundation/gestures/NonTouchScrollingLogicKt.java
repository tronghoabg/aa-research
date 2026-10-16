package androidx.compose.foundation.gestures;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.m.h;
import h.m.j;
import h.m.k;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NonTouchScrollingLogicKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ o $this_busyReceive;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(o oVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_busyReceive = oVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_busyReceive, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            br brVar;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                brVar = (br) this.L$0;
                try {
                    c.b(obj);
                    brVar.s(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    brVar.s(null);
                    throw th;
                }
            }
            c.b(obj);
            br brVarZ = aj.z((af) this.L$0, null, null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(null), 3);
            try {
                this.L$0 = brVarZ;
                this.label = 1;
                Object objD = this.$this_busyReceive.d(this);
                if (objD == aVar) {
                    return aVar;
                }
                obj = objD;
                brVar = brVarZ;
                brVar.s(null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                brVar = brVarZ;
                brVar.s(null);
                throw th;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1, reason: invalid class name */
    final class AnonymousClass1 extends f implements p<j, e<? super ab>, Object> {
        final /* synthetic */ h.g.a.a $builderAction;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(h.g.a.a aVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$builderAction = aVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$builderAction, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(j jVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:15:0x0039). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:15:0x0039). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.L$1
                java.lang.Object r3 = r4.L$0
                h.m.j r3 = (h.m.j) r3
                e.b.c.b(r5)
                goto L39
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1b:
                e.b.c.b(r5)
                java.lang.Object r5 = r4.L$0
                h.m.j r5 = (h.m.j) r5
                r3 = r5
            L23:
                h.g.a.a r5 = r4.$builderAction
                java.lang.Object r1 = r5.invoke()
                if (r1 == 0) goto L38
                r4.L$0 = r3
                r4.L$1 = r1
                r4.label = r2
                java.lang.Object r5 = r3.a(r1, r4)
                if (r5 != r0) goto L39
                return r0
            L38:
                r1 = 0
            L39:
                if (r1 == 0) goto L3c
                goto L23
            L3c:
                h.ab r4 = h.ab.f48028a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> Object busyReceive(o<T> oVar, e<? super T> eVar) {
        return aj.d(new AnonymousClass2(oVar, null), eVar);
    }

    public static final <E> h<E> untilNull(h.g.a.a<? extends E> aVar) {
        return k.b(new AnonymousClass1(aVar, null));
    }
}
