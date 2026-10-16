package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkRequest;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.r;
import h.g.b.x;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ad;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
        TimeUnit timeUnit = TimeUnit.HOURS;
        MAX_DELAY_MS = 3600000L;
    }

    public static final void maybeLaunchUnfinishedWorkListener(af afVar, Context context, Configuration configuration, WorkDatabase workDatabase) {
        x.f(afVar, "<this>");
        x.f(context, "appContext");
        x.f(configuration, "configuration");
        x.f(workDatabase, "db");
        if (ProcessUtils.isDefaultProcess(context, configuration)) {
            ai.m(ai.K(ai.y(ai.u(new ad(workDatabase.workSpecDao().hasUnfinishedWorkFlow(), new AnonymousClass1(null), 3))), new AnonymousClass2(context, null)), afVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Boolean, e<? super ab>, Object> {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$appContext = context;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$appContext, eVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public final Object invoke(boolean z, e<? super ab> eVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return ab.f48028a;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, e<? super ab> eVar) {
            return invoke(bool.booleanValue(), eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements r<l<? super Boolean>, Throwable, Long, e<? super Boolean>, Object> {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(4, eVar);
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ Object invoke(l<? super Boolean> lVar, Throwable th, Long l2, e<? super Boolean> eVar) {
            return invoke(lVar, th, l2.longValue(), eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                Throwable th = (Throwable) this.L$0;
                long j2 = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th);
                this.label = 1;
                if (aj.q(Math.min(j2 * WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, UnfinishedWorkListenerKt.MAX_DELAY_MS), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return true;
        }

        public final Object invoke(l<? super Boolean> lVar, Throwable th, long j2, e<? super Boolean> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar);
            anonymousClass1.L$0 = th;
            anonymousClass1.J$0 = j2;
            return anonymousClass1.invokeSuspend(ab.f48028a);
        }
    }
}
