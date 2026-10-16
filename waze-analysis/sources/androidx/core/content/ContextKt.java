package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.core.content.ContextKt;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ContextKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.content.ContextKt$receiveBroadcasts$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextKt.receiveBroadcasts(null, null, 0, null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.content.ContextKt$receiveBroadcastsAsync$1, reason: invalid class name and case insensitive filesystem */
    final class C04061 extends c {
        int label;
        /* synthetic */ Object result;

        C04061(e<? super C04061> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextKt.receiveBroadcastsAsync(null, null, 0, null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.content.ContextKt$receiveBroadcastsAsync$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<?>, Object> {
        final /* synthetic */ String $broadcastPermission;
        final /* synthetic */ IntentFilter $filter;
        final /* synthetic */ int $flags;
        final /* synthetic */ q<BroadcastReceiver.PendingResult, Intent, e<? super ab>, Object> $onReceive;
        final /* synthetic */ Handler $scheduler;
        final /* synthetic */ Context $this_receiveBroadcastsAsync;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Context context, IntentFilter intentFilter, int i2, String str, Handler handler, q<? super BroadcastReceiver.PendingResult, ? super Intent, ? super e<? super ab>, ? extends Object> qVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_receiveBroadcastsAsync = context;
            this.$filter = intentFilter;
            this.$flags = i2;
            this.$broadcastPermission = str;
            this.$scheduler = handler;
            this.$onReceive = qVar;
        }

        static final ab invokeSuspend$lambda$0(af afVar, q qVar, BroadcastReceiver broadcastReceiver, Intent intent) {
            aj.z(afVar, null, ag.f51344c, new ContextKt$receiveBroadcastsAsync$2$1$1(qVar, broadcastReceiver.goAsync(), intent, null), 1);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_receiveBroadcastsAsync, this.$filter, this.$flags, this.$broadcastPermission, this.$scheduler, this.$onReceive, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<?> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                final af afVar = (af) this.L$0;
                Context context = this.$this_receiveBroadcastsAsync;
                IntentFilter intentFilter = this.$filter;
                int i3 = this.$flags;
                String str = this.$broadcastPermission;
                Handler handler = this.$scheduler;
                final q<BroadcastReceiver.PendingResult, Intent, e<? super ab>, Object> qVar = this.$onReceive;
                this.label = 1;
                if (ContextKt.receiveBroadcasts(context, intentFilter, i3, str, handler, new p() { // from class: androidx.core.content.ContextKt$receiveBroadcastsAsync$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return ContextKt.AnonymousClass2.invokeSuspend$lambda$0(afVar, qVar, (BroadcastReceiver) obj2, (Intent) obj3);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            throw new h.e();
        }
    }

    public static final /* synthetic */ <T> T getSystemService(Context context) {
        x.f(context, "<this>");
        x.i();
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object receiveBroadcasts(android.content.Context r9, android.content.IntentFilter r10, int r11, java.lang.String r12, android.os.Handler r13, h.g.a.p<? super android.content.BroadcastReceiver, ? super android.content.Intent, h.ab> r14, h.c.e<?> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.ContextKt.receiveBroadcasts(android.content.Context, android.content.IntentFilter, int, java.lang.String, android.os.Handler, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object receiveBroadcasts$default(Context context, IntentFilter intentFilter, int i2, String str, Handler handler, p pVar, e eVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            handler = null;
        }
        return receiveBroadcasts(context, intentFilter, i2, str, handler, pVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object receiveBroadcastsAsync(android.content.Context r13, android.content.IntentFilter r14, int r15, java.lang.String r16, android.os.Handler r17, h.g.a.q<? super android.content.BroadcastReceiver.PendingResult, ? super android.content.Intent, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r18, h.c.e<?> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof androidx.core.content.ContextKt.C04061
            if (r1 == 0) goto L15
            r1 = r0
            androidx.core.content.ContextKt$receiveBroadcastsAsync$1 r1 = (androidx.core.content.ContextKt.C04061) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.core.content.ContextKt$receiveBroadcastsAsync$1 r1 = new androidx.core.content.ContextKt$receiveBroadcastsAsync$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 == r4) goto L2d
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2d:
            e.b.c.b(r0)
            goto L4e
        L31:
            e.b.c.b(r0)
            androidx.core.content.ContextKt$receiveBroadcastsAsync$2 r5 = new androidx.core.content.ContextKt$receiveBroadcastsAsync$2
            r12 = 0
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            h.g.a.p r5 = (h.g.a.p) r5
            r1.label = r4
            java.lang.Object r13 = kotlinx.coroutines.aj.d(r5, r1)
            if (r13 != r2) goto L4e
            return r2
        L4e:
            h.e r13 = new h.e
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.ContextKt.receiveBroadcastsAsync(android.content.Context, android.content.IntentFilter, int, java.lang.String, android.os.Handler, h.g.a.q, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object receiveBroadcastsAsync$default(Context context, IntentFilter intentFilter, int i2, String str, Handler handler, q qVar, e eVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            handler = null;
        }
        return receiveBroadcastsAsync(context, intentFilter, i2, str, handler, qVar, eVar);
    }

    public static final void withStyledAttributes(Context context, int i2, int[] iArr, l<? super TypedArray, ab> lVar) throws Resources.NotFoundException {
        x.f(context, "<this>");
        x.f(iArr, "attrs");
        x.f(lVar, "block");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, iArr);
        lVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, l lVar, int i4, Object obj) {
        x.f(context, "<this>");
        x.f(iArr, "attrs");
        x.f(lVar, "block");
        if (1 == (i4 & 1)) {
            attributeSet = null;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        lVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, l<? super TypedArray, ab> lVar) {
        x.f(context, "<this>");
        x.f(iArr, "attrs");
        x.f(lVar, "block");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        lVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
